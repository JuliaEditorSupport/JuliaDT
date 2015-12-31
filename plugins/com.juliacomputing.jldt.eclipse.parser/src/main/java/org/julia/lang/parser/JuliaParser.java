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
            DOT = 1, EQ = 2, DOUBLE_ARROW = 3, ADD_ASGN = 4, SUB_ASGN = 5, TIMES_ASGN = 6, DIVIDE_ASGN = 7,
            INV_DIVIDE_ASGN = 8, REMAINDER_ASGN = 9, POWER_ASGN = 10, BITWISE_AND_ASGN = 11,
            BITWISE_OR_ASGN = 12, BITWISE_XOR_ASGN = 13, LSR_ASGN = 14, ASR_ASGN = 15, ELLIPSE = 16,
            ASL_ASGN = 17, QUESTION_MARK = 18, IN = 19, IF = 20, ELSE_IF = 21, ELSE = 22, FOR = 23,
            CONST = 24, INCLUDE = 25, USING = 26, IMPORT = 27, COLON = 28, COMMA = 29, IMPORT_ALL = 30,
            EXPORT = 31, MODULE = 32, END = 33, BAREMODULE = 34, INF16 = 35, INF32 = 36, INF = 37,
            MINUS_INF16 = 38, MINUS_INF32 = 39, MINUS_INF = 40, NAN16 = 41, NAN32 = 42, NAN = 43,
            MINUS = 44, INSTANCE_OF = 45, EXPONENT = 46, FRACTION = 47, TIMES = 48, DIVIDE = 49,
            PLUS = 50, NOT_EQUAL = 51, GREATER_THAN = 52, LESS_THAN = 53, GREATER_THAN_OR_EQ = 54,
            LESS_THAN_OR_EQ = 55, EQUALS = 56, NOT = 57, AND = 58, OR = 59, LEFT_BRACKET = 60,
            RIGHT_BRACKET = 61, TRUE = 62, FALSE = 63, ABSTRACT = 64, SUB_TYPE = 65, BITS_TYPE = 66,
            TYPE_ALIAS = 67, TYPE = 68, IMMUTABLE = 69, UNION = 70, FUNCTION = 71, LEFT_CURLY = 72,
            RIGHT_CURLY = 73, LEFT_SQUARE = 74, RIGHT_SQUARE = 75, INT8 = 76, UINT8 = 77, INT16 = 78,
            UINT16 = 79, INT32 = 80, UINT32 = 81, INT64 = 82, UINT64 = 83, INT128 = 84, UINT128 = 85,
            BOOL = 86, CHAR = 87, FLOAT16 = 88, FLOAT32 = 89, FLOAT64 = 90, REGEX = 91, INT = 92,
            BINARY = 93, OCTAL = 94, HEX = 95, FLOAT32_LITERAL = 96, EXP32 = 97, FLOAT64_LITERAL = 98,
            EXP64 = 99, ID = 100, STRING = 101, WS = 102, LINE_COMMENT = 103, SIZE = 104;
    public static final int
            RULE_unit = 0, RULE_statement = 1, RULE_exp = 2, RULE_moduleDirective = 3,
            RULE_functionDeclaration = 4, RULE_parameters = 5, RULE_parameter = 6,
            RULE_typeExpression = 7, RULE_fieldDeclaration = 8, RULE_typeParameters = 9,
            RULE_typeParameter = 10, RULE_typeAlias = 11, RULE_forStatement = 12,
            RULE_ifStatement = 13, RULE_name = 14;
    public static final String[] ruleNames = {
            "unit", "statement", "exp", "moduleDirective", "functionDeclaration",
            "parameters", "parameter", "typeExpression", "fieldDeclaration", "typeParameters",
            "typeParameter", "typeAlias", "forStatement", "ifStatement", "name"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3j\u025d\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16" +
                    "\2%\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\3\4\3\4\3\4\7\4B\n\4\f\4\16\4E\13" +
                    "\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3" +
                    "\4\5\4W\n\4\3\4\6\4Z\n\4\r\4\16\4[\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4" +
                    "f\n\4\r\4\16\4g\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4t\13\4\3" +
                    "\4\5\4w\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00f8\n\4\f\4\16\4\u00fb\13\4" +
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0109\n\5\f\5\16" +
                    "\5\u010c\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0114\n\5\f\5\16\5\u0117\13" +
                    "\5\3\5\3\5\3\5\6\5\u011c\n\5\r\5\16\5\u011d\3\5\3\5\3\5\3\5\3\5\6\5\u0125" +
                    "\n\5\r\5\16\5\u0126\3\5\3\5\5\5\u012b\n\5\3\6\3\6\5\6\u012f\n\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\5\6\u0138\n\6\3\6\3\6\6\6\u013c\n\6\r\6\16\6\u013d" +
                    "\3\6\3\6\5\6\u0142\n\6\3\7\3\7\3\7\3\7\7\7\u0148\n\7\f\7\16\7\u014b\13" +
                    "\7\5\7\u014d\n\7\3\7\5\7\u0150\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b" +
                    "\u015a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5" +
                    "\t\u017c\n\t\3\t\3\t\3\t\5\t\u0181\n\t\3\t\7\t\u0184\n\t\f\t\16\t\u0187" +
                    "\13\t\3\t\7\t\u018a\n\t\f\t\16\t\u018d\13\t\3\t\3\t\3\t\3\t\5\t\u0193" +
                    "\n\t\3\t\7\t\u0196\n\t\f\t\16\t\u0199\13\t\3\t\7\t\u019c\n\t\f\t\16\t" +
                    "\u019f\13\t\3\t\3\t\3\t\3\t\5\t\u01a5\n\t\3\t\7\t\u01a8\n\t\f\t\16\t\u01ab" +
                    "\13\t\3\t\7\t\u01ae\n\t\f\t\16\t\u01b1\13\t\3\t\3\t\3\t\3\t\5\t\u01b7" +
                    "\n\t\3\t\3\t\3\t\5\t\u01bc\n\t\3\t\7\t\u01bf\n\t\f\t\16\t\u01c2\13\t\3" +
                    "\t\7\t\u01c5\n\t\f\t\16\t\u01c8\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01cf\n\t" +
                    "\3\t\3\t\3\t\5\t\u01d4\n\t\6\t\u01d6\n\t\r\t\16\t\u01d7\3\t\3\t\3\t\3" +
                    "\t\3\t\5\t\u01df\n\t\3\t\3\t\3\t\5\t\u01e4\n\t\7\t\u01e6\n\t\f\t\16\t" +
                    "\u01e9\13\t\3\t\3\t\5\t\u01ed\n\t\3\n\3\n\3\n\3\n\5\n\u01f3\n\n\3\13\3" +
                    "\13\3\13\3\13\7\13\u01f9\n\13\f\13\16\13\u01fc\13\13\3\13\3\13\3\f\3\f" +
                    "\3\f\3\f\3\f\3\f\3\f\5\f\u0207\n\f\3\r\3\r\3\r\5\r\u020c\n\r\3\r\3\r\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0217\n\16\r\16\16\16\u0218\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0226\n\16\r\16" +
                    "\16\16\u0227\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0231\n\16\r\16\16" +
                    "\16\u0232\3\16\3\16\5\16\u0237\n\16\3\17\3\17\3\17\6\17\u023c\n\17\r\17" +
                    "\16\17\u023d\3\17\3\17\6\17\u0242\n\17\r\17\16\17\u0243\7\17\u0246\n\17" +
                    "\f\17\16\17\u0249\13\17\3\17\3\17\6\17\u024d\n\17\r\17\16\17\u024e\5\17" +
                    "\u0251\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u0258\n\20\f\20\16\20\u025b" +
                    "\13\20\3\20\2\3\6\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\u02ed" +
                    "\2#\3\2\2\2\4-\3\2\2\2\6\u0090\3\2\2\2\b\u012a\3\2\2\2\n\u0141\3\2\2\2" +
                    "\f\u0143\3\2\2\2\16\u0159\3\2\2\2\20\u01ec\3\2\2\2\22\u01f2\3\2\2\2\24" +
                    "\u01f4\3\2\2\2\26\u0206\3\2\2\2\30\u0208\3\2\2\2\32\u0236\3\2\2\2\34\u0238" +
                    "\3\2\2\2\36\u0254\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$" +
                    "\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&.\5\b\5\2\'.\5\n\6\2(.\5\20\t\2).\5\30\r" +
                    "\2*.\5\32\16\2+.\5\34\17\2,.\5\6\4\2-&\3\2\2\2-\'\3\2\2\2-(\3\2\2\2-)" +
                    "\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\b\4\1\2\60\61\7" +
                    ".\2\2\61\u0091\5\6\4B\62\63\7;\2\2\63\u0091\5\6\4\64\64\65\7\32\2\2\65" +
                    "\66\7f\2\2\66\67\7\4\2\2\67\u0091\5\6\4\f8\u0091\7#\2\29;\5\36\20\2:<" +
                    "\5\24\13\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=G\7>\2\2>?\5\6\4\2?@\7\37\2\2" +
                    "@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2" +
                    "FH\5\6\4\2GC\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7?\2\2J\u0091\3\2\2\2KY\5\36" +
                    "\20\2LR\7L\2\2MN\5\6\4\2NO\7\37\2\2OQ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3" +
                    "\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UW\5\6\4\2VU\3\2\2\2VW\3\2\2\2WX\3" +
                    "\2\2\2XZ\7M\2\2YL\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\u0091\3\2\2" +
                    "\2]^\7>\2\2^_\5\6\4\2_`\7?\2\2`\u0091\3\2\2\2ae\7>\2\2bc\5\6\4\2cd\7\37" +
                    "\2\2df\3\2\2\2eb\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\6" +
                    "\4\2jk\7?\2\2k\u0091\3\2\2\2lr\7L\2\2mn\5\6\4\2no\7\37\2\2oq\3\2\2\2p" +
                    "m\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uw\5\6\4\2" +
                    "vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u0091\7M\2\2y\u0091\5\36\20\2z\u0091\7" +
                    "f\2\2{\u0091\7]\2\2|\u0091\7@\2\2}\u0091\7A\2\2~\u0091\7^\2\2\177\u0091" +
                    "\7_\2\2\u0080\u0091\7`\2\2\u0081\u0091\7a\2\2\u0082\u0091\7b\2\2\u0083" +
                    "\u0091\7d\2\2\u0084\u0091\7g\2\2\u0085\u0086\7\36\2\2\u0086\u0091\7f\2" +
                    "\2\u0087\u0091\7%\2\2\u0088\u0091\7&\2\2\u0089\u0091\7\'\2\2\u008a\u0091" +
                    "\7(\2\2\u008b\u0091\7)\2\2\u008c\u0091\7*\2\2\u008d\u0091\7+\2\2\u008e" +
                    "\u0091\7,\2\2\u008f\u0091\7-\2\2\u0090/\3\2\2\2\u0090\62\3\2\2\2\u0090" +
                    "\64\3\2\2\2\u00908\3\2\2\2\u00909\3\2\2\2\u0090K\3\2\2\2\u0090]\3\2\2" +
                    "\2\u0090a\3\2\2\2\u0090l\3\2\2\2\u0090y\3\2\2\2\u0090z\3\2\2\2\u0090{" +
                    "\3\2\2\2\u0090|\3\2\2\2\u0090}\3\2\2\2\u0090~\3\2\2\2\u0090\177\3\2\2" +
                    "\2\u0090\u0080\3\2\2\2\u0090\u0081\3\2\2\2\u0090\u0082\3\2\2\2\u0090\u0083" +
                    "\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0085\3\2\2\2\u0090\u0087\3\2\2\2\u0090" +
                    "\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2" +
                    "\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090" +
                    "\u008f\3\2\2\2\u0091\u00f9\3\2\2\2\u0092\u0093\f@\2\2\u0093\u0094\7\61" +
                    "\2\2\u0094\u00f8\5\6\4A\u0095\u0096\f?\2\2\u0096\u0097\7\62\2\2\u0097" +
                    "\u00f8\5\6\4@\u0098\u0099\f>\2\2\u0099\u009a\7\63\2\2\u009a\u00f8\5\6" +
                    "\4?\u009b\u009c\f=\2\2\u009c\u009d\7\64\2\2\u009d\u00f8\5\6\4>\u009e\u009f" +
                    "\f<\2\2\u009f\u00a0\7.\2\2\u00a0\u00f8\5\6\4=\u00a1\u00a2\f;\2\2\u00a2" +
                    "\u00a3\7\66\2\2\u00a3\u00f8\5\6\4<\u00a4\u00a5\f:\2\2\u00a5\u00a6\7\67" +
                    "\2\2\u00a6\u00f8\5\6\4;\u00a7\u00a8\f9\2\2\u00a8\u00a9\78\2\2\u00a9\u00f8" +
                    "\5\6\4:\u00aa\u00ab\f8\2\2\u00ab\u00ac\79\2\2\u00ac\u00f8\5\6\49\u00ad" +
                    "\u00ae\f\67\2\2\u00ae\u00af\7:\2\2\u00af\u00f8\5\6\48\u00b0\u00b1\f\66" +
                    "\2\2\u00b1\u00b2\7C\2\2\u00b2\u00f8\5\6\4\67\u00b3\u00b4\f\65\2\2\u00b4" +
                    "\u00b5\7\24\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\7\36\2\2\u00b7\u00b8\5" +
                    "\6\4\66\u00b8\u00f8\3\2\2\2\u00b9\u00ba\f\63\2\2\u00ba\u00bb\7<\2\2\u00bb" +
                    "\u00f8\5\6\4\64\u00bc\u00bd\f\62\2\2\u00bd\u00be\7=\2\2\u00be\u00f8\5" +
                    "\6\4\63\u00bf\u00c0\f,\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00f8\5\6\4-\u00c2" +
                    "\u00c3\f+\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00f8\5\6\4,\u00c5\u00c6\f*\2" +
                    "\2\u00c6\u00c7\7\6\2\2\u00c7\u00f8\5\6\4+\u00c8\u00c9\f)\2\2\u00c9\u00ca" +
                    "\7\7\2\2\u00ca\u00f8\5\6\4*\u00cb\u00cc\f(\2\2\u00cc\u00cd\7\b\2\2\u00cd" +
                    "\u00f8\5\6\4)\u00ce\u00cf\f\'\2\2\u00cf\u00d0\7\t\2\2\u00d0\u00f8\5\6" +
                    "\4(\u00d1\u00d2\f&\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00f8\5\6\4\'\u00d4\u00d5" +
                    "\f%\2\2\u00d5\u00d6\7\13\2\2\u00d6\u00f8\5\6\4&\u00d7\u00d8\f$\2\2\u00d8" +
                    "\u00d9\7\f\2\2\u00d9\u00f8\5\6\4%\u00da\u00db\f#\2\2\u00db\u00dc\7\r\2" +
                    "\2\u00dc\u00f8\5\6\4$\u00dd\u00de\f\"\2\2\u00de\u00df\7\16\2\2\u00df\u00f8" +
                    "\5\6\4#\u00e0\u00e1\f!\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00f8\5\6\4\"\u00e3" +
                    "\u00e4\f \2\2\u00e4\u00e5\7\20\2\2\u00e5\u00f8\5\6\4!\u00e6\u00e7\f\37" +
                    "\2\2\u00e7\u00e8\7\21\2\2\u00e8\u00f8\5\6\4 \u00e9\u00ea\f\36\2\2\u00ea" +
                    "\u00eb\7\23\2\2\u00eb\u00f8\5\6\4\37\u00ec\u00ed\f\35\2\2\u00ed\u00ee" +
                    "\7\5\2\2\u00ee\u00f8\5\6\4\36\u00ef\u00f0\f\32\2\2\u00f0\u00f1\7\36\2" +
                    "\2\u00f1\u00f8\5\6\4\33\u00f2\u00f3\fA\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f8" +
                    "\5\20\t\2\u00f5\u00f6\f\34\2\2\u00f6\u00f8\7\22\2\2\u00f7\u0092\3\2\2" +
                    "\2\u00f7\u0095\3\2\2\2\u00f7\u0098\3\2\2\2\u00f7\u009b\3\2\2\2\u00f7\u009e" +
                    "\3\2\2\2\u00f7\u00a1\3\2\2\2\u00f7\u00a4\3\2\2\2\u00f7\u00a7\3\2\2\2\u00f7" +
                    "\u00aa\3\2\2\2\u00f7\u00ad\3\2\2\2\u00f7\u00b0\3\2\2\2\u00f7\u00b3\3\2" +
                    "\2\2\u00f7\u00b9\3\2\2\2\u00f7\u00bc\3\2\2\2\u00f7\u00bf\3\2\2\2\u00f7" +
                    "\u00c2\3\2\2\2\u00f7\u00c5\3\2\2\2\u00f7\u00c8\3\2\2\2\u00f7\u00cb\3\2" +
                    "\2\2\u00f7\u00ce\3\2\2\2\u00f7\u00d1\3\2\2\2\u00f7\u00d4\3\2\2\2\u00f7" +
                    "\u00d7\3\2\2\2\u00f7\u00da\3\2\2\2\u00f7\u00dd\3\2\2\2\u00f7\u00e0\3\2" +
                    "\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7" +
                    "\u00ec\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7\u00f5\3\2" +
                    "\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa" +
                    "\7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\33\2\2\u00fd\u00fe\7>\2\2" +
                    "\u00fe\u00ff\7g\2\2\u00ff\u012b\7?\2\2\u0100\u0101\7\34\2\2\u0101\u012b" +
                    "\7f\2\2\u0102\u0103\7\35\2\2\u0103\u0104\7f\2\2\u0104\u0105\7\36\2\2\u0105" +
                    "\u010a\7f\2\2\u0106\u0107\7\37\2\2\u0107\u0109\7f\2\2\u0108\u0106\3\2" +
                    "\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b" +
                    "\u012b\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7 \2\2\u010e\u012b\7f\2" +
                    "\2\u010f\u0110\7!\2\2\u0110\u0115\7f\2\2\u0111\u0112\7\37\2\2\u0112\u0114" +
                    "\7f\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115" +
                    "\u0116\3\2\2\2\u0116\u012b\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\"" +
                    "\2\2\u0119\u011b\7f\2\2\u011a\u011c\5\4\3\2\u011b\u011a\3\2\2\2\u011c" +
                    "\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2" +
                    "\2\2\u011f\u0120\7#\2\2\u0120\u012b\3\2\2\2\u0121\u0122\7$\2\2\u0122\u0124" +
                    "\7f\2\2\u0123\u0125\5\4\3\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126" +
                    "\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7#" +
                    "\2\2\u0129\u012b\3\2\2\2\u012a\u00fc\3\2\2\2\u012a\u0100\3\2\2\2\u012a" +
                    "\u0102\3\2\2\2\u012a\u010d\3\2\2\2\u012a\u010f\3\2\2\2\u012a\u0118\3\2" +
                    "\2\2\u012a\u0121\3\2\2\2\u012b\t\3\2\2\2\u012c\u012e\5\36\20\2\u012d\u012f" +
                    "\5\24\13\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2" +
                    "\u0130\u0131\5\f\7\2\u0131\u0132\7\4\2\2\u0132\u0133\5\6\4\2\u0133\u0142" +
                    "\3\2\2\2\u0134\u0135\7I\2\2\u0135\u0137\5\36\20\2\u0136\u0138\5\24\13" +
                    "\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b" +
                    "\5\f\7\2\u013a\u013c\5\4\3\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d" +
                    "\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7#" +
                    "\2\2\u0140\u0142\3\2\2\2\u0141\u012c\3\2\2\2\u0141\u0134\3\2\2\2\u0142" +
                    "\13\3\2\2\2\u0143\u014c\7>\2\2\u0144\u0149\5\16\b\2\u0145\u0146\7\37\2" +
                    "\2\u0146\u0148\5\16\b\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149" +
                    "\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2" +
                    "\2\2\u014c\u0144\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e" +
                    "\u0150\7\22\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3" +
                    "\2\2\2\u0151\u0152\7?\2\2\u0152\r\3\2\2\2\u0153\u0154\7f\2\2\u0154\u0155" +
                    "\7/\2\2\u0155\u015a\5\20\t\2\u0156\u0157\7/\2\2\u0157\u015a\5\20\t\2\u0158" +
                    "\u015a\7f\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0158\3\2" +
                    "\2\2\u015a\17\3\2\2\2\u015b\u01ed\7N\2\2\u015c\u01ed\7O\2\2\u015d\u01ed" +
                    "\7P\2\2\u015e\u01ed\7Q\2\2\u015f\u01ed\7R\2\2\u0160\u01ed\7S\2\2\u0161" +
                    "\u01ed\7T\2\2\u0162\u01ed\7U\2\2\u0163\u01ed\7V\2\2\u0164\u01ed\7W\2\2" +
                    "\u0165\u01ed\7X\2\2\u0166\u01ed\7Y\2\2\u0167\u01ed\7Z\2\2\u0168\u01ed" +
                    "\7[\2\2\u0169\u01ed\7\\\2\2\u016a\u016b\7B\2\2\u016b\u016c\7f\2\2\u016c" +
                    "\u016d\7C\2\2\u016d\u01ed\7f\2\2\u016e\u016f\7B\2\2\u016f\u01ed\7f\2\2" +
                    "\u0170\u0171\7D\2\2\u0171\u0172\7j\2\2\u0172\u0173\7f\2\2\u0173\u0174" +
                    "\7C\2\2\u0174\u01ed\7f\2\2\u0175\u0176\7D\2\2\u0176\u0177\7j\2\2\u0177" +
                    "\u01ed\7f\2\2\u0178\u0179\7F\2\2\u0179\u017b\7f\2\2\u017a\u017c\5\24\13" +
                    "\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e" +
                    "\7C\2\2\u017e\u0180\7f\2\2\u017f\u0181\5\24\13\2\u0180\u017f\3\2\2\2\u0180" +
                    "\u0181\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0184\5\22\n\2\u0183\u0182\3" +
                    "\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186" +
                    "\u018b\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u018a\5\n\6\2\u0189\u0188\3\2" +
                    "\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c" +
                    "\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u01ed\7#\2\2\u018f\u0190\7F\2" +
                    "\2\u0190\u0192\7f\2\2\u0191\u0193\5\24\13\2\u0192\u0191\3\2\2\2\u0192" +
                    "\u0193\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0196\5\22\n\2\u0195\u0194\3" +
                    "\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198" +
                    "\u019d\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\5\n\6\2\u019b\u019a\3\2" +
                    "\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e" +
                    "\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01ed\7#\2\2\u01a1\u01a2\7G\2" +
                    "\2\u01a2\u01a4\7f\2\2\u01a3\u01a5\5\24\13\2\u01a4\u01a3\3\2\2\2\u01a4" +
                    "\u01a5\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a8\5\22\n\2\u01a7\u01a6\3" +
                    "\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa" +
                    "\u01af\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\5\n\6\2\u01ad\u01ac\3\2" +
                    "\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0" +
                    "\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01ed\7#\2\2\u01b3\u01b4\7G\2" +
                    "\2\u01b4\u01b6\7f\2\2\u01b5\u01b7\5\24\13\2\u01b6\u01b5\3\2\2\2\u01b6" +
                    "\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\7C\2\2\u01b9\u01bb\7f\2" +
                    "\2\u01ba\u01bc\5\24\13\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc" +
                    "\u01c0\3\2\2\2\u01bd\u01bf\5\22\n\2\u01be\u01bd\3\2\2\2\u01bf\u01c2\3" +
                    "\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6\3\2\2\2\u01c2" +
                    "\u01c0\3\2\2\2\u01c3\u01c5\5\n\6\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2" +
                    "\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8" +
                    "\u01c6\3\2\2\2\u01c9\u01ed\7#\2\2\u01ca\u01cb\7H\2\2\u01cb\u01ce\7J\2" +
                    "\2\u01cc\u01cf\5\20\t\2\u01cd\u01cf\7^\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd" +
                    "\3\2\2\2\u01cf\u01d5\3\2\2\2\u01d0\u01d3\7\37\2\2\u01d1\u01d4\5\20\t\2" +
                    "\u01d2\u01d4\7^\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d6" +
                    "\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7" +
                    "\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01ed\7K\2\2\u01da\u01db\7f\2" +
                    "\2\u01db\u01de\7J\2\2\u01dc\u01df\5\20\t\2\u01dd\u01df\7^\2\2\u01de\u01dc" +
                    "\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e7\3\2\2\2\u01e0\u01e3\7\37\2\2" +
                    "\u01e1\u01e4\5\20\t\2\u01e2\u01e4\7^\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2" +
                    "\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7" +
                    "\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2" +
                    "\2\2\u01ea\u01ed\7K\2\2\u01eb\u01ed\7f\2\2\u01ec\u015b\3\2\2\2\u01ec\u015c" +
                    "\3\2\2\2\u01ec\u015d\3\2\2\2\u01ec\u015e\3\2\2\2\u01ec\u015f\3\2\2\2\u01ec" +
                    "\u0160\3\2\2\2\u01ec\u0161\3\2\2\2\u01ec\u0162\3\2\2\2\u01ec\u0163\3\2" +
                    "\2\2\u01ec\u0164\3\2\2\2\u01ec\u0165\3\2\2\2\u01ec\u0166\3\2\2\2\u01ec" +
                    "\u0167\3\2\2\2\u01ec\u0168\3\2\2\2\u01ec\u0169\3\2\2\2\u01ec\u016a\3\2" +
                    "\2\2\u01ec\u016e\3\2\2\2\u01ec\u0170\3\2\2\2\u01ec\u0175\3\2\2\2\u01ec" +
                    "\u0178\3\2\2\2\u01ec\u018f\3\2\2\2\u01ec\u01a1\3\2\2\2\u01ec\u01b3\3\2" +
                    "\2\2\u01ec\u01ca\3\2\2\2\u01ec\u01da\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed" +
                    "\21\3\2\2\2\u01ee\u01ef\7f\2\2\u01ef\u01f0\7/\2\2\u01f0\u01f3\5\20\t\2" +
                    "\u01f1\u01f3\7f\2\2\u01f2\u01ee\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\23\3" +
                    "\2\2\2\u01f4\u01f5\7J\2\2\u01f5\u01fa\5\26\f\2\u01f6\u01f7\7\37\2\2\u01f7" +
                    "\u01f9\5\26\f\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3" +
                    "\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd" +
                    "\u01fe\7K\2\2\u01fe\25\3\2\2\2\u01ff\u0200\7f\2\2\u0200\u0201\7C\2\2\u0201" +
                    "\u0207\5\20\t\2\u0202\u0203\7/\2\2\u0203\u0207\5\20\t\2\u0204\u0207\5" +
                    "\20\t\2\u0205\u0207\7^\2\2\u0206\u01ff\3\2\2\2\u0206\u0202\3\2\2\2\u0206" +
                    "\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\27\3\2\2\2\u0208\u0209\7E\2\2" +
                    "\u0209\u020b\7f\2\2\u020a\u020c\5\24\13\2\u020b\u020a\3\2\2\2\u020b\u020c" +
                    "\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5\20\t\2\u020e\31\3\2\2\2\u020f" +
                    "\u0210\7\31\2\2\u0210\u0211\5\6\4\2\u0211\u0212\7\4\2\2\u0212\u0213\5" +
                    "\6\4\2\u0213\u0214\7\36\2\2\u0214\u0216\5\6\4\2\u0215\u0217\5\4\3\2\u0216" +
                    "\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2" +
                    "\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7#\2\2\u021b\u0237\3\2\2\2\u021c" +
                    "\u021d\7\31\2\2\u021d\u021e\5\6\4\2\u021e\u021f\7\4\2\2\u021f\u0220\5" +
                    "\6\4\2\u0220\u0221\7\36\2\2\u0221\u0222\5\6\4\2\u0222\u0223\7\36\2\2\u0223" +
                    "\u0225\5\6\4\2\u0224\u0226\5\4\3\2\u0225\u0224\3\2\2\2\u0226\u0227\3\2" +
                    "\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229" +
                    "\u022a\7#\2\2\u022a\u0237\3\2\2\2\u022b\u022c\7\31\2\2\u022c\u022d\5\6" +
                    "\4\2\u022d\u022e\7\25\2\2\u022e\u0230\5\6\4\2\u022f\u0231\5\4\3\2\u0230" +
                    "\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2" +
                    "\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7#\2\2\u0235\u0237\3\2\2\2\u0236" +
                    "\u020f\3\2\2\2\u0236\u021c\3\2\2\2\u0236\u022b\3\2\2\2\u0237\33\3\2\2" +
                    "\2\u0238\u0239\7\26\2\2\u0239\u023b\5\6\4\2\u023a\u023c\5\4\3\2\u023b" +
                    "\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2" +
                    "\2\2\u023e\u0247\3\2\2\2\u023f\u0241\7\27\2\2\u0240\u0242\5\4\3\2\u0241" +
                    "\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2" +
                    "\2\2\u0244\u0246\3\2\2\2\u0245\u023f\3\2\2\2\u0246\u0249\3\2\2\2\u0247" +
                    "\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0250\3\2\2\2\u0249\u0247\3\2" +
                    "\2\2\u024a\u024c\7\30\2\2\u024b\u024d\5\4\3\2\u024c\u024b\3\2\2\2\u024d" +
                    "\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2" +
                    "\2\2\u0250\u024a\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252" +
                    "\u0253\7#\2\2\u0253\35\3\2\2\2\u0254\u0259\7f\2\2\u0255\u0256\7\3\2\2" +
                    "\u0256\u0258\7f\2\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257" +
                    "\3\2\2\2\u0259\u025a\3\2\2\2\u025a\37\3\2\2\2\u025b\u0259\3\2\2\2@#-;" +
                    "CGRV[grv\u0090\u00f7\u00f9\u010a\u0115\u011d\u0126\u012a\u012e\u0137\u013d" +
                    "\u0141\u0149\u014c\u014f\u0159\u017b\u0180\u0185\u018b\u0192\u0197\u019d" +
                    "\u01a4\u01a9\u01af\u01b6\u01bb\u01c0\u01c6\u01ce\u01d3\u01d7\u01de\u01e3" +
                    "\u01e7\u01ec\u01f2\u01fa\u0206\u020b\u0218\u0227\u0232\u0236\u023d\u0243" +
                    "\u0247\u024e\u0250\u0259";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'.'", "'='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'\\='", "'%='",
            "'^='", "'&='", "'|='", "'$='", "'>>>='", "'>>='", "'...'", "'<<='", "'?'",
            "'in'", "'if'", "'elseif'", "'else'", "'for'", "'const'", "'include'",
            "'using'", "'import'", "':'", "','", "'importall'", "'export'", "'module'",
            "'end'", "'baremodule'", "'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'",
            "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'-'", "'::'", "'^'", "'//'",
            "'*'", "'/'", "'+'", null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!'",
            "'&&'", "'||'", "'('", "')'", "'true'", "'false'", "'abstract'", "'<:'",
            "'bitstype'", "'typealias'", "'type'", "'immutable'", "'Union'", "'function'",
            "'{'", "'}'", "'['", "']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'",
            "'Int32'", "'Uint32'", "'Int64'", "'Uint64'", "'Int128'", "'Uint128'",
            "'Bool'", "'Char'", "'Float16'", "'Float32'", "'Float64'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "DOT", "EQ", "DOUBLE_ARROW", "ADD_ASGN", "SUB_ASGN", "TIMES_ASGN",
            "DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", "POWER_ASGN", "BITWISE_AND_ASGN",
            "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN", "LSR_ASGN", "ASR_ASGN", "ELLIPSE",
            "ASL_ASGN", "QUESTION_MARK", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST",
            "INCLUDE", "USING", "IMPORT", "COLON", "COMMA", "IMPORT_ALL", "EXPORT",
            "MODULE", "END", "BAREMODULE", "INF16", "INF32", "INF", "MINUS_INF16",
            "MINUS_INF32", "MINUS_INF", "NAN16", "NAN32", "NAN", "MINUS", "INSTANCE_OF",
            "EXPONENT", "FRACTION", "TIMES", "DIVIDE", "PLUS", "NOT_EQUAL", "GREATER_THAN",
            "LESS_THAN", "GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ", "EQUALS", "NOT",
            "AND", "OR", "LEFT_BRACKET", "RIGHT_BRACKET", "TRUE", "FALSE", "ABSTRACT",
            "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE", "IMMUTABLE", "UNION", "FUNCTION",
            "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE", "INT8", "UINT8",
            "INT16", "UINT16", "INT32", "UINT32", "INT64", "UINT64", "INT128", "UINT128",
            "BOOL", "CHAR", "FLOAT16", "FLOAT32", "FLOAT64", "REGEX", "INT", "BINARY",
            "OCTAL", "HEX", "FLOAT32_LITERAL", "EXP32", "FLOAT64_LITERAL", "EXP64",
            "ID", "STRING", "WS", "LINE_COMMENT", "SIZE"
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
                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << END) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ABSTRACT - 64)) | (1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (REGEX - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (FLOAT32_LITERAL - 64)) | (1L << (FLOAT64_LITERAL - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                    {
                        {
                            setState(30);
                            statement();
                        }
                    }
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
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

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(43);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(36);
                    moduleDirective();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(37);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(38);
                    typeExpression();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(39);
                    typeAlias();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(40);
                    forStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(41);
                    ifStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(42);
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

    public final ExpContext exp() throws RecognitionException {
        return exp(0);
    }

    private ExpContext exp(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpContext _localctx = new ExpContext(_ctx, _parentState);
        ExpContext _prevctx = _localctx;
        int _startState = 4;
        enterRecursionRule(_localctx, 4, RULE_exp, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(46);
                        match(MINUS);
                        setState(47);
                        exp(64);
                    }
                    break;
                    case 2: {
                        _localctx = new NotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(48);
                        match(NOT);
                        setState(49);
                        exp(50);
                    }
                    break;
                    case 3: {
                        _localctx = new ConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(50);
                        match(CONST);
                        setState(51);
                        match(ID);
                        setState(52);
                        match(EQ);
                        setState(53);
                        exp(10);
                    }
                    break;
                    case 4: {
                        _localctx = new EndContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(54);
                        match(END);
                    }
                    break;
                    case 5: {
                        _localctx = new ApplyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(55);
                        name();
                        setState(57);
                        _la = _input.LA(1);
                        if (_la == LEFT_CURLY) {
                            {
                                setState(56);
                                typeParameters();
                            }
                        }

                        setState(59);
                        match(LEFT_BRACKET);
                        setState(69);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LEFT_SQUARE - 74)) | (1L << (REGEX - 74)) | (1L << (INT - 74)) | (1L << (BINARY - 74)) | (1L << (OCTAL - 74)) | (1L << (HEX - 74)) | (1L << (FLOAT32_LITERAL - 74)) | (1L << (FLOAT64_LITERAL - 74)) | (1L << (ID - 74)) | (1L << (STRING - 74)))) != 0)) {
                            {
                                setState(65);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                    if (_alt == 1) {
                                        {
                                            {
                                                setState(60);
                                                exp(0);
                                                setState(61);
                                                match(COMMA);
                                            }
                                        }
                                    }
                                    setState(67);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                                }
                                setState(68);
                                exp(0);
                            }
                        }

                        setState(71);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 6: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(73);
                        name();
                        setState(87);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1: {
                                    {
                                        setState(74);
                                        match(LEFT_SQUARE);
                                        setState(80);
                                        _errHandler.sync(this);
                                        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                            if (_alt == 1) {
                                                {
                                                    {
                                                        setState(75);
                                                        exp(0);
                                                        setState(76);
                                                        match(COMMA);
                                                    }
                                                }
                                            }
                                            setState(82);
                                            _errHandler.sync(this);
                                            _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                                        }
                                        setState(84);
                                        _la = _input.LA(1);
                                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LEFT_SQUARE - 74)) | (1L << (REGEX - 74)) | (1L << (INT - 74)) | (1L << (BINARY - 74)) | (1L << (OCTAL - 74)) | (1L << (HEX - 74)) | (1L << (FLOAT32_LITERAL - 74)) | (1L << (FLOAT64_LITERAL - 74)) | (1L << (ID - 74)) | (1L << (STRING - 74)))) != 0)) {
                                            {
                                                setState(83);
                                                exp(0);
                                            }
                                        }

                                        setState(86);
                                        match(RIGHT_SQUARE);
                                    }
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(89);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    }
                    break;
                    case 7: {
                        _localctx = new BracketedContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(91);
                        match(LEFT_BRACKET);
                        setState(92);
                        exp(0);
                        setState(93);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 8: {
                        _localctx = new TupleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(95);
                        match(LEFT_BRACKET);
                        setState(99);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1: {
                                    {
                                        setState(96);
                                        exp(0);
                                        setState(97);
                                        match(COMMA);
                                    }
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(101);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                        setState(103);
                        exp(0);
                        setState(104);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 9: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(106);
                        match(LEFT_SQUARE);
                        setState(112);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(107);
                                        exp(0);
                                        setState(108);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(114);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        }
                        setState(116);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << END) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LEFT_SQUARE - 74)) | (1L << (REGEX - 74)) | (1L << (INT - 74)) | (1L << (BINARY - 74)) | (1L << (OCTAL - 74)) | (1L << (HEX - 74)) | (1L << (FLOAT32_LITERAL - 74)) | (1L << (FLOAT64_LITERAL - 74)) | (1L << (ID - 74)) | (1L << (STRING - 74)))) != 0)) {
                            {
                                setState(115);
                                exp(0);
                            }
                        }

                        setState(118);
                        match(RIGHT_SQUARE);
                    }
                    break;
                    case 10: {
                        _localctx = new QualifiedNameContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(119);
                        name();
                    }
                    break;
                    case 11: {
                        _localctx = new IdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(120);
                        match(ID);
                    }
                    break;
                    case 12: {
                        _localctx = new RegexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(121);
                        match(REGEX);
                    }
                    break;
                    case 13: {
                        _localctx = new TtContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(122);
                        match(TRUE);
                    }
                    break;
                    case 14: {
                        _localctx = new FfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(123);
                        match(FALSE);
                    }
                    break;
                    case 15: {
                        _localctx = new IntContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(124);
                        match(INT);
                    }
                    break;
                    case 16: {
                        _localctx = new BinaryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(125);
                        match(BINARY);
                    }
                    break;
                    case 17: {
                        _localctx = new OctalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(126);
                        match(OCTAL);
                    }
                    break;
                    case 18: {
                        _localctx = new HexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(127);
                        match(HEX);
                    }
                    break;
                    case 19: {
                        _localctx = new Ffloat32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(128);
                        match(FLOAT32_LITERAL);
                    }
                    break;
                    case 20: {
                        _localctx = new Ffloat64Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(129);
                        match(FLOAT64_LITERAL);
                    }
                    break;
                    case 21: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(130);
                        match(STRING);
                    }
                    break;
                    case 22: {
                        _localctx = new SymbolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(131);
                        match(COLON);
                        setState(132);
                        match(ID);
                    }
                    break;
                    case 23: {
                        _localctx = new Inf16TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(133);
                        match(INF16);
                    }
                    break;
                    case 24: {
                        _localctx = new Inf32TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(134);
                        match(INF32);
                    }
                    break;
                    case 25: {
                        _localctx = new InfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(135);
                        match(INF);
                    }
                    break;
                    case 26: {
                        _localctx = new MinusInf16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(136);
                        match(MINUS_INF16);
                    }
                    break;
                    case 27: {
                        _localctx = new MinusInf32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(137);
                        match(MINUS_INF32);
                    }
                    break;
                    case 28: {
                        _localctx = new MinusInfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(138);
                        match(MINUS_INF);
                    }
                    break;
                    case 29: {
                        _localctx = new Nan16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(139);
                        match(NAN16);
                    }
                    break;
                    case 30: {
                        _localctx = new Nan32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(140);
                        match(NAN32);
                    }
                    break;
                    case 31: {
                        _localctx = new NanContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(141);
                        match(NAN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(247);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(245);
                            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                                case 1: {
                                    _localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(144);
                                    if (!(precpred(_ctx, 62)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 62)");
                                    setState(145);
                                    match(FRACTION);
                                    setState(146);
                                    exp(63);
                                }
                                break;
                                case 2: {
                                    _localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(147);
                                    if (!(precpred(_ctx, 61)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 61)");
                                    setState(148);
                                    match(TIMES);
                                    setState(149);
                                    exp(62);
                                }
                                break;
                                case 3: {
                                    _localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(150);
                                    if (!(precpred(_ctx, 60)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 60)");
                                    setState(151);
                                    match(DIVIDE);
                                    setState(152);
                                    exp(61);
                                }
                                break;
                                case 4: {
                                    _localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(153);
                                    if (!(precpred(_ctx, 59)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 59)");
                                    setState(154);
                                    match(PLUS);
                                    setState(155);
                                    exp(60);
                                }
                                break;
                                case 5: {
                                    _localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(156);
                                    if (!(precpred(_ctx, 58)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 58)");
                                    setState(157);
                                    match(MINUS);
                                    setState(158);
                                    exp(59);
                                }
                                break;
                                case 6: {
                                    _localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(159);
                                    if (!(precpred(_ctx, 57)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 57)");
                                    setState(160);
                                    match(GREATER_THAN);
                                    setState(161);
                                    exp(58);
                                }
                                break;
                                case 7: {
                                    _localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(162);
                                    if (!(precpred(_ctx, 56)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 56)");
                                    setState(163);
                                    match(LESS_THAN);
                                    setState(164);
                                    exp(57);
                                }
                                break;
                                case 8: {
                                    _localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(165);
                                    if (!(precpred(_ctx, 55)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 55)");
                                    setState(166);
                                    match(GREATER_THAN_OR_EQ);
                                    setState(167);
                                    exp(56);
                                }
                                break;
                                case 9: {
                                    _localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(168);
                                    if (!(precpred(_ctx, 54)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 54)");
                                    setState(169);
                                    match(LESS_THAN_OR_EQ);
                                    setState(170);
                                    exp(55);
                                }
                                break;
                                case 10: {
                                    _localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(171);
                                    if (!(precpred(_ctx, 53)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 53)");
                                    setState(172);
                                    match(EQUALS);
                                    setState(173);
                                    exp(54);
                                }
                                break;
                                case 11: {
                                    _localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(174);
                                    if (!(precpred(_ctx, 52)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 52)");
                                    setState(175);
                                    match(SUB_TYPE);
                                    setState(176);
                                    exp(53);
                                }
                                break;
                                case 12: {
                                    _localctx = new ConditionalContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(177);
                                    if (!(precpred(_ctx, 51)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 51)");
                                    setState(178);
                                    match(QUESTION_MARK);
                                    setState(179);
                                    exp(0);
                                    setState(180);
                                    match(COLON);
                                    setState(181);
                                    exp(52);
                                }
                                break;
                                case 13: {
                                    _localctx = new AndContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(183);
                                    if (!(precpred(_ctx, 49)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 49)");
                                    setState(184);
                                    match(AND);
                                    setState(185);
                                    exp(50);
                                }
                                break;
                                case 14: {
                                    _localctx = new OrContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(186);
                                    if (!(precpred(_ctx, 48)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 48)");
                                    setState(187);
                                    match(OR);
                                    setState(188);
                                    exp(49);
                                }
                                break;
                                case 15: {
                                    _localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(189);
                                    if (!(precpred(_ctx, 42)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 42)");
                                    setState(190);
                                    match(NOT_EQUAL);
                                    setState(191);
                                    exp(43);
                                }
                                break;
                                case 16: {
                                    _localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(192);
                                    if (!(precpred(_ctx, 41)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 41)");
                                    setState(193);
                                    match(EQ);
                                    setState(194);
                                    exp(42);
                                }
                                break;
                                case 17: {
                                    _localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(195);
                                    if (!(precpred(_ctx, 40)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 40)");
                                    setState(196);
                                    match(ADD_ASGN);
                                    setState(197);
                                    exp(41);
                                }
                                break;
                                case 18: {
                                    _localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(198);
                                    if (!(precpred(_ctx, 39)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                                    setState(199);
                                    match(SUB_ASGN);
                                    setState(200);
                                    exp(40);
                                }
                                break;
                                case 19: {
                                    _localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(201);
                                    if (!(precpred(_ctx, 38)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                                    setState(202);
                                    match(TIMES_ASGN);
                                    setState(203);
                                    exp(39);
                                }
                                break;
                                case 20: {
                                    _localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(204);
                                    if (!(precpred(_ctx, 37)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 37)");
                                    setState(205);
                                    match(DIVIDE_ASGN);
                                    setState(206);
                                    exp(38);
                                }
                                break;
                                case 21: {
                                    _localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(207);
                                    if (!(precpred(_ctx, 36)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 36)");
                                    setState(208);
                                    match(INV_DIVIDE_ASGN);
                                    setState(209);
                                    exp(37);
                                }
                                break;
                                case 22: {
                                    _localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(210);
                                    if (!(precpred(_ctx, 35)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 35)");
                                    setState(211);
                                    match(REMAINDER_ASGN);
                                    setState(212);
                                    exp(36);
                                }
                                break;
                                case 23: {
                                    _localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(213);
                                    if (!(precpred(_ctx, 34)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 34)");
                                    setState(214);
                                    match(POWER_ASGN);
                                    setState(215);
                                    exp(35);
                                }
                                break;
                                case 24: {
                                    _localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(216);
                                    if (!(precpred(_ctx, 33)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 33)");
                                    setState(217);
                                    match(BITWISE_AND_ASGN);
                                    setState(218);
                                    exp(34);
                                }
                                break;
                                case 25: {
                                    _localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(219);
                                    if (!(precpred(_ctx, 32)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 32)");
                                    setState(220);
                                    match(BITWISE_OR_ASGN);
                                    setState(221);
                                    exp(33);
                                }
                                break;
                                case 26: {
                                    _localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(222);
                                    if (!(precpred(_ctx, 31)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 31)");
                                    setState(223);
                                    match(BITWISE_XOR_ASGN);
                                    setState(224);
                                    exp(32);
                                }
                                break;
                                case 27: {
                                    _localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(225);
                                    if (!(precpred(_ctx, 30)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 30)");
                                    setState(226);
                                    match(LSR_ASGN);
                                    setState(227);
                                    exp(31);
                                }
                                break;
                                case 28: {
                                    _localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(228);
                                    if (!(precpred(_ctx, 29)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 29)");
                                    setState(229);
                                    match(ASR_ASGN);
                                    setState(230);
                                    exp(30);
                                }
                                break;
                                case 29: {
                                    _localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(231);
                                    if (!(precpred(_ctx, 28)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 28)");
                                    setState(232);
                                    match(ASL_ASGN);
                                    setState(233);
                                    exp(29);
                                }
                                break;
                                case 30: {
                                    _localctx = new PairContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(234);
                                    if (!(precpred(_ctx, 27)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                                    setState(235);
                                    match(DOUBLE_ARROW);
                                    setState(236);
                                    exp(28);
                                }
                                break;
                                case 31: {
                                    _localctx = new RangeContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(237);
                                    if (!(precpred(_ctx, 24)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(238);
                                    match(COLON);
                                    setState(239);
                                    exp(25);
                                }
                                break;
                                case 32: {
                                    _localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(240);
                                    if (!(precpred(_ctx, 63)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 63)");
                                    setState(241);
                                    match(INSTANCE_OF);
                                    setState(242);
                                    typeExpression();
                                }
                                break;
                                case 33: {
                                    _localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(243);
                                    if (!(precpred(_ctx, 26)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                                    setState(244);
                                    match(ELLIPSE);
                                }
                                break;
                            }
                        }
                    }
                    setState(249);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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

    public final ModuleDirectiveContext moduleDirective() throws RecognitionException {
        ModuleDirectiveContext _localctx = new ModuleDirectiveContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_moduleDirective);
        int _la;
        try {
            int _alt;
            setState(296);
            switch (_input.LA(1)) {
                case INCLUDE:
                    _localctx = new IncludeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(250);
                    match(INCLUDE);
                    setState(251);
                    match(LEFT_BRACKET);
                    setState(252);
                    match(STRING);
                    setState(253);
                    match(RIGHT_BRACKET);
                }
                break;
                case USING:
                    _localctx = new UsingContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(254);
                    match(USING);
                    setState(255);
                    match(ID);
                }
                break;
                case IMPORT:
                    _localctx = new ImporttContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(256);
                    match(IMPORT);
                    setState(257);
                    match(ID);
                    setState(258);
                    match(COLON);
                    setState(259);
                    match(ID);
                    setState(264);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(260);
                                match(COMMA);
                                setState(261);
                                match(ID);
                            }
                        }
                        setState(266);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case IMPORT_ALL:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(267);
                    match(IMPORT_ALL);
                    setState(268);
                    match(ID);
                }
                break;
                case EXPORT:
                    _localctx = new ExportContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(269);
                    match(EXPORT);
                    setState(270);
                    match(ID);
                    setState(275);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(271);
                                match(COMMA);
                                setState(272);
                                match(ID);
                            }
                        }
                        setState(277);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case MODULE:
                    _localctx = new ModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(278);
                    match(MODULE);
                    setState(279);
                    match(ID);
                    setState(281);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(280);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(283);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(285);
                    match(END);
                }
                break;
                case BAREMODULE:
                    _localctx = new BareModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(287);
                    match(BAREMODULE);
                    setState(288);
                    match(ID);
                    setState(290);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(289);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(292);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(294);
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

    public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
        FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_functionDeclaration);
        int _la;
        try {
            int _alt;
            setState(319);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new CompactFunctionDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(298);
                    name();
                    setState(300);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(299);
                            typeParameters();
                        }
                    }

                    setState(302);
                    parameters();
                    setState(303);
                    match(EQ);
                    setState(304);
                    exp(0);
                }
                break;
                case FUNCTION:
                    _localctx = new GeneralFunctionDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(306);
                    match(FUNCTION);
                    setState(307);
                    name();
                    setState(309);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(308);
                            typeParameters();
                        }
                    }

                    setState(311);
                    parameters();
                    setState(313);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(312);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(315);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(317);
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
                setState(321);
                match(LEFT_BRACKET);
                setState(330);
                _la = _input.LA(1);
                if (_la == INSTANCE_OF || _la == ID) {
                    {
                        setState(322);
                        parameter();
                        setState(327);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(323);
                                    match(COMMA);
                                    setState(324);
                                    parameter();
                                }
                            }
                            setState(329);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(333);
                _la = _input.LA(1);
                if (_la == ELLIPSE) {
                    {
                        setState(332);
                        match(ELLIPSE);
                    }
                }

                setState(335);
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
            setState(343);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    _localctx = new NamedTypedParamContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(337);
                    match(ID);
                    setState(338);
                    match(INSTANCE_OF);
                    setState(339);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new AnonymousTypedParamContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(340);
                    match(INSTANCE_OF);
                    setState(341);
                    typeExpression();
                }
                break;
                case 3:
                    _localctx = new NamedParamContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(342);
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

    public final TypeExpressionContext typeExpression() throws RecognitionException {
        TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_typeExpression);
        int _la;
        try {
            int _alt;
            setState(490);
            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                case 1:
                    _localctx = new Int8Context(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(345);
                    match(INT8);
                }
                break;
                case 2:
                    _localctx = new Uint8Context(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(346);
                    match(UINT8);
                }
                break;
                case 3:
                    _localctx = new Int16Context(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(347);
                    match(INT16);
                }
                break;
                case 4:
                    _localctx = new Uint16Context(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(348);
                    match(UINT16);
                }
                break;
                case 5:
                    _localctx = new Int32Context(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(349);
                    match(INT32);
                }
                break;
                case 6:
                    _localctx = new Uint32Context(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(350);
                    match(UINT32);
                }
                break;
                case 7:
                    _localctx = new Int64Context(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(351);
                    match(INT64);
                }
                break;
                case 8:
                    _localctx = new Uint64Context(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(352);
                    match(UINT64);
                }
                break;
                case 9:
                    _localctx = new Int128Context(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(353);
                    match(INT128);
                }
                break;
                case 10:
                    _localctx = new Uint128Context(_localctx);
                    enterOuterAlt(_localctx, 10);
                {
                    setState(354);
                    match(UINT128);
                }
                break;
                case 11:
                    _localctx = new BoolContext(_localctx);
                    enterOuterAlt(_localctx, 11);
                {
                    setState(355);
                    match(BOOL);
                }
                break;
                case 12:
                    _localctx = new CharContext(_localctx);
                    enterOuterAlt(_localctx, 12);
                {
                    setState(356);
                    match(CHAR);
                }
                break;
                case 13:
                    _localctx = new Float16Context(_localctx);
                    enterOuterAlt(_localctx, 13);
                {
                    setState(357);
                    match(FLOAT16);
                }
                break;
                case 14:
                    _localctx = new Float32Context(_localctx);
                    enterOuterAlt(_localctx, 14);
                {
                    setState(358);
                    match(FLOAT32);
                }
                break;
                case 15:
                    _localctx = new Float64Context(_localctx);
                    enterOuterAlt(_localctx, 15);
                {
                    setState(359);
                    match(FLOAT64);
                }
                break;
                case 16:
                    _localctx = new AbstractSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 16);
                {
                    setState(360);
                    match(ABSTRACT);
                    setState(361);
                    match(ID);
                    setState(362);
                    match(SUB_TYPE);
                    setState(363);
                    match(ID);
                }
                break;
                case 17:
                    _localctx = new AbstractTypeContext(_localctx);
                    enterOuterAlt(_localctx, 17);
                {
                    setState(364);
                    match(ABSTRACT);
                    setState(365);
                    match(ID);
                }
                break;
                case 18:
                    _localctx = new BitsSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 18);
                {
                    setState(366);
                    match(BITS_TYPE);
                    setState(367);
                    match(SIZE);
                    setState(368);
                    match(ID);
                    setState(369);
                    match(SUB_TYPE);
                    setState(370);
                    match(ID);
                }
                break;
                case 19:
                    _localctx = new BitsTtypeContext(_localctx);
                    enterOuterAlt(_localctx, 19);
                {
                    setState(371);
                    match(BITS_TYPE);
                    setState(372);
                    match(SIZE);
                    setState(373);
                    match(ID);
                }
                break;
                case 20:
                    _localctx = new SubTypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 20);
                {
                    setState(374);
                    match(TYPE);
                    setState(375);
                    match(ID);
                    setState(377);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(376);
                            typeParameters();
                        }
                    }

                    setState(379);
                    match(SUB_TYPE);
                    setState(380);
                    match(ID);
                    setState(382);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(381);
                            typeParameters();
                        }
                    }

                    setState(387);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(384);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(389);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    }
                    setState(393);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(390);
                                functionDeclaration();
                            }
                        }
                        setState(395);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(396);
                    match(END);
                }
                break;
                case 21:
                    _localctx = new TypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 21);
                {
                    setState(397);
                    match(TYPE);
                    setState(398);
                    match(ID);
                    setState(400);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(399);
                            typeParameters();
                        }
                    }

                    setState(405);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(402);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(407);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                    }
                    setState(411);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(408);
                                functionDeclaration();
                            }
                        }
                        setState(413);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(414);
                    match(END);
                }
                break;
                case 22:
                    _localctx = new ImmutableTypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 22);
                {
                    setState(415);
                    match(IMMUTABLE);
                    setState(416);
                    match(ID);
                    setState(418);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(417);
                            typeParameters();
                        }
                    }

                    setState(423);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 35, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(420);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(425);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 35, _ctx);
                    }
                    setState(429);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(426);
                                functionDeclaration();
                            }
                        }
                        setState(431);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(432);
                    match(END);
                }
                break;
                case 23:
                    _localctx = new ImmutableSubTypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 23);
                {
                    setState(433);
                    match(IMMUTABLE);
                    setState(434);
                    match(ID);
                    setState(436);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(435);
                            typeParameters();
                        }
                    }

                    setState(438);
                    match(SUB_TYPE);
                    setState(439);
                    match(ID);
                    setState(441);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(440);
                            typeParameters();
                        }
                    }

                    setState(446);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(443);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(448);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
                    }
                    setState(452);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(449);
                                functionDeclaration();
                            }
                        }
                        setState(454);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(455);
                    match(END);
                }
                break;
                case 24:
                    _localctx = new UnionTypeContext(_localctx);
                    enterOuterAlt(_localctx, 24);
                {
                    setState(456);
                    match(UNION);
                    setState(457);
                    match(LEFT_CURLY);
                    setState(460);
                    switch (_input.LA(1)) {
                        case ABSTRACT:
                        case BITS_TYPE:
                        case TYPE:
                        case IMMUTABLE:
                        case UNION:
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
                        case ID: {
                            setState(458);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(459);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(467);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(462);
                                match(COMMA);
                                setState(465);
                                switch (_input.LA(1)) {
                                    case ABSTRACT:
                                    case BITS_TYPE:
                                    case TYPE:
                                    case IMMUTABLE:
                                    case UNION:
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
                                    case ID: {
                                        setState(463);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(464);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(469);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == COMMA);
                    setState(471);
                    match(RIGHT_CURLY);
                }
                break;
                case 25:
                    _localctx = new ParametricTypeContext(_localctx);
                    enterOuterAlt(_localctx, 25);
                {
                    setState(472);
                    match(ID);
                    setState(473);
                    match(LEFT_CURLY);
                    setState(476);
                    switch (_input.LA(1)) {
                        case ABSTRACT:
                        case BITS_TYPE:
                        case TYPE:
                        case IMMUTABLE:
                        case UNION:
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
                        case ID: {
                            setState(474);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(475);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(485);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(478);
                                match(COMMA);
                                setState(481);
                                switch (_input.LA(1)) {
                                    case ABSTRACT:
                                    case BITS_TYPE:
                                    case TYPE:
                                    case IMMUTABLE:
                                    case UNION:
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
                                    case ID: {
                                        setState(479);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(480);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(487);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(488);
                    match(RIGHT_CURLY);
                }
                break;
                case 26:
                    _localctx = new TypeReferenceContext(_localctx);
                    enterOuterAlt(_localctx, 26);
                {
                    setState(489);
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

    public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
        FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_fieldDeclaration);
        try {
            setState(496);
            switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
                case 1:
                    _localctx = new TypedFieldDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(492);
                    match(ID);
                    setState(493);
                    match(INSTANCE_OF);
                    setState(494);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new UntypedFieldDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(495);
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
                setState(498);
                match(LEFT_CURLY);
                setState(499);
                typeParameter();
                setState(504);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(500);
                            match(COMMA);
                            setState(501);
                            typeParameter();
                        }
                    }
                    setState(506);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(507);
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
            setState(516);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
                case 1:
                    _localctx = new NamedSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(509);
                    match(ID);
                    setState(510);
                    match(SUB_TYPE);
                    setState(511);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new InstanceContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(512);
                    match(INSTANCE_OF);
                    setState(513);
                    typeExpression();
                }
                break;
                case 3:
                    _localctx = new TxContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(514);
                    typeExpression();
                }
                break;
                case 4:
                    _localctx = new NumberContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(515);
                    match(INT);
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

    public final TypeAliasContext typeAlias() throws RecognitionException {
        TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_typeAlias);
        int _la;
        try {
            _localctx = new TtypeAliasContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(518);
                match(TYPE_ALIAS);
                setState(519);
                match(ID);
                setState(521);
                _la = _input.LA(1);
                if (_la == LEFT_CURLY) {
                    {
                        setState(520);
                        typeParameters();
                    }
                }

                setState(523);
                typeExpression();
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
        enterRule(_localctx, 24, RULE_forStatement);
        try {
            int _alt;
            setState(564);
            switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                case 1:
                    _localctx = new ForEqContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(525);
                    match(FOR);
                    setState(526);
                    exp(0);
                    setState(527);
                    match(EQ);
                    setState(528);
                    exp(0);
                    setState(529);
                    match(COLON);
                    setState(530);
                    exp(0);
                    setState(532);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(531);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(534);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 52, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(536);
                    match(END);
                }
                break;
                case 2:
                    _localctx = new ForEqStepContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(538);
                    match(FOR);
                    setState(539);
                    exp(0);
                    setState(540);
                    match(EQ);
                    setState(541);
                    exp(0);
                    setState(542);
                    match(COLON);
                    setState(543);
                    exp(0);
                    setState(544);
                    match(COLON);
                    setState(545);
                    exp(0);
                    setState(547);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(546);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(549);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 53, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(551);
                    match(END);
                }
                break;
                case 3:
                    _localctx = new ForInContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(553);
                    match(FOR);
                    setState(554);
                    exp(0);
                    setState(555);
                    match(IN);
                    setState(556);
                    exp(0);
                    setState(558);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(557);
                                    statement();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(560);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 54, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(562);
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

    public final IfStatementContext ifStatement() throws RecognitionException {
        IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_ifStatement);
        int _la;
        try {
            int _alt;
            _localctx = new ConditionalStatementContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(566);
                match(IF);
                setState(567);
                exp(0);
                setState(569);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(568);
                                statement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(571);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 56, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(581);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ELSE_IF) {
                    {
                        {
                            setState(573);
                            match(ELSE_IF);
                            setState(575);
                            _errHandler.sync(this);
                            _alt = 1;
                            do {
                                switch (_alt) {
                                    case 1: {
                                        {
                                            setState(574);
                                            statement();
                                        }
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                                setState(577);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 57, _ctx);
                            } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                        }
                    }
                    setState(583);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(590);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(584);
                        match(ELSE);
                        setState(586);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1: {
                                    {
                                        setState(585);
                                        statement();
                                    }
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(588);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 59, _ctx);
                        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    }
                }

                setState(592);
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
        enterRule(_localctx, 28, RULE_name);
        try {
            int _alt;
            _localctx = new NnameContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(594);
                match(ID);
                setState(599);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 61, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(595);
                                match(DOT);
                                setState(596);
                                match(ID);
                            }
                        }
                    }
                    setState(601);
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
            case 2:
                return exp_sempred((ExpContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean exp_sempred(ExpContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 62);
            case 1:
                return precpred(_ctx, 61);
            case 2:
                return precpred(_ctx, 60);
            case 3:
                return precpred(_ctx, 59);
            case 4:
                return precpred(_ctx, 58);
            case 5:
                return precpred(_ctx, 57);
            case 6:
                return precpred(_ctx, 56);
            case 7:
                return precpred(_ctx, 55);
            case 8:
                return precpred(_ctx, 54);
            case 9:
                return precpred(_ctx, 53);
            case 10:
                return precpred(_ctx, 52);
            case 11:
                return precpred(_ctx, 51);
            case 12:
                return precpred(_ctx, 49);
            case 13:
                return precpred(_ctx, 48);
            case 14:
                return precpred(_ctx, 42);
            case 15:
                return precpred(_ctx, 41);
            case 16:
                return precpred(_ctx, 40);
            case 17:
                return precpred(_ctx, 39);
            case 18:
                return precpred(_ctx, 38);
            case 19:
                return precpred(_ctx, 37);
            case 20:
                return precpred(_ctx, 36);
            case 21:
                return precpred(_ctx, 35);
            case 22:
                return precpred(_ctx, 34);
            case 23:
                return precpred(_ctx, 33);
            case 24:
                return precpred(_ctx, 32);
            case 25:
                return precpred(_ctx, 31);
            case 26:
                return precpred(_ctx, 30);
            case 27:
                return precpred(_ctx, 29);
            case 28:
                return precpred(_ctx, 28);
            case 29:
                return precpred(_ctx, 27);
            case 30:
                return precpred(_ctx, 24);
            case 31:
                return precpred(_ctx, 63);
            case 32:
                return precpred(_ctx, 26);
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

        public ModuleDirectiveContext moduleDirective() {
            return getRuleContext(ModuleDirectiveContext.class, 0);
        }

        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class, 0);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
        }

        public TypeAliasContext typeAlias() {
            return getRuleContext(TypeAliasContext.class, 0);
        }

        public ForStatementContext forStatement() {
            return getRuleContext(ForStatementContext.class, 0);
        }

        public IfStatementContext ifStatement() {
            return getRuleContext(IfStatementContext.class, 0);
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

    public static class ConditionalContext extends ExpContext {
        public ConditionalContext(ExpContext ctx) {
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
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterConditional(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitConditional(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitConditional(this);
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

    public static class ApplyContext extends ExpContext {
        public ApplyContext(ExpContext ctx) {
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
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterApply(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitApply(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitApply(this);
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

    public static class TypedExpressionContext extends ExpContext {
        public TypedExpressionContext(ExpContext ctx) {
            copyFrom(ctx);
        }

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
        }

        public TerminalNode INSTANCE_OF() {
            return getToken(JuliaParser.INSTANCE_OF, 0);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

        public ExpContext exp() {
            return getRuleContext(ExpContext.class, 0);
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

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

    public static class TypeExpressionContext extends ParserRuleContext {
        public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeExpressionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeExpression;
        }

        public void copyFrom(TypeExpressionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BoolContext extends TypeExpressionContext {
        public BoolContext(TypeExpressionContext ctx) {
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

    public static class TypeDeclarationContext extends TypeExpressionContext {
        public TypeDeclarationContext(TypeExpressionContext ctx) {
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

    public static class Float64Context extends TypeExpressionContext {
        public Float64Context(TypeExpressionContext ctx) {
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

    public static class AbstractSubtypeContext extends TypeExpressionContext {
        public AbstractSubtypeContext(TypeExpressionContext ctx) {
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

    public static class Float16Context extends TypeExpressionContext {
        public Float16Context(TypeExpressionContext ctx) {
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

    public static class Int64Context extends TypeExpressionContext {
        public Int64Context(TypeExpressionContext ctx) {
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

    public static class Int8Context extends TypeExpressionContext {
        public Int8Context(TypeExpressionContext ctx) {
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

    public static class Int128Context extends TypeExpressionContext {
        public Int128Context(TypeExpressionContext ctx) {
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

    public static class TypeReferenceContext extends TypeExpressionContext {
        public TypeReferenceContext(TypeExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeReference(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeReference(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitTypeReference(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Uint32Context extends TypeExpressionContext {
        public Uint32Context(TypeExpressionContext ctx) {
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

    public static class Uint16Context extends TypeExpressionContext {
        public Uint16Context(TypeExpressionContext ctx) {
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

    public static class AbstractTypeContext extends TypeExpressionContext {
        public AbstractTypeContext(TypeExpressionContext ctx) {
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

    public static class ImmutableSubTypeDeclarationContext extends TypeExpressionContext {
        public ImmutableSubTypeDeclarationContext(TypeExpressionContext ctx) {
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

    public static class ParametricTypeContext extends TypeExpressionContext {
        public ParametricTypeContext(TypeExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TerminalNode LEFT_CURLY() {
            return getToken(JuliaParser.LEFT_CURLY, 0);
        }

        public TerminalNode RIGHT_CURLY() {
            return getToken(JuliaParser.RIGHT_CURLY, 0);
        }

        public List<TypeExpressionContext> typeExpression() {
            return getRuleContexts(TypeExpressionContext.class);
        }

        public TypeExpressionContext typeExpression(int i) {
            return getRuleContext(TypeExpressionContext.class, i);
        }

        public List<TerminalNode> INT() {
            return getTokens(JuliaParser.INT);
        }

        public TerminalNode INT(int i) {
            return getToken(JuliaParser.INT, i);
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

    public static class BitsSubtypeContext extends TypeExpressionContext {
        public BitsSubtypeContext(TypeExpressionContext ctx) {
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

    public static class Float32Context extends TypeExpressionContext {
        public Float32Context(TypeExpressionContext ctx) {
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

    public static class Int16Context extends TypeExpressionContext {
        public Int16Context(TypeExpressionContext ctx) {
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

    public static class Uint128Context extends TypeExpressionContext {
        public Uint128Context(TypeExpressionContext ctx) {
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

    public static class ImmutableTypeDeclarationContext extends TypeExpressionContext {
        public ImmutableTypeDeclarationContext(TypeExpressionContext ctx) {
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

    public static class Int32Context extends TypeExpressionContext {
        public Int32Context(TypeExpressionContext ctx) {
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

    public static class CharContext extends TypeExpressionContext {
        public CharContext(TypeExpressionContext ctx) {
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

    public static class Uint64Context extends TypeExpressionContext {
        public Uint64Context(TypeExpressionContext ctx) {
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

    public static class Uint8Context extends TypeExpressionContext {
        public Uint8Context(TypeExpressionContext ctx) {
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

    public static class BitsTtypeContext extends TypeExpressionContext {
        public BitsTtypeContext(TypeExpressionContext ctx) {
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

    public static class SubTypeDeclarationContext extends TypeExpressionContext {
        public SubTypeDeclarationContext(TypeExpressionContext ctx) {
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

    public static class UnionTypeContext extends TypeExpressionContext {
        public UnionTypeContext(TypeExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode UNION() {
            return getToken(JuliaParser.UNION, 0);
        }

        public TerminalNode LEFT_CURLY() {
            return getToken(JuliaParser.LEFT_CURLY, 0);
        }

        public TerminalNode RIGHT_CURLY() {
            return getToken(JuliaParser.RIGHT_CURLY, 0);
        }

        public List<TypeExpressionContext> typeExpression() {
            return getRuleContexts(TypeExpressionContext.class);
        }

        public TypeExpressionContext typeExpression(int i) {
            return getRuleContext(TypeExpressionContext.class, i);
        }

        public List<TerminalNode> INT() {
            return getTokens(JuliaParser.INT);
        }

        public TerminalNode INT(int i) {
            return getToken(JuliaParser.INT, i);
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

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

    public static class NumberContext extends TypeParameterContext {
        public NumberContext(TypeParameterContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INT() {
            return getToken(JuliaParser.INT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InstanceContext extends TypeParameterContext {
        public InstanceContext(TypeParameterContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INSTANCE_OF() {
            return getToken(JuliaParser.INSTANCE_OF, 0);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

    public static class TxContext extends TypeParameterContext {
        public TxContext(TypeParameterContext ctx) {
            copyFrom(ctx);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTx(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTx(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor) return ((JuliaParserVisitor<? extends T>) visitor).visitTx(this);
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

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
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

    public static class TypeAliasContext extends ParserRuleContext {
        public TypeAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeAliasContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeAlias;
        }

        public void copyFrom(TypeAliasContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TtypeAliasContext extends TypeAliasContext {
        public TtypeAliasContext(TypeAliasContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TYPE_ALIAS() {
            return getToken(JuliaParser.TYPE_ALIAS, 0);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTtypeAlias(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTtypeAlias(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitTtypeAlias(this);
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

    public static class IfStatementContext extends ParserRuleContext {
        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public IfStatementContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        public void copyFrom(IfStatementContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ConditionalStatementContext extends IfStatementContext {
        public ConditionalStatementContext(IfStatementContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IF() {
            return getToken(JuliaParser.IF, 0);
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
            if (listener instanceof JuliaParserListener)
                ((JuliaParserListener) listener).enterConditionalStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener)
                ((JuliaParserListener) listener).exitConditionalStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitConditionalStatement(this);
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