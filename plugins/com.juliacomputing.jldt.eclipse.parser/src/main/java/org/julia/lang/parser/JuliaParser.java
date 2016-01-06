// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaParser.g4 by ANTLR 4.5.1

package org.julia.lang.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaParser extends Parser {
	public static final int
		ARROW=1, AT=2, DOT=3, SEMI_COLON=4, EQUALS=5, NOT_EQUAL=6, GREATER_THAN=7,
		LESS_THAN=8, GREATER_THAN_OR_EQ=9, LESS_THAN_OR_EQ=10, MINUS=11, EXPONENT=12,
		FRACTION=13, TIMES=14, DIVIDE=15, PLUS=16, ELM_EQUALS=17, ELM_NOT_EQUAL=18,
		ELM_GREATER_THAN=19, ELM_LESS_THAN=20, ELM_GREATER_THAN_OR_EQ=21, ELM_LESS_THAN_OR_EQ=22,
		ELM_MINUS=23, ELM_EXPONENT=24, ELM_FRACTION=25, ELM_TIMES=26, ELM_DIVIDE=27,
		ELM_PLUS=28, EQ=29, DOUBLE_ARROW=30, ADD_ASGN=31, SUB_ASGN=32, TIMES_ASGN=33,
		DIVIDE_ASGN=34, INV_DIVIDE_ASGN=35, REMAINDER_ASGN=36, REM=37, POWER_ASGN=38,
		BITWISE_AND_ASGN=39, BITWISE_OR_ASGN=40, BITWISE_XOR_ASGN=41, LSR_ASGN=42,
		ASR_ASGN=43, ELLIPSE=44, ASL_ASGN=45, QUESTION_MARK=46, WHILE=47, BEGIN=48,
		RETURN=49, IN=50, IF=51, ELSE_IF=52, ELSE=53, FOR=54, CONST=55, USING=56,
		IMPORT=57, INSTANCE_OF=58, COLON=59, COMMA=60, IMPORT_ALL=61, EXPORT=62,
		MODULE=63, END=64, END_LITERAL=65, BAREMODULE=66, INF16=67, INF32=68,
		INF=69, MINUS_INF16=70, MINUS_INF32=71, MINUS_INF=72, NAN16=73, NAN32=74,
		NAN=75, NOT=76, AND=77, BITWISE_AND=78, OR=79, BITWISE_OR=80, LEFT_BRACKET=81,
		RIGHT_BRACKET=82, TRUE=83, FALSE=84, ABSTRACT=85, SUB_TYPE=86, BITS_TYPE=87,
		TYPE_ALIAS=88, TYPE=89, IMMUTABLE=90, UNION=91, FUNCTION=92, LEFT_CURLY=93,
		RIGHT_CURLY=94, LEFT_SQUARE=95, RIGHT_SQUARE=96, INT8=97, UINT8=98, INT16=99,
		UINT16=100, INT32=101, UINT32=102, INT64=103, UINT64=104, INT128=105,
		UINT128=106, BOOL=107, CHAR=108, FLOAT16=109, FLOAT32=110, FLOAT64=111,
		REGEX=112, INT=113, BINARY=114, OCTAL=115, HEX=116, FLOAT32_LITERAL=117,
		EXP32=118, FLOAT64_LITERAL=119, EXP64=120, ID=121, CHARACTER_LITERAL=122,
		STRING=123, EOL=124, IGNORED_EOL=125, WS=126, COMMENT=127, LINE_COMMENT=128,
		SIZE=129;
	public static final int
		RULE_unit = 0, RULE_moduleDirective = 1, RULE_statement = 2, RULE_exp = 3,
		RULE_functionDeclaration = 4, RULE_parameters = 5, RULE_parameter = 6,
		RULE_typeDefinition = 7, RULE_fieldDeclaration = 8, RULE_typeParameters = 9,
		RULE_typeParameter = 10, RULE_forStatement = 11, RULE_whileStatement = 12,
		RULE_name = 13;
	public static final String[] ruleNames = {
		"unit", "moduleDirective", "statement", "exp", "functionDeclaration",
		"parameters", "parameter", "typeDefinition", "fieldDeclaration", "typeParameters",
		"typeParameter", "forStatement", "whileStatement", "name"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0083\u02a4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\6\3A\n\3\r\3\16\3B"+
		"\3\3\3\3\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\5\5s\n\5\3\5\6"+
		"\5v\n\5\r\5\16\5w\3\5\3\5\5\5|\n\5\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16"+
		"\5\u0085\13\5\3\5\5\5\u0088\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0090\n\5"+
		"\f\5\16\5\u0093\13\5\3\5\5\5\u0096\n\5\3\5\6\5\u0099\n\5\r\5\16\5\u009a"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\5\3\5\3\5\3\5\7\5\u00a9\n\5\f"+
		"\5\16\5\u00ac\13\5\3\5\3\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13\5\7\5\u00b6"+
		"\n\5\f\5\16\5\u00b9\13\5\3\5\3\5\7\5\u00bd\n\5\f\5\16\5\u00c0\13\5\5\5"+
		"\u00c2\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u00d2\n\5\f\5\16\5\u00d5\13\5\3\5\5\5\u00d8\n\5\3\5\3\5\3\5\3\5\7\5\u00de"+
		"\n\5\f\5\16\5\u00e1\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e9\n\5\f\5\16"+
		"\5\u00ec\13\5\3\5\5\5\u00ef\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0107\n\5\f\5\16"+
		"\5\u010a\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0113\n\5\f\5\16\5\u0116"+
		"\13\5\5\5\u0118\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0134\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u01c8\n\5\f\5\16\5\u01cb\13\5\3\6\3\6\5\6\u01cf"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01d8\n\6\3\6\3\6\7\6\u01dc\n\6\f"+
		"\6\16\6\u01df\13\6\3\6\3\6\5\6\u01e3\n\6\3\7\3\7\3\7\3\7\7\7\u01e9\n\7"+
		"\f\7\16\7\u01ec\13\7\5\7\u01ee\n\7\3\7\5\7\u01f1\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u01fa\n\b\3\b\3\b\3\b\3\b\5\b\u0200\n\b\3\b\3\b\3\b\5\b"+
		"\u0205\n\b\5\b\u0207\n\b\3\t\3\t\3\t\5\t\u020c\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0220\n\t\3\t"+
		"\3\t\5\t\u0224\n\t\3\t\7\t\u0227\n\t\f\t\16\t\u022a\13\t\3\t\7\t\u022d"+
		"\n\t\f\t\16\t\u0230\13\t\3\t\3\t\3\t\3\t\5\t\u0236\n\t\3\t\3\t\5\t\u023a"+
		"\n\t\3\t\5\t\u023d\n\t\3\t\7\t\u0240\n\t\f\t\16\t\u0243\13\t\3\t\7\t\u0246"+
		"\n\t\f\t\16\t\u0249\13\t\3\t\5\t\u024c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0255\n\n\3\13\3\13\3\13\3\13\7\13\u025b\n\13\f\13\16\13\u025e\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0268\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\6\r\u0271\n\r\r\r\16\r\u0272\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\6\r\u0280\n\r\r\r\16\r\u0281\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\6\r\u028b\n\r\r\r\16\r\u028c\3\r\3\r\5\r\u0291\n\r\3\16\3\16\3\16\6"+
		"\16\u0296\n\16\r\16\16\16\u0297\3\16\3\16\3\17\3\17\3\17\7\17\u029f\n"+
		"\17\f\17\16\17\u02a2\13\17\3\17\2\3\b\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\5\4\2\6\6~~\4\2pqss\4\2\6\6>>\u034a\2\37\3\2\2\2\4O\3\2\2\2\6"+
		"Z\3\2\2\2\b\u0133\3\2\2\2\n\u01e2\3\2\2\2\f\u01e4\3\2\2\2\16\u0206\3\2"+
		"\2\2\20\u024b\3\2\2\2\22\u0254\3\2\2\2\24\u0256\3\2\2\2\26\u0267\3\2\2"+
		"\2\30\u0290\3\2\2\2\32\u0292\3\2\2\2\34\u029b\3\2\2\2\36 \5\6\4\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2"+
		"\2\2%&\7:\2\2&P\7{\2\2\'(\7;\2\2()\7{\2\2)*\7=\2\2*/\7{\2\2+,\7>\2\2,"+
		".\7{\2\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60P\3\2\2\2\61/\3"+
		"\2\2\2\62\63\7?\2\2\63P\7{\2\2\64\65\7@\2\2\65:\7{\2\2\66\67\7>\2\2\67"+
		"9\7{\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;P\3\2\2\2<:\3\2\2\2"+
		"=>\7A\2\2>@\7{\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"D\3\2\2\2DE\7B\2\2EP\3\2\2\2FG\7D\2\2GI\7{\2\2HJ\5\6\4\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7B\2\2NP\3\2\2\2O%\3\2\2\2O\'\3"+
		"\2\2\2O\62\3\2\2\2O\64\3\2\2\2O=\3\2\2\2OF\3\2\2\2P\5\3\2\2\2Q[\5\4\3"+
		"\2R[\5\20\t\2S[\5\n\6\2T[\5\30\r\2U[\5\32\16\2VW\5\b\5\2WX\t\2\2\2X[\3"+
		"\2\2\2Y[\7~\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3"+
		"\2\2\2ZY\3\2\2\2[\7\3\2\2\2\\]\b\5\1\2]^\7\r\2\2^\u0134\5\b\5j_`\7N\2"+
		"\2`\u0134\5\b\5Mab\79\2\2bc\7{\2\2cd\7\37\2\2d\u0134\5\b\5\17ef\7\63\2"+
		"\2f\u0134\5\b\5\5gu\5\34\17\2hn\7a\2\2ij\5\b\5\2jk\7>\2\2km\3\2\2\2li"+
		"\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\5\b\5\2r"+
		"q\3\2\2\2rs\3\2\2\2st\3\2\2\2tv\7b\2\2uh\3\2\2\2vw\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\u0134\3\2\2\2y{\5\34\17\2z|\5\24\13\2{z\3\2\2\2{|\3\2\2\2|"+
		"}\3\2\2\2}\u0087\7S\2\2~\177\5\b\5\2\177\u0080\7>\2\2\u0080\u0082\3\2"+
		"\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5\b\5\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7T"+
		"\2\2\u008a\u0134\3\2\2\2\u008b\u0091\7a\2\2\u008c\u008d\5\b\5\2\u008d"+
		"\u008e\7>\2\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\5\b\5\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7b\2\2\u0098\u008b\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0134\3\2"+
		"\2\2\u009c\u00a2\t\3\2\2\u009d\u00a3\7{\2\2\u009e\u009f\7S\2\2\u009f\u00a0"+
		"\5\b\5\2\u00a0\u00a1\7T\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\u0134\3\2\2\2\u00a4\u0134\7C\2\2\u00a5\u00a6\7\65"+
		"\2\2\u00a6\u00aa\5\b\5\2\u00a7\u00a9\5\6\4\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00b7\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\66\2\2\u00ae\u00b2\5\b\5\2\u00af"+
		"\u00b1\5\6\4\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00ad\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00c1\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00be\7\67\2\2\u00bb"+
		"\u00bd\5\6\4\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00ba\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7B"+
		"\2\2\u00c4\u0134\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c7\5\b\5\2\u00c7"+
		"\u00c8\7B\2\2\u00c8\u0134\3\2\2\2\u00c9\u00ca\7S\2\2\u00ca\u00cb\5\b\5"+
		"\2\u00cb\u00cc\7T\2\2\u00cc\u0134\3\2\2\2\u00cd\u00d3\7S\2\2\u00ce\u00cf"+
		"\5\b\5\2\u00cf\u00d0\7>\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u0134\7T\2\2\u00da\u00db\7\4"+
		"\2\2\u00db\u00df\5\34\17\2\u00dc\u00de\5\b\5\2\u00dd\u00dc\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u0134\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\4\2\2\u00e3\u00e4\5\34\17\2\u00e4"+
		"\u00ea\7S\2\2\u00e5\u00e6\5\b\5\2\u00e6\u00e7\7>\2\2\u00e7\u00e9\3\2\2"+
		"\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\5\b\5\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7T"+
		"\2\2\u00f1\u0134\3\2\2\2\u00f2\u0134\7c\2\2\u00f3\u0134\7d\2\2\u00f4\u0134"+
		"\7e\2\2\u00f5\u0134\7f\2\2\u00f6\u0134\7g\2\2\u00f7\u0134\7h\2\2\u00f8"+
		"\u0134\7i\2\2\u00f9\u0134\7j\2\2\u00fa\u0134\7k\2\2\u00fb\u0134\7l\2\2"+
		"\u00fc\u0134\7m\2\2\u00fd\u0134\7n\2\2\u00fe\u0134\7o\2\2\u00ff\u0134"+
		"\7p\2\2\u0100\u0134\7q\2\2\u0101\u0102\7]\2\2\u0102\u0103\7_\2\2\u0103"+
		"\u0108\5\b\5\2\u0104\u0105\7>\2\2\u0105\u0107\5\b\5\2\u0106\u0104\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7`\2\2\u010c\u0134\3\2"+
		"\2\2\u010d\u010e\7{\2\2\u010e\u0117\7_\2\2\u010f\u0114\5\b\5\2\u0110\u0111"+
		"\7>\2\2\u0111\u0113\5\b\5\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u010f\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0134\7`\2\2\u011a\u0134\5\34\17\2\u011b\u0134\7{\2\2\u011c\u0134\7r"+
		"\2\2\u011d\u0134\7U\2\2\u011e\u0134\7V\2\2\u011f\u0134\7s\2\2\u0120\u0134"+
		"\7t\2\2\u0121\u0134\7u\2\2\u0122\u0134\7v\2\2\u0123\u0134\7w\2\2\u0124"+
		"\u0134\7y\2\2\u0125\u0134\7|\2\2\u0126\u0134\7}\2\2\u0127\u0128\7=\2\2"+
		"\u0128\u0134\7{\2\2\u0129\u0134\7E\2\2\u012a\u0134\7F\2\2\u012b\u0134"+
		"\7G\2\2\u012c\u0134\7H\2\2\u012d\u0134\7I\2\2\u012e\u0134\7J\2\2\u012f"+
		"\u0134\7K\2\2\u0130\u0134\7L\2\2\u0131\u0134\7M\2\2\u0132\u0134\7\63\2"+
		"\2\u0133\\\3\2\2\2\u0133_\3\2\2\2\u0133a\3\2\2\2\u0133e\3\2\2\2\u0133"+
		"g\3\2\2\2\u0133y\3\2\2\2\u0133\u0098\3\2\2\2\u0133\u009c\3\2\2\2\u0133"+
		"\u00a4\3\2\2\2\u0133\u00a5\3\2\2\2\u0133\u00c5\3\2\2\2\u0133\u00c9\3\2"+
		"\2\2\u0133\u00cd\3\2\2\2\u0133\u00da\3\2\2\2\u0133\u00e2\3\2\2\2\u0133"+
		"\u00f2\3\2\2\2\u0133\u00f3\3\2\2\2\u0133\u00f4\3\2\2\2\u0133\u00f5\3\2"+
		"\2\2\u0133\u00f6\3\2\2\2\u0133\u00f7\3\2\2\2\u0133\u00f8\3\2\2\2\u0133"+
		"\u00f9\3\2\2\2\u0133\u00fa\3\2\2\2\u0133\u00fb\3\2\2\2\u0133\u00fc\3\2"+
		"\2\2\u0133\u00fd\3\2\2\2\u0133\u00fe\3\2\2\2\u0133\u00ff\3\2\2\2\u0133"+
		"\u0100\3\2\2\2\u0133\u0101\3\2\2\2\u0133\u010d\3\2\2\2\u0133\u011a\3\2"+
		"\2\2\u0133\u011b\3\2\2\2\u0133\u011c\3\2\2\2\u0133\u011d\3\2\2\2\u0133"+
		"\u011e\3\2\2\2\u0133\u011f\3\2\2\2\u0133\u0120\3\2\2\2\u0133\u0121\3\2"+
		"\2\2\u0133\u0122\3\2\2\2\u0133\u0123\3\2\2\2\u0133\u0124\3\2\2\2\u0133"+
		"\u0125\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u0129\3\2"+
		"\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0133"+
		"\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u01c9\3\2\2\2\u0135"+
		"\u0136\fe\2\2\u0136\u0137\7\16\2\2\u0137\u01c8\5\b\5e\u0138\u0139\fd\2"+
		"\2\u0139\u013a\7\17\2\2\u013a\u01c8\5\b\5e\u013b\u013c\fc\2\2\u013c\u013d"+
		"\7\20\2\2\u013d\u01c8\5\b\5d\u013e\u013f\fb\2\2\u013f\u0140\7\'\2\2\u0140"+
		"\u01c8\5\b\5c\u0141\u0142\fa\2\2\u0142\u0143\7\21\2\2\u0143\u01c8\5\b"+
		"\5b\u0144\u0145\f`\2\2\u0145\u0146\7\22\2\2\u0146\u01c8\5\b\5a\u0147\u0148"+
		"\f_\2\2\u0148\u0149\7\r\2\2\u0149\u01c8\5\b\5`\u014a\u014b\f^\2\2\u014b"+
		"\u014c\7\t\2\2\u014c\u01c8\5\b\5_\u014d\u014e\f]\2\2\u014e\u014f\7\n\2"+
		"\2\u014f\u01c8\5\b\5^\u0150\u0151\f\\\2\2\u0151\u0152\7\13\2\2\u0152\u01c8"+
		"\5\b\5]\u0153\u0154\f[\2\2\u0154\u0155\7\f\2\2\u0155\u01c8\5\b\5\\\u0156"+
		"\u0157\fZ\2\2\u0157\u0158\7\7\2\2\u0158\u01c8\5\b\5[\u0159\u015a\fY\2"+
		"\2\u015a\u015b\7\33\2\2\u015b\u01c8\5\b\5Z\u015c\u015d\fX\2\2\u015d\u015e"+
		"\7\34\2\2\u015e\u01c8\5\b\5Y\u015f\u0160\fW\2\2\u0160\u0161\7\35\2\2\u0161"+
		"\u01c8\5\b\5X\u0162\u0163\fV\2\2\u0163\u0164\7\36\2\2\u0164\u01c8\5\b"+
		"\5W\u0165\u0166\fU\2\2\u0166\u0167\7\31\2\2\u0167\u01c8\5\b\5V\u0168\u0169"+
		"\fT\2\2\u0169\u016a\7\25\2\2\u016a\u01c8\5\b\5U\u016b\u016c\fS\2\2\u016c"+
		"\u016d\7\26\2\2\u016d\u01c8\5\b\5T\u016e\u016f\fR\2\2\u016f\u0170\7\27"+
		"\2\2\u0170\u01c8\5\b\5S\u0171\u0172\fQ\2\2\u0172\u0173\7\30\2\2\u0173"+
		"\u01c8\5\b\5R\u0174\u0175\fP\2\2\u0175\u0176\7\23\2\2\u0176\u01c8\5\b"+
		"\5Q\u0177\u0178\fO\2\2\u0178\u0179\7X\2\2\u0179\u01c8\5\b\5P\u017a\u017b"+
		"\fN\2\2\u017b\u017c\7\60\2\2\u017c\u017d\5\b\5\2\u017d\u017e\7=\2\2\u017e"+
		"\u017f\5\b\5O\u017f\u01c8\3\2\2\2\u0180\u0181\fL\2\2\u0181\u0182\7O\2"+
		"\2\u0182\u01c8\5\b\5M\u0183\u0184\fK\2\2\u0184\u0185\7P\2\2\u0185\u01c8"+
		"\5\b\5L\u0186\u0187\fJ\2\2\u0187\u0188\7Q\2\2\u0188\u01c8\5\b\5K\u0189"+
		"\u018a\fI\2\2\u018a\u018b\7R\2\2\u018b\u01c8\5\b\5J\u018c\u018d\fC\2\2"+
		"\u018d\u018e\7\b\2\2\u018e\u01c8\5\b\5D\u018f\u0190\fB\2\2\u0190\u0191"+
		"\7\37\2\2\u0191\u01c8\5\b\5C\u0192\u0193\fA\2\2\u0193\u0194\7!\2\2\u0194"+
		"\u01c8\5\b\5B\u0195\u0196\f@\2\2\u0196\u0197\7\"\2\2\u0197\u01c8\5\b\5"+
		"A\u0198\u0199\f?\2\2\u0199\u019a\7#\2\2\u019a\u01c8\5\b\5@\u019b\u019c"+
		"\f>\2\2\u019c\u019d\7$\2\2\u019d\u01c8\5\b\5?\u019e\u019f\f=\2\2\u019f"+
		"\u01a0\7%\2\2\u01a0\u01c8\5\b\5>\u01a1\u01a2\f<\2\2\u01a2\u01a3\7&\2\2"+
		"\u01a3\u01c8\5\b\5=\u01a4\u01a5\f;\2\2\u01a5\u01a6\7(\2\2\u01a6\u01c8"+
		"\5\b\5<\u01a7\u01a8\f:\2\2\u01a8\u01a9\7)\2\2\u01a9\u01c8\5\b\5;\u01aa"+
		"\u01ab\f9\2\2\u01ab\u01ac\7*\2\2\u01ac\u01c8\5\b\5:\u01ad\u01ae\f8\2\2"+
		"\u01ae\u01af\7+\2\2\u01af\u01c8\5\b\59\u01b0\u01b1\f\67\2\2\u01b1\u01b2"+
		"\7,\2\2\u01b2\u01c8\5\b\58\u01b3\u01b4\f\66\2\2\u01b4\u01b5\7-\2\2\u01b5"+
		"\u01c8\5\b\5\67\u01b6\u01b7\f\65\2\2\u01b7\u01b8\7/\2\2\u01b8\u01c8\5"+
		"\b\5\66\u01b9\u01ba\f\64\2\2\u01ba\u01bb\7 \2\2\u01bb\u01c8\5\b\5\65\u01bc"+
		"\u01bd\f\63\2\2\u01bd\u01be\7=\2\2\u01be\u01c8\5\b\5\64\u01bf\u01c0\f"+
		"\61\2\2\u01c0\u01c1\7\3\2\2\u01c1\u01c8\5\b\5\61\u01c2\u01c3\f\3\2\2\u01c3"+
		"\u01c4\7<\2\2\u01c4\u01c8\5\b\5\4\u01c5\u01c6\f\62\2\2\u01c6\u01c8\7."+
		"\2\2\u01c7\u0135\3\2\2\2\u01c7\u0138\3\2\2\2\u01c7\u013b\3\2\2\2\u01c7"+
		"\u013e\3\2\2\2\u01c7\u0141\3\2\2\2\u01c7\u0144\3\2\2\2\u01c7\u0147\3\2"+
		"\2\2\u01c7\u014a\3\2\2\2\u01c7\u014d\3\2\2\2\u01c7\u0150\3\2\2\2\u01c7"+
		"\u0153\3\2\2\2\u01c7\u0156\3\2\2\2\u01c7\u0159\3\2\2\2\u01c7\u015c\3\2"+
		"\2\2\u01c7\u015f\3\2\2\2\u01c7\u0162\3\2\2\2\u01c7\u0165\3\2\2\2\u01c7"+
		"\u0168\3\2\2\2\u01c7\u016b\3\2\2\2\u01c7\u016e\3\2\2\2\u01c7\u0171\3\2"+
		"\2\2\u01c7\u0174\3\2\2\2\u01c7\u0177\3\2\2\2\u01c7\u017a\3\2\2\2\u01c7"+
		"\u0180\3\2\2\2\u01c7\u0183\3\2\2\2\u01c7\u0186\3\2\2\2\u01c7\u0189\3\2"+
		"\2\2\u01c7\u018c\3\2\2\2\u01c7\u018f\3\2\2\2\u01c7\u0192\3\2\2\2\u01c7"+
		"\u0195\3\2\2\2\u01c7\u0198\3\2\2\2\u01c7\u019b\3\2\2\2\u01c7\u019e\3\2"+
		"\2\2\u01c7\u01a1\3\2\2\2\u01c7\u01a4\3\2\2\2\u01c7\u01a7\3\2\2\2\u01c7"+
		"\u01aa\3\2\2\2\u01c7\u01ad\3\2\2\2\u01c7\u01b0\3\2\2\2\u01c7\u01b3\3\2"+
		"\2\2\u01c7\u01b6\3\2\2\2\u01c7\u01b9\3\2\2\2\u01c7\u01bc\3\2\2\2\u01c7"+
		"\u01bf\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\t\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01ce\5\34\17\2\u01cd\u01cf\5\24\13\2\u01ce\u01cd\3\2\2"+
		"\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\5\f\7\2\u01d1\u01d2"+
		"\7\37\2\2\u01d2\u01d3\5\6\4\2\u01d3\u01e3\3\2\2\2\u01d4\u01d5\7^\2\2\u01d5"+
		"\u01d7\5\34\17\2\u01d6\u01d8\5\24\13\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\5\f\7\2\u01da\u01dc\5\6\4\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7B\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01cc\3\2\2\2\u01e2\u01d4\3\2\2\2\u01e3\13\3\2\2"+
		"\2\u01e4\u01ed\7S\2\2\u01e5\u01ea\5\16\b\2\u01e6\u01e7\t\4\2\2\u01e7\u01e9"+
		"\5\16\b\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2"+
		"\u01ea\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01e5"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01f1\7.\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7T"+
		"\2\2\u01f3\r\3\2\2\2\u01f4\u01f5\7{\2\2\u01f5\u01f6\7<\2\2\u01f6\u01f9"+
		"\5\b\5\2\u01f7\u01f8\7\37\2\2\u01f8\u01fa\5\b\5\2\u01f9\u01f7\3\2\2\2"+
		"\u01f9\u01fa\3\2\2\2\u01fa\u0207\3\2\2\2\u01fb\u01fc\7<\2\2\u01fc\u01ff"+
		"\5\b\5\2\u01fd\u01fe\7\37\2\2\u01fe\u0200\5\b\5\2\u01ff\u01fd\3\2\2\2"+
		"\u01ff\u0200\3\2\2\2\u0200\u0207\3\2\2\2\u0201\u0204\7{\2\2\u0202\u0203"+
		"\7\37\2\2\u0203\u0205\5\b\5\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2"+
		"\u0205\u0207\3\2\2\2\u0206\u01f4\3\2\2\2\u0206\u01fb\3\2\2\2\u0206\u0201"+
		"\3\2\2\2\u0207\17\3\2\2\2\u0208\u0209\7Z\2\2\u0209\u020b\7{\2\2\u020a"+
		"\u020c\5\24\13\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u024c\5\b\5\2\u020e\u020f\7W\2\2\u020f\u0210\7{\2\2\u0210"+
		"\u0211\7X\2\2\u0211\u024c\7{\2\2\u0212\u0213\7W\2\2\u0213\u024c\7{\2\2"+
		"\u0214\u0215\7Y\2\2\u0215\u0216\7\u0083\2\2\u0216\u0217\7{\2\2\u0217\u0218"+
		"\7X\2\2\u0218\u024c\7{\2\2\u0219\u021a\7Y\2\2\u021a\u021b\7\u0083\2\2"+
		"\u021b\u024c\7{\2\2\u021c\u021d\7[\2\2\u021d\u021f\7{\2\2\u021e\u0220"+
		"\5\24\13\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2"+
		"\u0221\u0222\7X\2\2\u0222\u0224\7{\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0228\3\2\2\2\u0225\u0227\5\22\n\2\u0226\u0225\3\2\2\2"+
		"\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022e"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\5\n\6\2\u022c\u022b\3\2\2\2\u022d"+
		"\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0231\u024c\7B\2\2\u0232\u0233\7\\\2\2\u0233"+
		"\u0235\7{\2\2\u0234\u0236\5\24\13\2\u0235\u0234\3\2\2\2\u0235\u0236\3"+
		"\2\2\2\u0236\u0239\3\2\2\2\u0237\u0238\7X\2\2\u0238\u023a\7{\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u023d\5\24"+
		"\13\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0241\3\2\2\2\u023e"+
		"\u0240\5\22\n\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3"+
		"\2\2\2\u0241\u0242\3\2\2\2\u0242\u0247\3\2\2\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0246\5\n\6\2\u0245\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a"+
		"\u024c\7B\2\2\u024b\u0208\3\2\2\2\u024b\u020e\3\2\2\2\u024b\u0212\3\2"+
		"\2\2\u024b\u0214\3\2\2\2\u024b\u0219\3\2\2\2\u024b\u021c\3\2\2\2\u024b"+
		"\u0232\3\2\2\2\u024c\21\3\2\2\2\u024d\u024e\7{\2\2\u024e\u024f\7<\2\2"+
		"\u024f\u0250\5\b\5\2\u0250\u0251\7~\2\2\u0251\u0255\3\2\2\2\u0252\u0253"+
		"\7{\2\2\u0253\u0255\7~\2\2\u0254\u024d\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\23\3\2\2\2\u0256\u0257\7_\2\2\u0257\u025c\5\26\f\2\u0258\u0259\7>\2\2"+
		"\u0259\u025b\5\26\f\2\u025a\u0258\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0260\7`\2\2\u0260\25\3\2\2\2\u0261\u0262\7{\2\2\u0262\u0263\7X\2\2\u0263"+
		"\u0268\5\b\5\2\u0264\u0265\7<\2\2\u0265\u0268\5\b\5\2\u0266\u0268\5\b"+
		"\5\2\u0267\u0261\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0266\3\2\2\2\u0268"+
		"\27\3\2\2\2\u0269\u026a\78\2\2\u026a\u026b\5\b\5\2\u026b\u026c\7\37\2"+
		"\2\u026c\u026d\5\b\5\2\u026d\u026e\7=\2\2\u026e\u0270\5\b\5\2\u026f\u0271"+
		"\5\6\4\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\7B\2\2\u0275\u0291\3\2"+
		"\2\2\u0276\u0277\78\2\2\u0277\u0278\5\b\5\2\u0278\u0279\7\37\2\2\u0279"+
		"\u027a\5\b\5\2\u027a\u027b\7=\2\2\u027b\u027c\5\b\5\2\u027c\u027d\7=\2"+
		"\2\u027d\u027f\5\b\5\2\u027e\u0280\5\6\4\2\u027f\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\7B\2\2\u0284\u0291\3\2\2\2\u0285\u0286\78\2\2\u0286\u0287\5\b\5"+
		"\2\u0287\u0288\7\64\2\2\u0288\u028a\5\b\5\2\u0289\u028b\5\6\4\2\u028a"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7B\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u0269\3\2\2\2\u0290\u0276\3\2\2\2\u0290\u0285\3\2\2\2\u0291\31\3\2\2"+
		"\2\u0292\u0293\7\61\2\2\u0293\u0295\5\b\5\2\u0294\u0296\5\6\4\2\u0295"+
		"\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\3\2\2\2\u0299\u029a\7B\2\2\u029a\33\3\2\2\2\u029b\u02a0"+
		"\7{\2\2\u029c\u029d\7\5\2\2\u029d\u029f\7{\2\2\u029e\u029c\3\2\2\2\u029f"+
		"\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\35\3\2\2"+
		"\2\u02a2\u02a0\3\2\2\2B!/:BKOZnrw{\u0083\u0087\u0091\u0095\u009a\u00a2"+
		"\u00aa\u00b2\u00b7\u00be\u00c1\u00d3\u00d7\u00df\u00ea\u00ee\u0108\u0114"+
		"\u0117\u0133\u01c7\u01c9\u01ce\u01d7\u01dd\u01e2\u01ea\u01ed\u01f0\u01f9"+
		"\u01ff\u0204\u0206\u020b\u021f\u0223\u0228\u022e\u0235\u0239\u023c\u0241"+
		"\u0247\u024b\u0254\u025c\u0267\u0272\u0281\u028c\u0290\u0297\u02a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'@'", "'.'", "';'", "'=='", null, "'>'", "'<'", "'>='",
		null, "'-'", "'^'", "'//'", "'*'", "'/'", "'+'", "'.=='", null, "'.>'",
		"'.<'", "'.>='", null, "'.-'", "'.^'", "'.//'", "'.*'", "'./'", "'.+'",
		"'='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'\\='", "'%='", "'%'",
		"'^='", "'&='", "'|='", "'$='", "'>>>='", "'>>='", "'...'", "'<<='", "'?'",
		"'while'", "'begin'", "'return'", "'in'", "'if'", "'elseif'", "'else'",
		"'for'", "'const'", "'using'", "'import'", "'::'", "':'", "','", "'importall'",
		"'export'", "'module'", null, null, "'baremodule'", "'Inf16'", "'Inf32'",
		"'Inf'", "'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'",
		"'!'", "'&&'", "'&'", "'||'", "'|'", "'('", "')'", "'true'", "'false'",
		"'abstract'", "'<:'", "'bitstype'", "'typealias'", "'type'", "'immutable'",
		"'Union'", "'function'", "'{'", "'}'", "'['", "']'", "'Int8'", "'Uint8'",
		"'Int16'", "'Uint16'", "'Int32'", "'Uint32'", "'Int64'", "'Uint64'", "'Int128'",
		"'Uint128'", "'Bool'", "'Char'", "'Float16'", "'Float32'", "'Float64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARROW", "AT", "DOT", "SEMI_COLON", "EQUALS", "NOT_EQUAL", "GREATER_THAN",
		"LESS_THAN", "GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ", "MINUS", "EXPONENT",
		"FRACTION", "TIMES", "DIVIDE", "PLUS", "ELM_EQUALS", "ELM_NOT_EQUAL",
		"ELM_GREATER_THAN", "ELM_LESS_THAN", "ELM_GREATER_THAN_OR_EQ", "ELM_LESS_THAN_OR_EQ",
		"ELM_MINUS", "ELM_EXPONENT", "ELM_FRACTION", "ELM_TIMES", "ELM_DIVIDE",
		"ELM_PLUS", "EQ", "DOUBLE_ARROW", "ADD_ASGN", "SUB_ASGN", "TIMES_ASGN",
		"DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", "REM", "POWER_ASGN",
		"BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN", "LSR_ASGN",
		"ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE", "BEGIN",
		"RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "USING", "IMPORT",
		"INSTANCE_OF", "COLON", "COMMA", "IMPORT_ALL", "EXPORT", "MODULE", "END",
		"END_LITERAL", "BAREMODULE", "INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32",
		"MINUS_INF", "NAN16", "NAN32", "NAN", "NOT", "AND", "BITWISE_AND", "OR",
		"BITWISE_OR", "LEFT_BRACKET", "RIGHT_BRACKET", "TRUE", "FALSE", "ABSTRACT",
		"SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE", "IMMUTABLE", "UNION", "FUNCTION",
		"LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE", "INT8", "UINT8",
		"INT16", "UINT16", "INT32", "UINT32", "INT64", "UINT64", "INT128", "UINT128",
		"BOOL", "CHAR", "FLOAT16", "FLOAT32", "FLOAT64", "REGEX", "INT", "BINARY",
		"OCTAL", "HEX", "FLOAT32_LITERAL", "EXP32", "FLOAT64_LITERAL", "EXP64",
		"ID", "CHARACTER_LITERAL", "STRING", "EOL", "IGNORED_EOL", "WS", "COMMENT",
		"LINE_COMMENT", "SIZE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public JuliaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				statement();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
			setState(33);
			match(EOF);
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(88);
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
				typeDefinition();
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
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==SEMI_COLON || _la==EOL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
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
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				match(MINUS);
				setState(92);
				exp(104);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(NOT);
				setState(94);
				exp(75);
				}
				break;
			case 3:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(CONST);
				setState(96);
				match(ID);
				setState(97);
				match(EQ);
				setState(98);
				exp(13);
				}
				break;
			case 4:
				{
				_localctx = new ReturnExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(RETURN);
				setState(100);
				exp(3);
				}
				break;
			case 5:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				name();
				setState(115);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						match(LEFT_SQUARE);
						setState(108);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(103);
								exp(0);
								setState(104);
								match(COMMA);
								}
								}
							}
							setState(110);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
						setState(112);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(111);
							exp(0);
							}
						}

						setState(114);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new ApplyFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				name();
				setState(121);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(120);
					typeParameters();
					}
				}

				setState(123);
				match(LEFT_BRACKET);
				setState(133);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(124);
							exp(0);
							setState(125);
							match(COMMA);
							}
							}
						}
						setState(131);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(132);
					exp(0);
					}
				}

				setState(135);
				match(RIGHT_BRACKET);
				}
				break;
			case 7:
				{
				_localctx = new EnumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(137);
						match(LEFT_SQUARE);
						setState(143);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(138);
								exp(0);
								setState(139);
								match(COMMA);
								}
								}
							}
							setState(145);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						}
						setState(147);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
							{
							setState(146);
							exp(0);
							}
						}

						setState(149);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(152);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				{
				_localctx = new CoeffientContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				_la = _input.LA(1);
				if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (FLOAT32 - 110)) | (1L << (FLOAT64 - 110)) | (1L << (INT - 110)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(160);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(155);
					match(ID);
					}
					break;
				case LEFT_BRACKET:
					{
					setState(156);
					match(LEFT_BRACKET);
					setState(157);
					exp(0);
					setState(158);
					match(RIGHT_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				_localctx = new EndLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(END_LITERAL);
				}
				break;
			case 10:
				{
				_localctx = new NaryConditionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(IF);
				setState(164);
				exp(0);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0)) {
					{
					{
					setState(165);
					statement();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF) {
					{
					{
					setState(171);
					match(ELSE_IF);
					setState(172);
					exp(0);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0)) {
						{
						{
						setState(173);
						statement();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(184);
					match(ELSE);
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0)) {
						{
						{
						setState(185);
						statement();
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(193);
				match(END);
				}
				break;
			case 11:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(BEGIN);
				setState(196);
				exp(0);
				setState(197);
				match(END);
				}
				break;
			case 12:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(LEFT_BRACKET);
				setState(200);
				exp(0);
				setState(201);
				match(RIGHT_BRACKET);
				}
				break;
			case 13:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(LEFT_BRACKET);
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						exp(0);
						setState(205);
						match(COMMA);
						}
						}
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(213);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(212);
					exp(0);
					}
				}

				setState(215);
				match(RIGHT_BRACKET);
				}
				break;
			case 14:
				{
				_localctx = new InvokeMarco1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(AT);
				setState(217);
				name();
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						exp(0);
						}
						}
					}
					setState(223);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 15:
				{
				_localctx = new InvokeMarco2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(AT);
				setState(225);
				name();
				setState(226);
				match(LEFT_BRACKET);
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						exp(0);
						setState(228);
						match(COMMA);
						}
						}
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(236);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(235);
					exp(0);
					}
				}

				setState(238);
				match(RIGHT_BRACKET);
				}
				break;
			case 16:
				{
				_localctx = new Int8Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(INT8);
				}
				break;
			case 17:
				{
				_localctx = new Uint8Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(UINT8);
				}
				break;
			case 18:
				{
				_localctx = new Int16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(INT16);
				}
				break;
			case 19:
				{
				_localctx = new Uint16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(UINT16);
				}
				break;
			case 20:
				{
				_localctx = new Int32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(INT32);
				}
				break;
			case 21:
				{
				_localctx = new Uint32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(UINT32);
				}
				break;
			case 22:
				{
				_localctx = new Int64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				match(INT64);
				}
				break;
			case 23:
				{
				_localctx = new Uint64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(UINT64);
				}
				break;
			case 24:
				{
				_localctx = new Int128Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(INT128);
				}
				break;
			case 25:
				{
				_localctx = new Uint128Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(UINT128);
				}
				break;
			case 26:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(BOOL);
				}
				break;
			case 27:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(CHAR);
				}
				break;
			case 28:
				{
				_localctx = new Float16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(FLOAT16);
				}
				break;
			case 29:
				{
				_localctx = new Float32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(FLOAT32);
				}
				break;
			case 30:
				{
				_localctx = new Float64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(FLOAT64);
				}
				break;
			case 31:
				{
				_localctx = new UnionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(UNION);
				setState(256);
				match(LEFT_CURLY);
				setState(257);
				exp(0);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(258);
					match(COMMA);
					setState(259);
					exp(0);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(265);
				match(RIGHT_CURLY);
				}
				break;
			case 32:
				{
				_localctx = new ParametricTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(ID);
				setState(268);
				match(LEFT_CURLY);
				setState(277);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (UNION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)))) != 0)) {
					{
					setState(269);
					exp(0);
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(270);
						match(COMMA);
						setState(271);
						exp(0);
						}
						}
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(279);
				match(RIGHT_CURLY);
				}
				break;
			case 33:
				{
				_localctx = new QualifiedNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				name();
				}
				break;
			case 34:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(ID);
				}
				break;
			case 35:
				{
				_localctx = new RegexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(REGEX);
				}
				break;
			case 36:
				{
				_localctx = new TtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(TRUE);
				}
				break;
			case 37:
				{
				_localctx = new FfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(FALSE);
				}
				break;
			case 38:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(INT);
				}
				break;
			case 39:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(BINARY);
				}
				break;
			case 40:
				{
				_localctx = new OctalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(OCTAL);
				}
				break;
			case 41:
				{
				_localctx = new HexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(HEX);
				}
				break;
			case 42:
				{
				_localctx = new Ffloat32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(FLOAT32_LITERAL);
				}
				break;
			case 43:
				{
				_localctx = new Ffloat64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(FLOAT64_LITERAL);
				}
				break;
			case 44:
				{
				_localctx = new CharaacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(CHARACTER_LITERAL);
				}
				break;
			case 45:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(STRING);
				}
				break;
			case 46:
				{
				_localctx = new SymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(COLON);
				setState(294);
				match(ID);
				}
				break;
			case 47:
				{
				_localctx = new Inf16TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(INF16);
				}
				break;
			case 48:
				{
				_localctx = new Inf32TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(INF32);
				}
				break;
			case 49:
				{
				_localctx = new InfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(INF);
				}
				break;
			case 50:
				{
				_localctx = new MinusInf16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(MINUS_INF16);
				}
				break;
			case 51:
				{
				_localctx = new MinusInf32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(MINUS_INF32);
				}
				break;
			case 52:
				{
				_localctx = new MinusInfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(MINUS_INF);
				}
				break;
			case 53:
				{
				_localctx = new Nan16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(NAN16);
				}
				break;
			case 54:
				{
				_localctx = new Nan32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(NAN32);
				}
				break;
			case 55:
				{
				_localctx = new NanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(NAN);
				}
				break;
			case 56:
				{
				_localctx = new ReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(RETURN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(453);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(307);
						if (!(precpred(_ctx, 99))) throw new FailedPredicateException(this, "precpred(_ctx, 99)");
						setState(308);
						match(EXPONENT);
						setState(309);
						exp(99);
						}
						break;
					case 2:
						{
						_localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(310);
						if (!(precpred(_ctx, 98))) throw new FailedPredicateException(this, "precpred(_ctx, 98)");
						setState(311);
						match(FRACTION);
						setState(312);
						exp(99);
						}
						break;
					case 3:
						{
						_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(313);
						if (!(precpred(_ctx, 97))) throw new FailedPredicateException(this, "precpred(_ctx, 97)");
						setState(314);
						match(TIMES);
						setState(315);
						exp(98);
						}
						break;
					case 4:
						{
						_localctx = new RemainderContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(316);
						if (!(precpred(_ctx, 96))) throw new FailedPredicateException(this, "precpred(_ctx, 96)");
						setState(317);
						match(REM);
						setState(318);
						exp(97);
						}
						break;
					case 5:
						{
						_localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(319);
						if (!(precpred(_ctx, 95))) throw new FailedPredicateException(this, "precpred(_ctx, 95)");
						setState(320);
						match(DIVIDE);
						setState(321);
						exp(96);
						}
						break;
					case 6:
						{
						_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(322);
						if (!(precpred(_ctx, 94))) throw new FailedPredicateException(this, "precpred(_ctx, 94)");
						setState(323);
						match(PLUS);
						setState(324);
						exp(95);
						}
						break;
					case 7:
						{
						_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(325);
						if (!(precpred(_ctx, 93))) throw new FailedPredicateException(this, "precpred(_ctx, 93)");
						setState(326);
						match(MINUS);
						setState(327);
						exp(94);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(328);
						if (!(precpred(_ctx, 92))) throw new FailedPredicateException(this, "precpred(_ctx, 92)");
						setState(329);
						match(GREATER_THAN);
						setState(330);
						exp(93);
						}
						break;
					case 9:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 91))) throw new FailedPredicateException(this, "precpred(_ctx, 91)");
						setState(332);
						match(LESS_THAN);
						setState(333);
						exp(92);
						}
						break;
					case 10:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(334);
						if (!(precpred(_ctx, 90))) throw new FailedPredicateException(this, "precpred(_ctx, 90)");
						setState(335);
						match(GREATER_THAN_OR_EQ);
						setState(336);
						exp(91);
						}
						break;
					case 11:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(337);
						if (!(precpred(_ctx, 89))) throw new FailedPredicateException(this, "precpred(_ctx, 89)");
						setState(338);
						match(LESS_THAN_OR_EQ);
						setState(339);
						exp(90);
						}
						break;
					case 12:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(340);
						if (!(precpred(_ctx, 88))) throw new FailedPredicateException(this, "precpred(_ctx, 88)");
						setState(341);
						match(EQUALS);
						setState(342);
						exp(89);
						}
						break;
					case 13:
						{
						_localctx = new ElmFractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(343);
						if (!(precpred(_ctx, 87))) throw new FailedPredicateException(this, "precpred(_ctx, 87)");
						setState(344);
						match(ELM_FRACTION);
						setState(345);
						exp(88);
						}
						break;
					case 14:
						{
						_localctx = new ElmTimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(346);
						if (!(precpred(_ctx, 86))) throw new FailedPredicateException(this, "precpred(_ctx, 86)");
						setState(347);
						match(ELM_TIMES);
						setState(348);
						exp(87);
						}
						break;
					case 15:
						{
						_localctx = new ElmDivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(349);
						if (!(precpred(_ctx, 85))) throw new FailedPredicateException(this, "precpred(_ctx, 85)");
						setState(350);
						match(ELM_DIVIDE);
						setState(351);
						exp(86);
						}
						break;
					case 16:
						{
						_localctx = new ElmPlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(352);
						if (!(precpred(_ctx, 84))) throw new FailedPredicateException(this, "precpred(_ctx, 84)");
						setState(353);
						match(ELM_PLUS);
						setState(354);
						exp(85);
						}
						break;
					case 17:
						{
						_localctx = new ElmMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(355);
						if (!(precpred(_ctx, 83))) throw new FailedPredicateException(this, "precpred(_ctx, 83)");
						setState(356);
						match(ELM_MINUS);
						setState(357);
						exp(84);
						}
						break;
					case 18:
						{
						_localctx = new ElmGreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(358);
						if (!(precpred(_ctx, 82))) throw new FailedPredicateException(this, "precpred(_ctx, 82)");
						setState(359);
						match(ELM_GREATER_THAN);
						setState(360);
						exp(83);
						}
						break;
					case 19:
						{
						_localctx = new ElmLessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 81))) throw new FailedPredicateException(this, "precpred(_ctx, 81)");
						setState(362);
						match(ELM_LESS_THAN);
						setState(363);
						exp(82);
						}
						break;
					case 20:
						{
						_localctx = new ElmGreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(364);
						if (!(precpred(_ctx, 80))) throw new FailedPredicateException(this, "precpred(_ctx, 80)");
						setState(365);
						match(ELM_GREATER_THAN_OR_EQ);
						setState(366);
						exp(81);
						}
						break;
					case 21:
						{
						_localctx = new ElmLessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 79))) throw new FailedPredicateException(this, "precpred(_ctx, 79)");
						setState(368);
						match(ELM_LESS_THAN_OR_EQ);
						setState(369);
						exp(80);
						}
						break;
					case 22:
						{
						_localctx = new ElmEqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 78))) throw new FailedPredicateException(this, "precpred(_ctx, 78)");
						setState(371);
						match(ELM_EQUALS);
						setState(372);
						exp(79);
						}
						break;
					case 23:
						{
						_localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(373);
						if (!(precpred(_ctx, 77))) throw new FailedPredicateException(this, "precpred(_ctx, 77)");
						setState(374);
						match(SUB_TYPE);
						setState(375);
						exp(78);
						}
						break;
					case 24:
						{
						_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(376);
						if (!(precpred(_ctx, 76))) throw new FailedPredicateException(this, "precpred(_ctx, 76)");
						setState(377);
						match(QUESTION_MARK);
						setState(378);
						exp(0);
						setState(379);
						match(COLON);
						setState(380);
						exp(77);
						}
						break;
					case 25:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(382);
						if (!(precpred(_ctx, 74))) throw new FailedPredicateException(this, "precpred(_ctx, 74)");
						setState(383);
						match(AND);
						setState(384);
						exp(75);
						}
						break;
					case 26:
						{
						_localctx = new BitwiseAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(385);
						if (!(precpred(_ctx, 73))) throw new FailedPredicateException(this, "precpred(_ctx, 73)");
						setState(386);
						match(BITWISE_AND);
						setState(387);
						exp(74);
						}
						break;
					case 27:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(388);
						if (!(precpred(_ctx, 72))) throw new FailedPredicateException(this, "precpred(_ctx, 72)");
						setState(389);
						match(OR);
						setState(390);
						exp(73);
						}
						break;
					case 28:
						{
						_localctx = new BitwisOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(391);
						if (!(precpred(_ctx, 71))) throw new FailedPredicateException(this, "precpred(_ctx, 71)");
						setState(392);
						match(BITWISE_OR);
						setState(393);
						exp(72);
						}
						break;
					case 29:
						{
						_localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(394);
						if (!(precpred(_ctx, 65))) throw new FailedPredicateException(this, "precpred(_ctx, 65)");
						setState(395);
						match(NOT_EQUAL);
						setState(396);
						exp(66);
						}
						break;
					case 30:
						{
						_localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(397);
						if (!(precpred(_ctx, 64))) throw new FailedPredicateException(this, "precpred(_ctx, 64)");
						setState(398);
						match(EQ);
						setState(399);
						exp(65);
						}
						break;
					case 31:
						{
						_localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(400);
						if (!(precpred(_ctx, 63))) throw new FailedPredicateException(this, "precpred(_ctx, 63)");
						setState(401);
						match(ADD_ASGN);
						setState(402);
						exp(64);
						}
						break;
					case 32:
						{
						_localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(403);
						if (!(precpred(_ctx, 62))) throw new FailedPredicateException(this, "precpred(_ctx, 62)");
						setState(404);
						match(SUB_ASGN);
						setState(405);
						exp(63);
						}
						break;
					case 33:
						{
						_localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(406);
						if (!(precpred(_ctx, 61))) throw new FailedPredicateException(this, "precpred(_ctx, 61)");
						setState(407);
						match(TIMES_ASGN);
						setState(408);
						exp(62);
						}
						break;
					case 34:
						{
						_localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(409);
						if (!(precpred(_ctx, 60))) throw new FailedPredicateException(this, "precpred(_ctx, 60)");
						setState(410);
						match(DIVIDE_ASGN);
						setState(411);
						exp(61);
						}
						break;
					case 35:
						{
						_localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(412);
						if (!(precpred(_ctx, 59))) throw new FailedPredicateException(this, "precpred(_ctx, 59)");
						setState(413);
						match(INV_DIVIDE_ASGN);
						setState(414);
						exp(60);
						}
						break;
					case 36:
						{
						_localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(415);
						if (!(precpred(_ctx, 58))) throw new FailedPredicateException(this, "precpred(_ctx, 58)");
						setState(416);
						match(REMAINDER_ASGN);
						setState(417);
						exp(59);
						}
						break;
					case 37:
						{
						_localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(418);
						if (!(precpred(_ctx, 57))) throw new FailedPredicateException(this, "precpred(_ctx, 57)");
						setState(419);
						match(POWER_ASGN);
						setState(420);
						exp(58);
						}
						break;
					case 38:
						{
						_localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(421);
						if (!(precpred(_ctx, 56))) throw new FailedPredicateException(this, "precpred(_ctx, 56)");
						setState(422);
						match(BITWISE_AND_ASGN);
						setState(423);
						exp(57);
						}
						break;
					case 39:
						{
						_localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(424);
						if (!(precpred(_ctx, 55))) throw new FailedPredicateException(this, "precpred(_ctx, 55)");
						setState(425);
						match(BITWISE_OR_ASGN);
						setState(426);
						exp(56);
						}
						break;
					case 40:
						{
						_localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(427);
						if (!(precpred(_ctx, 54))) throw new FailedPredicateException(this, "precpred(_ctx, 54)");
						setState(428);
						match(BITWISE_XOR_ASGN);
						setState(429);
						exp(55);
						}
						break;
					case 41:
						{
						_localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(430);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(431);
						match(LSR_ASGN);
						setState(432);
						exp(54);
						}
						break;
					case 42:
						{
						_localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(433);
						if (!(precpred(_ctx, 52))) throw new FailedPredicateException(this, "precpred(_ctx, 52)");
						setState(434);
						match(ASR_ASGN);
						setState(435);
						exp(53);
						}
						break;
					case 43:
						{
						_localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(436);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(437);
						match(ASL_ASGN);
						setState(438);
						exp(52);
						}
						break;
					case 44:
						{
						_localctx = new PairContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(439);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(440);
						match(DOUBLE_ARROW);
						setState(441);
						exp(51);
						}
						break;
					case 45:
						{
						_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(442);
						if (!(precpred(_ctx, 49))) throw new FailedPredicateException(this, "precpred(_ctx, 49)");
						setState(443);
						match(COLON);
						setState(444);
						exp(50);
						}
						break;
					case 46:
						{
						_localctx = new LambdaContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(445);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(446);
						match(ARROW);
						setState(447);
						exp(47);
						}
						break;
					case 47:
						{
						_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(448);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(449);
						match(INSTANCE_OF);
						setState(450);
						exp(2);
						}
						break;
					case 48:
						{
						_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(451);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(452);
						match(ELLIPSE);
						}
						break;
					}
					}
				}
				setState(457);
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

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			setState(480);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CompactFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				name();
				setState(460);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(459);
					typeParameters();
					}
				}

				setState(462);
				parameters();
				setState(463);
				match(EQ);
				setState(464);
				statement();
				}
				break;
			case FUNCTION:
				_localctx = new GeneralFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(FUNCTION);
				setState(467);
				name();
				setState(469);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(468);
					typeParameters();
					}
				}

				setState(471);
				parameters();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0)) {
					{
					{
					setState(472);
					statement();
					}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
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

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			_localctx = new PparametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(LEFT_BRACKET);
			setState(491);
			_la = _input.LA(1);
			if (_la==INSTANCE_OF || _la==ID) {
				{
				setState(483);
				parameter();
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==COMMA) {
					{
					{
					setState(484);
					_la = _input.LA(1);
					if ( !(_la==SEMI_COLON || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(485);
					parameter();
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(494);
			_la = _input.LA(1);
			if (_la==ELLIPSE) {
				{
				setState(493);
				match(ELLIPSE);
				}
			}

			setState(496);
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

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			setState(516);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new NamedTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(ID);
				setState(499);
				match(INSTANCE_OF);
				setState(500);
				exp(0);
				setState(503);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(501);
					match(EQ);
					setState(502);
					exp(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new AnonymousTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(INSTANCE_OF);
				setState(506);
				exp(0);
				setState(509);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(507);
					match(EQ);
					setState(508);
					exp(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new NamedParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(ID);
				setState(514);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(512);
					match(EQ);
					setState(513);
					exp(0);
					}
				}

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

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeDefinition);
		int _la;
		try {
			int _alt;
			setState(585);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				_localctx = new TypeAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(TYPE_ALIAS);
				setState(519);
				match(ID);
				setState(521);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(520);
					typeParameters();
					}
				}

				setState(523);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AbstractSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(ABSTRACT);
				setState(525);
				match(ID);
				setState(526);
				match(SUB_TYPE);
				setState(527);
				match(ID);
				}
				break;
			case 3:
				_localctx = new AbstractTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				match(ABSTRACT);
				setState(529);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BitsSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				match(BITS_TYPE);
				setState(531);
				match(SIZE);
				setState(532);
				match(ID);
				setState(533);
				match(SUB_TYPE);
				setState(534);
				match(ID);
				}
				break;
			case 5:
				_localctx = new BitsTtypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				match(BITS_TYPE);
				setState(536);
				match(SIZE);
				setState(537);
				match(ID);
				}
				break;
			case 6:
				_localctx = new TypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				match(TYPE);
				setState(539);
				match(ID);
				setState(541);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(540);
					typeParameters();
					}
				}

				setState(545);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(543);
					match(SUB_TYPE);
					setState(544);
					match(ID);
					}
				}

				setState(550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						fieldDeclaration();
						}
						}
					}
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(553);
					functionDeclaration();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(END);
				}
				break;
			case 7:
				_localctx = new ImmutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				match(IMMUTABLE);
				setState(561);
				match(ID);
				setState(563);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(562);
					typeParameters();
					}
					break;
				}
				setState(567);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(565);
					match(SUB_TYPE);
					setState(566);
					match(ID);
					}
				}

				setState(570);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(569);
					typeParameters();
					}
				}

				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(572);
						fieldDeclaration();
						}
						}
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(578);
					functionDeclaration();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
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

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		try {
			setState(594);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new TypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(ID);
				setState(588);
				match(INSTANCE_OF);
				setState(589);
				exp(0);
				setState(590);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new UntypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(ID);
				setState(593);
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

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			_localctx = new TtypeParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LEFT_CURLY);
			setState(597);
			typeParameter();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(598);
				match(COMMA);
				setState(599);
				typeParameter();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
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

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		try {
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new NamedSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(ID);
				setState(608);
				match(SUB_TYPE);
				setState(609);
				exp(0);
				}
				break;
			case 2:
				_localctx = new InstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(INSTANCE_OF);
				setState(611);
				exp(0);
				}
				break;
			case 3:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
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

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		int _la;
		try {
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new ForEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(FOR);
				setState(616);
				exp(0);
				setState(617);
				match(EQ);
				setState(618);
				exp(0);
				setState(619);
				match(COLON);
				setState(620);
				exp(0);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(621);
					statement();
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
				setState(626);
				match(END);
				}
				break;
			case 2:
				_localctx = new ForEqStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(FOR);
				setState(629);
				exp(0);
				setState(630);
				match(EQ);
				setState(631);
				exp(0);
				setState(632);
				match(COLON);
				setState(633);
				exp(0);
				setState(634);
				match(COLON);
				setState(635);
				exp(0);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(636);
					statement();
					}
					}
					setState(639);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
				setState(641);
				match(END);
				}
				break;
			case 3:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(643);
				match(FOR);
				setState(644);
				exp(0);
				setState(645);
				match(IN);
				setState(646);
				exp(0);
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(647);
					statement();
					}
					}
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
				setState(652);
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

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(WHILE);
			setState(657);
			exp(0);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(658);
				statement();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (END_LITERAL - 65)) | (1L << (BAREMODULE - 65)) | (1L << (INF16 - 65)) | (1L << (INF32 - 65)) | (1L << (INF - 65)) | (1L << (MINUS_INF16 - 65)) | (1L << (MINUS_INF32 - 65)) | (1L << (MINUS_INF - 65)) | (1L << (NAN16 - 65)) | (1L << (NAN32 - 65)) | (1L << (NAN - 65)) | (1L << (NOT - 65)) | (1L << (LEFT_BRACKET - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ABSTRACT - 65)) | (1L << (BITS_TYPE - 65)) | (1L << (TYPE_ALIAS - 65)) | (1L << (TYPE - 65)) | (1L << (IMMUTABLE - 65)) | (1L << (UNION - 65)) | (1L << (FUNCTION - 65)) | (1L << (LEFT_SQUARE - 65)) | (1L << (INT8 - 65)) | (1L << (UINT8 - 65)) | (1L << (INT16 - 65)) | (1L << (UINT16 - 65)) | (1L << (INT32 - 65)) | (1L << (UINT32 - 65)) | (1L << (INT64 - 65)) | (1L << (UINT64 - 65)) | (1L << (INT128 - 65)) | (1L << (UINT128 - 65)) | (1L << (BOOL - 65)) | (1L << (CHAR - 65)) | (1L << (FLOAT16 - 65)) | (1L << (FLOAT32 - 65)) | (1L << (FLOAT64 - 65)) | (1L << (REGEX - 65)) | (1L << (INT - 65)) | (1L << (BINARY - 65)) | (1L << (OCTAL - 65)) | (1L << (HEX - 65)) | (1L << (FLOAT32_LITERAL - 65)) | (1L << (FLOAT64_LITERAL - 65)) | (1L << (ID - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (STRING - 65)) | (1L << (EOL - 65)))) != 0) );
			setState(663);
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

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_name);
		try {
			int _alt;
			_localctx = new NnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(ID);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					match(DOT);
					setState(667);
					match(ID);
					}
					}
				}
				setState(672);
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
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}

	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 99);
		case 1:
			return precpred(_ctx, 98);
		case 2:
			return precpred(_ctx, 97);
		case 3:
			return precpred(_ctx, 96);
		case 4:
			return precpred(_ctx, 95);
		case 5:
			return precpred(_ctx, 94);
		case 6:
			return precpred(_ctx, 93);
		case 7:
			return precpred(_ctx, 92);
		case 8:
			return precpred(_ctx, 91);
		case 9:
			return precpred(_ctx, 90);
		case 10:
			return precpred(_ctx, 89);
		case 11:
			return precpred(_ctx, 88);
		case 12:
			return precpred(_ctx, 87);
		case 13:
			return precpred(_ctx, 86);
		case 14:
			return precpred(_ctx, 85);
		case 15:
			return precpred(_ctx, 84);
		case 16:
			return precpred(_ctx, 83);
		case 17:
			return precpred(_ctx, 82);
		case 18:
			return precpred(_ctx, 81);
		case 19:
			return precpred(_ctx, 80);
		case 20:
			return precpred(_ctx, 79);
		case 21:
			return precpred(_ctx, 78);
		case 22:
			return precpred(_ctx, 77);
		case 23:
			return precpred(_ctx, 76);
		case 24:
			return precpred(_ctx, 74);
		case 25:
			return precpred(_ctx, 73);
		case 26:
			return precpred(_ctx, 72);
		case 27:
			return precpred(_ctx, 71);
		case 28:
			return precpred(_ctx, 65);
		case 29:
			return precpred(_ctx, 64);
		case 30:
			return precpred(_ctx, 63);
		case 31:
			return precpred(_ctx, 62);
		case 32:
			return precpred(_ctx, 61);
		case 33:
			return precpred(_ctx, 60);
		case 34:
			return precpred(_ctx, 59);
		case 35:
			return precpred(_ctx, 58);
		case 36:
			return precpred(_ctx, 57);
		case 37:
			return precpred(_ctx, 56);
		case 38:
			return precpred(_ctx, 55);
		case 39:
			return precpred(_ctx, 54);
		case 40:
			return precpred(_ctx, 53);
		case 41:
			return precpred(_ctx, 52);
		case 42:
			return precpred(_ctx, 51);
		case 43:
			return precpred(_ctx, 50);
		case 44:
			return precpred(_ctx, 49);
		case 45:
			return precpred(_ctx, 47);
		case 46:
			return precpred(_ctx, 1);
		case 47:
			return precpred(_ctx, 48);
		}
		return true;
	}

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode EOF() { return getToken(JuliaParser.EOF, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ModuleDirectiveContext() { }

		@Override public int getRuleIndex() { return RULE_moduleDirective; }

		public void copyFrom(ModuleDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class UsingContext extends ModuleDirectiveContext {
		public UsingContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

		public TerminalNode USING() { return getToken(JuliaParser.USING, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public ImporttContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

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
		public BareModuleDeclarationContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

		public TerminalNode BAREMODULE() { return getToken(JuliaParser.BAREMODULE, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode END() { return getToken(JuliaParser.END, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

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
		public ImportAllContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

		public TerminalNode IMPORT_ALL() { return getToken(JuliaParser.IMPORT_ALL, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public ExportContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

		public TerminalNode EXPORT() { return getToken(JuliaParser.EXPORT, 0); }

		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public List<TerminalNode> COMMA() { return getTokens(JuliaParser.COMMA); }

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

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
		public ModuleDeclarationContext(ModuleDirectiveContext ctx) { copyFrom(ctx); }

		public TerminalNode MODULE() { return getToken(JuliaParser.MODULE, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode END() { return getToken(JuliaParser.END, 0); }

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}

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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ModuleDirectiveContext moduleDirective() {
			return getRuleContext(ModuleDirectiveContext.class,0);
		}

		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
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

		public TerminalNode EOL() { return getToken(JuliaParser.EOL, 0); }

		public TerminalNode SEMI_COLON() { return getToken(JuliaParser.SEMI_COLON, 0); }

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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ExpContext() { }

		@Override public int getRuleIndex() { return RULE_exp; }

		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class OctalContext extends ExpContext {
		public OctalContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode OCTAL() { return getToken(JuliaParser.OCTAL, 0); }

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
		public BitwiseAndContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode BITWISE_AND() { return getToken(JuliaParser.BITWISE_AND, 0); }

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
		public ElmMinusContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_MINUS() { return getToken(JuliaParser.ELM_MINUS, 0); }

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
		public BitwiseXorAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode BITWISE_XOR_ASGN() { return getToken(JuliaParser.BITWISE_XOR_ASGN, 0); }

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
		public ReturnExpContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public LambdaContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ARROW() { return getToken(JuliaParser.ARROW, 0); }

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

	public static class Int64Context extends ExpContext {
		public Int64Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT64() { return getToken(JuliaParser.INT64, 0); }

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
		public Int8Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT8() { return getToken(JuliaParser.INT8, 0); }

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

	public static class DivexpeAssignContext extends ExpContext {
		public DivexpeAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode DIVIDE_ASGN() { return getToken(JuliaParser.DIVIDE_ASGN, 0); }

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
		public BlockContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode BEGIN() { return getToken(JuliaParser.BEGIN, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode END() { return getToken(JuliaParser.END, 0); }

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
		public HexContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode HEX() { return getToken(JuliaParser.HEX, 0); }

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
		public NanContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode NAN() { return getToken(JuliaParser.NAN, 0); }

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
		public BitwiseAndAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode BITWISE_AND_ASGN() { return getToken(JuliaParser.BITWISE_AND_ASGN, 0); }

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
		public IdentifierContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public Inf32TypeContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INF32() { return getToken(JuliaParser.INF32, 0); }

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

	public static class ElmPlusContext extends ExpContext {
		public ElmPlusContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_PLUS() { return getToken(JuliaParser.ELM_PLUS, 0); }

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

	public static class Tbc1Context extends ExpContext {
		public Tbc1Context(ExpContext ctx) { copyFrom(ctx); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode ELLIPSE() { return getToken(JuliaParser.ELLIPSE, 0); }

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

	public static class BitwiseOrAssignContext extends ExpContext {
		public BitwiseOrAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode BITWISE_OR_ASGN() { return getToken(JuliaParser.BITWISE_OR_ASGN, 0); }

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
		public RegexContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode REGEX() { return getToken(JuliaParser.REGEX, 0); }

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
		public InvokeMarco1Context(ExpContext ctx) { copyFrom(ctx); }

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

	public static class Uint128Context extends ExpContext {
		public Uint128Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode UINT128() { return getToken(JuliaParser.UINT128, 0); }

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

	public static class ElmEqualsContext extends ExpContext {
		public ElmEqualsContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_EQUALS() { return getToken(JuliaParser.ELM_EQUALS, 0); }

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
		public BinaryContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode BINARY() { return getToken(JuliaParser.BINARY, 0); }

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
		public LessThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode LESS_THAN_OR_EQ() { return getToken(JuliaParser.LESS_THAN_OR_EQ, 0); }

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
		public UnaryMinusContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode MINUS() { return getToken(JuliaParser.MINUS, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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

	public static class Uint64Context extends ExpContext {
		public Uint64Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode UINT64() { return getToken(JuliaParser.UINT64, 0); }

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

	public static class EndLiteralContext extends ExpContext {
		public EndLiteralContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode END_LITERAL() { return getToken(JuliaParser.END_LITERAL, 0); }

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
		public MinusContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode MINUS() { return getToken(JuliaParser.MINUS, 0); }

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
		public TimesAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode TIMES_ASGN() { return getToken(JuliaParser.TIMES_ASGN, 0); }

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
		public RangeContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }

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
		public Float64Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FLOAT64() { return getToken(JuliaParser.FLOAT64, 0); }

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

	public static class InvokeMarco2Context extends ExpContext {
		public InvokeMarco2Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode AT() { return getToken(JuliaParser.AT, 0); }

		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}

		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }

		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }

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
		public RemainderAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode REMAINDER_ASGN() { return getToken(JuliaParser.REMAINDER_ASGN, 0); }

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
		public TupleContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }

		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

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
		public LessThanContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode LESS_THAN() { return getToken(JuliaParser.LESS_THAN, 0); }

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

	public static class Uint16Context extends ExpContext {
		public Uint16Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode UINT16() { return getToken(JuliaParser.UINT16, 0); }

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

	public static class ElmLessThanContext extends ExpContext {
		public ElmLessThanContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_LESS_THAN() { return getToken(JuliaParser.ELM_LESS_THAN, 0); }

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
		public ElmFractionContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_FRACTION() { return getToken(JuliaParser.ELM_FRACTION, 0); }

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
		public Inf16TypeContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INF16() { return getToken(JuliaParser.INF16, 0); }

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
		public TypedExpressionContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

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
		public FractionContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode FRACTION() { return getToken(JuliaParser.FRACTION, 0); }

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
		public ElmGreaterThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_GREATER_THAN_OR_EQ() { return getToken(JuliaParser.ELM_GREATER_THAN_OR_EQ, 0); }

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

	public static class Int32Context extends ExpContext {
		public Int32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT32() { return getToken(JuliaParser.INT32, 0); }

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
		public EqualsContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode EQUALS() { return getToken(JuliaParser.EQUALS, 0); }

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
		public CharContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode CHAR() { return getToken(JuliaParser.CHAR, 0); }

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

	public static class ArrayIndexContext extends ExpContext {
		public ArrayIndexContext(ExpContext ctx) { copyFrom(ctx); }

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
		public ReturnContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode RETURN() { return getToken(JuliaParser.RETURN, 0); }

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

	public static class TtContext extends ExpContext {
		public TtContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode TRUE() { return getToken(JuliaParser.TRUE, 0); }

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
		public SymbolContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public Nan32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode NAN32() { return getToken(JuliaParser.NAN32, 0); }

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
		public ConstantContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode CONST() { return getToken(JuliaParser.CONST, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public ElmTimesContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_TIMES() { return getToken(JuliaParser.ELM_TIMES, 0); }

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

	public static class TernaryConditionalContext extends ExpContext {
		public TernaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode QUESTION_MARK() { return getToken(JuliaParser.QUESTION_MARK, 0); }

		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }

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
		public ApplyFunctionContext(ExpContext ctx) { copyFrom(ctx); }

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
		public LSRAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode LSR_ASGN() { return getToken(JuliaParser.LSR_ASGN, 0); }

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
		public CoeffientContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT() { return getToken(JuliaParser.INT, 0); }

		public TerminalNode FLOAT32() { return getToken(JuliaParser.FLOAT32, 0); }

		public TerminalNode FLOAT64() { return getToken(JuliaParser.FLOAT64, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }

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
		public InvDivexpeAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode INV_DIVIDE_ASGN() { return getToken(JuliaParser.INV_DIVIDE_ASGN, 0); }

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
		public ElmLessThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_LESS_THAN_OR_EQ() { return getToken(JuliaParser.ELM_LESS_THAN_OR_EQ, 0); }

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

	public static class Int128Context extends ExpContext {
		public Int128Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT128() { return getToken(JuliaParser.INT128, 0); }

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

	public static class Uint32Context extends ExpContext {
		public Uint32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode UINT32() { return getToken(JuliaParser.UINT32, 0); }

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
		public EnumerationContext(ExpContext ctx) { copyFrom(ctx); }

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
		public Ffloat32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FLOAT32_LITERAL() { return getToken(JuliaParser.FLOAT32_LITERAL, 0); }

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
		public ExponentContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode EXPONENT() { return getToken(JuliaParser.EXPONENT, 0); }

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
		public GreaterThanContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode GREATER_THAN() { return getToken(JuliaParser.GREATER_THAN, 0); }

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

	public static class QualifiedNameContext extends ExpContext {
		public QualifiedNameContext(ExpContext ctx) { copyFrom(ctx); }

		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}

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
		public NotEqualContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode NOT_EQUAL() { return getToken(JuliaParser.NOT_EQUAL, 0); }

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
		public ASRAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ASR_ASGN() { return getToken(JuliaParser.ASR_ASGN, 0); }

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
		public PlusContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode PLUS() { return getToken(JuliaParser.PLUS, 0); }

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
		public Int16Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT16() { return getToken(JuliaParser.INT16, 0); }

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
		public GreaterThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode GREATER_THAN_OR_EQ() { return getToken(JuliaParser.GREATER_THAN_OR_EQ, 0); }

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
		public ElmDivideContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_DIVIDE() { return getToken(JuliaParser.ELM_DIVIDE, 0); }

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
		public MinusInf32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode MINUS_INF32() { return getToken(JuliaParser.MINUS_INF32, 0); }

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
		public ASLAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ASL_ASGN() { return getToken(JuliaParser.ASL_ASGN, 0); }

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
		public AddAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ADD_ASGN() { return getToken(JuliaParser.ADD_ASGN, 0); }

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
		public Nan16Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode NAN16() { return getToken(JuliaParser.NAN16, 0); }

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
		public Uint8Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode UINT8() { return getToken(JuliaParser.UINT8, 0); }

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
		public UnionTypeContext(ExpContext ctx) { copyFrom(ctx); }

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
		public FfContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FALSE() { return getToken(JuliaParser.FALSE, 0); }

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
		public CharaacterContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode CHARACTER_LITERAL() { return getToken(JuliaParser.CHARACTER_LITERAL, 0); }

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
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode BOOL() { return getToken(JuliaParser.BOOL, 0); }

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
		public StringContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode STRING() { return getToken(JuliaParser.STRING, 0); }

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

	public static class ElmGreaterThanContext extends ExpContext {
		public ElmGreaterThanContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode ELM_GREATER_THAN() { return getToken(JuliaParser.ELM_GREATER_THAN, 0); }

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
		public MinusAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode SUB_ASGN() { return getToken(JuliaParser.SUB_ASGN, 0); }

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

	public static class Float16Context extends ExpContext {
		public Float16Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FLOAT16() { return getToken(JuliaParser.FLOAT16, 0); }

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

	public static class NotContext extends ExpContext {
		public NotContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode NOT() { return getToken(JuliaParser.NOT, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public TimesContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode TIMES() { return getToken(JuliaParser.TIMES, 0); }

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
		public SubtypeContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }

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
		public AndContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode AND() { return getToken(JuliaParser.AND, 0); }

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
		public DivideContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode DIVIDE() { return getToken(JuliaParser.DIVIDE, 0); }

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
		public PowerAssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode POWER_ASGN() { return getToken(JuliaParser.POWER_ASGN, 0); }

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
		public InfContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INF() { return getToken(JuliaParser.INF, 0); }

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
		public NaryConditionalContext(ExpContext ctx) { copyFrom(ctx); }

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
		public OrContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode OR() { return getToken(JuliaParser.OR, 0); }

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
		public BitwisOrContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode BITWISE_OR() { return getToken(JuliaParser.BITWISE_OR, 0); }

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

	public static class ParametricTypeContext extends ExpContext {
		public ParametricTypeContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode LEFT_CURLY() { return getToken(JuliaParser.LEFT_CURLY, 0); }

		public TerminalNode RIGHT_CURLY() { return getToken(JuliaParser.RIGHT_CURLY, 0); }

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
		public Float32Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FLOAT32() { return getToken(JuliaParser.FLOAT32, 0); }

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

	public static class IntContext extends ExpContext {
		public IntContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode INT() { return getToken(JuliaParser.INT, 0); }

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
		public PairContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode DOUBLE_ARROW() { return getToken(JuliaParser.DOUBLE_ARROW, 0); }

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
		public MinusInf16Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode MINUS_INF16() { return getToken(JuliaParser.MINUS_INF16, 0); }

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

	public static class MinusInfContext extends ExpContext {
		public MinusInfContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode MINUS_INF() { return getToken(JuliaParser.MINUS_INF, 0); }

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
		public Ffloat64Context(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode FLOAT64_LITERAL() { return getToken(JuliaParser.FLOAT64_LITERAL, 0); }

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
		public RemainderContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode REM() { return getToken(JuliaParser.REM, 0); }

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
		public BracketedContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode LEFT_BRACKET() { return getToken(JuliaParser.LEFT_BRACKET, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode RIGHT_BRACKET() { return getToken(JuliaParser.RIGHT_BRACKET, 0); }

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
		public AssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public FunctionDeclarationContext() { }

		@Override public int getRuleIndex() { return RULE_functionDeclaration; }

		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class CompactFunctionDeclarationContext extends FunctionDeclarationContext {
		public CompactFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }

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
		public GeneralFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }

		public TerminalNode FUNCTION() { return getToken(JuliaParser.FUNCTION, 0); }

		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}

		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class, 0);
		}

		public TerminalNode END() { return getToken(JuliaParser.END, 0); }

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ParametersContext() { }

		@Override public int getRuleIndex() { return RULE_parameters; }

		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PparametersContext extends ParametersContext {
		public PparametersContext(ParametersContext ctx) { copyFrom(ctx); }

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

		public List<TerminalNode> SEMI_COLON() { return getTokens(JuliaParser.SEMI_COLON); }

		public TerminalNode SEMI_COLON(int i) {
			return getToken(JuliaParser.SEMI_COLON, i);
		}

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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ParameterContext() { }

		@Override public int getRuleIndex() { return RULE_parameter; }

		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NamedTypedParamContext extends ParameterContext {
		public NamedTypedParamContext(ParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

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
		public AnonymousTypedParamContext(ParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

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
		public NamedParamContext(ParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TypeDefinitionContext() { }

		@Override public int getRuleIndex() { return RULE_typeDefinition; }

		public void copyFrom(TypeDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ImmutableTypeDeclarationContext extends TypeDefinitionContext {
		public ImmutableTypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

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
			return getRuleContext(FunctionDeclarationContext.class, i);
		}

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
		public AbstractTypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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

	public static class BitsSubtypeContext extends TypeDefinitionContext {
		public BitsSubtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }

		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }

		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }

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
		public TypeDeclarationContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode TYPE() { return getToken(JuliaParser.TYPE, 0); }

		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode END() { return getToken(JuliaParser.END, 0); }

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }

		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}

		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class, i);
		}

		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}

		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}

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
		public TypeAliasContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode TYPE_ALIAS() { return getToken(JuliaParser.TYPE_ALIAS, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

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
		public BitsTtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode BITS_TYPE() { return getToken(JuliaParser.BITS_TYPE, 0); }

		public TerminalNode SIZE() { return getToken(JuliaParser.SIZE, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public AbstractSubtypeContext(TypeDefinitionContext ctx) { copyFrom(ctx); }

		public TerminalNode ABSTRACT() { return getToken(JuliaParser.ABSTRACT, 0); }

		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }

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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public FieldDeclarationContext() { }

		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }

		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class UntypedFieldDeclarationContext extends FieldDeclarationContext {
		public UntypedFieldDeclarationContext(FieldDeclarationContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode EOL() { return getToken(JuliaParser.EOL, 0); }

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
		public TypedFieldDeclarationContext(FieldDeclarationContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode EOL() { return getToken(JuliaParser.EOL, 0); }

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

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TypeParametersContext() { }

		@Override public int getRuleIndex() { return RULE_typeParameters; }

		public void copyFrom(TypeParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class TtypeParametersContext extends TypeParametersContext {
		public TtypeParametersContext(TypeParametersContext ctx) { copyFrom(ctx); }

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

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TypeParameterContext() { }

		@Override public int getRuleIndex() { return RULE_typeParameter; }

		public void copyFrom(TypeParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class InstanceContext extends TypeParameterContext {
		public InstanceContext(TypeParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public ExpressionContext(TypeParameterContext ctx) { copyFrom(ctx); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public NamedSubtypeContext(TypeParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode SUB_TYPE() { return getToken(JuliaParser.SUB_TYPE, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ForStatementContext() { }

		@Override public int getRuleIndex() { return RULE_forStatement; }

		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ForEqContext extends ForStatementContext {
		public ForEqContext(ForStatementContext ctx) { copyFrom(ctx); }

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
		public ForEqStepContext(ForStatementContext ctx) { copyFrom(ctx); }

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
		public ForInContext(ForStatementContext ctx) { copyFrom(ctx); }

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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public NameContext() { }

		@Override public int getRuleIndex() { return RULE_name; }

		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NnameContext extends NameContext {
		public NnameContext(NameContext ctx) { copyFrom(ctx); }

		public List<TerminalNode> ID() { return getTokens(JuliaParser.ID); }

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public List<TerminalNode> DOT() { return getTokens(JuliaParser.DOT); }

		public TerminalNode DOT(int i) {
			return getToken(JuliaParser.DOT, i);
		}

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
}