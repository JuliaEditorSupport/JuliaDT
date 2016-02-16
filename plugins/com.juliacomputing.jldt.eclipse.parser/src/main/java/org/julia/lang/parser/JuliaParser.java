// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, MINUS=7, NOT=8, BITWISE_NOT=9, 
		SUB_TYPE=10, AMPERSAND=11, ASSIGNMENT_OPERATOR=12, CONDITIONAL_OPERATOR=13, 
		ARROW_OPERATOR=14, RELATIONAL_OPERATOR=15, PIPE_OPERATOR=16, INSTANCE_OF=17, 
		COLON=18, PLUS=19, ADDITIVE_OPERATOR=20, BIT_SHIFT_OPERATOR=21, TIMES=22, 
		MULTIPLICATIVE_OPERATOR=23, RATIONAL_OPERATOR=24, POWER_OPERATOR=25, EQ=26, 
		DOLLAR=27, DOT=28, BEGIN=29, WHILE=30, IMPORT_ALL=31, IMPORT=32, IF=33, 
		FOR=34, TRY=35, RETURN=36, BREAK=37, CONTINUE=38, FUNCTION=39, STAGED_FUNCTION=40, 
		MACRO=41, QUOTE=42, LET=43, LOCAL=44, GLOBAL=45, CONST=46, ABSTRACT=47, 
		TYPE_ALIAS=48, TYPE=49, BITS_TYPE=50, IMMUTABLE=51, CCALL=52, MODULE=53, 
		BARE_MODULE=54, USING=55, EXPORT=56, DO=57, CATCH=58, ARROW=59, AT=60, 
		SEMI_COLON=61, ELLIPSE=62, ELSE_IF=63, ELSE=64, COMMA=65, END=66, END_LITERAL=67, 
		INF16=68, INF32=69, INF=70, MINUS_INF16=71, MINUS_INF32=72, MINUS_INF=73, 
		NAN16=74, NAN32=75, NAN=76, LEFT_PARENTHESIS=77, RIGHT_PARENTHESIS=78, 
		LEFT_BRACE=79, RIGHT_BRACE=80, LEFT_BRACKET=81, RIGHT_BRACKET=82, REGEX=83, 
		INT_LITERAL=84, BINARY=85, OCTAL=86, HEX=87, FLOAT32_LITERAL=88, FLOAT64_LITERAL=89, 
		FQN=90, ID=91, CHARACTER_LITERAL=92, STRING=93, WS=94, EOL=95, COMMENT=96, 
		LINE_COMMENT=97, SIZE=98;
	public static final int
		RULE_unit = 0, RULE_block = 1, RULE_statement = 2, RULE_moduleDeclaration = 3, 
		RULE_macroDeclaration = 4, RULE_exp = 5, RULE_typeExpression = 6, RULE_functionDeclaration = 7, 
		RULE_parameters = 8, RULE_parameter = 9, RULE_typeDeclaration = 10, RULE_fieldDeclaration = 11, 
		RULE_typeParameters = 12, RULE_typeParameter = 13, RULE_name = 14;
	public static final String[] ruleNames = {
		"unit", "block", "statement", "moduleDeclaration", "macroDeclaration", 
		"exp", "typeExpression", "functionDeclaration", "parameters", "parameter", 
		"typeDeclaration", "fieldDeclaration", "typeParameters", "typeParameter", 
		"name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'true'", "'false'", "'Union'", "'||'", "'&&'", "'-'", "'!'", 
		"'~'", "'<:'", "'&'", null, "'?'", null, null, null, "'::'", "':'", "'+'", 
		null, null, "'*'", null, null, null, "'='", "'$'", "'.'", "'begin'", "'while'", 
		"'importall'", "'import'", "'if'", "'for'", "'try'", "'return'", "'break'", 
		"'continue'", "'function'", "'stagedfunction'", "'macro'", "'quote'", 
		"'let'", "'local'", "'global'", "'const'", "'abstract'", "'typealias'", 
		"'type'", "'bitstype'", "'immutable'", "'ccall'", "'module'", "'baremodule'", 
		"'using'", "'export'", "'do'", "'catch'", "'->'", "'@'", "';'", "'...'", 
		"'elseif'", "'else'", "','", null, null, "'Inf16'", "'Inf32'", "'Inf'", 
		"'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "AMPERSAND", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", 
		"ARROW_OPERATOR", "RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", 
		"COLON", "PLUS", "ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "ARROW", 
		"AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", "END_LITERAL", 
		"INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", 
		"NAN32", "NAN", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "FLOAT64_LITERAL", "FQN", 
		"ID", "CHARACTER_LITERAL", "STRING", "WS", "EOL", "COMMENT", "LINE_COMMENT", 
		"SIZE"
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
	public String getGrammarFileName() { return "Julia.g4"; }

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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IMPORT_ALL) | (1L << IMPORT) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << FUNCTION) | (1L << MACRO) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << ABSTRACT) | (1L << TYPE_ALIAS) | (1L << TYPE) | (1L << BITS_TYPE) | (1L << IMMUTABLE) | (1L << CCALL) | (1L << MODULE) | (1L << BARE_MODULE) | (1L << USING) | (1L << EXPORT) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)) | (1L << (EOL - 67)))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(JuliaParser.USING, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public TerminalNode IMPORT() { return getToken(JuliaParser.IMPORT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public TerminalNode IMPORT_ALL() { return getToken(JuliaParser.IMPORT_ALL, 0); }
		public TerminalNode EXPORT() { return getToken(JuliaParser.EXPORT, 0); }
		public ModuleDeclarationContext moduleDeclaration() {
			return getRuleContext(ModuleDeclarationContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public MacroDeclarationContext macroDeclaration() {
			return getRuleContext(MacroDeclarationContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode EOL() { return getToken(JuliaParser.EOL, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(USING);
				setState(39);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(IMPORT);
				setState(41);
				name();
				setState(42);
				match(COLON);
				setState(43);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(44);
					match(COMMA);
					setState(45);
					match(ID);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(IMPORT);
				setState(52);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(IMPORT_ALL);
				setState(54);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(EXPORT);
				setState(56);
				match(ID);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(57);
					match(COMMA);
					setState(58);
					match(ID);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				moduleDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				typeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				macroDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				exp(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				match(EOL);
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

	public static class ModuleDeclarationContext extends ParserRuleContext {
		public ModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDeclaration; }
	 
		public ModuleDeclarationContext() { }
		public void copyFrom(ModuleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModuleContext extends ModuleDeclarationContext {
		public TerminalNode MODULE() { return getToken(JuliaParser.MODULE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public ModuleContext(ModuleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BareModuleContext extends ModuleDeclarationContext {
		public TerminalNode BARE_MODULE() { return getToken(JuliaParser.BARE_MODULE, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public BareModuleContext(ModuleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBareModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBareModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBareModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDeclarationContext moduleDeclaration() throws RecognitionException {
		ModuleDeclarationContext _localctx = new ModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleDeclaration);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case MODULE:
				_localctx = new ModuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(MODULE);
				setState(73);
				match(ID);
				setState(74);
				block();
				setState(75);
				match(END);
				}
				break;
			case BARE_MODULE:
				_localctx = new BareModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(BARE_MODULE);
				setState(78);
				match(ID);
				setState(79);
				block();
				setState(80);
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

	public static class MacroDeclarationContext extends ParserRuleContext {
		public TerminalNode MACRO() { return getToken(JuliaParser.MACRO, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public MacroDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMacroDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMacroDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMacroDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroDeclarationContext macroDeclaration() throws RecognitionException {
		MacroDeclarationContext _localctx = new MacroDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_macroDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(MACRO);
			setState(85);
			match(ID);
			setState(86);
			parameters();
			setState(87);
			block();
			setState(88);
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
		public TtContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SymbolContext extends ExpContext {
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public SymbolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OctalContext extends ExpContext {
		public TerminalNode OCTAL() { return getToken(JuliaParser.OCTAL, 0); }
		public OctalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterOctal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitOctal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitOctal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nan32Context extends ExpContext {
		public TerminalNode NAN32() { return getToken(JuliaParser.NAN32, 0); }
		public Nan32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNan32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNan32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNan32(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEqContext extends ExpContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> COLON() { return getTokens(JuliaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JuliaParser.COLON, i);
		}
		public ForEqContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterForEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitForEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitForEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ARROW_OPERATOR() { return getToken(JuliaParser.ARROW_OPERATOR, 0); }
		public ArrowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitArrow(this);
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
		public TerminalNode CONDITIONAL_OPERATOR() { return getToken(JuliaParser.CONDITIONAL_OPERATOR, 0); }
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public TernaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTernaryConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTernaryConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTernaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULTIPLICATIVE_OPERATOR() { return getToken(JuliaParser.MULTIPLICATIVE_OPERATOR, 0); }
		public MultiplicativeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExpContext {
		public TerminalNode WHILE() { return getToken(JuliaParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public WhileContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitWhile(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterApplyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitApplyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitApplyFunction(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveBlockContext extends ExpContext {
		public TerminalNode BEGIN() { return getToken(JuliaParser.BEGIN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public PrimitiveBlockContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterPrimitiveBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitPrimitiveBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitPrimitiveBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitwiseNotContext extends ExpContext {
		public TerminalNode BITWISE_NOT() { return getToken(JuliaParser.BITWISE_NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BitwiseNotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBitwiseNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBitwiseNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBitwiseNot(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuoteContext extends ExpContext {
		public TerminalNode QUOTE() { return getToken(JuliaParser.QUOTE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public QuoteContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DollarExpContext extends ExpContext {
		public TerminalNode DOLLAR() { return getToken(JuliaParser.DOLLAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DollarExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterDollarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitDollarExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitDollarExp(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexContext extends ExpContext {
		public TerminalNode HEX() { return getToken(JuliaParser.HEX, 0); }
		public HexContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NanContext extends ExpContext {
		public TerminalNode NAN() { return getToken(JuliaParser.NAN, 0); }
		public NanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNan(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ffloat32Context extends ExpContext {
		public TerminalNode FLOAT32_LITERAL() { return getToken(JuliaParser.FLOAT32_LITERAL, 0); }
		public Ffloat32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterFfloat32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitFfloat32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitFfloat32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInContext extends ExpContext {
		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public ForInContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterForIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitForIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitForIn(this);
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
		public TerminalNode POWER_OPERATOR() { return getToken(JuliaParser.POWER_OPERATOR, 0); }
		public ExponentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterExponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitExponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExpContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public IdentifierContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitShiftContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode BIT_SHIFT_OPERATOR() { return getToken(JuliaParser.BIT_SHIFT_OPERATOR, 0); }
		public BitShiftContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBitShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBitShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBitShift(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Inf32TypeContext extends ExpContext {
		public TerminalNode INF32() { return getToken(JuliaParser.INF32, 0); }
		public Inf32TypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterInf32Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitInf32Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitInf32Type(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterImplicitTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitImplicitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitImplicitTuple(this);
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
		public InContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchContext extends ExpContext {
		public TerminalNode TRY() { return getToken(JuliaParser.TRY, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(JuliaParser.CATCH, 0); }
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TryCatchContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTryCatch(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTbc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTbc1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTbc1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LazyOrContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(JuliaParser.OR, 0); }
		public LazyOrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterLazyOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitLazyOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitLazyOr(this);
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
		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }
		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }
		public ComprehensionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitComprehension(this);
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
		public List<TerminalNode> PLUS() { return getTokens(JuliaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JuliaParser.PLUS, i);
		}
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequenceContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMI_COLON() { return getToken(JuliaParser.SEMI_COLON, 0); }
		public SequenceContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegexContext extends ExpContext {
		public TerminalNode REGEX() { return getToken(JuliaParser.REGEX, 0); }
		public RegexContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInf32Context extends ExpContext {
		public TerminalNode MINUS_INF32() { return getToken(JuliaParser.MINUS_INF32, 0); }
		public MinusInf32Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMinusInf32(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMinusInf32(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMinusInf32(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryContext extends ExpContext {
		public TerminalNode BINARY() { return getToken(JuliaParser.BINARY, 0); }
		public BinaryContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBinary(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubTypeContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public SubTypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterSubType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitSubType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitSubType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndLiteralContext extends ExpContext {
		public TerminalNode END_LITERAL() { return getToken(JuliaParser.END_LITERAL, 0); }
		public EndLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterEndLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitEndLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitEndLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nan16Context extends ExpContext {
		public TerminalNode NAN16() { return getToken(JuliaParser.NAN16, 0); }
		public Nan16Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNan16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNan16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNan16(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InvokeMacroContext extends ExpContext {
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
		public InvokeMacroContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterInvokeMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitInvokeMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitInvokeMacro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisedContext extends ExpContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public ParenthesisedContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterParenthesised(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitParenthesised(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitParenthesised(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyTupleContext extends ExpContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public EmptyTupleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterEmptyTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitEmptyTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitEmptyTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FfContext extends ExpContext {
		public FfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterFf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitFf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitFf(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharaacterContext extends ExpContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(JuliaParser.CHARACTER_LITERAL, 0); }
		public CharaacterContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterCharaacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitCharaacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitCharaacter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpContext {
		public TerminalNode STRING() { return getToken(JuliaParser.STRING, 0); }
		public StringContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousFunctionContext extends ExpContext {
		public TerminalNode DO() { return getToken(JuliaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public AnonymousFunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DOT() { return getToken(JuliaParser.DOT, 0); }
		public DotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitDot(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalContext extends ExpContext {
		public TerminalNode GLOBAL() { return getToken(JuliaParser.GLOBAL, 0); }
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
		public GlobalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitGlobal(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTuple(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNot(this);
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
		public List<TerminalNode> TIMES() { return getTokens(JuliaParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(JuliaParser.TIMES, i);
		}
		public TimesContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AditiveContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(JuliaParser.ADDITIVE_OPERATOR, 0); }
		public AditiveContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAditive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LazyAndContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(JuliaParser.AND, 0); }
		public LazyAndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterLazyAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitLazyAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitLazyAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RationalContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RATIONAL_OPERATOR() { return getToken(JuliaParser.RATIONAL_OPERATOR, 0); }
		public RationalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterRational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitRational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitRational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CcallContext extends ExpContext {
		public TerminalNode CCALL() { return getToken(JuliaParser.CCALL, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(JuliaParser.LEFT_PARENTHESIS, 0); }
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
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(JuliaParser.RIGHT_PARENTHESIS, 0); }
		public CcallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterCcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitCcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitCcall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfContext extends ExpContext {
		public TerminalNode INF() { return getToken(JuliaParser.INF, 0); }
		public InfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitInf(this);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public List<TerminalNode> ELSE_IF() { return getTokens(JuliaParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(JuliaParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(JuliaParser.ELSE, 0); }
		public NaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNaryConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNaryConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends ExpContext {
		public TerminalNode BREAK() { return getToken(JuliaParser.BREAK, 0); }
		public BreakContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBreak(this);
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
		public TerminalNode PIPE_OPERATOR() { return getToken(JuliaParser.PIPE_OPERATOR, 0); }
		public ApplyPrecedngContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterApplyPrecedng(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitApplyPrecedng(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitApplyPrecedng(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuliaParser.ASSIGNMENT_OPERATOR, 0); }
		public AssignmentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Inf16TypeContext extends ExpContext {
		public TerminalNode INF16() { return getToken(JuliaParser.INF16, 0); }
		public Inf16TypeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterInf16Type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitInf16Type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitInf16Type(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpContext {
		public TerminalNode INT_LITERAL() { return getToken(JuliaParser.INT_LITERAL, 0); }
		public IntContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitInt(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTypedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTypedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTypedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleAssignmentContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }
		public SimpleAssignmentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterSimpleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitSimpleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitSimpleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInf16Context extends ExpContext {
		public TerminalNode MINUS_INF16() { return getToken(JuliaParser.MINUS_INF16, 0); }
		public MinusInf16Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMinusInf16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMinusInf16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMinusInf16(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusInfContext extends ExpContext {
		public TerminalNode MINUS_INF() { return getToken(JuliaParser.MINUS_INF, 0); }
		public MinusInfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMinusInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMinusInf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMinusInf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RELATIONAL_OPERATOR() { return getToken(JuliaParser.RELATIONAL_OPERATOR, 0); }
		public RelationalContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitRelational(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ffloat64Context extends ExpContext {
		public TerminalNode FLOAT64_LITERAL() { return getToken(JuliaParser.FLOAT64_LITERAL, 0); }
		public Ffloat64Context(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterFfloat64(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitFfloat64(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitFfloat64(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends ExpContext {
		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }
		public ReturnContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitReturn(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTtypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTtypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTtypeExpression(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(MINUS);
				setState(92);
				exp(79);
				}
				break;
			case 2:
				{
				_localctx = new UnaryPlusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(PLUS);
				setState(94);
				exp(78);
				}
				break;
			case 3:
				{
				_localctx = new SymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(COLON);
				setState(96);
				exp(77);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(NOT);
				setState(98);
				exp(76);
				}
				break;
			case 5:
				{
				_localctx = new BitwiseNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(BITWISE_NOT);
				setState(100);
				exp(75);
				}
				break;
			case 6:
				{
				_localctx = new DollarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(DOLLAR);
				setState(102);
				exp(74);
				}
				break;
			case 7:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(CONST);
				setState(104);
				match(ID);
				setState(105);
				match(EQ);
				setState(106);
				exp(14);
				}
				break;
			case 8:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(RETURN);
				setState(108);
				exp(3);
				}
				break;
			case 9:
				{
				_localctx = new GlobalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(GLOBAL);
				setState(110);
				exp(0);
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						match(COMMA);
						setState(112);
						exp(0);
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 10:
				{
				_localctx = new EndLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(END_LITERAL);
				}
				break;
			case 11:
				{
				_localctx = new NaryConditionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(IF);
				setState(120);
				exp(0);
				setState(121);
				block();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF) {
					{
					{
					setState(122);
					match(ELSE_IF);
					setState(123);
					exp(0);
					setState(124);
					block();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(131);
					match(ELSE);
					setState(132);
					block();
					}
				}

				setState(135);
				match(END);
				}
				break;
			case 12:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(LET);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						match(ID);
						setState(139);
						match(EQ);
						setState(140);
						exp(0);
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(146);
				statement();
				setState(147);
				match(END);
				}
				break;
			case 13:
				{
				_localctx = new PrimitiveBlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(BEGIN);
				setState(150);
				exp(0);
				setState(151);
				match(END);
				}
				break;
			case 14:
				{
				_localctx = new AnonymousFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(DO);
				setState(162);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(154);
							match(ID);
							setState(155);
							match(COMMA);
							}
							} 
						}
						setState(160);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(161);
					match(ID);
					}
					break;
				}
				setState(164);
				block();
				setState(165);
				match(END);
				}
				break;
			case 15:
				{
				_localctx = new InvokeMacroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(AT);
				setState(168);
				name();
				setState(169);
				match(LEFT_PARENTHESIS);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						exp(0);
						setState(171);
						match(COMMA);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(178);
					exp(0);
					}
				}

				setState(181);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 16:
				{
				_localctx = new InvokeMacroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(AT);
				setState(184);
				name();
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						exp(0);
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 17:
				{
				_localctx = new CcallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(CCALL);
				setState(192);
				match(LEFT_PARENTHESIS);
				setState(193);
				exp(0);
				setState(194);
				match(COMMA);
				setState(195);
				exp(0);
				setState(196);
				match(COMMA);
				setState(197);
				exp(0);
				setState(198);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 18:
				{
				_localctx = new TryCatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(TRY);
				setState(201);
				block();
				setState(202);
				match(CATCH);
				setState(203);
				block();
				setState(204);
				match(END);
				}
				break;
			case 19:
				{
				_localctx = new ForEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(FOR);
				setState(207);
				exp(0);
				setState(208);
				match(EQ);
				setState(209);
				exp(0);
				setState(212);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(210);
					match(COLON);
					setState(211);
					exp(0);
					}
					break;
				}
				setState(216);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(214);
					match(COLON);
					setState(215);
					exp(0);
					}
					break;
				}
				setState(218);
				block();
				setState(219);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new ForInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(FOR);
				setState(222);
				exp(0);
				setState(223);
				match(T__0);
				setState(224);
				exp(0);
				setState(225);
				block();
				setState(226);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				match(WHILE);
				setState(229);
				exp(0);
				setState(230);
				block();
				setState(231);
				match(END);
				}
				break;
			case 22:
				{
				_localctx = new BreakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(BREAK);
				}
				break;
			case 23:
				{
				_localctx = new QuoteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(QUOTE);
				setState(235);
				block();
				setState(236);
				match(END);
				}
				break;
			case 24:
				{
				_localctx = new EmptyTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(LEFT_PARENTHESIS);
				setState(239);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 25:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(LEFT_PARENTHESIS);
				setState(244); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(241);
						exp(0);
						setState(242);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(246); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(249);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(248);
					exp(0);
					}
				}

				setState(251);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 26:
				{
				_localctx = new ParenthesisedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(LEFT_PARENTHESIS);
				setState(254);
				exp(0);
				setState(255);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 27:
				{
				_localctx = new ApplyFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				name();
				setState(259);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(258);
					typeParameters();
					}
				}

				setState(261);
				match(LEFT_PARENTHESIS);
				setState(271);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(262);
							exp(0);
							setState(263);
							match(COMMA);
							}
							} 
						}
						setState(269);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(270);
					exp(0);
					}
				}

				setState(273);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 28:
				{
				_localctx = new EnumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(275);
						match(LEFT_BRACKET);
						setState(281);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(276);
								exp(0);
								setState(277);
								match(COMMA);
								}
								} 
							}
							setState(283);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
						}
						setState(285);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
							{
							setState(284);
							exp(0);
							}
						}

						setState(287);
						match(RIGHT_BRACKET);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 29:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(LEFT_BRACKET);
				setState(293);
				exp(0);
				setState(294);
				match(FOR);
				setState(295);
				exp(0);
				setState(296);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==EQ) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(297);
				exp(0);
				setState(300);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(298);
					match(COLON);
					setState(299);
					exp(0);
					}
				}

				setState(302);
				match(RIGHT_BRACKET);
				}
				break;
			case 30:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(ID);
				}
				break;
			case 31:
				{
				_localctx = new RegexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(305);
				match(REGEX);
				}
				break;
			case 32:
				{
				_localctx = new TtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__1);
				}
				break;
			case 33:
				{
				_localctx = new FfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(307);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(INT_LITERAL);
				}
				break;
			case 35:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(BINARY);
				}
				break;
			case 36:
				{
				_localctx = new OctalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(310);
				match(OCTAL);
				}
				break;
			case 37:
				{
				_localctx = new HexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(HEX);
				}
				break;
			case 38:
				{
				_localctx = new Ffloat32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(312);
				match(FLOAT32_LITERAL);
				}
				break;
			case 39:
				{
				_localctx = new Ffloat64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(FLOAT64_LITERAL);
				}
				break;
			case 40:
				{
				_localctx = new CharaacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314);
				match(CHARACTER_LITERAL);
				}
				break;
			case 41:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(STRING);
				}
				break;
			case 42:
				{
				_localctx = new SymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(COLON);
				setState(317);
				match(ID);
				}
				break;
			case 43:
				{
				_localctx = new Inf16TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				match(INF16);
				}
				break;
			case 44:
				{
				_localctx = new Inf32TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(INF32);
				}
				break;
			case 45:
				{
				_localctx = new InfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(INF);
				}
				break;
			case 46:
				{
				_localctx = new MinusInf16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(MINUS_INF16);
				}
				break;
			case 47:
				{
				_localctx = new MinusInf32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(MINUS_INF32);
				}
				break;
			case 48:
				{
				_localctx = new MinusInfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(MINUS_INF);
				}
				break;
			case 49:
				{
				_localctx = new Nan16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(NAN16);
				}
				break;
			case 50:
				{
				_localctx = new Nan32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				match(NAN32);
				}
				break;
			case 51:
				{
				_localctx = new NanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(NAN);
				}
				break;
			case 52:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(RETURN);
				}
				break;
			case 53:
				{
				_localctx = new TtypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				typeExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new DotContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 73))) throw new FailedPredicateException(this, "precpred(_ctx, 73)");
						setState(332);
						match(DOT);
						setState(333);
						exp(74);
						}
						break;
					case 2:
						{
						_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(334);
						if (!(precpred(_ctx, 71))) throw new FailedPredicateException(this, "precpred(_ctx, 71)");
						setState(335);
						match(POWER_OPERATOR);
						setState(336);
						exp(71);
						}
						break;
					case 3:
						{
						_localctx = new SubTypeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(337);
						if (!(precpred(_ctx, 70))) throw new FailedPredicateException(this, "precpred(_ctx, 70)");
						setState(338);
						match(SUB_TYPE);
						setState(339);
						exp(71);
						}
						break;
					case 4:
						{
						_localctx = new RationalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(340);
						if (!(precpred(_ctx, 69))) throw new FailedPredicateException(this, "precpred(_ctx, 69)");
						setState(341);
						match(RATIONAL_OPERATOR);
						setState(342);
						exp(70);
						}
						break;
					case 5:
						{
						_localctx = new MultiplicativeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(343);
						if (!(precpred(_ctx, 67))) throw new FailedPredicateException(this, "precpred(_ctx, 67)");
						setState(344);
						match(MULTIPLICATIVE_OPERATOR);
						setState(345);
						exp(68);
						}
						break;
					case 6:
						{
						_localctx = new BitShiftContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(346);
						if (!(precpred(_ctx, 66))) throw new FailedPredicateException(this, "precpred(_ctx, 66)");
						setState(347);
						match(BIT_SHIFT_OPERATOR);
						setState(348);
						exp(67);
						}
						break;
					case 7:
						{
						_localctx = new AditiveContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(349);
						if (!(precpred(_ctx, 64))) throw new FailedPredicateException(this, "precpred(_ctx, 64)");
						setState(350);
						match(ADDITIVE_OPERATOR);
						setState(351);
						exp(65);
						}
						break;
					case 8:
						{
						_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(352);
						if (!(precpred(_ctx, 63))) throw new FailedPredicateException(this, "precpred(_ctx, 63)");
						setState(353);
						match(MINUS);
						setState(354);
						exp(64);
						}
						break;
					case 9:
						{
						_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(355);
						if (!(precpred(_ctx, 62))) throw new FailedPredicateException(this, "precpred(_ctx, 62)");
						setState(356);
						match(COLON);
						setState(357);
						exp(63);
						}
						break;
					case 10:
						{
						_localctx = new ApplyPrecedngContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(358);
						if (!(precpred(_ctx, 61))) throw new FailedPredicateException(this, "precpred(_ctx, 61)");
						setState(359);
						match(PIPE_OPERATOR);
						setState(360);
						exp(62);
						}
						break;
					case 11:
						{
						_localctx = new RelationalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 60))) throw new FailedPredicateException(this, "precpred(_ctx, 60)");
						setState(362);
						match(RELATIONAL_OPERATOR);
						setState(363);
						exp(61);
						}
						break;
					case 12:
						{
						_localctx = new LazyAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(364);
						if (!(precpred(_ctx, 59))) throw new FailedPredicateException(this, "precpred(_ctx, 59)");
						setState(365);
						match(AND);
						setState(366);
						exp(60);
						}
						break;
					case 13:
						{
						_localctx = new LazyOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 58))) throw new FailedPredicateException(this, "precpred(_ctx, 58)");
						setState(368);
						match(OR);
						setState(369);
						exp(59);
						}
						break;
					case 14:
						{
						_localctx = new ArrowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 57))) throw new FailedPredicateException(this, "precpred(_ctx, 57)");
						setState(371);
						match(ARROW_OPERATOR);
						setState(372);
						exp(58);
						}
						break;
					case 15:
						{
						_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(373);
						if (!(precpred(_ctx, 56))) throw new FailedPredicateException(this, "precpred(_ctx, 56)");
						setState(374);
						match(CONDITIONAL_OPERATOR);
						setState(375);
						exp(0);
						setState(376);
						match(COLON);
						setState(377);
						exp(57);
						}
						break;
					case 16:
						{
						_localctx = new SimpleAssignmentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(379);
						if (!(precpred(_ctx, 55))) throw new FailedPredicateException(this, "precpred(_ctx, 55)");
						setState(380);
						match(EQ);
						setState(381);
						exp(56);
						}
						break;
					case 17:
						{
						_localctx = new AssignmentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(382);
						if (!(precpred(_ctx, 54))) throw new FailedPredicateException(this, "precpred(_ctx, 54)");
						setState(383);
						match(ASSIGNMENT_OPERATOR);
						setState(384);
						exp(55);
						}
						break;
					case 18:
						{
						_localctx = new LambdaContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(385);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(386);
						match(ARROW);
						setState(387);
						exp(53);
						}
						break;
					case 19:
						{
						_localctx = new InContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(388);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(389);
						match(T__0);
						setState(390);
						exp(44);
						}
						break;
					case 20:
						{
						_localctx = new SequenceContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(391);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(392);
						match(SEMI_COLON);
						setState(393);
						exp(29);
						}
						break;
					case 21:
						{
						_localctx = new ImplicitTupleContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(394);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(395);
						match(COMMA);
						setState(396);
						exp(5);
						}
						break;
					case 22:
						{
						_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(397);
						if (!(precpred(_ctx, 72))) throw new FailedPredicateException(this, "precpred(_ctx, 72)");
						setState(398);
						match(INSTANCE_OF);
						setState(399);
						typeExpression();
						}
						break;
					case 23:
						{
						_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(400);
						if (!(precpred(_ctx, 68))) throw new FailedPredicateException(this, "precpred(_ctx, 68)");
						setState(403); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(401);
								match(TIMES);
								setState(402);
								exp(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(405); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 24:
						{
						_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(407);
						if (!(precpred(_ctx, 65))) throw new FailedPredicateException(this, "precpred(_ctx, 65)");
						setState(410); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(408);
								match(PLUS);
								setState(409);
								exp(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(412); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 25:
						{
						_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(414);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(415);
						match(ELLIPSE);
						}
						break;
					case 26:
						{
						_localctx = new ArrayIndexContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(416);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(430); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(417);
								match(LEFT_BRACKET);
								setState(423);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
								while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
									if ( _alt==1 ) {
										{
										{
										setState(418);
										exp(0);
										setState(419);
										match(COMMA);
										}
										} 
									}
									setState(425);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
								}
								setState(427);
								_la = _input.LA(1);
								if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
									{
									setState(426);
									exp(0);
									}
								}

								setState(429);
								match(RIGHT_BRACKET);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(432); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class ParametricTypeContext extends TypeExpressionContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ParametricTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterParametricType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitParametricType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredefinedTypeContext extends TypeExpressionContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public PredefinedTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterPredefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitPredefinedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitPredefinedType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionTypeContext extends TypeExpressionContext {
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitUnionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeExpression);
		int _la;
		try {
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new UnionTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(T__3);
				setState(440);
				match(LEFT_BRACE);
				setState(441);
				typeExpression();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(442);
					match(COMMA);
					setState(443);
					typeExpression();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(449);
				match(RIGHT_BRACE);
				}
				break;
			case 2:
				_localctx = new ParametricTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(ID);
				setState(452);
				typeParameters();
				}
				break;
			case 3:
				_localctx = new PredefinedTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterCompactFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitCompactFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitCompactFunctionDeclaration(this);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode END() { return getToken(JuliaParser.END, 0); }
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GeneralFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterGeneralFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitGeneralFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitGeneralFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDeclaration);
		int _la;
		try {
			setState(473);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CompactFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				name();
				setState(458);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(457);
					typeParameters();
					}
				}

				setState(460);
				parameters();
				setState(461);
				match(EQ);
				setState(462);
				exp(0);
				}
				break;
			case FUNCTION:
				_localctx = new GeneralFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(FUNCTION);
				setState(465);
				name();
				setState(467);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(466);
					typeParameters();
					}
				}

				setState(469);
				parameters();
				setState(470);
				block();
				setState(471);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterPparameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitPparameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitPparameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			_localctx = new PparametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LEFT_PARENTHESIS);
			setState(484);
			_la = _input.LA(1);
			if (_la==INSTANCE_OF || _la==ID) {
				{
				setState(476);
				parameter(0);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==COMMA) {
					{
					{
					setState(477);
					_la = _input.LA(1);
					if ( !(_la==SEMI_COLON || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(478);
					parameter(0);
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(486);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNamedTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNamedTypedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNamedTypedParam(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAnonymousTypedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAnonymousTypedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAnonymousTypedParam(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterVararg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitVararg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitVararg(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterNamedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitNamedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitNamedParam(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_parameter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new NamedTypedParamContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(489);
				match(ID);
				setState(490);
				match(INSTANCE_OF);
				setState(491);
				typeExpression();
				setState(494);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(492);
					match(EQ);
					setState(493);
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
				setState(496);
				match(INSTANCE_OF);
				setState(497);
				typeExpression();
				setState(500);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(498);
					match(EQ);
					setState(499);
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
				setState(502);
				match(ID);
				setState(505);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(503);
					match(EQ);
					setState(504);
					exp(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarargContext(new ParameterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_parameter);
					setState(509);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(510);
					match(ELLIPSE);
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterMutableTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitMutableTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitMutableTypeDeclaration(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterImmutableTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitImmutableTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitImmutableTypeDeclaration(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAbstractType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAbstractType(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBitsSubtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBitsSubtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBitsSubtype(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAliasContext extends TypeDeclarationContext {
		public TerminalNode TYPE_ALIAS() { return getToken(JuliaParser.TYPE_ALIAS, 0); }
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeAliasContext(TypeDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTypeAlias(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterBitsTtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitBitsTtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitBitsTtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(589);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new TypeAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(TYPE_ALIAS);
				setState(517);
				match(ID);
				setState(519);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(518);
					typeParameters();
					}
				}

				setState(521);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new AbstractTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(ABSTRACT);
				setState(523);
				match(ID);
				setState(525);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(524);
					typeParameters();
					}
				}

				setState(532);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(527);
					match(SUB_TYPE);
					setState(528);
					match(ID);
					setState(530);
					_la = _input.LA(1);
					if (_la==LEFT_BRACE) {
						{
						setState(529);
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
				setState(534);
				match(BITS_TYPE);
				setState(535);
				match(SIZE);
				setState(536);
				match(ID);
				setState(537);
				match(SUB_TYPE);
				setState(538);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BitsTtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(BITS_TYPE);
				setState(540);
				match(SIZE);
				setState(541);
				match(ID);
				}
				break;
			case 5:
				_localctx = new MutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				match(TYPE);
				setState(543);
				match(ID);
				setState(545);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(544);
					typeParameters();
					}
				}

				setState(549);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(547);
					match(SUB_TYPE);
					setState(548);
					match(ID);
					}
				}

				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(551);
						fieldDeclaration();
						}
						} 
					}
					setState(556);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(557);
					functionDeclaration();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(END);
				}
				break;
			case 6:
				_localctx = new ImmutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(564);
				match(IMMUTABLE);
				setState(565);
				match(ID);
				setState(567);
				_la = _input.LA(1);
				if (_la==LEFT_BRACE) {
					{
					setState(566);
					typeParameters();
					}
				}

				setState(574);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(569);
					match(SUB_TYPE);
					setState(570);
					match(ID);
					setState(572);
					_la = _input.LA(1);
					if (_la==LEFT_BRACE) {
						{
						setState(571);
						typeParameters();
						}
					}

					}
				}

				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576);
						fieldDeclaration();
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(582);
					functionDeclaration();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterUntypedFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitUntypedFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitUntypedFieldDeclaration(this);
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
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTypedFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTypedFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTypedFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fieldDeclaration);
		try {
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new TypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(ID);
				setState(592);
				match(INSTANCE_OF);
				setState(593);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new UntypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
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
		public TerminalNode RIGHT_BRACE() { return getToken(JuliaParser.RIGHT_BRACE, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}
		public TtypeParametersContext(TypeParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterTtypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitTtypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitTtypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeParameters);
		int _la;
		try {
			_localctx = new TtypeParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(LEFT_BRACE);
			setState(606);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << BITWISE_NOT) | (1L << INSTANCE_OF) | (1L << COLON) | (1L << PLUS) | (1L << DOLLAR) | (1L << BEGIN) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << TRY) | (1L << RETURN) | (1L << BREAK) | (1L << QUOTE) | (1L << LET) | (1L << GLOBAL) | (1L << CONST) | (1L << CCALL) | (1L << DO) | (1L << AT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (LEFT_PARENTHESIS - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (REGEX - 67)) | (1L << (INT_LITERAL - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
				{
				setState(598);
				typeParameter();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(599);
					match(COMMA);
					setState(600);
					typeParameter();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(608);
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
	public static class AnonymousTypeContext extends TypeParameterContext {
		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public AnonymousTypeContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterAnonymousType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitAnonymousType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitAnonymousType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionTypeContext extends TypeParameterContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpressionTypeContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterExpressionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitExpressionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitExpressionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstrainedTypeContext extends TypeParameterContext {
		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }
		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ConstrainedTypeContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterConstrainedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitConstrainedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitConstrainedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeParameter);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new ConstrainedTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(ID);
				setState(611);
				match(SUB_TYPE);
				setState(612);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new AnonymousTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(INSTANCE_OF);
				setState(614);
				typeExpression();
				}
				break;
			case 3:
				_localctx = new ExpressionTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JuliaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JuliaParser.DOT, i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuliaListener ) ((JuliaListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JuliaVisitor ) return ((JuliaVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(ID);
			setState(623);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					match(DOT);
					setState(620);
					match(ID);
					}
					} 
				}
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
		case 5:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return parameter_sempred((ParameterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 73);
		case 1:
			return precpred(_ctx, 71);
		case 2:
			return precpred(_ctx, 70);
		case 3:
			return precpred(_ctx, 69);
		case 4:
			return precpred(_ctx, 67);
		case 5:
			return precpred(_ctx, 66);
		case 6:
			return precpred(_ctx, 64);
		case 7:
			return precpred(_ctx, 63);
		case 8:
			return precpred(_ctx, 62);
		case 9:
			return precpred(_ctx, 61);
		case 10:
			return precpred(_ctx, 60);
		case 11:
			return precpred(_ctx, 59);
		case 12:
			return precpred(_ctx, 58);
		case 13:
			return precpred(_ctx, 57);
		case 14:
			return precpred(_ctx, 56);
		case 15:
			return precpred(_ctx, 55);
		case 16:
			return precpred(_ctx, 54);
		case 17:
			return precpred(_ctx, 53);
		case 18:
			return precpred(_ctx, 43);
		case 19:
			return precpred(_ctx, 28);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 72);
		case 22:
			return precpred(_ctx, 68);
		case 23:
			return precpred(_ctx, 65);
		case 24:
			return precpred(_ctx, 42);
		case 25:
			return precpred(_ctx, 29);
		}
		return true;
	}
	private boolean parameter_sempred(ParameterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u0275\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"U\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7"+
		"w\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084\13"+
		"\7\3\7\3\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0090\n\7\f\7\16"+
		"\7\u0093\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f"+
		"\7\16\7\u00a2\13\7\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7\5\7\u00b6\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d7\n\7\3\7"+
		"\3\7\5\7\u00db\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00f7\n\7\r\7"+
		"\16\7\u00f8\3\7\5\7\u00fc\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0106"+
		"\n\7\3\7\3\7\3\7\3\7\7\7\u010c\n\7\f\7\16\7\u010f\13\7\3\7\5\7\u0112\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u011a\n\7\f\7\16\7\u011d\13\7\3\7\5\7\u0120"+
		"\n\7\3\7\6\7\u0123\n\7\r\7\16\7\u0124\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u012f\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u014c\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\6\7\u0196\n\7\r\7\16\7\u0197\3\7\3\7\3\7\6\7\u019d\n\7\r\7\16\7\u019e"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01a8\n\7\f\7\16\7\u01ab\13\7\3\7\5\7"+
		"\u01ae\n\7\3\7\6\7\u01b1\n\7\r\7\16\7\u01b2\7\7\u01b5\n\7\f\7\16\7\u01b8"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\7\b\u01bf\n\b\f\b\16\b\u01c2\13\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u01c9\n\b\3\t\3\t\5\t\u01cd\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01d6\n\t\3\t\3\t\3\t\3\t\5\t\u01dc\n\t\3\n\3\n\3\n\3\n\7\n\u01e2"+
		"\n\n\f\n\16\n\u01e5\13\n\5\n\u01e7\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u01f1\n\13\3\13\3\13\3\13\3\13\5\13\u01f7\n\13\3\13\3\13\3"+
		"\13\5\13\u01fc\n\13\5\13\u01fe\n\13\3\13\3\13\7\13\u0202\n\13\f\13\16"+
		"\13\u0205\13\13\3\f\3\f\3\f\5\f\u020a\n\f\3\f\3\f\3\f\3\f\5\f\u0210\n"+
		"\f\3\f\3\f\3\f\5\f\u0215\n\f\5\f\u0217\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0224\n\f\3\f\3\f\5\f\u0228\n\f\3\f\7\f\u022b\n\f"+
		"\f\f\16\f\u022e\13\f\3\f\7\f\u0231\n\f\f\f\16\f\u0234\13\f\3\f\3\f\3\f"+
		"\3\f\5\f\u023a\n\f\3\f\3\f\3\f\5\f\u023f\n\f\5\f\u0241\n\f\3\f\7\f\u0244"+
		"\n\f\f\f\16\f\u0247\13\f\3\f\7\f\u024a\n\f\f\f\16\f\u024d\13\f\3\f\5\f"+
		"\u0250\n\f\3\r\3\r\3\r\3\r\5\r\u0256\n\r\3\16\3\16\3\16\3\16\7\16\u025c"+
		"\n\16\f\16\16\16\u025f\13\16\5\16\u0261\n\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u026b\n\17\3\20\3\20\3\20\7\20\u0270\n\20\f\20\16"+
		"\20\u0273\13\20\3\20\2\4\f\24\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\4\4\2\3\3\34\34\4\2??CC\u0300\2 \3\2\2\2\4%\3\2\2\2\6H\3\2\2\2\bT\3"+
		"\2\2\2\nV\3\2\2\2\f\u014b\3\2\2\2\16\u01c8\3\2\2\2\20\u01db\3\2\2\2\22"+
		"\u01dd\3\2\2\2\24\u01fd\3\2\2\2\26\u024f\3\2\2\2\30\u0255\3\2\2\2\32\u0257"+
		"\3\2\2\2\34\u026a\3\2\2\2\36\u026c\3\2\2\2 !\5\4\3\2!\3\3\2\2\2\"$\5\6"+
		"\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2("+
		")\79\2\2)I\7]\2\2*+\7\"\2\2+,\5\36\20\2,-\7\24\2\2-\62\7]\2\2./\7C\2\2"+
		"/\61\7]\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63I"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7\"\2\2\66I\5\36\20\2\678\7!\2\28I\5\36\20"+
		"\29:\7:\2\2:?\7]\2\2;<\7C\2\2<>\7]\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@I\3\2\2\2A?\3\2\2\2BI\5\b\5\2CI\5\26\f\2DI\5\20\t\2EI\5\n\6"+
		"\2FI\5\f\7\2GI\7a\2\2H(\3\2\2\2H*\3\2\2\2H\65\3\2\2\2H\67\3\2\2\2H9\3"+
		"\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\7"+
		"\3\2\2\2JK\7\67\2\2KL\7]\2\2LM\5\4\3\2MN\7D\2\2NU\3\2\2\2OP\78\2\2PQ\7"+
		"]\2\2QR\5\4\3\2RS\7D\2\2SU\3\2\2\2TJ\3\2\2\2TO\3\2\2\2U\t\3\2\2\2VW\7"+
		"+\2\2WX\7]\2\2XY\5\22\n\2YZ\5\4\3\2Z[\7D\2\2[\13\3\2\2\2\\]\b\7\1\2]^"+
		"\7\t\2\2^\u014c\5\f\7Q_`\7\25\2\2`\u014c\5\f\7Pab\7\24\2\2b\u014c\5\f"+
		"\7Ocd\7\n\2\2d\u014c\5\f\7Nef\7\13\2\2f\u014c\5\f\7Mgh\7\35\2\2h\u014c"+
		"\5\f\7Lij\7\60\2\2jk\7]\2\2kl\7\34\2\2l\u014c\5\f\7\20mn\7&\2\2n\u014c"+
		"\5\f\7\5op\7/\2\2pu\5\f\7\2qr\7C\2\2rt\5\f\7\2sq\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2v\u014c\3\2\2\2wu\3\2\2\2x\u014c\7E\2\2yz\7#\2\2z{\5\f"+
		"\7\2{\u0082\5\4\3\2|}\7A\2\2}~\5\f\7\2~\177\5\4\3\2\177\u0081\3\2\2\2"+
		"\u0080|\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0087\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7B\2\2\u0086"+
		"\u0088\5\4\3\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u008a\7D\2\2\u008a\u014c\3\2\2\2\u008b\u0091\7-\2\2\u008c\u008d"+
		"\7]\2\2\u008d\u008e\7\34\2\2\u008e\u0090\5\f\7\2\u008f\u008c\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7D\2\2\u0096"+
		"\u014c\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7"+
		"D\2\2\u009a\u014c\3\2\2\2\u009b\u00a4\7;\2\2\u009c\u009d\7]\2\2\u009d"+
		"\u009f\7C\2\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\7]\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8\7D\2\2\u00a8\u014c\3\2\2\2\u00a9"+
		"\u00aa\7>\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00b1\7O\2\2\u00ac\u00ad\5\f"+
		"\7\2\u00ad\u00ae\7C\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7P\2\2\u00b8\u014c\3\2"+
		"\2\2\u00b9\u00ba\7>\2\2\u00ba\u00be\5\36\20\2\u00bb\u00bd\5\f\7\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u014c\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\66\2\2\u00c2"+
		"\u00c3\7O\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\5\f\7"+
		"\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\5\f\7\2\u00c8\u00c9\7P\2\2\u00c9\u014c"+
		"\3\2\2\2\u00ca\u00cb\7%\2\2\u00cb\u00cc\5\4\3\2\u00cc\u00cd\7<\2\2\u00cd"+
		"\u00ce\5\4\3\2\u00ce\u00cf\7D\2\2\u00cf\u014c\3\2\2\2\u00d0\u00d1\7$\2"+
		"\2\u00d1\u00d2\5\f\7\2\u00d2\u00d3\7\34\2\2\u00d3\u00d6\5\f\7\2\u00d4"+
		"\u00d5\7\24\2\2\u00d5\u00d7\5\f\7\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00db\5\f\7\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\4"+
		"\3\2\u00dd\u00de\7D\2\2\u00de\u014c\3\2\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1"+
		"\5\f\7\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\5\4\3\2\u00e4"+
		"\u00e5\7D\2\2\u00e5\u014c\3\2\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\5\f\7"+
		"\2\u00e8\u00e9\5\4\3\2\u00e9\u00ea\7D\2\2\u00ea\u014c\3\2\2\2\u00eb\u014c"+
		"\7\'\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00ef\7D\2\2\u00ef"+
		"\u014c\3\2\2\2\u00f0\u00f1\7O\2\2\u00f1\u014c\7P\2\2\u00f2\u00f6\7O\2"+
		"\2\u00f3\u00f4\5\f\7\2\u00f4\u00f5\7C\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00fc\5\f\7\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7P\2\2\u00fe\u014c\3\2\2\2\u00ff"+
		"\u0100\7O\2\2\u0100\u0101\5\f\7\2\u0101\u0102\7P\2\2\u0102\u014c\3\2\2"+
		"\2\u0103\u0105\5\36\20\2\u0104\u0106\5\32\16\2\u0105\u0104\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0111\7O\2\2\u0108\u0109\5\f"+
		"\7\2\u0109\u010a\7C\2\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u0110\u0112\5\f\7\2\u0111\u010d\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7P\2\2\u0114\u014c\3\2"+
		"\2\2\u0115\u011b\7S\2\2\u0116\u0117\5\f\7\2\u0117\u0118\7C\2\2\u0118\u011a"+
		"\3\2\2\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5\f"+
		"\7\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\7T\2\2\u0122\u0115\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u014c\3\2\2\2\u0126\u0127\7S\2\2\u0127"+
		"\u0128\5\f\7\2\u0128\u0129\7$\2\2\u0129\u012a\5\f\7\2\u012a\u012b\t\2"+
		"\2\2\u012b\u012e\5\f\7\2\u012c\u012d\7\24\2\2\u012d\u012f\5\f\7\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7T"+
		"\2\2\u0131\u014c\3\2\2\2\u0132\u014c\7]\2\2\u0133\u014c\7U\2\2\u0134\u014c"+
		"\7\4\2\2\u0135\u014c\7\5\2\2\u0136\u014c\7V\2\2\u0137\u014c\7W\2\2\u0138"+
		"\u014c\7X\2\2\u0139\u014c\7Y\2\2\u013a\u014c\7Z\2\2\u013b\u014c\7[\2\2"+
		"\u013c\u014c\7^\2\2\u013d\u014c\7_\2\2\u013e\u013f\7\24\2\2\u013f\u014c"+
		"\7]\2\2\u0140\u014c\7F\2\2\u0141\u014c\7G\2\2\u0142\u014c\7H\2\2\u0143"+
		"\u014c\7I\2\2\u0144\u014c\7J\2\2\u0145\u014c\7K\2\2\u0146\u014c\7L\2\2"+
		"\u0147\u014c\7M\2\2\u0148\u014c\7N\2\2\u0149\u014c\7&\2\2\u014a\u014c"+
		"\5\16\b\2\u014b\\\3\2\2\2\u014b_\3\2\2\2\u014ba\3\2\2\2\u014bc\3\2\2\2"+
		"\u014be\3\2\2\2\u014bg\3\2\2\2\u014bi\3\2\2\2\u014bm\3\2\2\2\u014bo\3"+
		"\2\2\2\u014bx\3\2\2\2\u014by\3\2\2\2\u014b\u008b\3\2\2\2\u014b\u0097\3"+
		"\2\2\2\u014b\u009b\3\2\2\2\u014b\u00a9\3\2\2\2\u014b\u00b9\3\2\2\2\u014b"+
		"\u00c1\3\2\2\2\u014b\u00ca\3\2\2\2\u014b\u00d0\3\2\2\2\u014b\u00df\3\2"+
		"\2\2\u014b\u00e6\3\2\2\2\u014b\u00eb\3\2\2\2\u014b\u00ec\3\2\2\2\u014b"+
		"\u00f0\3\2\2\2\u014b\u00f2\3\2\2\2\u014b\u00ff\3\2\2\2\u014b\u0103\3\2"+
		"\2\2\u014b\u0122\3\2\2\2\u014b\u0126\3\2\2\2\u014b\u0132\3\2\2\2\u014b"+
		"\u0133\3\2\2\2\u014b\u0134\3\2\2\2\u014b\u0135\3\2\2\2\u014b\u0136\3\2"+
		"\2\2\u014b\u0137\3\2\2\2\u014b\u0138\3\2\2\2\u014b\u0139\3\2\2\2\u014b"+
		"\u013a\3\2\2\2\u014b\u013b\3\2\2\2\u014b\u013c\3\2\2\2\u014b\u013d\3\2"+
		"\2\2\u014b\u013e\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0141\3\2\2\2\u014b"+
		"\u0142\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2"+
		"\2\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\u01b6\3\2\2\2\u014d\u014e\fK"+
		"\2\2\u014e\u014f\7\36\2\2\u014f\u01b5\5\f\7L\u0150\u0151\fI\2\2\u0151"+
		"\u0152\7\33\2\2\u0152\u01b5\5\f\7I\u0153\u0154\fH\2\2\u0154\u0155\7\f"+
		"\2\2\u0155\u01b5\5\f\7I\u0156\u0157\fG\2\2\u0157\u0158\7\32\2\2\u0158"+
		"\u01b5\5\f\7H\u0159\u015a\fE\2\2\u015a\u015b\7\31\2\2\u015b\u01b5\5\f"+
		"\7F\u015c\u015d\fD\2\2\u015d\u015e\7\27\2\2\u015e\u01b5\5\f\7E\u015f\u0160"+
		"\fB\2\2\u0160\u0161\7\26\2\2\u0161\u01b5\5\f\7C\u0162\u0163\fA\2\2\u0163"+
		"\u0164\7\t\2\2\u0164\u01b5\5\f\7B\u0165\u0166\f@\2\2\u0166\u0167\7\24"+
		"\2\2\u0167\u01b5\5\f\7A\u0168\u0169\f?\2\2\u0169\u016a\7\22\2\2\u016a"+
		"\u01b5\5\f\7@\u016b\u016c\f>\2\2\u016c\u016d\7\21\2\2\u016d\u01b5\5\f"+
		"\7?\u016e\u016f\f=\2\2\u016f\u0170\7\b\2\2\u0170\u01b5\5\f\7>\u0171\u0172"+
		"\f<\2\2\u0172\u0173\7\7\2\2\u0173\u01b5\5\f\7=\u0174\u0175\f;\2\2\u0175"+
		"\u0176\7\20\2\2\u0176\u01b5\5\f\7<\u0177\u0178\f:\2\2\u0178\u0179\7\17"+
		"\2\2\u0179\u017a\5\f\7\2\u017a\u017b\7\24\2\2\u017b\u017c\5\f\7;\u017c"+
		"\u01b5\3\2\2\2\u017d\u017e\f9\2\2\u017e\u017f\7\34\2\2\u017f\u01b5\5\f"+
		"\7:\u0180\u0181\f8\2\2\u0181\u0182\7\16\2\2\u0182\u01b5\5\f\79\u0183\u0184"+
		"\f\67\2\2\u0184\u0185\7=\2\2\u0185\u01b5\5\f\7\67\u0186\u0187\f-\2\2\u0187"+
		"\u0188\7\3\2\2\u0188\u01b5\5\f\7.\u0189\u018a\f\36\2\2\u018a\u018b\7?"+
		"\2\2\u018b\u01b5\5\f\7\37\u018c\u018d\f\6\2\2\u018d\u018e\7C\2\2\u018e"+
		"\u01b5\5\f\7\7\u018f\u0190\fJ\2\2\u0190\u0191\7\23\2\2\u0191\u01b5\5\16"+
		"\b\2\u0192\u0195\fF\2\2\u0193\u0194\7\30\2\2\u0194\u0196\5\f\7\2\u0195"+
		"\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u01b5\3\2\2\2\u0199\u019c\fC\2\2\u019a\u019b\7\25\2\2\u019b"+
		"\u019d\5\f\7\2\u019c\u019a\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01b5\3\2\2\2\u01a0\u01a1\f,\2\2\u01a1"+
		"\u01b5\7@\2\2\u01a2\u01b0\f\37\2\2\u01a3\u01a9\7S\2\2\u01a4\u01a5\5\f"+
		"\7\2\u01a5\u01a6\7C\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a4\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\5\f\7\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7T\2\2\u01b0\u01a3\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u014d\3\2\2\2\u01b4\u0150\3\2\2\2\u01b4\u0153\3\2"+
		"\2\2\u01b4\u0156\3\2\2\2\u01b4\u0159\3\2\2\2\u01b4\u015c\3\2\2\2\u01b4"+
		"\u015f\3\2\2\2\u01b4\u0162\3\2\2\2\u01b4\u0165\3\2\2\2\u01b4\u0168\3\2"+
		"\2\2\u01b4\u016b\3\2\2\2\u01b4\u016e\3\2\2\2\u01b4\u0171\3\2\2\2\u01b4"+
		"\u0174\3\2\2\2\u01b4\u0177\3\2\2\2\u01b4\u017d\3\2\2\2\u01b4\u0180\3\2"+
		"\2\2\u01b4\u0183\3\2\2\2\u01b4\u0186\3\2\2\2\u01b4\u0189\3\2\2\2\u01b4"+
		"\u018c\3\2\2\2\u01b4\u018f\3\2\2\2\u01b4\u0192\3\2\2\2\u01b4\u0199\3\2"+
		"\2\2\u01b4\u01a0\3\2\2\2\u01b4\u01a2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\r\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b9\u01ba\7\6\2\2\u01ba\u01bb\7Q\2\2\u01bb\u01c0\5\16\b\2\u01bc\u01bd"+
		"\7C\2\2\u01bd\u01bf\5\16\b\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c3\u01c4\7R\2\2\u01c4\u01c9\3\2\2\2\u01c5\u01c6\7]\2\2\u01c6\u01c9"+
		"\5\32\16\2\u01c7\u01c9\7]\2\2\u01c8\u01b9\3\2\2\2\u01c8\u01c5\3\2\2\2"+
		"\u01c8\u01c7\3\2\2\2\u01c9\17\3\2\2\2\u01ca\u01cc\5\36\20\2\u01cb\u01cd"+
		"\5\32\16\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2"+
		"\u01ce\u01cf\5\22\n\2\u01cf\u01d0\7\34\2\2\u01d0\u01d1\5\f\7\2\u01d1\u01dc"+
		"\3\2\2\2\u01d2\u01d3\7)\2\2\u01d3\u01d5\5\36\20\2\u01d4\u01d6\5\32\16"+
		"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8"+
		"\5\22\n\2\u01d8\u01d9\5\4\3\2\u01d9\u01da\7D\2\2\u01da\u01dc\3\2\2\2\u01db"+
		"\u01ca\3\2\2\2\u01db\u01d2\3\2\2\2\u01dc\21\3\2\2\2\u01dd\u01e6\7O\2\2"+
		"\u01de\u01e3\5\24\13\2\u01df\u01e0\t\3\2\2\u01e0\u01e2\5\24\13\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01de\3\2\2\2\u01e6"+
		"\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7P\2\2\u01e9\23\3\2\2\2"+
		"\u01ea\u01eb\b\13\1\2\u01eb\u01ec\7]\2\2\u01ec\u01ed\7\23\2\2\u01ed\u01f0"+
		"\5\16\b\2\u01ee\u01ef\7\34\2\2\u01ef\u01f1\5\f\7\2\u01f0\u01ee\3\2\2\2"+
		"\u01f0\u01f1\3\2\2\2\u01f1\u01fe\3\2\2\2\u01f2\u01f3\7\23\2\2\u01f3\u01f6"+
		"\5\16\b\2\u01f4\u01f5\7\34\2\2\u01f5\u01f7\5\f\7\2\u01f6\u01f4\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7\u01fe\3\2\2\2\u01f8\u01fb\7]\2\2\u01f9\u01fa"+
		"\7\34\2\2\u01fa\u01fc\5\f\7\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2"+
		"\u01fc\u01fe\3\2\2\2\u01fd\u01ea\3\2\2\2\u01fd\u01f2\3\2\2\2\u01fd\u01f8"+
		"\3\2\2\2\u01fe\u0203\3\2\2\2\u01ff\u0200\f\3\2\2\u0200\u0202\7@\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\25\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7\62\2\2\u0207\u0209"+
		"\7]\2\2\u0208\u020a\5\32\16\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2"+
		"\u020a\u020b\3\2\2\2\u020b\u0250\5\16\b\2\u020c\u020d\7\61\2\2\u020d\u020f"+
		"\7]\2\2\u020e\u0210\5\32\16\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2"+
		"\u0210\u0216\3\2\2\2\u0211\u0212\7\f\2\2\u0212\u0214\7]\2\2\u0213\u0215"+
		"\5\32\16\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2"+
		"\u0216\u0211\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0250\3\2\2\2\u0218\u0219"+
		"\7\64\2\2\u0219\u021a\7d\2\2\u021a\u021b\7]\2\2\u021b\u021c\7\f\2\2\u021c"+
		"\u0250\7]\2\2\u021d\u021e\7\64\2\2\u021e\u021f\7d\2\2\u021f\u0250\7]\2"+
		"\2\u0220\u0221\7\63\2\2\u0221\u0223\7]\2\2\u0222\u0224\5\32\16\2\u0223"+
		"\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0226\7\f"+
		"\2\2\u0226\u0228\7]\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022c\3\2\2\2\u0229\u022b\5\30\r\2\u022a\u0229\3\2\2\2\u022b\u022e\3"+
		"\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0232\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022f\u0231\5\20\t\2\u0230\u022f\3\2\2\2\u0231\u0234\3"+
		"\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0250\7D\2\2\u0236\u0237\7\65\2\2\u0237\u0239\7]"+
		"\2\2\u0238\u023a\5\32\16\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u0240\3\2\2\2\u023b\u023c\7\f\2\2\u023c\u023e\7]\2\2\u023d\u023f\5\32"+
		"\16\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240"+
		"\u023b\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0245\3\2\2\2\u0242\u0244\5\30"+
		"\r\2\u0243\u0242\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u024b\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5\20"+
		"\t\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0250\7D"+
		"\2\2\u024f\u0206\3\2\2\2\u024f\u020c\3\2\2\2\u024f\u0218\3\2\2\2\u024f"+
		"\u021d\3\2\2\2\u024f\u0220\3\2\2\2\u024f\u0236\3\2\2\2\u0250\27\3\2\2"+
		"\2\u0251\u0252\7]\2\2\u0252\u0253\7\23\2\2\u0253\u0256\5\16\b\2\u0254"+
		"\u0256\7]\2\2\u0255\u0251\3\2\2\2\u0255\u0254\3\2\2\2\u0256\31\3\2\2\2"+
		"\u0257\u0260\7Q\2\2\u0258\u025d\5\34\17\2\u0259\u025a\7C\2\2\u025a\u025c"+
		"\5\34\17\2\u025b\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0258"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7R\2\2\u0263"+
		"\33\3\2\2\2\u0264\u0265\7]\2\2\u0265\u0266\7\f\2\2\u0266\u026b\5\16\b"+
		"\2\u0267\u0268\7\23\2\2\u0268\u026b\5\16\b\2\u0269\u026b\5\f\7\2\u026a"+
		"\u0264\3\2\2\2\u026a\u0267\3\2\2\2\u026a\u0269\3\2\2\2\u026b\35\3\2\2"+
		"\2\u026c\u0271\7]\2\2\u026d\u026e\7\36\2\2\u026e\u0270\7]\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\37\3\2\2\2\u0273\u0271\3\2\2\2B%\62?HTu\u0082\u0087\u0091\u00a0\u00a4"+
		"\u00b1\u00b5\u00be\u00d6\u00da\u00f8\u00fb\u0105\u010d\u0111\u011b\u011f"+
		"\u0124\u012e\u014b\u0197\u019e\u01a9\u01ad\u01b2\u01b4\u01b6\u01c0\u01c8"+
		"\u01cc\u01d5\u01db\u01e3\u01e6\u01f0\u01f6\u01fb\u01fd\u0203\u0209\u020f"+
		"\u0214\u0216\u0223\u0227\u022c\u0232\u0239\u023e\u0240\u0245\u024b\u024f"+
		"\u0255\u025d\u0260\u026a\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}