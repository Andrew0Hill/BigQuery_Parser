import base.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import types.Column;
import types.QueryPart;
import types.Table;

import java.util.ArrayList;
import java.util.Stack;

public class LookupBuilder extends bigqueryBaseListener{
    ParseTreeProperty<SelectTable> scoped_tables = new ParseTreeProperty<>();
    ParseTreeProperty<Boolean> is_cte_expression = new ParseTreeProperty<>();
    SelectTable root_table = new SelectTable(null);
    SelectTable current_table;
    Stack<QueryPart> part_of_query = new Stack<>();
    @Override
    public void enterParse(bigqueryParser.ParseContext ctx){
        System.out.println("Begin parse. Creating global lookup table.");
        current_table = root_table;
        scoped_tables.put(ctx,current_table);
    }
    public void exitParse(bigqueryParser.ParseContext ctx){
        System.out.println("Final Lookup Table:");
        System.out.println(current_table.child.column_lookup);
    }
    @Override public void enterSelect_statement(bigqueryParser.Select_statementContext ctx){
        System.out.println("Entering SELECT statement: Creating Lookup Table");
        SelectTable select = new SelectTable(current_table);
        current_table.child = select;
        current_table = select;
        scoped_tables.put(ctx,current_table);
        part_of_query.push(QueryPart.SELECT);
    }
    @Override public void enterAlias_expr(bigqueryParser.Alias_exprContext ctx){
        if (ctx.expr().column_expr() != null){
            String column_name = ctx.expr().column_expr().column_name().getText();
            String alias_name = ctx.alias_name() == null ? column_name : ctx.alias_name().getText();
            String table_name = ctx.expr().column_expr().table_name() == null ? "" : ctx.expr().column_expr().table_name().getText();
            Stack<QueryPart> query_context = (Stack<QueryPart>) part_of_query.clone();
            current_table.column_list.add(new Column(alias_name,column_name,table_name, query_context));
        }
    }
    @Override public void enterWith_statement(bigqueryParser.With_statementContext ctx){
        System.out.println("Entered WITH statement");
        part_of_query.push(QueryPart.WITH);

    }
    @Override public void exitWith_statement(bigqueryParser.With_statementContext ctx){
        System.out.println("Exiting WITH statement");
        part_of_query.pop();
    }
    @Override public void enterCte_expr(bigqueryParser.Cte_exprContext ctx){
        is_cte_expression.put(ctx,true);
    }
    @Override public void exitCte_expr(bigqueryParser.Cte_exprContext ctx){
        System.out.println("CTE Lookup Table");
        current_table.table_name = ctx.cte_name().getText();
        System.out.println(current_table.lookup_table);
        current_table = current_table.parent;
    }
    @Override public void enterQuery_expr(bigqueryParser.Query_exprContext ctx){
        // If this is a CTE expression
        if(is_cte_expression.get(ctx.parent) != null){
            System.out.println("Creating new CTE table");
            SelectTable cte_table = new SelectTable(current_table);
            current_table.child = cte_table;
            current_table = cte_table;
            scoped_tables.put(ctx,current_table);
        }
    }
    @Override public void exitQuery_expr(bigqueryParser.Query_exprContext ctx){
        // If a CTE expression
        if(is_cte_expression.get(ctx.parent) != null){
            System.out.println("Merge all Select Statement tables.");
            for(bigqueryParser.Select_statementContext ssc : ctx.select_statement()){
                current_table = SelectTable.merge(current_table,scoped_tables.get(ssc));
            }
        }
    }
    @Override public void enterFrom_statement(bigqueryParser.From_statementContext ctx){
        part_of_query.push(QueryPart.FROM);
    }
    @Override public void exitFrom_statement(bigqueryParser.From_statementContext ctx){
        part_of_query.pop();
    }
    @Override public void enterFrom_item(bigqueryParser.From_itemContext ctx){
        // If this From_item is a Table Expression
        if (ctx.table_expr() != null){
            String table_name;
            if (ctx.table_expr().table_expr() != null){
                table_name = ctx.table_expr().table_expr().table_name().getText();
            }else{
                table_name = ctx.table_expr().table_name().getText();
            }
            String table_alias = ctx.alias_name() == null ? table_name : ctx.alias_name().getText();
            Table t = new Table();
            t.table_alias = table_alias;
            t.table_name = table_name;
            current_table.lookup_table.put(table_alias,t);
        }
    }

