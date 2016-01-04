// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaParser.g4 by ANTLR 4.5.1

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
		AT=1, DOT=2, SEMI_COLON=3, EQUALS=4, EQ=5, DOUBLE_ARROW=6, ADD_ASGN=7, 
		SUB_ASGN=8, TIMES_ASGN=9, DIVIDE_ASGN=10, INV_DIVIDE_ASGN=11, REMAINDER_ASGN=12, 
		REM=13, POWER_ASGN=14, BITWISE_AND_ASGN=15, BITWISE_OR_ASGN=16, BITWISE_XOR_ASGN=17, 
		LSR_ASGN=18, ASR_ASGN=19, ELLIPSE=20, ASL_ASGN=21, QUESTION_MARK=22, WHILE=23, 
		BEGIN=24, RETURN=25, IN=26, IF=27, ELSE_IF=28, ELSE=29, FOR=30, CONST=31, 
		USING=32, IMPORT=33, COLON=34, COMMA=35, IMPORT_ALL=36, EXPORT=37, MODULE=38, 
		END=39, BAREMODULE=40, INF16=41, INF32=42, INF=43, MINUS_INF16=44, MINUS_INF32=45, 
		MINUS_INF=46, NAN16=47, NAN32=48, NAN=49, MINUS=50, INSTANCE_OF=51, EXPONENT=52, 
		FRACTION=53, TIMES=54, DIVIDE=55, PLUS=56, NOT_EQUAL=57, GREATER_THAN=58, 
		LESS_THAN=59, GREATER_THAN_OR_EQ=60, LESS_THAN_OR_EQ=61, NOT=62, AND=63, 
		OR=64, LEFT_BRACKET=65, RIGHT_BRACKET=66, TRUE=67, FALSE=68, ABSTRACT=69, 
		SUB_TYPE=70, BITS_TYPE=71, TYPE_ALIAS=72, TYPE=73, IMMUTABLE=74, UNION=75, 
		FUNCTION=76, LEFT_CURLY=77, RIGHT_CURLY=78, LEFT_SQUARE=79, RIGHT_SQUARE=80, 
		INT8=81, UINT8=82, INT16=83, UINT16=84, INT32=85, UINT32=86, INT64=87, 
		UINT64=88, INT128=89, UINT128=90, BOOL=91, CHAR=92, FLOAT16=93, FLOAT32=94, 
		FLOAT64=95, REGEX=96, INT=97, BINARY=98, OCTAL=99, HEX=100, FLOAT32_LITERAL=101, 
		EXP32=102, FLOAT64_LITERAL=103, EXP64=104, ID=105, CHARACTER_LITERAL=106, 
		STRING=107, WS=108, COMMENT=109, LINE_COMMENT=110, SIZE=111;
	public static final int
		RULE_unit = 0, RULE_statement = 1, RULE_moduleDirective = 2, RULE_exp = 3, 
		RULE_functionDeclaration = 4, RULE_parameters = 5, RULE_parameter = 6, 
		RULE_typeDefinition = 7, RULE_fieldDeclaration = 8, RULE_typeParameters = 9, 
		RULE_typeParameter = 10, RULE_forStatement = 11, RULE_whileStatement = 12, 
		RULE_name = 13;
	public static final String[] ruleNames = {
		"unit", "statement", "moduleDirective", "exp", "functionDeclaration", 
		"parameters", "parameter", "typeDefinition", "fieldDeclaration", "typeParameters", 
		"typeParameter", "forStatement", "whileStatement", "name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'.'", "';'", "'=='", "'='", "'=>'", "'+='", "'-='", "'*='", 
		"'/='", "'\\='", "'%='", "'%'", "'^='", "'&='", "'|='", "'$='", "'>>>='", 
		"'>>='", "'...'", "'<<='", "'?'", "'while'", "'begin'", "'return'", "'in'", 
		"'if'", "'elseif'", "'else'", "'for'", "'const'", "'using'", "'import'", 
		"':'", "','", "'importall'", "'export'", "'module'", "'end'", "'baremodule'", 
		"'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'", 
		"'NaN32'", "'NaN'", "'-'", "'::'", "'^'", "'//'", "'*'", "'/'", "'+'", 
		null, "'>'", "'<'", "'>='", null, "'!'", "'&&'", "'||'", "'('", "')'", 
		"'true'", "'false'", "'abstract'", "'<:'", "'bitstype'", "'typealias'", 
		"'type'", "'immutable'", "'Union'", "'function'", "'{'", "'}'", "'['", 
		"']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'", "'Int32'", "'Uint32'", 
		"'Int64'", "'Uint64'", "'Int128'", "'Uint128'", "'Bool'", "'Char'", "'Float16'", 
		"'Float32'", "'Float64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AT", "DOT", "SEMI_COLON", "EQUALS", "EQ", "DOUBLE_ARROW", "ADD_ASGN", 
		"SUB_ASGN", "TIMES_ASGN", "DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", 
		"REM", "POWER_ASGN", "BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN", 
		"LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE", 
		"BEGIN", "RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "USING", 
		"IMPORT", "COLON", "COMMA", "IMPORT_ALL", "EXPORT", "MODULE", "END", "BAREMODULE", 
		"INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", 
		"NAN32", "NAN", "MINUS", "INSTANCE_OF", "EXPONENT", "FRACTION", "TIMES", 
		"DIVIDE", "PLUS", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQ", 
		"LESS_THAN_OR_EQ", "NOT", "AND", "OR", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE", 
		"IMMUTABLE", "UNION", "FUNCTION", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", 
		"RIGHT_SQUARE", "INT8", "UINT8", "INT16", "UINT16", "INT32", "UINT32", 
		"INT64", "UINT64", "INT128", "UINT128", "BOOL", "CHAR", "FLOAT16", "FLOAT32", 
		"FLOAT64", "REGEX", "INT", "BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", 
		"EXP32", "FLOAT64_LITERAL", "EXP64", "ID", "CHARACTER_LITERAL", "STRING", 
		"WS", "COMMENT", "LINE_COMMENT", "SIZE"
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
		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}
		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class,i);
		}
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
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				switch (_input.LA(1)) {
				case USING:
				case IMPORT:
				case IMPORT_ALL:
				case EXPORT:
				case MODULE:
				case BAREMODULE:
					{
					setState(28);
					moduleDirective();
					}
					break;
				case WHILE:
				case BEGIN:
				case RETURN:
				case IF:
				case FOR:
				case CONST:
				case COLON:
				case END:
				case INF16:
				case INF32:
				case INF:
				case MINUS_INF16:
				case MINUS_INF32:
				case MINUS_INF:
				case NAN16:
				case NAN32:
				case NAN:
				case MINUS:
				case NOT:
				case LEFT_BRACKET:
				case TRUE:
				case FALSE:
				case ABSTRACT:
				case BITS_TYPE:
				case TYPE_ALIAS:
				case TYPE:
				case IMMUTABLE:
				case UNION:
				case FUNCTION:
				case LEFT_SQUARE:
				case INT8:
				case UINT8:
				case INT16:
				case UINT16:
				case INT32:
				case UINT32:
				case INT64:
				case UINT64:
				case INT128:
				case UINT128:
				case BOOL:
				case CHAR:
				case FLOAT16:
				case FLOAT32:
				case FLOAT64:
				case REGEX:
				case INT:
				case BINARY:
				case OCTAL:
				case HEX:
				case FLOAT32_LITERAL:
				case FLOAT64_LITERAL:
				case ID:
				case CHARACTER_LITERAL:
				case STRING:
					{
					setState(29);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << END) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0) );
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
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(39);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				typeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
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
		enterRule(_localctx, 4, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(83);
			switch (_input.LA(1)) {
			case USING:
				_localctx = new UsingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(USING);
				setState(42);
				match(ID);
				}
				break;
			case IMPORT:
				_localctx = new ImporttContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(IMPORT);
				setState(44);
				match(ID);
				setState(45);
				match(COLON);
				setState(46);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(47);
					match(COMMA);
					setState(48);
					match(ID);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IMPORT_ALL:
				_localctx = new ImportAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(IMPORT_ALL);
				setState(55);
				match(ID);
				}
				break;
			case EXPORT:
				_localctx = new ExportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(EXPORT);
				setState(57);
				match(ID);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					match(ID);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MODULE:
				_localctx = new ModuleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(MODULE);
				setState(66);
				match(ID);
				setState(68); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(67);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(70); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(72);
				match(END);
				}
				break;
			case BAREMODULE:
				_localctx = new BareModuleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(BAREMODULE);
				setState(75);
				match(ID);
				setState(77); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(76);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(81);
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
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
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
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
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
	public static class Int64Context extends ExpContext {
		public TerminalNode INT64() { return getToken(JuliaParser.INT64, 0); }
		public Int64Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Int8Context extends ExpContext {
		public TerminalNode INT8() { return getToken(JuliaParser.INT8, 0); }
		public Int8Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Int128Context extends ExpContext {
		public TerminalNode INT128() { return getToken(JuliaParser.INT128, 0); }
		public Int128Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Uint32Context extends ExpContext {
		public TerminalNode UINT32() { return getToken(JuliaParser.UINT32, 0); }
		public Uint32Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class EnumerationContext extends ExpContext {
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(JuliaParser.LEFT_SQUARE); }
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(JuliaParser.LEFT_SQUARE, i);
		}
		public List<TerminalNode> RIGHT_SQUARE() { return getTokens(JuliaParser.RIGHT_SQUARE); }
		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(JuliaParser.RIGHT_SQUARE, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
	public static class QualifiedNameContext extends ExpContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public QualifiedNameContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitQualifiedName(this);
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
	public static class Int16Context extends ExpContext {
		public TerminalNode INT16() { return getToken(JuliaParser.INT16, 0); }
		public Int16Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Uint128Context extends ExpContext {
		public TerminalNode UINT128() { return getToken(JuliaParser.UINT128, 0); }
		public Uint128Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Uint64Context extends ExpContext {
		public TerminalNode UINT64() { return getToken(JuliaParser.UINT64, 0); }
		public Uint64Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Uint8Context extends ExpContext {
		public TerminalNode UINT8() { return getToken(JuliaParser.UINT8, 0); }
		public Uint8Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class UnionTypeContext extends ExpContext {
		public TerminalNode UNION() { return getToken(JuliaParser.UNION, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(JuliaParser.LEFT_CURLY, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(JuliaParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public UnionTypeContext(ExpContext ctx) { copyFrom(ctx); }
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
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(JuliaParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Float64Context extends ExpContext {
		public TerminalNode FLOAT64() { return getToken(JuliaParser.FLOAT64, 0); }
		public Float64Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Float16Context extends ExpContext {
		public TerminalNode FLOAT16() { return getToken(JuliaParser.FLOAT16, 0); }
		public Float16Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class TupleContext extends ExpContext {
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
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
	public static class EndContext extends ExpContext {
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public EndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitEnd(this);
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
	public static class Uint16Context extends ExpContext {
		public TerminalNode UINT16() { return getToken(JuliaParser.UINT16, 0); }
		public Uint16Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class ChainContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(JuliaParser.SEMI_COLON, 0); }
		public ChainContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitChain(this);
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
	public static class ParametricTypeContext extends ExpContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode LEFT_CURLY() { return getToken(JuliaParser.LEFT_CURLY, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(JuliaParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public ParametricTypeContext(ExpContext ctx) { copyFrom(ctx); }
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
	public static class Float32Context extends ExpContext {
		public TerminalNode FLOAT32() { return getToken(JuliaParser.FLOAT32, 0); }
		public Float32Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class TypedExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
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
	public static class Int32Context extends ExpContext {
		public TerminalNode INT32() { return getToken(JuliaParser.INT32, 0); }
		public Int32Context(ExpContext ctx) { copyFrom(ctx); }
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
	public static class CharContext extends ExpContext {
		public TerminalNode CHAR() { return getToken(JuliaParser.CHAR, 0); }
		public CharContext(ExpContext ctx) { copyFrom(ctx); }
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
	public static class ArrayIndexContext extends ExpContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> LEFT_SQUARE() { return getTokens(JuliaParser.LEFT_SQUARE); }
		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(JuliaParser.LEFT_SQUARE, i);
		}
		public List<TerminalNode> RIGHT_SQUARE() { return getTokens(JuliaParser.RIGHT_SQUARE); }
		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(JuliaParser.RIGHT_SQUARE, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
	public static class BracketedContext extends ExpContext {
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
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
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(MINUS);
				setState(87);
				exp(90);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(NOT);
				setState(89);
				exp(72);
				}
				break;
			case 3:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(CONST);
				setState(91);
				match(ID);
				setState(92);
				match(EQ);
				setState(93);
				exp(12);
				}
				break;
			case 4:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(RETURN);
				setState(95);
				exp(2);
				}
				break;
			case 5:
				{
				_localctx = new EnumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(96);
						match(LEFT_SQUARE);
						setState(102);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(97);
								exp(0);
								setState(98);
								match(COMMA);
								}
								} 
							}
							setState(104);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						}
						setState(106);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(105);
							exp(0);
							}
						}

						setState(108);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new CoeffientContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (FLOAT32 - 94)) | (1L << (FLOAT64 - 94)) | (1L << (INT - 94)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(119);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(114);
					match(ID);
					}
					break;
				case LEFT_BRACKET:
					{
					setState(115);
					match(LEFT_BRACKET);
					setState(116);
					exp(0);
					setState(117);
					match(RIGHT_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				{
				_localctx = new EndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new NaryConditionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(IF);
				setState(123);
				exp(0);
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						statement();
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF) {
					{
					{
					setState(130);
					match(ELSE_IF);
					setState(131);
					exp(0);
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(132);
							statement();
							}
							} 
						}
						setState(137);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(143);
					match(ELSE);
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(144);
							statement();
							}
							} 
						}
						setState(149);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
				}

				setState(152);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(BEGIN);
				setState(155);
				exp(0);
				setState(156);
				match(END);
				}
				break;
			case 10:
				{
				_localctx = new ApplyFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				name();
				setState(160);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(159);
					typeParameters();
					}
				}

				setState(162);
				match(LEFT_BRACKET);
				setState(172);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(163);
							exp(0);
							setState(164);
							match(COMMA);
							}
							} 
						}
						setState(170);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
					}
					setState(171);
					exp(0);
					}
				}

				setState(174);
				match(RIGHT_BRACKET);
				}
				break;
			case 11:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				name();
				setState(190); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(177);
						match(LEFT_SQUARE);
						setState(183);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(178);
								exp(0);
								setState(179);
								match(COMMA);
								}
								} 
							}
							setState(185);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						}
						setState(187);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(186);
							exp(0);
							}
						}

						setState(189);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(192); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 12:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(LEFT_BRACKET);
				setState(195);
				exp(0);
				setState(196);
				match(RIGHT_BRACKET);
				}
				break;
			case 13:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(LEFT_BRACKET);
				setState(202); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(199);
						exp(0);
						setState(200);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(204); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(206);
				exp(0);
				setState(207);
				match(RIGHT_BRACKET);
				}
				break;
			case 14:
				{
				_localctx = new Int8Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(INT8);
				}
				break;
			case 15:
				{
				_localctx = new Uint8Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(UINT8);
				}
				break;
			case 16:
				{
				_localctx = new Int16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(INT16);
				}
				break;
			case 17:
				{
				_localctx = new Uint16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(UINT16);
				}
				break;
			case 18:
				{
				_localctx = new Int32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(INT32);
				}
				break;
			case 19:
				{
				_localctx = new Uint32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(UINT32);
				}
				break;
			case 20:
				{
				_localctx = new Int64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(INT64);
				}
				break;
			case 21:
				{
				_localctx = new Uint64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(UINT64);
				}
				break;
			case 22:
				{
				_localctx = new Int128Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(INT128);
				}
				break;
			case 23:
				{
				_localctx = new Uint128Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(UINT128);
				}
				break;
			case 24:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(BOOL);
				}
				break;
			case 25:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(CHAR);
				}
				break;
			case 26:
				{
				_localctx = new Float16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(FLOAT16);
				}
				break;
			case 27:
				{
				_localctx = new Float32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(FLOAT32);
				}
				break;
			case 28:
				{
				_localctx = new Float64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(FLOAT64);
				}
				break;
			case 29:
				{
				_localctx = new UnionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(UNION);
				setState(225);
				match(LEFT_CURLY);
				setState(226);
				exp(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					exp(0);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(RIGHT_CURLY);
				}
				break;
			case 30:
				{
				_localctx = new ParametricTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				setState(237);
				match(LEFT_CURLY);
				setState(238);
				exp(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					exp(0);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(RIGHT_CURLY);
				}
				break;
			case 31:
				{
				_localctx = new QualifiedNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				name();
				}
				break;
			case 32:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(ID);
				}
				break;
			case 33:
				{
				_localctx = new RegexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(REGEX);
				}
				break;
			case 34:
				{
				_localctx = new TtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(TRUE);
				}
				break;
			case 35:
				{
				_localctx = new FfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(FALSE);
				}
				break;
			case 36:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(INT);
				}
				break;
			case 37:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(BINARY);
				}
				break;
			case 38:
				{
				_localctx = new OctalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(OCTAL);
				}
				break;
			case 39:
				{
				_localctx = new HexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(HEX);
				}
				break;
			case 40:
				{
				_localctx = new Ffloat32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(FLOAT32_LITERAL);
				}
				break;
			case 41:
				{
				_localctx = new Ffloat64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(FLOAT64_LITERAL);
				}
				break;
			case 42:
				{
				_localctx = new CharaacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(CHARACTER_LITERAL);
				}
				break;
			case 43:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(STRING);
				}
				break;
			case 44:
				{
				_localctx = new SymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(COLON);
				setState(262);
				match(ID);
				}
				break;
			case 45:
				{
				_localctx = new Inf16TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(INF16);
				}
				break;
			case 46:
				{
				_localctx = new Inf32TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(INF32);
				}
				break;
			case 47:
				{
				_localctx = new InfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(INF);
				}
				break;
			case 48:
				{
				_localctx = new MinusInf16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(MINUS_INF16);
				}
				break;
			case 49:
				{
				_localctx = new MinusInf32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(MINUS_INF32);
				}
				break;
			case 50:
				{
				_localctx = new MinusInfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(MINUS_INF);
				}
				break;
			case 51:
				{
				_localctx = new Nan16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(NAN16);
				}
				break;
			case 52:
				{
				_localctx = new Nan32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(NAN32);
				}
				break;
			case 53:
				{
				_localctx = new NanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(NAN);
				}
				break;
			case 54:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(RETURN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(275);
						if (!(precpred(_ctx, 87))) throw new FailedPredicateException(this, "precpred(_ctx, 87)");
						setState(276);
						match(INSTANCE_OF);
						setState(277);
						exp(88);
						}
						break;
					case 2:
						{
						_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(278);
						if (!(precpred(_ctx, 86))) throw new FailedPredicateException(this, "precpred(_ctx, 86)");
						setState(279);
						match(EXPONENT);
						setState(280);
						exp(86);
						}
						break;
					case 3:
						{
						_localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(281);
						if (!(precpred(_ctx, 85))) throw new FailedPredicateException(this, "precpred(_ctx, 85)");
						setState(282);
						match(FRACTION);
						setState(283);
						exp(86);
						}
						break;
					case 4:
						{
						_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(284);
						if (!(precpred(_ctx, 84))) throw new FailedPredicateException(this, "precpred(_ctx, 84)");
						setState(285);
						match(TIMES);
						setState(286);
						exp(85);
						}
						break;
					case 5:
						{
						_localctx = new RemainderContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(287);
						if (!(precpred(_ctx, 83))) throw new FailedPredicateException(this, "precpred(_ctx, 83)");
						setState(288);
						match(REM);
						setState(289);
						exp(84);
						}
						break;
					case 6:
						{
						_localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(290);
						if (!(precpred(_ctx, 82))) throw new FailedPredicateException(this, "precpred(_ctx, 82)");
						setState(291);
						match(DIVIDE);
						setState(292);
						exp(83);
						}
						break;
					case 7:
						{
						_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(293);
						if (!(precpred(_ctx, 81))) throw new FailedPredicateException(this, "precpred(_ctx, 81)");
						setState(294);
						match(PLUS);
						setState(295);
						exp(82);
						}
						break;
					case 8:
						{
						_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(296);
						if (!(precpred(_ctx, 80))) throw new FailedPredicateException(this, "precpred(_ctx, 80)");
						setState(297);
						match(MINUS);
						setState(298);
						exp(81);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(299);
						if (!(precpred(_ctx, 79))) throw new FailedPredicateException(this, "precpred(_ctx, 79)");
						setState(300);
						match(GREATER_THAN);
						setState(301);
						exp(80);
						}
						break;
					case 10:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(302);
						if (!(precpred(_ctx, 78))) throw new FailedPredicateException(this, "precpred(_ctx, 78)");
						setState(303);
						match(LESS_THAN);
						setState(304);
						exp(79);
						}
						break;
					case 11:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(305);
						if (!(precpred(_ctx, 77))) throw new FailedPredicateException(this, "precpred(_ctx, 77)");
						setState(306);
						match(GREATER_THAN_OR_EQ);
						setState(307);
						exp(78);
						}
						break;
					case 12:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(308);
						if (!(precpred(_ctx, 76))) throw new FailedPredicateException(this, "precpred(_ctx, 76)");
						setState(309);
						match(LESS_THAN_OR_EQ);
						setState(310);
						exp(77);
						}
						break;
					case 13:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(311);
						if (!(precpred(_ctx, 75))) throw new FailedPredicateException(this, "precpred(_ctx, 75)");
						setState(312);
						match(EQUALS);
						setState(313);
						exp(76);
						}
						break;
					case 14:
						{
						_localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(314);
						if (!(precpred(_ctx, 74))) throw new FailedPredicateException(this, "precpred(_ctx, 74)");
						setState(315);
						match(SUB_TYPE);
						setState(316);
						exp(75);
						}
						break;
					case 15:
						{
						_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(317);
						if (!(precpred(_ctx, 73))) throw new FailedPredicateException(this, "precpred(_ctx, 73)");
						setState(318);
						match(QUESTION_MARK);
						setState(319);
						exp(0);
						setState(320);
						match(COLON);
						setState(321);
						exp(74);
						}
						break;
					case 16:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(323);
						if (!(precpred(_ctx, 71))) throw new FailedPredicateException(this, "precpred(_ctx, 71)");
						setState(324);
						match(AND);
						setState(325);
						exp(72);
						}
						break;
					case 17:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(326);
						if (!(precpred(_ctx, 70))) throw new FailedPredicateException(this, "precpred(_ctx, 70)");
						setState(327);
						match(OR);
						setState(328);
						exp(71);
						}
						break;
					case 18:
						{
						_localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(329);
						if (!(precpred(_ctx, 62))) throw new FailedPredicateException(this, "precpred(_ctx, 62)");
						setState(330);
						match(NOT_EQUAL);
						setState(331);
						exp(63);
						}
						break;
					case 19:
						{
						_localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(332);
						if (!(precpred(_ctx, 61))) throw new FailedPredicateException(this, "precpred(_ctx, 61)");
						setState(333);
						match(EQ);
						setState(334);
						exp(62);
						}
						break;
					case 20:
						{
						_localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(335);
						if (!(precpred(_ctx, 60))) throw new FailedPredicateException(this, "precpred(_ctx, 60)");
						setState(336);
						match(ADD_ASGN);
						setState(337);
						exp(61);
						}
						break;
					case 21:
						{
						_localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(338);
						if (!(precpred(_ctx, 59))) throw new FailedPredicateException(this, "precpred(_ctx, 59)");
						setState(339);
						match(SUB_ASGN);
						setState(340);
						exp(60);
						}
						break;
					case 22:
						{
						_localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 58))) throw new FailedPredicateException(this, "precpred(_ctx, 58)");
						setState(342);
						match(TIMES_ASGN);
						setState(343);
						exp(59);
						}
						break;
					case 23:
						{
						_localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(344);
						if (!(precpred(_ctx, 57))) throw new FailedPredicateException(this, "precpred(_ctx, 57)");
						setState(345);
						match(DIVIDE_ASGN);
						setState(346);
						exp(58);
						}
						break;
					case 24:
						{
						_localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(347);
						if (!(precpred(_ctx, 56))) throw new FailedPredicateException(this, "precpred(_ctx, 56)");
						setState(348);
						match(INV_DIVIDE_ASGN);
						setState(349);
						exp(57);
						}
						break;
					case 25:
						{
						_localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(350);
						if (!(precpred(_ctx, 55))) throw new FailedPredicateException(this, "precpred(_ctx, 55)");
						setState(351);
						match(REMAINDER_ASGN);
						setState(352);
						exp(56);
						}
						break;
					case 26:
						{
						_localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(353);
						if (!(precpred(_ctx, 54))) throw new FailedPredicateException(this, "precpred(_ctx, 54)");
						setState(354);
						match(POWER_ASGN);
						setState(355);
						exp(55);
						}
						break;
					case 27:
						{
						_localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(356);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(357);
						match(BITWISE_AND_ASGN);
						setState(358);
						exp(54);
						}
						break;
					case 28:
						{
						_localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(359);
						if (!(precpred(_ctx, 52))) throw new FailedPredicateException(this, "precpred(_ctx, 52)");
						setState(360);
						match(BITWISE_OR_ASGN);
						setState(361);
						exp(53);
						}
						break;
					case 29:
						{
						_localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(362);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(363);
						match(BITWISE_XOR_ASGN);
						setState(364);
						exp(52);
						}
						break;
					case 30:
						{
						_localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(365);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(366);
						match(LSR_ASGN);
						setState(367);
						exp(51);
						}
						break;
					case 31:
						{
						_localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(368);
						if (!(precpred(_ctx, 49))) throw new FailedPredicateException(this, "precpred(_ctx, 49)");
						setState(369);
						match(ASR_ASGN);
						setState(370);
						exp(50);
						}
						break;
					case 32:
						{
						_localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(371);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(372);
						match(ASL_ASGN);
						setState(373);
						exp(49);
						}
						break;
					case 33:
						{
						_localctx = new PairContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(374);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(375);
						match(DOUBLE_ARROW);
						setState(376);
						exp(48);
						}
						break;
					case 34:
						{
						_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(377);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(378);
						match(COLON);
						setState(379);
						exp(29);
						}
						break;
					case 35:
						{
						_localctx = new ChainContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(380);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(381);
						match(SEMI_COLON);
						setState(382);
						exp(27);
						}
						break;
					case 36:
						{
						_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(383);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(384);
						match(ELLIPSE);
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			setState(411);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CompactFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				name();
				setState(392);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(391);
					typeParameters();
					}
				}

				setState(394);
				parameters();
				setState(395);
				match(EQ);
				setState(396);
				statement();
				}
				break;
			case FUNCTION:
				_localctx = new GeneralFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(FUNCTION);
				setState(399);
				name();
				setState(401);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(400);
					typeParameters();
					}
				}

				setState(403);
				parameters();
				setState(405); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(404);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(407); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(409);
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
		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode ELLIPSE() { return getToken(JuliaParser.ELLIPSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
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
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			_localctx = new PparametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LEFT_BRACKET);
			setState(422);
			_la = _input.LA(1);
			if (_la==INSTANCE_OF || _la==ID) {
				{
				setState(414);
				parameter();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(415);
					match(COMMA);
					setState(416);
					parameter();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(425);
			_la = _input.LA(1);
			if (_la==ELLIPSE) {
				{
				setState(424);
				match(ELLIPSE);
				}
			}

			setState(427);
			match(RIGHT_BRACKET);
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
	public static class NamedParamContext extends ParameterContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
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
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new NamedTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(ID);
				setState(430);
				match(INSTANCE_OF);
				setState(431);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AnonymousTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(INSTANCE_OF);
				setState(433);
				exp(0);
				}
				break;
			case 3:
				_localctx = new NamedParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	 
		public TypeDefinitionContext() { }
		public void copyFrom(TypeDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImmutableTypeDeclarationContext extends TypeDefinitionContext {
		public TerminalNode IMMUTABLE() { return getToken(JuliaParser.IMMUTABLE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
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
		public ImmutableTypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
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
	public static class AbstractTypeContext extends TypeDefinitionContext {
		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public AbstractTypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
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
	public static class ImmutableSubTypeDeclarationContext extends TypeDefinitionContext {
		public TerminalNode IMMUTABLE() { return getToken(JuliaParser.IMMUTABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
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
		public ImmutableSubTypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterImmutableSubTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitImmutableSubTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitImmutableSubTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitsSubtypeContext extends TypeDefinitionContext {
		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }
		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public BitsSubtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
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
	public static class TypeDeclarationContext extends TypeDefinitionContext {
		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
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
		public TypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAliasContext extends TypeDefinitionContext {
		public TerminalNode TYPE_ALIAS() { return getToken(JuliaParser.TYPE_ALIAS, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
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
	public static class BitsTtypeContext extends TypeDefinitionContext {
		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }
		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public BitsTtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
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
	public static class AbstractSubtypeContext extends TypeDefinitionContext {
		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public AbstractSubtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterAbstractSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitAbstractSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitAbstractSubtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubTypeDeclarationContext extends TypeDefinitionContext {
		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}
		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class,i);
		}
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
		public SubTypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterSubTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitSubTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitSubTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDefinition);
		int _la;
		try {
			int _alt;
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new TypeAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(TYPE_ALIAS);
				setState(438);
				match(ID);
				setState(440);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(439);
					typeParameters();
					}
				}

				setState(442);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AbstractSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(ABSTRACT);
				setState(444);
				match(ID);
				setState(445);
				match(SUB_TYPE);
				setState(446);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AbstractTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(ABSTRACT);
				setState(448);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BitsSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(BITS_TYPE);
				setState(450);
				match(SIZE);
				setState(451);
				match(ID);
				setState(452);
				match(SUB_TYPE);
				setState(453);
				match(ID);
				}
				break;
			case 5:
				_localctx = new BitsTtypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(BITS_TYPE);
				setState(455);
				match(SIZE);
				setState(456);
				match(ID);
				}
				break;
			case 6:
				_localctx = new SubTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(457);
				match(TYPE);
				setState(458);
				match(ID);
				setState(460);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(459);
					typeParameters();
					}
				}

				setState(462);
				match(SUB_TYPE);
				setState(463);
				match(ID);
				setState(465);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(464);
					typeParameters();
					}
				}

				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(467);
						fieldDeclaration();
						}
						} 
					}
					setState(472);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(473);
					functionDeclaration();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				match(END);
				}
				break;
			case 7:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(480);
				match(TYPE);
				setState(481);
				match(ID);
				setState(483);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(482);
					typeParameters();
					}
				}

				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(485);
						fieldDeclaration();
						}
						} 
					}
					setState(490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(491);
					functionDeclaration();
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				match(END);
				}
				break;
			case 8:
				_localctx = new ImmutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(498);
				match(IMMUTABLE);
				setState(499);
				match(ID);
				setState(501);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(500);
					typeParameters();
					}
				}

				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(503);
						fieldDeclaration();
						}
						} 
					}
					setState(508);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(509);
					functionDeclaration();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				match(END);
				}
				break;
			case 9:
				_localctx = new ImmutableSubTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(516);
				match(IMMUTABLE);
				setState(517);
				match(ID);
				setState(519);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(518);
					typeParameters();
					}
				}

				setState(521);
				match(SUB_TYPE);
				setState(522);
				match(ID);
				setState(524);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(523);
					typeParameters();
					}
				}

				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(526);
						fieldDeclaration();
						}
						} 
					}
					setState(531);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(532);
					functionDeclaration();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		try {
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new TypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(ID);
				setState(542);
				match(INSTANCE_OF);
				setState(543);
				exp(0);
				}
				break;
			case 2:
				_localctx = new UntypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
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
		public TerminalNode LEFT_CURLY() { return getToken(JuliaParser.LEFT_CURLY, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(JuliaParser.RIGHT_CURLY, 0); }
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
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			_localctx = new TtypeParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LEFT_CURLY);
			setState(548);
			typeParameter();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				typeParameter();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(RIGHT_CURLY);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 20, RULE_typeParameter);
		try {
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new NamedSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(ID);
				setState(559);
				match(SUB_TYPE);
				setState(560);
				exp(0);
				}
				break;
			case 2:
				_localctx = new InstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(INSTANCE_OF);
				setState(562);
				exp(0);
				}
				break;
			case 3:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
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
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
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
	public static class ForEqStepContext extends ForStatementContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public List<TerminalNode> COLON() { return getTokens(JuliaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JuliaParser.COLON, i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForEqStepContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).enterForEqStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaParserListener ) ((JuliaParserListener)listener).exitForEqStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaParserVisitor ) return ((JuliaParserVisitor<? extends T>)visitor).visitForEqStep(this);
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
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			int _alt;
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new ForEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(FOR);
				setState(567);
				exp(0);
				setState(568);
				match(EQ);
				setState(569);
				exp(0);
				setState(570);
				match(COLON);
				setState(571);
				exp(0);
				setState(573); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(572);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(575); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(577);
				match(END);
				}
				break;
			case 2:
				_localctx = new ForEqStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(FOR);
				setState(580);
				exp(0);
				setState(581);
				match(EQ);
				setState(582);
				exp(0);
				setState(583);
				match(COLON);
				setState(584);
				exp(0);
				setState(585);
				match(COLON);
				setState(586);
				exp(0);
				setState(588); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(587);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(590); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(592);
				match(END);
				}
				break;
			case 3:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(FOR);
				setState(595);
				exp(0);
				setState(596);
				match(IN);
				setState(597);
				exp(0);
				setState(599); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(598);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(601); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(603);
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
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(WHILE);
			setState(608);
			exp(0);
			setState(610); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(609);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(612); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(614);
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
		enterRule(_localctx, 26, RULE_name);
		try {
			int _alt;
			_localctx = new NnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(ID);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(DOT);
					setState(618);
					match(ID);
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 87);
		case 1:
			return precpred(_ctx, 86);
		case 2:
			return precpred(_ctx, 85);
		case 3:
			return precpred(_ctx, 84);
		case 4:
			return precpred(_ctx, 83);
		case 5:
			return precpred(_ctx, 82);
		case 6:
			return precpred(_ctx, 81);
		case 7:
			return precpred(_ctx, 80);
		case 8:
			return precpred(_ctx, 79);
		case 9:
			return precpred(_ctx, 78);
		case 10:
			return precpred(_ctx, 77);
		case 11:
			return precpred(_ctx, 76);
		case 12:
			return precpred(_ctx, 75);
		case 13:
			return precpred(_ctx, 74);
		case 14:
			return precpred(_ctx, 73);
		case 15:
			return precpred(_ctx, 71);
		case 16:
			return precpred(_ctx, 70);
		case 17:
			return precpred(_ctx, 62);
		case 18:
			return precpred(_ctx, 61);
		case 19:
			return precpred(_ctx, 60);
		case 20:
			return precpred(_ctx, 59);
		case 21:
			return precpred(_ctx, 58);
		case 22:
			return precpred(_ctx, 57);
		case 23:
			return precpred(_ctx, 56);
		case 24:
			return precpred(_ctx, 55);
		case 25:
			return precpred(_ctx, 54);
		case 26:
			return precpred(_ctx, 53);
		case 27:
			return precpred(_ctx, 52);
		case 28:
			return precpred(_ctx, 51);
		case 29:
			return precpred(_ctx, 50);
		case 30:
			return precpred(_ctx, 49);
		case 31:
			return precpred(_ctx, 48);
		case 32:
			return precpred(_ctx, 47);
		case 33:
			return precpred(_ctx, 28);
		case 34:
			return precpred(_ctx, 27);
		case 35:
			return precpred(_ctx, 46);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3q\u0273\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4"+
		"\f\4\16\4\67\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4"+
		"\3\4\3\4\6\4G\n\4\r\4\16\4H\3\4\3\4\3\4\3\4\3\4\6\4P\n\4\r\4\16\4Q\3\4"+
		"\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5g\n\5\f\5\16\5j\13\5\3\5\5\5m\n\5\3\5\6\5p\n\5\r\5\16\5q\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5z\n\5\3\5\3\5\3\5\3\5\7\5\u0080\n\5\f\5\16\5\u0083"+
		"\13\5\3\5\3\5\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\7\5\u008d\n\5\f\5"+
		"\16\5\u0090\13\5\3\5\3\5\7\5\u0094\n\5\f\5\16\5\u0097\13\5\5\5\u0099\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\5\3\5\3\5\3\5\7\5\u00a9"+
		"\n\5\f\5\16\5\u00ac\13\5\3\5\5\5\u00af\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u00b8\n\5\f\5\16\5\u00bb\13\5\3\5\5\5\u00be\n\5\3\5\6\5\u00c1\n\5"+
		"\r\5\16\5\u00c2\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00cd\n\5\r\5\16\5"+
		"\u00ce\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e8\n\5\f\5\16\5\u00eb\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5\u00f4\n\5\f\5\16\5\u00f7\13\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0114\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0184\n\5"+
		"\f\5\16\5\u0187\13\5\3\6\3\6\5\6\u018b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0194\n\6\3\6\3\6\6\6\u0198\n\6\r\6\16\6\u0199\3\6\3\6\5\6\u019e"+
		"\n\6\3\7\3\7\3\7\3\7\7\7\u01a4\n\7\f\7\16\7\u01a7\13\7\5\7\u01a9\n\7\3"+
		"\7\5\7\u01ac\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b6\n\b\3\t\3\t"+
		"\3\t\5\t\u01bb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u01cf\n\t\3\t\3\t\3\t\5\t\u01d4\n\t\3\t\7\t\u01d7"+
		"\n\t\f\t\16\t\u01da\13\t\3\t\7\t\u01dd\n\t\f\t\16\t\u01e0\13\t\3\t\3\t"+
		"\3\t\3\t\5\t\u01e6\n\t\3\t\7\t\u01e9\n\t\f\t\16\t\u01ec\13\t\3\t\7\t\u01ef"+
		"\n\t\f\t\16\t\u01f2\13\t\3\t\3\t\3\t\3\t\5\t\u01f8\n\t\3\t\7\t\u01fb\n"+
		"\t\f\t\16\t\u01fe\13\t\3\t\7\t\u0201\n\t\f\t\16\t\u0204\13\t\3\t\3\t\3"+
		"\t\3\t\5\t\u020a\n\t\3\t\3\t\3\t\5\t\u020f\n\t\3\t\7\t\u0212\n\t\f\t\16"+
		"\t\u0215\13\t\3\t\7\t\u0218\n\t\f\t\16\t\u021b\13\t\3\t\5\t\u021e\n\t"+
		"\3\n\3\n\3\n\3\n\5\n\u0224\n\n\3\13\3\13\3\13\3\13\7\13\u022a\n\13\f\13"+
		"\16\13\u022d\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0237\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0240\n\r\r\r\16\r\u0241\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u024f\n\r\r\r\16\r\u0250\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\6\r\u025a\n\r\r\r\16\r\u025b\3\r\3\r\5\r\u0260\n\r\3"+
		"\16\3\16\3\16\6\16\u0265\n\16\r\16\16\16\u0266\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u026e\n\17\f\17\16\17\u0271\13\17\3\17\2\3\b\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\3\4\2`acc\u0309\2 \3\2\2\2\4)\3\2\2\2\6U\3\2\2\2"+
		"\b\u0113\3\2\2\2\n\u019d\3\2\2\2\f\u019f\3\2\2\2\16\u01b5\3\2\2\2\20\u021d"+
		"\3\2\2\2\22\u0223\3\2\2\2\24\u0225\3\2\2\2\26\u0236\3\2\2\2\30\u025f\3"+
		"\2\2\2\32\u0261\3\2\2\2\34\u026a\3\2\2\2\36!\5\6\4\2\37!\5\4\3\2 \36\3"+
		"\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$*\5\20"+
		"\t\2%*\5\30\r\2&*\5\32\16\2\'*\5\n\6\2(*\5\b\5\2)$\3\2\2\2)%\3\2\2\2)"+
		"&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\"\2\2,V\7k\2\2-.\7#\2\2"+
		"./\7k\2\2/\60\7$\2\2\60\65\7k\2\2\61\62\7%\2\2\62\64\7k\2\2\63\61\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66V\3\2\2\2\67\65\3\2\2"+
		"\289\7&\2\29V\7k\2\2:;\7\'\2\2;@\7k\2\2<=\7%\2\2=?\7k\2\2><\3\2\2\2?B"+
		"\3\2\2\2@>\3\2\2\2@A\3\2\2\2AV\3\2\2\2B@\3\2\2\2CD\7(\2\2DF\7k\2\2EG\5"+
		"\4\3\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7)\2\2KV\3"+
		"\2\2\2LM\7*\2\2MO\7k\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2ST\7)\2\2TV\3\2\2\2U+\3\2\2\2U-\3\2\2\2U8\3\2\2\2U:\3\2"+
		"\2\2UC\3\2\2\2UL\3\2\2\2V\7\3\2\2\2WX\b\5\1\2XY\7\64\2\2Y\u0114\5\b\5"+
		"\\Z[\7@\2\2[\u0114\5\b\5J\\]\7!\2\2]^\7k\2\2^_\7\7\2\2_\u0114\5\b\5\16"+
		"`a\7\33\2\2a\u0114\5\b\5\4bh\7Q\2\2cd\5\b\5\2de\7%\2\2eg\3\2\2\2fc\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\b\5\2lk\3\2"+
		"\2\2lm\3\2\2\2mn\3\2\2\2np\7R\2\2ob\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2r\u0114\3\2\2\2sy\t\2\2\2tz\7k\2\2uv\7C\2\2vw\5\b\5\2wx\7D\2\2xz\3"+
		"\2\2\2yt\3\2\2\2yu\3\2\2\2z\u0114\3\2\2\2{\u0114\7)\2\2|}\7\35\2\2}\u0081"+
		"\5\b\5\2~\u0080\5\4\3\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u008e\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\7\36\2\2\u0085\u0089\5\b\5\2\u0086\u0088\5\4\3\2\u0087\u0086\3"+
		"\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0084\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0098\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0095\7\37\2\2\u0092\u0094\5\4\3\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7)\2\2\u009b\u0114\3\2\2\2\u009c"+
		"\u009d\7\32\2\2\u009d\u009e\5\b\5\2\u009e\u009f\7)\2\2\u009f\u0114\3\2"+
		"\2\2\u00a0\u00a2\5\34\17\2\u00a1\u00a3\5\24\13\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ae\7C\2\2\u00a5\u00a6\5\b"+
		"\5\2\u00a6\u00a7\7%\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\5\b\5\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7D\2\2\u00b1\u0114\3\2"+
		"\2\2\u00b2\u00c0\5\34\17\2\u00b3\u00b9\7Q\2\2\u00b4\u00b5\5\b\5\2\u00b5"+
		"\u00b6\7%\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\5\b\5\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7R\2\2\u00c0\u00b3\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u0114\3\2"+
		"\2\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\5\b\5\2\u00c6\u00c7\7D\2\2\u00c7\u0114"+
		"\3\2\2\2\u00c8\u00cc\7C\2\2\u00c9\u00ca\5\b\5\2\u00ca\u00cb\7%\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5\b\5\2\u00d1"+
		"\u00d2\7D\2\2\u00d2\u0114\3\2\2\2\u00d3\u0114\7S\2\2\u00d4\u0114\7T\2"+
		"\2\u00d5\u0114\7U\2\2\u00d6\u0114\7V\2\2\u00d7\u0114\7W\2\2\u00d8\u0114"+
		"\7X\2\2\u00d9\u0114\7Y\2\2\u00da\u0114\7Z\2\2\u00db\u0114\7[\2\2\u00dc"+
		"\u0114\7\\\2\2\u00dd\u0114\7]\2\2\u00de\u0114\7^\2\2\u00df\u0114\7_\2"+
		"\2\u00e0\u0114\7`\2\2\u00e1\u0114\7a\2\2\u00e2\u00e3\7M\2\2\u00e3\u00e4"+
		"\7O\2\2\u00e4\u00e9\5\b\5\2\u00e5\u00e6\7%\2\2\u00e6\u00e8\5\b\5\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7P\2\2\u00ed"+
		"\u0114\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7O\2\2\u00f0\u00f5\5\b\5"+
		"\2\u00f1\u00f2\7%\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f9\7P\2\2\u00f9\u0114\3\2\2\2\u00fa\u0114\5\34"+
		"\17\2\u00fb\u0114\7k\2\2\u00fc\u0114\7b\2\2\u00fd\u0114\7E\2\2\u00fe\u0114"+
		"\7F\2\2\u00ff\u0114\7c\2\2\u0100\u0114\7d\2\2\u0101\u0114\7e\2\2\u0102"+
		"\u0114\7f\2\2\u0103\u0114\7g\2\2\u0104\u0114\7i\2\2\u0105\u0114\7l\2\2"+
		"\u0106\u0114\7m\2\2\u0107\u0108\7$\2\2\u0108\u0114\7k\2\2\u0109\u0114"+
		"\7+\2\2\u010a\u0114\7,\2\2\u010b\u0114\7-\2\2\u010c\u0114\7.\2\2\u010d"+
		"\u0114\7/\2\2\u010e\u0114\7\60\2\2\u010f\u0114\7\61\2\2\u0110\u0114\7"+
		"\62\2\2\u0111\u0114\7\63\2\2\u0112\u0114\7\33\2\2\u0113W\3\2\2\2\u0113"+
		"Z\3\2\2\2\u0113\\\3\2\2\2\u0113`\3\2\2\2\u0113o\3\2\2\2\u0113s\3\2\2\2"+
		"\u0113{\3\2\2\2\u0113|\3\2\2\2\u0113\u009c\3\2\2\2\u0113\u00a0\3\2\2\2"+
		"\u0113\u00b2\3\2\2\2\u0113\u00c4\3\2\2\2\u0113\u00c8\3\2\2\2\u0113\u00d3"+
		"\3\2\2\2\u0113\u00d4\3\2\2\2\u0113\u00d5\3\2\2\2\u0113\u00d6\3\2\2\2\u0113"+
		"\u00d7\3\2\2\2\u0113\u00d8\3\2\2\2\u0113\u00d9\3\2\2\2\u0113\u00da\3\2"+
		"\2\2\u0113\u00db\3\2\2\2\u0113\u00dc\3\2\2\2\u0113\u00dd\3\2\2\2\u0113"+
		"\u00de\3\2\2\2\u0113\u00df\3\2\2\2\u0113\u00e0\3\2\2\2\u0113\u00e1\3\2"+
		"\2\2\u0113\u00e2\3\2\2\2\u0113\u00ee\3\2\2\2\u0113\u00fa\3\2\2\2\u0113"+
		"\u00fb\3\2\2\2\u0113\u00fc\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u00fe\3\2"+
		"\2\2\u0113\u00ff\3\2\2\2\u0113\u0100\3\2\2\2\u0113\u0101\3\2\2\2\u0113"+
		"\u0102\3\2\2\2\u0113\u0103\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0105\3\2"+
		"\2\2\u0113\u0106\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u0109\3\2\2\2\u0113"+
		"\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010d\3\2"+
		"\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0185\3\2\2\2\u0115\u0116\fY"+
		"\2\2\u0116\u0117\7\65\2\2\u0117\u0184\5\b\5Z\u0118\u0119\fX\2\2\u0119"+
		"\u011a\7\66\2\2\u011a\u0184\5\b\5X\u011b\u011c\fW\2\2\u011c\u011d\7\67"+
		"\2\2\u011d\u0184\5\b\5X\u011e\u011f\fV\2\2\u011f\u0120\78\2\2\u0120\u0184"+
		"\5\b\5W\u0121\u0122\fU\2\2\u0122\u0123\7\17\2\2\u0123\u0184\5\b\5V\u0124"+
		"\u0125\fT\2\2\u0125\u0126\79\2\2\u0126\u0184\5\b\5U\u0127\u0128\fS\2\2"+
		"\u0128\u0129\7:\2\2\u0129\u0184\5\b\5T\u012a\u012b\fR\2\2\u012b\u012c"+
		"\7\64\2\2\u012c\u0184\5\b\5S\u012d\u012e\fQ\2\2\u012e\u012f\7<\2\2\u012f"+
		"\u0184\5\b\5R\u0130\u0131\fP\2\2\u0131\u0132\7=\2\2\u0132\u0184\5\b\5"+
		"Q\u0133\u0134\fO\2\2\u0134\u0135\7>\2\2\u0135\u0184\5\b\5P\u0136\u0137"+
		"\fN\2\2\u0137\u0138\7?\2\2\u0138\u0184\5\b\5O\u0139\u013a\fM\2\2\u013a"+
		"\u013b\7\6\2\2\u013b\u0184\5\b\5N\u013c\u013d\fL\2\2\u013d\u013e\7H\2"+
		"\2\u013e\u0184\5\b\5M\u013f\u0140\fK\2\2\u0140\u0141\7\30\2\2\u0141\u0142"+
		"\5\b\5\2\u0142\u0143\7$\2\2\u0143\u0144\5\b\5L\u0144\u0184\3\2\2\2\u0145"+
		"\u0146\fI\2\2\u0146\u0147\7A\2\2\u0147\u0184\5\b\5J\u0148\u0149\fH\2\2"+
		"\u0149\u014a\7B\2\2\u014a\u0184\5\b\5I\u014b\u014c\f@\2\2\u014c\u014d"+
		"\7;\2\2\u014d\u0184\5\b\5A\u014e\u014f\f?\2\2\u014f\u0150\7\7\2\2\u0150"+
		"\u0184\5\b\5@\u0151\u0152\f>\2\2\u0152\u0153\7\t\2\2\u0153\u0184\5\b\5"+
		"?\u0154\u0155\f=\2\2\u0155\u0156\7\n\2\2\u0156\u0184\5\b\5>\u0157\u0158"+
		"\f<\2\2\u0158\u0159\7\13\2\2\u0159\u0184\5\b\5=\u015a\u015b\f;\2\2\u015b"+
		"\u015c\7\f\2\2\u015c\u0184\5\b\5<\u015d\u015e\f:\2\2\u015e\u015f\7\r\2"+
		"\2\u015f\u0184\5\b\5;\u0160\u0161\f9\2\2\u0161\u0162\7\16\2\2\u0162\u0184"+
		"\5\b\5:\u0163\u0164\f8\2\2\u0164\u0165\7\20\2\2\u0165\u0184\5\b\59\u0166"+
		"\u0167\f\67\2\2\u0167\u0168\7\21\2\2\u0168\u0184\5\b\58\u0169\u016a\f"+
		"\66\2\2\u016a\u016b\7\22\2\2\u016b\u0184\5\b\5\67\u016c\u016d\f\65\2\2"+
		"\u016d\u016e\7\23\2\2\u016e\u0184\5\b\5\66\u016f\u0170\f\64\2\2\u0170"+
		"\u0171\7\24\2\2\u0171\u0184\5\b\5\65\u0172\u0173\f\63\2\2\u0173\u0174"+
		"\7\25\2\2\u0174\u0184\5\b\5\64\u0175\u0176\f\62\2\2\u0176\u0177\7\27\2"+
		"\2\u0177\u0184\5\b\5\63\u0178\u0179\f\61\2\2\u0179\u017a\7\b\2\2\u017a"+
		"\u0184\5\b\5\62\u017b\u017c\f\36\2\2\u017c\u017d\7$\2\2\u017d\u0184\5"+
		"\b\5\37\u017e\u017f\f\35\2\2\u017f\u0180\7\5\2\2\u0180\u0184\5\b\5\35"+
		"\u0181\u0182\f\60\2\2\u0182\u0184\7\26\2\2\u0183\u0115\3\2\2\2\u0183\u0118"+
		"\3\2\2\2\u0183\u011b\3\2\2\2\u0183\u011e\3\2\2\2\u0183\u0121\3\2\2\2\u0183"+
		"\u0124\3\2\2\2\u0183\u0127\3\2\2\2\u0183\u012a\3\2\2\2\u0183\u012d\3\2"+
		"\2\2\u0183\u0130\3\2\2\2\u0183\u0133\3\2\2\2\u0183\u0136\3\2\2\2\u0183"+
		"\u0139\3\2\2\2\u0183\u013c\3\2\2\2\u0183\u013f\3\2\2\2\u0183\u0145\3\2"+
		"\2\2\u0183\u0148\3\2\2\2\u0183\u014b\3\2\2\2\u0183\u014e\3\2\2\2\u0183"+
		"\u0151\3\2\2\2\u0183\u0154\3\2\2\2\u0183\u0157\3\2\2\2\u0183\u015a\3\2"+
		"\2\2\u0183\u015d\3\2\2\2\u0183\u0160\3\2\2\2\u0183\u0163\3\2\2\2\u0183"+
		"\u0166\3\2\2\2\u0183\u0169\3\2\2\2\u0183\u016c\3\2\2\2\u0183\u016f\3\2"+
		"\2\2\u0183\u0172\3\2\2\2\u0183\u0175\3\2\2\2\u0183\u0178\3\2\2\2\u0183"+
		"\u017b\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\t\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u018a\5\34\17\2\u0189\u018b\5\24\13\2\u018a\u0189\3\2\2"+
		"\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\5\f\7\2\u018d\u018e"+
		"\7\7\2\2\u018e\u018f\5\4\3\2\u018f\u019e\3\2\2\2\u0190\u0191\7N\2\2\u0191"+
		"\u0193\5\34\17\2\u0192\u0194\5\24\13\2\u0193\u0192\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\5\f\7\2\u0196\u0198\5\4\3\2\u0197"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7)\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0188\3\2\2\2\u019d\u0190\3\2\2\2\u019e\13\3\2\2\2\u019f\u01a8\7C\2\2"+
		"\u01a0\u01a5\5\16\b\2\u01a1\u01a2\7%\2\2\u01a2\u01a4\5\16\b\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\7\26\2\2\u01ab\u01aa\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7D\2\2\u01ae\r\3\2\2\2"+
		"\u01af\u01b0\7k\2\2\u01b0\u01b1\7\65\2\2\u01b1\u01b6\5\b\5\2\u01b2\u01b3"+
		"\7\65\2\2\u01b3\u01b6\5\b\5\2\u01b4\u01b6\7k\2\2\u01b5\u01af\3\2\2\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\17\3\2\2\2\u01b7\u01b8\7J\2\2"+
		"\u01b8\u01ba\7k\2\2\u01b9\u01bb\5\24\13\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u021e\5\b\5\2\u01bd\u01be\7G\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7H\2\2\u01c0\u021e\7k\2\2\u01c1\u01c2\7G\2\2"+
		"\u01c2\u021e\7k\2\2\u01c3\u01c4\7I\2\2\u01c4\u01c5\7q\2\2\u01c5\u01c6"+
		"\7k\2\2\u01c6\u01c7\7H\2\2\u01c7\u021e\7k\2\2\u01c8\u01c9\7I\2\2\u01c9"+
		"\u01ca\7q\2\2\u01ca\u021e\7k\2\2\u01cb\u01cc\7K\2\2\u01cc\u01ce\7k\2\2"+
		"\u01cd\u01cf\5\24\13\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\7H\2\2\u01d1\u01d3\7k\2\2\u01d2\u01d4\5\24\13\2\u01d3"+
		"\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d8\3\2\2\2\u01d5\u01d7\5\22"+
		"\n\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01de\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5\n"+
		"\6\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u021e\7)"+
		"\2\2\u01e2\u01e3\7K\2\2\u01e3\u01e5\7k\2\2\u01e4\u01e6\5\24\13\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01ea\3\2\2\2\u01e7\u01e9\5\22"+
		"\n\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01f0\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\5\n"+
		"\6\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u021e\7)"+
		"\2\2\u01f4\u01f5\7L\2\2\u01f5\u01f7\7k\2\2\u01f6\u01f8\5\24\13\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fb\5\22"+
		"\n\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u0202\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0201\5\n"+
		"\6\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u021e\7)"+
		"\2\2\u0206\u0207\7L\2\2\u0207\u0209\7k\2\2\u0208\u020a\5\24\13\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7H"+
		"\2\2\u020c\u020e\7k\2\2\u020d\u020f\5\24\13\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0213\3\2\2\2\u0210\u0212\5\22\n\2\u0211\u0210\3"+
		"\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0219\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0218\5\n\6\2\u0217\u0216\3\2"+
		"\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021e\7)\2\2\u021d\u01b7\3\2"+
		"\2\2\u021d\u01bd\3\2\2\2\u021d\u01c1\3\2\2\2\u021d\u01c3\3\2\2\2\u021d"+
		"\u01c8\3\2\2\2\u021d\u01cb\3\2\2\2\u021d\u01e2\3\2\2\2\u021d\u01f4\3\2"+
		"\2\2\u021d\u0206\3\2\2\2\u021e\21\3\2\2\2\u021f\u0220\7k\2\2\u0220\u0221"+
		"\7\65\2\2\u0221\u0224\5\b\5\2\u0222\u0224\7k\2\2\u0223\u021f\3\2\2\2\u0223"+
		"\u0222\3\2\2\2\u0224\23\3\2\2\2\u0225\u0226\7O\2\2\u0226\u022b\5\26\f"+
		"\2\u0227\u0228\7%\2\2\u0228\u022a\5\26\f\2\u0229\u0227\3\2\2\2\u022a\u022d"+
		"\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u022f\7P\2\2\u022f\25\3\2\2\2\u0230\u0231\7k\2\2"+
		"\u0231\u0232\7H\2\2\u0232\u0237\5\b\5\2\u0233\u0234\7\65\2\2\u0234\u0237"+
		"\5\b\5\2\u0235\u0237\5\b\5\2\u0236\u0230\3\2\2\2\u0236\u0233\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\27\3\2\2\2\u0238\u0239\7 \2\2\u0239\u023a\5\b\5\2"+
		"\u023a\u023b\7\7\2\2\u023b\u023c\5\b\5\2\u023c\u023d\7$\2\2\u023d\u023f"+
		"\5\b\5\2\u023e\u0240\5\4\3\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7)"+
		"\2\2\u0244\u0260\3\2\2\2\u0245\u0246\7 \2\2\u0246\u0247\5\b\5\2\u0247"+
		"\u0248\7\7\2\2\u0248\u0249\5\b\5\2\u0249\u024a\7$\2\2\u024a\u024b\5\b"+
		"\5\2\u024b\u024c\7$\2\2\u024c\u024e\5\b\5\2\u024d\u024f\5\4\3\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7)\2\2\u0253\u0260\3\2\2\2\u0254"+
		"\u0255\7 \2\2\u0255\u0256\5\b\5\2\u0256\u0257\7\34\2\2\u0257\u0259\5\b"+
		"\5\2\u0258\u025a\5\4\3\2\u0259\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7)"+
		"\2\2\u025e\u0260\3\2\2\2\u025f\u0238\3\2\2\2\u025f\u0245\3\2\2\2\u025f"+
		"\u0254\3\2\2\2\u0260\31\3\2\2\2\u0261\u0262\7\31\2\2\u0262\u0264\5\b\5"+
		"\2\u0263\u0265\5\4\3\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7)\2\2\u0269"+
		"\33\3\2\2\2\u026a\u026f\7k\2\2\u026b\u026c\7\4\2\2\u026c\u026e\7k\2\2"+
		"\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\35\3\2\2\2\u0271\u026f\3\2\2\2@ \")\65@HQUhlqy\u0081\u0089"+
		"\u008e\u0095\u0098\u00a2\u00aa\u00ae\u00b9\u00bd\u00c2\u00ce\u00e9\u00f5"+
		"\u0113\u0183\u0185\u018a\u0193\u0199\u019d\u01a5\u01a8\u01ab\u01b5\u01ba"+
		"\u01ce\u01d3\u01d8\u01de\u01e5\u01ea\u01f0\u01f7\u01fc\u0202\u0209\u020e"+
		"\u0213\u0219\u021d\u0223\u022b\u0236\u0241\u0250\u025b\u025f\u0266\u026f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}