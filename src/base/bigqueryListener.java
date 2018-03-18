// Generated from C:/Users/96ahi/Documents/BigQuery_Parser/src\bigquery.g4 by ANTLR 4.7
package base;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bigqueryParser}.
 */
public interface bigqueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(bigqueryParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(bigqueryParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#query_statement}.
	 * @param ctx the parse tree
	 */
	void enterQuery_statement(bigqueryParser.Query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#query_statement}.
	 * @param ctx the parse tree
	 */
	void exitQuery_statement(bigqueryParser.Query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#query_expr}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expr(bigqueryParser.Query_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#query_expr}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expr(bigqueryParser.Query_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(bigqueryParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(bigqueryParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(bigqueryParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(bigqueryParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(bigqueryParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(bigqueryParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#alias_expr}.
	 * @param ctx the parse tree
	 */
	void enterAlias_expr(bigqueryParser.Alias_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#alias_expr}.
	 * @param ctx the parse tree
	 */
	void exitAlias_expr(bigqueryParser.Alias_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#from_statement}.
	 * @param ctx the parse tree
	 */
	void enterFrom_statement(bigqueryParser.From_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#from_statement}.
	 * @param ctx the parse tree
	 */
	void exitFrom_statement(bigqueryParser.From_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(bigqueryParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(bigqueryParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhere_statement(bigqueryParser.Where_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhere_statement(bigqueryParser.Where_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#group_statement}.
	 * @param ctx the parse tree
	 */
	void enterGroup_statement(bigqueryParser.Group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#group_statement}.
	 * @param ctx the parse tree
	 */
	void exitGroup_statement(bigqueryParser.Group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#having_statement}.
	 * @param ctx the parse tree
	 */
	void enterHaving_statement(bigqueryParser.Having_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#having_statement}.
	 * @param ctx the parse tree
	 */
	void exitHaving_statement(bigqueryParser.Having_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#order_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_clause(bigqueryParser.Order_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#order_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_clause(bigqueryParser.Order_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(bigqueryParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(bigqueryParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(bigqueryParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(bigqueryParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(bigqueryParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(bigqueryParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr(bigqueryParser.Cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr(bigqueryParser.Cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#column_expr}.
	 * @param ctx the parse tree
	 */
	void enterColumn_expr(bigqueryParser.Column_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#column_expr}.
	 * @param ctx the parse tree
	 */
	void exitColumn_expr(bigqueryParser.Column_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#except_statement}.
	 * @param ctx the parse tree
	 */
	void enterExcept_statement(bigqueryParser.Except_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#except_statement}.
	 * @param ctx the parse tree
	 */
	void exitExcept_statement(bigqueryParser.Except_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#replace_statement}.
	 * @param ctx the parse tree
	 */
	void enterReplace_statement(bigqueryParser.Replace_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#replace_statement}.
	 * @param ctx the parse tree
	 */
	void exitReplace_statement(bigqueryParser.Replace_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(bigqueryParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(bigqueryParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#on_clause}.
	 * @param ctx the parse tree
	 */
	void enterOn_clause(bigqueryParser.On_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#on_clause}.
	 * @param ctx the parse tree
	 */
	void exitOn_clause(bigqueryParser.On_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#set_op}.
	 * @param ctx the parse tree
	 */
	void enterSet_op(bigqueryParser.Set_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#set_op}.
	 * @param ctx the parse tree
	 */
	void exitSet_op(bigqueryParser.Set_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(bigqueryParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(bigqueryParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#sstruct}.
	 * @param ctx the parse tree
	 */
	void enterSstruct(bigqueryParser.SstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#sstruct}.
	 * @param ctx the parse tree
	 */
	void exitSstruct(bigqueryParser.SstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_expr(bigqueryParser.Array_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#array_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_expr(bigqueryParser.Array_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(bigqueryParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(bigqueryParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(bigqueryParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(bigqueryParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#skip_rows}.
	 * @param ctx the parse tree
	 */
	void enterSkip_rows(bigqueryParser.Skip_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#skip_rows}.
	 * @param ctx the parse tree
	 */
	void exitSkip_rows(bigqueryParser.Skip_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_statement(bigqueryParser.With_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_statement(bigqueryParser.With_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#cte_expr}.
	 * @param ctx the parse tree
	 */
	void enterCte_expr(bigqueryParser.Cte_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#cte_expr}.
	 * @param ctx the parse tree
	 */
	void exitCte_expr(bigqueryParser.Cte_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(bigqueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(bigqueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(bigqueryParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(bigqueryParser.Alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(bigqueryParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(bigqueryParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(bigqueryParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(bigqueryParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#cte_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_name(bigqueryParser.Cte_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#cte_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_name(bigqueryParser.Cte_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void enterDataset_name(bigqueryParser.Dataset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void exitDataset_name(bigqueryParser.Dataset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_name(bigqueryParser.Datatype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#datatype_name}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_name(bigqueryParser.Datatype_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(bigqueryParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(bigqueryParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#join_name}.
	 * @param ctx the parse tree
	 */
	void enterJoin_name(bigqueryParser.Join_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#join_name}.
	 * @param ctx the parse tree
	 */
	void exitJoin_name(bigqueryParser.Join_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(bigqueryParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(bigqueryParser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#project_name}.
	 * @param ctx the parse tree
	 */
	void enterProject_name(bigqueryParser.Project_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#project_name}.
	 * @param ctx the parse tree
	 */
	void exitProject_name(bigqueryParser.Project_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void enterStruct_name(bigqueryParser.Struct_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#struct_name}.
	 * @param ctx the parse tree
	 */
	void exitStruct_name(bigqueryParser.Struct_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(bigqueryParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(bigqueryParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#table_expr}.
	 * @param ctx the parse tree
	 */
	void enterTable_expr(bigqueryParser.Table_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#table_expr}.
	 * @param ctx the parse tree
	 */
	void exitTable_expr(bigqueryParser.Table_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(bigqueryParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(bigqueryParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(bigqueryParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(bigqueryParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#float_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_type(bigqueryParser.Float_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#float_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_type(bigqueryParser.Float_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(bigqueryParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(bigqueryParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(bigqueryParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(bigqueryParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#triple_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterTriple_quoted_string(bigqueryParser.Triple_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#triple_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitTriple_quoted_string(bigqueryParser.Triple_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#raw_string}.
	 * @param ctx the parse tree
	 */
	void enterRaw_string(bigqueryParser.Raw_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#raw_string}.
	 * @param ctx the parse tree
	 */
	void exitRaw_string(bigqueryParser.Raw_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#byte_string}.
	 * @param ctx the parse tree
	 */
	void enterByte_string(bigqueryParser.Byte_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#byte_string}.
	 * @param ctx the parse tree
	 */
	void exitByte_string(bigqueryParser.Byte_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#raw_byte_string}.
	 * @param ctx the parse tree
	 */
	void enterRaw_byte_string(bigqueryParser.Raw_byte_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#raw_byte_string}.
	 * @param ctx the parse tree
	 */
	void exitRaw_byte_string(bigqueryParser.Raw_byte_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#special_string}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_string(bigqueryParser.Special_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#special_string}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_string(bigqueryParser.Special_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link bigqueryParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(bigqueryParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link bigqueryParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(bigqueryParser.KeywordContext ctx);
}