    @Override public void exitFrom_item(bigqueryParser.From_itemContext ctx){
        // If this From_item is a Subquery expression
        if (ctx.query_statement() != null){
            String alias_name = "";
            if (ctx.alias_name() != null){
                alias_name = ctx.alias_name().getText();
            }
            // Since a Subquery can have one or more SELECT statements inside of it (Due to a JOIN), we must merge
            // the SelectTable objects.
            current_table.lookup_table.put(alias_name,ctx.query_statement().query_expr()
                                 .select_statement()
                                 .stream()
                                 .map(select_ctx -> scoped_tables.get(select_ctx))
                                 .reduce(new SelectTable(null),(t1,t2) -> SelectTable.merge(t1,t2)));
        }
    }
    @Override public void exitSelect_statement(bigqueryParser.Select_statementContext ctx){
        System.out.println("");
        System.out.println("Exiting SELECT statement");
        System.out.println("Current Table ID: " + current_table.tid + " with Parent ID: " + current_table.parent.tid);
        System.out.println("Table Column List: ");
        System.out.println(current_table.column_list);
        System.out.println("Internal Lookup Table: ");
        System.out.println(current_table.lookup_table);
        System.out.println("");


        // Pair up all columns from the Column List without tables names with a table name.

        // If there is only one table in the FROM list, then we can automatically infer the column names.
        if(current_table.lookup_table.size() == 1){
            Object o = current_table.lookup_table.values().toArray()[0];
            if (o instanceof SelectTable){
                SelectTable st = (SelectTable) o;
                for (Column column : current_table.column_list) {
                    ArrayList<Column> columns = st.column_lookup.get(column.real_name);
                    //Column tcol = st.column_lookup.get(column.real_name);
                    Column tcol = null;
                    for (Column c : columns) {
                        if (column.real_name.equals(c.alias)) {
                            tcol = c;
                        }
                    }
                    if (tcol == null) {
                        System.out.println("Error lookup failed. Table " + st.tid + " has no column " + column.real_name);
                    } else {
                        column.table_name = tcol.table_name;
                        column.real_name = tcol.real_name;
                    }
                }
            }else{
                Table t = (Table) o;
                current_table.column_list.forEach(column -> column.table_name = t.table_name);
            }
        }else{
            for (Column col : current_table.column_list){
                Object o = current_table.lookup_table.get(col.table_name);
                if (o == null){
                    System.out.println("Lookup failed. Table: " + current_table.tid + " has no table: " + col.table_name);
                }else if (o instanceof SelectTable){
                    SelectTable st = (SelectTable) o;
                    ArrayList<Column> columns = st.column_lookup.get(col.real_name);
                    Column tcol = null;
                    for(Column c : columns){
                        if (col.real_name.equals(c.alias)){
                            tcol = c;
                        }
                    }
                    if (tcol == null) {
                        System.out.println("Error lookup failed. Table " + st.tid + " has no column " + col.real_name );
                    }else {
                        col.table_name = tcol.table_name;
                        col.real_name = tcol.real_name;
                    }
                }else{
                    col.table_name = ((Table) o).table_name;
                }
            }
        }

        for (Column col : current_table.column_list){
            if(current_table.column_lookup.get(col.alias) != null){
                current_table.column_lookup.get(col.alias).add(col);
            }else{
                ArrayList<Column> list = new ArrayList<>();
                list.add(col);
                current_table.column_lookup.put(col.alias,list);
            }

        }
        System.out.println(current_table.column_lookup);;
        current_table = current_table.parent;
        part_of_query.pop();
    }
}
