// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, MINUS=8, NOT=9, BITWISE_NOT=10, 
		SUB_TYPE=11, ASSIGNMENT_OPERATOR=12, CONDITIONAL_OPERATOR=13, ARROW_OPERATOR=14, 
		RELATIONAL_OPERATOR=15, PIPE_OPERATOR=16, INSTANCE_OF=17, COLON=18, PLUS=19, 
		ADDITIVE_OPERATOR=20, BIT_SHIFT_OPERATOR=21, TIMES=22, MULTIPLICATIVE_OPERATOR=23, 
		RATIONAL_OPERATOR=24, POWER_OPERATOR=25, EQ=26, DOLLAR=27, DOT=28, BEGIN=29, 
		WHILE=30, IMPORT_ALL=31, IMPORT=32, IF=33, FOR=34, TRY=35, RETURN=36, 
		BREAK=37, CONTINUE=38, FUNCTION=39, STAGED_FUNCTION=40, MACRO=41, QUOTE=42, 
		LET=43, LOCAL=44, GLOBAL=45, CONST=46, ABSTRACT=47, TYPE_ALIAS=48, TYPE=49, 
		BITS_TYPE=50, IMMUTABLE=51, CCALL=52, MODULE=53, BARE_MODULE=54, USING=55, 
		EXPORT=56, DO=57, CATCH=58, FINALLY=59, ARROW=60, AT=61, SEMI_COLON=62, 
		ELLIPSE=63, ELSE_IF=64, ELSE=65, COMMA=66, END=67, END_LITERAL=68, LEFT_PARENTHESIS=69, 
		RIGHT_PARENTHESIS=70, LEFT_BRACE=71, RIGHT_BRACE=72, LEFT_BRACKET=73, 
		RIGHT_BRACKET=74, REGEX=75, INT_LITERAL=76, BINARY=77, OCTAL=78, HEX=79, 
		FLOAT32_LITERAL=80, HEX_FLOAT=81, FLOAT64_LITERAL=82, CHARACTER_LITERAL=83, 
		STRING=84, WS=85, NL=86, IGNORED_EOL=87, COMMENT=88, LINE_COMMENT=89, 
		ID=90, SIZE=91;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", "ARROW_OPERATOR", 
		"RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", "COLON", "PLUS", 
		"ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "FINALLY", 
		"ARROW", "AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", 
		"END_LITERAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "HEX_FLOAT", "EXP32", "FLOAT64_LITERAL", 
		"EXP64", "CHARACTER_LITERAL", "STRING", "SPACES", "WS", "NL", "IGNORED_EOL", 
		"COMMENT", "LINE_COMMENT", "ID", "DEC_DGT", "BIN_DGT", "OCT_DGT", "HEX_DGT", 
		"SIZE", "UNi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'''", "'true'", "'false'", "'Union'", "'||'", "'&&'", "'-'", 
		"'!'", "'~'", "'<:'", null, "'?'", null, null, null, "'::'", "':'", "'+'", 
		null, null, "'*'", null, null, null, "'='", "'$'", "'.'", "'begin'", "'while'", 
		"'importall'", "'import'", "'if'", "'for'", "'try'", "'return'", "'break'", 
		"'continue'", "'function'", "'stagedfunction'", "'macro'", "'quote'", 
		"'let'", "'local'", "'global'", "'const'", "'abstract'", "'typealias'", 
		"'type'", "'bitstype'", "'immutable'", "'ccall'", "'module'", "'baremodule'", 
		"'using'", "'export'", "'do'", "'catch'", "'finally'", "'->'", "'@'", 
		"';'", "'...'", "'elseif'", "'else'", "','", null, null, "'('", "')'", 
		"'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", "ARROW_OPERATOR", 
		"RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", "COLON", "PLUS", 
		"ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "FINALLY", 
		"ARROW", "AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", 
		"END_LITERAL", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "HEX_FLOAT", "FLOAT64_LITERAL", 
		"CHARACTER_LITERAL", "STRING", "WS", "NL", "IGNORED_EOL", "COMMENT", "LINE_COMMENT", 
		"ID", "SIZE"
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


	   int nesting = 0;
	   int bracketNesting = 0;


	public JuliaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Julia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 68:
			LEFT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			RIGHT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			LEFT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			RIGHT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			LEFT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			RIGHT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LEFT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RIGHT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting++;
			break;
		}
	}
	private void RIGHT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			nesting++;bracketNesting++;
			break;
		}
	}
	private void RIGHT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			nesting--;bracketNesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 66:
			return END_sempred((RuleContext)_localctx, predIndex);
		case 67:
			return END_LITERAL_sempred((RuleContext)_localctx, predIndex);
		case 88:
			return NL_sempred((RuleContext)_localctx, predIndex);
		case 89:
			return IGNORED_EOL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return bracketNesting==0;
		}
		return true;
	}
	private boolean END_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return bracketNesting>0;
		}
		return true;
	}
	private boolean NL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return nesting==0;
		}
		return true;
	}
	private boolean IGNORED_EOL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return nesting>0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2]\u03be\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u012d\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0136\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0168\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u016e\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u017c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u018f\n\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u019f\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u01a6\n\31\3\32\3\32\3\32\5\32\u01ab\n\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B"+
		"\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H"+
		"\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3M\6M\u02c6\nM\rM\16M\u02c7"+
		"\3N\3N\3N\3N\6N\u02ce\nN\rN\16N\u02cf\3O\3O\3O\3O\6O\u02d6\nO\rO\16O\u02d7"+
		"\3P\3P\3P\3P\6P\u02de\nP\rP\16P\u02df\3Q\6Q\u02e3\nQ\rQ\16Q\u02e4\3Q\3"+
		"Q\7Q\u02e9\nQ\fQ\16Q\u02ec\13Q\3Q\5Q\u02ef\nQ\3Q\3Q\7Q\u02f3\nQ\fQ\16"+
		"Q\u02f6\13Q\3Q\5Q\u02f9\nQ\5Q\u02fb\nQ\3R\3R\3R\3R\5R\u0301\nR\3R\3R\7"+
		"R\u0305\nR\fR\16R\u0308\13R\5R\u030a\nR\3R\3R\5R\u030e\nR\3R\6R\u0311"+
		"\nR\rR\16R\u0312\3S\3S\5S\u0317\nS\3S\6S\u031a\nS\rS\16S\u031b\3T\6T\u031f"+
		"\nT\rT\16T\u0320\3T\3T\7T\u0325\nT\fT\16T\u0328\13T\3T\5T\u032b\nT\3T"+
		"\3T\7T\u032f\nT\fT\16T\u0332\13T\3T\5T\u0335\nT\5T\u0337\nT\3U\3U\5U\u033b"+
		"\nU\3U\6U\u033e\nU\rU\16U\u033f\3V\3V\3V\3V\3V\3V\3V\5V\u0349\nV\3W\3"+
		"W\3W\3W\7W\u034f\nW\fW\16W\u0352\13W\3W\3W\3X\6X\u0357\nX\rX\16X\u0358"+
		"\3Y\3Y\3Y\3Y\3Z\5Z\u0360\nZ\3Z\3Z\3Z\5Z\u0365\nZ\6Z\u0367\nZ\rZ\16Z\u0368"+
		"\3Z\3Z\3[\5[\u036e\n[\3[\3[\3[\5[\u0373\n[\6[\u0375\n[\r[\16[\u0376\3"+
		"[\3[\3[\3[\3\\\3\\\3\\\3\\\7\\\u0381\n\\\f\\\16\\\u0384\13\\\3\\\3\\\3"+
		"\\\3\\\3\\\3]\3]\7]\u038d\n]\f]\16]\u0390\13]\3]\3]\3^\3^\5^\u0396\n^"+
		"\3^\3^\3^\7^\u039b\n^\f^\16^\u039e\13^\3^\5^\u03a1\n^\3_\3_\3`\3`\3a\3"+
		"a\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u03bb\nc\3"+
		"d\3d\3\u0382\2e\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5\2\u00a7T\u00a9\2\u00abU\u00adV\u00af\2\u00b1"+
		"W\u00b3X\u00b5Y\u00b7Z\u00b9[\u00bb\\\u00bd\2\u00bf\2\u00c1\2\u00c3\2"+
		"\u00c5]\u00c7\2\3\2\23\4\2>>@@\35\2~~\u00b3\u00b3\u2215\u2216\u223a\u223a"+
		"\u2244\u2244\u2251\u2251\u2290\u2290\u2296\u2296\u22bd\u22bd\u22bf\u22bf"+
		"\u22d0\u22d0\u22d5\u22d5\u29fc\u29fd\u2a0a\u2a0a\u2a24\u2a30\u2a3b\u2a3c"+
		"\u2a43\u2a44\u2a47\u2a47\u2a4c\u2a4c\u2a4e\u2a4e\u2a51\u2a52\u2a54\u2a54"+
		"\u2a56\u2a56\u2a58\u2a59\u2a5d\u2a5d\u2a5f\u2a5f\u2a63\u2a65\7\2\'\'\u00d9"+
		"\u00d9\u00f9\u00f9\u221a\u221a\u22c7\u22c7\4\2\60\60^^\4\2RRrr\4\2--/"+
		"/\3\2hh\3\2gg\3\2))\3\2$$\4\2\13\13\"\"\4\2\f\f\17\17\4\2\62;aa\4\2\62"+
		"\63aa\4\2\629aa\6\2\62;CHaach\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\u0425\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a7\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00c5\3\2\2\2\3\u00c9\3\2\2\2\5\u00cc\3\2\2\2\7\u00ce\3\2\2\2\t\u00d3"+
		"\3\2\2\2\13\u00d9\3\2\2\2\r\u00df\3\2\2\2\17\u00e2\3\2\2\2\21\u00e5\3"+
		"\2\2\2\23\u00e7\3\2\2\2\25\u00e9\3\2\2\2\27\u00eb\3\2\2\2\31\u012c\3\2"+
		"\2\2\33\u012e\3\2\2\2\35\u0135\3\2\2\2\37\u0167\3\2\2\2!\u016d\3\2\2\2"+
		"#\u016f\3\2\2\2%\u0172\3\2\2\2\'\u0174\3\2\2\2)\u017b\3\2\2\2+\u018e\3"+
		"\2\2\2-\u0190\3\2\2\2/\u019e\3\2\2\2\61\u01a5\3\2\2\2\63\u01aa\3\2\2\2"+
		"\65\u01ac\3\2\2\2\67\u01ae\3\2\2\29\u01b0\3\2\2\2;\u01b2\3\2\2\2=\u01b8"+
		"\3\2\2\2?\u01be\3\2\2\2A\u01c8\3\2\2\2C\u01cf\3\2\2\2E\u01d2\3\2\2\2G"+
		"\u01d6\3\2\2\2I\u01da\3\2\2\2K\u01e1\3\2\2\2M\u01e7\3\2\2\2O\u01f0\3\2"+
		"\2\2Q\u01f9\3\2\2\2S\u0208\3\2\2\2U\u020e\3\2\2\2W\u0214\3\2\2\2Y\u0218"+
		"\3\2\2\2[\u021e\3\2\2\2]\u0225\3\2\2\2_\u022b\3\2\2\2a\u0234\3\2\2\2c"+
		"\u023e\3\2\2\2e\u0243\3\2\2\2g\u024c\3\2\2\2i\u0256\3\2\2\2k\u025c\3\2"+
		"\2\2m\u0263\3\2\2\2o\u026e\3\2\2\2q\u0274\3\2\2\2s\u027b\3\2\2\2u\u027e"+
		"\3\2\2\2w\u0284\3\2\2\2y\u028c\3\2\2\2{\u028f\3\2\2\2}\u0291\3\2\2\2\177"+
		"\u0293\3\2\2\2\u0081\u0297\3\2\2\2\u0083\u029e\3\2\2\2\u0085\u02a3\3\2"+
		"\2\2\u0087\u02a5\3\2\2\2\u0089\u02aa\3\2\2\2\u008b\u02af\3\2\2\2\u008d"+
		"\u02b2\3\2\2\2\u008f\u02b5\3\2\2\2\u0091\u02b8\3\2\2\2\u0093\u02bb\3\2"+
		"\2\2\u0095\u02be\3\2\2\2\u0097\u02c1\3\2\2\2\u0099\u02c5\3\2\2\2\u009b"+
		"\u02c9\3\2\2\2\u009d\u02d1\3\2\2\2\u009f\u02d9\3\2\2\2\u00a1\u02fa\3\2"+
		"\2\2\u00a3\u02fc\3\2\2\2\u00a5\u0314\3\2\2\2\u00a7\u0336\3\2\2\2\u00a9"+
		"\u0338\3\2\2\2\u00ab\u0348\3\2\2\2\u00ad\u034a\3\2\2\2\u00af\u0356\3\2"+
		"\2\2\u00b1\u035a\3\2\2\2\u00b3\u0366\3\2\2\2\u00b5\u0374\3\2\2\2\u00b7"+
		"\u037c\3\2\2\2\u00b9\u038a\3\2\2\2\u00bb\u0395\3\2\2\2\u00bd\u03a2\3\2"+
		"\2\2\u00bf\u03a4\3\2\2\2\u00c1\u03a6\3\2\2\2\u00c3\u03a8\3\2\2\2\u00c5"+
		"\u03ba\3\2\2\2\u00c7\u03bc\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7p\2"+
		"\2\u00cb\4\3\2\2\2\u00cc\u00cd\7)\2\2\u00cd\6\3\2\2\2\u00ce\u00cf\7v\2"+
		"\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7g\2\2\u00d2\b\3"+
		"\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7\u00d8\7g\2\2\u00d8\n\3\2\2\2\u00d9\u00da\7W\2\2\u00da"+
		"\u00db\7p\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\f\3\2\2\2\u00df\u00e0\7~\2\2\u00e0\u00e1\7~\2\2\u00e1\16\3\2\2"+
		"\2\u00e2\u00e3\7(\2\2\u00e3\u00e4\7(\2\2\u00e4\20\3\2\2\2\u00e5\u00e6"+
		"\7/\2\2\u00e6\22\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8\24\3\2\2\2\u00e9\u00ea"+
		"\7\u0080\2\2\u00ea\26\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7<\2\2\u00ed"+
		"\30\3\2\2\2\u00ee\u00ef\7<\2\2\u00ef\u012d\7?\2\2\u00f0\u00f1\7-\2\2\u00f1"+
		"\u012d\7?\2\2\u00f2\u00f3\7/\2\2\u00f3\u012d\7?\2\2\u00f4\u00f5\7,\2\2"+
		"\u00f5\u012d\7?\2\2\u00f6\u00f7\7\61\2\2\u00f7\u012d\7?\2\2\u00f8\u00f9"+
		"\7\61\2\2\u00f9\u00fa\7\61\2\2\u00fa\u012d\7?\2\2\u00fb\u00fc\7\60\2\2"+
		"\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7\61\2\2\u00fe\u012d\7?\2\2\u00ff\u0100"+
		"\7\60\2\2\u0100\u0101\7,\2\2\u0101\u012d\7?\2\2\u0102\u0103\7\60\2\2\u0103"+
		"\u0104\7\61\2\2\u0104\u012d\7?\2\2\u0105\u0106\7^\2\2\u0106\u012d\7?\2"+
		"\2\u0107\u0108\7\60\2\2\u0108\u0109\7^\2\2\u0109\u012d\7?\2\2\u010a\u010b"+
		"\7`\2\2\u010b\u012d\7?\2\2\u010c\u010d\7\60\2\2\u010d\u010e\7`\2\2\u010e"+
		"\u012d\7?\2\2\u010f\u0110\7\'\2\2\u0110\u012d\7?\2\2\u0111\u0112\7\60"+
		"\2\2\u0112\u0113\7\'\2\2\u0113\u012d\7?\2\2\u0114\u0115\7~\2\2\u0115\u012d"+
		"\7?\2\2\u0116\u0117\7(\2\2\u0117\u012d\7?\2\2\u0118\u0119\7&\2\2\u0119"+
		"\u012d\7?\2\2\u011a\u011b\7?\2\2\u011b\u012d\7@\2\2\u011c\u011d\7>\2\2"+
		"\u011d\u011e\7>\2\2\u011e\u012d\7?\2\2\u011f\u0120\7@\2\2\u0120\u0121"+
		"\7@\2\2\u0121\u012d\7?\2\2\u0122\u0123\7@\2\2\u0123\u0124\7@\2\2\u0124"+
		"\u0125\7@\2\2\u0125\u012d\7?\2\2\u0126\u0127\7\60\2\2\u0127\u0128\7-\2"+
		"\2\u0128\u012d\7?\2\2\u0129\u012a\7\60\2\2\u012a\u012b\7/\2\2\u012b\u012d"+
		"\7?\2\2\u012c\u00ee\3\2\2\2\u012c\u00f0\3\2\2\2\u012c\u00f2\3\2\2\2\u012c"+
		"\u00f4\3\2\2\2\u012c\u00f6\3\2\2\2\u012c\u00f8\3\2\2\2\u012c\u00fb\3\2"+
		"\2\2\u012c\u00ff\3\2\2\2\u012c\u0102\3\2\2\2\u012c\u0105\3\2\2\2\u012c"+
		"\u0107\3\2\2\2\u012c\u010a\3\2\2\2\u012c\u010c\3\2\2\2\u012c\u010f\3\2"+
		"\2\2\u012c\u0111\3\2\2\2\u012c\u0114\3\2\2\2\u012c\u0116\3\2\2\2\u012c"+
		"\u0118\3\2\2\2\u012c\u011a\3\2\2\2\u012c\u011c\3\2\2\2\u012c\u011f\3\2"+
		"\2\2\u012c\u0122\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d"+
		"\32\3\2\2\2\u012e\u012f\7A\2\2\u012f\34\3\2\2\2\u0130\u0131\7/\2\2\u0131"+
		"\u0136\7/\2\2\u0132\u0133\7/\2\2\u0133\u0134\7/\2\2\u0134\u0136\7@\2\2"+
		"\u0135\u0130\3\2\2\2\u0135\u0132\3\2\2\2\u0136\36\3\2\2\2\u0137\u0138"+
		"\7@\2\2\u0138\u0168\7<\2\2\u0139\u0168\t\2\2\2\u013a\u013b\7@\2\2\u013b"+
		"\u0168\7?\2\2\u013c\u0168\7\u2267\2\2\u013d\u013e\7>\2\2\u013e\u0168\7"+
		"?\2\2\u013f\u0168\7\u2266\2\2\u0140\u0141\7?\2\2\u0141\u0168\7?\2\2\u0142"+
		"\u0143\7?\2\2\u0143\u0144\7?\2\2\u0144\u0168\7?\2\2\u0145\u0168\7\u2263"+
		"\2\2\u0146\u0147\7#\2\2\u0147\u0168\7?\2\2\u0148\u0168\7\u2262\2\2\u0149"+
		"\u014a\7#\2\2\u014a\u014b\7?\2\2\u014b\u0168\7?\2\2\u014c\u0168\7\u2264"+
		"\2\2\u014d\u014e\7\60\2\2\u014e\u0168\7@\2\2\u014f\u0150\7\60\2\2\u0150"+
		"\u0168\7>\2\2\u0151\u0152\7\60\2\2\u0152\u0153\7@\2\2\u0153\u0168\7?\2"+
		"\2\u0154\u0155\7\60\2\2\u0155\u0168\7\u2267\2\2\u0156\u0157\7\60\2\2\u0157"+
		"\u0158\7>\2\2\u0158\u0168\7?\2\2\u0159\u015a\7\60\2\2\u015a\u0168\7\u2266"+
		"\2\2\u015b\u015c\7\60\2\2\u015c\u015d\7?\2\2\u015d\u0168\7?\2\2\u015e"+
		"\u015f\7\60\2\2\u015f\u0160\7#\2\2\u0160\u0168\7?\2\2\u0161\u0162\7\60"+
		"\2\2\u0162\u0168\7\u2262\2\2\u0163\u0164\7\60\2\2\u0164\u0168\7?\2\2\u0165"+
		"\u0166\7\60\2\2\u0166\u0168\7#\2\2\u0167\u0137\3\2\2\2\u0167\u0139\3\2"+
		"\2\2\u0167\u013a\3\2\2\2\u0167\u013c\3\2\2\2\u0167\u013d\3\2\2\2\u0167"+
		"\u013f\3\2\2\2\u0167\u0140\3\2\2\2\u0167\u0142\3\2\2\2\u0167\u0145\3\2"+
		"\2\2\u0167\u0146\3\2\2\2\u0167\u0148\3\2\2\2\u0167\u0149\3\2\2\2\u0167"+
		"\u014c\3\2\2\2\u0167\u014d\3\2\2\2\u0167\u014f\3\2\2\2\u0167\u0151\3\2"+
		"\2\2\u0167\u0154\3\2\2\2\u0167\u0156\3\2\2\2\u0167\u0159\3\2\2\2\u0167"+
		"\u015b\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0163\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168 \3\2\2\2\u0169\u016a\7~\2\2\u016a\u016e"+
		"\7@\2\2\u016b\u016c\7>\2\2\u016c\u016e\7~\2\2\u016d\u0169\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\"\3\2\2\2\u016f\u0170\7<\2\2\u0170\u0171\7<\2\2\u0171"+
		"$\3\2\2\2\u0172\u0173\7<\2\2\u0173&\3\2\2\2\u0174\u0175\7-\2\2\u0175("+
		"\3\2\2\2\u0176\u0177\7\60\2\2\u0177\u017c\7-\2\2\u0178\u0179\7\60\2\2"+
		"\u0179\u017c\7/\2\2\u017a\u017c\t\3\2\2\u017b\u0176\3\2\2\2\u017b\u0178"+
		"\3\2\2\2\u017b\u017a\3\2\2\2\u017c*\3\2\2\2\u017d\u017e\7>\2\2\u017e\u018f"+
		"\7>\2\2\u017f\u0180\7@\2\2\u0180\u018f\7@\2\2\u0181\u0182\7@\2\2\u0182"+
		"\u0183\7@\2\2\u0183\u018f\7@\2\2\u0184\u0185\7\60\2\2\u0185\u0186\7>\2"+
		"\2\u0186\u018f\7>\2\2\u0187\u0188\7\60\2\2\u0188\u0189\7@\2\2\u0189\u018f"+
		"\7@\2\2\u018a\u018b\7\60\2\2\u018b\u018c\7@\2\2\u018c\u018d\7@\2\2\u018d"+
		"\u018f\7@\2\2\u018e\u017d\3\2\2\2\u018e\u017f\3\2\2\2\u018e\u0181\3\2"+
		"\2\2\u018e\u0184\3\2\2\2\u018e\u0187\3\2\2\2\u018e\u018a\3\2\2\2\u018f"+
		",\3\2\2\2\u0190\u0191\7,\2\2\u0191.\3\2\2\2\u0192\u019f\7\61\2\2\u0193"+
		"\u0194\7\60\2\2\u0194\u019f\7\61\2\2\u0195\u019f\t\4\2\2\u0196\u0197\7"+
		"\60\2\2\u0197\u019f\7\'\2\2\u0198\u0199\7\60\2\2\u0199\u019f\7,\2\2\u019a"+
		"\u019f\7^\2\2\u019b\u019c\7\60\2\2\u019c\u019f\7^\2\2\u019d\u019f\7(\2"+
		"\2\u019e\u0192\3\2\2\2\u019e\u0193\3\2\2\2\u019e\u0195\3\2\2\2\u019e\u0196"+
		"\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u019a\3\2\2\2\u019e\u019b\3\2\2\2\u019e"+
		"\u019d\3\2\2\2\u019f\60\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a6\7\61"+
		"\2\2\u01a2\u01a3\7\60\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a6\7\61\2\2\u01a5"+
		"\u01a0\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\62\3\2\2\2\u01a7\u01ab\7`\2\2"+
		"\u01a8\u01a9\7\60\2\2\u01a9\u01ab\7`\2\2\u01aa\u01a7\3\2\2\2\u01aa\u01a8"+
		"\3\2\2\2\u01ab\64\3\2\2\2\u01ac\u01ad\7?\2\2\u01ad\66\3\2\2\2\u01ae\u01af"+
		"\7&\2\2\u01af8\3\2\2\2\u01b0\u01b1\7\60\2\2\u01b1:\3\2\2\2\u01b2\u01b3"+
		"\7d\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7i\2\2\u01b5\u01b6\7k\2\2\u01b6"+
		"\u01b7\7p\2\2\u01b7<\3\2\2\2\u01b8\u01b9\7y\2\2\u01b9\u01ba\7j\2\2\u01ba"+
		"\u01bb\7k\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7g\2\2\u01bd>\3\2\2\2\u01be"+
		"\u01bf\7k\2\2\u01bf\u01c0\7o\2\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7q\2\2"+
		"\u01c2\u01c3\7t\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6"+
		"\7n\2\2\u01c6\u01c7\7n\2\2\u01c7@\3\2\2\2\u01c8\u01c9\7k\2\2\u01c9\u01ca"+
		"\7o\2\2\u01ca\u01cb\7r\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7t\2\2\u01cd"+
		"\u01ce\7v\2\2\u01ceB\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7h\2\2\u01d1"+
		"D\3\2\2\2\u01d2\u01d3\7h\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7t\2\2\u01d5"+
		"F\3\2\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8\7t\2\2\u01d8\u01d9\7{\2\2\u01d9"+
		"H\3\2\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7v\2\2\u01dd"+
		"\u01de\7w\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7p\2\2\u01e0J\3\2\2\2\u01e1"+
		"\u01e2\7d\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7c\2\2"+
		"\u01e5\u01e6\7m\2\2\u01e6L\3\2\2\2\u01e7\u01e8\7e\2\2\u01e8\u01e9\7q\2"+
		"\2\u01e9\u01ea\7p\2\2\u01ea\u01eb\7v\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed"+
		"\7p\2\2\u01ed\u01ee\7w\2\2\u01ee\u01ef\7g\2\2\u01efN\3\2\2\2\u01f0\u01f1"+
		"\7h\2\2\u01f1\u01f2\7w\2\2\u01f2\u01f3\7p\2\2\u01f3\u01f4\7e\2\2\u01f4"+
		"\u01f5\7v\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7q\2\2\u01f7\u01f8\7p\2\2"+
		"\u01f8P\3\2\2\2\u01f9\u01fa\7u\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7c\2"+
		"\2\u01fc\u01fd\7i\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7f\2\2\u01ff\u0200"+
		"\7h\2\2\u0200\u0201\7w\2\2\u0201\u0202\7p\2\2\u0202\u0203\7e\2\2\u0203"+
		"\u0204\7v\2\2\u0204\u0205\7k\2\2\u0205\u0206\7q\2\2\u0206\u0207\7p\2\2"+
		"\u0207R\3\2\2\2\u0208\u0209\7o\2\2\u0209\u020a\7c\2\2\u020a\u020b\7e\2"+
		"\2\u020b\u020c\7t\2\2\u020c\u020d\7q\2\2\u020dT\3\2\2\2\u020e\u020f\7"+
		"s\2\2\u020f\u0210\7w\2\2\u0210\u0211\7q\2\2\u0211\u0212\7v\2\2\u0212\u0213"+
		"\7g\2\2\u0213V\3\2\2\2\u0214\u0215\7n\2\2\u0215\u0216\7g\2\2\u0216\u0217"+
		"\7v\2\2\u0217X\3\2\2\2\u0218\u0219\7n\2\2\u0219\u021a\7q\2\2\u021a\u021b"+
		"\7e\2\2\u021b\u021c\7c\2\2\u021c\u021d\7n\2\2\u021dZ\3\2\2\2\u021e\u021f"+
		"\7i\2\2\u021f\u0220\7n\2\2\u0220\u0221\7q\2\2\u0221\u0222\7d\2\2\u0222"+
		"\u0223\7c\2\2\u0223\u0224\7n\2\2\u0224\\\3\2\2\2\u0225\u0226\7e\2\2\u0226"+
		"\u0227\7q\2\2\u0227\u0228\7p\2\2\u0228\u0229\7u\2\2\u0229\u022a\7v\2\2"+
		"\u022a^\3\2\2\2\u022b\u022c\7c\2\2\u022c\u022d\7d\2\2\u022d\u022e\7u\2"+
		"\2\u022e\u022f\7v\2\2\u022f\u0230\7t\2\2\u0230\u0231\7c\2\2\u0231\u0232"+
		"\7e\2\2\u0232\u0233\7v\2\2\u0233`\3\2\2\2\u0234\u0235\7v\2\2\u0235\u0236"+
		"\7{\2\2\u0236\u0237\7r\2\2\u0237\u0238\7g\2\2\u0238\u0239\7c\2\2\u0239"+
		"\u023a\7n\2\2\u023a\u023b\7k\2\2\u023b\u023c\7c\2\2\u023c\u023d\7u\2\2"+
		"\u023db\3\2\2\2\u023e\u023f\7v\2\2\u023f\u0240\7{\2\2\u0240\u0241\7r\2"+
		"\2\u0241\u0242\7g\2\2\u0242d\3\2\2\2\u0243\u0244\7d\2\2\u0244\u0245\7"+
		"k\2\2\u0245\u0246\7v\2\2\u0246\u0247\7u\2\2\u0247\u0248\7v\2\2\u0248\u0249"+
		"\7{\2\2\u0249\u024a\7r\2\2\u024a\u024b\7g\2\2\u024bf\3\2\2\2\u024c\u024d"+
		"\7k\2\2\u024d\u024e\7o\2\2\u024e\u024f\7o\2\2\u024f\u0250\7w\2\2\u0250"+
		"\u0251\7v\2\2\u0251\u0252\7c\2\2\u0252\u0253\7d\2\2\u0253\u0254\7n\2\2"+
		"\u0254\u0255\7g\2\2\u0255h\3\2\2\2\u0256\u0257\7e\2\2\u0257\u0258\7e\2"+
		"\2\u0258\u0259\7c\2\2\u0259\u025a\7n\2\2\u025a\u025b\7n\2\2\u025bj\3\2"+
		"\2\2\u025c\u025d\7o\2\2\u025d\u025e\7q\2\2\u025e\u025f\7f\2\2\u025f\u0260"+
		"\7w\2\2\u0260\u0261\7n\2\2\u0261\u0262\7g\2\2\u0262l\3\2\2\2\u0263\u0264"+
		"\7d\2\2\u0264\u0265\7c\2\2\u0265\u0266\7t\2\2\u0266\u0267\7g\2\2\u0267"+
		"\u0268\7o\2\2\u0268\u0269\7q\2\2\u0269\u026a\7f\2\2\u026a\u026b\7w\2\2"+
		"\u026b\u026c\7n\2\2\u026c\u026d\7g\2\2\u026dn\3\2\2\2\u026e\u026f\7w\2"+
		"\2\u026f\u0270\7u\2\2\u0270\u0271\7k\2\2\u0271\u0272\7p\2\2\u0272\u0273"+
		"\7i\2\2\u0273p\3\2\2\2\u0274\u0275\7g\2\2\u0275\u0276\7z\2\2\u0276\u0277"+
		"\7r\2\2\u0277\u0278\7q\2\2\u0278\u0279\7t\2\2\u0279\u027a\7v\2\2\u027a"+
		"r\3\2\2\2\u027b\u027c\7f\2\2\u027c\u027d\7q\2\2\u027dt\3\2\2\2\u027e\u027f"+
		"\7e\2\2\u027f\u0280\7c\2\2\u0280\u0281\7v\2\2\u0281\u0282\7e\2\2\u0282"+
		"\u0283\7j\2\2\u0283v\3\2\2\2\u0284\u0285\7h\2\2\u0285\u0286\7k\2\2\u0286"+
		"\u0287\7p\2\2\u0287\u0288\7c\2\2\u0288\u0289\7n\2\2\u0289\u028a\7n\2\2"+
		"\u028a\u028b\7{\2\2\u028bx\3\2\2\2\u028c\u028d\7/\2\2\u028d\u028e\7@\2"+
		"\2\u028ez\3\2\2\2\u028f\u0290\7B\2\2\u0290|\3\2\2\2\u0291\u0292\7=\2\2"+
		"\u0292~\3\2\2\2\u0293\u0294\7\60\2\2\u0294\u0295\7\60\2\2\u0295\u0296"+
		"\7\60\2\2\u0296\u0080\3\2\2\2\u0297\u0298\7g\2\2\u0298\u0299\7n\2\2\u0299"+
		"\u029a\7u\2\2\u029a\u029b\7g\2\2\u029b\u029c\7k\2\2\u029c\u029d\7h\2\2"+
		"\u029d\u0082\3\2\2\2\u029e\u029f\7g\2\2\u029f\u02a0\7n\2\2\u02a0\u02a1"+
		"\7u\2\2\u02a1\u02a2\7g\2\2\u02a2\u0084\3\2\2\2\u02a3\u02a4\7.\2\2\u02a4"+
		"\u0086\3\2\2\2\u02a5\u02a6\6D\2\2\u02a6\u02a7\7g\2\2\u02a7\u02a8\7p\2"+
		"\2\u02a8\u02a9\7f\2\2\u02a9\u0088\3\2\2\2\u02aa\u02ab\6E\3\2\u02ab\u02ac"+
		"\7g\2\2\u02ac\u02ad\7p\2\2\u02ad\u02ae\7f\2\2\u02ae\u008a\3\2\2\2\u02af"+
		"\u02b0\7*\2\2\u02b0\u02b1\bF\2\2\u02b1\u008c\3\2\2\2\u02b2\u02b3\7+\2"+
		"\2\u02b3\u02b4\bG\3\2\u02b4\u008e\3\2\2\2\u02b5\u02b6\7}\2\2\u02b6\u02b7"+
		"\bH\4\2\u02b7\u0090\3\2\2\2\u02b8\u02b9\7\177\2\2\u02b9\u02ba\bI\5\2\u02ba"+
		"\u0092\3\2\2\2\u02bb\u02bc\7]\2\2\u02bc\u02bd\bJ\6\2\u02bd\u0094\3\2\2"+
		"\2\u02be\u02bf\7_\2\2\u02bf\u02c0\bK\7\2\u02c0\u0096\3\2\2\2\u02c1\u02c2"+
		"\7t\2\2\u02c2\u02c3\5\u00adW\2\u02c3\u0098\3\2\2\2\u02c4\u02c6\5\u00bd"+
		"_\2\u02c5\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u009a\3\2\2\2\u02c9\u02ca\7\62\2\2\u02ca\u02cb\7"+
		"d\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ce\5\u00bf`\2\u02cd\u02cc\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u009c\3\2"+
		"\2\2\u02d1\u02d2\7\62\2\2\u02d2\u02d3\7q\2\2\u02d3\u02d5\3\2\2\2\u02d4"+
		"\u02d6\5\u00c1a\2\u02d5\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d5"+
		"\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u009e\3\2\2\2\u02d9\u02da\7\62\2\2"+
		"\u02da\u02db\7z\2\2\u02db\u02dd\3\2\2\2\u02dc\u02de\5\u00c3b\2\u02dd\u02dc"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u00a0\3\2\2\2\u02e1\u02e3\5\u00bd_\2\u02e2\u02e1\3\2\2\2\u02e3\u02e4"+
		"\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02ea\t\5\2\2\u02e7\u02e9\5\u00bd_\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec"+
		"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02ef\5\u00a5S\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef"+
		"\3\2\2\2\u02ef\u02fb\3\2\2\2\u02f0\u02f4\7\60\2\2\u02f1\u02f3\5\u00bd"+
		"_\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f9\5\u00a5"+
		"S\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa"+
		"\u02e2\3\2\2\2\u02fa\u02f0\3\2\2\2\u02fb\u00a2\3\2\2\2\u02fc\u02fd\7\62"+
		"\2\2\u02fd\u02fe\7z\2\2\u02fe\u0300\3\2\2\2\u02ff\u0301\5\u00c3b\2\u0300"+
		"\u02ff\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0309\3\2\2\2\u0302\u0306\7\60"+
		"\2\2\u0303\u0305\5\u00c3b\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306"+
		"\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2"+
		"\2\2\u0309\u0302\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030d\t\6\2\2\u030c\u030e\t\7\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0310\3\2\2\2\u030f\u0311\5\u00bd_\2\u0310\u030f\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u00a4\3\2"+
		"\2\2\u0314\u0316\t\b\2\2\u0315\u0317\t\7\2\2\u0316\u0315\3\2\2\2\u0316"+
		"\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318\u031a\5\u00bd_\2\u0319\u0318"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u00a6\3\2\2\2\u031d\u031f\5\u00bd_\2\u031e\u031d\3\2\2\2\u031f\u0320"+
		"\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0326\t\5\2\2\u0323\u0325\5\u00bd_\2\u0324\u0323\3\2\2\2\u0325\u0328"+
		"\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032b\5\u00a9U\2\u032a\u0329\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u0337\3\2\2\2\u032c\u0330\7\60\2\2\u032d\u032f\5\u00bd"+
		"_\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0335\5\u00a9"+
		"U\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u031e\3\2\2\2\u0336\u032c\3\2\2\2\u0337\u00a8\3\2\2\2\u0338\u033a\t\t"+
		"\2\2\u0339\u033b\t\7\2\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033d\3\2\2\2\u033c\u033e\5\u00bd_\2\u033d\u033c\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u00aa\3\2\2\2\u0341"+
		"\u0342\7)\2\2\u0342\u0343\n\n\2\2\u0343\u0349\7)\2\2\u0344\u0345\7)\2"+
		"\2\u0345\u0346\7^\2\2\u0346\u0347\13\2\2\2\u0347\u0349\7)\2\2\u0348\u0341"+
		"\3\2\2\2\u0348\u0344\3\2\2\2\u0349\u00ac\3\2\2\2\u034a\u0350\7$\2\2\u034b"+
		"\u034c\7^\2\2\u034c\u034f\7$\2\2\u034d\u034f\n\13\2\2\u034e\u034b\3\2"+
		"\2\2\u034e\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7$"+
		"\2\2\u0354\u00ae\3\2\2\2\u0355\u0357\t\f\2\2\u0356\u0355\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u00b0\3\2"+
		"\2\2\u035a\u035b\5\u00afX\2\u035b\u035c\3\2\2\2\u035c\u035d\bY\b\2\u035d"+
		"\u00b2\3\2\2\2\u035e\u0360\7\17\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3"+
		"\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\7\f\2\2\u0362\u0364\3\2\2\2\u0363"+
		"\u0365\5\u00afX\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367"+
		"\3\2\2\2\u0366\u035f\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\6Z\4\2\u036b\u00b4\3\2"+
		"\2\2\u036c\u036e\7\17\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0370\7\f\2\2\u0370\u0372\3\2\2\2\u0371\u0373\5\u00af"+
		"X\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374"+
		"\u036d\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0379\6[\5\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\b[\b\2\u037b\u00b6\3\2\2\2\u037c\u037d\7%\2\2\u037d\u037e\7?\2"+
		"\2\u037e\u0382\3\2\2\2\u037f\u0381\13\2\2\2\u0380\u037f\3\2\2\2\u0381"+
		"\u0384\3\2\2\2\u0382\u0383\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0385\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0385\u0386\7?\2\2\u0386\u0387\7%\2\2\u0387\u0388"+
		"\3\2\2\2\u0388\u0389\b\\\b\2\u0389\u00b8\3\2\2\2\u038a\u038e\7%\2\2\u038b"+
		"\u038d\n\r\2\2\u038c\u038b\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0391\3\2\2\2\u0390\u038e\3\2\2\2\u0391"+
		"\u0392\b]\b\2\u0392\u00ba\3\2\2\2\u0393\u0396\7a\2\2\u0394\u0396\5\u00c7"+
		"d\2\u0395\u0393\3\2\2\2\u0395\u0394\3\2\2\2\u0396\u039c\3\2\2\2\u0397"+
		"\u039b\7a\2\2\u0398\u039b\5\u00c7d\2\u0399\u039b\5\u00bd_\2\u039a\u0397"+
		"\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u0399\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2"+
		"\2\2\u039f\u03a1\7#\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u00bc\3\2\2\2\u03a2\u03a3\t\16\2\2\u03a3\u00be\3\2\2\2\u03a4\u03a5\t"+
		"\17\2\2\u03a5\u00c0\3\2\2\2\u03a6\u03a7\t\20\2\2\u03a7\u00c2\3\2\2\2\u03a8"+
		"\u03a9\t\21\2\2\u03a9\u00c4\3\2\2\2\u03aa\u03bb\7:\2\2\u03ab\u03ac\7\63"+
		"\2\2\u03ac\u03bb\78\2\2\u03ad\u03ae\7\65\2\2\u03ae\u03bb\7\64\2\2\u03af"+
		"\u03b0\78\2\2\u03b0\u03bb\7\66\2\2\u03b1\u03b2\7\63\2\2\u03b2\u03b3\7"+
		"\64\2\2\u03b3\u03bb\7:\2\2\u03b4\u03b5\7\64\2\2\u03b5\u03b6\7\67\2\2\u03b6"+
		"\u03bb\78\2\2\u03b7\u03b8\7\67\2\2\u03b8\u03b9\7\63\2\2\u03b9\u03bb\7"+
		"\64\2\2\u03ba\u03aa\3\2\2\2\u03ba\u03ab\3\2\2\2\u03ba\u03ad\3\2\2\2\u03ba"+
		"\u03af\3\2\2\2\u03ba\u03b1\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03b7\3\2"+
		"\2\2\u03bb\u00c6\3\2\2\2\u03bc\u03bd\t\22\2\2\u03bd\u00c8\3\2\2\2\66\2"+
		"\u012c\u0135\u0167\u016d\u017b\u018e\u019e\u01a5\u01aa\u02c7\u02cf\u02d7"+
		"\u02df\u02e4\u02ea\u02ee\u02f4\u02f8\u02fa\u0300\u0306\u0309\u030d\u0312"+
		"\u0316\u031b\u0320\u0326\u032a\u0330\u0334\u0336\u033a\u033f\u0348\u034e"+
		"\u0350\u0358\u035f\u0364\u0368\u036d\u0372\u0376\u0382\u038e\u0395\u039a"+
		"\u039c\u03a0\u03ba\t\3F\2\3G\3\3H\4\3I\5\3J\6\3K\7\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}