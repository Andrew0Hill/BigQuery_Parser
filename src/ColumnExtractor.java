import org.antlr.v4.runtime.misc.Pair;

import java.util.Stack;

public class ColumnExtractor extends bigqueryBaseListener {
    private ParsedQuery parsedQuery;
    private Stack<Integer> scope;
    ColumnExtractor(){
        parsedQuery = new ParsedQuery();
        scope = new Stack<>();
    }
    @Override
    public void enterQuery_statement(bigqueryParser.Query_statementContext ctx){
        scope.push(bigqueryParser.RULE_query_statement);
    }
    @Override
    public void enterQuery_expr(bigqueryParser.Query_exprContext ctx){
        scope.push(bigqueryParser.RULE_query_expr);
    }

    @Override
    public void enterSelect_statement(bigqueryParser.Select_statementContext ctx) {
        scope.push(bigqueryParser.RULE_select_statement);
    }
    @Override
    public void enterExpression_list(bigqueryParser.Expression_listContext ctx) {
        scope.push(bigqueryParser.RULE_expression_list);
    }
    @Override
    public void enterAlias_expr(bigqueryParser.Alias_exprContext ctx){
        // If this is a column expression
        if (ctx.expr().column_expr() != null){
            bigqueryParser.Column_exprContext context;
            if (ctx.expr().column_expr().column_expr() != null){
                context = ctx.expr().column_expr().column_expr();
            }else{
                context = ctx.expr().column_expr();
            }
            String table_name = context.table_name() == null ? "" : context.table_name().getText();
            String column_name = context.column_name().getText();
            String alias_name = ctx.alias_name() == null ? context.column_name().getText() : ctx.alias_name().getText();
            Column col = new Column(table_name, column_name, alias_name);
            parsedQuery.select.add(col);
        }else{
            String column_name = ctx.expr().getText();
            String alias_name = ctx.alias_name().getText();
            Column col = new Column("N/A", column_name, alias_name);
            parsedQuery.select.add(col);
        }
        scope.push(bigqueryParser.RULE_alias_expr);
    }
    @Override
    public void exitAlias_expr(bigqueryParser.Alias_exprContext ctx){
        scope.pop();
    }
    @Override
    public void enterFrom_statement(bigqueryParser.From_statementContext ctx){
        scope.push(bigqueryParser.RULE_from_statement);
    }

    @Override
    public void enterFrom_item(bigqueryParser.From_itemContext ctx){
        if(ctx.from_item() == null && ctx.table_expr() != null){

        }
    }
    @Override
    public void exitExpression_list(bigqueryParser.Expression_listContext ctx){
        scope.pop();
    }
    @Override
    public void exitSelect_statement(bigqueryParser.Select_statementContext ctx){
        scope.pop();
    }
    @Override
    public void exitQuery_expr(bigqueryParser.Query_exprContext ctx){
        scope.pop();
    }

    public ParsedQuery getParsedQuery() {
        return parsedQuery;
    }
}
