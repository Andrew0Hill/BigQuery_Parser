// Generated from C:/Users/96ahi/Documents/BigQuery_Parser/src\bigquery.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bigqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		INT=25, FLOAT=26, DIGITS=27, QUOTE=28, DQOUTE=29, ALL=30, AND=31, ANY=32, 
		ARRAY=33, AS=34, ASC=35, ASSERT_ROWS_MODIFIED=36, AT=37, BETWEEN=38, BY=39, 
		CASE=40, CAST=41, COLLATE=42, CONTAINS=43, CREATE=44, CROSS=45, CUBE=46, 
		CURRENT=47, DEFAULT=48, DEFINE=49, DESC=50, DISTINCT=51, ELSE=52, END=53, 
		ENUM=54, ESCAPE=55, EXCEPT=56, EXCLUDE=57, EXISTS=58, EXTRACT=59, FALSE=60, 
		FETCH=61, FOLLOWING=62, FOR=63, FROM=64, FULL=65, GROUP=66, GROUPING=67, 
		GROUPS=68, HASH=69, HAVING=70, IF=71, IGNORE=72, IN=73, INNER=74, INTERSECT=75, 
		INTERVAL=76, INTO=77, IS=78, JOIN=79, LATERAL=80, LEFT=81, LIKE=82, LIMIT=83, 
		LOOKUP=84, MERGE=85, NATURAL=86, NEW=87, NO=88, NOT=89, S_NULL=90, NULLS=91, 
		OF=92, OFFSET=93, ON=94, OR=95, ORDER=96, ORDINAL=97, OUTER=98, OVER=99, 
		PARTITION=100, PRECEDING=101, PROTO=102, RANGE=103, RECURSIVE=104, REPLACE=105, 
		RESPECT=106, RIGHT=107, ROLLUP=108, ROWS=109, SAFE_OFFSET=110, SAFE_ORDINAL=111, 
		SELECT=112, SET=113, SOME=114, SSTRUCT=115, SYSTEM=116, TABLESAMPLE=117, 
		THEN=118, TIME=119, TO=120, TREAT=121, TRUE=122, UNBOUNDED=123, UNION=124, 
		UNNEST=125, USING=126, WHEN=127, WHERE=128, WINDOW=129, WITH=130, WITHIN=131, 
		WS=132, CMT=133, M_CMT=134, QUOTED_STRING=135, TRIPLE_QUOTED_STRING=136, 
		RAW_STRING=137, BYTE_STRING=138, RAW_BYTE_STRING=139, ID=140, RB=141;
	public static final int
		RULE_query_statement = 0, RULE_query_expr = 1, RULE_select_statement = 2, 
		RULE_expression_list = 3, RULE_star_expr = 4, RULE_alias_expr = 5, RULE_from_statement = 6, 
		RULE_from_item = 7, RULE_where_statement = 8, RULE_group_statement = 9, 
		RULE_having_statement = 10, RULE_window_statement = 11, RULE_order_clause = 12, 
		RULE_limit_clause = 13, RULE_unary_operator = 14, RULE_expr = 15, RULE_cast_expr = 16, 
		RULE_column_expr = 17, RULE_except_statement = 18, RULE_replace_statement = 19, 
		RULE_join_type = 20, RULE_on_clause = 21, RULE_set_op = 22, RULE_using_clause = 23, 
		RULE_field_path = 24, RULE_sstruct = 25, RULE_array_expr = 26, RULE_array_path = 27, 
		RULE_bool_expression = 28, RULE_window_name = 29, RULE_window_definition = 30, 
		RULE_count = 31, RULE_skip_rows = 32, RULE_with_statement = 33, RULE_name = 34, 
		RULE_alias_name = 35, RULE_array_name = 36, RULE_column_name = 37, RULE_cte_name = 38, 
		RULE_dataset_name = 39, RULE_datatype_name = 40, RULE_function_name = 41, 
		RULE_join_name = 42, RULE_member_name = 43, RULE_project_name = 44, RULE_struct_name = 45, 
		RULE_table_name = 46, RULE_table_expr = 47, RULE_number = 48, RULE_integer_type = 49, 
		RULE_float_type = 50, RULE_string = 51, RULE_quoted_string = 52, RULE_triple_quoted_string = 53, 
		RULE_raw_string = 54, RULE_byte_string = 55, RULE_raw_byte_string = 56, 
		RULE_special_string = 57, RULE_keyword = 58;
	public static final String[] ruleNames = {
		"query_statement", "query_expr", "select_statement", "expression_list", 
		"star_expr", "alias_expr", "from_statement", "from_item", "where_statement", 
		"group_statement", "having_statement", "window_statement", "order_clause", 
		"limit_clause", "unary_operator", "expr", "cast_expr", "column_expr", 
		"except_statement", "replace_statement", "join_type", "on_clause", "set_op", 
		"using_clause", "field_path", "sstruct", "array_expr", "array_path", "bool_expression", 
		"window_name", "window_definition", "count", "skip_rows", "with_statement", 
		"name", "alias_name", "array_name", "column_name", "cte_name", "dataset_name", 
		"datatype_name", "function_name", "join_name", "member_name", "project_name", 
		"struct_name", "table_name", "table_expr", "number", "integer_type", "float_type", 
		"string", "quoted_string", "triple_quoted_string", "raw_string", "byte_string", 
		"raw_byte_string", "special_string", "keyword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'*'", "'-'", "'~'", "'['", "']'", "'/'", 
		"'+'", "'<<'", "'>>'", "'&'", "'^'", "'|'", "'='", "'<'", "'>'", "'<='", 
		"'>='", "'!='", "'<>'", "'`'", null, null, null, "'''", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "FLOAT", "DIGITS", "QUOTE", "DQOUTE", "ALL", "AND", "ANY", 
		"ARRAY", "AS", "ASC", "ASSERT_ROWS_MODIFIED", "AT", "BETWEEN", "BY", "CASE", 
		"CAST", "COLLATE", "CONTAINS", "CREATE", "CROSS", "CUBE", "CURRENT", "DEFAULT", 
		"DEFINE", "DESC", "DISTINCT", "ELSE", "END", "ENUM", "ESCAPE", "EXCEPT", 
		"EXCLUDE", "EXISTS", "EXTRACT", "FALSE", "FETCH", "FOLLOWING", "FOR", 
		"FROM", "FULL", "GROUP", "GROUPING", "GROUPS", "HASH", "HAVING", "IF", 
		"IGNORE", "IN", "INNER", "INTERSECT", "INTERVAL", "INTO", "IS", "JOIN", 
		"LATERAL", "LEFT", "LIKE", "LIMIT", "LOOKUP", "MERGE", "NATURAL", "NEW", 
		"NO", "NOT", "S_NULL", "NULLS", "OF", "OFFSET", "ON", "OR", "ORDER", "ORDINAL", 
		"OUTER", "OVER", "PARTITION", "PRECEDING", "PROTO", "RANGE", "RECURSIVE", 
		"REPLACE", "RESPECT", "RIGHT", "ROLLUP", "ROWS", "SAFE_OFFSET", "SAFE_ORDINAL", 
		"SELECT", "SET", "SOME", "SSTRUCT", "SYSTEM", "TABLESAMPLE", "THEN", "TIME", 
		"TO", "TREAT", "TRUE", "UNBOUNDED", "UNION", "UNNEST", "USING", "WHEN", 
		"WHERE", "WINDOW", "WITH", "WITHIN", "WS", "CMT", "M_CMT", "QUOTED_STRING", 
		"TRIPLE_QUOTED_STRING", "RAW_STRING", "BYTE_STRING", "RAW_BYTE_STRING", 
		"ID", "RB"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "bigquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bigqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Query_statementContext extends ParserRuleContext {
		public Query_exprContext query_expr() {
			return getRuleContext(Query_exprContext.class,0);
		}
		public With_statementContext with_statement() {
			return getRuleContext(With_statementContext.class,0);
		}
		public Query_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterQuery_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitQuery_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitQuery_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_statementContext query_statement() throws RecognitionException {
		Query_statementContext _localctx = new Query_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(118);
				with_statement();
				}
			}

			setState(121);
			query_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_exprContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Order_clauseContext order_clause() {
			return getRuleContext(Order_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public List<Query_exprContext> query_expr() {
			return getRuleContexts(Query_exprContext.class);
		}
		public Query_exprContext query_expr(int i) {
			return getRuleContext(Query_exprContext.class,i);
		}
		public Set_opContext set_op() {
			return getRuleContext(Set_opContext.class,0);
		}
		public Query_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterQuery_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitQuery_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitQuery_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_exprContext query_expr() throws RecognitionException {
		return query_expr(0);
	}

	private Query_exprContext query_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Query_exprContext _localctx = new Query_exprContext(_ctx, _parentState);
		Query_exprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_query_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(124);
				select_statement();
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(125);
					order_clause();
					}
					break;
				}
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(128);
					limit_clause();
					}
					break;
				}
				}
				break;
			case T__0:
				{
				setState(131);
				match(T__0);
				setState(132);
				query_expr(0);
				setState(133);
				match(T__1);
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(134);
					order_clause();
					}
					break;
				}
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(137);
					limit_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Query_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_query_expr);
					setState(142);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(143);
					set_op();
					setState(144);
					query_expr(0);
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(145);
						order_clause();
						}
						break;
					}
					setState(149);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(148);
						limit_clause();
						}
						break;
					}
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(bigqueryParser.SELECT, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public From_statementContext from_statement() {
			return getRuleContext(From_statementContext.class,0);
		}
		public Where_statementContext where_statement() {
			return getRuleContext(Where_statementContext.class,0);
		}
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Having_statementContext having_statement() {
			return getRuleContext(Having_statementContext.class,0);
		}
		public Window_statementContext window_statement() {
			return getRuleContext(Window_statementContext.class,0);
		}
		public TerminalNode ALL() { return getToken(bigqueryParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(bigqueryParser.DISTINCT, 0); }
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SELECT);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(160);
			expression_list();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(161);
				from_statement();
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(164);
				where_statement();
				}
				break;
			}
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(167);
				group_statement();
				}
				break;
			}
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(170);
				having_statement();
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(173);
				window_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<Alias_exprContext> alias_expr() {
			return getRuleContexts(Alias_exprContext.class);
		}
		public Alias_exprContext alias_expr(int i) {
			return getRuleContext(Alias_exprContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<Except_statementContext> except_statement() {
			return getRuleContexts(Except_statementContext.class);
		}
		public Except_statementContext except_statement(int i) {
			return getRuleContext(Except_statementContext.class,i);
		}
		public List<Replace_statementContext> replace_statement() {
			return getRuleContexts(Replace_statementContext.class);
		}
		public Replace_statementContext replace_statement(int i) {
			return getRuleContext(Replace_statementContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(176);
				star_expr();
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(177);
					except_statement();
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(180);
					replace_statement();
					}
					break;
				}
				}
				}
				break;
			case 2:
				{
				setState(183);
				alias_expr();
				}
				break;
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(T__2);
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						{
						setState(187);
						star_expr();
						setState(189);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(188);
							except_statement();
							}
							break;
						}
						setState(192);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(191);
							replace_statement();
							}
							break;
						}
						}
						}
						break;
					case 2:
						{
						setState(194);
						alias_expr();
						}
						break;
					}
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__23) | (1L << INT) | (1L << FLOAT) | (1L << QUOTE) | (1L << DQOUTE) | (1L << ALL) | (1L << AND) | (1L << ANY) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << ASSERT_ROWS_MODIFIED) | (1L << AT) | (1L << BETWEEN) | (1L << BY) | (1L << CASE) | (1L << CAST) | (1L << COLLATE) | (1L << CONTAINS) | (1L << CREATE) | (1L << CROSS) | (1L << CUBE) | (1L << CURRENT) | (1L << DEFAULT) | (1L << DEFINE) | (1L << DESC) | (1L << DISTINCT) | (1L << ELSE) | (1L << END) | (1L << ENUM) | (1L << ESCAPE) | (1L << EXCEPT) | (1L << EXCLUDE) | (1L << EXISTS) | (1L << EXTRACT) | (1L << FALSE) | (1L << FETCH) | (1L << FOLLOWING) | (1L << FOR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FROM - 64)) | (1L << (FULL - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HASH - 64)) | (1L << (HAVING - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IN - 64)) | (1L << (INNER - 64)) | (1L << (INTERSECT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (JOIN - 64)) | (1L << (LATERAL - 64)) | (1L << (LEFT - 64)) | (1L << (LIKE - 64)) | (1L << (LIMIT - 64)) | (1L << (LOOKUP - 64)) | (1L << (MERGE - 64)) | (1L << (NATURAL - 64)) | (1L << (NEW - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (S_NULL - 64)) | (1L << (NULLS - 64)) | (1L << (OF - 64)) | (1L << (OFFSET - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (ORDER - 64)) | (1L << (ORDINAL - 64)) | (1L << (OUTER - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (PRECEDING - 64)) | (1L << (PROTO - 64)) | (1L << (RANGE - 64)) | (1L << (RECURSIVE - 64)) | (1L << (REPLACE - 64)) | (1L << (RESPECT - 64)) | (1L << (RIGHT - 64)) | (1L << (ROLLUP - 64)) | (1L << (ROWS - 64)) | (1L << (SAFE_OFFSET - 64)) | (1L << (SAFE_ORDINAL - 64)) | (1L << (SELECT - 64)) | (1L << (SET - 64)) | (1L << (SOME - 64)) | (1L << (SSTRUCT - 64)) | (1L << (SYSTEM - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (THEN - 64)) | (1L << (TIME - 64)) | (1L << (TO - 64)) | (1L << (TREAT - 64)) | (1L << (TRUE - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (UNION - 64)) | (1L << (UNNEST - 64)) | (1L << (USING - 64)) | (1L << (WHEN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (WHERE - 128)) | (1L << (WINDOW - 128)) | (1L << (WITH - 128)) | (1L << (WITHIN - 128)) | (1L << (QUOTED_STRING - 128)) | (1L << (TRIPLE_QUOTED_STRING - 128)) | (1L << (RAW_STRING - 128)) | (1L << (BYTE_STRING - 128)) | (1L << (RAW_BYTE_STRING - 128)) | (1L << (ID - 128)))) != 0)) {
				{
				setState(202);
				expr(0);
				setState(203);
				match(T__3);
				}
			}

			setState(207);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Alias_nameContext alias_name() {
			return getRuleContext(Alias_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(bigqueryParser.AS, 0); }
		public Alias_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterAlias_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitAlias_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitAlias_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_exprContext alias_expr() throws RecognitionException {
		Alias_exprContext _localctx = new Alias_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			expr(0);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(210);
					match(AS);
					}
				}

				setState(213);
				alias_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_statementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(bigqueryParser.FROM, 0); }
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public From_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterFrom_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitFrom_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitFrom_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_statementContext from_statement() throws RecognitionException {
		From_statementContext _localctx = new From_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_from_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(FROM);
			setState(217);
			from_item(0);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(T__2);
					setState(219);
					from_item(0);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_itemContext extends ParserRuleContext {
		public Table_exprContext table_expr() {
			return getRuleContext(Table_exprContext.class,0);
		}
		public List<Alias_nameContext> alias_name() {
			return getRuleContexts(Alias_nameContext.class);
		}
		public Alias_nameContext alias_name(int i) {
			return getRuleContext(Alias_nameContext.class,i);
		}
		public TerminalNode FOR() { return getToken(bigqueryParser.FOR, 0); }
		public TerminalNode SYSTEM() { return getToken(bigqueryParser.SYSTEM, 0); }
		public TerminalNode TIME() { return getToken(bigqueryParser.TIME, 0); }
		public List<TerminalNode> AS() { return getTokens(bigqueryParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(bigqueryParser.AS, i);
		}
		public TerminalNode OF() { return getToken(bigqueryParser.OF, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Query_statementContext query_statement() {
			return getRuleContext(Query_statementContext.class,0);
		}
		public Field_pathContext field_path() {
			return getRuleContext(Field_pathContext.class,0);
		}
		public TerminalNode UNNEST() { return getToken(bigqueryParser.UNNEST, 0); }
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(bigqueryParser.WITH, 0); }
		public TerminalNode OFFSET() { return getToken(bigqueryParser.OFFSET, 0); }
		public Array_pathContext array_path() {
			return getRuleContext(Array_pathContext.class,0);
		}
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(bigqueryParser.JOIN, 0); }
		public On_clauseContext on_clause() {
			return getRuleContext(On_clauseContext.class,0);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public From_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterFrom_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitFrom_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitFrom_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_itemContext from_item() throws RecognitionException {
		return from_item(0);
	}

	private From_itemContext from_item(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		From_itemContext _localctx = new From_itemContext(_ctx, _parentState);
		From_itemContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_from_item, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(226);
				table_expr();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(227);
						match(AS);
						}
					}

					setState(230);
					alias_name();
					}
					break;
				}
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(233);
					match(FOR);
					setState(234);
					match(SYSTEM);
					setState(235);
					match(TIME);
					setState(236);
					match(AS);
					setState(237);
					match(OF);
					setState(238);
					string();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(241);
				match(T__0);
				setState(242);
				query_statement();
				setState(243);
				match(T__1);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(244);
						match(AS);
						}
					}

					setState(247);
					alias_name();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(250);
				field_path();
				}
				break;
			case 4:
				{
				setState(251);
				match(UNNEST);
				setState(252);
				match(T__0);
				setState(253);
				array_expr();
				setState(254);
				match(T__1);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(255);
						match(AS);
						}
					}

					setState(258);
					alias_name();
					}
					break;
				}
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(261);
					match(WITH);
					setState(262);
					match(OFFSET);
					{
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(263);
						match(AS);
						}
					}

					setState(266);
					alias_name();
					}
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(269);
				match(UNNEST);
				setState(270);
				match(T__0);
				setState(271);
				array_path();
				setState(272);
				match(T__1);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(273);
						match(AS);
						}
					}

					setState(276);
					alias_name();
					}
					break;
				}
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(279);
					match(WITH);
					setState(280);
					match(OFFSET);
					{
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(281);
						match(AS);
						}
					}

					setState(284);
					alias_name();
					}
					}
					break;
				}
				}
				break;
			case 6:
				{
				setState(287);
				array_path();
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(288);
						match(AS);
						}
					}

					setState(291);
					alias_name();
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(294);
					match(WITH);
					setState(295);
					match(OFFSET);
					{
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(296);
						match(AS);
						}
					}

					setState(299);
					alias_name();
					}
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new From_itemContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_from_item);
					setState(304);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (CROSS - 45)) | (1L << (FULL - 45)) | (1L << (INNER - 45)) | (1L << (LEFT - 45)) | (1L << (RIGHT - 45)))) != 0)) {
						{
						setState(305);
						join_type();
						}
					}

					setState(308);
					match(JOIN);
					setState(309);
					from_item(0);
					setState(312);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ON:
						{
						setState(310);
						on_clause();
						}
						break;
					case USING:
						{
						setState(311);
						using_clause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Where_statementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(bigqueryParser.WHERE, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Where_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterWhere_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitWhere_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitWhere_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_statementContext where_statement() throws RecognitionException {
		Where_statementContext _localctx = new Where_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_where_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(WHERE);
			setState(320);
			bool_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_statementContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(bigqueryParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(bigqueryParser.BY, 0); }
		public TerminalNode ROLLUP() { return getToken(bigqueryParser.ROLLUP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Group_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterGroup_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitGroup_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitGroup_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_statementContext group_statement() throws RecognitionException {
		Group_statementContext _localctx = new Group_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_group_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(GROUP);
			setState(323);
			match(BY);
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(324);
				expr(0);
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(325);
						match(T__2);
						setState(326);
						expr(0);
						}
						} 
					}
					setState(331);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				}
				}
				break;
			case 2:
				{
				setState(332);
				match(ROLLUP);
				setState(333);
				match(T__0);
				setState(334);
				expr(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(335);
					match(T__2);
					setState(336);
					expr(0);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(T__1);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_statementContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(bigqueryParser.HAVING, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Having_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterHaving_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitHaving_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitHaving_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_statementContext having_statement() throws RecognitionException {
		Having_statementContext _localctx = new Having_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_having_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(HAVING);
			setState(347);
			bool_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_statementContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(bigqueryParser.WINDOW, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(bigqueryParser.AS, 0); }
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public Window_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterWindow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitWindow_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitWindow_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_statementContext window_statement() throws RecognitionException {
		Window_statementContext _localctx = new Window_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_window_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(WINDOW);
			setState(350);
			window_name();
			setState(351);
			match(AS);
			setState(352);
			match(T__0);
			setState(353);
			window_definition();
			setState(354);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(bigqueryParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(bigqueryParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASC() { return getTokens(bigqueryParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(bigqueryParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(bigqueryParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(bigqueryParser.DESC, i);
		}
		public Order_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterOrder_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitOrder_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitOrder_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_clauseContext order_clause() throws RecognitionException {
		Order_clauseContext _localctx = new Order_clauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_order_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(ORDER);
			setState(357);
			match(BY);
			setState(358);
			expr(0);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(T__2);
					setState(363);
					expr(0);
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						setState(364);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(bigqueryParser.LIMIT, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(bigqueryParser.OFFSET, 0); }
		public Skip_rowsContext skip_rows() {
			return getRuleContext(Skip_rowsContext.class,0);
		}
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitLimit_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitLimit_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limit_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(LIMIT);
			setState(373);
			count();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(374);
				match(OFFSET);
				setState(375);
				skip_rows();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(bigqueryParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(bigqueryParser.OFFSET, 0); }
		public TerminalNode ORDINAL() { return getToken(bigqueryParser.ORDINAL, 0); }
		public TerminalNode SAFE_OFFSET() { return getToken(bigqueryParser.SAFE_OFFSET, 0); }
		public TerminalNode SAFE_ORDINAL() { return getToken(bigqueryParser.SAFE_ORDINAL, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public TerminalNode IS() { return getToken(bigqueryParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(bigqueryParser.TRUE, 0); }
		public TerminalNode NOT() { return getToken(bigqueryParser.NOT, 0); }
		public TerminalNode FALSE() { return getToken(bigqueryParser.FALSE, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Cast_exprContext cast_expr() {
			return getRuleContext(Cast_exprContext.class,0);
		}
		public Column_exprContext column_expr() {
			return getRuleContext(Column_exprContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(bigqueryParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(bigqueryParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(bigqueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(bigqueryParser.OR, 0); }
		public TerminalNode S_NULL() { return getToken(bigqueryParser.S_NULL, 0); }
		public TerminalNode IN() { return getToken(bigqueryParser.IN, 0); }
		public Query_statementContext query_statement() {
			return getRuleContext(Query_statementContext.class,0);
		}
		public TerminalNode UNNEST() { return getToken(bigqueryParser.UNNEST, 0); }
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(381);
				number();
				}
				break;
			case 2:
				{
				setState(382);
				string();
				}
				break;
			case 3:
				{
				setState(383);
				array_name();
				setState(384);
				match(T__7);
				setState(385);
				_la = _input.LA(1);
				if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (OFFSET - 93)) | (1L << (ORDINAL - 93)) | (1L << (SAFE_OFFSET - 93)) | (1L << (SAFE_ORDINAL - 93)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				match(T__0);
				setState(387);
				expr(0);
				setState(388);
				match(T__1);
				setState(389);
				match(T__8);
				}
				break;
			case 4:
				{
				setState(391);
				unary_operator();
				setState(392);
				expr(19);
				}
				break;
			case 5:
				{
				setState(394);
				match(IS);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(395);
					match(NOT);
					}
				}

				setState(398);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(399);
				match(IS);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(400);
					match(NOT);
					}
				}

				setState(403);
				match(FALSE);
				}
				break;
			case 7:
				{
				setState(404);
				function_name();
				setState(405);
				match(T__0);
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__5:
				case T__6:
				case T__23:
				case INT:
				case FLOAT:
				case QUOTE:
				case DQOUTE:
				case ALL:
				case AND:
				case ANY:
				case ARRAY:
				case AS:
				case ASC:
				case ASSERT_ROWS_MODIFIED:
				case AT:
				case BETWEEN:
				case BY:
				case CASE:
				case CAST:
				case COLLATE:
				case CONTAINS:
				case CREATE:
				case CROSS:
				case CUBE:
				case CURRENT:
				case DEFAULT:
				case DEFINE:
				case DESC:
				case DISTINCT:
				case ELSE:
				case END:
				case ENUM:
				case ESCAPE:
				case EXCEPT:
				case EXCLUDE:
				case EXISTS:
				case EXTRACT:
				case FALSE:
				case FETCH:
				case FOLLOWING:
				case FOR:
				case FROM:
				case FULL:
				case GROUP:
				case GROUPING:
				case GROUPS:
				case HASH:
				case HAVING:
				case IF:
				case IGNORE:
				case IN:
				case INNER:
				case INTERSECT:
				case INTERVAL:
				case INTO:
				case IS:
				case JOIN:
				case LATERAL:
				case LEFT:
				case LIKE:
				case LIMIT:
				case LOOKUP:
				case MERGE:
				case NATURAL:
				case NEW:
				case NO:
				case NOT:
				case S_NULL:
				case NULLS:
				case OF:
				case OFFSET:
				case ON:
				case OR:
				case ORDER:
				case ORDINAL:
				case OUTER:
				case OVER:
				case PARTITION:
				case PRECEDING:
				case PROTO:
				case RANGE:
				case RECURSIVE:
				case REPLACE:
				case RESPECT:
				case RIGHT:
				case ROLLUP:
				case ROWS:
				case SAFE_OFFSET:
				case SAFE_ORDINAL:
				case SELECT:
				case SET:
				case SOME:
				case SSTRUCT:
				case SYSTEM:
				case TABLESAMPLE:
				case THEN:
				case TIME:
				case TO:
				case TREAT:
				case TRUE:
				case UNBOUNDED:
				case UNION:
				case UNNEST:
				case USING:
				case WHEN:
				case WHERE:
				case WINDOW:
				case WITH:
				case WITHIN:
				case QUOTED_STRING:
				case TRIPLE_QUOTED_STRING:
				case RAW_STRING:
				case BYTE_STRING:
				case RAW_BYTE_STRING:
				case ID:
					{
					{
					setState(406);
					expr(0);
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(407);
						match(T__2);
						setState(408);
						expr(0);
						}
						}
						setState(413);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case T__4:
					{
					setState(414);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(417);
				match(T__1);
				}
				break;
			case 8:
				{
				setState(419);
				cast_expr();
				}
				break;
			case 9:
				{
				setState(420);
				match(T__0);
				setState(421);
				expr(0);
				setState(422);
				match(T__1);
				}
				break;
			case 10:
				{
				setState(424);
				column_expr();
				}
				break;
			case 11:
				{
				setState(425);
				keyword();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(428);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(429);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(430);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(431);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(432);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(433);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(434);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(435);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(436);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(437);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(438);
						match(T__13);
						setState(439);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(440);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(441);
						match(T__14);
						setState(442);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(443);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(444);
						match(T__15);
						setState(445);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(466);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(447);
							match(T__16);
							}
							break;
						case 2:
							{
							setState(448);
							match(T__17);
							}
							break;
						case 3:
							{
							setState(449);
							match(T__18);
							}
							break;
						case 4:
							{
							setState(450);
							match(T__19);
							}
							break;
						case 5:
							{
							setState(451);
							match(T__20);
							}
							break;
						case 6:
							{
							setState(452);
							match(T__21);
							}
							break;
						case 7:
							{
							setState(453);
							match(T__22);
							}
							break;
						case 8:
							{
							setState(455);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(454);
								match(NOT);
								}
							}

							setState(457);
							match(LIKE);
							}
							break;
						case 9:
							{
							setState(459);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==NOT) {
								{
								setState(458);
								match(NOT);
								}
							}

							setState(461);
							match(BETWEEN);
							setState(462);
							expr(0);
							setState(463);
							match(AND);
							setState(464);
							expr(0);
							}
							break;
						}
						setState(468);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(469);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(470);
						match(AND);
						setState(471);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(472);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(473);
						match(OR);
						setState(474);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(475);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(476);
						match(IS);
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(477);
							match(NOT);
							}
						}

						setState(480);
						match(S_NULL);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(481);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(483);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(482);
							match(NOT);
							}
						}

						setState(485);
						match(IN);
						setState(503);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
						case 1:
							{
							{
							setState(486);
							match(T__0);
							setState(487);
							expr(0);
							setState(492);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__2) {
								{
								{
								setState(488);
								match(T__2);
								setState(489);
								expr(0);
								}
								}
								setState(494);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(495);
							match(T__1);
							}
							}
							break;
						case 2:
							{
							setState(497);
							query_statement();
							}
							break;
						case 3:
							{
							setState(498);
							match(UNNEST);
							setState(499);
							match(T__0);
							setState(500);
							array_expr();
							setState(501);
							match(T__1);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Cast_exprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(bigqueryParser.CAST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(bigqueryParser.AS, 0); }
		public Datatype_nameContext datatype_name() {
			return getRuleContext(Datatype_nameContext.class,0);
		}
		public Cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterCast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitCast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitCast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_exprContext cast_expr() throws RecognitionException {
		Cast_exprContext _localctx = new Cast_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CAST);
			setState(511);
			match(T__0);
			setState(512);
			expr(0);
			setState(513);
			match(AS);
			setState(514);
			datatype_name();
			setState(515);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_exprContext extends ParserRuleContext {
		public Column_exprContext column_expr() {
			return getRuleContext(Column_exprContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Dataset_nameContext dataset_name() {
			return getRuleContext(Dataset_nameContext.class,0);
		}
		public Project_nameContext project_name() {
			return getRuleContext(Project_nameContext.class,0);
		}
		public Column_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterColumn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitColumn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitColumn_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_exprContext column_expr() throws RecognitionException {
		Column_exprContext _localctx = new Column_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column_expr);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(T__23);
				setState(518);
				column_expr();
				setState(519);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(529);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(524);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
						case 1:
							{
							setState(521);
							project_name();
							setState(522);
							match(T__3);
							}
							break;
						}
						setState(526);
						dataset_name();
						setState(527);
						match(T__3);
						}
						break;
					}
					setState(531);
					table_name();
					setState(532);
					match(T__3);
					}
					break;
				}
				setState(536);
				column_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_statementContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(bigqueryParser.EXCEPT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Except_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterExcept_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitExcept_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitExcept_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_statementContext except_statement() throws RecognitionException {
		Except_statementContext _localctx = new Except_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_except_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(EXCEPT);
			setState(540);
			match(T__0);
			setState(541);
			column_name();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(542);
				match(T__2);
				setState(543);
				column_name();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Replace_statementContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(bigqueryParser.REPLACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Alias_nameContext> alias_name() {
			return getRuleContexts(Alias_nameContext.class);
		}
		public Alias_nameContext alias_name(int i) {
			return getRuleContext(Alias_nameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(bigqueryParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(bigqueryParser.AS, i);
		}
		public Replace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterReplace_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitReplace_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitReplace_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Replace_statementContext replace_statement() throws RecognitionException {
		Replace_statementContext _localctx = new Replace_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_replace_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(REPLACE);
			setState(552);
			match(T__0);
			setState(553);
			expr(0);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__23) | (1L << QUOTE) | (1L << DQOUTE) | (1L << AS))) != 0) || _la==ID) {
				{
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(554);
					match(AS);
					}
				}

				setState(557);
				alias_name();
				}
			}

			{
			setState(560);
			match(T__2);
			setState(561);
			expr(0);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__23) | (1L << QUOTE) | (1L << DQOUTE) | (1L << AS))) != 0) || _la==ID) {
				{
				{
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(562);
					match(AS);
					}
				}

				setState(565);
				alias_name();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(571);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(bigqueryParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(bigqueryParser.CROSS, 0); }
		public TerminalNode FULL() { return getToken(bigqueryParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(bigqueryParser.OUTER, 0); }
		public TerminalNode LEFT() { return getToken(bigqueryParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(bigqueryParser.RIGHT, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_join_type);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(INNER);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(CROSS);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				match(FULL);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(576);
					match(OUTER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				match(LEFT);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(580);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 5);
				{
				setState(583);
				match(RIGHT);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(584);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_clauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(bigqueryParser.ON, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public On_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterOn_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitOn_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitOn_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_clauseContext on_clause() throws RecognitionException {
		On_clauseContext _localctx = new On_clauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_on_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(ON);
			setState(590);
			bool_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_opContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(bigqueryParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(bigqueryParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(bigqueryParser.DISTINCT, 0); }
		public TerminalNode INTERSECT() { return getToken(bigqueryParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(bigqueryParser.EXCEPT, 0); }
		public Set_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterSet_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitSet_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitSet_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_opContext set_op() throws RecognitionException {
		Set_opContext _localctx = new Set_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_set_op);
		int _la;
		try {
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				match(UNION);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(593);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(INTERSECT);
				setState(597);
				match(DISTINCT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				match(EXCEPT);
				setState(599);
				match(DISTINCT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(bigqueryParser.USING, 0); }
		public List<Join_nameContext> join_name() {
			return getRuleContexts(Join_nameContext.class);
		}
		public Join_nameContext join_name(int i) {
			return getRuleContext(Join_nameContext.class,i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterUsing_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitUsing_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_using_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(USING);
			setState(603);
			match(T__0);
			setState(604);
			join_name();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(605);
				match(T__2);
				setState(606);
				join_name();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_pathContext extends ParserRuleContext {
		public Field_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterField_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitField_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitField_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_pathContext field_path() throws RecognitionException {
		Field_pathContext _localctx = new Field_pathContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_field_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SstructContext extends ParserRuleContext {
		public TerminalNode SSTRUCT() { return getToken(bigqueryParser.SSTRUCT, 0); }
		public Datatype_nameContext datatype_name() {
			return getRuleContext(Datatype_nameContext.class,0);
		}
		public SstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterSstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitSstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitSstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SstructContext sstruct() throws RecognitionException {
		SstructContext _localctx = new SstructContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(SSTRUCT);
			setState(617);
			match(T__17);
			setState(618);
			datatype_name();
			setState(619);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_exprContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(bigqueryParser.ARRAY, 0); }
		public Datatype_nameContext datatype_name() {
			return getRuleContext(Datatype_nameContext.class,0);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitArray_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitArray_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_array_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(ARRAY);
			setState(622);
			match(T__17);
			setState(623);
			datatype_name();
			setState(624);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_pathContext extends ParserRuleContext {
		public Array_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterArray_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitArray_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitArray_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_pathContext array_path() throws RecognitionException {
		Array_pathContext _localctx = new Array_pathContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_nameContext extends ParserRuleContext {
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitWindow_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitWindow_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_definitionContext extends ParserRuleContext {
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterWindow_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitWindow_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitWindow_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_window_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_rowsContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Skip_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterSkip_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitSkip_rows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitSkip_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Skip_rowsContext skip_rows() throws RecognitionException {
		Skip_rowsContext _localctx = new Skip_rowsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_skip_rows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_statementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(bigqueryParser.WITH, 0); }
		public List<Cte_nameContext> cte_name() {
			return getRuleContexts(Cte_nameContext.class);
		}
		public Cte_nameContext cte_name(int i) {
			return getRuleContext(Cte_nameContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(bigqueryParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(bigqueryParser.AS, i);
		}
		public List<Query_exprContext> query_expr() {
			return getRuleContexts(Query_exprContext.class);
		}
		public Query_exprContext query_expr(int i) {
			return getRuleContext(Query_exprContext.class,i);
		}
		public With_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterWith_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitWith_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitWith_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_statementContext with_statement() throws RecognitionException {
		With_statementContext _localctx = new With_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_with_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(WITH);
			setState(639);
			cte_name();
			setState(640);
			match(AS);
			setState(641);
			match(T__0);
			setState(642);
			query_expr(0);
			setState(643);
			match(T__1);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(644);
				match(T__2);
				setState(645);
				cte_name();
				setState(646);
				match(AS);
				setState(647);
				match(T__0);
				setState(648);
				query_expr(0);
				setState(649);
				match(T__1);
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bigqueryParser.ID, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_name);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				match(ID);
				}
				break;
			case DQOUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(DQOUTE);
				setState(658);
				name();
				setState(659);
				match(DQOUTE);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				match(T__0);
				setState(662);
				name();
				setState(663);
				match(T__1);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(T__23);
				setState(666);
				name();
				setState(667);
				match(T__23);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(669);
				match(QUOTE);
				setState(670);
				name();
				setState(671);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterAlias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitAlias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitAlias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alias_nameContext alias_name() throws RecognitionException {
		Alias_nameContext _localctx = new Alias_nameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Cte_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterCte_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitCte_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitCte_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_nameContext cte_name() throws RecognitionException {
		Cte_nameContext _localctx = new Cte_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cte_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dataset_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Dataset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterDataset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitDataset_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitDataset_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dataset_nameContext dataset_name() throws RecognitionException {
		Dataset_nameContext _localctx = new Dataset_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dataset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Datatype_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Datatype_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterDatatype_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitDatatype_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitDatatype_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datatype_nameContext datatype_name() throws RecognitionException {
		Datatype_nameContext _localctx = new Datatype_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_datatype_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Join_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterJoin_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitJoin_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitJoin_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_nameContext join_name() throws RecognitionException {
		Join_nameContext _localctx = new Join_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_join_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitMember_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Project_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Project_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterProject_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitProject_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitProject_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Project_nameContext project_name() throws RecognitionException {
		Project_nameContext _localctx = new Project_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_project_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_exprContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Dataset_nameContext dataset_name() {
			return getRuleContext(Dataset_nameContext.class,0);
		}
		public Project_nameContext project_name() {
			return getRuleContext(Project_nameContext.class,0);
		}
		public Table_exprContext table_expr() {
			return getRuleContext(Table_exprContext.class,0);
		}
		public Table_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterTable_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitTable_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitTable_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_exprContext table_expr() throws RecognitionException {
		Table_exprContext _localctx = new Table_exprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_table_expr);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(702);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(699);
						project_name();
						setState(700);
						match(T__3);
						}
						break;
					}
					setState(704);
					dataset_name();
					setState(705);
					match(T__3);
					}
					break;
				}
				setState(709);
				table_name();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(T__23);
				setState(711);
				table_expr();
				setState(712);
				match(T__23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_number);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				integer_type();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				float_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(bigqueryParser.INT, 0); }
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitInteger_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitInteger_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_integer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(bigqueryParser.FLOAT, 0); }
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterFloat_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitFloat_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitFloat_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_float_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public Triple_quoted_stringContext triple_quoted_string() {
			return getRuleContext(Triple_quoted_stringContext.class,0);
		}
		public Raw_stringContext raw_string() {
			return getRuleContext(Raw_stringContext.class,0);
		}
		public Byte_stringContext byte_string() {
			return getRuleContext(Byte_stringContext.class,0);
		}
		public Raw_byte_stringContext raw_byte_string() {
			return getRuleContext(Raw_byte_stringContext.class,0);
		}
		public Special_stringContext special_string() {
			return getRuleContext(Special_stringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				quoted_string();
				}
				break;
			case TRIPLE_QUOTED_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				triple_quoted_string();
				}
				break;
			case RAW_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				raw_string();
				}
				break;
			case BYTE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				byte_string();
				}
				break;
			case RAW_BYTE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				raw_byte_string();
				}
				break;
			case T__0:
			case T__23:
			case QUOTE:
			case DQOUTE:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(729);
				special_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(bigqueryParser.QUOTED_STRING, 0); }
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitQuoted_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitQuoted_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_quoted_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Triple_quoted_stringContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTED_STRING() { return getToken(bigqueryParser.TRIPLE_QUOTED_STRING, 0); }
		public Triple_quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triple_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterTriple_quoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitTriple_quoted_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitTriple_quoted_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Triple_quoted_stringContext triple_quoted_string() throws RecognitionException {
		Triple_quoted_stringContext _localctx = new Triple_quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_triple_quoted_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(TRIPLE_QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_stringContext extends ParserRuleContext {
		public TerminalNode RAW_STRING() { return getToken(bigqueryParser.RAW_STRING, 0); }
		public Raw_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterRaw_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitRaw_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitRaw_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_stringContext raw_string() throws RecognitionException {
		Raw_stringContext _localctx = new Raw_stringContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_raw_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(RAW_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Byte_stringContext extends ParserRuleContext {
		public TerminalNode BYTE_STRING() { return getToken(bigqueryParser.BYTE_STRING, 0); }
		public Byte_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byte_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterByte_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitByte_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitByte_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Byte_stringContext byte_string() throws RecognitionException {
		Byte_stringContext _localctx = new Byte_stringContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_byte_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(BYTE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raw_byte_stringContext extends ParserRuleContext {
		public TerminalNode RAW_BYTE_STRING() { return getToken(bigqueryParser.RAW_BYTE_STRING, 0); }
		public Raw_byte_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_byte_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterRaw_byte_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitRaw_byte_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitRaw_byte_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_byte_stringContext raw_byte_string() throws RecognitionException {
		Raw_byte_stringContext _localctx = new Raw_byte_stringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_raw_byte_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(RAW_BYTE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_stringContext extends ParserRuleContext {
		public Datatype_nameContext datatype_name() {
			return getRuleContext(Datatype_nameContext.class,0);
		}
		public TerminalNode QUOTED_STRING() { return getToken(bigqueryParser.QUOTED_STRING, 0); }
		public Special_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterSpecial_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitSpecial_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitSpecial_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_stringContext special_string() throws RecognitionException {
		Special_stringContext _localctx = new Special_stringContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_special_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			datatype_name();
			setState(743);
			match(QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(bigqueryParser.ALL, 0); }
		public TerminalNode AND() { return getToken(bigqueryParser.AND, 0); }
		public TerminalNode ANY() { return getToken(bigqueryParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(bigqueryParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(bigqueryParser.AS, 0); }
		public TerminalNode ASC() { return getToken(bigqueryParser.ASC, 0); }
		public TerminalNode ASSERT_ROWS_MODIFIED() { return getToken(bigqueryParser.ASSERT_ROWS_MODIFIED, 0); }
		public TerminalNode AT() { return getToken(bigqueryParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(bigqueryParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(bigqueryParser.BY, 0); }
		public TerminalNode CASE() { return getToken(bigqueryParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(bigqueryParser.CAST, 0); }
		public TerminalNode COLLATE() { return getToken(bigqueryParser.COLLATE, 0); }
		public TerminalNode CONTAINS() { return getToken(bigqueryParser.CONTAINS, 0); }
		public TerminalNode CREATE() { return getToken(bigqueryParser.CREATE, 0); }
		public TerminalNode CROSS() { return getToken(bigqueryParser.CROSS, 0); }
		public TerminalNode CUBE() { return getToken(bigqueryParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(bigqueryParser.CURRENT, 0); }
		public TerminalNode DEFAULT() { return getToken(bigqueryParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(bigqueryParser.DEFINE, 0); }
		public TerminalNode DESC() { return getToken(bigqueryParser.DESC, 0); }
		public TerminalNode DISTINCT() { return getToken(bigqueryParser.DISTINCT, 0); }
		public TerminalNode ELSE() { return getToken(bigqueryParser.ELSE, 0); }
		public TerminalNode END() { return getToken(bigqueryParser.END, 0); }
		public TerminalNode ENUM() { return getToken(bigqueryParser.ENUM, 0); }
		public TerminalNode ESCAPE() { return getToken(bigqueryParser.ESCAPE, 0); }
		public TerminalNode EXCEPT() { return getToken(bigqueryParser.EXCEPT, 0); }
		public TerminalNode EXCLUDE() { return getToken(bigqueryParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(bigqueryParser.EXISTS, 0); }
		public TerminalNode EXTRACT() { return getToken(bigqueryParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(bigqueryParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(bigqueryParser.FETCH, 0); }
		public TerminalNode FOLLOWING() { return getToken(bigqueryParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(bigqueryParser.FOR, 0); }
		public TerminalNode FROM() { return getToken(bigqueryParser.FROM, 0); }
		public TerminalNode FULL() { return getToken(bigqueryParser.FULL, 0); }
		public TerminalNode GROUP() { return getToken(bigqueryParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(bigqueryParser.GROUPING, 0); }
		public TerminalNode GROUPS() { return getToken(bigqueryParser.GROUPS, 0); }
		public TerminalNode HASH() { return getToken(bigqueryParser.HASH, 0); }
		public TerminalNode HAVING() { return getToken(bigqueryParser.HAVING, 0); }
		public TerminalNode IF() { return getToken(bigqueryParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(bigqueryParser.IGNORE, 0); }
		public TerminalNode IN() { return getToken(bigqueryParser.IN, 0); }
		public TerminalNode INNER() { return getToken(bigqueryParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(bigqueryParser.INTERSECT, 0); }
		public TerminalNode INTERVAL() { return getToken(bigqueryParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(bigqueryParser.INTO, 0); }
		public TerminalNode IS() { return getToken(bigqueryParser.IS, 0); }
		public TerminalNode JOIN() { return getToken(bigqueryParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(bigqueryParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(bigqueryParser.LEFT, 0); }
		public TerminalNode LIKE() { return getToken(bigqueryParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(bigqueryParser.LIMIT, 0); }
		public TerminalNode LOOKUP() { return getToken(bigqueryParser.LOOKUP, 0); }
		public TerminalNode MERGE() { return getToken(bigqueryParser.MERGE, 0); }
		public TerminalNode NATURAL() { return getToken(bigqueryParser.NATURAL, 0); }
		public TerminalNode NEW() { return getToken(bigqueryParser.NEW, 0); }
		public TerminalNode NO() { return getToken(bigqueryParser.NO, 0); }
		public TerminalNode NOT() { return getToken(bigqueryParser.NOT, 0); }
		public TerminalNode S_NULL() { return getToken(bigqueryParser.S_NULL, 0); }
		public TerminalNode NULLS() { return getToken(bigqueryParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(bigqueryParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(bigqueryParser.OFFSET, 0); }
		public TerminalNode ON() { return getToken(bigqueryParser.ON, 0); }
		public TerminalNode OR() { return getToken(bigqueryParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(bigqueryParser.ORDER, 0); }
		public TerminalNode ORDINAL() { return getToken(bigqueryParser.ORDINAL, 0); }
		public TerminalNode OUTER() { return getToken(bigqueryParser.OUTER, 0); }
		public TerminalNode OVER() { return getToken(bigqueryParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(bigqueryParser.PARTITION, 0); }
		public TerminalNode PRECEDING() { return getToken(bigqueryParser.PRECEDING, 0); }
		public TerminalNode PROTO() { return getToken(bigqueryParser.PROTO, 0); }
		public TerminalNode RANGE() { return getToken(bigqueryParser.RANGE, 0); }
		public TerminalNode RECURSIVE() { return getToken(bigqueryParser.RECURSIVE, 0); }
		public TerminalNode REPLACE() { return getToken(bigqueryParser.REPLACE, 0); }
		public TerminalNode RESPECT() { return getToken(bigqueryParser.RESPECT, 0); }
		public TerminalNode RIGHT() { return getToken(bigqueryParser.RIGHT, 0); }
		public TerminalNode ROLLUP() { return getToken(bigqueryParser.ROLLUP, 0); }
		public TerminalNode ROWS() { return getToken(bigqueryParser.ROWS, 0); }
		public TerminalNode SAFE_OFFSET() { return getToken(bigqueryParser.SAFE_OFFSET, 0); }
		public TerminalNode SAFE_ORDINAL() { return getToken(bigqueryParser.SAFE_ORDINAL, 0); }
		public TerminalNode SELECT() { return getToken(bigqueryParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(bigqueryParser.SET, 0); }
		public TerminalNode SOME() { return getToken(bigqueryParser.SOME, 0); }
		public TerminalNode SSTRUCT() { return getToken(bigqueryParser.SSTRUCT, 0); }
		public TerminalNode SYSTEM() { return getToken(bigqueryParser.SYSTEM, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(bigqueryParser.TABLESAMPLE, 0); }
		public TerminalNode THEN() { return getToken(bigqueryParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(bigqueryParser.TIME, 0); }
		public TerminalNode TO() { return getToken(bigqueryParser.TO, 0); }
		public TerminalNode TREAT() { return getToken(bigqueryParser.TREAT, 0); }
		public TerminalNode TRUE() { return getToken(bigqueryParser.TRUE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(bigqueryParser.UNBOUNDED, 0); }
		public TerminalNode UNION() { return getToken(bigqueryParser.UNION, 0); }
		public TerminalNode UNNEST() { return getToken(bigqueryParser.UNNEST, 0); }
		public TerminalNode USING() { return getToken(bigqueryParser.USING, 0); }
		public TerminalNode WHEN() { return getToken(bigqueryParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(bigqueryParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(bigqueryParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(bigqueryParser.WITH, 0); }
		public TerminalNode WITHIN() { return getToken(bigqueryParser.WITHIN, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bigqueryListener ) ((bigqueryListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bigqueryVisitor ) return ((bigqueryVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (ALL - 30)) | (1L << (AND - 30)) | (1L << (ANY - 30)) | (1L << (ARRAY - 30)) | (1L << (AS - 30)) | (1L << (ASC - 30)) | (1L << (ASSERT_ROWS_MODIFIED - 30)) | (1L << (AT - 30)) | (1L << (BETWEEN - 30)) | (1L << (BY - 30)) | (1L << (CASE - 30)) | (1L << (CAST - 30)) | (1L << (COLLATE - 30)) | (1L << (CONTAINS - 30)) | (1L << (CREATE - 30)) | (1L << (CROSS - 30)) | (1L << (CUBE - 30)) | (1L << (CURRENT - 30)) | (1L << (DEFAULT - 30)) | (1L << (DEFINE - 30)) | (1L << (DESC - 30)) | (1L << (DISTINCT - 30)) | (1L << (ELSE - 30)) | (1L << (END - 30)) | (1L << (ENUM - 30)) | (1L << (ESCAPE - 30)) | (1L << (EXCEPT - 30)) | (1L << (EXCLUDE - 30)) | (1L << (EXISTS - 30)) | (1L << (EXTRACT - 30)) | (1L << (FALSE - 30)) | (1L << (FETCH - 30)) | (1L << (FOLLOWING - 30)) | (1L << (FOR - 30)) | (1L << (FROM - 30)) | (1L << (FULL - 30)) | (1L << (GROUP - 30)) | (1L << (GROUPING - 30)) | (1L << (GROUPS - 30)) | (1L << (HASH - 30)) | (1L << (HAVING - 30)) | (1L << (IF - 30)) | (1L << (IGNORE - 30)) | (1L << (IN - 30)) | (1L << (INNER - 30)) | (1L << (INTERSECT - 30)) | (1L << (INTERVAL - 30)) | (1L << (INTO - 30)) | (1L << (IS - 30)) | (1L << (JOIN - 30)) | (1L << (LATERAL - 30)) | (1L << (LEFT - 30)) | (1L << (LIKE - 30)) | (1L << (LIMIT - 30)) | (1L << (LOOKUP - 30)) | (1L << (MERGE - 30)) | (1L << (NATURAL - 30)) | (1L << (NEW - 30)) | (1L << (NO - 30)) | (1L << (NOT - 30)) | (1L << (S_NULL - 30)) | (1L << (NULLS - 30)) | (1L << (OF - 30)) | (1L << (OFFSET - 30)))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (ON - 94)) | (1L << (OR - 94)) | (1L << (ORDER - 94)) | (1L << (ORDINAL - 94)) | (1L << (OUTER - 94)) | (1L << (OVER - 94)) | (1L << (PARTITION - 94)) | (1L << (PRECEDING - 94)) | (1L << (PROTO - 94)) | (1L << (RANGE - 94)) | (1L << (RECURSIVE - 94)) | (1L << (REPLACE - 94)) | (1L << (RESPECT - 94)) | (1L << (RIGHT - 94)) | (1L << (ROLLUP - 94)) | (1L << (ROWS - 94)) | (1L << (SAFE_OFFSET - 94)) | (1L << (SAFE_ORDINAL - 94)) | (1L << (SELECT - 94)) | (1L << (SET - 94)) | (1L << (SOME - 94)) | (1L << (SSTRUCT - 94)) | (1L << (SYSTEM - 94)) | (1L << (TABLESAMPLE - 94)) | (1L << (THEN - 94)) | (1L << (TIME - 94)) | (1L << (TO - 94)) | (1L << (TREAT - 94)) | (1L << (TRUE - 94)) | (1L << (UNBOUNDED - 94)) | (1L << (UNION - 94)) | (1L << (UNNEST - 94)) | (1L << (USING - 94)) | (1L << (WHEN - 94)) | (1L << (WHERE - 94)) | (1L << (WINDOW - 94)) | (1L << (WITH - 94)) | (1L << (WITHIN - 94)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return query_expr_sempred((Query_exprContext)_localctx, predIndex);
		case 7:
			return from_item_sempred((From_itemContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean query_expr_sempred(Query_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean from_item_sempred(From_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008f\u02ee\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\5"+
		"\2z\n\2\3\2\3\2\3\3\3\3\3\3\5\3\u0081\n\3\3\3\5\3\u0084\n\3\3\3\3\3\3"+
		"\3\3\3\5\3\u008a\n\3\3\3\5\3\u008d\n\3\5\3\u008f\n\3\3\3\3\3\3\3\3\3\5"+
		"\3\u0095\n\3\3\3\5\3\u0098\n\3\7\3\u009a\n\3\f\3\16\3\u009d\13\3\3\4\3"+
		"\4\5\4\u00a1\n\4\3\4\3\4\5\4\u00a5\n\4\3\4\5\4\u00a8\n\4\3\4\5\4\u00ab"+
		"\n\4\3\4\5\4\u00ae\n\4\3\4\5\4\u00b1\n\4\3\5\3\5\5\5\u00b5\n\5\3\5\5\5"+
		"\u00b8\n\5\3\5\5\5\u00bb\n\5\3\5\3\5\3\5\5\5\u00c0\n\5\3\5\5\5\u00c3\n"+
		"\5\3\5\5\5\u00c6\n\5\7\5\u00c8\n\5\f\5\16\5\u00cb\13\5\3\6\3\6\3\6\5\6"+
		"\u00d0\n\6\3\6\3\6\3\7\3\7\5\7\u00d6\n\7\3\7\5\7\u00d9\n\7\3\b\3\b\3\b"+
		"\3\b\7\b\u00df\n\b\f\b\16\b\u00e2\13\b\3\t\3\t\3\t\5\t\u00e7\n\t\3\t\5"+
		"\t\u00ea\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f2\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00f8\n\t\3\t\5\t\u00fb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0103\n\t\3\t"+
		"\5\t\u0106\n\t\3\t\3\t\3\t\5\t\u010b\n\t\3\t\5\t\u010e\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0115\n\t\3\t\5\t\u0118\n\t\3\t\3\t\3\t\5\t\u011d\n\t\3\t"+
		"\5\t\u0120\n\t\3\t\3\t\5\t\u0124\n\t\3\t\5\t\u0127\n\t\3\t\3\t\3\t\5\t"+
		"\u012c\n\t\3\t\5\t\u012f\n\t\5\t\u0131\n\t\3\t\3\t\5\t\u0135\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u013b\n\t\7\t\u013d\n\t\f\t\16\t\u0140\13\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u014a\n\13\f\13\16\13\u014d\13\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0154\n\13\f\13\16\13\u0157\13\13\3\13\3\13"+
		"\5\13\u015b\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16\u016b\n\16\3\16\3\16\3\16\5\16\u0170\n\16\7\16\u0172\n\16\f"+
		"\16\16\16\u0175\13\16\3\17\3\17\3\17\3\17\5\17\u017b\n\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u018f\n\21\3\21\3\21\3\21\5\21\u0194\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u019c\n\21\f\21\16\21\u019f\13\21\3\21\5\21\u01a2"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ad\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01ca"+
		"\n\21\3\21\3\21\5\21\u01ce\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u01d5\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u01e1\n\21"+
		"\3\21\3\21\3\21\5\21\u01e6\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01ed\n"+
		"\21\f\21\16\21\u01f0\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01fa\n\21\7\21\u01fc\n\21\f\21\16\21\u01ff\13\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u020f\n\23\3\23"+
		"\3\23\3\23\5\23\u0214\n\23\3\23\3\23\3\23\5\23\u0219\n\23\3\23\5\23\u021c"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u0223\n\24\f\24\16\24\u0226\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u022e\n\25\3\25\5\25\u0231\n\25\3"+
		"\25\3\25\3\25\5\25\u0236\n\25\3\25\7\25\u0239\n\25\f\25\16\25\u023c\13"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0244\n\26\3\26\3\26\5\26\u0248"+
		"\n\26\3\26\3\26\5\26\u024c\n\26\5\26\u024e\n\26\3\27\3\27\3\27\3\30\3"+
		"\30\5\30\u0255\n\30\3\30\3\30\3\30\3\30\5\30\u025b\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u0262\n\31\f\31\16\31\u0265\13\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\7#\u028e\n#\f#\16#\u0291\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u02a4\n$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\5\61\u02c1\n\61\3\61\3"+
		"\61\3\61\5\61\u02c6\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u02cd\n\61\3\62"+
		"\3\62\5\62\u02d1\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u02dd\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<"+
		"\3<\2\5\4\20 =\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\n\4\2  \65\65\4\2%%\64\64\4\2\b"+
		"\t[[\5\2__ccpq\4\2\7\7\f\f\4\2\b\b\r\r\3\2\16\17\3\2 \u0085\2\u0336\2"+
		"y\3\2\2\2\4\u008e\3\2\2\2\6\u009e\3\2\2\2\b\u00ba\3\2\2\2\n\u00cf\3\2"+
		"\2\2\f\u00d3\3\2\2\2\16\u00da\3\2\2\2\20\u0130\3\2\2\2\22\u0141\3\2\2"+
		"\2\24\u0144\3\2\2\2\26\u015c\3\2\2\2\30\u015f\3\2\2\2\32\u0166\3\2\2\2"+
		"\34\u0176\3\2\2\2\36\u017c\3\2\2\2 \u01ac\3\2\2\2\"\u0200\3\2\2\2$\u021b"+
		"\3\2\2\2&\u021d\3\2\2\2(\u0229\3\2\2\2*\u024d\3\2\2\2,\u024f\3\2\2\2."+
		"\u025a\3\2\2\2\60\u025c\3\2\2\2\62\u0268\3\2\2\2\64\u026a\3\2\2\2\66\u026f"+
		"\3\2\2\28\u0274\3\2\2\2:\u0276\3\2\2\2<\u0278\3\2\2\2>\u027a\3\2\2\2@"+
		"\u027c\3\2\2\2B\u027e\3\2\2\2D\u0280\3\2\2\2F\u02a3\3\2\2\2H\u02a5\3\2"+
		"\2\2J\u02a7\3\2\2\2L\u02a9\3\2\2\2N\u02ab\3\2\2\2P\u02ad\3\2\2\2R\u02af"+
		"\3\2\2\2T\u02b1\3\2\2\2V\u02b3\3\2\2\2X\u02b5\3\2\2\2Z\u02b7\3\2\2\2\\"+
		"\u02b9\3\2\2\2^\u02bb\3\2\2\2`\u02cc\3\2\2\2b\u02d0\3\2\2\2d\u02d2\3\2"+
		"\2\2f\u02d4\3\2\2\2h\u02dc\3\2\2\2j\u02de\3\2\2\2l\u02e0\3\2\2\2n\u02e2"+
		"\3\2\2\2p\u02e4\3\2\2\2r\u02e6\3\2\2\2t\u02e8\3\2\2\2v\u02eb\3\2\2\2x"+
		"z\5D#\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5\4\3\2|\3\3\2\2\2}~\b\3\1\2~"+
		"\u0080\5\6\4\2\177\u0081\5\32\16\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0083\3\2\2\2\u0082\u0084\5\34\17\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008f\3\2\2\2\u0085\u0086\7\3\2\2\u0086\u0087\5\4"+
		"\3\2\u0087\u0089\7\4\2\2\u0088\u008a\5\32\16\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\34\17\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e}\3\2\2\2\u008e\u0085"+
		"\3\2\2\2\u008f\u009b\3\2\2\2\u0090\u0091\f\3\2\2\u0091\u0092\5.\30\2\u0092"+
		"\u0094\5\4\3\2\u0093\u0095\5\32\16\2\u0094\u0093\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5\34\17\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\5\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\7r\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\5\b\5\2\u00a3\u00a5\5\16"+
		"\b\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a8\5\22\n\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00ae\5\26\f\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5\30\r\2\u00b0\u00af\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\7\3\2\2\2\u00b2\u00b4\5\n\6\2\u00b3\u00b5\5&\24\2"+
		"\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b8"+
		"\5(\25\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00bb\5\f\7\2\u00ba\u00b2\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00c9\3\2"+
		"\2\2\u00bc\u00c5\7\5\2\2\u00bd\u00bf\5\n\6\2\u00be\u00c0\5&\24\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5("+
		"\25\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c6\5\f\7\2\u00c5\u00bd\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00bc\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\t\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\5 \21\2"+
		"\u00cd\u00ce\7\6\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2\13\3\2\2\2\u00d3"+
		"\u00d8\5 \21\2\u00d4\u00d6\7$\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\5H%\2\u00d8\u00d5\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\r\3\2\2\2\u00da\u00db\7B\2\2\u00db\u00e0\5\20\t\2\u00dc"+
		"\u00dd\7\5\2\2\u00dd\u00df\5\20\t\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\17\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e4\b\t\1\2\u00e4\u00e9\5`\61\2\u00e5\u00e7\7$"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\5H%\2\u00e9\u00e6\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f1\3\2\2"+
		"\2\u00eb\u00ec\7A\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef"+
		"\7$\2\2\u00ef\u00f0\7^\2\2\u00f0\u00f2\5h\65\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u0131\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\2"+
		"\2\2\u00f5\u00fa\7\4\2\2\u00f6\u00f8\7$\2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5H%\2\u00fa\u00f7\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u0131\3\2\2\2\u00fc\u0131\5\62\32\2\u00fd"+
		"\u00fe\7\177\2\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\5\66\34\2\u0100\u0105"+
		"\7\4\2\2\u0101\u0103\7$\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\5H%\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2"+
		"\2\u0106\u010d\3\2\2\2\u0107\u0108\7\u0084\2\2\u0108\u010a\7_\2\2\u0109"+
		"\u010b\7$\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\5H%\2\u010d\u0107\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0131"+
		"\3\2\2\2\u010f\u0110\7\177\2\2\u0110\u0111\7\3\2\2\u0111\u0112\58\35\2"+
		"\u0112\u0117\7\4\2\2\u0113\u0115\7$\2\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\5H%\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011f\3\2\2\2\u0119\u011a\7\u0084\2\2\u011a\u011c"+
		"\7_\2\2\u011b\u011d\7$\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\5H%\2\u011f\u0119\3\2\2\2\u011f\u0120\3\2\2"+
		"\2\u0120\u0131\3\2\2\2\u0121\u0126\58\35\2\u0122\u0124\7$\2\2\u0123\u0122"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\5H%\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012e\3\2\2\2\u0128\u0129\7\u0084"+
		"\2\2\u0129\u012b\7_\2\2\u012a\u012c\7$\2\2\u012b\u012a\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\5H%\2\u012e\u0128\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u00e3\3\2\2\2\u0130\u00f3\3\2"+
		"\2\2\u0130\u00fc\3\2\2\2\u0130\u00fd\3\2\2\2\u0130\u010f\3\2\2\2\u0130"+
		"\u0121\3\2\2\2\u0131\u013e\3\2\2\2\u0132\u0134\f\b\2\2\u0133\u0135\5*"+
		"\26\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7Q\2\2\u0137\u013a\5\20\t\2\u0138\u013b\5,\27\2\u0139\u013b\5\60"+
		"\31\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0132\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\21\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\u0082\2\2\u0142"+
		"\u0143\5:\36\2\u0143\23\3\2\2\2\u0144\u0145\7D\2\2\u0145\u015a\7)\2\2"+
		"\u0146\u014b\5 \21\2\u0147\u0148\7\5\2\2\u0148\u014a\5 \21\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u015b\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7n\2\2\u014f\u0150\7\3"+
		"\2\2\u0150\u0155\5 \21\2\u0151\u0152\7\5\2\2\u0152\u0154\5 \21\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\4\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0146\3\2\2\2\u015a\u014e\3\2\2\2\u015b\25\3\2\2"+
		"\2\u015c\u015d\7H\2\2\u015d\u015e\5:\36\2\u015e\27\3\2\2\2\u015f\u0160"+
		"\7\u0083\2\2\u0160\u0161\5<\37\2\u0161\u0162\7$\2\2\u0162\u0163\7\3\2"+
		"\2\u0163\u0164\5> \2\u0164\u0165\7\4\2\2\u0165\31\3\2\2\2\u0166\u0167"+
		"\7b\2\2\u0167\u0168\7)\2\2\u0168\u016a\5 \21\2\u0169\u016b\t\3\2\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0173\3\2\2\2\u016c\u016d\7\5"+
		"\2\2\u016d\u016f\5 \21\2\u016e\u0170\t\3\2\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016c\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\33\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0176\u0177\7U\2\2\u0177\u017a\5@!\2\u0178\u0179\7_\2\2\u0179"+
		"\u017b\5B\"\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\35\3\2\2\2"+
		"\u017c\u017d\t\4\2\2\u017d\37\3\2\2\2\u017e\u017f\b\21\1\2\u017f\u01ad"+
		"\5b\62\2\u0180\u01ad\5h\65\2\u0181\u0182\5J&\2\u0182\u0183\7\n\2\2\u0183"+
		"\u0184\t\5\2\2\u0184\u0185\7\3\2\2\u0185\u0186\5 \21\2\u0186\u0187\7\4"+
		"\2\2\u0187\u0188\7\13\2\2\u0188\u01ad\3\2\2\2\u0189\u018a\5\36\20\2\u018a"+
		"\u018b\5 \21\25\u018b\u01ad\3\2\2\2\u018c\u018e\7P\2\2\u018d\u018f\7["+
		"\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u01ad\7|\2\2\u0191\u0193\7P\2\2\u0192\u0194\7[\2\2\u0193\u0192\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01ad\7>\2\2\u0196\u0197"+
		"\5T+\2\u0197\u01a1\7\3\2\2\u0198\u019d\5 \21\2\u0199\u019a\7\5\2\2\u019a"+
		"\u019c\5 \21\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a2\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a2\7\7\2\2\u01a1\u0198\3\2\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\7\4\2\2\u01a4\u01ad\3\2\2\2\u01a5\u01ad\5\"\22\2\u01a6"+
		"\u01a7\7\3\2\2\u01a7\u01a8\5 \21\2\u01a8\u01a9\7\4\2\2\u01a9\u01ad\3\2"+
		"\2\2\u01aa\u01ad\5$\23\2\u01ab\u01ad\5v<\2\u01ac\u017e\3\2\2\2\u01ac\u0180"+
		"\3\2\2\2\u01ac\u0181\3\2\2\2\u01ac\u0189\3\2\2\2\u01ac\u018c\3\2\2\2\u01ac"+
		"\u0191\3\2\2\2\u01ac\u0196\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a6\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01fd\3\2\2\2\u01ae"+
		"\u01af\f\24\2\2\u01af\u01b0\t\6\2\2\u01b0\u01fc\5 \21\25\u01b1\u01b2\f"+
		"\23\2\2\u01b2\u01b3\t\7\2\2\u01b3\u01fc\5 \21\24\u01b4\u01b5\f\22\2\2"+
		"\u01b5\u01b6\t\b\2\2\u01b6\u01fc\5 \21\23\u01b7\u01b8\f\21\2\2\u01b8\u01b9"+
		"\7\20\2\2\u01b9\u01fc\5 \21\22\u01ba\u01bb\f\20\2\2\u01bb\u01bc\7\21\2"+
		"\2\u01bc\u01fc\5 \21\21\u01bd\u01be\f\17\2\2\u01be\u01bf\7\22\2\2\u01bf"+
		"\u01fc\5 \21\20\u01c0\u01d4\f\16\2\2\u01c1\u01d5\7\23\2\2\u01c2\u01d5"+
		"\7\24\2\2\u01c3\u01d5\7\25\2\2\u01c4\u01d5\7\26\2\2\u01c5\u01d5\7\27\2"+
		"\2\u01c6\u01d5\7\30\2\2\u01c7\u01d5\7\31\2\2\u01c8\u01ca\7[\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01d5\7T"+
		"\2\2\u01cc\u01ce\7[\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\7(\2\2\u01d0\u01d1\5 \21\2\u01d1\u01d2\7!\2"+
		"\2\u01d2\u01d3\5 \21\2\u01d3\u01d5\3\2\2\2\u01d4\u01c1\3\2\2\2\u01d4\u01c2"+
		"\3\2\2\2\u01d4\u01c3\3\2\2\2\u01d4\u01c4\3\2\2\2\u01d4\u01c5\3\2\2\2\u01d4"+
		"\u01c6\3\2\2\2\u01d4\u01c7\3\2\2\2\u01d4\u01c9\3\2\2\2\u01d4\u01cd\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01fc\5 \21\17\u01d7\u01d8\f\t\2\2\u01d8"+
		"\u01d9\7!\2\2\u01d9\u01fc\5 \21\n\u01da\u01db\f\b\2\2\u01db\u01dc\7a\2"+
		"\2\u01dc\u01fc\5 \21\t\u01dd\u01de\f\r\2\2\u01de\u01e0\7P\2\2\u01df\u01e1"+
		"\7[\2\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01fc\7\\\2\2\u01e3\u01e5\f\n\2\2\u01e4\u01e6\7[\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f9\7K\2\2\u01e8"+
		"\u01e9\7\3\2\2\u01e9\u01ee\5 \21\2\u01ea\u01eb\7\5\2\2\u01eb\u01ed\5 "+
		"\21\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7\4"+
		"\2\2\u01f2\u01fa\3\2\2\2\u01f3\u01fa\5\2\2\2\u01f4\u01f5\7\177\2\2\u01f5"+
		"\u01f6\7\3\2\2\u01f6\u01f7\5\66\34\2\u01f7\u01f8\7\4\2\2\u01f8\u01fa\3"+
		"\2\2\2\u01f9\u01e8\3\2\2\2\u01f9\u01f3\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01ae\3\2\2\2\u01fb\u01b1\3\2\2\2\u01fb\u01b4\3\2"+
		"\2\2\u01fb\u01b7\3\2\2\2\u01fb\u01ba\3\2\2\2\u01fb\u01bd\3\2\2\2\u01fb"+
		"\u01c0\3\2\2\2\u01fb\u01d7\3\2\2\2\u01fb\u01da\3\2\2\2\u01fb\u01dd\3\2"+
		"\2\2\u01fb\u01e3\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe!\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7+\2\2\u0201"+
		"\u0202\7\3\2\2\u0202\u0203\5 \21\2\u0203\u0204\7$\2\2\u0204\u0205\5R*"+
		"\2\u0205\u0206\7\4\2\2\u0206#\3\2\2\2\u0207\u0208\7\32\2\2\u0208\u0209"+
		"\5$\23\2\u0209\u020a\7\32\2\2\u020a\u021c\3\2\2\2\u020b\u020c\5Z.\2\u020c"+
		"\u020d\7\6\2\2\u020d\u020f\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\5P)\2\u0211\u0212\7\6\2\2\u0212\u0214"+
		"\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\5^\60\2\u0216\u0217\7\6\2\2\u0217\u0219\3\2\2\2\u0218\u0213\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\5L\'\2\u021b"+
		"\u0207\3\2\2\2\u021b\u0218\3\2\2\2\u021c%\3\2\2\2\u021d\u021e\7:\2\2\u021e"+
		"\u021f\7\3\2\2\u021f\u0224\5L\'\2\u0220\u0221\7\5\2\2\u0221\u0223\5L\'"+
		"\2\u0222\u0220\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\4\2\2\u0228"+
		"\'\3\2\2\2\u0229\u022a\7k\2\2\u022a\u022b\7\3\2\2\u022b\u0230\5 \21\2"+
		"\u022c\u022e\7$\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f"+
		"\3\2\2\2\u022f\u0231\5H%\2\u0230\u022d\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\7\5\2\2\u0233\u023a\5 \21\2\u0234\u0236\7$"+
		"\2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0239\5H%\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e"+
		"\7\4\2\2\u023e)\3\2\2\2\u023f\u024e\7L\2\2\u0240\u024e\7/\2\2\u0241\u0243"+
		"\7C\2\2\u0242\u0244\7d\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\u024e\3\2\2\2\u0245\u0247\7S\2\2\u0246\u0248\7d\2\2\u0247\u0246\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u024e\3\2\2\2\u0249\u024b\7m\2\2\u024a\u024c"+
		"\7d\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d"+
		"\u023f\3\2\2\2\u024d\u0240\3\2\2\2\u024d\u0241\3\2\2\2\u024d\u0245\3\2"+
		"\2\2\u024d\u0249\3\2\2\2\u024e+\3\2\2\2\u024f\u0250\7`\2\2\u0250\u0251"+
		"\5:\36\2\u0251-\3\2\2\2\u0252\u0254\7~\2\2\u0253\u0255\t\2\2\2\u0254\u0253"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025b\3\2\2\2\u0256\u0257\7M\2\2\u0257"+
		"\u025b\7\65\2\2\u0258\u0259\7:\2\2\u0259\u025b\7\65\2\2\u025a\u0252\3"+
		"\2\2\2\u025a\u0256\3\2\2\2\u025a\u0258\3\2\2\2\u025b/\3\2\2\2\u025c\u025d"+
		"\7\u0080\2\2\u025d\u025e\7\3\2\2\u025e\u0263\5V,\2\u025f\u0260\7\5\2\2"+
		"\u0260\u0262\5V,\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266"+
		"\u0267\7\4\2\2\u0267\61\3\2\2\2\u0268\u0269\3\2\2\2\u0269\63\3\2\2\2\u026a"+
		"\u026b\7u\2\2\u026b\u026c\7\24\2\2\u026c\u026d\5R*\2\u026d\u026e\7\25"+
		"\2\2\u026e\65\3\2\2\2\u026f\u0270\7#\2\2\u0270\u0271\7\24\2\2\u0271\u0272"+
		"\5R*\2\u0272\u0273\7\25\2\2\u0273\67\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"9\3\2\2\2\u0276\u0277\5 \21\2\u0277;\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"=\3\2\2\2\u027a\u027b\3\2\2\2\u027b?\3\2\2\2\u027c\u027d\5b\62\2\u027d"+
		"A\3\2\2\2\u027e\u027f\5b\62\2\u027fC\3\2\2\2\u0280\u0281\7\u0084\2\2\u0281"+
		"\u0282\5N(\2\u0282\u0283\7$\2\2\u0283\u0284\7\3\2\2\u0284\u0285\5\4\3"+
		"\2\u0285\u028f\7\4\2\2\u0286\u0287\7\5\2\2\u0287\u0288\5N(\2\u0288\u0289"+
		"\7$\2\2\u0289\u028a\7\3\2\2\u028a\u028b\5\4\3\2\u028b\u028c\7\4\2\2\u028c"+
		"\u028e\3\2\2\2\u028d\u0286\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290E\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u02a4"+
		"\7\u008e\2\2\u0293\u0294\7\37\2\2\u0294\u0295\5F$\2\u0295\u0296\7\37\2"+
		"\2\u0296\u02a4\3\2\2\2\u0297\u0298\7\3\2\2\u0298\u0299\5F$\2\u0299\u029a"+
		"\7\4\2\2\u029a\u02a4\3\2\2\2\u029b\u029c\7\32\2\2\u029c\u029d\5F$\2\u029d"+
		"\u029e\7\32\2\2\u029e\u02a4\3\2\2\2\u029f\u02a0\7\36\2\2\u02a0\u02a1\5"+
		"F$\2\u02a1\u02a2\7\36\2\2\u02a2\u02a4\3\2\2\2\u02a3\u0292\3\2\2\2\u02a3"+
		"\u0293\3\2\2\2\u02a3\u0297\3\2\2\2\u02a3\u029b\3\2\2\2\u02a3\u029f\3\2"+
		"\2\2\u02a4G\3\2\2\2\u02a5\u02a6\5F$\2\u02a6I\3\2\2\2\u02a7\u02a8\5F$\2"+
		"\u02a8K\3\2\2\2\u02a9\u02aa\5F$\2\u02aaM\3\2\2\2\u02ab\u02ac\5F$\2\u02ac"+
		"O\3\2\2\2\u02ad\u02ae\5F$\2\u02aeQ\3\2\2\2\u02af\u02b0\5F$\2\u02b0S\3"+
		"\2\2\2\u02b1\u02b2\5F$\2\u02b2U\3\2\2\2\u02b3\u02b4\5F$\2\u02b4W\3\2\2"+
		"\2\u02b5\u02b6\5F$\2\u02b6Y\3\2\2\2\u02b7\u02b8\5F$\2\u02b8[\3\2\2\2\u02b9"+
		"\u02ba\5F$\2\u02ba]\3\2\2\2\u02bb\u02bc\5F$\2\u02bc_\3\2\2\2\u02bd\u02be"+
		"\5Z.\2\u02be\u02bf\7\6\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\5P)\2\u02c3\u02c4\7\6\2"+
		"\2\u02c4\u02c6\3\2\2\2\u02c5\u02c0\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7"+
		"\3\2\2\2\u02c7\u02cd\5^\60\2\u02c8\u02c9\7\32\2\2\u02c9\u02ca\5`\61\2"+
		"\u02ca\u02cb\7\32\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02c5\3\2\2\2\u02cc\u02c8"+
		"\3\2\2\2\u02cda\3\2\2\2\u02ce\u02d1\5d\63\2\u02cf\u02d1\5f\64\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1c\3\2\2\2\u02d2\u02d3\7\33\2\2"+
		"\u02d3e\3\2\2\2\u02d4\u02d5\7\34\2\2\u02d5g\3\2\2\2\u02d6\u02dd\5j\66"+
		"\2\u02d7\u02dd\5l\67\2\u02d8\u02dd\5n8\2\u02d9\u02dd\5p9\2\u02da\u02dd"+
		"\5r:\2\u02db\u02dd\5t;\2\u02dc\u02d6\3\2\2\2\u02dc\u02d7\3\2\2\2\u02dc"+
		"\u02d8\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2"+
		"\2\2\u02ddi\3\2\2\2\u02de\u02df\7\u0089\2\2\u02dfk\3\2\2\2\u02e0\u02e1"+
		"\7\u008a\2\2\u02e1m\3\2\2\2\u02e2\u02e3\7\u008b\2\2\u02e3o\3\2\2\2\u02e4"+
		"\u02e5\7\u008c\2\2\u02e5q\3\2\2\2\u02e6\u02e7\7\u008d\2\2\u02e7s\3\2\2"+
		"\2\u02e8\u02e9\5R*\2\u02e9\u02ea\7\u0089\2\2\u02eau\3\2\2\2\u02eb\u02ec"+
		"\t\t\2\2\u02ecw\3\2\2\2]y\u0080\u0083\u0089\u008c\u008e\u0094\u0097\u009b"+
		"\u00a0\u00a4\u00a7\u00aa\u00ad\u00b0\u00b4\u00b7\u00ba\u00bf\u00c2\u00c5"+
		"\u00c9\u00cf\u00d5\u00d8\u00e0\u00e6\u00e9\u00f1\u00f7\u00fa\u0102\u0105"+
		"\u010a\u010d\u0114\u0117\u011c\u011f\u0123\u0126\u012b\u012e\u0130\u0134"+
		"\u013a\u013e\u014b\u0155\u015a\u016a\u016f\u0173\u017a\u018e\u0193\u019d"+
		"\u01a1\u01ac\u01c9\u01cd\u01d4\u01e0\u01e5\u01ee\u01f9\u01fb\u01fd\u020e"+
		"\u0213\u0218\u021b\u0224\u022d\u0230\u0235\u023a\u0243\u0247\u024b\u024d"+
		"\u0254\u025a\u0263\u028f\u02a3\u02c0\u02c5\u02cc\u02d0\u02dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}