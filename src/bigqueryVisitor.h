
// Generated from C:/Users/96ahi/Documents/BigQuery_Parser/src\bigquery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "bigqueryParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by bigqueryParser.
 */
class  bigqueryVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by bigqueryParser.
   */
    virtual antlrcpp::Any visitQuery_statement(bigqueryParser::Query_statementContext *context) = 0;

    virtual antlrcpp::Any visitQuery_expr(bigqueryParser::Query_exprContext *context) = 0;

    virtual antlrcpp::Any visitSelect_statement(bigqueryParser::Select_statementContext *context) = 0;

    virtual antlrcpp::Any visitExpression_list(bigqueryParser::Expression_listContext *context) = 0;

    virtual antlrcpp::Any visitStar_expr(bigqueryParser::Star_exprContext *context) = 0;

    virtual antlrcpp::Any visitAlias_expr(bigqueryParser::Alias_exprContext *context) = 0;

    virtual antlrcpp::Any visitFrom_statement(bigqueryParser::From_statementContext *context) = 0;

    virtual antlrcpp::Any visitFrom_item(bigqueryParser::From_itemContext *context) = 0;

    virtual antlrcpp::Any visitWhere_statement(bigqueryParser::Where_statementContext *context) = 0;

    virtual antlrcpp::Any visitGroup_statement(bigqueryParser::Group_statementContext *context) = 0;

    virtual antlrcpp::Any visitHaving_statement(bigqueryParser::Having_statementContext *context) = 0;

    virtual antlrcpp::Any visitOrder_clause(bigqueryParser::Order_clauseContext *context) = 0;

    virtual antlrcpp::Any visitLimit_clause(bigqueryParser::Limit_clauseContext *context) = 0;

    virtual antlrcpp::Any visitUnary_operator(bigqueryParser::Unary_operatorContext *context) = 0;

    virtual antlrcpp::Any visitExpr(bigqueryParser::ExprContext *context) = 0;

    virtual antlrcpp::Any visitCast_expr(bigqueryParser::Cast_exprContext *context) = 0;

    virtual antlrcpp::Any visitColumn_expr(bigqueryParser::Column_exprContext *context) = 0;

    virtual antlrcpp::Any visitExcept_statement(bigqueryParser::Except_statementContext *context) = 0;

    virtual antlrcpp::Any visitReplace_statement(bigqueryParser::Replace_statementContext *context) = 0;

    virtual antlrcpp::Any visitJoin_type(bigqueryParser::Join_typeContext *context) = 0;

    virtual antlrcpp::Any visitOn_clause(bigqueryParser::On_clauseContext *context) = 0;

    virtual antlrcpp::Any visitSet_op(bigqueryParser::Set_opContext *context) = 0;

    virtual antlrcpp::Any visitUsing_clause(bigqueryParser::Using_clauseContext *context) = 0;

    virtual antlrcpp::Any visitField_path(bigqueryParser::Field_pathContext *context) = 0;

    virtual antlrcpp::Any visitSstruct(bigqueryParser::SstructContext *context) = 0;

    virtual antlrcpp::Any visitArray_expr(bigqueryParser::Array_exprContext *context) = 0;

    virtual antlrcpp::Any visitBool_expression(bigqueryParser::Bool_expressionContext *context) = 0;

    virtual antlrcpp::Any visitCount(bigqueryParser::CountContext *context) = 0;

    virtual antlrcpp::Any visitSkip_rows(bigqueryParser::Skip_rowsContext *context) = 0;

    virtual antlrcpp::Any visitWith_statement(bigqueryParser::With_statementContext *context) = 0;

    virtual antlrcpp::Any visitCte_expr(bigqueryParser::Cte_exprContext *context) = 0;

    virtual antlrcpp::Any visitName(bigqueryParser::NameContext *context) = 0;

    virtual antlrcpp::Any visitAlias_name(bigqueryParser::Alias_nameContext *context) = 0;

    virtual antlrcpp::Any visitArray_name(bigqueryParser::Array_nameContext *context) = 0;

    virtual antlrcpp::Any visitColumn_name(bigqueryParser::Column_nameContext *context) = 0;

    virtual antlrcpp::Any visitCte_name(bigqueryParser::Cte_nameContext *context) = 0;

    virtual antlrcpp::Any visitDataset_name(bigqueryParser::Dataset_nameContext *context) = 0;

    virtual antlrcpp::Any visitDatatype_name(bigqueryParser::Datatype_nameContext *context) = 0;

    virtual antlrcpp::Any visitFunction_name(bigqueryParser::Function_nameContext *context) = 0;

    virtual antlrcpp::Any visitJoin_name(bigqueryParser::Join_nameContext *context) = 0;

    virtual antlrcpp::Any visitMember_name(bigqueryParser::Member_nameContext *context) = 0;

    virtual antlrcpp::Any visitProject_name(bigqueryParser::Project_nameContext *context) = 0;

    virtual antlrcpp::Any visitStruct_name(bigqueryParser::Struct_nameContext *context) = 0;

    virtual antlrcpp::Any visitTable_name(bigqueryParser::Table_nameContext *context) = 0;

    virtual antlrcpp::Any visitTable_expr(bigqueryParser::Table_exprContext *context) = 0;

    virtual antlrcpp::Any visitNumber(bigqueryParser::NumberContext *context) = 0;

    virtual antlrcpp::Any visitInteger_type(bigqueryParser::Integer_typeContext *context) = 0;

    virtual antlrcpp::Any visitFloat_type(bigqueryParser::Float_typeContext *context) = 0;

    virtual antlrcpp::Any visitString(bigqueryParser::StringContext *context) = 0;

    virtual antlrcpp::Any visitQuoted_string(bigqueryParser::Quoted_stringContext *context) = 0;

    virtual antlrcpp::Any visitTriple_quoted_string(bigqueryParser::Triple_quoted_stringContext *context) = 0;

    virtual antlrcpp::Any visitRaw_string(bigqueryParser::Raw_stringContext *context) = 0;

    virtual antlrcpp::Any visitByte_string(bigqueryParser::Byte_stringContext *context) = 0;

    virtual antlrcpp::Any visitRaw_byte_string(bigqueryParser::Raw_byte_stringContext *context) = 0;

    virtual antlrcpp::Any visitSpecial_string(bigqueryParser::Special_stringContext *context) = 0;

    virtual antlrcpp::Any visitKeyword(bigqueryParser::KeywordContext *context) = 0;


};

