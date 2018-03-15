
// Generated from C:/Users/96ahi/Documents/BigQuery_Parser/src\bigquery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "bigqueryVisitor.h"


/**
 * This class provides an empty implementation of bigqueryVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  bigqueryBaseVisitor : public bigqueryVisitor {
public:

  virtual antlrcpp::Any visitQuery_statement(bigqueryParser::Query_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitQuery_expr(bigqueryParser::Query_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSelect_statement(bigqueryParser::Select_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpression_list(bigqueryParser::Expression_listContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStar_expr(bigqueryParser::Star_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAlias_expr(bigqueryParser::Alias_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFrom_statement(bigqueryParser::From_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFrom_item(bigqueryParser::From_itemContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWhere_statement(bigqueryParser::Where_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitGroup_statement(bigqueryParser::Group_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitHaving_statement(bigqueryParser::Having_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOrder_clause(bigqueryParser::Order_clauseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLimit_clause(bigqueryParser::Limit_clauseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUnary_operator(bigqueryParser::Unary_operatorContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpr(bigqueryParser::ExprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCast_expr(bigqueryParser::Cast_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitColumn_expr(bigqueryParser::Column_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExcept_statement(bigqueryParser::Except_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReplace_statement(bigqueryParser::Replace_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitJoin_type(bigqueryParser::Join_typeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitOn_clause(bigqueryParser::On_clauseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSet_op(bigqueryParser::Set_opContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUsing_clause(bigqueryParser::Using_clauseContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitField_path(bigqueryParser::Field_pathContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSstruct(bigqueryParser::SstructContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArray_expr(bigqueryParser::Array_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBool_expression(bigqueryParser::Bool_expressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCount(bigqueryParser::CountContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSkip_rows(bigqueryParser::Skip_rowsContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWith_statement(bigqueryParser::With_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCte_expr(bigqueryParser::Cte_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitName(bigqueryParser::NameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAlias_name(bigqueryParser::Alias_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArray_name(bigqueryParser::Array_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitColumn_name(bigqueryParser::Column_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitCte_name(bigqueryParser::Cte_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDataset_name(bigqueryParser::Dataset_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDatatype_name(bigqueryParser::Datatype_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunction_name(bigqueryParser::Function_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitJoin_name(bigqueryParser::Join_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitMember_name(bigqueryParser::Member_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitProject_name(bigqueryParser::Project_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStruct_name(bigqueryParser::Struct_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTable_name(bigqueryParser::Table_nameContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTable_expr(bigqueryParser::Table_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNumber(bigqueryParser::NumberContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitInteger_type(bigqueryParser::Integer_typeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFloat_type(bigqueryParser::Float_typeContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitString(bigqueryParser::StringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitQuoted_string(bigqueryParser::Quoted_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitTriple_quoted_string(bigqueryParser::Triple_quoted_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRaw_string(bigqueryParser::Raw_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitByte_string(bigqueryParser::Byte_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitRaw_byte_string(bigqueryParser::Raw_byte_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitSpecial_string(bigqueryParser::Special_stringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitKeyword(bigqueryParser::KeywordContext *ctx) override {
    return visitChildren(ctx);
  }


};

