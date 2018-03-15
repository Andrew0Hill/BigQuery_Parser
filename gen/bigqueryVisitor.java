// Generated from C:/Users/96ahi/Documents/BigQuery_Parser/src\bigquery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bigqueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bigqueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_statement(bigqueryParser.Query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#query_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expr(bigqueryParser.Query_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(bigqueryParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(bigqueryParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(bigqueryParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#alias_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_expr(bigqueryParser.Alias_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#from_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_statement(bigqueryParser.From_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(bigqueryParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#where_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_statement(bigqueryParser.Where_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_statement(bigqueryParser.Group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#having_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_statement(bigqueryParser.Having_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#window_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_statement(bigqueryParser.Window_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#order_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_clause(bigqueryParser.Order_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(bigqueryParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(bigqueryParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(bigqueryParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expr(bigqueryParser.Cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#column_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_expr(bigqueryParser.Column_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#except_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_statement(bigqueryParser.Except_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#replace_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_statement(bigqueryParser.Replace_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(bigqueryParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#on_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_clause(bigqueryParser.On_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#set_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_op(bigqueryParser.Set_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(bigqueryParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#field_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_path(bigqueryParser.Field_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#sstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSstruct(bigqueryParser.SstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(bigqueryParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#array_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_path(bigqueryParser.Array_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(bigqueryParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(bigqueryParser.Window_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(bigqueryParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(bigqueryParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#skip_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip_rows(bigqueryParser.Skip_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#with_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_statement(bigqueryParser.With_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(bigqueryParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(bigqueryParser.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(bigqueryParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(bigqueryParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#cte_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_name(bigqueryParser.Cte_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#dataset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name(bigqueryParser.Dataset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#datatype_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_name(bigqueryParser.Datatype_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(bigqueryParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#join_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_name(bigqueryParser.Join_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#member_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(bigqueryParser.Member_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#project_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject_name(bigqueryParser.Project_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(bigqueryParser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(bigqueryParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#table_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_expr(bigqueryParser.Table_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(bigqueryParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(bigqueryParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#float_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_type(bigqueryParser.Float_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(bigqueryParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(bigqueryParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#triple_quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriple_quoted_string(bigqueryParser.Triple_quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#raw_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_string(bigqueryParser.Raw_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#byte_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_string(bigqueryParser.Byte_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#raw_byte_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_byte_string(bigqueryParser.Raw_byte_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#special_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_string(bigqueryParser.Special_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link bigqueryParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(bigqueryParser.KeywordContext ctx);
}