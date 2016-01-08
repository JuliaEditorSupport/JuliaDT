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
		ARROW=1, AT=2, DOT=3, SEMI_COLON=4, IS=5, EQUALS=6, NOT_EQUAL=7, GREATER_THAN=8,
		LESS_THAN=9, GREATER_THAN_OR_EQ=10, LESS_THAN_OR_EQ=11, MINUS=12, EXPONENT=13,
		FRACTION=14, TIMES=15, DIVIDE=16, PLUS=17, ELM_EQUALS=18, ELM_NOT_EQUAL=19,
		ELM_GREATER_THAN=20, ELM_LESS_THAN=21, ELM_GREATER_THAN_OR_EQ=22, ELM_LESS_THAN_OR_EQ=23,
		ELM_MINUS=24, ELM_EXPONENT=25, ELM_FRACTION=26, ELM_TIMES=27, ELM_DIVIDE=28,
		ELM_PLUS=29, RAPP=30, EQ=31, DOUBLE_ARROW=32, ADD_ASGN=33, SUB_ASGN=34,
		TIMES_ASGN=35, DIVIDE_ASGN=36, INV_DIVIDE_ASGN=37, REMAINDER_ASGN=38,
		REM=39, POWER_ASGN=40, BITWISE_AND_ASGN=41, BITWISE_OR_ASGN=42, BITWISE_XOR_ASGN=43,
		LSR_ASGN=44, ASR_ASGN=45, ELLIPSE=46, ASL_ASGN=47, QUESTION_MARK=48, WHILE=49,
		BEGIN=50, RETURN=51, IN=52, IF=53, ELSE_IF=54, ELSE=55, FOR=56, CONST=57,
		USING=58, IMPORT=59, INSTANCE_OF=60, COLON=61, COMMA=62, DO=63, IMPORT_ALL=64,
		EXPORT=65, MODULE=66, LET=67, END=68, END_LITERAL=69, BAREMODULE=70, INF16=71,
		INF32=72, INF=73, MINUS_INF16=74, MINUS_INF32=75, MINUS_INF=76, NAN16=77,
		NAN32=78, NAN=79, NOT=80, AND=81, BITWISE_AND=82, OR=83, BITWISE_OR=84,
		LEFT_BRACKET=85, RIGHT_BRACKET=86, TRUE=87, FALSE=88, ABSTRACT=89, SUB_TYPE=90,
		BITS_TYPE=91, TYPE_ALIAS=92, TYPE=93, IMMUTABLE=94, UNION=95, FUNCTION=96,
		LEFT_CURLY=97, RIGHT_CURLY=98, LEFT_SQUARE=99, RIGHT_SQUARE=100, INT8=101,
		UINT8=102, INT16=103, UINT16=104, INT32=105, UINT32=106, INT64=107, UINT64=108,
		INT128=109, UINT128=110, BOOL=111, CHAR=112, FLOAT16=113, FLOAT32=114,
		FLOAT64=115, REGEX=116, INT=117, BINARY=118, OCTAL=119, HEX=120, FLOAT32_LITERAL=121,
		EXP32=122, FLOAT64_LITERAL=123, EXP64=124, FQN=125, ID=126, CHARACTER_LITERAL=127,
		STRING=128, WS=129, COMMENT=130, LINE_COMMENT=131, SIZE=132;
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
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0086\u02dc\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\6\3A\n\3\r\3\16"+
		"\3B\3\3\3\3\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\5\3P\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5e\n\5\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\5\5q\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\5\5\177\n\5\3\5\6\5\u0082\n"+
		"\5\r\5\16\5\u0083\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5\u0094\n\5\f\5\16\5\u0097\13\5\3\5\3\5\3\5\7\5\u009c\n\5\f\5\16"+
		"\5\u009f\13\5\7\5\u00a1\n\5\f\5\16\5\u00a4\13\5\3\5\3\5\7\5\u00a8\n\5"+
		"\f\5\16\5\u00ab\13\5\5\5\u00ad\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b5\n"+
		"\5\f\5\16\5\u00b8\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\5\5\u00cf\n\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00d5\n\5\f\5\16\5\u00d8\13\5\3\5\5\5\u00db\n\5\3\5\7\5"+
		"\u00de\n\5\f\5\16\5\u00e1\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e9\n\5\f"+
		"\5\16\5\u00ec\13\5\3\5\5\5\u00ef\n\5\3\5\6\5\u00f2\n\5\r\5\16\5\u00f3"+
		"\3\5\3\5\3\5\7\5\u00f9\n\5\f\5\16\5\u00fc\13\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u0104\n\5\f\5\16\5\u0107\13\5\3\5\5\5\u010a\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0126\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u01cc\n\5"+
		"\f\5\16\5\u01cf\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u01e5\n\6\f\6\16\6\u01e8\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u01f4\n\6\f\6\16\6\u01f7\13\6\5"+
		"\6\u01f9\n\6\3\6\3\6\5\6\u01fd\n\6\3\7\3\7\5\7\u0201\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u020a\n\7\3\7\3\7\7\7\u020e\n\7\f\7\16\7\u0211\13\7"+
		"\3\7\3\7\5\7\u0215\n\7\3\b\3\b\3\b\3\b\7\b\u021b\n\b\f\b\16\b\u021e\13"+
		"\b\5\b\u0220\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0229\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u022f\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0236\n\t\5\t\u0238\n\t\3\n"+
		"\3\n\3\n\5\n\u023d\n\n\3\n\3\n\3\n\3\n\5\n\u0243\n\n\3\n\3\n\3\n\5\n\u0248"+
		"\n\n\5\n\u024a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0257"+
		"\n\n\3\n\3\n\5\n\u025b\n\n\3\n\7\n\u025e\n\n\f\n\16\n\u0261\13\n\3\n\7"+
		"\n\u0264\n\n\f\n\16\n\u0267\13\n\3\n\3\n\3\n\3\n\5\n\u026d\n\n\3\n\3\n"+
		"\3\n\5\n\u0272\n\n\5\n\u0274\n\n\3\n\7\n\u0277\n\n\f\n\16\n\u027a\13\n"+
		"\3\n\7\n\u027d\n\n\f\n\16\n\u0280\13\n\3\n\5\n\u0283\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u0289\n\13\3\f\3\f\3\f\3\f\7\f\u028f\n\f\f\f\16\f\u0292\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u029c\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u02a5\n\16\f\16\16\16\u02a8\13\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u02b5\n\16\f\16\16\16\u02b8"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u02c1\n\16\f\16\16\16\u02c4"+
		"\13\16\3\16\3\16\5\16\u02c8\n\16\3\17\3\17\3\17\7\17\u02cd\n\17\f\17\16"+
		"\17\u02d0\13\17\3\17\3\17\3\20\3\20\3\20\7\20\u02d7\n\20\f\20\16\20\u02da"+
		"\13\20\3\20\2\3\b\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\4\4\2!!"+
		"\66\66\4\2\6\6@@\u038d\2!\3\2\2\2\4O\3\2\2\2\6W\3\2\2\2\b\u0125\3\2\2"+
		"\2\n\u01fc\3\2\2\2\f\u0214\3\2\2\2\16\u0216\3\2\2\2\20\u0237\3\2\2\2\22"+
		"\u0282\3\2\2\2\24\u0288\3\2\2\2\26\u028a\3\2\2\2\30\u029b\3\2\2\2\32\u02c7"+
		"\3\2\2\2\34\u02c9\3\2\2\2\36\u02d3\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"#\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%&\7<\2\2&P\7\u0080\2\2\'(\7=\2\2("+
		")\7\u0080\2\2)*\7?\2\2*/\7\u0080\2\2+,\7@\2\2,.\7\u0080\2\2-+\3\2\2\2"+
		".\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60P\3\2\2\2\61/\3\2\2\2\62\63\7B\2"+
		"\2\63P\7\u0080\2\2\64\65\7C\2\2\65:\7\u0080\2\2\66\67\7@\2\2\679\7\u0080"+
		"\2\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;P\3\2\2\2<:\3\2\2\2=>\7"+
		"D\2\2>@\7\u0080\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"CD\3\2\2\2DE\7F\2\2EP\3\2\2\2FG\7H\2\2GI\7\u0080\2\2HJ\5\6\4\2IH\3\2\2"+
		"\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7F\2\2NP\3\2\2\2O%\3\2\2"+
		"\2O\'\3\2\2\2O\62\3\2\2\2O\64\3\2\2\2O=\3\2\2\2OF\3\2\2\2P\5\3\2\2\2Q"+
		"X\5\4\3\2RX\5\22\n\2SX\5\f\7\2TX\5\32\16\2UX\5\34\17\2VX\5\b\5\2WQ\3\2"+
		"\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2\2YZ\b"+
		"\5\1\2Z[\7\16\2\2[\u0126\5\b\5_\\]\7R\2\2]\u0126\5\b\5B^_\7;\2\2_`\7\u0080"+
		"\2\2`a\7!\2\2a\u0126\5\b\5\16bd\5\36\20\2ce\5\26\f\2dc\3\2\2\2de\3\2\2"+
		"\2ef\3\2\2\2fp\7W\2\2gh\5\b\5\2hi\7@\2\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oq\5\b\5\2pl\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rs\7X\2\2s\u0126\3\2\2\2tz\7e\2\2uv\5\b\5\2vw\7@\2\2wy\3\2\2"+
		"\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\5"+
		"\b\5\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\7f\2\2\u0081"+
		"t\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0126\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\5\b\5\2\u0087\u0088"+
		"\7:\2\2\u0088\u0089\7\u0080\2\2\u0089\u008a\t\2\2\2\u008a\u008b\5\b\5"+
		"\2\u008b\u008c\7?\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7f\2\2\u008e\u0126"+
		"\3\2\2\2\u008f\u0126\7G\2\2\u0090\u0091\7\67\2\2\u0091\u0095\5\b\5\2\u0092"+
		"\u0094\5\6\4\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u00a2\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\78\2\2\u0099\u009d\5\b\5\2\u009a\u009c\5\6\4\2\u009b\u009a\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u0098\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ac\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a9\79\2\2\u00a6\u00a8\5\6\4\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7F\2\2\u00af\u0126\3\2\2\2\u00b0"+
		"\u00b6\7E\2\2\u00b1\u00b2\7\u0080\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b5\5"+
		"\b\5\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5\6"+
		"\4\2\u00ba\u00bb\7F\2\2\u00bb\u0126\3\2\2\2\u00bc\u00bd\7\64\2\2\u00bd"+
		"\u00be\5\b\5\2\u00be\u00bf\7F\2\2\u00bf\u0126\3\2\2\2\u00c0\u00c1\7W\2"+
		"\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7X\2\2\u00c3\u0126\3\2\2\2\u00c4\u00ca"+
		"\7W\2\2\u00c5\u00c6\5\b\5\2\u00c6\u00c7\7@\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\5\b\5\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u0126\7X"+
		"\2\2\u00d1\u00da\7A\2\2\u00d2\u00d3\7\u0080\2\2\u00d3\u00d5\7@\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\u0080\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00de\5\6"+
		"\4\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u0126\7F"+
		"\2\2\u00e3\u00f1\5\36\20\2\u00e4\u00ea\7e\2\2\u00e5\u00e6\5\b\5\2\u00e6"+
		"\u00e7\7@\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\5\b\5\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7f\2\2\u00f1\u00e4\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u0126\3\2"+
		"\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00fa\5\36\20\2\u00f7\u00f9\5\b\5\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0126\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\4\2\2\u00fe"+
		"\u00ff\5\36\20\2\u00ff\u0105\7W\2\2\u0100\u0101\5\b\5\2\u0101\u0102\7"+
		"@\2\2\u0102\u0104\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\5\b\5\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\7X\2\2\u010c\u0126\3\2\2\2\u010d\u0126\7\u0080"+
		"\2\2\u010e\u0126\7v\2\2\u010f\u0126\7Y\2\2\u0110\u0126\7Z\2\2\u0111\u0126"+
		"\7w\2\2\u0112\u0126\7x\2\2\u0113\u0126\7y\2\2\u0114\u0126\7z\2\2\u0115"+
		"\u0126\7{\2\2\u0116\u0126\7}\2\2\u0117\u0126\7\u0081\2\2\u0118\u0126\7"+
		"\u0082\2\2\u0119\u011a\7?\2\2\u011a\u0126\7\u0080\2\2\u011b\u0126\7I\2"+
		"\2\u011c\u0126\7J\2\2\u011d\u0126\7K\2\2\u011e\u0126\7L\2\2\u011f\u0126"+
		"\7M\2\2\u0120\u0126\7N\2\2\u0121\u0126\7O\2\2\u0122\u0126\7P\2\2\u0123"+
		"\u0126\7Q\2\2\u0124\u0126\5\n\6\2\u0125Y\3\2\2\2\u0125\\\3\2\2\2\u0125"+
		"^\3\2\2\2\u0125b\3\2\2\2\u0125\u0081\3\2\2\2\u0125\u0085\3\2\2\2\u0125"+
		"\u008f\3\2\2\2\u0125\u0090\3\2\2\2\u0125\u00b0\3\2\2\2\u0125\u00bc\3\2"+
		"\2\2\u0125\u00c0\3\2\2\2\u0125\u00c4\3\2\2\2\u0125\u00d1\3\2\2\2\u0125"+
		"\u00e3\3\2\2\2\u0125\u00f5\3\2\2\2\u0125\u00fd\3\2\2\2\u0125\u010d\3\2"+
		"\2\2\u0125\u010e\3\2\2\2\u0125\u010f\3\2\2\2\u0125\u0110\3\2\2\2\u0125"+
		"\u0111\3\2\2\2\u0125\u0112\3\2\2\2\u0125\u0113\3\2\2\2\u0125\u0114\3\2"+
		"\2\2\u0125\u0115\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u0117\3\2\2\2\u0125"+
		"\u0118\3\2\2\2\u0125\u0119\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011c\3\2"+
		"\2\2\u0125\u011d\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u01cd\3\2\2\2\u0127\u0128\f[\2\2\u0128"+
		"\u0129\7\17\2\2\u0129\u01cc\5\b\5[\u012a\u012b\fY\2\2\u012b\u012c\7\20"+
		"\2\2\u012c\u01cc\5\b\5Z\u012d\u012e\fX\2\2\u012e\u012f\7\21\2\2\u012f"+
		"\u01cc\5\b\5Y\u0130\u0131\fW\2\2\u0131\u0132\7)\2\2\u0132\u01cc\5\b\5"+
		"X\u0133\u0134\fV\2\2\u0134\u0135\7\22\2\2\u0135\u01cc\5\b\5W\u0136\u0137"+
		"\fU\2\2\u0137\u0138\7\23\2\2\u0138\u01cc\5\b\5V\u0139\u013a\fT\2\2\u013a"+
		"\u013b\7\16\2\2\u013b\u01cc\5\b\5U\u013c\u013d\fS\2\2\u013d\u013e\7\n"+
		"\2\2\u013e\u01cc\5\b\5T\u013f\u0140\fR\2\2\u0140\u0141\7\13\2\2\u0141"+
		"\u01cc\5\b\5S\u0142\u0143\fQ\2\2\u0143\u0144\7\f\2\2\u0144\u01cc\5\b\5"+
		"R\u0145\u0146\fP\2\2\u0146\u0147\7\r\2\2\u0147\u01cc\5\b\5Q\u0148\u0149"+
		"\fO\2\2\u0149\u014a\7\b\2\2\u014a\u01cc\5\b\5P\u014b\u014c\fN\2\2\u014c"+
		"\u014d\7\34\2\2\u014d\u01cc\5\b\5O\u014e\u014f\fM\2\2\u014f\u0150\7\35"+
		"\2\2\u0150\u01cc\5\b\5N\u0151\u0152\fL\2\2\u0152\u0153\7\36\2\2\u0153"+
		"\u01cc\5\b\5M\u0154\u0155\fK\2\2\u0155\u0156\7\37\2\2\u0156\u01cc\5\b"+
		"\5L\u0157\u0158\fJ\2\2\u0158\u0159\7\32\2\2\u0159\u01cc\5\b\5K\u015a\u015b"+
		"\fI\2\2\u015b\u015c\7\26\2\2\u015c\u01cc\5\b\5J\u015d\u015e\fH\2\2\u015e"+
		"\u015f\7\27\2\2\u015f\u01cc\5\b\5I\u0160\u0161\fG\2\2\u0161\u0162\7\30"+
		"\2\2\u0162\u01cc\5\b\5H\u0163\u0164\fF\2\2\u0164\u0165\7\31\2\2\u0165"+
		"\u01cc\5\b\5G\u0166\u0167\fE\2\2\u0167\u0168\7\24\2\2\u0168\u01cc\5\b"+
		"\5F\u0169\u016a\fD\2\2\u016a\u016b\7\\\2\2\u016b\u01cc\5\b\5E\u016c\u016d"+
		"\fC\2\2\u016d\u016e\7\62\2\2\u016e\u016f\5\b\5\2\u016f\u0170\7?\2\2\u0170"+
		"\u0171\5\b\5D\u0171\u01cc\3\2\2\2\u0172\u0173\fA\2\2\u0173\u0174\7S\2"+
		"\2\u0174\u01cc\5\b\5B\u0175\u0176\f@\2\2\u0176\u0177\7T\2\2\u0177\u01cc"+
		"\5\b\5A\u0178\u0179\f?\2\2\u0179\u017a\7U\2\2\u017a\u01cc\5\b\5@\u017b"+
		"\u017c\f>\2\2\u017c\u017d\7V\2\2\u017d\u01cc\5\b\5?\u017e\u017f\f\67\2"+
		"\2\u017f\u0180\7\t\2\2\u0180\u01cc\5\b\58\u0181\u0182\f\66\2\2\u0182\u0183"+
		"\7!\2\2\u0183\u01cc\5\b\5\67\u0184\u0185\f\65\2\2\u0185\u0186\7#\2\2\u0186"+
		"\u01cc\5\b\5\66\u0187\u0188\f\64\2\2\u0188\u0189\7$\2\2\u0189\u01cc\5"+
		"\b\5\65\u018a\u018b\f\63\2\2\u018b\u018c\7%\2\2\u018c\u01cc\5\b\5\64\u018d"+
		"\u018e\f\62\2\2\u018e\u018f\7&\2\2\u018f\u01cc\5\b\5\63\u0190\u0191\f"+
		"\61\2\2\u0191\u0192\7\'\2\2\u0192\u01cc\5\b\5\62\u0193\u0194\f\60\2\2"+
		"\u0194\u0195\7(\2\2\u0195\u01cc\5\b\5\61\u0196\u0197\f/\2\2\u0197\u0198"+
		"\7*\2\2\u0198\u01cc\5\b\5\60\u0199\u019a\f.\2\2\u019a\u019b\7+\2\2\u019b"+
		"\u01cc\5\b\5/\u019c\u019d\f-\2\2\u019d\u019e\7,\2\2\u019e\u01cc\5\b\5"+
		".\u019f\u01a0\f,\2\2\u01a0\u01a1\7-\2\2\u01a1\u01cc\5\b\5-\u01a2\u01a3"+
		"\f+\2\2\u01a3\u01a4\7.\2\2\u01a4\u01cc\5\b\5,\u01a5\u01a6\f*\2\2\u01a6"+
		"\u01a7\7/\2\2\u01a7\u01cc\5\b\5+\u01a8\u01a9\f)\2\2\u01a9\u01aa\7\61\2"+
		"\2\u01aa\u01cc\5\b\5*\u01ab\u01ac\f(\2\2\u01ac\u01ad\7\"\2\2\u01ad\u01cc"+
		"\5\b\5)\u01ae\u01af\f\'\2\2\u01af\u01b0\7?\2\2\u01b0\u01cc\5\b\5(\u01b1"+
		"\u01b2\f&\2\2\u01b2\u01b3\7\66\2\2\u01b3\u01cc\5\b\5\'\u01b4\u01b5\f%"+
		"\2\2\u01b5\u01b6\7\7\2\2\u01b6\u01cc\5\b\5&\u01b7\u01b8\f$\2\2\u01b8\u01b9"+
		"\7\6\2\2\u01b9\u01cc\5\b\5%\u01ba\u01bb\f\"\2\2\u01bb\u01bc\7 \2\2\u01bc"+
		"\u01cc\5\b\5#\u01bd\u01be\f!\2\2\u01be\u01bf\7\3\2\2\u01bf\u01cc\5\b\5"+
		"!\u01c0\u01c1\f\34\2\2\u01c1\u01c2\7\5\2\2\u01c2\u01cc\5\b\5\35\u01c3"+
		"\u01c4\f\4\2\2\u01c4\u01c5\7@\2\2\u01c5\u01cc\5\b\5\5\u01c6\u01c7\fZ\2"+
		"\2\u01c7\u01c8\7>\2\2\u01c8\u01cc\5\n\6\2\u01c9\u01ca\f#\2\2\u01ca\u01cc"+
		"\7\60\2\2\u01cb\u0127\3\2\2\2\u01cb\u012a\3\2\2\2\u01cb\u012d\3\2\2\2"+
		"\u01cb\u0130\3\2\2\2\u01cb\u0133\3\2\2\2\u01cb\u0136\3\2\2\2\u01cb\u0139"+
		"\3\2\2\2\u01cb\u013c\3\2\2\2\u01cb\u013f\3\2\2\2\u01cb\u0142\3\2\2\2\u01cb"+
		"\u0145\3\2\2\2\u01cb\u0148\3\2\2\2\u01cb\u014b\3\2\2\2\u01cb\u014e\3\2"+
		"\2\2\u01cb\u0151\3\2\2\2\u01cb\u0154\3\2\2\2\u01cb\u0157\3\2\2\2\u01cb"+
		"\u015a\3\2\2\2\u01cb\u015d\3\2\2\2\u01cb\u0160\3\2\2\2\u01cb\u0163\3\2"+
		"\2\2\u01cb\u0166\3\2\2\2\u01cb\u0169\3\2\2\2\u01cb\u016c\3\2\2\2\u01cb"+
		"\u0172\3\2\2\2\u01cb\u0175\3\2\2\2\u01cb\u0178\3\2\2\2\u01cb\u017b\3\2"+
		"\2\2\u01cb\u017e\3\2\2\2\u01cb\u0181\3\2\2\2\u01cb\u0184\3\2\2\2\u01cb"+
		"\u0187\3\2\2\2\u01cb\u018a\3\2\2\2\u01cb\u018d\3\2\2\2\u01cb\u0190\3\2"+
		"\2\2\u01cb\u0193\3\2\2\2\u01cb\u0196\3\2\2\2\u01cb\u0199\3\2\2\2\u01cb"+
		"\u019c\3\2\2\2\u01cb\u019f\3\2\2\2\u01cb\u01a2\3\2\2\2\u01cb\u01a5\3\2"+
		"\2\2\u01cb\u01a8\3\2\2\2\u01cb\u01ab\3\2\2\2\u01cb\u01ae\3\2\2\2\u01cb"+
		"\u01b1\3\2\2\2\u01cb\u01b4\3\2\2\2\u01cb\u01b7\3\2\2\2\u01cb\u01ba\3\2"+
		"\2\2\u01cb\u01bd\3\2\2\2\u01cb\u01c0\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb"+
		"\u01c6\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\t\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01fd"+
		"\7g\2\2\u01d1\u01fd\7h\2\2\u01d2\u01fd\7i\2\2\u01d3\u01fd\7j\2\2\u01d4"+
		"\u01fd\7k\2\2\u01d5\u01fd\7l\2\2\u01d6\u01fd\7m\2\2\u01d7\u01fd\7n\2\2"+
		"\u01d8\u01fd\7o\2\2\u01d9\u01fd\7p\2\2\u01da\u01fd\7q\2\2\u01db\u01fd"+
		"\7r\2\2\u01dc\u01fd\7s\2\2\u01dd\u01fd\7t\2\2\u01de\u01fd\7u\2\2\u01df"+
		"\u01e0\7a\2\2\u01e0\u01e1\7c\2\2\u01e1\u01e6\5\n\6\2\u01e2\u01e3\7@\2"+
		"\2\u01e3\u01e5\5\n\6\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01ea\7d\2\2\u01ea\u01fd\3\2\2\2\u01eb\u01ec\7\65\2\2\u01ec\u01fd\5\b"+
		"\5\2\u01ed\u01fd\7\65\2\2\u01ee\u01ef\7\u0080\2\2\u01ef\u01f8\7c\2\2\u01f0"+
		"\u01f5\5\b\5\2\u01f1\u01f2\7@\2\2\u01f2\u01f4\5\b\5\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f0\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd\7d\2\2\u01fb\u01fd\7\u0080\2\2\u01fc"+
		"\u01d0\3\2\2\2\u01fc\u01d1\3\2\2\2\u01fc\u01d2\3\2\2\2\u01fc\u01d3\3\2"+
		"\2\2\u01fc\u01d4\3\2\2\2\u01fc\u01d5\3\2\2\2\u01fc\u01d6\3\2\2\2\u01fc"+
		"\u01d7\3\2\2\2\u01fc\u01d8\3\2\2\2\u01fc\u01d9\3\2\2\2\u01fc\u01da\3\2"+
		"\2\2\u01fc\u01db\3\2\2\2\u01fc\u01dc\3\2\2\2\u01fc\u01dd\3\2\2\2\u01fc"+
		"\u01de\3\2\2\2\u01fc\u01df\3\2\2\2\u01fc\u01eb\3\2\2\2\u01fc\u01ed\3\2"+
		"\2\2\u01fc\u01ee\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd\13\3\2\2\2\u01fe\u0200"+
		"\5\36\20\2\u01ff\u0201\5\26\f\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2"+
		"\2\u0201\u0202\3\2\2\2\u0202\u0203\5\16\b\2\u0203\u0204\7!\2\2\u0204\u0205"+
		"\5\b\5\2\u0205\u0215\3\2\2\2\u0206\u0207\7b\2\2\u0207\u0209\5\36\20\2"+
		"\u0208\u020a\5\26\f\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u020f\5\16\b\2\u020c\u020e\5\6\4\2\u020d\u020c\3\2\2\2"+
		"\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7F\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u01fe\3\2\2\2\u0214\u0206\3\2\2\2\u0215\r\3\2\2\2\u0216\u021f\7W\2\2"+
		"\u0217\u021c\5\20\t\2\u0218\u0219\t\3\2\2\u0219\u021b\5\20\t\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0217\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7X\2\2\u0222\17\3\2\2\2\u0223\u0224"+
		"\7\u0080\2\2\u0224\u0225\7>\2\2\u0225\u0228\5\n\6\2\u0226\u0227\7!\2\2"+
		"\u0227\u0229\5\b\5\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0238"+
		"\3\2\2\2\u022a\u022b\7>\2\2\u022b\u022e\5\n\6\2\u022c\u022d\7!\2\2\u022d"+
		"\u022f\5\b\5\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0238\3\2"+
		"\2\2\u0230\u0231\7\u0080\2\2\u0231\u0238\7\60\2\2\u0232\u0235\7\u0080"+
		"\2\2\u0233\u0234\7!\2\2\u0234\u0236\5\b\5\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0223\3\2\2\2\u0237\u022a\3\2"+
		"\2\2\u0237\u0230\3\2\2\2\u0237\u0232\3\2\2\2\u0238\21\3\2\2\2\u0239\u023a"+
		"\7^\2\2\u023a\u023c\7\u0080\2\2\u023b\u023d\5\26\f\2\u023c\u023b\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0283\5\b\5\2\u023f\u0240"+
		"\7[\2\2\u0240\u0242\7\u0080\2\2\u0241\u0243\5\26\f\2\u0242\u0241\3\2\2"+
		"\2\u0242\u0243\3\2\2\2\u0243\u0249\3\2\2\2\u0244\u0245\7\\\2\2\u0245\u0247"+
		"\7\u0080\2\2\u0246\u0248\5\26\f\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024a\3\2\2\2\u0249\u0244\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u0283\3\2\2\2\u024b\u024c\7]\2\2\u024c\u024d\7\u0086\2\2\u024d\u024e"+
		"\7\u0080\2\2\u024e\u024f\7\\\2\2\u024f\u0283\7\u0080\2\2\u0250\u0251\7"+
		"]\2\2\u0251\u0252\7\u0086\2\2\u0252\u0283\7\u0080\2\2\u0253\u0254\7_\2"+
		"\2\u0254\u0256\7\u0080\2\2\u0255\u0257\5\26\f\2\u0256\u0255\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0259\7\\\2\2\u0259\u025b\7\u0080"+
		"\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025f\3\2\2\2\u025c"+
		"\u025e\5\24\13\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d\3"+
		"\2\2\2\u025f\u0260\3\2\2\2\u0260\u0265\3\2\2\2\u0261\u025f\3\2\2\2\u0262"+
		"\u0264\5\f\7\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u0283\7F\2\2\u0269\u026a\7`\2\2\u026a\u026c\7\u0080\2\2\u026b\u026d\5"+
		"\26\f\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0273\3\2\2\2\u026e"+
		"\u026f\7\\\2\2\u026f\u0271\7\u0080\2\2\u0270\u0272\5\26\f\2\u0271\u0270"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u026e\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0277\5\24\13\2\u0276\u0275\3"+
		"\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027e\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u027d\5\f\7\2\u027c\u027b\3\2"+
		"\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0283\7F\2\2\u0282\u0239\3\2"+
		"\2\2\u0282\u023f\3\2\2\2\u0282\u024b\3\2\2\2\u0282\u0250\3\2\2\2\u0282"+
		"\u0253\3\2\2\2\u0282\u0269\3\2\2\2\u0283\23\3\2\2\2\u0284\u0285\7\u0080"+
		"\2\2\u0285\u0286\7>\2\2\u0286\u0289\5\n\6\2\u0287\u0289\7\u0080\2\2\u0288"+
		"\u0284\3\2\2\2\u0288\u0287\3\2\2\2\u0289\25\3\2\2\2\u028a\u028b\7c\2\2"+
		"\u028b\u0290\5\30\r\2\u028c\u028d\7@\2\2\u028d\u028f\5\30\r\2\u028e\u028c"+
		"\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0294\7d\2\2\u0294\27\3\2\2\2"+
		"\u0295\u0296\7\u0080\2\2\u0296\u0297\7\\\2\2\u0297\u029c\5\n\6\2\u0298"+
		"\u0299\7>\2\2\u0299\u029c\5\n\6\2\u029a\u029c\5\b\5\2\u029b\u0295\3\2"+
		"\2\2\u029b\u0298\3\2\2\2\u029b\u029a\3\2\2\2\u029c\31\3\2\2\2\u029d\u029e"+
		"\7:\2\2\u029e\u029f\5\b\5\2\u029f\u02a0\7!\2\2\u02a0\u02a1\5\b\5\2\u02a1"+
		"\u02a2\7?\2\2\u02a2\u02a6\5\b\5\2\u02a3\u02a5\5\6\4\2\u02a4\u02a3\3\2"+
		"\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\7F\2\2\u02aa\u02c8\3\2"+
		"\2\2\u02ab\u02ac\7:\2\2\u02ac\u02ad\5\b\5\2\u02ad\u02ae\7!\2\2\u02ae\u02af"+
		"\5\b\5\2\u02af\u02b0\7?\2\2\u02b0\u02b1\5\b\5\2\u02b1\u02b2\7?\2\2\u02b2"+
		"\u02b6\5\b\5\2\u02b3\u02b5\5\6\4\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2"+
		"\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8"+
		"\u02b6\3\2\2\2\u02b9\u02ba\7F\2\2\u02ba\u02c8\3\2\2\2\u02bb\u02bc\7:\2"+
		"\2\u02bc\u02bd\5\b\5\2\u02bd\u02be\7\66\2\2\u02be\u02c2\5\b\5\2\u02bf"+
		"\u02c1\5\6\4\2\u02c0\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2"+
		"\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02c6\7F\2\2\u02c6\u02c8\3\2\2\2\u02c7\u029d\3\2\2\2\u02c7\u02ab\3\2"+
		"\2\2\u02c7\u02bb\3\2\2\2\u02c8\33\3\2\2\2\u02c9\u02ca\7\63\2\2\u02ca\u02ce"+
		"\5\b\5\2\u02cb\u02cd\5\6\4\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce"+
		"\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d2\7F\2\2\u02d2\35\3\2\2\2\u02d3\u02d8\7\u0080\2\2\u02d4"+
		"\u02d5\7\5\2\2\u02d5\u02d7\7\u0080\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\37\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2H#/:BKOWdlpz~\u0083\u0095\u009d\u00a2\u00a9\u00ac\u00b6"+
		"\u00ca\u00ce\u00d6\u00da\u00df\u00ea\u00ee\u00f3\u00fa\u0105\u0109\u0125"+
		"\u01cb\u01cd\u01e6\u01f5\u01f8\u01fc\u0200\u0209\u020f\u0214\u021c\u021f"+
		"\u0228\u022e\u0235\u0237\u023c\u0242\u0247\u0249\u0256\u025a\u025f\u0265"+
		"\u026c\u0271\u0273\u0278\u027e\u0282\u0288\u0290\u029b\u02a6\u02b6\u02c2"+
		"\u02c7\u02ce\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'@'", "'.'", "';'", "'==='", "'=='", null, "'>'", "'<'",
		null, null, "'-'", "'^'", "'//'", "'*'", "'/'", "'+'", "'.=='", null,
		"'.>'", "'.<'", "'.>='", null, "'.-'", "'.^'", "'.//'", "'.*'", "'./'",
		"'.+'", "'|>'", "'='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'\\='",
		"'%='", "'%'", "'^='", "'&='", "'|='", "'$='", "'>>>='", "'>>='", "'...'",
		"'<<='", "'?'", "'while'", "'begin'", "'return'", "'in'", "'if'", "'elseif'",
		"'else'", "'for'", "'const'", "'using'", "'import'", "'::'", "':'", "','",
		"'do'", "'importall'", "'export'", "'module'", "'let'", null, null, "'baremodule'",
		"'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'",
		"'NaN32'", "'NaN'", "'!'", "'&&'", "'&'", "'||'", "'|'", "'('", "')'",
		"'true'", "'false'", "'abstract'", "'<:'", "'bitstype'", "'typealias'",
		"'type'", "'immutable'", "'Union'", "'function'", "'{'", "'}'", "'['",
		"']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'", "'Int32'", "'Uint32'",
		"'Int64'", "'Uint64'", "'Int128'", "'Uint128'", "'Bool'", "'Char'", "'Float16'",
		"'Float32'", "'Float64'"
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
		"LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE",
		"BEGIN", "RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "USING",
		"IMPORT", "INSTANCE_OF", "COLON", "COMMA", "DO", "IMPORT_ALL", "EXPORT",
		"MODULE", "LET", "END", "END_LITERAL", "BAREMODULE", "INF16", "INF32",
		"INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", "NAN32", "NAN",
		"NOT", "AND", "BITWISE_AND", "OR", "BITWISE_OR", "LEFT_BRACKET", "RIGHT_BRACKET",
		"TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE",
		"IMMUTABLE", "UNION", "FUNCTION", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE",
		"RIGHT_SQUARE", "INT8", "UINT8", "INT16", "UINT16", "INT32", "UINT32",
		"INT64", "UINT64", "INT128", "UINT128", "BOOL", "CHAR", "FLOAT16", "FLOAT32",
		"FLOAT64", "REGEX", "INT", "BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL",
		"EXP32", "FLOAT64_LITERAL", "EXP64", "FQN", "ID", "CHARACTER_LITERAL",
		"STRING", "WS", "COMMENT", "LINE_COMMENT", "SIZE"
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
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0) );
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
				} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0) );
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
				} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0) );
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
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(MINUS);
				setState(89);
				exp(93);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(NOT);
				setState(91);
				exp(64);
				}
				break;
			case 3:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(CONST);
				setState(93);
				match(ID);
				setState(94);
				match(EQ);
				setState(95);
				exp(12);
				}
				break;
			case 4:
				{
				_localctx = new ApplyFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				name();
				setState(98);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(97);
					typeParameters();
					}
				}

				setState(100);
				match(LEFT_BRACKET);
				setState(110);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(101);
							exp(0);
							setState(102);
							match(COMMA);
							}
							}
						}
						setState(108);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					setState(109);
					exp(0);
					}
				}

				setState(112);
				match(RIGHT_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new EnumerationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						match(LEFT_SQUARE);
						setState(120);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(115);
								exp(0);
								setState(116);
								match(COMMA);
								}
								}
							}
							setState(122);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						setState(124);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
							{
							setState(123);
							exp(0);
							}
						}

						setState(126);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(LEFT_SQUARE);
				setState(132);
				exp(0);
				setState(133);
				match(FOR);
				setState(134);
				match(ID);
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(136);
				exp(0);
				setState(137);
				match(COLON);
				setState(138);
				exp(0);
				setState(139);
				match(RIGHT_SQUARE);
				}
				break;
			case 7:
				{
				_localctx = new EndLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(END_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new NaryConditionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(IF);
				setState(143);
				exp(0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					{
					setState(144);
					statement();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE_IF) {
					{
					{
					setState(150);
					match(ELSE_IF);
					setState(151);
					exp(0);
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
						{
						{
						setState(152);
						statement();
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(163);
					match(ELSE);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
						{
						{
						setState(164);
						statement();
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(172);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(LET);
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						match(ID);
						setState(176);
						match(EQ);
						setState(177);
						exp(0);
						}
						}
					}
					setState(182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(183);
				statement();
				setState(184);
				match(END);
				}
				break;
			case 10:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(BEGIN);
				setState(187);
				exp(0);
				setState(188);
				match(END);
				}
				break;
			case 11:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(LEFT_BRACKET);
				setState(191);
				exp(0);
				setState(192);
				match(RIGHT_BRACKET);
				}
				break;
			case 12:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(LEFT_BRACKET);
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						exp(0);
						setState(196);
						match(COMMA);
						}
						}
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(204);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(203);
					exp(0);
					}
				}

				setState(206);
				match(RIGHT_BRACKET);
				}
				break;
			case 13:
				{
				_localctx = new AnonymousFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(DO);
				setState(216);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(208);
							match(ID);
							setState(209);
							match(COMMA);
							}
							}
						}
						setState(214);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(215);
					match(ID);
					}
					break;
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					{
					setState(218);
					statement();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(END);
				}
				break;
			case 14:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				name();
				setState(239);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						match(LEFT_SQUARE);
						setState(232);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						}
						setState(236);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
							{
							setState(235);
							exp(0);
							}
						}

						setState(238);
						match(RIGHT_SQUARE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 15:
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
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 16:
				{
				_localctx = new InvokeMarco2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(AT);
				setState(252);
				name();
				setState(253);
				match(LEFT_BRACKET);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(263);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(262);
					exp(0);
					}
				}

				setState(265);
				match(RIGHT_BRACKET);
				}
				break;
			case 17:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(ID);
				}
				break;
			case 18:
				{
				_localctx = new RegexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(REGEX);
				}
				break;
			case 19:
				{
				_localctx = new TtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(TRUE);
				}
				break;
			case 20:
				{
				_localctx = new FfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(FALSE);
				}
				break;
			case 21:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(INT);
				}
				break;
			case 22:
				{
				_localctx = new BinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(BINARY);
				}
				break;
			case 23:
				{
				_localctx = new OctalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(OCTAL);
				}
				break;
			case 24:
				{
				_localctx = new HexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(HEX);
				}
				break;
			case 25:
				{
				_localctx = new Ffloat32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(FLOAT32_LITERAL);
				}
				break;
			case 26:
				{
				_localctx = new Ffloat64Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(FLOAT64_LITERAL);
				}
				break;
			case 27:
				{
				_localctx = new CharaacterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(CHARACTER_LITERAL);
				}
				break;
			case 28:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(STRING);
				}
				break;
			case 29:
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
			case 30:
				{
				_localctx = new Inf16TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(INF16);
				}
				break;
			case 31:
				{
				_localctx = new Inf32TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(INF32);
				}
				break;
			case 32:
				{
				_localctx = new InfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(INF);
				}
				break;
			case 33:
				{
				_localctx = new MinusInf16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(MINUS_INF16);
				}
				break;
			case 34:
				{
				_localctx = new MinusInf32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(MINUS_INF32);
				}
				break;
			case 35:
				{
				_localctx = new MinusInfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(MINUS_INF);
				}
				break;
			case 36:
				{
				_localctx = new Nan16Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(NAN16);
				}
				break;
			case 37:
				{
				_localctx = new Nan32Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(NAN32);
				}
				break;
			case 38:
				{
				_localctx = new NanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(NAN);
				}
				break;
			case 39:
				{
				_localctx = new TtypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				typeExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(457);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(293);
						if (!(precpred(_ctx, 89))) throw new FailedPredicateException(this, "precpred(_ctx, 89)");
						setState(294);
						match(EXPONENT);
						setState(295);
						exp(89);
						}
						break;
					case 2:
						{
						_localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(296);
						if (!(precpred(_ctx, 87))) throw new FailedPredicateException(this, "precpred(_ctx, 87)");
						setState(297);
						match(FRACTION);
						setState(298);
						exp(88);
						}
						break;
					case 3:
						{
						_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(299);
						if (!(precpred(_ctx, 86))) throw new FailedPredicateException(this, "precpred(_ctx, 86)");
						setState(300);
						match(TIMES);
						setState(301);
						exp(87);
						}
						break;
					case 4:
						{
						_localctx = new RemainderContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(302);
						if (!(precpred(_ctx, 85))) throw new FailedPredicateException(this, "precpred(_ctx, 85)");
						setState(303);
						match(REM);
						setState(304);
						exp(86);
						}
						break;
					case 5:
						{
						_localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(305);
						if (!(precpred(_ctx, 84))) throw new FailedPredicateException(this, "precpred(_ctx, 84)");
						setState(306);
						match(DIVIDE);
						setState(307);
						exp(85);
						}
						break;
					case 6:
						{
						_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(308);
						if (!(precpred(_ctx, 83))) throw new FailedPredicateException(this, "precpred(_ctx, 83)");
						setState(309);
						match(PLUS);
						setState(310);
						exp(84);
						}
						break;
					case 7:
						{
						_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(311);
						if (!(precpred(_ctx, 82))) throw new FailedPredicateException(this, "precpred(_ctx, 82)");
						setState(312);
						match(MINUS);
						setState(313);
						exp(83);
						}
						break;
					case 8:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(314);
						if (!(precpred(_ctx, 81))) throw new FailedPredicateException(this, "precpred(_ctx, 81)");
						setState(315);
						match(GREATER_THAN);
						setState(316);
						exp(82);
						}
						break;
					case 9:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(317);
						if (!(precpred(_ctx, 80))) throw new FailedPredicateException(this, "precpred(_ctx, 80)");
						setState(318);
						match(LESS_THAN);
						setState(319);
						exp(81);
						}
						break;
					case 10:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(320);
						if (!(precpred(_ctx, 79))) throw new FailedPredicateException(this, "precpred(_ctx, 79)");
						setState(321);
						match(GREATER_THAN_OR_EQ);
						setState(322);
						exp(80);
						}
						break;
					case 11:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(323);
						if (!(precpred(_ctx, 78))) throw new FailedPredicateException(this, "precpred(_ctx, 78)");
						setState(324);
						match(LESS_THAN_OR_EQ);
						setState(325);
						exp(79);
						}
						break;
					case 12:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(326);
						if (!(precpred(_ctx, 77))) throw new FailedPredicateException(this, "precpred(_ctx, 77)");
						setState(327);
						match(EQUALS);
						setState(328);
						exp(78);
						}
						break;
					case 13:
						{
						_localctx = new ElmFractionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(329);
						if (!(precpred(_ctx, 76))) throw new FailedPredicateException(this, "precpred(_ctx, 76)");
						setState(330);
						match(ELM_FRACTION);
						setState(331);
						exp(77);
						}
						break;
					case 14:
						{
						_localctx = new ElmTimesContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(332);
						if (!(precpred(_ctx, 75))) throw new FailedPredicateException(this, "precpred(_ctx, 75)");
						setState(333);
						match(ELM_TIMES);
						setState(334);
						exp(76);
						}
						break;
					case 15:
						{
						_localctx = new ElmDivideContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(335);
						if (!(precpred(_ctx, 74))) throw new FailedPredicateException(this, "precpred(_ctx, 74)");
						setState(336);
						match(ELM_DIVIDE);
						setState(337);
						exp(75);
						}
						break;
					case 16:
						{
						_localctx = new ElmPlusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(338);
						if (!(precpred(_ctx, 73))) throw new FailedPredicateException(this, "precpred(_ctx, 73)");
						setState(339);
						match(ELM_PLUS);
						setState(340);
						exp(74);
						}
						break;
					case 17:
						{
						_localctx = new ElmMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 72))) throw new FailedPredicateException(this, "precpred(_ctx, 72)");
						setState(342);
						match(ELM_MINUS);
						setState(343);
						exp(73);
						}
						break;
					case 18:
						{
						_localctx = new ElmGreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(344);
						if (!(precpred(_ctx, 71))) throw new FailedPredicateException(this, "precpred(_ctx, 71)");
						setState(345);
						match(ELM_GREATER_THAN);
						setState(346);
						exp(72);
						}
						break;
					case 19:
						{
						_localctx = new ElmLessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(347);
						if (!(precpred(_ctx, 70))) throw new FailedPredicateException(this, "precpred(_ctx, 70)");
						setState(348);
						match(ELM_LESS_THAN);
						setState(349);
						exp(71);
						}
						break;
					case 20:
						{
						_localctx = new ElmGreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(350);
						if (!(precpred(_ctx, 69))) throw new FailedPredicateException(this, "precpred(_ctx, 69)");
						setState(351);
						match(ELM_GREATER_THAN_OR_EQ);
						setState(352);
						exp(70);
						}
						break;
					case 21:
						{
						_localctx = new ElmLessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(353);
						if (!(precpred(_ctx, 68))) throw new FailedPredicateException(this, "precpred(_ctx, 68)");
						setState(354);
						match(ELM_LESS_THAN_OR_EQ);
						setState(355);
						exp(69);
						}
						break;
					case 22:
						{
						_localctx = new ElmEqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(356);
						if (!(precpred(_ctx, 67))) throw new FailedPredicateException(this, "precpred(_ctx, 67)");
						setState(357);
						match(ELM_EQUALS);
						setState(358);
						exp(68);
						}
						break;
					case 23:
						{
						_localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(359);
						if (!(precpred(_ctx, 66))) throw new FailedPredicateException(this, "precpred(_ctx, 66)");
						setState(360);
						match(SUB_TYPE);
						setState(361);
						exp(67);
						}
						break;
					case 24:
						{
						_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(362);
						if (!(precpred(_ctx, 65))) throw new FailedPredicateException(this, "precpred(_ctx, 65)");
						setState(363);
						match(QUESTION_MARK);
						setState(364);
						exp(0);
						setState(365);
						match(COLON);
						setState(366);
						exp(66);
						}
						break;
					case 25:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(368);
						if (!(precpred(_ctx, 63))) throw new FailedPredicateException(this, "precpred(_ctx, 63)");
						setState(369);
						match(AND);
						setState(370);
						exp(64);
						}
						break;
					case 26:
						{
						_localctx = new BitwiseAndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(371);
						if (!(precpred(_ctx, 62))) throw new FailedPredicateException(this, "precpred(_ctx, 62)");
						setState(372);
						match(BITWISE_AND);
						setState(373);
						exp(63);
						}
						break;
					case 27:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(374);
						if (!(precpred(_ctx, 61))) throw new FailedPredicateException(this, "precpred(_ctx, 61)");
						setState(375);
						match(OR);
						setState(376);
						exp(62);
						}
						break;
					case 28:
						{
						_localctx = new BitwisOrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(377);
						if (!(precpred(_ctx, 60))) throw new FailedPredicateException(this, "precpred(_ctx, 60)");
						setState(378);
						match(BITWISE_OR);
						setState(379);
						exp(61);
						}
						break;
					case 29:
						{
						_localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(380);
						if (!(precpred(_ctx, 53))) throw new FailedPredicateException(this, "precpred(_ctx, 53)");
						setState(381);
						match(NOT_EQUAL);
						setState(382);
						exp(54);
						}
						break;
					case 30:
						{
						_localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(383);
						if (!(precpred(_ctx, 52))) throw new FailedPredicateException(this, "precpred(_ctx, 52)");
						setState(384);
						match(EQ);
						setState(385);
						exp(53);
						}
						break;
					case 31:
						{
						_localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(386);
						if (!(precpred(_ctx, 51))) throw new FailedPredicateException(this, "precpred(_ctx, 51)");
						setState(387);
						match(ADD_ASGN);
						setState(388);
						exp(52);
						}
						break;
					case 32:
						{
						_localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(389);
						if (!(precpred(_ctx, 50))) throw new FailedPredicateException(this, "precpred(_ctx, 50)");
						setState(390);
						match(SUB_ASGN);
						setState(391);
						exp(51);
						}
						break;
					case 33:
						{
						_localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(392);
						if (!(precpred(_ctx, 49))) throw new FailedPredicateException(this, "precpred(_ctx, 49)");
						setState(393);
						match(TIMES_ASGN);
						setState(394);
						exp(50);
						}
						break;
					case 34:
						{
						_localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(395);
						if (!(precpred(_ctx, 48))) throw new FailedPredicateException(this, "precpred(_ctx, 48)");
						setState(396);
						match(DIVIDE_ASGN);
						setState(397);
						exp(49);
						}
						break;
					case 35:
						{
						_localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(398);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(399);
						match(INV_DIVIDE_ASGN);
						setState(400);
						exp(48);
						}
						break;
					case 36:
						{
						_localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(401);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(402);
						match(REMAINDER_ASGN);
						setState(403);
						exp(47);
						}
						break;
					case 37:
						{
						_localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(404);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(405);
						match(POWER_ASGN);
						setState(406);
						exp(46);
						}
						break;
					case 38:
						{
						_localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(407);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(408);
						match(BITWISE_AND_ASGN);
						setState(409);
						exp(45);
						}
						break;
					case 39:
						{
						_localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(410);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(411);
						match(BITWISE_OR_ASGN);
						setState(412);
						exp(44);
						}
						break;
					case 40:
						{
						_localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(413);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(414);
						match(BITWISE_XOR_ASGN);
						setState(415);
						exp(43);
						}
						break;
					case 41:
						{
						_localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(416);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(417);
						match(LSR_ASGN);
						setState(418);
						exp(42);
						}
						break;
					case 42:
						{
						_localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(419);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(420);
						match(ASR_ASGN);
						setState(421);
						exp(41);
						}
						break;
					case 43:
						{
						_localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(422);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(423);
						match(ASL_ASGN);
						setState(424);
						exp(40);
						}
						break;
					case 44:
						{
						_localctx = new PairContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(425);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(426);
						match(DOUBLE_ARROW);
						setState(427);
						exp(39);
						}
						break;
					case 45:
						{
						_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(428);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(429);
						match(COLON);
						setState(430);
						exp(38);
						}
						break;
					case 46:
						{
						_localctx = new InContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(431);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(432);
						match(IN);
						setState(433);
						exp(37);
						}
						break;
					case 47:
						{
						_localctx = new IsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(434);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(435);
						match(IS);
						setState(436);
						exp(36);
						}
						break;
					case 48:
						{
						_localctx = new ChainedContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(437);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(438);
						match(SEMI_COLON);
						setState(439);
						exp(35);
						}
						break;
					case 49:
						{
						_localctx = new ApplyPrecedngContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(440);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(441);
						match(RAPP);
						setState(442);
						exp(33);
						}
						break;
					case 50:
						{
						_localctx = new LambdaContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(443);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(444);
						match(ARROW);
						setState(445);
						exp(31);
						}
						break;
					case 51:
						{
						_localctx = new ProjectContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(446);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(447);
						match(DOT);
						setState(448);
						exp(27);
						}
						break;
					case 52:
						{
						_localctx = new ImplicitTupleContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(449);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(450);
						match(COMMA);
						setState(451);
						exp(3);
						}
						break;
					case 53:
						{
						_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(452);
						if (!(precpred(_ctx, 88))) throw new FailedPredicateException(this, "precpred(_ctx, 88)");
						setState(453);
						match(INSTANCE_OF);
						setState(454);
						typeExpression();
						}
						break;
					case 54:
						{
						_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(455);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(456);
						match(ELLIPSE);
						}
						break;
					}
					}
				}
				setState(461);
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

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeExpression);
		int _la;
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new Int8Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(INT8);
				}
				break;
			case 2:
				_localctx = new Uint8Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(UINT8);
				}
				break;
			case 3:
				_localctx = new Int16Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(INT16);
				}
				break;
			case 4:
				_localctx = new Uint16Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(465);
				match(UINT16);
				}
				break;
			case 5:
				_localctx = new Int32Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(466);
				match(INT32);
				}
				break;
			case 6:
				_localctx = new Uint32Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(467);
				match(UINT32);
				}
				break;
			case 7:
				_localctx = new Int64Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(468);
				match(INT64);
				}
				break;
			case 8:
				_localctx = new Uint64Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(469);
				match(UINT64);
				}
				break;
			case 9:
				_localctx = new Int128Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(470);
				match(INT128);
				}
				break;
			case 10:
				_localctx = new Uint128Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(471);
				match(UINT128);
				}
				break;
			case 11:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(472);
				match(BOOL);
				}
				break;
			case 12:
				_localctx = new CharContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(473);
				match(CHAR);
				}
				break;
			case 13:
				_localctx = new Float16Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(474);
				match(FLOAT16);
				}
				break;
			case 14:
				_localctx = new Float32Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(475);
				match(FLOAT32);
				}
				break;
			case 15:
				_localctx = new Float64Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(476);
				match(FLOAT64);
				}
				break;
			case 16:
				_localctx = new UnionTypeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(477);
				match(UNION);
				setState(478);
				match(LEFT_CURLY);
				setState(479);
				typeExpression();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(480);
					match(COMMA);
					setState(481);
					typeExpression();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
				match(RIGHT_CURLY);
				}
				break;
			case 17:
				_localctx = new ReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(489);
				match(RETURN);
				setState(490);
				exp(0);
				}
				break;
			case 18:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(491);
				match(RETURN);
				}
				break;
			case 19:
				_localctx = new ParametricTypeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(492);
				match(ID);
				setState(493);
				match(LEFT_CURLY);
				setState(502);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << MINUS) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << DO))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LET - 67)) | (1L << (END_LITERAL - 67)) | (1L << (INF16 - 67)) | (1L << (INF32 - 67)) | (1L << (INF - 67)) | (1L << (MINUS_INF16 - 67)) | (1L << (MINUS_INF32 - 67)) | (1L << (MINUS_INF - 67)) | (1L << (NAN16 - 67)) | (1L << (NAN32 - 67)) | (1L << (NAN - 67)) | (1L << (NOT - 67)) | (1L << (LEFT_BRACKET - 67)) | (1L << (TRUE - 67)) | (1L << (FALSE - 67)) | (1L << (UNION - 67)) | (1L << (LEFT_SQUARE - 67)) | (1L << (INT8 - 67)) | (1L << (UINT8 - 67)) | (1L << (INT16 - 67)) | (1L << (UINT16 - 67)) | (1L << (INT32 - 67)) | (1L << (UINT32 - 67)) | (1L << (INT64 - 67)) | (1L << (UINT64 - 67)) | (1L << (INT128 - 67)) | (1L << (UINT128 - 67)) | (1L << (BOOL - 67)) | (1L << (CHAR - 67)) | (1L << (FLOAT16 - 67)) | (1L << (FLOAT32 - 67)) | (1L << (FLOAT64 - 67)) | (1L << (REGEX - 67)) | (1L << (INT - 67)) | (1L << (BINARY - 67)) | (1L << (OCTAL - 67)) | (1L << (HEX - 67)) | (1L << (FLOAT32_LITERAL - 67)) | (1L << (FLOAT64_LITERAL - 67)) | (1L << (ID - 67)) | (1L << (CHARACTER_LITERAL - 67)) | (1L << (STRING - 67)))) != 0)) {
					{
					setState(494);
					exp(0);
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(495);
						match(COMMA);
						setState(496);
						exp(0);
						}
						}
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(504);
				match(RIGHT_CURLY);
				}
				break;
			case 20:
				_localctx = new UserDefinedTypeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(505);
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

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			setState(530);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CompactFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				name();
				setState(510);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(509);
					typeParameters();
					}
				}

				setState(512);
				parameters();
				setState(513);
				match(EQ);
				setState(514);
				exp(0);
				}
				break;
			case FUNCTION:
				_localctx = new GeneralFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(FUNCTION);
				setState(517);
				name();
				setState(519);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(518);
					typeParameters();
					}
				}

				setState(521);
				parameters();
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					{
					setState(522);
					statement();
					}
					}
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(528);
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
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			_localctx = new PparametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(LEFT_BRACKET);
			setState(541);
			_la = _input.LA(1);
			if (_la==INSTANCE_OF || _la==ID) {
				{
				setState(533);
				parameter();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON || _la==COMMA) {
					{
					{
					setState(534);
					_la = _input.LA(1);
					if ( !(_la==SEMI_COLON || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(535);
					parameter();
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(543);
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
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new NamedTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(ID);
				setState(546);
				match(INSTANCE_OF);
				setState(547);
				typeExpression();
				setState(550);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(548);
					match(EQ);
					setState(549);
					exp(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new AnonymousTypedParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(INSTANCE_OF);
				setState(553);
				typeExpression();
				setState(556);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(554);
					match(EQ);
					setState(555);
					exp(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new VarargContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(ID);
				setState(559);
				match(ELLIPSE);
				}
				break;
			case 4:
				_localctx = new NamedParamContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				match(ID);
				setState(563);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(561);
					match(EQ);
					setState(562);
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

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new TypeAliasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(TYPE_ALIAS);
				setState(568);
				match(ID);
				setState(570);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(569);
					typeParameters();
					}
				}

				setState(572);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AbstractTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(ABSTRACT);
				setState(574);
				match(ID);
				setState(576);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(575);
					typeParameters();
					}
				}

				setState(583);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(578);
					match(SUB_TYPE);
					setState(579);
					match(ID);
					setState(581);
					_la = _input.LA(1);
					if (_la==LEFT_CURLY) {
						{
						setState(580);
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
				setState(585);
				match(BITS_TYPE);
				setState(586);
				match(SIZE);
				setState(587);
				match(ID);
				setState(588);
				match(SUB_TYPE);
				setState(589);
				match(ID);
				}
				break;
			case 4:
				_localctx = new BitsTtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				match(BITS_TYPE);
				setState(591);
				match(SIZE);
				setState(592);
				match(ID);
				}
				break;
			case 5:
				_localctx = new MutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				match(TYPE);
				setState(594);
				match(ID);
				setState(596);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(595);
					typeParameters();
					}
				}

				setState(600);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(598);
					match(SUB_TYPE);
					setState(599);
					match(ID);
					}
				}

				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						fieldDeclaration();
						}
						}
					}
					setState(607);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(608);
					functionDeclaration();
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(614);
				match(END);
				}
				break;
			case 6:
				_localctx = new ImmutableTypeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(615);
				match(IMMUTABLE);
				setState(616);
				match(ID);
				setState(618);
				_la = _input.LA(1);
				if (_la==LEFT_CURLY) {
					{
					setState(617);
					typeParameters();
					}
				}

				setState(625);
				_la = _input.LA(1);
				if (_la==SUB_TYPE) {
					{
					setState(620);
					match(SUB_TYPE);
					setState(621);
					match(ID);
					setState(623);
					_la = _input.LA(1);
					if (_la==LEFT_CURLY) {
						{
						setState(622);
						typeParameters();
						}
					}

					}
				}

				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						fieldDeclaration();
						}
						}
					}
					setState(632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION || _la==ID) {
					{
					{
					setState(633);
					functionDeclaration();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(639);
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
		enterRule(_localctx, 18, RULE_fieldDeclaration);
		try {
			setState(646);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new TypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(ID);
				setState(643);
				match(INSTANCE_OF);
				setState(644);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new UntypedFieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
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

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameters);
		int _la;
		try {
			_localctx = new TtypeParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(LEFT_CURLY);
			setState(649);
			typeParameter();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(650);
				match(COMMA);
				setState(651);
				typeParameter();
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
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
		enterRule(_localctx, 22, RULE_typeParameter);
		try {
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new NamedSubtypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(ID);
				setState(660);
				match(SUB_TYPE);
				setState(661);
				typeExpression();
				}
				break;
			case 2:
				_localctx = new InstanceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				match(INSTANCE_OF);
				setState(663);
				typeExpression();
				}
				break;
			case 3:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
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
		enterRule(_localctx, 24, RULE_forStatement);
		int _la;
		try {
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new ForEqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(FOR);
				setState(668);
				exp(0);
				setState(669);
				match(EQ);
				setState(670);
				exp(0);
				setState(671);
				match(COLON);
				setState(672);
				exp(0);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					{
					setState(673);
					statement();
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(679);
				match(END);
				}
				break;
			case 2:
				_localctx = new ForEqStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(FOR);
				setState(682);
				exp(0);
				setState(683);
				match(EQ);
				setState(684);
				exp(0);
				setState(685);
				match(COLON);
				setState(686);
				exp(0);
				setState(687);
				match(COLON);
				setState(688);
				exp(0);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
					{
					{
					setState(689);
					statement();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(695);
				match(END);
				}
				break;
			case 3:
				_localctx = new ForInContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				match(FOR);
				setState(698);
				exp(0);
				setState(699);
				match(IN);
				setState(700);
				exp(0);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
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
		enterRule(_localctx, 26, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(WHILE);
			setState(712);
			exp(0);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (AT - 2)) | (1L << (MINUS - 2)) | (1L << (WHILE - 2)) | (1L << (BEGIN - 2)) | (1L << (RETURN - 2)) | (1L << (IF - 2)) | (1L << (FOR - 2)) | (1L << (CONST - 2)) | (1L << (USING - 2)) | (1L << (IMPORT - 2)) | (1L << (COLON - 2)) | (1L << (DO - 2)) | (1L << (IMPORT_ALL - 2)) | (1L << (EXPORT - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (MODULE - 66)) | (1L << (LET - 66)) | (1L << (END_LITERAL - 66)) | (1L << (BAREMODULE - 66)) | (1L << (INF16 - 66)) | (1L << (INF32 - 66)) | (1L << (INF - 66)) | (1L << (MINUS_INF16 - 66)) | (1L << (MINUS_INF32 - 66)) | (1L << (MINUS_INF - 66)) | (1L << (NAN16 - 66)) | (1L << (NAN32 - 66)) | (1L << (NAN - 66)) | (1L << (NOT - 66)) | (1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
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
		enterRule(_localctx, 28, RULE_name);
		try {
			int _alt;
			_localctx = new NnameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(ID);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					match(DOT);
					setState(723);
					match(ID);
					}
					}
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			return precpred(_ctx, 89);
		case 1:
			return precpred(_ctx, 87);
		case 2:
			return precpred(_ctx, 86);
		case 3:
			return precpred(_ctx, 85);
		case 4:
			return precpred(_ctx, 84);
		case 5:
			return precpred(_ctx, 83);
		case 6:
			return precpred(_ctx, 82);
		case 7:
			return precpred(_ctx, 81);
		case 8:
			return precpred(_ctx, 80);
		case 9:
			return precpred(_ctx, 79);
		case 10:
			return precpred(_ctx, 78);
		case 11:
			return precpred(_ctx, 77);
		case 12:
			return precpred(_ctx, 76);
		case 13:
			return precpred(_ctx, 75);
		case 14:
			return precpred(_ctx, 74);
		case 15:
			return precpred(_ctx, 73);
		case 16:
			return precpred(_ctx, 72);
		case 17:
			return precpred(_ctx, 71);
		case 18:
			return precpred(_ctx, 70);
		case 19:
			return precpred(_ctx, 69);
		case 20:
			return precpred(_ctx, 68);
		case 21:
			return precpred(_ctx, 67);
		case 22:
			return precpred(_ctx, 66);
		case 23:
			return precpred(_ctx, 65);
		case 24:
			return precpred(_ctx, 63);
		case 25:
			return precpred(_ctx, 62);
		case 26:
			return precpred(_ctx, 61);
		case 27:
			return precpred(_ctx, 60);
		case 28:
			return precpred(_ctx, 53);
		case 29:
			return precpred(_ctx, 52);
		case 30:
			return precpred(_ctx, 51);
		case 31:
			return precpred(_ctx, 50);
		case 32:
			return precpred(_ctx, 49);
		case 33:
			return precpred(_ctx, 48);
		case 34:
			return precpred(_ctx, 47);
		case 35:
			return precpred(_ctx, 46);
		case 36:
			return precpred(_ctx, 45);
		case 37:
			return precpred(_ctx, 44);
		case 38:
			return precpred(_ctx, 43);
		case 39:
			return precpred(_ctx, 42);
		case 40:
			return precpred(_ctx, 41);
		case 41:
			return precpred(_ctx, 40);
		case 42:
			return precpred(_ctx, 39);
		case 43:
			return precpred(_ctx, 38);
		case 44:
			return precpred(_ctx, 37);
		case 45:
			return precpred(_ctx, 36);
		case 46:
			return precpred(_ctx, 35);
		case 47:
			return precpred(_ctx, 34);
		case 48:
			return precpred(_ctx, 32);
		case 49:
			return precpred(_ctx, 31);
		case 50:
			return precpred(_ctx, 26);
		case 51:
			return precpred(_ctx, 2);
		case 52:
			return precpred(_ctx, 88);
		case 53:
			return precpred(_ctx, 33);
		}
		return true;
	}

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

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

	public static class ProjectContext extends ExpContext {
		public ProjectContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode DOT() { return getToken(JuliaParser.DOT, 0); }

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

	public static class LetContext extends ExpContext {
		public LetContext(ExpContext ctx) { copyFrom(ctx); }

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

	public static class ImplicitTupleContext extends ExpContext {
		public ImplicitTupleContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode COMMA() { return getToken(JuliaParser.COMMA, 0); }

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
		public InContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode IN() { return getToken(JuliaParser.IN, 0); }

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

	public static class ChainedContext extends ExpContext {
		public ChainedContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode SEMI_COLON() { return getToken(JuliaParser.SEMI_COLON, 0); }

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
		public IsContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode IS() { return getToken(JuliaParser.IS, 0); }

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

	public static class ComprehensionContext extends ExpContext {
		public ComprehensionContext(ExpContext ctx) { copyFrom(ctx); }

		public TerminalNode LEFT_SQUARE() { return getToken(JuliaParser.LEFT_SQUARE, 0); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode FOR() { return getToken(JuliaParser.FOR, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode COLON() { return getToken(JuliaParser.COLON, 0); }

		public TerminalNode RIGHT_SQUARE() { return getToken(JuliaParser.RIGHT_SQUARE, 0); }

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

		public TerminalNode IN() { return getToken(JuliaParser.IN, 0); }

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

	public static class AnonymousFunctionContext extends ExpContext {
		public AnonymousFunctionContext(ExpContext ctx) { copyFrom(ctx); }

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

	public static class ApplyPrecedngContext extends ExpContext {
		public ApplyPrecedngContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}

		public TerminalNode RAPP() { return getToken(JuliaParser.RAPP, 0); }

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

	public static class TypedExpressionContext extends ExpContext {
		public TypedExpressionContext(ExpContext ctx) { copyFrom(ctx); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TerminalNode INSTANCE_OF() { return getToken(JuliaParser.INSTANCE_OF, 0); }

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}

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

	public static class TtypeExpressionContext extends ExpContext {
		public TtypeExpressionContext(ExpContext ctx) { copyFrom(ctx); }

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}

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

	public static class AssignContext extends ExpContext {
		public AssignContext(ExpContext ctx) { copyFrom(ctx); }

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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

	public static class TypeExpressionContext extends ParserRuleContext {
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TypeExpressionContext() { }

		@Override public int getRuleIndex() { return RULE_typeExpression; }

		public void copyFrom(TypeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class BoolContext extends TypeExpressionContext {
		public BoolContext(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class ParametricTypeContext extends TypeExpressionContext {
		public ParametricTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class UserDefinedTypeContext extends TypeExpressionContext {
		public UserDefinedTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

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
		public Float32Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Float64Context extends TypeExpressionContext {
		public Float64Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class ReturnExpContext extends TypeExpressionContext {
		public ReturnExpContext(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Int16Context extends TypeExpressionContext {
		public Int16Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Float16Context extends TypeExpressionContext {
		public Float16Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Uint128Context extends TypeExpressionContext {
		public Uint128Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Int32Context extends TypeExpressionContext {
		public Int32Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Int64Context extends TypeExpressionContext {
		public Int64Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Int8Context extends TypeExpressionContext {
		public Int8Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Int128Context extends TypeExpressionContext {
		public Int128Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class CharContext extends TypeExpressionContext {
		public CharContext(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Uint64Context extends TypeExpressionContext {
		public Uint64Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Uint32Context extends TypeExpressionContext {
		public Uint32Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Uint8Context extends TypeExpressionContext {
		public Uint8Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class Uint16Context extends TypeExpressionContext {
		public Uint16Context(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class ReturnContext extends TypeExpressionContext {
		public ReturnContext(TypeExpressionContext ctx) { copyFrom(ctx); }

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

	public static class UnionTypeContext extends TypeExpressionContext {
		public UnionTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }

		public TerminalNode UNION() { return getToken(JuliaParser.UNION, 0); }

		public TerminalNode LEFT_CURLY() { return getToken(JuliaParser.LEFT_CURLY, 0); }

		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}

		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
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

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}

		public TerminalNode EQ() { return getToken(JuliaParser.EQ, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

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
		public VarargContext(ParameterContext ctx) { copyFrom(ctx); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public TerminalNode ELLIPSE() { return getToken(JuliaParser.ELLIPSE, 0); }

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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public TypeDeclarationContext() { }

		@Override public int getRuleIndex() { return RULE_typeDeclaration; }

		public void copyFrom(TypeDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class MutableTypeDeclarationContext extends TypeDeclarationContext {
		public MutableTypeDeclarationContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

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
		public ImmutableTypeDeclarationContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

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
		public AbstractTypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

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
		public BitsSubtypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

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

	public static class TypeAliasContext extends TypeDeclarationContext {
		public TypeAliasContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

		public TerminalNode TYPE_ALIAS() { return getToken(JuliaParser.TYPE_ALIAS, 0); }

		public TerminalNode ID() { return getToken(JuliaParser.ID, 0); }

		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
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

	public static class BitsTtypeContext extends TypeDeclarationContext {
		public BitsTtypeContext(TypeDeclarationContext ctx) { copyFrom(ctx); }

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

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}

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

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
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

		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
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