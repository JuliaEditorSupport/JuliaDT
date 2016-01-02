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
			AT = 1, DOT = 2, SEMI_COLON = 3, EQUALS = 4, EQ = 5, DOUBLE_ARROW = 6, ADD_ASGN = 7,
			SUB_ASGN = 8, TIMES_ASGN = 9, DIVIDE_ASGN = 10, INV_DIVIDE_ASGN = 11, REMAINDER_ASGN = 12,
			REM = 13, POWER_ASGN = 14, BITWISE_AND_ASGN = 15, BITWISE_OR_ASGN = 16, BITWISE_XOR_ASGN = 17,
			LSR_ASGN = 18, ASR_ASGN = 19, ELLIPSE = 20, ASL_ASGN = 21, QUESTION_MARK = 22, WHILE = 23,
			BEGIN = 24, RETURN = 25, IN = 26, IF = 27, ELSE_IF = 28, ELSE = 29, FOR = 30, CONST = 31,
			INCLUDE = 32, USING = 33, IMPORT = 34, COLON = 35, COMMA = 36, IMPORT_ALL = 37, EXPORT = 38,
			MODULE = 39, END = 40, BAREMODULE = 41, INF16 = 42, INF32 = 43, INF = 44, MINUS_INF16 = 45,
			MINUS_INF32 = 46, MINUS_INF = 47, NAN16 = 48, NAN32 = 49, NAN = 50, MINUS = 51, INSTANCE_OF = 52,
			EXPONENT = 53, FRACTION = 54, TIMES = 55, DIVIDE = 56, PLUS = 57, NOT_EQUAL = 58,
			GREATER_THAN = 59, LESS_THAN = 60, GREATER_THAN_OR_EQ = 61, LESS_THAN_OR_EQ = 62,
			NOT = 63, AND = 64, OR = 65, LEFT_BRACKET = 66, RIGHT_BRACKET = 67, TRUE = 68, FALSE = 69,
			ABSTRACT = 70, SUB_TYPE = 71, BITS_TYPE = 72, TYPE_ALIAS = 73, TYPE = 74, IMMUTABLE = 75,
			UNION = 76, FUNCTION = 77, LEFT_CURLY = 78, RIGHT_CURLY = 79, LEFT_SQUARE = 80,
			RIGHT_SQUARE = 81, INT8 = 82, UINT8 = 83, INT16 = 84, UINT16 = 85, INT32 = 86, UINT32 = 87,
			INT64 = 88, UINT64 = 89, INT128 = 90, UINT128 = 91, BOOL = 92, CHAR = 93, FLOAT16 = 94,
			FLOAT32 = 95, FLOAT64 = 96, REGEX = 97, INT = 98, BINARY = 99, OCTAL = 100, HEX = 101,
			FLOAT32_LITERAL = 102, EXP32 = 103, FLOAT64_LITERAL = 104, EXP64 = 105, ID = 106,
			CHARACTER_LITERAL = 107, STRING = 108, WS = 109, COMMENT = 110, LINE_COMMENT = 111,
			SIZE = 112;
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
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3r\u027a\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3" +
					"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
					"\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16" +
					"\4F\13\4\3\4\3\4\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\3\4\3\4\3\4\6\4T\n\4\r" +
					"\4\16\4U\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\5\5q\n\5\3\5\6\5t\n\5\r\5" +
					"\16\5u\3\5\3\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\5\3\5\7\5\u0084\n\5" +
					"\f\5\16\5\u0087\13\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\7\5" +
					"\u0091\n\5\f\5\16\5\u0094\13\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13" +
					"\5\5\5\u009d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a7\n\5\3\5\3\5" +
					"\3\5\3\5\7\5\u00ad\n\5\f\5\16\5\u00b0\13\5\3\5\5\5\u00b3\n\5\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\7\5\u00bc\n\5\f\5\16\5\u00bf\13\5\3\5\5\5\u00c2\n\5" +
					"\3\5\6\5\u00c5\n\5\r\5\16\5\u00c6\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5" +
					"\u00d1\n\5\r\5\16\5\u00d2\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ec\n\5\f\5\16" +
					"\5\u00ef\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f8\n\5\f\5\16\5\u00fb" +
					"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0118\n\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3" +
					"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\3\5\3\5\7\5\u018b\n\5\f\5\16\5\u018e\13\5\3\6\3\6\5\6\u0192" +
					"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u019b\n\6\3\6\3\6\6\6\u019f\n\6\r" +
					"\6\16\6\u01a0\3\6\3\6\5\6\u01a5\n\6\3\7\3\7\3\7\3\7\7\7\u01ab\n\7\f\7" +
					"\16\7\u01ae\13\7\5\7\u01b0\n\7\3\7\5\7\u01b3\n\7\3\7\3\7\3\b\3\b\3\b\3" +
					"\b\3\b\3\b\5\b\u01bd\n\b\3\t\3\t\3\t\5\t\u01c2\n\t\3\t\3\t\3\t\3\t\3\t" +
					"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d6\n\t\3\t" +
					"\3\t\3\t\5\t\u01db\n\t\3\t\7\t\u01de\n\t\f\t\16\t\u01e1\13\t\3\t\7\t\u01e4" +
					"\n\t\f\t\16\t\u01e7\13\t\3\t\3\t\3\t\3\t\5\t\u01ed\n\t\3\t\7\t\u01f0\n" +
					"\t\f\t\16\t\u01f3\13\t\3\t\7\t\u01f6\n\t\f\t\16\t\u01f9\13\t\3\t\3\t\3" +
					"\t\3\t\5\t\u01ff\n\t\3\t\7\t\u0202\n\t\f\t\16\t\u0205\13\t\3\t\7\t\u0208" +
					"\n\t\f\t\16\t\u020b\13\t\3\t\3\t\3\t\3\t\5\t\u0211\n\t\3\t\3\t\3\t\5\t" +
					"\u0216\n\t\3\t\7\t\u0219\n\t\f\t\16\t\u021c\13\t\3\t\7\t\u021f\n\t\f\t" +
					"\16\t\u0222\13\t\3\t\5\t\u0225\n\t\3\n\3\n\3\n\3\n\5\n\u022b\n\n\3\13" +
					"\3\13\3\13\3\13\7\13\u0231\n\13\f\13\16\13\u0234\13\13\3\13\3\13\3\f\3" +
					"\f\3\f\3\f\3\f\3\f\5\f\u023e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0247" +
					"\n\r\r\r\16\r\u0248\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0256" +
					"\n\r\r\r\16\r\u0257\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0261\n\r\r\r\16\r" +
					"\u0262\3\r\3\r\5\r\u0267\n\r\3\16\3\16\3\16\6\16\u026c\n\16\r\16\16\16" +
					"\u026d\3\16\3\16\3\17\3\17\3\17\7\17\u0275\n\17\f\17\16\17\u0278\13\17" +
					"\3\17\2\3\b\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\4\2abdd\u0312\2" +
					" \3\2\2\2\4)\3\2\2\2\6Y\3\2\2\2\b\u0117\3\2\2\2\n\u01a4\3\2\2\2\f\u01a6" +
					"\3\2\2\2\16\u01bc\3\2\2\2\20\u0224\3\2\2\2\22\u022a\3\2\2\2\24\u022c\3" +
					"\2\2\2\26\u023d\3\2\2\2\30\u0266\3\2\2\2\32\u0268\3\2\2\2\34\u0271\3\2" +
					"\2\2\36!\5\6\4\2\37!\5\4\3\2 \36\3\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2" +
					"\2\2\"#\3\2\2\2#\3\3\2\2\2$*\5\20\t\2%*\5\30\r\2&*\5\32\16\2\'*\5\n\6" +
					"\2(*\5\b\5\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2" +
					"\2\2+,\7\"\2\2,-\7D\2\2-.\7n\2\2.Z\7E\2\2/\60\7#\2\2\60Z\7l\2\2\61\62" +
					"\7$\2\2\62\63\7l\2\2\63\64\7%\2\2\649\7l\2\2\65\66\7&\2\2\668\7l\2\2\67" +
					"\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:Z\3\2\2\2;9\3\2\2\2<=\7\'" +
					"\2\2=Z\7l\2\2>?\7(\2\2?D\7l\2\2@A\7&\2\2AC\7l\2\2B@\3\2\2\2CF\3\2\2\2" +
					"DB\3\2\2\2DE\3\2\2\2EZ\3\2\2\2FD\3\2\2\2GH\7)\2\2HJ\7l\2\2IK\5\4\3\2J" +
					"I\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7*\2\2OZ\3\2\2\2P" +
					"Q\7+\2\2QS\7l\2\2RT\5\4\3\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW" +
					"\3\2\2\2WX\7*\2\2XZ\3\2\2\2Y+\3\2\2\2Y/\3\2\2\2Y\61\3\2\2\2Y<\3\2\2\2" +
					"Y>\3\2\2\2YG\3\2\2\2YP\3\2\2\2Z\7\3\2\2\2[\\\b\5\1\2\\]\7\65\2\2]\u0118" +
					"\5\b\5]^_\7A\2\2_\u0118\5\b\5K`a\7!\2\2ab\7l\2\2bc\7\7\2\2c\u0118\5\b" +
					"\5\17de\7\33\2\2e\u0118\5\b\5\5fl\7R\2\2gh\5\b\5\2hi\7&\2\2ik\3\2\2\2" +
					"jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\b\5\2" +
					"po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7S\2\2sf\3\2\2\2tu\3\2\2\2us\3\2\2\2" +
					"uv\3\2\2\2v\u0118\3\2\2\2w}\t\2\2\2x~\7l\2\2yz\7D\2\2z{\5\b\5\2{|\7E\2" +
					"\2|~\3\2\2\2}x\3\2\2\2}y\3\2\2\2~\u0118\3\2\2\2\177\u0118\7*\2\2\u0080" +
					"\u0081\7\35\2\2\u0081\u0085\5\b\5\2\u0082\u0084\5\4\3\2\u0083\u0082\3" +
					"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086" +
					"\u0092\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\36\2\2\u0089\u008d\5" +
					"\b\5\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d" +
					"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2" +
					"\2\2\u0090\u0088\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092" +
					"\u0093\3\2\2\2\u0093\u009c\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7\37" +
					"\2\2\u0096\u0098\5\4\3\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099" +
					"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2" +
					"\2\2\u009c\u0095\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e" +
					"\u009f\7*\2\2\u009f\u0118\3\2\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a2\5\b" +
					"\5\2\u00a2\u00a3\7*\2\2\u00a3\u0118\3\2\2\2\u00a4\u00a6\5\34\17\2\u00a5" +
					"\u00a7\5\24\13\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3" +
					"\2\2\2\u00a8\u00b2\7D\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7&\2\2\u00ab" +
					"\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2" +
					"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1" +
					"\u00b3\5\b\5\2\u00b2\u00ae\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2" +
					"\2\2\u00b4\u00b5\7E\2\2\u00b5\u0118\3\2\2\2\u00b6\u00c4\5\34\17\2\u00b7" +
					"\u00bd\7R\2\2\u00b8\u00b9\5\b\5\2\u00b9\u00ba\7&\2\2\u00ba\u00bc\3\2\2" +
					"\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be" +
					"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\5\b\5\2\u00c1" +
					"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\7S" +
					"\2\2\u00c4\u00b7\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6" +
					"\u00c7\3\2\2\2\u00c7\u0118\3\2\2\2\u00c8\u00c9\7D\2\2\u00c9\u00ca\5\b" +
					"\5\2\u00ca\u00cb\7E\2\2\u00cb\u0118\3\2\2\2\u00cc\u00d0\7D\2\2\u00cd\u00ce" +
					"\5\b\5\2\u00ce\u00cf\7&\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1" +
					"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2" +
					"\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\7E\2\2\u00d6\u0118\3\2\2\2\u00d7" +
					"\u0118\7T\2\2\u00d8\u0118\7U\2\2\u00d9\u0118\7V\2\2\u00da\u0118\7W\2\2" +
					"\u00db\u0118\7X\2\2\u00dc\u0118\7Y\2\2\u00dd\u0118\7Z\2\2\u00de\u0118" +
					"\7[\2\2\u00df\u0118\7\\\2\2\u00e0\u0118\7]\2\2\u00e1\u0118\7^\2\2\u00e2" +
					"\u0118\7_\2\2\u00e3\u0118\7`\2\2\u00e4\u0118\7a\2\2\u00e5\u0118\7b\2\2" +
					"\u00e6\u00e7\7N\2\2\u00e7\u00e8\7P\2\2\u00e8\u00ed\5\b\5\2\u00e9\u00ea" +
					"\7&\2\2\u00ea\u00ec\5\b\5\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed" +
					"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2" +
					"\2\2\u00f0\u00f1\7Q\2\2\u00f1\u0118\3\2\2\2\u00f2\u00f3\7l\2\2\u00f3\u00f4" +
					"\7P\2\2\u00f4\u00f9\5\b\5\2\u00f5\u00f6\7&\2\2\u00f6\u00f8\5\b\5\2\u00f7" +
					"\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2" +
					"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7Q\2\2\u00fd" +
					"\u0118\3\2\2\2\u00fe\u0118\5\34\17\2\u00ff\u0118\7l\2\2\u0100\u0118\7" +
					"c\2\2\u0101\u0118\7F\2\2\u0102\u0118\7G\2\2\u0103\u0118\7d\2\2\u0104\u0118" +
					"\7e\2\2\u0105\u0118\7f\2\2\u0106\u0118\7g\2\2\u0107\u0118\7h\2\2\u0108" +
					"\u0118\7j\2\2\u0109\u0118\7m\2\2\u010a\u0118\7n\2\2\u010b\u010c\7%\2\2" +
					"\u010c\u0118\7l\2\2\u010d\u0118\7,\2\2\u010e\u0118\7-\2\2\u010f\u0118" +
					"\7.\2\2\u0110\u0118\7/\2\2\u0111\u0118\7\60\2\2\u0112\u0118\7\61\2\2\u0113" +
					"\u0118\7\62\2\2\u0114\u0118\7\63\2\2\u0115\u0118\7\64\2\2\u0116\u0118" +
					"\7\33\2\2\u0117[\3\2\2\2\u0117^\3\2\2\2\u0117`\3\2\2\2\u0117d\3\2\2\2" +
					"\u0117s\3\2\2\2\u0117w\3\2\2\2\u0117\177\3\2\2\2\u0117\u0080\3\2\2\2\u0117" +
					"\u00a0\3\2\2\2\u0117\u00a4\3\2\2\2\u0117\u00b6\3\2\2\2\u0117\u00c8\3\2" +
					"\2\2\u0117\u00cc\3\2\2\2\u0117\u00d7\3\2\2\2\u0117\u00d8\3\2\2\2\u0117" +
					"\u00d9\3\2\2\2\u0117\u00da\3\2\2\2\u0117\u00db\3\2\2\2\u0117\u00dc\3\2" +
					"\2\2\u0117\u00dd\3\2\2\2\u0117\u00de\3\2\2\2\u0117\u00df\3\2\2\2\u0117" +
					"\u00e0\3\2\2\2\u0117\u00e1\3\2\2\2\u0117\u00e2\3\2\2\2\u0117\u00e3\3\2" +
					"\2\2\u0117\u00e4\3\2\2\2\u0117\u00e5\3\2\2\2\u0117\u00e6\3\2\2\2\u0117" +
					"\u00f2\3\2\2\2\u0117\u00fe\3\2\2\2\u0117\u00ff\3\2\2\2\u0117\u0100\3\2" +
					"\2\2\u0117\u0101\3\2\2\2\u0117\u0102\3\2\2\2\u0117\u0103\3\2\2\2\u0117" +
					"\u0104\3\2\2\2\u0117\u0105\3\2\2\2\u0117\u0106\3\2\2\2\u0117\u0107\3\2" +
					"\2\2\u0117\u0108\3\2\2\2\u0117\u0109\3\2\2\2\u0117\u010a\3\2\2\2\u0117" +
					"\u010b\3\2\2\2\u0117\u010d\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u010f\3\2" +
					"\2\2\u0117\u0110\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117" +
					"\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2" +
					"\2\2\u0118\u018c\3\2\2\2\u0119\u011a\fZ\2\2\u011a\u011b\7\66\2\2\u011b" +
					"\u018b\5\b\5[\u011c\u011d\fY\2\2\u011d\u011e\7\67\2\2\u011e\u018b\5\b" +
					"\5Y\u011f\u0120\fX\2\2\u0120\u0121\78\2\2\u0121\u018b\5\b\5Y\u0122\u0123" +
					"\fW\2\2\u0123\u0124\79\2\2\u0124\u018b\5\b\5X\u0125\u0126\fV\2\2\u0126" +
					"\u0127\7\17\2\2\u0127\u018b\5\b\5W\u0128\u0129\fU\2\2\u0129\u012a\7:\2" +
					"\2\u012a\u018b\5\b\5V\u012b\u012c\fT\2\2\u012c\u012d\7;\2\2\u012d\u018b" +
					"\5\b\5U\u012e\u012f\fS\2\2\u012f\u0130\7\65\2\2\u0130\u018b\5\b\5T\u0131" +
					"\u0132\fR\2\2\u0132\u0133\7=\2\2\u0133\u018b\5\b\5S\u0134\u0135\fQ\2\2" +
					"\u0135\u0136\7>\2\2\u0136\u018b\5\b\5R\u0137\u0138\fP\2\2\u0138\u0139" +
					"\7?\2\2\u0139\u018b\5\b\5Q\u013a\u013b\fO\2\2\u013b\u013c\7@\2\2\u013c" +
					"\u018b\5\b\5P\u013d\u013e\fN\2\2\u013e\u013f\7\6\2\2\u013f\u018b\5\b\5" +
					"O\u0140\u0141\fM\2\2\u0141\u0142\7I\2\2\u0142\u018b\5\b\5N\u0143\u0144" +
					"\fL\2\2\u0144\u0145\7\30\2\2\u0145\u0146\5\b\5\2\u0146\u0147\7%\2\2\u0147" +
					"\u0148\5\b\5M\u0148\u018b\3\2\2\2\u0149\u014a\fJ\2\2\u014a\u014b\7B\2" +
					"\2\u014b\u018b\5\b\5K\u014c\u014d\fI\2\2\u014d\u014e\7C\2\2\u014e\u018b" +
					"\5\b\5J\u014f\u0150\fA\2\2\u0150\u0151\7<\2\2\u0151\u018b\5\b\5B\u0152" +
					"\u0153\f@\2\2\u0153\u0154\7\7\2\2\u0154\u018b\5\b\5A\u0155\u0156\f?\2" +
					"\2\u0156\u0157\7\t\2\2\u0157\u018b\5\b\5@\u0158\u0159\f>\2\2\u0159\u015a" +
					"\7\n\2\2\u015a\u018b\5\b\5?\u015b\u015c\f=\2\2\u015c\u015d\7\13\2\2\u015d" +
					"\u018b\5\b\5>\u015e\u015f\f<\2\2\u015f\u0160\7\f\2\2\u0160\u018b\5\b\5" +
					"=\u0161\u0162\f;\2\2\u0162\u0163\7\r\2\2\u0163\u018b\5\b\5<\u0164\u0165" +
					"\f:\2\2\u0165\u0166\7\16\2\2\u0166\u018b\5\b\5;\u0167\u0168\f9\2\2\u0168" +
					"\u0169\7\20\2\2\u0169\u018b\5\b\5:\u016a\u016b\f8\2\2\u016b\u016c\7\21" +
					"\2\2\u016c\u018b\5\b\59\u016d\u016e\f\67\2\2\u016e\u016f\7\22\2\2\u016f" +
					"\u018b\5\b\58\u0170\u0171\f\66\2\2\u0171\u0172\7\23\2\2\u0172\u018b\5" +
					"\b\5\67\u0173\u0174\f\65\2\2\u0174\u0175\7\24\2\2\u0175\u018b\5\b\5\66" +
					"\u0176\u0177\f\64\2\2\u0177\u0178\7\25\2\2\u0178\u018b\5\b\5\65\u0179" +
					"\u017a\f\63\2\2\u017a\u017b\7\27\2\2\u017b\u018b\5\b\5\64\u017c\u017d" +
					"\f\62\2\2\u017d\u017e\7\b\2\2\u017e\u018b\5\b\5\63\u017f\u0180\f\37\2" +
					"\2\u0180\u0181\7%\2\2\u0181\u018b\5\b\5 \u0182\u0183\f\36\2\2\u0183\u0184" +
					"\7\5\2\2\u0184\u018b\5\b\5\36\u0185\u0186\f\3\2\2\u0186\u0187\7&\2\2\u0187" +
					"\u018b\5\b\5\4\u0188\u0189\f\61\2\2\u0189\u018b\7\26\2\2\u018a\u0119\3" +
					"\2\2\2\u018a\u011c\3\2\2\2\u018a\u011f\3\2\2\2\u018a\u0122\3\2\2\2\u018a" +
					"\u0125\3\2\2\2\u018a\u0128\3\2\2\2\u018a\u012b\3\2\2\2\u018a\u012e\3\2" +
					"\2\2\u018a\u0131\3\2\2\2\u018a\u0134\3\2\2\2\u018a\u0137\3\2\2\2\u018a" +
					"\u013a\3\2\2\2\u018a\u013d\3\2\2\2\u018a\u0140\3\2\2\2\u018a\u0143\3\2" +
					"\2\2\u018a\u0149\3\2\2\2\u018a\u014c\3\2\2\2\u018a\u014f\3\2\2\2\u018a" +
					"\u0152\3\2\2\2\u018a\u0155\3\2\2\2\u018a\u0158\3\2\2\2\u018a\u015b\3\2" +
					"\2\2\u018a\u015e\3\2\2\2\u018a\u0161\3\2\2\2\u018a\u0164\3\2\2\2\u018a" +
					"\u0167\3\2\2\2\u018a\u016a\3\2\2\2\u018a\u016d\3\2\2\2\u018a\u0170\3\2" +
					"\2\2\u018a\u0173\3\2\2\2\u018a\u0176\3\2\2\2\u018a\u0179\3\2\2\2\u018a" +
					"\u017c\3\2\2\2\u018a\u017f\3\2\2\2\u018a\u0182\3\2\2\2\u018a\u0185\3\2" +
					"\2\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c" +
					"\u018d\3\2\2\2\u018d\t\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\5\34\17" +
					"\2\u0190\u0192\5\24\13\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192" +
					"\u0193\3\2\2\2\u0193\u0194\5\f\7\2\u0194\u0195\7\7\2\2\u0195\u0196\5\4" +
					"\3\2\u0196\u01a5\3\2\2\2\u0197\u0198\7O\2\2\u0198\u019a\5\34\17\2\u0199" +
					"\u019b\5\24\13\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3" +
					"\2\2\2\u019c\u019e\5\f\7\2\u019d\u019f\5\4\3\2\u019e\u019d\3\2\2\2\u019f" +
					"\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2" +
					"\2\2\u01a2\u01a3\7*\2\2\u01a3\u01a5\3\2\2\2\u01a4\u018f\3\2\2\2\u01a4" +
					"\u0197\3\2\2\2\u01a5\13\3\2\2\2\u01a6\u01af\7D\2\2\u01a7\u01ac\5\16\b" +
					"\2\u01a8\u01a9\7&\2\2\u01a9\u01ab\5\16\b\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae" +
					"\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae" +
					"\u01ac\3\2\2\2\u01af\u01a7\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2" +
					"\2\2\u01b1\u01b3\7\26\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3" +
					"\u01b4\3\2\2\2\u01b4\u01b5\7E\2\2\u01b5\r\3\2\2\2\u01b6\u01b7\7l\2\2\u01b7" +
					"\u01b8\7\66\2\2\u01b8\u01bd\5\b\5\2\u01b9\u01ba\7\66\2\2\u01ba\u01bd\5" +
					"\b\5\2\u01bb\u01bd\7l\2\2\u01bc\u01b6\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bc" +
					"\u01bb\3\2\2\2\u01bd\17\3\2\2\2\u01be\u01bf\7K\2\2\u01bf\u01c1\7l\2\2" +
					"\u01c0\u01c2\5\24\13\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3" +
					"\3\2\2\2\u01c3\u0225\5\b\5\2\u01c4\u01c5\7H\2\2\u01c5\u01c6\7l\2\2\u01c6" +
					"\u01c7\7I\2\2\u01c7\u0225\7l\2\2\u01c8\u01c9\7H\2\2\u01c9\u0225\7l\2\2" +
					"\u01ca\u01cb\7J\2\2\u01cb\u01cc\7r\2\2\u01cc\u01cd\7l\2\2\u01cd\u01ce" +
					"\7I\2\2\u01ce\u0225\7l\2\2\u01cf\u01d0\7J\2\2\u01d0\u01d1\7r\2\2\u01d1" +
					"\u0225\7l\2\2\u01d2\u01d3\7L\2\2\u01d3\u01d5\7l\2\2\u01d4\u01d6\5\24\13" +
					"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8" +
					"\7I\2\2\u01d8\u01da\7l\2\2\u01d9\u01db\5\24\13\2\u01da\u01d9\3\2\2\2\u01da" +
					"\u01db\3\2\2\2\u01db\u01df\3\2\2\2\u01dc\u01de\5\22\n\2\u01dd\u01dc\3" +
					"\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0" +
					"\u01e5\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e4\5\n\6\2\u01e3\u01e2\3\2" +
					"\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6" +
					"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u0225\7*\2\2\u01e9\u01ea\7L\2" +
					"\2\u01ea\u01ec\7l\2\2\u01eb\u01ed\5\24\13\2\u01ec\u01eb\3\2\2\2\u01ec" +
					"\u01ed\3\2\2\2\u01ed\u01f1\3\2\2\2\u01ee\u01f0\5\22\n\2\u01ef\u01ee\3" +
					"\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2" +
					"\u01f7\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\5\n\6\2\u01f5\u01f4\3\2" +
					"\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8" +
					"\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u0225\7*\2\2\u01fb\u01fc\7M\2" +
					"\2\u01fc\u01fe\7l\2\2\u01fd\u01ff\5\24\13\2\u01fe\u01fd\3\2\2\2\u01fe" +
					"\u01ff\3\2\2\2\u01ff\u0203\3\2\2\2\u0200\u0202\5\22\n\2\u0201\u0200\3" +
					"\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204" +
					"\u0209\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0208\5\n\6\2\u0207\u0206\3\2" +
					"\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a" +
					"\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u0225\7*\2\2\u020d\u020e\7M\2" +
					"\2\u020e\u0210\7l\2\2\u020f\u0211\5\24\13\2\u0210\u020f\3\2\2\2\u0210" +
					"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7I\2\2\u0213\u0215\7l\2" +
					"\2\u0214\u0216\5\24\13\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216" +
					"\u021a\3\2\2\2\u0217\u0219\5\22\n\2\u0218\u0217\3\2\2\2\u0219\u021c\3" +
					"\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0220\3\2\2\2\u021c" +
					"\u021a\3\2\2\2\u021d\u021f\5\n\6\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2" +
					"\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222" +
					"\u0220\3\2\2\2\u0223\u0225\7*\2\2\u0224\u01be\3\2\2\2\u0224\u01c4\3\2" +
					"\2\2\u0224\u01c8\3\2\2\2\u0224\u01ca\3\2\2\2\u0224\u01cf\3\2\2\2\u0224" +
					"\u01d2\3\2\2\2\u0224\u01e9\3\2\2\2\u0224\u01fb\3\2\2\2\u0224\u020d\3\2" +
					"\2\2\u0225\21\3\2\2\2\u0226\u0227\7l\2\2\u0227\u0228\7\66\2\2\u0228\u022b" +
					"\5\b\5\2\u0229\u022b\7l\2\2\u022a\u0226\3\2\2\2\u022a\u0229\3\2\2\2\u022b" +
					"\23\3\2\2\2\u022c\u022d\7P\2\2\u022d\u0232\5\26\f\2\u022e\u022f\7&\2\2" +
					"\u022f\u0231\5\26\f\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230" +
					"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235" +
					"\u0236\7Q\2\2\u0236\25\3\2\2\2\u0237\u0238\7l\2\2\u0238\u0239\7I\2\2\u0239" +
					"\u023e\5\b\5\2\u023a\u023b\7\66\2\2\u023b\u023e\5\b\5\2\u023c\u023e\5" +
					"\b\5\2\u023d\u0237\3\2\2\2\u023d\u023a\3\2\2\2\u023d\u023c\3\2\2\2\u023e" +
					"\27\3\2\2\2\u023f\u0240\7 \2\2\u0240\u0241\5\b\5\2\u0241\u0242\7\7\2\2" +
					"\u0242\u0243\5\b\5\2\u0243\u0244\7%\2\2\u0244\u0246\5\b\5\2\u0245\u0247" +
					"\5\4\3\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248" +
					"\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7*\2\2\u024b\u0267\3\2" +
					"\2\2\u024c\u024d\7 \2\2\u024d\u024e\5\b\5\2\u024e\u024f\7\7\2\2\u024f" +
					"\u0250\5\b\5\2\u0250\u0251\7%\2\2\u0251\u0252\5\b\5\2\u0252\u0253\7%\2" +
					"\2\u0253\u0255\5\b\5\2\u0254\u0256\5\4\3\2\u0255\u0254\3\2\2\2\u0256\u0257" +
					"\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259" +
					"\u025a\7*\2\2\u025a\u0267\3\2\2\2\u025b\u025c\7 \2\2\u025c\u025d\5\b\5" +
					"\2\u025d\u025e\7\34\2\2\u025e\u0260\5\b\5\2\u025f\u0261\5\4\3\2\u0260" +
					"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2" +
					"\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7*\2\2\u0265\u0267\3\2\2\2\u0266" +
					"\u023f\3\2\2\2\u0266\u024c\3\2\2\2\u0266\u025b\3\2\2\2\u0267\31\3\2\2" +
					"\2\u0268\u0269\7\31\2\2\u0269\u026b\5\b\5\2\u026a\u026c\5\4\3\2\u026b" +
					"\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2" +
					"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7*\2\2\u0270\33\3\2\2\2\u0271\u0276" +
					"\7l\2\2\u0272\u0273\7\4\2\2\u0273\u0275\7l\2\2\u0274\u0272\3\2\2\2\u0275" +
					"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\35\3\2\2" +
					"\2\u0278\u0276\3\2\2\2@ \")9DLUYlpu}\u0085\u008d\u0092\u0099\u009c\u00a6" +
					"\u00ae\u00b2\u00bd\u00c1\u00c6\u00d2\u00ed\u00f9\u0117\u018a\u018c\u0191" +
					"\u019a\u01a0\u01a4\u01ac\u01af\u01b2\u01bc\u01c1\u01d5\u01da\u01df\u01e5" +
					"\u01ec\u01f1\u01f7\u01fe\u0203\u0209\u0210\u0215\u021a\u0220\u0224\u022a" +
					"\u0232\u023d\u0248\u0257\u0262\u0266\u026d\u0276";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "'@'", "'.'", "';'", "'=='", "'='", "'=>'", "'+='", "'-='", "'*='",
			"'/='", "'\\='", "'%='", "'%'", "'^='", "'&='", "'|='", "'$='", "'>>>='",
			"'>>='", "'...'", "'<<='", "'?'", "'while'", "'begin'", "'return'", "'in'",
			"'if'", "'elseif'", "'else'", "'for'", "'const'", "'include'", "'using'",
			"'import'", "':'", "','", "'importall'", "'export'", "'module'", "'end'",
			"'baremodule'", "'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'",
			"'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'-'", "'::'", "'^'", "'//'",
			"'*'", "'/'", "'+'", null, "'>'", "'<'", "'>='", null, "'!'", "'&&'",
			"'||'", "'('", "')'", "'true'", "'false'", "'abstract'", "'<:'", "'bitstype'",
			"'typealias'", "'type'", "'immutable'", "'Union'", "'function'", "'{'",
			"'}'", "'['", "']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'", "'Int32'",
			"'Uint32'", "'Int64'", "'Uint64'", "'Int128'", "'Uint128'", "'Bool'",
			"'Char'", "'Float16'", "'Float32'", "'Float64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, "AT", "DOT", "SEMI_COLON", "EQUALS", "EQ", "DOUBLE_ARROW", "ADD_ASGN",
			"SUB_ASGN", "TIMES_ASGN", "DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN",
			"REM", "POWER_ASGN", "BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN",
			"LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE",
			"BEGIN", "RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "INCLUDE",
			"USING", "IMPORT", "COLON", "COMMA", "IMPORT_ALL", "EXPORT", "MODULE",
			"END", "BAREMODULE", "INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32",
			"MINUS_INF", "NAN16", "NAN32", "NAN", "MINUS", "INSTANCE_OF", "EXPONENT",
			"FRACTION", "TIMES", "DIVIDE", "PLUS", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN",
			"GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ", "NOT", "AND", "OR", "LEFT_BRACKET",
			"RIGHT_BRACKET", "TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE",
			"TYPE_ALIAS", "TYPE", "IMMUTABLE", "UNION", "FUNCTION", "LEFT_CURLY",
			"RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE", "INT8", "UINT8", "INT16",
			"UINT16", "INT32", "UINT32", "INT64", "UINT64", "INT128", "UINT128", "BOOL",
			"CHAR", "FLOAT16", "FLOAT32", "FLOAT64", "REGEX", "INT", "BINARY", "OCTAL",
			"HEX", "FLOAT32_LITERAL", "EXP32", "FLOAT64_LITERAL", "EXP64", "ID", "CHARACTER_LITERAL",
			"STRING", "WS", "COMMENT", "LINE_COMMENT", "SIZE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
	}

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
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String getGrammarFileName() {
		return "JuliaParser.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
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
							case INCLUDE:
							case USING:
							case IMPORT:
							case IMPORT_ALL:
							case EXPORT:
							case MODULE:
							case BAREMODULE: {
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
							case STRING: {
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
				}
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << END) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (ABSTRACT - 66)) | (1L << (BITS_TYPE - 66)) | (1L << (TYPE_ALIAS - 66)) | (1L << (TYPE - 66)) | (1L << (IMMUTABLE - 66)) | (1L << (UNION - 66)) | (1L << (FUNCTION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0));
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(39);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
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
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
		ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleDirective);
		int _la;
		try {
			int _alt;
			setState(87);
			switch (_input.LA(1)) {
				case INCLUDE:
					_localctx = new IncludeContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(41);
					match(INCLUDE);
					setState(42);
					match(LEFT_BRACKET);
					setState(43);
					match(STRING);
					setState(44);
					match(RIGHT_BRACKET);
				}
				break;
				case USING:
					_localctx = new UsingContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(45);
					match(USING);
					setState(46);
					match(ID);
				}
				break;
				case IMPORT:
					_localctx = new ImporttContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(47);
					match(IMPORT);
					setState(48);
					match(ID);
					setState(49);
					match(COLON);
					setState(50);
					match(ID);
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(51);
								match(COMMA);
								setState(52);
								match(ID);
							}
						}
						setState(57);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case IMPORT_ALL:
					_localctx = new ImportAllContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(58);
					match(IMPORT_ALL);
					setState(59);
					match(ID);
				}
				break;
				case EXPORT:
					_localctx = new ExportContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(60);
					match(EXPORT);
					setState(61);
					match(ID);
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(62);
								match(COMMA);
								setState(63);
								match(ID);
							}
						}
						setState(68);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case MODULE:
					_localctx = new ModuleDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(69);
					match(MODULE);
					setState(70);
					match(ID);
					setState(72);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(71);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(74);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(76);
					match(END);
				}
				break;
				case BAREMODULE:
					_localctx = new BareModuleDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(78);
					match(BAREMODULE);
					setState(79);
					match(ID);
					setState(81);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(80);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(83);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(85);
					match(END);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
				setState(277);
				switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
					case 1: {
						_localctx = new UnaryMinusContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;

						setState(90);
						match(MINUS);
						setState(91);
						exp(91);
					}
					break;
					case 2: {
						_localctx = new NotContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(92);
						match(NOT);
						setState(93);
						exp(73);
					}
					break;
					case 3: {
						_localctx = new ConstantContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(94);
						match(CONST);
						setState(95);
						match(ID);
						setState(96);
						match(EQ);
						setState(97);
						exp(13);
					}
					break;
					case 4: {
						_localctx = new ReturnExpContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(98);
						match(RETURN);
						setState(99);
						exp(3);
					}
					break;
					case 5: {
						_localctx = new EnumerationContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(113);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
								case 1: {
									{
										setState(100);
										match(LEFT_SQUARE);
										setState(106);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
										while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
											if (_alt == 1) {
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
											_alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
										}
										setState(110);
										_la = _input.LA(1);
										if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (UNION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
											{
												setState(109);
												exp(0);
											}
										}

										setState(112);
										match(RIGHT_SQUARE);
									}
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
							setState(115);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
						} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					}
					break;
					case 6: {
						_localctx = new CoeffientContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(117);
						_la = _input.LA(1);
						if (!(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (FLOAT32 - 95)) | (1L << (FLOAT64 - 95)) | (1L << (INT - 95)))) != 0))) {
							_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(123);
						switch (_input.LA(1)) {
							case ID: {
								setState(118);
								match(ID);
							}
							break;
							case LEFT_BRACKET: {
								setState(119);
								match(LEFT_BRACKET);
								setState(120);
								exp(0);
								setState(121);
								match(RIGHT_BRACKET);
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
					}
					break;
					case 7: {
						_localctx = new EndContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(125);
						match(END);
					}
					break;
					case 8: {
						_localctx = new NaryConditionalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(126);
						match(IF);
						setState(127);
						exp(0);
						setState(131);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
						while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
							if (_alt == 1) {
								{
									{
										setState(128);
										statement();
									}
								}
							}
							setState(133);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
						}
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == ELSE_IF) {
							{
								{
									setState(134);
									match(ELSE_IF);
									setState(135);
									exp(0);
									setState(139);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
									while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
										if (_alt == 1) {
											{
												{
													setState(136);
													statement();
												}
											}
										}
										setState(141);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
									}
								}
							}
							setState(146);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(154);
						_la = _input.LA(1);
						if (_la == ELSE) {
							{
								setState(147);
								match(ELSE);
								setState(151);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
								while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
									if (_alt == 1) {
										{
											{
												setState(148);
												statement();
											}
										}
									}
									setState(153);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
								}
							}
						}

						setState(156);
						match(END);
					}
					break;
					case 9: {
						_localctx = new BlockContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(158);
						match(BEGIN);
						setState(159);
						exp(0);
						setState(160);
						match(END);
					}
					break;
					case 10: {
						_localctx = new ApplyFunctionContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(162);
						name();
						setState(164);
						_la = _input.LA(1);
						if (_la == LEFT_CURLY) {
							{
								setState(163);
								typeParameters();
							}
						}

						setState(166);
						match(LEFT_BRACKET);
						setState(176);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (UNION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
							{
								setState(172);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
								while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
									if (_alt == 1) {
										{
											{
												setState(167);
												exp(0);
												setState(168);
												match(COMMA);
											}
										}
									}
									setState(174);
									_errHandler.sync(this);
									_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
								}
								setState(175);
								exp(0);
							}
						}

						setState(178);
						match(RIGHT_BRACKET);
					}
					break;
					case 11: {
						_localctx = new ArrayIndexContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(180);
						name();
						setState(194);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
								case 1: {
									{
										setState(181);
										match(LEFT_SQUARE);
										setState(187);
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
										while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
											if (_alt == 1) {
												{
													{
														setState(182);
														exp(0);
														setState(183);
														match(COMMA);
													}
												}
											}
											setState(189);
											_errHandler.sync(this);
											_alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
										}
										setState(191);
										_la = _input.LA(1);
										if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << RETURN) | (1L << IF) | (1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LEFT_BRACKET - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (UNION - 66)) | (1L << (LEFT_SQUARE - 66)) | (1L << (INT8 - 66)) | (1L << (UINT8 - 66)) | (1L << (INT16 - 66)) | (1L << (UINT16 - 66)) | (1L << (INT32 - 66)) | (1L << (UINT32 - 66)) | (1L << (INT64 - 66)) | (1L << (UINT64 - 66)) | (1L << (INT128 - 66)) | (1L << (UINT128 - 66)) | (1L << (BOOL - 66)) | (1L << (CHAR - 66)) | (1L << (FLOAT16 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (REGEX - 66)) | (1L << (INT - 66)) | (1L << (BINARY - 66)) | (1L << (OCTAL - 66)) | (1L << (HEX - 66)) | (1L << (FLOAT32_LITERAL - 66)) | (1L << (FLOAT64_LITERAL - 66)) | (1L << (ID - 66)) | (1L << (CHARACTER_LITERAL - 66)) | (1L << (STRING - 66)))) != 0)) {
											{
												setState(190);
												exp(0);
											}
										}

										setState(193);
										match(RIGHT_SQUARE);
									}
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
							setState(196);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
						} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					}
					break;
					case 12: {
						_localctx = new BracketedContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(198);
						match(LEFT_BRACKET);
						setState(199);
						exp(0);
						setState(200);
						match(RIGHT_BRACKET);
					}
					break;
					case 13: {
						_localctx = new TupleContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(202);
						match(LEFT_BRACKET);
						setState(206);
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
								case 1: {
									{
										setState(203);
										exp(0);
										setState(204);
										match(COMMA);
									}
								}
								break;
								default:
									throw new NoViableAltException(this);
							}
							setState(208);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
						} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
						setState(210);
						exp(0);
						setState(211);
						match(RIGHT_BRACKET);
					}
					break;
					case 14: {
						_localctx = new Int8Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(213);
						match(INT8);
					}
					break;
					case 15: {
						_localctx = new Uint8Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(214);
						match(UINT8);
					}
					break;
					case 16: {
						_localctx = new Int16Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(215);
						match(INT16);
					}
					break;
					case 17: {
						_localctx = new Uint16Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(216);
						match(UINT16);
					}
					break;
					case 18: {
						_localctx = new Int32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(217);
						match(INT32);
					}
					break;
					case 19: {
						_localctx = new Uint32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(218);
						match(UINT32);
					}
					break;
					case 20: {
						_localctx = new Int64Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(219);
						match(INT64);
					}
					break;
					case 21: {
						_localctx = new Uint64Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(220);
						match(UINT64);
					}
					break;
					case 22: {
						_localctx = new Int128Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(221);
						match(INT128);
					}
					break;
					case 23: {
						_localctx = new Uint128Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(222);
						match(UINT128);
					}
					break;
					case 24: {
						_localctx = new BoolContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(223);
						match(BOOL);
					}
					break;
					case 25: {
						_localctx = new CharContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(224);
						match(CHAR);
					}
					break;
					case 26: {
						_localctx = new Float16Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(225);
						match(FLOAT16);
					}
					break;
					case 27: {
						_localctx = new Float32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(226);
						match(FLOAT32);
					}
					break;
					case 28: {
						_localctx = new Float64Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(227);
						match(FLOAT64);
					}
					break;
					case 29: {
						_localctx = new UnionTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(228);
						match(UNION);
						setState(229);
						match(LEFT_CURLY);
						setState(230);
						exp(0);
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(231);
									match(COMMA);
									setState(232);
									exp(0);
								}
							}
							setState(237);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(238);
						match(RIGHT_CURLY);
					}
					break;
					case 30: {
						_localctx = new ParametricTypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(240);
						match(ID);
						setState(241);
						match(LEFT_CURLY);
						setState(242);
						exp(0);
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(243);
									match(COMMA);
									setState(244);
									exp(0);
								}
							}
							setState(249);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(250);
						match(RIGHT_CURLY);
					}
					break;
					case 31: {
						_localctx = new QualifiedNameContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(252);
						name();
					}
					break;
					case 32: {
						_localctx = new IdentifierContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(253);
						match(ID);
					}
					break;
					case 33: {
						_localctx = new RegexContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(254);
						match(REGEX);
					}
					break;
					case 34: {
						_localctx = new TtContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(255);
						match(TRUE);
					}
					break;
					case 35: {
						_localctx = new FfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(256);
						match(FALSE);
					}
					break;
					case 36: {
						_localctx = new IntContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(257);
						match(INT);
					}
					break;
					case 37: {
						_localctx = new BinaryContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(258);
						match(BINARY);
					}
					break;
					case 38: {
						_localctx = new OctalContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(259);
						match(OCTAL);
					}
					break;
					case 39: {
						_localctx = new HexContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(260);
						match(HEX);
					}
					break;
					case 40: {
						_localctx = new Ffloat32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(261);
						match(FLOAT32_LITERAL);
					}
					break;
					case 41: {
						_localctx = new Ffloat64Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(262);
						match(FLOAT64_LITERAL);
					}
					break;
					case 42: {
						_localctx = new CharaacterContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(263);
						match(CHARACTER_LITERAL);
					}
					break;
					case 43: {
						_localctx = new StringContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(264);
						match(STRING);
					}
					break;
					case 44: {
						_localctx = new SymbolContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(265);
						match(COLON);
						setState(266);
						match(ID);
					}
					break;
					case 45: {
						_localctx = new Inf16TypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(267);
						match(INF16);
					}
					break;
					case 46: {
						_localctx = new Inf32TypeContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(268);
						match(INF32);
					}
					break;
					case 47: {
						_localctx = new InfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(269);
						match(INF);
					}
					break;
					case 48: {
						_localctx = new MinusInf16Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(270);
						match(MINUS_INF16);
					}
					break;
					case 49: {
						_localctx = new MinusInf32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(271);
						match(MINUS_INF32);
					}
					break;
					case 50: {
						_localctx = new MinusInfContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(272);
						match(MINUS_INF);
					}
					break;
					case 51: {
						_localctx = new Nan16Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(273);
						match(NAN16);
					}
					break;
					case 52: {
						_localctx = new Nan32Context(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(274);
						match(NAN32);
					}
					break;
					case 53: {
						_localctx = new NanContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(275);
						match(NAN);
					}
					break;
					case 54: {
						_localctx = new ReturnContext(_localctx);
						_ctx = _localctx;
						_prevctx = _localctx;
						setState(276);
						match(RETURN);
					}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null) triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(392);
							switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
								case 1: {
									_localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(279);
									if (!(precpred(_ctx, 88)))
										throw new FailedPredicateException(this, "precpred(_ctx, 88)");
									setState(280);
									match(INSTANCE_OF);
									setState(281);
									exp(89);
								}
								break;
								case 2: {
									_localctx = new ExponentContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(282);
									if (!(precpred(_ctx, 87)))
										throw new FailedPredicateException(this, "precpred(_ctx, 87)");
									setState(283);
									match(EXPONENT);
									setState(284);
									exp(87);
								}
								break;
								case 3: {
									_localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(285);
									if (!(precpred(_ctx, 86)))
										throw new FailedPredicateException(this, "precpred(_ctx, 86)");
									setState(286);
									match(FRACTION);
									setState(287);
									exp(87);
								}
								break;
								case 4: {
									_localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(288);
									if (!(precpred(_ctx, 85)))
										throw new FailedPredicateException(this, "precpred(_ctx, 85)");
									setState(289);
									match(TIMES);
									setState(290);
									exp(86);
								}
								break;
								case 5: {
									_localctx = new RemainderContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(291);
									if (!(precpred(_ctx, 84)))
										throw new FailedPredicateException(this, "precpred(_ctx, 84)");
									setState(292);
									match(REM);
									setState(293);
									exp(85);
								}
								break;
								case 6: {
									_localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(294);
									if (!(precpred(_ctx, 83)))
										throw new FailedPredicateException(this, "precpred(_ctx, 83)");
									setState(295);
									match(DIVIDE);
									setState(296);
									exp(84);
								}
								break;
								case 7: {
									_localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(297);
									if (!(precpred(_ctx, 82)))
										throw new FailedPredicateException(this, "precpred(_ctx, 82)");
									setState(298);
									match(PLUS);
									setState(299);
									exp(83);
								}
								break;
								case 8: {
									_localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(300);
									if (!(precpred(_ctx, 81)))
										throw new FailedPredicateException(this, "precpred(_ctx, 81)");
									setState(301);
									match(MINUS);
									setState(302);
									exp(82);
								}
								break;
								case 9: {
									_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(303);
									if (!(precpred(_ctx, 80)))
										throw new FailedPredicateException(this, "precpred(_ctx, 80)");
									setState(304);
									match(GREATER_THAN);
									setState(305);
									exp(81);
								}
								break;
								case 10: {
									_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(306);
									if (!(precpred(_ctx, 79)))
										throw new FailedPredicateException(this, "precpred(_ctx, 79)");
									setState(307);
									match(LESS_THAN);
									setState(308);
									exp(80);
								}
								break;
								case 11: {
									_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(309);
									if (!(precpred(_ctx, 78)))
										throw new FailedPredicateException(this, "precpred(_ctx, 78)");
									setState(310);
									match(GREATER_THAN_OR_EQ);
									setState(311);
									exp(79);
								}
								break;
								case 12: {
									_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(312);
									if (!(precpred(_ctx, 77)))
										throw new FailedPredicateException(this, "precpred(_ctx, 77)");
									setState(313);
									match(LESS_THAN_OR_EQ);
									setState(314);
									exp(78);
								}
								break;
								case 13: {
									_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(315);
									if (!(precpred(_ctx, 76)))
										throw new FailedPredicateException(this, "precpred(_ctx, 76)");
									setState(316);
									match(EQUALS);
									setState(317);
									exp(77);
								}
								break;
								case 14: {
									_localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(318);
									if (!(precpred(_ctx, 75)))
										throw new FailedPredicateException(this, "precpred(_ctx, 75)");
									setState(319);
									match(SUB_TYPE);
									setState(320);
									exp(76);
								}
								break;
								case 15: {
									_localctx = new TernaryConditionalContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(321);
									if (!(precpred(_ctx, 74)))
										throw new FailedPredicateException(this, "precpred(_ctx, 74)");
									setState(322);
									match(QUESTION_MARK);
									setState(323);
									exp(0);
									setState(324);
									match(COLON);
									setState(325);
									exp(75);
								}
								break;
								case 16: {
									_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(327);
									if (!(precpred(_ctx, 72)))
										throw new FailedPredicateException(this, "precpred(_ctx, 72)");
									setState(328);
									match(AND);
									setState(329);
									exp(73);
								}
								break;
								case 17: {
									_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(330);
									if (!(precpred(_ctx, 71)))
										throw new FailedPredicateException(this, "precpred(_ctx, 71)");
									setState(331);
									match(OR);
									setState(332);
									exp(72);
								}
								break;
								case 18: {
									_localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(333);
									if (!(precpred(_ctx, 63)))
										throw new FailedPredicateException(this, "precpred(_ctx, 63)");
									setState(334);
									match(NOT_EQUAL);
									setState(335);
									exp(64);
								}
								break;
								case 19: {
									_localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(336);
									if (!(precpred(_ctx, 62)))
										throw new FailedPredicateException(this, "precpred(_ctx, 62)");
									setState(337);
									match(EQ);
									setState(338);
									exp(63);
								}
								break;
								case 20: {
									_localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(339);
									if (!(precpred(_ctx, 61)))
										throw new FailedPredicateException(this, "precpred(_ctx, 61)");
									setState(340);
									match(ADD_ASGN);
									setState(341);
									exp(62);
								}
								break;
								case 21: {
									_localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(342);
									if (!(precpred(_ctx, 60)))
										throw new FailedPredicateException(this, "precpred(_ctx, 60)");
									setState(343);
									match(SUB_ASGN);
									setState(344);
									exp(61);
								}
								break;
								case 22: {
									_localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(345);
									if (!(precpred(_ctx, 59)))
										throw new FailedPredicateException(this, "precpred(_ctx, 59)");
									setState(346);
									match(TIMES_ASGN);
									setState(347);
									exp(60);
								}
								break;
								case 23: {
									_localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(348);
									if (!(precpred(_ctx, 58)))
										throw new FailedPredicateException(this, "precpred(_ctx, 58)");
									setState(349);
									match(DIVIDE_ASGN);
									setState(350);
									exp(59);
								}
								break;
								case 24: {
									_localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(351);
									if (!(precpred(_ctx, 57)))
										throw new FailedPredicateException(this, "precpred(_ctx, 57)");
									setState(352);
									match(INV_DIVIDE_ASGN);
									setState(353);
									exp(58);
								}
								break;
								case 25: {
									_localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(354);
									if (!(precpred(_ctx, 56)))
										throw new FailedPredicateException(this, "precpred(_ctx, 56)");
									setState(355);
									match(REMAINDER_ASGN);
									setState(356);
									exp(57);
								}
								break;
								case 26: {
									_localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(357);
									if (!(precpred(_ctx, 55)))
										throw new FailedPredicateException(this, "precpred(_ctx, 55)");
									setState(358);
									match(POWER_ASGN);
									setState(359);
									exp(56);
								}
								break;
								case 27: {
									_localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(360);
									if (!(precpred(_ctx, 54)))
										throw new FailedPredicateException(this, "precpred(_ctx, 54)");
									setState(361);
									match(BITWISE_AND_ASGN);
									setState(362);
									exp(55);
								}
								break;
								case 28: {
									_localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(363);
									if (!(precpred(_ctx, 53)))
										throw new FailedPredicateException(this, "precpred(_ctx, 53)");
									setState(364);
									match(BITWISE_OR_ASGN);
									setState(365);
									exp(54);
								}
								break;
								case 29: {
									_localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(366);
									if (!(precpred(_ctx, 52)))
										throw new FailedPredicateException(this, "precpred(_ctx, 52)");
									setState(367);
									match(BITWISE_XOR_ASGN);
									setState(368);
									exp(53);
								}
								break;
								case 30: {
									_localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(369);
									if (!(precpred(_ctx, 51)))
										throw new FailedPredicateException(this, "precpred(_ctx, 51)");
									setState(370);
									match(LSR_ASGN);
									setState(371);
									exp(52);
								}
								break;
								case 31: {
									_localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(372);
									if (!(precpred(_ctx, 50)))
										throw new FailedPredicateException(this, "precpred(_ctx, 50)");
									setState(373);
									match(ASR_ASGN);
									setState(374);
									exp(51);
								}
								break;
								case 32: {
									_localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(375);
									if (!(precpred(_ctx, 49)))
										throw new FailedPredicateException(this, "precpred(_ctx, 49)");
									setState(376);
									match(ASL_ASGN);
									setState(377);
									exp(50);
								}
								break;
								case 33: {
									_localctx = new PairContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(378);
									if (!(precpred(_ctx, 48)))
										throw new FailedPredicateException(this, "precpred(_ctx, 48)");
									setState(379);
									match(DOUBLE_ARROW);
									setState(380);
									exp(49);
								}
								break;
								case 34: {
									_localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(381);
									if (!(precpred(_ctx, 29)))
										throw new FailedPredicateException(this, "precpred(_ctx, 29)");
									setState(382);
									match(COLON);
									setState(383);
									exp(30);
								}
								break;
								case 35: {
									_localctx = new ChainContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(384);
									if (!(precpred(_ctx, 28)))
										throw new FailedPredicateException(this, "precpred(_ctx, 28)");
									setState(385);
									match(SEMI_COLON);
									setState(386);
									exp(28);
								}
								break;
								case 36: {
									_localctx = new ImplicitTupleContext(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(387);
									if (!(precpred(_ctx, 1)))
										throw new FailedPredicateException(this, "precpred(_ctx, 1)");
									setState(388);
									match(COMMA);
									setState(389);
									exp(2);
								}
								break;
								case 37: {
									_localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
									pushNewRecursionContext(_localctx, _startState, RULE_exp);
									setState(390);
									if (!(precpred(_ctx, 47)))
										throw new FailedPredicateException(this, "precpred(_ctx, 47)");
									setState(391);
									match(ELLIPSE);
								}
								break;
							}
						}
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			setState(418);
			switch (_input.LA(1)) {
				case ID:
					_localctx = new CompactFunctionDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(397);
					name();
					setState(399);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(398);
							typeParameters();
						}
					}

					setState(401);
					parameters();
					setState(402);
					match(EQ);
					setState(403);
					statement();
				}
				break;
				case FUNCTION:
					_localctx = new GeneralFunctionDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(405);
					match(FUNCTION);
					setState(406);
					name();
					setState(408);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(407);
							typeParameters();
						}
					}

					setState(410);
					parameters();
					setState(412);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(411);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(414);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(416);
					match(END);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
				setState(420);
				match(LEFT_BRACKET);
				setState(429);
				_la = _input.LA(1);
				if (_la == INSTANCE_OF || _la == ID) {
					{
						setState(421);
						parameter();
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(422);
									match(COMMA);
									setState(423);
									parameter();
								}
							}
							setState(428);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(432);
				_la = _input.LA(1);
				if (_la == ELLIPSE) {
					{
						setState(431);
						match(ELLIPSE);
					}
				}

				setState(434);
				match(RIGHT_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(442);
			switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
				case 1:
					_localctx = new NamedTypedParamContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(436);
					match(ID);
					setState(437);
					match(INSTANCE_OF);
					setState(438);
					exp(0);
				}
				break;
				case 2:
					_localctx = new AnonymousTypedParamContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(439);
					match(INSTANCE_OF);
					setState(440);
					exp(0);
				}
				break;
				case 3:
					_localctx = new NamedParamContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(441);
					match(ID);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
			setState(546);
			switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
				case 1:
					_localctx = new TypeAliasContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(444);
					match(TYPE_ALIAS);
					setState(445);
					match(ID);
					setState(447);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(446);
							typeParameters();
						}
					}

					setState(449);
					exp(0);
				}
				break;
				case 2:
					_localctx = new AbstractSubtypeContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(450);
					match(ABSTRACT);
					setState(451);
					match(ID);
					setState(452);
					match(SUB_TYPE);
					setState(453);
					match(ID);
				}
				break;
				case 3:
					_localctx = new AbstractTypeContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(454);
					match(ABSTRACT);
					setState(455);
					match(ID);
				}
				break;
				case 4:
					_localctx = new BitsSubtypeContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(456);
					match(BITS_TYPE);
					setState(457);
					match(SIZE);
					setState(458);
					match(ID);
					setState(459);
					match(SUB_TYPE);
					setState(460);
					match(ID);
				}
				break;
				case 5:
					_localctx = new BitsTtypeContext(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(461);
					match(BITS_TYPE);
					setState(462);
					match(SIZE);
					setState(463);
					match(ID);
				}
				break;
				case 6:
					_localctx = new SubTypeDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(464);
					match(TYPE);
					setState(465);
					match(ID);
					setState(467);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(466);
							typeParameters();
						}
					}

					setState(469);
					match(SUB_TYPE);
					setState(470);
					match(ID);
					setState(472);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(471);
							typeParameters();
						}
					}

					setState(477);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(474);
									fieldDeclaration();
								}
							}
						}
						setState(479);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FUNCTION || _la == ID) {
						{
							{
								setState(480);
								functionDeclaration();
							}
						}
						setState(485);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(486);
					match(END);
				}
				break;
				case 7:
					_localctx = new TypeDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(487);
					match(TYPE);
					setState(488);
					match(ID);
					setState(490);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(489);
							typeParameters();
						}
					}

					setState(495);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(492);
									fieldDeclaration();
								}
							}
						}
						setState(497);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FUNCTION || _la == ID) {
						{
							{
								setState(498);
								functionDeclaration();
							}
						}
						setState(503);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(504);
					match(END);
				}
				break;
				case 8:
					_localctx = new ImmutableTypeDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(505);
					match(IMMUTABLE);
					setState(506);
					match(ID);
					setState(508);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(507);
							typeParameters();
						}
					}

					setState(513);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(510);
									fieldDeclaration();
								}
							}
						}
						setState(515);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FUNCTION || _la == ID) {
						{
							{
								setState(516);
								functionDeclaration();
							}
						}
						setState(521);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(522);
					match(END);
				}
				break;
				case 9:
					_localctx = new ImmutableSubTypeDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(523);
					match(IMMUTABLE);
					setState(524);
					match(ID);
					setState(526);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(525);
							typeParameters();
						}
					}

					setState(528);
					match(SUB_TYPE);
					setState(529);
					match(ID);
					setState(531);
					_la = _input.LA(1);
					if (_la == LEFT_CURLY) {
						{
							setState(530);
							typeParameters();
						}
					}

					setState(536);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
					while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(533);
									fieldDeclaration();
								}
							}
						}
						setState(538);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 50, _ctx);
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == FUNCTION || _la == ID) {
						{
							{
								setState(539);
								functionDeclaration();
							}
						}
						setState(544);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(545);
					match(END);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		try {
			setState(552);
			switch (getInterpreter().adaptivePredict(_input, 53, _ctx)) {
				case 1:
					_localctx = new TypedFieldDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(548);
					match(ID);
					setState(549);
					match(INSTANCE_OF);
					setState(550);
					exp(0);
				}
				break;
				case 2:
					_localctx = new UntypedFieldDeclarationContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(551);
					match(ID);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
				setState(554);
				match(LEFT_CURLY);
				setState(555);
				typeParameter();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(556);
							match(COMMA);
							setState(557);
							typeParameter();
						}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
				match(RIGHT_CURLY);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		try {
			setState(571);
			switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
				case 1:
					_localctx = new NamedSubtypeContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(565);
					match(ID);
					setState(566);
					match(SUB_TYPE);
					setState(567);
					exp(0);
				}
				break;
				case 2:
					_localctx = new InstanceContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(568);
					match(INSTANCE_OF);
					setState(569);
					exp(0);
				}
				break;
				case 3:
					_localctx = new ExpressionContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(570);
					exp(0);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		try {
			int _alt;
			setState(612);
			switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
				case 1:
					_localctx = new ForEqContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(573);
					match(FOR);
					setState(574);
					exp(0);
					setState(575);
					match(EQ);
					setState(576);
					exp(0);
					setState(577);
					match(COLON);
					setState(578);
					exp(0);
					setState(580);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(579);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(582);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(584);
					match(END);
				}
				break;
				case 2:
					_localctx = new ForEqStepContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(586);
					match(FOR);
					setState(587);
					exp(0);
					setState(588);
					match(EQ);
					setState(589);
					exp(0);
					setState(590);
					match(COLON);
					setState(591);
					exp(0);
					setState(592);
					match(COLON);
					setState(593);
					exp(0);
					setState(595);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(594);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(597);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(599);
					match(END);
				}
				break;
				case 3:
					_localctx = new ForInContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(601);
					match(FOR);
					setState(602);
					exp(0);
					setState(603);
					match(IN);
					setState(604);
					exp(0);
					setState(606);
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
							case 1: {
								{
									setState(605);
									statement();
								}
							}
							break;
							default:
								throw new NoViableAltException(this);
						}
						setState(608);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 58, _ctx);
					} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
					setState(610);
					match(END);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(614);
				match(WHILE);
				setState(615);
				exp(0);
				setState(617);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
						case 1: {
							{
								setState(616);
								statement();
							}
						}
						break;
						default:
							throw new NoViableAltException(this);
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
				} while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
				setState(621);
				match(END);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
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
				setState(623);
				match(ID);
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 61, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(624);
								match(DOT);
								setState(625);
								match(ID);
							}
						}
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 61, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 3:
				return exp_sempred((ExpContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 88);
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
				return precpred(_ctx, 72);
			case 16:
				return precpred(_ctx, 71);
			case 17:
				return precpred(_ctx, 63);
			case 18:
				return precpred(_ctx, 62);
			case 19:
				return precpred(_ctx, 61);
			case 20:
				return precpred(_ctx, 60);
			case 21:
				return precpred(_ctx, 59);
			case 22:
				return precpred(_ctx, 58);
			case 23:
				return precpred(_ctx, 57);
			case 24:
				return precpred(_ctx, 56);
			case 25:
				return precpred(_ctx, 55);
			case 26:
				return precpred(_ctx, 54);
			case 27:
				return precpred(_ctx, 53);
			case 28:
				return precpred(_ctx, 52);
			case 29:
				return precpred(_ctx, 51);
			case 30:
				return precpred(_ctx, 50);
			case 31:
				return precpred(_ctx, 49);
			case 32:
				return precpred(_ctx, 48);
			case 33:
				return precpred(_ctx, 29);
			case 34:
				return precpred(_ctx, 28);
			case 35:
				return precpred(_ctx, 1);
			case 36:
				return precpred(_ctx, 47);
		}
		return true;
	}

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<ModuleDirectiveContext> moduleDirective() {
			return getRuleContexts(ModuleDirectiveContext.class);
		}

		public ModuleDirectiveContext moduleDirective(int i) {
			return getRuleContext(ModuleDirectiveContext.class, i);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unit;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUnit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUnit(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class, 0);
		}

		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class, 0);
		}

		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class, 0);
		}

		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_statement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ModuleDirectiveContext extends ParserRuleContext {
		public ModuleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ModuleDirectiveContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_moduleDirective;
		}

		public void copyFrom(ModuleDirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class IncludeContext extends ModuleDirectiveContext {
		public IncludeContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INCLUDE() {
			return getToken(JuliaParser.INCLUDE, 0);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public TerminalNode STRING() {
			return getToken(JuliaParser.STRING, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInclude(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInclude(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UsingContext extends ModuleDirectiveContext {
		public UsingContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode USING() {
			return getToken(JuliaParser.USING, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUsing(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUsing(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ImporttContext extends ModuleDirectiveContext {
		public ImporttContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IMPORT() {
			return getToken(JuliaParser.IMPORT, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode COLON() {
			return getToken(JuliaParser.COLON, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterImportt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitImportt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitImportt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BareModuleDeclarationContext extends ModuleDirectiveContext {
		public BareModuleDeclarationContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BAREMODULE() {
			return getToken(JuliaParser.BAREMODULE, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterBareModuleDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitBareModuleDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBareModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ImportAllContext extends ModuleDirectiveContext {
		public ImportAllContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IMPORT_ALL() {
			return getToken(JuliaParser.IMPORT_ALL, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterImportAll(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitImportAll(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitImportAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExportContext extends ModuleDirectiveContext {
		public ExportContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode EXPORT() {
			return getToken(JuliaParser.EXPORT, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterExport(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitExport(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ModuleDeclarationContext extends ModuleDirectiveContext {
		public ModuleDeclarationContext(ModuleDirectiveContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode MODULE() {
			return getToken(JuliaParser.MODULE, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterModuleDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitModuleDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ExpContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_exp;
		}

		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class TtContext extends ExpContext {
		public TtContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode TRUE() {
			return getToken(JuliaParser.TRUE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor) return ((JuliaParserVisitor<? extends T>) visitor).visitTt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class OctalContext extends ExpContext {
		public OctalContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode OCTAL() {
			return getToken(JuliaParser.OCTAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterOctal(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitOctal(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitOctal(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SymbolContext extends ExpContext {
		public SymbolContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode COLON() {
			return getToken(JuliaParser.COLON, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterSymbol(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitSymbol(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Nan32Context extends ExpContext {
		public Nan32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NAN32() {
			return getToken(JuliaParser.NAN32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNan32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNan32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNan32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConstantContext extends ExpContext {
		public ConstantContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode CONST() {
			return getToken(JuliaParser.CONST, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode EQ() {
			return getToken(JuliaParser.EQ, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterConstant(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitConstant(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TernaryConditionalContext extends ExpContext {
		public TernaryConditionalContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode QUESTION_MARK() {
			return getToken(JuliaParser.QUESTION_MARK, 0);
		}

		public TerminalNode COLON() {
			return getToken(JuliaParser.COLON, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTernaryConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTernaryConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTernaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ApplyFunctionContext extends ExpContext {
		public ApplyFunctionContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterApplyFunction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitApplyFunction(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitApplyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BitwiseXorAssignContext extends ExpContext {
		public BitwiseXorAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode BITWISE_XOR_ASGN() {
			return getToken(JuliaParser.BITWISE_XOR_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBitwiseXorAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBitwiseXorAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBitwiseXorAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ReturnExpContext extends ExpContext {
		public ReturnExpContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode RETURN() {
			return getToken(JuliaParser.RETURN, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterReturnExp(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitReturnExp(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LSRAssignContext extends ExpContext {
		public LSRAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode LSR_ASGN() {
			return getToken(JuliaParser.LSR_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterLSRAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitLSRAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitLSRAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CoeffientContext extends ExpContext {
		public CoeffientContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT() {
			return getToken(JuliaParser.INT, 0);
		}

		public TerminalNode FLOAT32() {
			return getToken(JuliaParser.FLOAT32, 0);
		}

		public TerminalNode FLOAT64() {
			return getToken(JuliaParser.FLOAT64, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterCoeffient(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitCoeffient(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitCoeffient(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InvDivexpeAssignContext extends ExpContext {
		public InvDivexpeAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode INV_DIVIDE_ASGN() {
			return getToken(JuliaParser.INV_DIVIDE_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInvDivexpeAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInvDivexpeAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInvDivexpeAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Int64Context extends ExpContext {
		public Int64Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT64() {
			return getToken(JuliaParser.INT64, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt64(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt64(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt64(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Int8Context extends ExpContext {
		public Int8Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT8() {
			return getToken(JuliaParser.INT8, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt8(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt8(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt8(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Int128Context extends ExpContext {
		public Int128Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT128() {
			return getToken(JuliaParser.INT128, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt128(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt128(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt128(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DivexpeAssignContext extends ExpContext {
		public DivexpeAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode DIVIDE_ASGN() {
			return getToken(JuliaParser.DIVIDE_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterDivexpeAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitDivexpeAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitDivexpeAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BlockContext extends ExpContext {
		public BlockContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BEGIN() {
			return getToken(JuliaParser.BEGIN, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBlock(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class HexContext extends ExpContext {
		public HexContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode HEX() {
			return getToken(JuliaParser.HEX, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterHex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitHex(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NanContext extends ExpContext {
		public NanContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NAN() {
			return getToken(JuliaParser.NAN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNan(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNan(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNan(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Uint32Context extends ExpContext {
		public Uint32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UINT32() {
			return getToken(JuliaParser.UINT32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUint32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUint32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUint32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EnumerationContext extends ExpContext {
		public EnumerationContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<TerminalNode> LEFT_SQUARE() {
			return getTokens(JuliaParser.LEFT_SQUARE);
		}

		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(JuliaParser.LEFT_SQUARE, i);
		}

		public List<TerminalNode> RIGHT_SQUARE() {
			return getTokens(JuliaParser.RIGHT_SQUARE);
		}

		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(JuliaParser.RIGHT_SQUARE, i);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterEnumeration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitEnumeration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Ffloat32Context extends ExpContext {
		public Ffloat32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT32_LITERAL() {
			return getToken(JuliaParser.FLOAT32_LITERAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFfloat32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFfloat32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFfloat32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExponentContext extends ExpContext {
		public ExponentContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EXPONENT() {
			return getToken(JuliaParser.EXPONENT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterExponent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitExponent(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitExponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GreaterThanContext extends ExpContext {
		public GreaterThanContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode GREATER_THAN() {
			return getToken(JuliaParser.GREATER_THAN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterGreaterThan(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitGreaterThan(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BitwiseAndAssignContext extends ExpContext {
		public BitwiseAndAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode BITWISE_AND_ASGN() {
			return getToken(JuliaParser.BITWISE_AND_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBitwiseAndAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBitwiseAndAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBitwiseAndAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdentifierContext extends ExpContext {
		public IdentifierContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterIdentifier(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitIdentifier(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Inf32TypeContext extends ExpContext {
		public Inf32TypeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INF32() {
			return getToken(JuliaParser.INF32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInf32Type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInf32Type(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInf32Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ImplicitTupleContext extends ExpContext {
		public ImplicitTupleContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode COMMA() {
			return getToken(JuliaParser.COMMA, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterImplicitTuple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitImplicitTuple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitImplicitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class QualifiedNameContext extends ExpContext {
		public QualifiedNameContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterQualifiedName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitQualifiedName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NotEqualContext extends ExpContext {
		public NotEqualContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode NOT_EQUAL() {
			return getToken(JuliaParser.NOT_EQUAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNotEqual(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNotEqual(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Tbc1Context extends ExpContext {
		public Tbc1Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TerminalNode ELLIPSE() {
			return getToken(JuliaParser.ELLIPSE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTbc1(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTbc1(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTbc1(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ASRAssignContext extends ExpContext {
		public ASRAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode ASR_ASGN() {
			return getToken(JuliaParser.ASR_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterASRAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitASRAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitASRAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class PlusContext extends ExpContext {
		public PlusContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode PLUS() {
			return getToken(JuliaParser.PLUS, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterPlus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitPlus(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Int16Context extends ExpContext {
		public Int16Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT16() {
			return getToken(JuliaParser.INT16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt16(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt16(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt16(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GreaterThanOrEqualContext extends ExpContext {
		public GreaterThanOrEqualContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode GREATER_THAN_OR_EQ() {
			return getToken(JuliaParser.GREATER_THAN_OR_EQ, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterGreaterThanOrEqual(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitGreaterThanOrEqual(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BitwiseOrAssignContext extends ExpContext {
		public BitwiseOrAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode BITWISE_OR_ASGN() {
			return getToken(JuliaParser.BITWISE_OR_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBitwiseOrAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBitwiseOrAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBitwiseOrAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RegexContext extends ExpContext {
		public RegexContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode REGEX() {
			return getToken(JuliaParser.REGEX, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterRegex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitRegex(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Uint128Context extends ExpContext {
		public Uint128Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UINT128() {
			return getToken(JuliaParser.UINT128, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUint128(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUint128(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUint128(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusInf32Context extends ExpContext {
		public MinusInf32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode MINUS_INF32() {
			return getToken(JuliaParser.MINUS_INF32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterMinusInf32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitMinusInf32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitMinusInf32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BinaryContext extends ExpContext {
		public BinaryContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BINARY() {
			return getToken(JuliaParser.BINARY, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBinary(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBinary(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LessThanOrEqualContext extends ExpContext {
		public LessThanOrEqualContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode LESS_THAN_OR_EQ() {
			return getToken(JuliaParser.LESS_THAN_OR_EQ, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterLessThanOrEqual(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitLessThanOrEqual(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ASLAssignContext extends ExpContext {
		public ASLAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode ASL_ASGN() {
			return getToken(JuliaParser.ASL_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterASLAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitASLAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitASLAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnaryMinusContext extends ExpContext {
		public UnaryMinusContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode MINUS() {
			return getToken(JuliaParser.MINUS, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUnaryMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUnaryMinus(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AddAssignContext extends ExpContext {
		public AddAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode ADD_ASGN() {
			return getToken(JuliaParser.ADD_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterAddAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAddAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAddAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Uint64Context extends ExpContext {
		public Uint64Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UINT64() {
			return getToken(JuliaParser.UINT64, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUint64(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUint64(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUint64(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Nan16Context extends ExpContext {
		public Nan16Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NAN16() {
			return getToken(JuliaParser.NAN16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNan16(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNan16(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNan16(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Uint8Context extends ExpContext {
		public Uint8Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UINT8() {
			return getToken(JuliaParser.UINT8, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUint8(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUint8(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUint8(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class UnionTypeContext extends ExpContext {
		public UnionTypeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UNION() {
			return getToken(JuliaParser.UNION, 0);
		}

		public TerminalNode LEFT_CURLY() {
			return getToken(JuliaParser.LEFT_CURLY, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode RIGHT_CURLY() {
			return getToken(JuliaParser.RIGHT_CURLY, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUnionType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUnionType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUnionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FfContext extends ExpContext {
		public FfContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FALSE() {
			return getToken(JuliaParser.FALSE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFf(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor) return ((JuliaParserVisitor<? extends T>) visitor).visitFf(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusContext extends ExpContext {
		public MinusContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode MINUS() {
			return getToken(JuliaParser.MINUS, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterMinus(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitMinus(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CharaacterContext extends ExpContext {
		public CharaacterContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode CHARACTER_LITERAL() {
			return getToken(JuliaParser.CHARACTER_LITERAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterCharaacter(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitCharaacter(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitCharaacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BoolContext extends ExpContext {
		public BoolContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BOOL() {
			return getToken(JuliaParser.BOOL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBool(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBool(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class StringContext extends ExpContext {
		public StringContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode STRING() {
			return getToken(JuliaParser.STRING, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitString(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TimesAssignContext extends ExpContext {
		public TimesAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode TIMES_ASGN() {
			return getToken(JuliaParser.TIMES_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTimesAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTimesAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTimesAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RangeContext extends ExpContext {
		public RangeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode COLON() {
			return getToken(JuliaParser.COLON, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterRange(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitRange(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Float64Context extends ExpContext {
		public Float64Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT64() {
			return getToken(JuliaParser.FLOAT64, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFloat64(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFloat64(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFloat64(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusAssignContext extends ExpContext {
		public MinusAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode SUB_ASGN() {
			return getToken(JuliaParser.SUB_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterMinusAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitMinusAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitMinusAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RemainderAssignContext extends ExpContext {
		public RemainderAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode REMAINDER_ASGN() {
			return getToken(JuliaParser.REMAINDER_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterRemainderAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitRemainderAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitRemainderAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Float16Context extends ExpContext {
		public Float16Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT16() {
			return getToken(JuliaParser.FLOAT16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFloat16(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFloat16(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFloat16(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TupleContext extends ExpContext {
		public TupleContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTuple(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTuple(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NotContext extends ExpContext {
		public NotContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NOT() {
			return getToken(JuliaParser.NOT, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNot(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNot(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TimesContext extends ExpContext {
		public TimesContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode TIMES() {
			return getToken(JuliaParser.TIMES, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTimes(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTimes(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SubtypeContext extends ExpContext {
		public SubtypeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterSubtype(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitSubtype(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AndContext extends ExpContext {
		public AndContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode AND() {
			return getToken(JuliaParser.AND, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterAnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class LessThanContext extends ExpContext {
		public LessThanContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode LESS_THAN() {
			return getToken(JuliaParser.LESS_THAN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterLessThan(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitLessThan(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EndContext extends ExpContext {
		public EndContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterEnd(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitEnd(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DivideContext extends ExpContext {
		public DivideContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode DIVIDE() {
			return getToken(JuliaParser.DIVIDE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterDivide(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitDivide(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class PowerAssignContext extends ExpContext {
		public PowerAssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode POWER_ASGN() {
			return getToken(JuliaParser.POWER_ASGN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterPowerAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitPowerAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitPowerAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Uint16Context extends ExpContext {
		public Uint16Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode UINT16() {
			return getToken(JuliaParser.UINT16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUint16(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUint16(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUint16(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InfContext extends ExpContext {
		public InfContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INF() {
			return getToken(JuliaParser.INF, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInf(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInf(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NaryConditionalContext extends ExpContext {
		public NaryConditionalContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IF() {
			return getToken(JuliaParser.IF, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		public List<TerminalNode> ELSE_IF() {
			return getTokens(JuliaParser.ELSE_IF);
		}

		public TerminalNode ELSE_IF(int i) {
			return getToken(JuliaParser.ELSE_IF, i);
		}

		public TerminalNode ELSE() {
			return getToken(JuliaParser.ELSE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNaryConditional(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNaryConditional(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNaryConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ChainContext extends ExpContext {
		public ChainContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode SEMI_COLON() {
			return getToken(JuliaParser.SEMI_COLON, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterChain(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitChain(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class OrContext extends ExpContext {
		public OrContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode OR() {
			return getToken(JuliaParser.OR, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterOr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitOr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor) return ((JuliaParserVisitor<? extends T>) visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParametricTypeContext extends ExpContext {
		public ParametricTypeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode LEFT_CURLY() {
			return getToken(JuliaParser.LEFT_CURLY, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode RIGHT_CURLY() {
			return getToken(JuliaParser.RIGHT_CURLY, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterParametricType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitParametricType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitParametricType(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Float32Context extends ExpContext {
		public Float32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT32() {
			return getToken(JuliaParser.FLOAT32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFloat32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFloat32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFloat32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Inf16TypeContext extends ExpContext {
		public Inf16TypeContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INF16() {
			return getToken(JuliaParser.INF16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInf16Type(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInf16Type(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInf16Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IntContext extends ExpContext {
		public IntContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT() {
			return getToken(JuliaParser.INT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypedExpressionContext extends ExpContext {
		public TypedExpressionContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode INSTANCE_OF() {
			return getToken(JuliaParser.INSTANCE_OF, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypedExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypedExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTypedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class PairContext extends ExpContext {
		public PairContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode DOUBLE_ARROW() {
			return getToken(JuliaParser.DOUBLE_ARROW, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterPair(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitPair(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FractionContext extends ExpContext {
		public FractionContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode FRACTION() {
			return getToken(JuliaParser.FRACTION, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFraction(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFraction(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusInf16Context extends ExpContext {
		public MinusInf16Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode MINUS_INF16() {
			return getToken(JuliaParser.MINUS_INF16, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterMinusInf16(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitMinusInf16(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitMinusInf16(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Int32Context extends ExpContext {
		public Int32Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INT32() {
			return getToken(JuliaParser.INT32, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInt32(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInt32(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInt32(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EqualsContext extends ExpContext {
		public EqualsContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQUALS() {
			return getToken(JuliaParser.EQUALS, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterEquals(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitEquals(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CharContext extends ExpContext {
		public CharContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode CHAR() {
			return getToken(JuliaParser.CHAR, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterChar(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitChar(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class MinusInfContext extends ExpContext {
		public MinusInfContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode MINUS_INF() {
			return getToken(JuliaParser.MINUS_INF, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterMinusInf(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitMinusInf(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitMinusInf(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ArrayIndexContext extends ExpContext {
		public ArrayIndexContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public List<TerminalNode> LEFT_SQUARE() {
			return getTokens(JuliaParser.LEFT_SQUARE);
		}

		public TerminalNode LEFT_SQUARE(int i) {
			return getToken(JuliaParser.LEFT_SQUARE, i);
		}

		public List<TerminalNode> RIGHT_SQUARE() {
			return getTokens(JuliaParser.RIGHT_SQUARE);
		}

		public TerminalNode RIGHT_SQUARE(int i) {
			return getToken(JuliaParser.RIGHT_SQUARE, i);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterArrayIndex(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitArrayIndex(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Ffloat64Context extends ExpContext {
		public Ffloat64Context(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FLOAT64_LITERAL() {
			return getToken(JuliaParser.FLOAT64_LITERAL, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFfloat64(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFfloat64(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitFfloat64(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class RemainderContext extends ExpContext {
		public RemainderContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode REM() {
			return getToken(JuliaParser.REM, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterRemainder(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitRemainder(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitRemainder(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ReturnContext extends ExpContext {
		public ReturnContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode RETURN() {
			return getToken(JuliaParser.RETURN, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterReturn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitReturn(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BracketedContext extends ExpContext {
		public BracketedContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBracketed(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBracketed(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBracketed(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AssignContext extends ExpContext {
		public AssignContext(ExpContext ctx) {
			copyFrom(ctx);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() {
			return getToken(JuliaParser.EQ, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAssign(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public FunctionDeclarationContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_functionDeclaration;
		}

		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class CompactFunctionDeclarationContext extends FunctionDeclarationContext {
		public CompactFunctionDeclarationContext(FunctionDeclarationContext ctx) {
			copyFrom(ctx);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class, 0);
		}

		public TerminalNode EQ() {
			return getToken(JuliaParser.EQ, 0);
		}

		public StatementContext statement() {
			return getRuleContext(StatementContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterCompactFunctionDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitCompactFunctionDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitCompactFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GeneralFunctionDeclarationContext extends FunctionDeclarationContext {
		public GeneralFunctionDeclarationContext(FunctionDeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FUNCTION() {
			return getToken(JuliaParser.FUNCTION, 0);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

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
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterGeneralFunctionDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitGeneralFunctionDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitGeneralFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ParametersContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameters;
		}

		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class PparametersContext extends ParametersContext {
		public PparametersContext(ParametersContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LEFT_BRACKET() {
			return getToken(JuliaParser.LEFT_BRACKET, 0);
		}

		public TerminalNode RIGHT_BRACKET() {
			return getToken(JuliaParser.RIGHT_BRACKET, 0);
		}

		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}

		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class, i);
		}

		public TerminalNode ELLIPSE() {
			return getToken(JuliaParser.ELLIPSE, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterPparameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitPparameters(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitPparameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ParameterContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_parameter;
		}

		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NamedTypedParamContext extends ParameterContext {
		public NamedTypedParamContext(ParameterContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode INSTANCE_OF() {
			return getToken(JuliaParser.INSTANCE_OF, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNamedTypedParam(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNamedTypedParam(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNamedTypedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AnonymousTypedParamContext extends ParameterContext {
		public AnonymousTypedParamContext(ParameterContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INSTANCE_OF() {
			return getToken(JuliaParser.INSTANCE_OF, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterAnonymousTypedParam(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAnonymousTypedParam(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAnonymousTypedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NamedParamContext extends ParameterContext {
		public NamedParamContext(ParameterContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNamedParam(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNamedParam(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeDefinitionContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeDefinition;
		}

		public void copyFrom(TypeDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ImmutableTypeDeclarationContext extends TypeDefinitionContext {
		public ImmutableTypeDeclarationContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IMMUTABLE() {
			return getToken(JuliaParser.IMMUTABLE, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

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
			return getRuleContext(FunctionDeclarationContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterImmutableTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitImmutableTypeDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitImmutableTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AbstractTypeContext extends TypeDefinitionContext {
		public AbstractTypeContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ABSTRACT() {
			return getToken(JuliaParser.ABSTRACT, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterAbstractType(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAbstractType(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAbstractType(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ImmutableSubTypeDeclarationContext extends TypeDefinitionContext {
		public ImmutableSubTypeDeclarationContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode IMMUTABLE() {
			return getToken(JuliaParser.IMMUTABLE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}

		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class, i);
		}

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
			return getRuleContext(FunctionDeclarationContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterImmutableSubTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitImmutableSubTypeDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitImmutableSubTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BitsSubtypeContext extends TypeDefinitionContext {
		public BitsSubtypeContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BITS_TYPE() {
			return getToken(JuliaParser.BITS_TYPE, 0);
		}

		public TerminalNode SIZE() {
			return getToken(JuliaParser.SIZE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBitsSubtype(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBitsSubtype(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBitsSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypeDeclarationContext extends TypeDefinitionContext {
		public TypeDeclarationContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode TYPE() {
			return getToken(JuliaParser.TYPE, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

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
			return getRuleContext(FunctionDeclarationContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypeAliasContext extends TypeDefinitionContext {
		public TypeAliasContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode TYPE_ALIAS() {
			return getToken(JuliaParser.TYPE_ALIAS, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeAlias(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeAlias(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class BitsTtypeContext extends TypeDefinitionContext {
		public BitsTtypeContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode BITS_TYPE() {
			return getToken(JuliaParser.BITS_TYPE, 0);
		}

		public TerminalNode SIZE() {
			return getToken(JuliaParser.SIZE, 0);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterBitsTtype(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitBitsTtype(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitBitsTtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AbstractSubtypeContext extends TypeDefinitionContext {
		public AbstractSubtypeContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ABSTRACT() {
			return getToken(JuliaParser.ABSTRACT, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterAbstractSubtype(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitAbstractSubtype(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitAbstractSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SubTypeDeclarationContext extends TypeDefinitionContext {
		public SubTypeDeclarationContext(TypeDefinitionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode TYPE() {
			return getToken(JuliaParser.TYPE, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<TypeParametersContext> typeParameters() {
			return getRuleContexts(TypeParametersContext.class);
		}

		public TypeParametersContext typeParameters(int i) {
			return getRuleContext(TypeParametersContext.class, i);
		}

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
			return getRuleContext(FunctionDeclarationContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterSubTypeDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitSubTypeDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitSubTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public FieldDeclarationContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_fieldDeclaration;
		}

		public void copyFrom(FieldDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class UntypedFieldDeclarationContext extends FieldDeclarationContext {
		public UntypedFieldDeclarationContext(FieldDeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterUntypedFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitUntypedFieldDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitUntypedFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypedFieldDeclarationContext extends FieldDeclarationContext {
		public TypedFieldDeclarationContext(FieldDeclarationContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode INSTANCE_OF() {
			return getToken(JuliaParser.INSTANCE_OF, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).enterTypedFieldDeclaration(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener)
				((JuliaParserListener) listener).exitTypedFieldDeclaration(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTypedFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeParametersContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameters;
		}

		public void copyFrom(TypeParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class TtypeParametersContext extends TypeParametersContext {
		public TtypeParametersContext(TypeParametersContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode LEFT_CURLY() {
			return getToken(JuliaParser.LEFT_CURLY, 0);
		}

		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}

		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class, i);
		}

		public TerminalNode RIGHT_CURLY() {
			return getToken(JuliaParser.RIGHT_CURLY, 0);
		}

		public List<TerminalNode> COMMA() {
			return getTokens(JuliaParser.COMMA);
		}

		public TerminalNode COMMA(int i) {
			return getToken(JuliaParser.COMMA, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTtypeParameters(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTtypeParameters(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitTtypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TypeParameterContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_typeParameter;
		}

		public void copyFrom(TypeParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class InstanceContext extends TypeParameterContext {
		public InstanceContext(TypeParameterContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode INSTANCE_OF() {
			return getToken(JuliaParser.INSTANCE_OF, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterInstance(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitInstance(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExpressionContext extends TypeParameterContext {
		public ExpressionContext(TypeParameterContext ctx) {
			copyFrom(ctx);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterExpression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitExpression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NamedSubtypeContext extends TypeParameterContext {
		public NamedSubtypeContext(TypeParameterContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode ID() {
			return getToken(JuliaParser.ID, 0);
		}

		public TerminalNode SUB_TYPE() {
			return getToken(JuliaParser.SUB_TYPE, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNamedSubtype(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNamedSubtype(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNamedSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public ForStatementContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_forStatement;
		}

		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ForEqContext extends ForStatementContext {
		public ForEqContext(ForStatementContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FOR() {
			return getToken(JuliaParser.FOR, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() {
			return getToken(JuliaParser.EQ, 0);
		}

		public TerminalNode COLON() {
			return getToken(JuliaParser.COLON, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterForEq(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitForEq(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitForEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ForEqStepContext extends ForStatementContext {
		public ForEqStepContext(ForStatementContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FOR() {
			return getToken(JuliaParser.FOR, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode EQ() {
			return getToken(JuliaParser.EQ, 0);
		}

		public List<TerminalNode> COLON() {
			return getTokens(JuliaParser.COLON);
		}

		public TerminalNode COLON(int i) {
			return getToken(JuliaParser.COLON, i);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterForEqStep(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitForEqStep(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitForEqStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ForInContext extends ForStatementContext {
		public ForInContext(ForStatementContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode FOR() {
			return getToken(JuliaParser.FOR, 0);
		}

		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}

		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class, i);
		}

		public TerminalNode IN() {
			return getToken(JuliaParser.IN, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterForIn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitForIn(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitForIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode WHILE() {
			return getToken(JuliaParser.WHILE, 0);
		}

		public ExpContext exp() {
			return getRuleContext(ExpContext.class, 0);
		}

		public TerminalNode END() {
			return getToken(JuliaParser.END, 0);
		}

		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}

		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_whileStatement;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterWhileStatement(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitWhileStatement(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public NameContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_name;
		}

		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class NnameContext extends NameContext {
		public NnameContext(NameContext ctx) {
			copyFrom(ctx);
		}

		public List<TerminalNode> ID() {
			return getTokens(JuliaParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(JuliaParser.ID, i);
		}

		public List<TerminalNode> DOT() {
			return getTokens(JuliaParser.DOT);
		}

		public TerminalNode DOT(int i) {
			return getToken(JuliaParser.DOT, i);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNname(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNname(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof JuliaParserVisitor)
				return ((JuliaParserVisitor<? extends T>) visitor).visitNname(this);
			else return visitor.visitChildren(this);
		}
	}
}