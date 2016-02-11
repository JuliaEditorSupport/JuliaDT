// Generated from org/julia/lang/parser/JuliaParser.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ARROW=1, AT=2, DOT=3, SEMI_COLON=4, IS=5, EQUALS=6, NOT_EQUAL=7, GREATER_THAN=8, 
		LESS_THAN=9, GREATER_THAN_OR_EQ=10, LESS_THAN_OR_EQ=11, MINUS=12, EXPONENT=13, 
		FRACTION=14, TIMES=15, DIVIDE=16, PLUS=17, ELM_EQUALS=18, ELM_NOT_EQUAL=19, 
		ELM_GREATER_THAN=20, ELM_LESS_THAN=21, ELM_GREATER_THAN_OR_EQ=22, ELM_LESS_THAN_OR_EQ=23, 
		ELM_MINUS=24, ELM_EXPONENT=25, ELM_FRACTION=26, ELM_TIMES=27, ELM_DIVIDE=28, 
		ELM_PLUS=29, RAPP=30, EQ=31, DOUBLE_ARROW=32, ADD_ASGN=33, SUB_ASGN=34, 
		TIMES_ASGN=35, DIVIDE_ASGN=36, INV_DIVIDE_ASGN=37, REMAINDER_ASGN=38, 
		REM=39, POWER_ASGN=40, BITWISE_AND_ASGN=41, BITWISE_OR_ASGN=42, BITWISE_XOR_ASGN=43, 
		DOLLAR=44, LSR_ASGN=45, ASR_ASGN=46, ELLIPSE=47, ASL_ASGN=48, QUESTION_MARK=49, 
		WHILE=50, BEGIN=51, RETURN=52, IN=53, IF=54, ELSE_IF=55, ELSE=56, FOR=57, 
		CONST=58, USING=59, IMPORT=60, INSTANCE_OF=61, COLON=62, COMMA=63, DO=64, 
		IMPORT_ALL=65, EXPORT=66, MODULE=67, LET=68, END=69, END_LITERAL=70, BAREMODULE=71, 
		INF16=72, INF32=73, INF=74, MINUS_INF16=75, MINUS_INF32=76, MINUS_INF=77, 
		NAN16=78, NAN32=79, NAN=80, NOT=81, AND=82, BITWISE_AND=83, OR=84, BITWISE_OR=85, 
		LEFT_PARENTHESIS=86, RIGHT_PARENTHESIS=87, TRUE=88, FALSE=89, ABSTRACT=90, 
		SUB_TYPE=91, BITS_TYPE=92, TYPE_ALIAS=93, TYPE=94, IMMUTABLE=95, UNION=96, 
		FUNCTION=97, LEFT_BRACE=98, RIGHT_BRACE=99, LEFT_BRACKET=100, RIGHT_BRACKET=101, 
		INT8=102, UINT8=103, INT16=104, UINT16=105, INT32=106, UINT32=107, INT64=108, 
		UINT64=109, INT128=110, UINT128=111, BOOL=112, CHAR=113, FLOAT16=114, 
		FLOAT32=115, FLOAT64=116, REGEX=117, INT=118, BINARY=119, OCTAL=120, HEX=121, 
		FLOAT32_LITERAL=122, FLOAT64_LITERAL=123, FQN=124, ID=125, CHARACTER_LITERAL=126, 
		STRING=127, WS=128, COMMENT=129, LINE_COMMENT=130, SIZE=131;
	public static final int
		RULE_unit = 0, RULE_moduleDirective = 1, RULE_statement = 2, RULE_exp = 3, 
		RULE_typeExpression = 4, RULE_functionDeclaration = 5, RULE_parameters = 6, 
		RULE_parameter = 7, RULE_typeDeclaration = 8, RULE_fieldDeclaration = 9, 
		RULE_typeParameters = 10, RULE_typeParameter = 11, RULE_forStatement = 12, 
		RULE_whileStatement = 13, RULE_name = 14;
	public static final String[] ruleNames = {
		"unit", "moduleDirective", "statement", "exp", "typeExpression", "functionDeclaration", 
		"parameters", "parameter", "typeDeclaration", "fieldDeclaration", "typeParameters", 
		"typeParameter", "forStatement", "whileStatement", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'@'", "'.'", "';'", "'==='", "'=='", null, "'>'", "'<'", 
		null, null, "'-'", "'^'", "'//'", "'*'", "'/'", "'+'", "'.=='", null, 
		"'.>'", "'.<'", "'.>='", null, "'.-'", "'.^'", "'.//'", "'.*'", "'./'", 
		"'.+'", "'|>'", "'='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'\\='", 
		"'%='", "'%'", "'^='", "'&='", "'|='", "'$='", "'$'", "'>>>='", "'>>='", 
		"'...'", "'<<='", "'?'", "'while'", "'begin'", "'return'", "'in'", "'if'", 
		"'elseif'", "'else'", "'for'", "'const'", "'using'", "'import'", "'::'", 
		"':'", "','", "'do'", "'importall'", "'export'", "'module'", "'let'", 
		null, null, "'baremodule'", "'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", 
		"'-Inf32'", "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'!'", "'&&'", "'&'", 
		"'||'", "'|'", "'('", "')'", "'true'", "'false'", "'abstract'", "'<:'", 
		"'bitstype'", "'typealias'", "'type'", "'immutable'", "'Union'", "'function'", 
		"'{'", "'}'", "'['", "']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'", 
		"'Int32'", "'Uint32'", "'Int64'", "'Uint64'", "'Int128'", "'Uint128'", 
		"'Bool'", "'Char'", "'Float16'", "'Float32'", "'Float64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROW", "AT", "DOT", "SEMI_COLON", "IS", "EQUALS", "NOT_EQUAL", 
		"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ", 
		"MINUS", "EXPONENT", "FRACTION", "TIMES", "DIVIDE", "PLUS", "ELM_EQUALS", 
		"ELM_NOT_EQUAL", "ELM_GREATER_THAN", "ELM_LESS_THAN", "ELM_GREATER_THAN_OR_EQ", 
		"ELM_LESS_THAN_OR_EQ", "ELM_MINUS", "ELM_EXPONENT", "ELM_FRACTION", "ELM_TIMES", 
		"ELM_DIVIDE", "ELM_PLUS", "RAPP", "EQ", "DOUBLE_ARROW", "ADD_ASGN", "SUB_ASGN", 
		"TIMES_ASGN", "DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", "REM", 
		"POWER_ASGN", "BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN", 
		"DOLLAR", "LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", 
		"WHILE", "BEGIN", "RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", 
		"USING", "IMPORT", "INSTANCE_OF", "COLON", "COMMA", "DO", "IMPORT_ALL", 
		"EXPORT", "MODULE", "LET", "END", "END_LITERAL", "BAREMODULE", "INF16", 
		"INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", "NAN32", 
		"NAN", "NOT", "AND", "BITWISE_AND", "OR", "BITWISE_OR", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE", 
		"TYPE_ALIAS", "TYPE", "IMMUTABLE", "UNION", "FUNCTION", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "INT8", "UINT8", "INT16", 
		"UINT16", "INT32", "UINT32", "INT64", "UINT64", "INT128", "UINT128", "BOOL", 
		"CHAR", "FLOAT16", "FLOAT32", "FLOAT64", "REGEX", "INT", "BINARY", "OCTAL", 
		"HEX", "FLOAT32_LITERAL", "FLOAT64_LITERAL", "FQN", "ID", "CHARACTER_LITERAL", 
		"STRING", "WS", "COMMENT", "LINE_COMMENT", "SIZE"
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
	public String getGrammarFileName() { return "JuliaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuliaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0) );
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

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDirective; }
	 
		public ModuleDirectiveContext() { }
		public void copyFrom(ModuleDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingContext extends ModuleDirectiveContext {
		public TerminalNode USING() { return getToken(JuliaParser.USING, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public UsingContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImporttContext extends ModuleDirectiveContext {
		public TerminalNode IMPORT() { return getToken(JuliaParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ImporttContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterImportt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitImportt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitImportt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BareModuleDeclarationContext extends ModuleDirectiveContext {
		public TerminalNode BAREMODULE() { return getToken(JuliaParser.BAREMODULE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BareModuleDeclarationContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBareModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBareModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBareModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportAllContext extends ModuleDirectiveContext {
		public TerminalNode IMPORT_ALL() { return getToken(JuliaParser.IMPORT_ALL, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public ImportAllContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterImportAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitImportAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitImportAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportContext extends ModuleDirectiveContext {
		public TerminalNode EXPORT() { return getToken(JuliaParser.EXPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ExportContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuleDeclarationContext extends ModuleDirectiveContext {
		public TerminalNode MODULE() { return getToken(JuliaParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ModuleDeclarationContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moduleDirective);
		int _la;
		try {
			setState(77);
			switch (_input.LA(1)) {
			case USING:
				_localctx = new UsingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(USING);
				setState(36);
				match(ID);
				}
				break;
			case IMPORT:
				_localctx = new ImporttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(IMPORT);
				setState(38);
				match(ID);
				setState(39);
				match(COLON);
				setState(40);
				match(ID);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(41);
					match(COMMA);
					setState(42);
					match(ID);
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IMPORT_ALL:
				_localctx = new ImportAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(IMPORT_ALL);
				setState(49);
				match(ID);
				}
				break;
			case EXPORT:
				_localctx = new ExportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(EXPORT);
				setState(51);
				match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(52);
					match(COMMA);
					setState(53);
					match(ID);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MODULE:
				_localctx = new ModuleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(MODULE);
				setState(60);
				match(ID);
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61);
					statement();
					}
					}
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0) );
				setState(66);
				match(END);
				}
				break;
			case BAREMODULE:
				_localctx = new BareModuleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(BAREMODULE);
				setState(69);
				match(ID);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					statement();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0) );
				setState(75);
				match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public ModuleDirectiveContext moduleDirective() {
			return getRuleContext(ModuleDirectiveContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				moduleDirective();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				typeDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				functionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OctalContext extends ExpContext {
		public TerminalNode OCTAL() { return getToken(JuliaParser.OCTAL, 0); }
		public OctalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitOctal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitOctal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BITWISE_AND() { return getToken(JuliaParser.BITWISE_AND, 0); }
		public BitwiseAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitwiseAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitwiseAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitwiseAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmMinusContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_MINUS() { return getToken(JuliaParser.ELM_MINUS, 0); }
		public ElmMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseXorAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BITWISE_XOR_ASGN() { return getToken(JuliaParser.BITWISE_XOR_ASGN, 0); }
		public BitwiseXorAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitwiseXorAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitwiseXorAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitwiseXorAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnExpContext extends ExpContext {
		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(JuliaParser.ARROW, 0); }
		public LambdaContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivexpeAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIVIDE_ASGN() { return getToken(JuliaParser.DIVIDE_ASGN, 0); }
		public DivexpeAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterDivexpeAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitDivexpeAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitDivexpeAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExpContext {
		public TerminalNode LET() { return getToken(JuliaParser.LET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(JuliaParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JuliaParser.EQ, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LetContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExpContext {
		public TerminalNode BEGIN() { return getToken(JuliaParser.BEGIN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public BlockContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends ExpContext {
		public TerminalNode HEX() { return getToken(JuliaParser.HEX, 0); }
		public HexContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NanContext extends ExpContext {
		public TerminalNode NAN() { return getToken(JuliaParser.NAN, 0); }
		public NanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseAndAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BITWISE_AND_ASGN() { return getToken(JuliaParser.BITWISE_AND_ASGN, 0); }
		public BitwiseAndAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitwiseAndAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitwiseAndAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitwiseAndAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExpContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public IdentifierContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Inf32TypeContext extends ExpContext {
		public TerminalNode INF32() { return getToken(JuliaParser.INF32, 0); }
		public Inf32TypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInf32Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInf32Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInf32Type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicitTupleContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(JuliaParser.COMMA, 0); }
		public ImplicitTupleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterImplicitTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitImplicitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitImplicitTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(JuliaParser.IN, 0); }
		public InContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmPlusContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_PLUS() { return getToken(JuliaParser.ELM_PLUS, 0); }
		public ElmPlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tbc3Context extends ExpContext {
		public TerminalNode DOLLAR() { return getToken(JuliaParser.DOLLAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Tbc3Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTbc3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTbc3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTbc3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChainedContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(JuliaParser.SEMI_COLON, 0); }
		public ChainedContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterChained(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitChained(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitChained(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IS() { return getToken(JuliaParser.IS, 0); }
		public IsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tbc1Context extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ELLIPSE() { return getToken(JuliaParser.ELLIPSE, 0); }
		public Tbc1Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTbc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTbc1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTbc1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tbc2Context extends ExpContext {
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Tbc2Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTbc2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTbc2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTbc2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComprehensionContext extends ExpContext {
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public TerminalNode IN() { return getToken(JuliaParser.IN, 0); }
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public ComprehensionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitComprehension(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseOrAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BITWISE_OR_ASGN() { return getToken(JuliaParser.BITWISE_OR_ASGN, 0); }
		public BitwiseOrAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitwiseOrAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitwiseOrAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitwiseOrAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexContext extends ExpContext {
		public TerminalNode REGEX() { return getToken(JuliaParser.REGEX, 0); }
		public RegexContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeMarco1Context extends ExpContext {
		public TerminalNode AT() { return getToken(JuliaParser.AT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public InvokeMarco1Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInvokeMarco1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInvokeMarco1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInvokeMarco1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmEqualsContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_EQUALS() { return getToken(JuliaParser.ELM_EQUALS, 0); }
		public ElmEqualsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends ExpContext {
		public TerminalNode BINARY() { return getToken(JuliaParser.BINARY, 0); }
		public BinaryContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS_THAN_OR_EQ() { return getToken(JuliaParser.LESS_THAN_OR_EQ, 0); }
		public LessThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExpContext {
		public TerminalNode MINUS() { return getToken(JuliaParser.MINUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndLiteralContext extends ExpContext {
		public TerminalNode END_LITERAL() { return getToken(JuliaParser.END_LITERAL, 0); }
		public EndLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterEndLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitEndLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitEndLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(JuliaParser.MINUS, 0); }
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES_ASGN() { return getToken(JuliaParser.TIMES_ASGN, 0); }
		public TimesAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTimesAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTimesAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTimesAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public RangeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeMarco2Context extends ExpContext {
		public TerminalNode AT() { return getToken(JuliaParser.AT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public InvokeMarco2Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInvokeMarco2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInvokeMarco2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInvokeMarco2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainderAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode REMAINDER_ASGN() { return getToken(JuliaParser.REMAINDER_ASGN, 0); }
		public RemainderAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterRemainderAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitRemainderAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitRemainderAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleContext extends ExpContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public TupleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(JuliaParser.LESS_THAN, 0); }
		public LessThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmLessThanContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_LESS_THAN() { return getToken(JuliaParser.ELM_LESS_THAN, 0); }
		public ElmLessThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmFractionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_FRACTION() { return getToken(JuliaParser.ELM_FRACTION, 0); }
		public ElmFractionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmFraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Inf16TypeContext extends ExpContext {
		public TerminalNode INF16() { return getToken(JuliaParser.INF16, 0); }
		public Inf16TypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInf16Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInf16Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInf16Type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypedExpressionContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypedExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTypedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTypedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTypedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FractionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode FRACTION() { return getToken(JuliaParser.FRACTION, 0); }
		public FractionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmGreaterThanOrEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_GREATER_THAN_OR_EQ() { return getToken(JuliaParser.ELM_GREATER_THAN_OR_EQ, 0); }
		public ElmGreaterThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(JuliaParser.EQUALS, 0); }
		public EqualsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIndexContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(JuliaParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(JuliaParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(JuliaParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(JuliaParser.RIGHT_BRACKET, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ArrayIndexContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends ExpContext {
		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }
		public ReturnContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TtypeExpressionContext extends ExpContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TtypeExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTtypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTtypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTtypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TtContext extends ExpContext {
		public TerminalNode TRUE() { return getToken(JuliaParser.TRUE, 0); }
		public TtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolContext extends ExpContext {
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public SymbolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nan32Context extends ExpContext {
		public TerminalNode NAN32() { return getToken(JuliaParser.NAN32, 0); }
		public Nan32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNan32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNan32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNan32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExpContext {
		public TerminalNode CONST() { return getToken(JuliaParser.CONST, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ConstantContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmTimesContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_TIMES() { return getToken(JuliaParser.ELM_TIMES, 0); }
		public ElmTimesContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProjectContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DOT() { return getToken(JuliaParser.DOT, 0); }
		public ProjectContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryConditionalContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(JuliaParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public TernaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTernaryConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTernaryConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTernaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyFunctionContext extends ExpContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ApplyFunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterApplyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitApplyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitApplyFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LSRAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LSR_ASGN() { return getToken(JuliaParser.LSR_ASGN, 0); }
		public LSRAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterLSRAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitLSRAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitLSRAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CoeffientContext extends ExpContext {
		public TerminalNode INT() { return getToken(JuliaParser.INT, 0); }
		public TerminalNode FLOAT32() { return getToken(JuliaParser.FLOAT32, 0); }
		public TerminalNode FLOAT64() { return getToken(JuliaParser.FLOAT64, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public CoeffientContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterCoeffient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitCoeffient(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitCoeffient(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvDivexpeAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode INV_DIVIDE_ASGN() { return getToken(JuliaParser.INV_DIVIDE_ASGN, 0); }
		public InvDivexpeAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInvDivexpeAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInvDivexpeAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInvDivexpeAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmLessThanOrEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_LESS_THAN_OR_EQ() { return getToken(JuliaParser.ELM_LESS_THAN_OR_EQ, 0); }
		public ElmLessThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumerationContext extends ExpContext {
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(JuliaParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(JuliaParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(JuliaParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(JuliaParser.RIGHT_BRACKET, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public EnumerationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ffloat32Context extends ExpContext {
		public TerminalNode FLOAT32_LITERAL() { return getToken(JuliaParser.FLOAT32_LITERAL, 0); }
		public Ffloat32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFfloat32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFfloat32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFfloat32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(JuliaParser.EXPONENT, 0); }
		public ExponentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(JuliaParser.GREATER_THAN, 0); }
		public GreaterThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(JuliaParser.NOT_EQUAL, 0); }
		public NotEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASRAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ASR_ASGN() { return getToken(JuliaParser.ASR_ASGN, 0); }
		public ASRAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterASRAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitASRAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitASRAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JuliaParser.PLUS, 0); }
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER_THAN_OR_EQ() { return getToken(JuliaParser.GREATER_THAN_OR_EQ, 0); }
		public GreaterThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterGreaterThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitGreaterThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmDivideContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_DIVIDE() { return getToken(JuliaParser.ELM_DIVIDE, 0); }
		public ElmDivideContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInf32Context extends ExpContext {
		public TerminalNode MINUS_INF32() { return getToken(JuliaParser.MINUS_INF32, 0); }
		public MinusInf32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMinusInf32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMinusInf32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMinusInf32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ASLAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ASL_ASGN() { return getToken(JuliaParser.ASL_ASGN, 0); }
		public ASLAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterASLAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitASLAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitASLAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADD_ASGN() { return getToken(JuliaParser.ADD_ASGN, 0); }
		public AddAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAddAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAddAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAddAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nan16Context extends ExpContext {
		public TerminalNode NAN16() { return getToken(JuliaParser.NAN16, 0); }
		public Nan16Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNan16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNan16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNan16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FfContext extends ExpContext {
		public TerminalNode FALSE() { return getToken(JuliaParser.FALSE, 0); }
		public FfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharaacterContext extends ExpContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(JuliaParser.CHARACTER_LITERAL, 0); }
		public CharaacterContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterCharaacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitCharaacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitCharaacter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(JuliaParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousFunctionContext extends ExpContext {
		public TerminalNode DO() { return getToken(JuliaParser.DO, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public AnonymousFunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElmGreaterThanContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELM_GREATER_THAN() { return getToken(JuliaParser.ELM_GREATER_THAN, 0); }
		public ElmGreaterThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterElmGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitElmGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitElmGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB_ASGN() { return getToken(JuliaParser.SUB_ASGN, 0); }
		public MinusAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMinusAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMinusAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMinusAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(JuliaParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimesContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(JuliaParser.TIMES, 0); }
		public TimesContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtypeContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public SubtypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitSubtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(JuliaParser.AND, 0); }
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(JuliaParser.DIVIDE, 0); }
		public DivideContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerAssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POWER_ASGN() { return getToken(JuliaParser.POWER_ASGN, 0); }
		public PowerAssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterPowerAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitPowerAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitPowerAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfContext extends ExpContext {
		public TerminalNode INF() { return getToken(JuliaParser.INF, 0); }
		public InfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaryConditionalContext extends ExpContext {
		public TerminalNode IF() { return getToken(JuliaParser.IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(JuliaParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(JuliaParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(JuliaParser.ELSE, 0); }
		public NaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNaryConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNaryConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(JuliaParser.OR, 0); }
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwisOrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BITWISE_OR() { return getToken(JuliaParser.BITWISE_OR, 0); }
		public BitwisOrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitwisOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitwisOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitwisOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyPrecedngContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RAPP() { return getToken(JuliaParser.RAPP, 0); }
		public ApplyPrecedngContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterApplyPrecedng(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitApplyPrecedng(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitApplyPrecedng(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpContext {
		public TerminalNode INT() { return getToken(JuliaParser.INT, 0); }
		public IntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DOUBLE_ARROW() { return getToken(JuliaParser.DOUBLE_ARROW, 0); }
		public PairContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInf16Context extends ExpContext {
		public TerminalNode MINUS_INF16() { return getToken(JuliaParser.MINUS_INF16, 0); }
		public MinusInf16Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMinusInf16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMinusInf16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMinusInf16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryPlusContext extends ExpContext {
		public TerminalNode PLUS() { return getToken(JuliaParser.PLUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryPlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInfContext extends ExpContext {
		public TerminalNode MINUS_INF() { return getToken(JuliaParser.MINUS_INF, 0); }
		public MinusInfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMinusInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMinusInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMinusInf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ffloat64Context extends ExpContext {
		public TerminalNode FLOAT64_LITERAL() { return getToken(JuliaParser.FLOAT64_LITERAL, 0); }
		public Ffloat64Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFfloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFfloat64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFfloat64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemainderContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode REM() { return getToken(JuliaParser.REM, 0); }
		public RemainderContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterRemainder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitRemainder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitRemainder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketedContext extends ExpContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public BracketedContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBracketed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public AssignContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(MINUS);
				setState(89);
				exp(99);
				}
				break;
			case 2:
				{
				_localctx = new UnaryPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(PLUS);
				setState(91);
				exp(98);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(NOT);
				setState(93);
				exp(68);
				}
				break;
			case 4:
				{
				_localctx = new Tbc2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(COLON);
				setState(95);
				exp(36);
				}
				break;
			case 5:
				{
				_localctx = new Tbc3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(DOLLAR);
				setState(97);
				exp(35);
				}
				break;
			case 6:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(CONST);
				setState(99);
				match(ID);
				setState(100);
				match(EQ);
				setState(101);
				exp(14);
				}
				break;
			case 7:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(RETURN);
				setState(103);
				exp(3);
				}
				break;
			case 8:
				{
				_localctx = new ApplyFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				name();
				setState(106);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(105);
					typeParameters();
					}
				}

				setState(108);
				match(LEFT_PARENTHESIS);
				setState(118);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(109);
							exp(0);
							setState(110);
							match(COMMA);
							}
							} 
						}
						setState(116);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					setState(117);
					exp(0);
					}
				}

				setState(120);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 9:
				{
				_localctx = new EnumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						match(LEFT_BRACKET);
						setState(128);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(123);
								exp(0);
								setState(124);
								match(COMMA);
								}
								} 
							}
							setState(130);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(132);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
							{
							setState(131);
							exp(0);
							}
						}

						setState(134);
						match(RIGHT_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(LEFT_BRACKET);
				setState(140);
				exp(0);
				setState(141);
				match(FOR);
				setState(142);
				match(ID);
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(144);
				exp(0);
				setState(147);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(145);
					match(COLON);
					setState(146);
					exp(0);
					}
				}

				setState(149);
				match(RIGHT_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new CoeffientContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (FLOAT32 - 115)) | (1L << (FLOAT64 - 115)) | (1L << (INT - 115)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(157);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(152);
					match(ID);
					}
					break;
				case LEFT_PARENTHESIS:
					{
					setState(153);
					match(LEFT_PARENTHESIS);
					setState(154);
					exp(0);
					setState(155);
					match(RIGHT_PARENTHESIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				{
				_localctx = new EndLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(END_LITERAL);
				}
				break;
			case 13:
				{
				_localctx = new NaryConditionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(IF);
				setState(161);
				exp(0);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					{
					setState(162);
					statement();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF) {
					{
					{
					setState(168);
					match(ELSE_IF);
					setState(169);
					exp(0);
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
						{
						{
						setState(170);
						statement();
						}
						}
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(181);
					match(ELSE);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
						{
						{
						setState(182);
						statement();
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(190);
				match(END);
				}
				break;
			case 14:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(LET);
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						match(ID);
						setState(194);
						match(EQ);
						setState(195);
						exp(0);
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(201);
				statement();
				setState(202);
				match(END);
				}
				break;
			case 15:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(BEGIN);
				setState(205);
				exp(0);
				setState(206);
				match(END);
				}
				break;
			case 16:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(LEFT_PARENTHESIS);
				setState(209);
				exp(0);
				setState(210);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 17:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(LEFT_PARENTHESIS);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(213);
						exp(0);
						setState(214);
						match(COMMA);
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(222);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(221);
					exp(0);
					}
				}

				setState(224);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 18:
				{
				_localctx = new AnonymousFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(DO);
				setState(234);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(226);
							match(ID);
							setState(227);
							match(COMMA);
							}
							} 
						}
						setState(232);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(233);
					match(ID);
					}
					break;
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					{
					setState(236);
					statement();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(END);
				}
				break;
			case 19:
				{
				_localctx = new InvokeMarco1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(AT);
				setState(244);
				name();
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						exp(0);
						}
						} 
					}
					setState(250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 20:
				{
				_localctx = new InvokeMarco2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(AT);
				setState(252);
				name();
				setState(253);
				match(LEFT_PARENTHESIS);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(254);
						exp(0);
						setState(255);
						match(COMMA);
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(263);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(262);
					exp(0);
					}
				}

				setState(265);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 21:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(ID);
				}
				break;
			case 22:
				{
				_localctx = new RegexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(REGEX);
				}
				break;
			case 23:
				{
				_localctx = new TtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(TRUE);
				}
				break;
			case 24:
				{
				_localctx = new FfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(FALSE);
				}
				break;
			case 25:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(INT);
				}
				break;
			case 26:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(BINARY);
				}
				break;
			case 27:
				{
				_localctx = new OctalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(OCTAL);
				}
				break;
			case 28:
				{
				_localctx = new HexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(HEX);
				}
				break;
			case 29:
				{
				_localctx = new Ffloat32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(FLOAT32_LITERAL);
				}
				break;
			case 30:
				{
				_localctx = new Ffloat64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(FLOAT64_LITERAL);
				}
				break;
			case 31:
				{
				_localctx = new CharaacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(CHARACTER_LITERAL);
				}
				break;
			case 32:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(STRING);
				}
				break;
			case 33:
				{
				_localctx = new SymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(COLON);
				setState(280);
				match(ID);
				}
				break;
			case 34:
				{
				_localctx = new Inf16TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(INF16);
				}
				break;
			case 35:
				{
				_localctx = new Inf32TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(INF32);
				}
				break;
			case 36:
				{
				_localctx = new InfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(INF);
				}
				break;
			case 37:
				{
				_localctx = new MinusInf16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(MINUS_INF16);
				}
				break;
			case 38:
				{
				_localctx = new MinusInf32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(MINUS_INF32);
				}
				break;
			case 39:
				{
				_localctx = new MinusInfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(MINUS_INF);
				}
				break;
			case 40:
				{
				_localctx = new Nan16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(NAN16);
				}
				break;
			case 41:
				{
				_localctx = new Nan32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(NAN32);
				}
				break;
			case 42:
				{
				_localctx = new NanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(NAN);
				}
				break;
			case 43:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(RETURN);
				}
				break;
			case 44:
				{
				_localctx = new TtypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				typeExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(476);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(294);
						if (!(precpred(_ctx, 97))) throw new FailedPredicateException(this, "precpred(_ctx, 97)");
						setState(295);
						match(QUESTION_MARK);
						setState(296);
						exp(0);
						setState(297);
						match(COLON);
						setState(298);
						exp(98);
						}
						break;
					case 2:
						{
						_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(300);
						if (!(precpred(_ctx, 92))) throw new FailedPredicateException(this, "precpred(_ctx, 92)");
						setState(301);
						match(EXPONENT);
						setState(302);
						exp(92);
						}
						break;
					case 3:
						{
						_localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(303);
						if (!(precpred(_ctx, 90))) throw new FailedPredicateException(this, "precpred(_ctx, 90)");
						setState(304);
						match(FRACTION);
						setState(305);
						exp(91);
						}
						break;
					case 4:
						{
						_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(306);
						if (!(precpred(_ctx, 89))) throw new FailedPredicateException(this, "precpred(_ctx, 89)");
						setState(307);
						match(TIMES);
						setState(308);
						exp(90);
						}
						break;
					case 5:
						{
						_localctx = new RemainderContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(309);
						if (!(precpred(_ctx, 88))) throw new FailedPredicateException(this, "precpred(_ctx, 88)");
						setState(310);
						match(REM);
						setState(311);
						exp(89);
						}
						break;
					case 6:
						{
						_localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(312);
						if (!(precpred(_ctx, 87))) throw new FailedPredicateException(this, "precpred(_ctx, 87)");
						setState(313);
						match(DIVIDE);
						setState(314);
						exp(88);
						}
						break;
					case 7:
						{
						_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(315);
						if (!(precpred(_ctx, 86))) throw new FailedPredicateException(this, "precpred(_ctx, 86)");
						setState(316);
						match(PLUS);
						setState(317);
						exp(87);
						}
						break;
					case 8:
						{
						_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(318);
						if (!(precpred(_ctx, 85))) throw new FailedPredicateException(this, "precpred(_ctx, 85)");
						setState(319);
						match(MINUS);
						setState(320);
						exp(86);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(321);
						if (!(precpred(_ctx, 84))) throw new FailedPredicateException(this, "precpred(_ctx, 84)");
						setState(322);
						match(GREATER_THAN);
						setState(323);
						exp(85);
						}
						break;
					case 10:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(324);
						if (!(precpred(_ctx, 83))) throw new FailedPredicateException(this, "precpred(_ctx, 83)");
						setState(325);
						match(LESS_THAN);
						setState(326);
						exp(84);
						}
						break;
					case 11:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(327);
						if (!(precpred(_ctx, 82))) throw new FailedPredicateException(this, "precpred(_ctx, 82)");
						setState(328);
						match(GREATER_THAN_OR_EQ);
						setState(329);
						exp(83);
						}
						break;
					case 12:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(330);
						if (!(precpred(_ctx, 81))) throw new FailedPredicateException(this, "precpred(_ctx, 81)");
						setState(331);
						match(LESS_THAN_OR_EQ);
						setState(332);
						exp(82);
						}
						break;
					case 13:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(333);
						if (!(precpred(_ctx, 80))) throw new FailedPredicateException(this, "precpred(_ctx, 80)");
						setState(334);
						match(EQUALS);
						setState(335);
						exp(81);
						}
						break;
					case 14:
						{
						_localctx = new ElmFractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(336);
						if (!(precpred(_ctx, 79))) throw new FailedPredicateException(this, "precpred(_ctx, 79)");
						setState(337);
						match(ELM_FRACTION);
						setState(338);
						exp(80);
						}
						break;
					case 15:
						{
						_localctx = new ElmTimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(339);
						if (!(precpred(_ctx, 78))) throw new FailedPredicateException(this, "precpred(_ctx, 78)");
						setState(340);
						match(ELM_TIMES);
						setState(341);
						exp(79);
						}
						break;
					case 16:
						{
						_localctx = new ElmDivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(342);
						if (!(precpred(_ctx, 77))) throw new FailedPredicateException(this, "precpred(_ctx, 77)");
						setState(343);
						match(ELM_DIVIDE);
						setState(344);
						exp(78);
						}
						break;
					case 17:
						{
						_localctx = new ElmPlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(345);
						if (!(precpred(_ctx, 76))) throw new FailedPredicateException(this, "precpred(_ctx, 76)");
						setState(346);
						match(ELM_PLUS);
						setState(347);
						exp(77);
						}
						break;
					case 18:
						{
						_localctx = new ElmMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(348);
						if (!(precpred(_ctx, 75))) throw new FailedPredicateException(this, "precpred(_ctx, 75)");
						setState(349);
						match(ELM_MINUS);
						setState(350);
						exp(76);
						}
						break;
					case 19:
						{
						_localctx = new ElmGreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(351);
						if (!(precpred(_ctx, 74))) throw new FailedPredicateException(this, "precpred(_ctx, 74)");
						setState(352);
						match(ELM_GREATER_THAN);
						setState(353);
						exp(75);
						}
						break;
					case 20:
						{
						_localctx = new ElmLessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(354);
						if (!(precpred(_ctx, 73))) throw new FailedPredicateException(this, "precpred(_ctx, 73)");
						setState(355);
						match(ELM_LESS_THAN);
						setState(356);
						exp(74);
						}
						break;
					case 21:
						{
						_localctx = new ElmGreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(357);
						if (!(precpred(_ctx, 72))) throw new FailedPredicateException(this, "precpred(_ctx, 72)");
						setState(358);
						match(ELM_GREATER_THAN_OR_EQ);
						setState(359);
						exp(73);
						}
						break;
					case 22:
						{
						_localctx = new ElmLessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(360);
						if (!(precpred(_ctx, 71))) throw new FailedPredicateException(this, "precpred(_ctx, 71)");
						setState(361);
						match(ELM_LESS_THAN_OR_EQ);
						setState(362);
						exp(72);
						}
						break;
					case 23:
						{
						_localctx = new ElmEqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(363);
						if (!(precpred(_ctx, 70))) throw new FailedPredicateException(this, "precpred(_ctx, 70)");
						setState(364);
						match(ELM_EQUALS);
						setState(365);
						exp(71);
						}
						break;
					case 24:
						{
						_localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(366);
						if (!(precpred(_ctx, 69))) throw new FailedPredicateException(this, "precpred(_ctx, 69)");
						setState(367);
						match(SUB_TYPE);
						setState(368);
						exp(70);
						}
						break;
					case 25:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(369);
						if (!(precpred(_ctx, 67))) throw new FailedPredicateException(this, "precpred(_ctx, 67)");
						setState(370);
						match(AND);
						setState(371);
						exp(68);
						}
						break;
					case 26:
						{
						_localctx = new BitwiseAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(372);
						if (!(precpred(_ctx, 66))) throw new FailedPredicateException(this, "precpred(_ctx, 66)");
						setState(373);
						match(BITWISE_AND);
						setState(374);
						exp(67);
						}
						break;
					case 27:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(375);
						if (!(precpred(_ctx, 65))) throw new FailedPredicateException(this, "precpred(_ctx, 65)");
						setState(376);
						match(OR);
						setState(377);
						exp(66);
						}
						break;
					case 28:
						{
						_localctx = new BitwisOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(378);
						if (!(precpred(_ctx, 64))) throw new FailedPredicateException(this, "precpred(_ctx, 64)");
						setState(379);
						match(BITWISE_OR);
						setState(380);
						exp(65);
						}
						break;
					case 29:
						{
						_localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(381);
						if (!(precpred(_ctx, 57))) throw new FailedPredicateException(this, "precpred(_ctx, 57)");
						setState(382);
						match(NOT_EQUAL);
						setState(383);
						exp(58);
						}
						break;
					case 30:
						{
						_localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(384);
						if (!(precpred(_ctx, 56))) throw new FailedPredicateException(this, "precpred(_ctx, 56)");
						setState(385);
						match(EQ);
						setState(386);
						exp(57);
						}
						break;
					case 31:
						{
						_localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(387);
						if (!(precpred(_ctx, 55))) throw new FailedPredicateException(this, "precpred(_ctx, 55)");
						setState(388);
						match(ADD_ASGN);
						setState(389);
						exp(56);
						}
						break;
					case 32:
						{
						_localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(390);
						if (!(precpred(_ctx, 54))) throw new FailedPredicateException(this, "precpred(_ctx, 54)");
						setState(391);
						match(SUB_ASGN);
						setState(392);
						exp(55);
						}
						break;
					case 33:
						{
						_localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(393);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(394);
						match(TIMES_ASGN);
						setState(395);
						exp(54);
						}
						break;
					case 34:
						{
						_localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(396);
						if (!(precpred(_ctx, 52))) throw new FailedPredicateException(this, "precpred(_ctx, 52)");
						setState(397);
						match(DIVIDE_ASGN);
						setState(398);
						exp(53);
						}
						break;
					case 35:
						{
						_localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(399);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(400);
						match(INV_DIVIDE_ASGN);
						setState(401);
						exp(52);
						}
						break;
					case 36:
						{
						_localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(402);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(403);
						match(REMAINDER_ASGN);
						setState(404);
						exp(51);
						}
						break;
					case 37:
						{
						_localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(405);
						if (!(precpred(_ctx, 49))) throw new FailedPredicateException(this, "precpred(_ctx, 49)");
						setState(406);
						match(POWER_ASGN);
						setState(407);
						exp(50);
						}
						break;
					case 38:
						{
						_localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(408);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(409);
						match(BITWISE_AND_ASGN);
						setState(410);
						exp(49);
						}
						break;
					case 39:
						{
						_localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(411);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(412);
						match(BITWISE_OR_ASGN);
						setState(413);
						exp(48);
						}
						break;
					case 40:
						{
						_localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(414);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(415);
						match(BITWISE_XOR_ASGN);
						setState(416);
						exp(47);
						}
						break;
					case 41:
						{
						_localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(417);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(418);
						match(LSR_ASGN);
						setState(419);
						exp(46);
						}
						break;
					case 42:
						{
						_localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(420);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(421);
						match(ASR_ASGN);
						setState(422);
						exp(45);
						}
						break;
					case 43:
						{
						_localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(423);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(424);
						match(ASL_ASGN);
						setState(425);
						exp(44);
						}
						break;
					case 44:
						{
						_localctx = new PairContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(426);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(427);
						match(DOUBLE_ARROW);
						setState(428);
						exp(43);
						}
						break;
					case 45:
						{
						_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(429);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(430);
						match(COLON);
						setState(431);
						exp(42);
						}
						break;
					case 46:
						{
						_localctx = new InContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(432);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(433);
						match(IN);
						setState(434);
						exp(41);
						}
						break;
					case 47:
						{
						_localctx = new IsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(435);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(436);
						match(IS);
						setState(437);
						exp(40);
						}
						break;
					case 48:
						{
						_localctx = new ChainedContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(438);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(439);
						match(SEMI_COLON);
						setState(440);
						exp(39);
						}
						break;
					case 49:
						{
						_localctx = new ApplyPrecedngContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(441);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(442);
						match(RAPP);
						setState(443);
						exp(35);
						}
						break;
					case 50:
						{
						_localctx = new LambdaContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(444);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(445);
						match(ARROW);
						setState(446);
						exp(33);
						}
						break;
					case 51:
						{
						_localctx = new ProjectContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(447);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(448);
						match(DOT);
						setState(449);
						exp(29);
						}
						break;
					case 52:
						{
						_localctx = new ImplicitTupleContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(450);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(451);
						match(COMMA);
						setState(452);
						exp(5);
						}
						break;
					case 53:
						{
						_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(453);
						if (!(precpred(_ctx, 91))) throw new FailedPredicateException(this, "precpred(_ctx, 91)");
						setState(454);
						match(INSTANCE_OF);
						setState(455);
						typeExpression();
						}
						break;
					case 54:
						{
						_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(456);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(457);
						match(ELLIPSE);
						}
						break;
					case 55:
						{
						_localctx = new ArrayIndexContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(458);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(472); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(459);
								match(LEFT_BRACKET);
								setState(465);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(460);
										exp(0);
										setState(461);
										match(COMMA);
										}
										} 
									}
									setState(467);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
								}
								setState(469);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
									{
									setState(468);
									exp(0);
									}
								}

								setState(471);
								match(RIGHT_BRACKET);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(474); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class TypeExpressionContext extends ParserRuleContext {
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
	 
		public TypeExpressionContext() { }
		public void copyFrom(TypeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends TypeExpressionContext {
		public TerminalNode BOOL() { return getToken(JuliaParser.BOOL, 0); }
		public BoolContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParametricTypeContext extends TypeExpressionContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(JuliaParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(JuliaParser.RIGHT_BRACE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ParametricTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterParametricType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitParametricType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserDefinedTypeContext extends TypeExpressionContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public UserDefinedTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUserDefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUserDefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUserDefinedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float32Context extends TypeExpressionContext {
		public TerminalNode FLOAT32() { return getToken(JuliaParser.FLOAT32, 0); }
		public Float32Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFloat32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFloat32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFloat32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float64Context extends TypeExpressionContext {
		public TerminalNode FLOAT64() { return getToken(JuliaParser.FLOAT64, 0); }
		public Float64Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFloat64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFloat64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int16Context extends TypeExpressionContext {
		public TerminalNode INT16() { return getToken(JuliaParser.INT16, 0); }
		public Int16Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float16Context extends TypeExpressionContext {
		public TerminalNode FLOAT16() { return getToken(JuliaParser.FLOAT16, 0); }
		public Float16Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterFloat16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitFloat16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitFloat16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint128Context extends TypeExpressionContext {
		public TerminalNode UINT128() { return getToken(JuliaParser.UINT128, 0); }
		public Uint128Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUint128(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUint128(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUint128(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int32Context extends TypeExpressionContext {
		public TerminalNode INT32() { return getToken(JuliaParser.INT32, 0); }
		public Int32Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int64Context extends TypeExpressionContext {
		public TerminalNode INT64() { return getToken(JuliaParser.INT64, 0); }
		public Int64Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int8Context extends TypeExpressionContext {
		public TerminalNode INT8() { return getToken(JuliaParser.INT8, 0); }
		public Int8Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int128Context extends TypeExpressionContext {
		public TerminalNode INT128() { return getToken(JuliaParser.INT128, 0); }
		public Int128Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInt128(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInt128(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInt128(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends TypeExpressionContext {
		public TerminalNode CHAR() { return getToken(JuliaParser.CHAR, 0); }
		public CharContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint64Context extends TypeExpressionContext {
		public TerminalNode UINT64() { return getToken(JuliaParser.UINT64, 0); }
		public Uint64Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUint64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUint64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUint64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint32Context extends TypeExpressionContext {
		public TerminalNode UINT32() { return getToken(JuliaParser.UINT32, 0); }
		public Uint32Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUint32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUint32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUint32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint8Context extends TypeExpressionContext {
		public TerminalNode UINT8() { return getToken(JuliaParser.UINT8, 0); }
		public Uint8Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUint8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUint8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUint8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Uint16Context extends TypeExpressionContext {
		public TerminalNode UINT16() { return getToken(JuliaParser.UINT16, 0); }
		public Uint16Context(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUint16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUint16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUint16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionTypeContext extends TypeExpressionContext {
		public TerminalNode UNION() { return getToken(JuliaParser.UNION, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(JuliaParser.LEFT_BRACE, 0); }
		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}
		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(JuliaParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public UnionTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeExpression);
		int _la;
		try {
			setState(522);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new Int8Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(INT8);
				}
				break;
			case 2:
				_localctx = new Uint8Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(UINT8);
				}
				break;
			case 3:
				_localctx = new Int16Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(INT16);
				}
				break;
			case 4:
				_localctx = new Uint16Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(UINT16);
				}
				break;
			case 5:
				_localctx = new Int32Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				match(INT32);
				}
				break;
			case 6:
				_localctx = new Uint32Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				match(UINT32);
				}
				break;
			case 7:
				_localctx = new Int64Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(487);
				match(INT64);
				}
				break;
			case 8:
				_localctx = new Uint64Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(488);
				match(UINT64);
				}
				break;
			case 9:
				_localctx = new Int128Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(489);
				match(INT128);
				}
				break;
			case 10:
				_localctx = new Uint128Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(490);
				match(UINT128);
				}
				break;
			case 11:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(491);
				match(BOOL);
				}
				break;
			case 12:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(492);
				match(CHAR);
				}
				break;
			case 13:
				_localctx = new Float16Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(493);
				match(FLOAT16);
				}
				break;
			case 14:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(494);
				match(FLOAT32);
				}
				break;
			case 15:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(495);
				match(FLOAT64);
				}
				break;
			case 16:
				_localctx = new UnionTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(496);
				match(UNION);
				setState(497);
				match(LEFT_BRACE);
				setState(498);
				typeExpression();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(499);
					match(COMMA);
					setState(500);
					typeExpression();
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(506);
				match(RIGHT_BRACE);
				}
				break;
			case 17:
				_localctx = new ParametricTypeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(508);
				match(ID);
				setState(509);
				match(LEFT_BRACE);
				setState(518);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(510);
					exp(0);
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(511);
						match(COMMA);
						setState(512);
						exp(0);
						}
						}
						setState(517);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(520);
				match(RIGHT_BRACE);
				}
				break;
			case 18:
				_localctx = new UserDefinedTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(521);
				match(ID);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompactFunctionDeclarationContext extends FunctionDeclarationContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public CompactFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterCompactFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitCompactFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitCompactFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeneralFunctionDeclarationContext extends FunctionDeclarationContext {
		public TerminalNode FUNCTION() { return getToken(JuliaParser.FUNCTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public GeneralFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterGeneralFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitGeneralFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitGeneralFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			setState(546);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CompactFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				name();
				setState(526);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(525);
					typeParameters();
					}
				}

				setState(528);
				parameters();
				setState(529);
				match(EQ);
				setState(530);
				exp(0);
				}
				break;
			case FUNCTION:
				_localctx = new GeneralFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(FUNCTION);
				setState(533);
				name();
				setState(535);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(534);
					typeParameters();
					}
				}

				setState(537);
				parameters();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					{
					setState(538);
					statement();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(END);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PparametersContext extends ParametersContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(JuliaParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(JuliaParser.SEMI_COLON, i);
		}
		public PparametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterPparameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitPparameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitPparameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			_localctx = new PparametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(LEFT_PARENTHESIS);
			setState(557);
			_la = _input.LA(1);
			if (_la==INSTANCE_OF || _la==ID) {
				{
				setState(549);
				parameter(0);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==COMMA) {
					{
					{
					setState(550);
					_la = _input.LA(1);
					if ( !(_la==SEMI_COLON || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(551);
					parameter(0);
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(559);
			match(RIGHT_PARENTHESIS);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NamedTypedParamContext extends ParameterContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NamedTypedParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNamedTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNamedTypedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNamedTypedParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousTypedParamContext extends ParameterContext {
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AnonymousTypedParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAnonymousTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAnonymousTypedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAnonymousTypedParam(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarargContext extends ParameterContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode ELLIPSE() { return getToken(JuliaParser.ELLIPSE, 0); }
		public VarargContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterVararg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitVararg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitVararg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedParamContext extends ParameterContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NamedParamContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNamedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNamedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		return parameter(0);
	}

	private ParameterContext parameter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterContext _localctx = new ParameterContext(_ctx, _parentState);
		ParameterContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_parameter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				_localctx = new NamedTypedParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(562);
				match(ID);
				setState(563);
				match(INSTANCE_OF);
				setState(564);
				typeExpression();
				setState(567);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(565);
					match(EQ);
					setState(566);
					exp(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new AnonymousTypedParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(569);
				match(INSTANCE_OF);
				setState(570);
				typeExpression();
				setState(573);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(571);
					match(EQ);
					setState(572);
					exp(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new NamedParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(575);
				match(ID);
				setState(578);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(576);
					match(EQ);
					setState(577);
					exp(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(586);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarargContext(new ParameterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_parameter);
					setState(582);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(583);
					match(ELLIPSE);
					}
					} 
				}
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
	 
		public TypeDeclarationContext() { }
		public void copyFrom(TypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MutableTypeDeclarationContext extends TypeDeclarationContext {
		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public MutableTypeDeclarationContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterMutableTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitMutableTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitMutableTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImmutableTypeDeclarationContext extends TypeDeclarationContext {
		public TerminalNode IMMUTABLE() { return getToken(JuliaParser.IMMUTABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ImmutableTypeDeclarationContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterImmutableTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitImmutableTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitImmutableTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbstractTypeContext extends TypeDeclarationContext {
		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public AbstractTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAbstractType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAbstractType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitsSubtypeContext extends TypeDeclarationContext {
		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }
		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public BitsSubtypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitsSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitsSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitsSubtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAliasContext extends TypeDeclarationContext {
		public TerminalNode TYPE_ALIAS() { return getToken(JuliaParser.TYPE_ALIAS, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitsTtypeContext extends TypeDeclarationContext {
		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }
		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public BitsTtypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterBitsTtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitBitsTtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitBitsTtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new TypeAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(TYPE_ALIAS);
				setState(590);
				match(ID);
				setState(592);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(591);
					typeParameters();
					}
				}

				setState(594);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AbstractTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(ABSTRACT);
				setState(596);
				match(ID);
				setState(598);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(597);
					typeParameters();
					}
				}

				setState(605);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(600);
					match(SUB_TYPE);
					setState(601);
					match(ID);
					setState(603);
					_la = _input.LA(1);
					if (_la==LEFT_BRACE) {
						{
						setState(602);
						typeParameters();
						}
					}

					}
				}

				}
				break;
			case 3:
				_localctx = new BitsSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(607);
				match(BITS_TYPE);
				setState(608);
				match(SIZE);
				setState(609);
				match(ID);
				setState(610);
				match(SUB_TYPE);
				setState(611);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BitsTtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(612);
				match(BITS_TYPE);
				setState(613);
				match(SIZE);
				setState(614);
				match(ID);
				}
				break;
			case 5:
				_localctx = new MutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
				match(TYPE);
				setState(616);
				match(ID);
				setState(618);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(617);
					typeParameters();
					}
				}

				setState(622);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(620);
					match(SUB_TYPE);
					setState(621);
					match(ID);
					}
				}

				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						fieldDeclaration();
						}
						} 
					}
					setState(629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(630);
					functionDeclaration();
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				match(END);
				}
				break;
			case 6:
				_localctx = new ImmutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(637);
				match(IMMUTABLE);
				setState(638);
				match(ID);
				setState(640);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(639);
					typeParameters();
					}
				}

				setState(647);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(642);
					match(SUB_TYPE);
					setState(643);
					match(ID);
					setState(645);
					_la = _input.LA(1);
					if (_la==LEFT_BRACE) {
						{
						setState(644);
						typeParameters();
						}
					}

					}
				}

				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(649);
						fieldDeclaration();
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(655);
					functionDeclaration();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				match(END);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
	 
		public FieldDeclarationContext() { }
		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UntypedFieldDeclarationContext extends FieldDeclarationContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public UntypedFieldDeclarationContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterUntypedFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitUntypedFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitUntypedFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypedFieldDeclarationContext extends FieldDeclarationContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypedFieldDeclarationContext(FieldDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTypedFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTypedFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTypedFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		try {
			setState(668);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new TypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(ID);
				setState(665);
				match(INSTANCE_OF);
				setState(666);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new UntypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				match(ID);
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

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
	 
		public TypeParametersContext() { }
		public void copyFrom(TypeParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TtypeParametersContext extends TypeParametersContext {
		public TerminalNode LEFT_BRACE() { return getToken(JuliaParser.LEFT_BRACE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(JuliaParser.RIGHT_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public TtypeParametersContext(TypeParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTtypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTtypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTtypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			_localctx = new TtypeParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(LEFT_BRACE);
			setState(671);
			typeParameter();
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(672);
				match(COMMA);
				setState(673);
				typeParameter();
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(RIGHT_BRACE);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	 
		public TypeParameterContext() { }
		public void copyFrom(TypeParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstanceContext extends TypeParameterContext {
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public InstanceContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends TypeParameterContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpressionContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedSubtypeContext extends TypeParameterContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public NamedSubtypeContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNamedSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNamedSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNamedSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeParameter);
		try {
			setState(687);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new NamedSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(ID);
				setState(682);
				match(SUB_TYPE);
				setState(683);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new InstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(INSTANCE_OF);
				setState(685);
				typeExpression();
				}
				break;
			case 3:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(686);
				exp(0);
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForEqContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> COLON() { return getTokens(JuliaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JuliaParser.COLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForEqContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterForEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitForEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitForEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(JuliaParser.IN, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForInContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterForIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitForIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitForIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			setState(721);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new ForEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(FOR);
				setState(690);
				exp(0);
				setState(691);
				match(EQ);
				setState(692);
				exp(0);
				setState(695);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(693);
					match(COLON);
					setState(694);
					exp(0);
					}
					break;
				}
				setState(699);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(697);
					match(COLON);
					setState(698);
					exp(0);
					}
					break;
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					{
					setState(701);
					statement();
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				match(END);
				}
				break;
			case 2:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(FOR);
				setState(710);
				exp(0);
				setState(711);
				match(IN);
				setState(712);
				exp(0);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					{
					setState(713);
					statement();
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				match(END);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JuliaParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(WHILE);
			setState(724);
			exp(0);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << PLUS) | (1L << DOLLAR) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DO - 64)) | (1L << (IMPORT_ALL - 64)) | (1L << (EXPORT - 64)) | (1L << (MODULE - 64)) | (1L << (LET - 64)) | (1L << (END_LITERAL - 64)) | (1L << (BAREMODULE - 64)) | (1L << (INF16 - 64)) | (1L << (INF32 - 64)) | (1L << (INF - 64)) | (1L << (MINUS_INF16 - 64)) | (1L << (MINUS_INF32 - 64)) | (1L << (MINUS_INF - 64)) | (1L << (NAN16 - 64)) | (1L << (NAN32 - 64)) | (1L << (NAN - 64)) | (1L << (NOT - 64)) | (1L << (LEFT_PARENTHESIS - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_BRACKET - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (STRING - 64)))) != 0)) {
				{
				{
				setState(725);
				statement();
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731);
			match(END);
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
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NnameContext extends NameContext {
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JuliaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JuliaParser.DOT, i);
		}
		public NnameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterNname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitNname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitNname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			int _alt;
			_localctx = new NnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(ID);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(734);
					match(DOT);
					setState(735);
					match(ID);
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 7:
			return parameter_sempred((ParameterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 97);
		case 1:
			return precpred(_ctx, 92);
		case 2:
			return precpred(_ctx, 90);
		case 3:
			return precpred(_ctx, 89);
		case 4:
			return precpred(_ctx, 88);
		case 5:
			return precpred(_ctx, 87);
		case 6:
			return precpred(_ctx, 86);
		case 7:
			return precpred(_ctx, 85);
		case 8:
			return precpred(_ctx, 84);
		case 9:
			return precpred(_ctx, 83);
		case 10:
			return precpred(_ctx, 82);
		case 11:
			return precpred(_ctx, 81);
		case 12:
			return precpred(_ctx, 80);
		case 13:
			return precpred(_ctx, 79);
		case 14:
			return precpred(_ctx, 78);
		case 15:
			return precpred(_ctx, 77);
		case 16:
			return precpred(_ctx, 76);
		case 17:
			return precpred(_ctx, 75);
		case 18:
			return precpred(_ctx, 74);
		case 19:
			return precpred(_ctx, 73);
		case 20:
			return precpred(_ctx, 72);
		case 21:
			return precpred(_ctx, 71);
		case 22:
			return precpred(_ctx, 70);
		case 23:
			return precpred(_ctx, 69);
		case 24:
			return precpred(_ctx, 67);
		case 25:
			return precpred(_ctx, 66);
		case 26:
			return precpred(_ctx, 65);
		case 27:
			return precpred(_ctx, 64);
		case 28:
			return precpred(_ctx, 57);
		case 29:
			return precpred(_ctx, 56);
		case 30:
			return precpred(_ctx, 55);
		case 31:
			return precpred(_ctx, 54);
		case 32:
			return precpred(_ctx, 53);
		case 33:
			return precpred(_ctx, 52);
		case 34:
			return precpred(_ctx, 51);
		case 35:
			return precpred(_ctx, 50);
		case 36:
			return precpred(_ctx, 49);
		case 37:
			return precpred(_ctx, 48);
		case 38:
			return precpred(_ctx, 47);
		case 39:
			return precpred(_ctx, 46);
		case 40:
			return precpred(_ctx, 45);
		case 41:
			return precpred(_ctx, 44);
		case 42:
			return precpred(_ctx, 43);
		case 43:
			return precpred(_ctx, 42);
		case 44:
			return precpred(_ctx, 41);
		case 45:
			return precpred(_ctx, 40);
		case 46:
			return precpred(_ctx, 39);
		case 47:
			return precpred(_ctx, 38);
		case 48:
			return precpred(_ctx, 34);
		case 49:
			return precpred(_ctx, 33);
		case 50:
			return precpred(_ctx, 28);
		case 51:
			return precpred(_ctx, 4);
		case 52:
			return precpred(_ctx, 91);
		case 53:
			return precpred(_ctx, 37);
		case 54:
			return precpred(_ctx, 31);
		}
		return true;
	}
	private boolean parameter_sempred(ParameterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0085\u02e8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\6\3A\n\3\r\3\16"+
		"\3B\3\3\3\3\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\5\3P\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\3\5\7\5s\n\5\f\5\16"+
		"\5v\13\5\3\5\5\5y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0081\n\5\f\5\16\5\u0084"+
		"\13\5\3\5\5\5\u0087\n\5\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0"+
		"\n\5\3\5\3\5\3\5\3\5\7\5\u00a6\n\5\f\5\16\5\u00a9\13\5\3\5\3\5\3\5\7\5"+
		"\u00ae\n\5\f\5\16\5\u00b1\13\5\7\5\u00b3\n\5\f\5\16\5\u00b6\13\5\3\5\3"+
		"\5\7\5\u00ba\n\5\f\5\16\5\u00bd\13\5\5\5\u00bf\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u00c7\n\5\f\5\16\5\u00ca\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00db\n\5\f\5\16\5\u00de\13\5\3\5\5\5"+
		"\u00e1\n\5\3\5\3\5\3\5\3\5\7\5\u00e7\n\5\f\5\16\5\u00ea\13\5\3\5\5\5\u00ed"+
		"\n\5\3\5\7\5\u00f0\n\5\f\5\16\5\u00f3\13\5\3\5\3\5\3\5\3\5\7\5\u00f9\n"+
		"\5\f\5\16\5\u00fc\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0104\n\5\f\5\16\5"+
		"\u0107\13\5\3\5\5\5\u010a\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0127\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u01d2\n"+
		"\5\f\5\16\5\u01d5\13\5\3\5\5\5\u01d8\n\5\3\5\6\5\u01db\n\5\r\5\16\5\u01dc"+
		"\7\5\u01df\n\5\f\5\16\5\u01e2\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u01f8\n\6\f\6\16\6\u01fb"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0204\n\6\f\6\16\6\u0207\13\6\5"+
		"\6\u0209\n\6\3\6\3\6\5\6\u020d\n\6\3\7\3\7\5\7\u0211\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u021a\n\7\3\7\3\7\7\7\u021e\n\7\f\7\16\7\u0221\13\7"+
		"\3\7\3\7\5\7\u0225\n\7\3\b\3\b\3\b\3\b\7\b\u022b\n\b\f\b\16\b\u022e\13"+
		"\b\5\b\u0230\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0240\n\t\3\t\3\t\3\t\5\t\u0245\n\t\5\t\u0247\n\t\3\t\3\t"+
		"\7\t\u024b\n\t\f\t\16\t\u024e\13\t\3\n\3\n\3\n\5\n\u0253\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0259\n\n\3\n\3\n\3\n\5\n\u025e\n\n\5\n\u0260\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u026d\n\n\3\n\3\n\5\n\u0271\n\n"+
		"\3\n\7\n\u0274\n\n\f\n\16\n\u0277\13\n\3\n\7\n\u027a\n\n\f\n\16\n\u027d"+
		"\13\n\3\n\3\n\3\n\3\n\5\n\u0283\n\n\3\n\3\n\3\n\5\n\u0288\n\n\5\n\u028a"+
		"\n\n\3\n\7\n\u028d\n\n\f\n\16\n\u0290\13\n\3\n\7\n\u0293\n\n\f\n\16\n"+
		"\u0296\13\n\3\n\5\n\u0299\n\n\3\13\3\13\3\13\3\13\5\13\u029f\n\13\3\f"+
		"\3\f\3\f\3\f\7\f\u02a5\n\f\f\f\16\f\u02a8\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u02b2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u02ba\n\16\3"+
		"\16\3\16\5\16\u02be\n\16\3\16\7\16\u02c1\n\16\f\16\16\16\u02c4\13\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u02cd\n\16\f\16\16\16\u02d0\13"+
		"\16\3\16\3\16\5\16\u02d4\n\16\3\17\3\17\3\17\7\17\u02d9\n\17\f\17\16\17"+
		"\u02dc\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u02e3\n\20\f\20\16\20\u02e6"+
		"\13\20\3\20\2\4\b\20\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\4\2"+
		"!!\67\67\4\2uvxx\4\2\6\6AA\u039f\2!\3\2\2\2\4O\3\2\2\2\6W\3\2\2\2\b\u0126"+
		"\3\2\2\2\n\u020c\3\2\2\2\f\u0224\3\2\2\2\16\u0226\3\2\2\2\20\u0246\3\2"+
		"\2\2\22\u0298\3\2\2\2\24\u029e\3\2\2\2\26\u02a0\3\2\2\2\30\u02b1\3\2\2"+
		"\2\32\u02d3\3\2\2\2\34\u02d5\3\2\2\2\36\u02df\3\2\2\2 \"\5\6\4\2! \3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\7=\2\2&P\7\177\2\2\'"+
		"(\7>\2\2()\7\177\2\2)*\7@\2\2*/\7\177\2\2+,\7A\2\2,.\7\177\2\2-+\3\2\2"+
		"\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60P\3\2\2\2\61/\3\2\2\2\62\63\7C"+
		"\2\2\63P\7\177\2\2\64\65\7D\2\2\65:\7\177\2\2\66\67\7A\2\2\679\7\177\2"+
		"\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;P\3\2\2\2<:\3\2\2\2=>\7E"+
		"\2\2>@\7\177\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3"+
		"\2\2\2DE\7G\2\2EP\3\2\2\2FG\7I\2\2GI\7\177\2\2HJ\5\6\4\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7G\2\2NP\3\2\2\2O%\3\2\2\2O\'\3"+
		"\2\2\2O\62\3\2\2\2O\64\3\2\2\2O=\3\2\2\2OF\3\2\2\2P\5\3\2\2\2QX\5\4\3"+
		"\2RX\5\22\n\2SX\5\f\7\2TX\5\32\16\2UX\5\34\17\2VX\5\b\5\2WQ\3\2\2\2WR"+
		"\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\b\5\1\2"+
		"Z[\7\16\2\2[\u0127\5\b\5e\\]\7\23\2\2]\u0127\5\b\5d^_\7S\2\2_\u0127\5"+
		"\b\5F`a\7@\2\2a\u0127\5\b\5&bc\7.\2\2c\u0127\5\b\5%de\7<\2\2ef\7\177\2"+
		"\2fg\7!\2\2g\u0127\5\b\5\20hi\7\66\2\2i\u0127\5\b\5\5jl\5\36\20\2km\5"+
		"\26\f\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nx\7X\2\2op\5\b\5\2pq\7A\2\2qs\3"+
		"\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wy\5"+
		"\b\5\2xt\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7Y\2\2{\u0127\3\2\2\2|\u0082\7"+
		"f\2\2}~\5\b\5\2~\177\7A\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\5\b\5\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7g\2\2\u0089|\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0127\3\2\2\2\u008d"+
		"\u008e\7f\2\2\u008e\u008f\5\b\5\2\u008f\u0090\7;\2\2\u0090\u0091\7\177"+
		"\2\2\u0091\u0092\t\2\2\2\u0092\u0095\5\b\5\2\u0093\u0094\7@\2\2\u0094"+
		"\u0096\5\b\5\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\7g\2\2\u0098\u0127\3\2\2\2\u0099\u009f\t\3\2\2\u009a"+
		"\u00a0\7\177\2\2\u009b\u009c\7X\2\2\u009c\u009d\5\b\5\2\u009d\u009e\7"+
		"Y\2\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u00a0"+
		"\u0127\3\2\2\2\u00a1\u0127\7H\2\2\u00a2\u00a3\78\2\2\u00a3\u00a7\5\b\5"+
		"\2\u00a4\u00a6\5\6\4\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b4\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\79\2\2\u00ab\u00af\5\b\5\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00bb\7:\2\2\u00b8\u00ba\5\6\4\2\u00b9\u00b8\3\2"+
		"\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b7\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7G\2\2\u00c1\u0127\3\2\2\2\u00c2"+
		"\u00c8\7F\2\2\u00c3\u00c4\7\177\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c7\5\b"+
		"\5\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\6"+
		"\4\2\u00cc\u00cd\7G\2\2\u00cd\u0127\3\2\2\2\u00ce\u00cf\7\65\2\2\u00cf"+
		"\u00d0\5\b\5\2\u00d0\u00d1\7G\2\2\u00d1\u0127\3\2\2\2\u00d2\u00d3\7X\2"+
		"\2\u00d3\u00d4\5\b\5\2\u00d4\u00d5\7Y\2\2\u00d5\u0127\3\2\2\2\u00d6\u00dc"+
		"\7X\2\2\u00d7\u00d8\5\b\5\2\u00d8\u00d9\7A\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\b\5\2\u00e0"+
		"\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u0127\7Y"+
		"\2\2\u00e3\u00ec\7B\2\2\u00e4\u00e5\7\177\2\2\u00e5\u00e7\7A\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7\177\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\5\6"+
		"\4\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u0127\7G"+
		"\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00fa\5\36\20\2\u00f7\u00f9\5\b\5\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0127\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u00ff\5\36\20\2\u00ff\u0105\7X\2\2\u0100\u0101\5\b\5\2\u0101\u0102\7"+
		"A\2\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\5\b\5\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\7Y\2\2\u010c\u0127\3\2\2\2\u010d\u0127\7\177"+
		"\2\2\u010e\u0127\7w\2\2\u010f\u0127\7Z\2\2\u0110\u0127\7[\2\2\u0111\u0127"+
		"\7x\2\2\u0112\u0127\7y\2\2\u0113\u0127\7z\2\2\u0114\u0127\7{\2\2\u0115"+
		"\u0127\7|\2\2\u0116\u0127\7}\2\2\u0117\u0127\7\u0080\2\2\u0118\u0127\7"+
		"\u0081\2\2\u0119\u011a\7@\2\2\u011a\u0127\7\177\2\2\u011b\u0127\7J\2\2"+
		"\u011c\u0127\7K\2\2\u011d\u0127\7L\2\2\u011e\u0127\7M\2\2\u011f\u0127"+
		"\7N\2\2\u0120\u0127\7O\2\2\u0121\u0127\7P\2\2\u0122\u0127\7Q\2\2\u0123"+
		"\u0127\7R\2\2\u0124\u0127\7\66\2\2\u0125\u0127\5\n\6\2\u0126Y\3\2\2\2"+
		"\u0126\\\3\2\2\2\u0126^\3\2\2\2\u0126`\3\2\2\2\u0126b\3\2\2\2\u0126d\3"+
		"\2\2\2\u0126h\3\2\2\2\u0126j\3\2\2\2\u0126\u0089\3\2\2\2\u0126\u008d\3"+
		"\2\2\2\u0126\u0099\3\2\2\2\u0126\u00a1\3\2\2\2\u0126\u00a2\3\2\2\2\u0126"+
		"\u00c2\3\2\2\2\u0126\u00ce\3\2\2\2\u0126\u00d2\3\2\2\2\u0126\u00d6\3\2"+
		"\2\2\u0126\u00e3\3\2\2\2\u0126\u00f5\3\2\2\2\u0126\u00fd\3\2\2\2\u0126"+
		"\u010d\3\2\2\2\u0126\u010e\3\2\2\2\u0126\u010f\3\2\2\2\u0126\u0110\3\2"+
		"\2\2\u0126\u0111\3\2\2\2\u0126\u0112\3\2\2\2\u0126\u0113\3\2\2\2\u0126"+
		"\u0114\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u0117\3\2"+
		"\2\2\u0126\u0118\3\2\2\2\u0126\u0119\3\2\2\2\u0126\u011b\3\2\2\2\u0126"+
		"\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2"+
		"\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126"+
		"\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u01e0\3\2"+
		"\2\2\u0128\u0129\fc\2\2\u0129\u012a\7\63\2\2\u012a\u012b\5\b\5\2\u012b"+
		"\u012c\7@\2\2\u012c\u012d\5\b\5d\u012d\u01df\3\2\2\2\u012e\u012f\f^\2"+
		"\2\u012f\u0130\7\17\2\2\u0130\u01df\5\b\5^\u0131\u0132\f\\\2\2\u0132\u0133"+
		"\7\20\2\2\u0133\u01df\5\b\5]\u0134\u0135\f[\2\2\u0135\u0136\7\21\2\2\u0136"+
		"\u01df\5\b\5\\\u0137\u0138\fZ\2\2\u0138\u0139\7)\2\2\u0139\u01df\5\b\5"+
		"[\u013a\u013b\fY\2\2\u013b\u013c\7\22\2\2\u013c\u01df\5\b\5Z\u013d\u013e"+
		"\fX\2\2\u013e\u013f\7\23\2\2\u013f\u01df\5\b\5Y\u0140\u0141\fW\2\2\u0141"+
		"\u0142\7\16\2\2\u0142\u01df\5\b\5X\u0143\u0144\fV\2\2\u0144\u0145\7\n"+
		"\2\2\u0145\u01df\5\b\5W\u0146\u0147\fU\2\2\u0147\u0148\7\13\2\2\u0148"+
		"\u01df\5\b\5V\u0149\u014a\fT\2\2\u014a\u014b\7\f\2\2\u014b\u01df\5\b\5"+
		"U\u014c\u014d\fS\2\2\u014d\u014e\7\r\2\2\u014e\u01df\5\b\5T\u014f\u0150"+
		"\fR\2\2\u0150\u0151\7\b\2\2\u0151\u01df\5\b\5S\u0152\u0153\fQ\2\2\u0153"+
		"\u0154\7\34\2\2\u0154\u01df\5\b\5R\u0155\u0156\fP\2\2\u0156\u0157\7\35"+
		"\2\2\u0157\u01df\5\b\5Q\u0158\u0159\fO\2\2\u0159\u015a\7\36\2\2\u015a"+
		"\u01df\5\b\5P\u015b\u015c\fN\2\2\u015c\u015d\7\37\2\2\u015d\u01df\5\b"+
		"\5O\u015e\u015f\fM\2\2\u015f\u0160\7\32\2\2\u0160\u01df\5\b\5N\u0161\u0162"+
		"\fL\2\2\u0162\u0163\7\26\2\2\u0163\u01df\5\b\5M\u0164\u0165\fK\2\2\u0165"+
		"\u0166\7\27\2\2\u0166\u01df\5\b\5L\u0167\u0168\fJ\2\2\u0168\u0169\7\30"+
		"\2\2\u0169\u01df\5\b\5K\u016a\u016b\fI\2\2\u016b\u016c\7\31\2\2\u016c"+
		"\u01df\5\b\5J\u016d\u016e\fH\2\2\u016e\u016f\7\24\2\2\u016f\u01df\5\b"+
		"\5I\u0170\u0171\fG\2\2\u0171\u0172\7]\2\2\u0172\u01df\5\b\5H\u0173\u0174"+
		"\fE\2\2\u0174\u0175\7T\2\2\u0175\u01df\5\b\5F\u0176\u0177\fD\2\2\u0177"+
		"\u0178\7U\2\2\u0178\u01df\5\b\5E\u0179\u017a\fC\2\2\u017a\u017b\7V\2\2"+
		"\u017b\u01df\5\b\5D\u017c\u017d\fB\2\2\u017d\u017e\7W\2\2\u017e\u01df"+
		"\5\b\5C\u017f\u0180\f;\2\2\u0180\u0181\7\t\2\2\u0181\u01df\5\b\5<\u0182"+
		"\u0183\f:\2\2\u0183\u0184\7!\2\2\u0184\u01df\5\b\5;\u0185\u0186\f9\2\2"+
		"\u0186\u0187\7#\2\2\u0187\u01df\5\b\5:\u0188\u0189\f8\2\2\u0189\u018a"+
		"\7$\2\2\u018a\u01df\5\b\59\u018b\u018c\f\67\2\2\u018c\u018d\7%\2\2\u018d"+
		"\u01df\5\b\58\u018e\u018f\f\66\2\2\u018f\u0190\7&\2\2\u0190\u01df\5\b"+
		"\5\67\u0191\u0192\f\65\2\2\u0192\u0193\7\'\2\2\u0193\u01df\5\b\5\66\u0194"+
		"\u0195\f\64\2\2\u0195\u0196\7(\2\2\u0196\u01df\5\b\5\65\u0197\u0198\f"+
		"\63\2\2\u0198\u0199\7*\2\2\u0199\u01df\5\b\5\64\u019a\u019b\f\62\2\2\u019b"+
		"\u019c\7+\2\2\u019c\u01df\5\b\5\63\u019d\u019e\f\61\2\2\u019e\u019f\7"+
		",\2\2\u019f\u01df\5\b\5\62\u01a0\u01a1\f\60\2\2\u01a1\u01a2\7-\2\2\u01a2"+
		"\u01df\5\b\5\61\u01a3\u01a4\f/\2\2\u01a4\u01a5\7/\2\2\u01a5\u01df\5\b"+
		"\5\60\u01a6\u01a7\f.\2\2\u01a7\u01a8\7\60\2\2\u01a8\u01df\5\b\5/\u01a9"+
		"\u01aa\f-\2\2\u01aa\u01ab\7\62\2\2\u01ab\u01df\5\b\5.\u01ac\u01ad\f,\2"+
		"\2\u01ad\u01ae\7\"\2\2\u01ae\u01df\5\b\5-\u01af\u01b0\f+\2\2\u01b0\u01b1"+
		"\7@\2\2\u01b1\u01df\5\b\5,\u01b2\u01b3\f*\2\2\u01b3\u01b4\7\67\2\2\u01b4"+
		"\u01df\5\b\5+\u01b5\u01b6\f)\2\2\u01b6\u01b7\7\7\2\2\u01b7\u01df\5\b\5"+
		"*\u01b8\u01b9\f(\2\2\u01b9\u01ba\7\6\2\2\u01ba\u01df\5\b\5)\u01bb\u01bc"+
		"\f$\2\2\u01bc\u01bd\7 \2\2\u01bd\u01df\5\b\5%\u01be\u01bf\f#\2\2\u01bf"+
		"\u01c0\7\3\2\2\u01c0\u01df\5\b\5#\u01c1\u01c2\f\36\2\2\u01c2\u01c3\7\5"+
		"\2\2\u01c3\u01df\5\b\5\37\u01c4\u01c5\f\6\2\2\u01c5\u01c6\7A\2\2\u01c6"+
		"\u01df\5\b\5\7\u01c7\u01c8\f]\2\2\u01c8\u01c9\7?\2\2\u01c9\u01df\5\n\6"+
		"\2\u01ca\u01cb\f\'\2\2\u01cb\u01df\7\61\2\2\u01cc\u01da\f!\2\2\u01cd\u01d3"+
		"\7f\2\2\u01ce\u01cf\5\b\5\2\u01cf\u01d0\7A\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01ce\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\5\b\5\2\u01d7"+
		"\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\7g"+
		"\2\2\u01da\u01cd\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u0128\3\2\2\2\u01de\u012e\3\2"+
		"\2\2\u01de\u0131\3\2\2\2\u01de\u0134\3\2\2\2\u01de\u0137\3\2\2\2\u01de"+
		"\u013a\3\2\2\2\u01de\u013d\3\2\2\2\u01de\u0140\3\2\2\2\u01de\u0143\3\2"+
		"\2\2\u01de\u0146\3\2\2\2\u01de\u0149\3\2\2\2\u01de\u014c\3\2\2\2\u01de"+
		"\u014f\3\2\2\2\u01de\u0152\3\2\2\2\u01de\u0155\3\2\2\2\u01de\u0158\3\2"+
		"\2\2\u01de\u015b\3\2\2\2\u01de\u015e\3\2\2\2\u01de\u0161\3\2\2\2\u01de"+
		"\u0164\3\2\2\2\u01de\u0167\3\2\2\2\u01de\u016a\3\2\2\2\u01de\u016d\3\2"+
		"\2\2\u01de\u0170\3\2\2\2\u01de\u0173\3\2\2\2\u01de\u0176\3\2\2\2\u01de"+
		"\u0179\3\2\2\2\u01de\u017c\3\2\2\2\u01de\u017f\3\2\2\2\u01de\u0182\3\2"+
		"\2\2\u01de\u0185\3\2\2\2\u01de\u0188\3\2\2\2\u01de\u018b\3\2\2\2\u01de"+
		"\u018e\3\2\2\2\u01de\u0191\3\2\2\2\u01de\u0194\3\2\2\2\u01de\u0197\3\2"+
		"\2\2\u01de\u019a\3\2\2\2\u01de\u019d\3\2\2\2\u01de\u01a0\3\2\2\2\u01de"+
		"\u01a3\3\2\2\2\u01de\u01a6\3\2\2\2\u01de\u01a9\3\2\2\2\u01de\u01ac\3\2"+
		"\2\2\u01de\u01af\3\2\2\2\u01de\u01b2\3\2\2\2\u01de\u01b5\3\2\2\2\u01de"+
		"\u01b8\3\2\2\2\u01de\u01bb\3\2\2\2\u01de\u01be\3\2\2\2\u01de\u01c1\3\2"+
		"\2\2\u01de\u01c4\3\2\2\2\u01de\u01c7\3\2\2\2\u01de\u01ca\3\2\2\2\u01de"+
		"\u01cc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\t\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u020d\7h\2\2\u01e4\u020d"+
		"\7i\2\2\u01e5\u020d\7j\2\2\u01e6\u020d\7k\2\2\u01e7\u020d\7l\2\2\u01e8"+
		"\u020d\7m\2\2\u01e9\u020d\7n\2\2\u01ea\u020d\7o\2\2\u01eb\u020d\7p\2\2"+
		"\u01ec\u020d\7q\2\2\u01ed\u020d\7r\2\2\u01ee\u020d\7s\2\2\u01ef\u020d"+
		"\7t\2\2\u01f0\u020d\7u\2\2\u01f1\u020d\7v\2\2\u01f2\u01f3\7b\2\2\u01f3"+
		"\u01f4\7d\2\2\u01f4\u01f9\5\n\6\2\u01f5\u01f6\7A\2\2\u01f6\u01f8\5\n\6"+
		"\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\7e\2\2\u01fd"+
		"\u020d\3\2\2\2\u01fe\u01ff\7\177\2\2\u01ff\u0208\7d\2\2\u0200\u0205\5"+
		"\b\5\2\u0201\u0202\7A\2\2\u0202\u0204\5\b\5\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u0200\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020d\7e\2\2\u020b\u020d\7\177\2\2\u020c\u01e3\3"+
		"\2\2\2\u020c\u01e4\3\2\2\2\u020c\u01e5\3\2\2\2\u020c\u01e6\3\2\2\2\u020c"+
		"\u01e7\3\2\2\2\u020c\u01e8\3\2\2\2\u020c\u01e9\3\2\2\2\u020c\u01ea\3\2"+
		"\2\2\u020c\u01eb\3\2\2\2\u020c\u01ec\3\2\2\2\u020c\u01ed\3\2\2\2\u020c"+
		"\u01ee\3\2\2\2\u020c\u01ef\3\2\2\2\u020c\u01f0\3\2\2\2\u020c\u01f1\3\2"+
		"\2\2\u020c\u01f2\3\2\2\2\u020c\u01fe\3\2\2\2\u020c\u020b\3\2\2\2\u020d"+
		"\13\3\2\2\2\u020e\u0210\5\36\20\2\u020f\u0211\5\26\f\2\u0210\u020f\3\2"+
		"\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\5\16\b\2\u0213"+
		"\u0214\7!\2\2\u0214\u0215\5\b\5\2\u0215\u0225\3\2\2\2\u0216\u0217\7c\2"+
		"\2\u0217\u0219\5\36\20\2\u0218\u021a\5\26\f\2\u0219\u0218\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021f\5\16\b\2\u021c\u021e\5"+
		"\6\4\2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7G"+
		"\2\2\u0223\u0225\3\2\2\2\u0224\u020e\3\2\2\2\u0224\u0216\3\2\2\2\u0225"+
		"\r\3\2\2\2\u0226\u022f\7X\2\2\u0227\u022c\5\20\t\2\u0228\u0229\t\4\2\2"+
		"\u0229\u022b\5\20\t\2\u022a\u0228\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022f"+
		"\u0227\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7Y"+
		"\2\2\u0232\17\3\2\2\2\u0233\u0234\b\t\1\2\u0234\u0235\7\177\2\2\u0235"+
		"\u0236\7?\2\2\u0236\u0239\5\n\6\2\u0237\u0238\7!\2\2\u0238\u023a\5\b\5"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0247\3\2\2\2\u023b\u023c"+
		"\7?\2\2\u023c\u023f\5\n\6\2\u023d\u023e\7!\2\2\u023e\u0240\5\b\5\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0247\3\2\2\2\u0241\u0244\7\177"+
		"\2\2\u0242\u0243\7!\2\2\u0243\u0245\5\b\5\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0233\3\2\2\2\u0246\u023b\3\2"+
		"\2\2\u0246\u0241\3\2\2\2\u0247\u024c\3\2\2\2\u0248\u0249\f\3\2\2\u0249"+
		"\u024b\7\61\2\2\u024a\u0248\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3"+
		"\2\2\2\u024c\u024d\3\2\2\2\u024d\21\3\2\2\2\u024e\u024c\3\2\2\2\u024f"+
		"\u0250\7_\2\2\u0250\u0252\7\177\2\2\u0251\u0253\5\26\f\2\u0252\u0251\3"+
		"\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0299\5\b\5\2\u0255"+
		"\u0256\7\\\2\2\u0256\u0258\7\177\2\2\u0257\u0259\5\26\f\2\u0258\u0257"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025f\3\2\2\2\u025a\u025b\7]\2\2\u025b"+
		"\u025d\7\177\2\2\u025c\u025e\5\26\f\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025a\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0299\3\2\2\2\u0261\u0262\7^\2\2\u0262\u0263\7\u0085\2\2\u0263\u0264"+
		"\7\177\2\2\u0264\u0265\7]\2\2\u0265\u0299\7\177\2\2\u0266\u0267\7^\2\2"+
		"\u0267\u0268\7\u0085\2\2\u0268\u0299\7\177\2\2\u0269\u026a\7`\2\2\u026a"+
		"\u026c\7\177\2\2\u026b\u026d\5\26\f\2\u026c\u026b\3\2\2\2\u026c\u026d"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026f\7]\2\2\u026f\u0271\7\177\2\2"+
		"\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0275\3\2\2\2\u0272\u0274"+
		"\5\24\13\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2"+
		"\u0275\u0276\3\2\2\2\u0276\u027b\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027a"+
		"\5\f\7\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0299\7G"+
		"\2\2\u027f\u0280\7a\2\2\u0280\u0282\7\177\2\2\u0281\u0283\5\26\f\2\u0282"+
		"\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0289\3\2\2\2\u0284\u0285\7]"+
		"\2\2\u0285\u0287\7\177\2\2\u0286\u0288\5\26\f\2\u0287\u0286\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0284\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028e\3\2\2\2\u028b\u028d\5\24\13\2\u028c\u028b\3\2\2\2\u028d"+
		"\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0294\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0291\u0293\5\f\7\2\u0292\u0291\3\2\2\2\u0293"+
		"\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2"+
		"\2\2\u0296\u0294\3\2\2\2\u0297\u0299\7G\2\2\u0298\u024f\3\2\2\2\u0298"+
		"\u0255\3\2\2\2\u0298\u0261\3\2\2\2\u0298\u0266\3\2\2\2\u0298\u0269\3\2"+
		"\2\2\u0298\u027f\3\2\2\2\u0299\23\3\2\2\2\u029a\u029b\7\177\2\2\u029b"+
		"\u029c\7?\2\2\u029c\u029f\5\n\6\2\u029d\u029f\7\177\2\2\u029e\u029a\3"+
		"\2\2\2\u029e\u029d\3\2\2\2\u029f\25\3\2\2\2\u02a0\u02a1\7d\2\2\u02a1\u02a6"+
		"\5\30\r\2\u02a2\u02a3\7A\2\2\u02a3\u02a5\5\30\r\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9"+
		"\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7e\2\2\u02aa\27\3\2\2\2\u02ab"+
		"\u02ac\7\177\2\2\u02ac\u02ad\7]\2\2\u02ad\u02b2\5\n\6\2\u02ae\u02af\7"+
		"?\2\2\u02af\u02b2\5\n\6\2\u02b0\u02b2\5\b\5\2\u02b1\u02ab\3\2\2\2\u02b1"+
		"\u02ae\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2\31\3\2\2\2\u02b3\u02b4\7;\2\2"+
		"\u02b4\u02b5\5\b\5\2\u02b5\u02b6\7!\2\2\u02b6\u02b9\5\b\5\2\u02b7\u02b8"+
		"\7@\2\2\u02b8\u02ba\5\b\5\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02bc\7@\2\2\u02bc\u02be\5\b\5\2\u02bd\u02bb\3\2"+
		"\2\2\u02bd\u02be\3\2\2\2\u02be\u02c2\3\2\2\2\u02bf\u02c1\5\6\4\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7G\2\2\u02c6"+
		"\u02d4\3\2\2\2\u02c7\u02c8\7;\2\2\u02c8\u02c9\5\b\5\2\u02c9\u02ca\7\67"+
		"\2\2\u02ca\u02ce\5\b\5\2\u02cb\u02cd\5\6\4\2\u02cc\u02cb\3\2\2\2\u02cd"+
		"\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2"+
		"\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7G\2\2\u02d2\u02d4\3\2\2\2\u02d3"+
		"\u02b3\3\2\2\2\u02d3\u02c7\3\2\2\2\u02d4\33\3\2\2\2\u02d5\u02d6\7\64\2"+
		"\2\u02d6\u02da\5\b\5\2\u02d7\u02d9\5\6\4\2\u02d8\u02d7\3\2\2\2\u02d9\u02dc"+
		"\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dd\u02de\7G\2\2\u02de\35\3\2\2\2\u02df\u02e4\7\177\2"+
		"\2\u02e0\u02e1\7\5\2\2\u02e1\u02e3\7\177\2\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\37\3\2\2"+
		"\2\u02e6\u02e4\3\2\2\2L#/:BKOWltx\u0082\u0086\u008b\u0095\u009f\u00a7"+
		"\u00af\u00b4\u00bb\u00be\u00c8\u00dc\u00e0\u00e8\u00ec\u00f1\u00fa\u0105"+
		"\u0109\u0126\u01d3\u01d7\u01dc\u01de\u01e0\u01f9\u0205\u0208\u020c\u0210"+
		"\u0219\u021f\u0224\u022c\u022f\u0239\u023f\u0244\u0246\u024c\u0252\u0258"+
		"\u025d\u025f\u026c\u0270\u0275\u027b\u0282\u0287\u0289\u028e\u0294\u0298"+
		"\u029e\u02a6\u02b1\u02b9\u02bd\u02c2\u02ce\u02d3\u02da\u02e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}