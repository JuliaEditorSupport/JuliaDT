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
            EQ = 1, ADD_ASGN = 2, SUB_ASGN = 3, TIMES_ASGN = 4, DIVIDE_ASGN = 5, INV_DIVIDE_ASGN = 6,
            REMAINDER_ASGN = 7, POWER_ASGN = 8, BITWISE_AND_ASGN = 9, BITWISE_OR_ASGN = 10,
            BITWISE_XOR_ASGN = 11, LSR_ASGN = 12, ASR_ASGN = 13, ELLIPSE = 14, ASL_ASGN = 15,
            QUESTION_MARK = 16, IN = 17, IF = 18, ELSE_IF = 19, ELSE = 20, FOR = 21, CONST = 22,
            INCLUDE = 23, USING = 24, IMPORT = 25, COLON = 26, COMMA = 27, IMPORT_ALL = 28, EXPORT = 29,
            MODULE = 30, END = 31, BAREMODULE = 32, INF16 = 33, INF32 = 34, INF = 35, MINUS_INF16 = 36,
            MINUS_INF32 = 37, MINUS_INF = 38, NAN16 = 39, NAN32 = 40, NAN = 41, MINUS = 42, INSTANCE_OF = 43,
            EXPONENT = 44, FRACTION = 45, TIMES = 46, DIVIDE = 47, PLUS = 48, NOT_EQUAL = 49,
            GREATER_THAN = 50, LESS_THAN = 51, GREATER_THAN_OR_EQ = 52, LESS_THAN_OR_EQ = 53,
            EQUALS = 54, NOT = 55, AND = 56, OR = 57, LEFT_BRACKET = 58, RIGHT_BRACKET = 59, TRUE = 60,
            FALSE = 61, ABSTRACT = 62, SUB_TYPE = 63, BITS_TYPE = 64, TYPE_ALIAS = 65, TYPE = 66,
            IMMUTABLE = 67, UNION = 68, FUNCTION = 69, LEFT_CURLY = 70, RIGHT_CURLY = 71, LEFT_SQUARE = 72,
            RIGHT_SQUARE = 73, INT8 = 74, UINT8 = 75, INT16 = 76, UINT16 = 77, INT32 = 78, UINT32 = 79,
            INT64 = 80, UINT64 = 81, INT128 = 82, UINT128 = 83, BOOL = 84, CHAR = 85, FLOAT16 = 86,
            FLOAT32 = 87, FLOAT64 = 88, INT = 89, BINARY = 90, OCTAL = 91, HEX = 92, FLOAT32_LITERAL = 93,
            EXP32 = 94, FLOAT64_LITERAL = 95, EXP64 = 96, ID = 97, STRING = 98, WS = 99, LINE_COMMENT = 100,
            SIZE = 101;
    public static final int
            RULE_unit = 0, RULE_statement = 1, RULE_exp = 2, RULE_moduleDirective = 3,
            RULE_functionDeclaration = 4, RULE_parameters = 5, RULE_parameter = 6,
            RULE_typeExpression = 7, RULE_fieldDeclaration = 8, RULE_typeParameters = 9,
            RULE_typeParameter = 10, RULE_typeAlias = 11, RULE_forStatement = 12,
            RULE_ifStatement = 13;
    public static final String[] ruleNames = {
            "unit", "statement", "exp", "moduleDirective", "functionDeclaration",
            "parameters", "parameter", "typeExpression", "fieldDeclaration", "typeParameters",
            "typeParameter", "typeAlias", "forStatement", "ifStatement"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3g\u0220\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3\4\3\4\3" +
                    "\4\7\4H\n\4\f\4\16\4K\13\4\3\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4V\n" +
                    "\4\f\4\16\4Y\13\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3\4\7\4c\n\4\f\4\16\4" +
                    "f\13\4\3\4\5\4i\n\4\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\4\5" +
                    "\4v\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0085" +
                    "\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e6\n\4\f\4\16\4\u00e9\13\4\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f7\n\5\f\5\16\5" +
                    "\u00fa\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0102\n\5\f\5\16\5\u0105\13\5" +
                    "\3\5\3\5\3\5\6\5\u010a\n\5\r\5\16\5\u010b\3\5\3\5\3\5\3\5\3\5\6\5\u0113" +
                    "\n\5\r\5\16\5\u0114\3\5\3\5\5\5\u0119\n\5\3\6\3\6\5\6\u011d\n\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\5\6\u0126\n\6\3\6\3\6\6\6\u012a\n\6\r\6\16\6\u012b" +
                    "\3\6\3\6\5\6\u0130\n\6\3\7\3\7\3\7\3\7\7\7\u0136\n\7\f\7\16\7\u0139\13" +
                    "\7\5\7\u013b\n\7\3\7\5\7\u013e\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b" +
                    "\u0148\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\7\t\u016b\n\t\f\t\16\t\u016e\13\t\3\t\7\t\u0171\n\t\f\t\16\t\u0174" +
                    "\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u017b\n\t\f\t\16\t\u017e\13\t\3\t\7\t\u0181" +
                    "\n\t\f\t\16\t\u0184\13\t\3\t\3\t\3\t\3\t\7\t\u018a\n\t\f\t\16\t\u018d" +
                    "\13\t\3\t\7\t\u0190\n\t\f\t\16\t\u0193\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u019a" +
                    "\n\t\3\t\3\t\3\t\5\t\u019f\n\t\6\t\u01a1\n\t\r\t\16\t\u01a2\3\t\3\t\3" +
                    "\t\3\t\3\t\5\t\u01aa\n\t\3\t\3\t\3\t\5\t\u01af\n\t\7\t\u01b1\n\t\f\t\16" +
                    "\t\u01b4\13\t\3\t\3\t\5\t\u01b8\n\t\3\n\3\n\3\n\3\n\5\n\u01be\n\n\3\13" +
                    "\3\13\3\13\3\13\7\13\u01c4\n\13\f\13\16\13\u01c7\13\13\3\13\3\13\3\f\3" +
                    "\f\3\f\3\f\3\f\3\f\3\f\5\f\u01d2\n\f\3\r\3\r\3\r\5\r\u01d7\n\r\3\r\3\r" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u01e2\n\16\r\16\16\16\u01e3\3" +
                    "\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u01f1\n\16" +
                    "\r\16\16\16\u01f2\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u01fc\n\16\r" +
                    "\16\16\16\u01fd\3\16\3\16\5\16\u0202\n\16\3\17\3\17\3\17\6\17\u0207\n" +
                    "\17\r\17\16\17\u0208\3\17\3\17\6\17\u020d\n\17\r\17\16\17\u020e\7\17\u0211" +
                    "\n\17\f\17\16\17\u0214\13\17\3\17\3\17\6\17\u0218\n\17\r\17\16\17\u0219" +
                    "\5\17\u021c\n\17\3\17\3\17\3\17\2\3\6\20\2\4\6\b\n\f\16\20\22\24\26\30" +
                    "\32\34\2\2\u02a1\2!\3\2\2\2\4+\3\2\2\2\6\u0084\3\2\2\2\b\u0118\3\2\2\2" +
                    "\n\u012f\3\2\2\2\f\u0131\3\2\2\2\16\u0147\3\2\2\2\20\u01b7\3\2\2\2\22" +
                    "\u01bd\3\2\2\2\24\u01bf\3\2\2\2\26\u01d1\3\2\2\2\30\u01d3\3\2\2\2\32\u0201" +
                    "\3\2\2\2\34\u0203\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2" +
                    "\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$,\5\b\5\2%,\5\n\6\2&,\5\20\t\2\'" +
                    ",\5\30\r\2(,\5\32\16\2),\5\34\17\2*,\5\6\4\2+$\3\2\2\2+%\3\2\2\2+&\3\2" +
                    "\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\b\4\1\2./\7" +
                    ",\2\2/\u0085\5\6\4\63\60\61\79\2\2\61\u0085\5\6\4%\62\63\7\30\2\2\63\64" +
                    "\7c\2\2\64\65\7\3\2\2\65\u0085\5\6\4\3\66\u0085\7#\2\2\67\u0085\7$\2\2" +
                    "8\u0085\7%\2\29\u0085\7&\2\2:\u0085\7\'\2\2;\u0085\7(\2\2<\u0085\7)\2" +
                    "\2=\u0085\7*\2\2>\u0085\7+\2\2?A\7c\2\2@B\5\24\13\2A@\3\2\2\2AB\3\2\2" +
                    "\2BC\3\2\2\2CM\7<\2\2DE\5\6\4\2EF\7\35\2\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2" +
                    "\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LN\5\6\4\2MI\3\2\2\2MN\3\2\2" +
                    "\2NO\3\2\2\2O\u0085\7=\2\2PQ\7c\2\2QW\7J\2\2RS\5\6\4\2ST\7\35\2\2TV\3" +
                    "\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2Z\\" +
                    "\5\6\4\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]\u0085\7K\2\2^d\7<\2\2_`\5\6" +
                    "\4\2`a\7\35\2\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eh\3" +
                    "\2\2\2fd\3\2\2\2gi\5\6\4\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2j\u0085\7=\2\2" +
                    "kq\7J\2\2lm\5\6\4\2mn\7\35\2\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2" +
                    "qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tv\5\6\4\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2" +
                    "w\u0085\7K\2\2x\u0085\7>\2\2y\u0085\7?\2\2z\u0085\7[\2\2{\u0085\7\\\2" +
                    "\2|\u0085\7]\2\2}\u0085\7^\2\2~\u0085\7Y\2\2\177\u0085\7Z\2\2\u0080\u0085" +
                    "\7d\2\2\u0081\u0085\7c\2\2\u0082\u0083\7\34\2\2\u0083\u0085\7c\2\2\u0084" +
                    "-\3\2\2\2\u0084\60\3\2\2\2\u0084\62\3\2\2\2\u0084\66\3\2\2\2\u0084\67" +
                    "\3\2\2\2\u00848\3\2\2\2\u00849\3\2\2\2\u0084:\3\2\2\2\u0084;\3\2\2\2\u0084" +
                    "<\3\2\2\2\u0084=\3\2\2\2\u0084>\3\2\2\2\u0084?\3\2\2\2\u0084P\3\2\2\2" +
                    "\u0084^\3\2\2\2\u0084k\3\2\2\2\u0084x\3\2\2\2\u0084y\3\2\2\2\u0084z\3" +
                    "\2\2\2\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084" +
                    "\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2" +
                    "\2\u0085\u00e7\3\2\2\2\u0086\u0087\f\61\2\2\u0087\u0088\7/\2\2\u0088\u00e6" +
                    "\5\6\4\62\u0089\u008a\f\60\2\2\u008a\u008b\7\60\2\2\u008b\u00e6\5\6\4" +
                    "\61\u008c\u008d\f/\2\2\u008d\u008e\7\61\2\2\u008e\u00e6\5\6\4\60\u008f" +
                    "\u0090\f.\2\2\u0090\u0091\7\62\2\2\u0091\u00e6\5\6\4/\u0092\u0093\f-\2" +
                    "\2\u0093\u0094\7,\2\2\u0094\u00e6\5\6\4.\u0095\u0096\f,\2\2\u0096\u0097" +
                    "\7\64\2\2\u0097\u00e6\5\6\4-\u0098\u0099\f+\2\2\u0099\u009a\7\65\2\2\u009a" +
                    "\u00e6\5\6\4,\u009b\u009c\f*\2\2\u009c\u009d\7\66\2\2\u009d\u00e6\5\6" +
                    "\4+\u009e\u009f\f)\2\2\u009f\u00a0\7\67\2\2\u00a0\u00e6\5\6\4*\u00a1\u00a2" +
                    "\f(\2\2\u00a2\u00a3\78\2\2\u00a3\u00e6\5\6\4)\u00a4\u00a5\f\'\2\2\u00a5" +
                    "\u00a6\7A\2\2\u00a6\u00e6\5\6\4(\u00a7\u00a8\f&\2\2\u00a8\u00a9\7\22\2" +
                    "\2\u00a9\u00aa\5\6\4\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5\6\4\'\u00ac" +
                    "\u00e6\3\2\2\2\u00ad\u00ae\f$\2\2\u00ae\u00af\7:\2\2\u00af\u00e6\5\6\4" +
                    "%\u00b0\u00b1\f#\2\2\u00b1\u00b2\7;\2\2\u00b2\u00e6\5\6\4$\u00b3\u00b4" +
                    "\f\37\2\2\u00b4\u00b5\7\63\2\2\u00b5\u00e6\5\6\4 \u00b6\u00b7\f\36\2\2" +
                    "\u00b7\u00b8\7\3\2\2\u00b8\u00e6\5\6\4\37\u00b9\u00ba\f\35\2\2\u00ba\u00bb" +
                    "\7\4\2\2\u00bb\u00e6\5\6\4\36\u00bc\u00bd\f\34\2\2\u00bd\u00be\7\5\2\2" +
                    "\u00be\u00e6\5\6\4\35\u00bf\u00c0\f\33\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00e6" +
                    "\5\6\4\34\u00c2\u00c3\f\32\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00e6\5\6\4\33" +
                    "\u00c5\u00c6\f\31\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00e6\5\6\4\32\u00c8\u00c9" +
                    "\f\30\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00e6\5\6\4\31\u00cb\u00cc\f\27\2" +
                    "\2\u00cc\u00cd\7\n\2\2\u00cd\u00e6\5\6\4\30\u00ce\u00cf\f\26\2\2\u00cf" +
                    "\u00d0\7\13\2\2\u00d0\u00e6\5\6\4\27\u00d1\u00d2\f\25\2\2\u00d2\u00d3" +
                    "\7\f\2\2\u00d3\u00e6\5\6\4\26\u00d4\u00d5\f\24\2\2\u00d5\u00d6\7\r\2\2" +
                    "\u00d6\u00e6\5\6\4\25\u00d7\u00d8\f\23\2\2\u00d8\u00d9\7\16\2\2\u00d9" +
                    "\u00e6\5\6\4\24\u00da\u00db\f\22\2\2\u00db\u00dc\7\17\2\2\u00dc\u00e6" +
                    "\5\6\4\23\u00dd\u00de\f\21\2\2\u00de\u00df\7\21\2\2\u00df\u00e6\5\6\4" +
                    "\22\u00e0\u00e1\f\62\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e6\5\20\t\2\u00e3" +
                    "\u00e4\f\20\2\2\u00e4\u00e6\7\20\2\2\u00e5\u0086\3\2\2\2\u00e5\u0089\3" +
                    "\2\2\2\u00e5\u008c\3\2\2\2\u00e5\u008f\3\2\2\2\u00e5\u0092\3\2\2\2\u00e5" +
                    "\u0095\3\2\2\2\u00e5\u0098\3\2\2\2\u00e5\u009b\3\2\2\2\u00e5\u009e\3\2" +
                    "\2\2\u00e5\u00a1\3\2\2\2\u00e5\u00a4\3\2\2\2\u00e5\u00a7\3\2\2\2\u00e5" +
                    "\u00ad\3\2\2\2\u00e5\u00b0\3\2\2\2\u00e5\u00b3\3\2\2\2\u00e5\u00b6\3\2" +
                    "\2\2\u00e5\u00b9\3\2\2\2\u00e5\u00bc\3\2\2\2\u00e5\u00bf\3\2\2\2\u00e5" +
                    "\u00c2\3\2\2\2\u00e5\u00c5\3\2\2\2\u00e5\u00c8\3\2\2\2\u00e5\u00cb\3\2" +
                    "\2\2\u00e5\u00ce\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d4\3\2\2\2\u00e5" +
                    "\u00d7\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e0\3\2" +
                    "\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7" +
                    "\u00e8\3\2\2\2\u00e8\7\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\31\2" +
                    "\2\u00eb\u00ec\7<\2\2\u00ec\u00ed\7d\2\2\u00ed\u0119\7=\2\2\u00ee\u00ef" +
                    "\7\32\2\2\u00ef\u0119\7c\2\2\u00f0\u00f1\7\33\2\2\u00f1\u00f2\7c\2\2\u00f2" +
                    "\u00f3\7\34\2\2\u00f3\u00f8\7c\2\2\u00f4\u00f5\7\35\2\2\u00f5\u00f7\7" +
                    "c\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8" +
                    "\u00f9\3\2\2\2\u00f9\u0119\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\36" +
                    "\2\2\u00fc\u0119\7c\2\2\u00fd\u00fe\7\37\2\2\u00fe\u0103\7c\2\2\u00ff" +
                    "\u0100\7\35\2\2\u0100\u0102\7c\2\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2" +
                    "\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0119\3\2\2\2\u0105" +
                    "\u0103\3\2\2\2\u0106\u0107\7 \2\2\u0107\u0109\7c\2\2\u0108\u010a\5\4\3" +
                    "\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c" +
                    "\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7!\2\2\u010e\u0119\3\2\2\2\u010f" +
                    "\u0110\7\"\2\2\u0110\u0112\7c\2\2\u0111\u0113\5\4\3\2\u0112\u0111\3\2" +
                    "\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115" +
                    "\u0116\3\2\2\2\u0116\u0117\7!\2\2\u0117\u0119\3\2\2\2\u0118\u00ea\3\2" +
                    "\2\2\u0118\u00ee\3\2\2\2\u0118\u00f0\3\2\2\2\u0118\u00fb\3\2\2\2\u0118" +
                    "\u00fd\3\2\2\2\u0118\u0106\3\2\2\2\u0118\u010f\3\2\2\2\u0119\t\3\2\2\2" +
                    "\u011a\u011c\7c\2\2\u011b\u011d\5\24\13\2\u011c\u011b\3\2\2\2\u011c\u011d" +
                    "\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5\f\7\2\u011f\u0120\7\3\2\2\u0120" +
                    "\u0121\5\6\4\2\u0121\u0130\3\2\2\2\u0122\u0123\7G\2\2\u0123\u0125\7c\2" +
                    "\2\u0124\u0126\5\24\13\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126" +
                    "\u0127\3\2\2\2\u0127\u0129\5\f\7\2\u0128\u012a\5\4\3\2\u0129\u0128\3\2" +
                    "\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c" +
                    "\u012d\3\2\2\2\u012d\u012e\7!\2\2\u012e\u0130\3\2\2\2\u012f\u011a\3\2" +
                    "\2\2\u012f\u0122\3\2\2\2\u0130\13\3\2\2\2\u0131\u013a\7<\2\2\u0132\u0137" +
                    "\5\16\b\2\u0133\u0134\7\35\2\2\u0134\u0136\5\16\b\2\u0135\u0133\3\2\2" +
                    "\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013b" +
                    "\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0132\3\2\2\2\u013a\u013b\3\2\2\2\u013b" +
                    "\u013d\3\2\2\2\u013c\u013e\7\20\2\2\u013d\u013c\3\2\2\2\u013d\u013e\3" +
                    "\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7=\2\2\u0140\r\3\2\2\2\u0141\u0142" +
                    "\7c\2\2\u0142\u0143\7-\2\2\u0143\u0148\5\20\t\2\u0144\u0145\7-\2\2\u0145" +
                    "\u0148\5\20\t\2\u0146\u0148\7c\2\2\u0147\u0141\3\2\2\2\u0147\u0144\3\2" +
                    "\2\2\u0147\u0146\3\2\2\2\u0148\17\3\2\2\2\u0149\u01b8\7L\2\2\u014a\u01b8" +
                    "\7M\2\2\u014b\u01b8\7N\2\2\u014c\u01b8\7O\2\2\u014d\u01b8\7P\2\2\u014e" +
                    "\u01b8\7Q\2\2\u014f\u01b8\7R\2\2\u0150\u01b8\7S\2\2\u0151\u01b8\7T\2\2" +
                    "\u0152\u01b8\7U\2\2\u0153\u01b8\7V\2\2\u0154\u01b8\7W\2\2\u0155\u01b8" +
                    "\7X\2\2\u0156\u01b8\7Y\2\2\u0157\u01b8\7Z\2\2\u0158\u0159\7@\2\2\u0159" +
                    "\u015a\7c\2\2\u015a\u015b\7A\2\2\u015b\u01b8\7c\2\2\u015c\u015d\7@\2\2" +
                    "\u015d\u01b8\7c\2\2\u015e\u015f\7B\2\2\u015f\u0160\7g\2\2\u0160\u0161" +
                    "\7c\2\2\u0161\u0162\7A\2\2\u0162\u01b8\7c\2\2\u0163\u0164\7B\2\2\u0164" +
                    "\u0165\7g\2\2\u0165\u01b8\7c\2\2\u0166\u0167\7D\2\2\u0167\u0168\7c\2\2" +
                    "\u0168\u016c\5\24\13\2\u0169\u016b\5\22\n\2\u016a\u0169\3\2\2\2\u016b" +
                    "\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2" +
                    "\2\2\u016e\u016c\3\2\2\2\u016f\u0171\5\n\6\2\u0170\u016f\3\2\2\2\u0171" +
                    "\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2" +
                    "\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7!\2\2\u0176\u01b8\3\2\2\2\u0177" +
                    "\u0178\7D\2\2\u0178\u017c\7c\2\2\u0179\u017b\5\22\n\2\u017a\u0179\3\2" +
                    "\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d" +
                    "\u0182\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\5\n\6\2\u0180\u017f\3\2" +
                    "\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183" +
                    "\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u01b8\7!\2\2\u0186\u0187\7E\2" +
                    "\2\u0187\u018b\7c\2\2\u0188\u018a\5\22\n\2\u0189\u0188\3\2\2\2\u018a\u018d" +
                    "\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0191\3\2\2\2\u018d" +
                    "\u018b\3\2\2\2\u018e\u0190\5\n\6\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2" +
                    "\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193" +
                    "\u0191\3\2\2\2\u0194\u01b8\7!\2\2\u0195\u0196\7F\2\2\u0196\u0199\7H\2" +
                    "\2\u0197\u019a\5\20\t\2\u0198\u019a\7[\2\2\u0199\u0197\3\2\2\2\u0199\u0198" +
                    "\3\2\2\2\u019a\u01a0\3\2\2\2\u019b\u019e\7\35\2\2\u019c\u019f\5\20\t\2" +
                    "\u019d\u019f\7[\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a1" +
                    "\3\2\2\2\u01a0\u019b\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2" +
                    "\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01b8\7I\2\2\u01a5\u01a6\7c\2" +
                    "\2\u01a6\u01a9\7H\2\2\u01a7\u01aa\5\20\t\2\u01a8\u01aa\7[\2\2\u01a9\u01a7" +
                    "\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01b2\3\2\2\2\u01ab\u01ae\7\35\2\2" +
                    "\u01ac\u01af\5\20\t\2\u01ad\u01af\7[\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad" +
                    "\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ab\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2" +
                    "\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2" +
                    "\2\2\u01b5\u01b8\7I\2\2\u01b6\u01b8\7c\2\2\u01b7\u0149\3\2\2\2\u01b7\u014a" +
                    "\3\2\2\2\u01b7\u014b\3\2\2\2\u01b7\u014c\3\2\2\2\u01b7\u014d\3\2\2\2\u01b7" +
                    "\u014e\3\2\2\2\u01b7\u014f\3\2\2\2\u01b7\u0150\3\2\2\2\u01b7\u0151\3\2" +
                    "\2\2\u01b7\u0152\3\2\2\2\u01b7\u0153\3\2\2\2\u01b7\u0154\3\2\2\2\u01b7" +
                    "\u0155\3\2\2\2\u01b7\u0156\3\2\2\2\u01b7\u0157\3\2\2\2\u01b7\u0158\3\2" +
                    "\2\2\u01b7\u015c\3\2\2\2\u01b7\u015e\3\2\2\2\u01b7\u0163\3\2\2\2\u01b7" +
                    "\u0166\3\2\2\2\u01b7\u0177\3\2\2\2\u01b7\u0186\3\2\2\2\u01b7\u0195\3\2" +
                    "\2\2\u01b7\u01a5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\21\3\2\2\2\u01b9\u01ba" +
                    "\7c\2\2\u01ba\u01bb\7-\2\2\u01bb\u01be\5\20\t\2\u01bc\u01be\7c\2\2\u01bd" +
                    "\u01b9\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\23\3\2\2\2\u01bf\u01c0\7H\2\2" +
                    "\u01c0\u01c5\5\26\f\2\u01c1\u01c2\7\35\2\2\u01c2\u01c4\5\26\f\2\u01c3" +
                    "\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2" +
                    "\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7I\2\2\u01c9" +
                    "\25\3\2\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7A\2\2\u01cc\u01d2\5\20\t\2" +
                    "\u01cd\u01ce\7-\2\2\u01ce\u01d2\5\20\t\2\u01cf\u01d2\7c\2\2\u01d0\u01d2" +
                    "\7[\2\2\u01d1\u01ca\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1" +
                    "\u01d0\3\2\2\2\u01d2\27\3\2\2\2\u01d3\u01d4\7C\2\2\u01d4\u01d6\7c\2\2" +
                    "\u01d5\u01d7\5\24\13\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8" +
                    "\3\2\2\2\u01d8\u01d9\5\20\t\2\u01d9\31\3\2\2\2\u01da\u01db\7\27\2\2\u01db" +
                    "\u01dc\5\6\4\2\u01dc\u01dd\7\3\2\2\u01dd\u01de\5\6\4\2\u01de\u01df\7\34" +
                    "\2\2\u01df\u01e1\5\6\4\2\u01e0\u01e2\5\4\3\2\u01e1\u01e0\3\2\2\2\u01e2" +
                    "\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2" +
                    "\2\2\u01e5\u01e6\7!\2\2\u01e6\u0202\3\2\2\2\u01e7\u01e8\7\27\2\2\u01e8" +
                    "\u01e9\5\6\4\2\u01e9\u01ea\7\3\2\2\u01ea\u01eb\5\6\4\2\u01eb\u01ec\7\34" +
                    "\2\2\u01ec\u01ed\5\6\4\2\u01ed\u01ee\7\34\2\2\u01ee\u01f0\5\6\4\2\u01ef" +
                    "\u01f1\5\4\3\2\u01f0\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2" +
                    "\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\7!\2\2\u01f5" +
                    "\u0202\3\2\2\2\u01f6\u01f7\7\27\2\2\u01f7\u01f8\5\6\4\2\u01f8\u01f9\7" +
                    "\23\2\2\u01f9\u01fb\5\6\4\2\u01fa\u01fc\5\4\3\2\u01fb\u01fa\3\2\2\2\u01fc" +
                    "\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2" +
                    "\2\2\u01ff\u0200\7!\2\2\u0200\u0202\3\2\2\2\u0201\u01da\3\2\2\2\u0201" +
                    "\u01e7\3\2\2\2\u0201\u01f6\3\2\2\2\u0202\33\3\2\2\2\u0203\u0204\7\24\2" +
                    "\2\u0204\u0206\5\6\4\2\u0205\u0207\5\4\3\2\u0206\u0205\3\2\2\2\u0207\u0208" +
                    "\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0212\3\2\2\2\u020a" +
                    "\u020c\7\25\2\2\u020b\u020d\5\4\3\2\u020c\u020b\3\2\2\2\u020d\u020e\3" +
                    "\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210" +
                    "\u020a\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2" +
                    "\2\2\u0213\u021b\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0217\7\26\2\2\u0216" +
                    "\u0218\5\4\3\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2" +
                    "\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0215\3\2\2\2\u021b" +
                    "\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7!\2\2\u021e\35\3\2\2\2" +
                    "\67!+AIMW[dhqu\u0084\u00e5\u00e7\u00f8\u0103\u010b\u0114\u0118\u011c\u0125" +
                    "\u012b\u012f\u0137\u013a\u013d\u0147\u016c\u0172\u017c\u0182\u018b\u0191" +
                    "\u0199\u019e\u01a2\u01a9\u01ae\u01b2\u01b7\u01bd\u01c5\u01d1\u01d6\u01e3" +
                    "\u01f2\u01fd\u0201\u0208\u020e\u0212\u0219\u021b";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'='", "'+='", "'-='", "'*='", "'/='", "'\\='", "'%='", "'^='",
            "'&='", "'|='", "'$='", "'>>>='", "'>>='", "'...'", "'<<='", "'?'", "'in'",
            "'if'", "'elseif'", "'else'", "'for'", "'const'", "'include'", "'using'",
            "'import'", "':'", "','", "'importall'", "'export'", "'module'", "'end'",
            "'baremodule'", "'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'",
            "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'-'", "'::'", "'^'", "'//'",
            "'*'", "'/'", "'+'", null, "'>'", "'<'", "'>='", "'<='", "'=='", "'!'",
            "'&&'", "'||'", "'('", "')'", "'true'", "'false'", "'abstract'", "'<:'",
            "'bitstype'", "'typealias'", "'type'", "'immutable'", "'Union'", "'function'",
            "'{'", "'}'", "'['", "']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'",
            "'Int32'", "'Uint32'", "'Int64'", "'Uint64'", "'Int128'", "'Uint128'",
            "'Bool'", "'Char'", "'Float16'", "'Float32'", "'Float64'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQ", "ADD_ASGN", "SUB_ASGN", "TIMES_ASGN", "DIVIDE_ASGN", "INV_DIVIDE_ASGN",
            "REMAINDER_ASGN", "POWER_ASGN", "BITWISE_AND_ASGN", "BITWISE_OR_ASGN",
            "BITWISE_XOR_ASGN", "LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK",
            "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "INCLUDE", "USING", "IMPORT",
            "COLON", "COMMA", "IMPORT_ALL", "EXPORT", "MODULE", "END", "BAREMODULE",
            "INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16",
            "NAN32", "NAN", "MINUS", "INSTANCE_OF", "EXPONENT", "FRACTION", "TIMES",
            "DIVIDE", "PLUS", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQ",
            "LESS_THAN_OR_EQ", "EQUALS", "NOT", "AND", "OR", "LEFT_BRACKET", "RIGHT_BRACKET",
            "TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE",
            "IMMUTABLE", "UNION", "FUNCTION", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE",
            "RIGHT_SQUARE", "INT8", "UINT8", "INT16", "UINT16", "INT32", "UINT32",
            "INT64", "UINT64", "INT128", "UINT128", "BOOL", "CHAR", "FLOAT16", "FLOAT32",
            "FLOAT64", "INT", "BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "EXP32",
            "FLOAT64_LITERAL", "EXP64", "ID", "STRING", "WS", "LINE_COMMENT", "SIZE"
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
                setState(31);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                    {
                        {
                            setState(28);
                            statement();
                        }
                    }
                    setState(33);
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
            setState(41);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(34);
                    moduleDirective();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(35);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(36);
                    typeExpression();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(37);
                    typeAlias();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(38);
                    forStatement();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(39);
                    ifStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(40);
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
                setState(130);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(44);
                        match(MINUS);
                        setState(45);
                        exp(49);
                    }
                    break;
                    case 2: {
                        _localctx = new NotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(46);
                        match(NOT);
                        setState(47);
                        exp(35);
                    }
                    break;
                    case 3: {
                        _localctx = new ConstantContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(48);
                        match(CONST);
                        setState(49);
                        match(ID);
                        setState(50);
                        match(EQ);
                        setState(51);
                        exp(1);
                    }
                    break;
                    case 4: {
                        _localctx = new Inf16TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(52);
                        match(INF16);
                    }
                    break;
                    case 5: {
                        _localctx = new Inf32TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(53);
                        match(INF32);
                    }
                    break;
                    case 6: {
                        _localctx = new InfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(54);
                        match(INF);
                    }
                    break;
                    case 7: {
                        _localctx = new MinusInf16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(55);
                        match(MINUS_INF16);
                    }
                    break;
                    case 8: {
                        _localctx = new MinusInf32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(56);
                        match(MINUS_INF32);
                    }
                    break;
                    case 9: {
                        _localctx = new MinusInfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(57);
                        match(MINUS_INF);
                    }
                    break;
                    case 10: {
                        _localctx = new Nan16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(58);
                        match(NAN16);
                    }
                    break;
                    case 11: {
                        _localctx = new Nan32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(59);
                        match(NAN32);
                    }
                    break;
                    case 12: {
                        _localctx = new NanContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(60);
                        match(NAN);
                    }
                    break;
                    case 13: {
                        _localctx = new ApplyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(61);
                        match(ID);
                        setState(63);
                        _la = _input.LA(1);
                        if (_la == LEFT_CURLY) {
                            {
                                setState(62);
                                typeParameters();
                            }
                        }

                        setState(65);
                        match(LEFT_BRACKET);
                        setState(75);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LEFT_SQUARE - 72)) | (1L << (FLOAT32 - 72)) | (1L << (FLOAT64 - 72)) | (1L << (INT - 72)) | (1L << (BINARY - 72)) | (1L << (OCTAL - 72)) | (1L << (HEX - 72)) | (1L << (ID - 72)) | (1L << (STRING - 72)))) != 0)) {
                            {
                                setState(71);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                    if (_alt == 1) {
                                        {
                                            {
                                                setState(66);
                                                exp(0);
                                                setState(67);
                                                match(COMMA);
                                            }
                                        }
                                    }
                                    setState(73);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                                }
                                setState(74);
                                exp(0);
                            }
                        }

                        setState(77);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 14: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(78);
                        match(ID);
                        setState(79);
                        match(LEFT_SQUARE);
                        setState(85);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(80);
                                        exp(0);
                                        setState(81);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(87);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                        }
                        setState(89);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LEFT_SQUARE - 72)) | (1L << (FLOAT32 - 72)) | (1L << (FLOAT64 - 72)) | (1L << (INT - 72)) | (1L << (BINARY - 72)) | (1L << (OCTAL - 72)) | (1L << (HEX - 72)) | (1L << (ID - 72)) | (1L << (STRING - 72)))) != 0)) {
                            {
                                setState(88);
                                exp(0);
                            }
                        }

                        setState(91);
                        match(RIGHT_SQUARE);
                    }
                    break;
                    case 15: {
                        _localctx = new TupleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(92);
                        match(LEFT_BRACKET);
                        setState(98);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(93);
                                        exp(0);
                                        setState(94);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(100);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                        }
                        setState(102);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LEFT_SQUARE - 72)) | (1L << (FLOAT32 - 72)) | (1L << (FLOAT64 - 72)) | (1L << (INT - 72)) | (1L << (BINARY - 72)) | (1L << (OCTAL - 72)) | (1L << (HEX - 72)) | (1L << (ID - 72)) | (1L << (STRING - 72)))) != 0)) {
                            {
                                setState(101);
                                exp(0);
                            }
                        }

                        setState(104);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 16: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(105);
                        match(LEFT_SQUARE);
                        setState(111);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(106);
                                        exp(0);
                                        setState(107);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(113);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        }
                        setState(115);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (LEFT_SQUARE - 72)) | (1L << (FLOAT32 - 72)) | (1L << (FLOAT64 - 72)) | (1L << (INT - 72)) | (1L << (BINARY - 72)) | (1L << (OCTAL - 72)) | (1L << (HEX - 72)) | (1L << (ID - 72)) | (1L << (STRING - 72)))) != 0)) {
                            {
                                setState(114);
                                exp(0);
                            }
                        }

                        setState(117);
                        match(RIGHT_SQUARE);
                    }
                    break;
                    case 17: {
                        _localctx = new TtContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(118);
                        match(TRUE);
                    }
                    break;
                    case 18: {
                        _localctx = new FfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(119);
                        match(FALSE);
                    }
                    break;
                    case 19: {
                        _localctx = new IntContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(120);
                        match(INT);
                    }
                    break;
                    case 20: {
                        _localctx = new BinaryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(121);
                        match(BINARY);
                    }
                    break;
                    case 21: {
                        _localctx = new OctalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(122);
                        match(OCTAL);
                    }
                    break;
                    case 22: {
                        _localctx = new HexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(123);
                        match(HEX);
                    }
                    break;
                    case 23: {
                        _localctx = new Ffloat32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(124);
                        match(FLOAT32);
                    }
                    break;
                    case 24: {
                        _localctx = new Ffloat64Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(125);
                        match(FLOAT64);
                    }
                    break;
                    case 25: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(126);
                        match(STRING);
                    }
                    break;
                    case 26: {
                        _localctx = new IdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(127);
                        match(ID);
                    }
                    break;
                    case 27: {
                        _localctx = new SymbolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(128);
                        match(COLON);
                        setState(129);
                        match(ID);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(229);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(227);
                            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                                case 1: {
                                    _localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(132);
                                    if (!(precpred(_ctx, 47)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 47)");
                                    setState(133);
                                    match(FRACTION);
                                    setState(134);
                                    exp(48);
                                }
                                break;
                                case 2: {
                                    _localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(135);
                                    if (!(precpred(_ctx, 46)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 46)");
                                    setState(136);
                                    match(TIMES);
                                    setState(137);
                                    exp(47);
                                }
                                break;
                                case 3: {
                                    _localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(138);
                                    if (!(precpred(_ctx, 45)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 45)");
                                    setState(139);
                                    match(DIVIDE);
                                    setState(140);
                                    exp(46);
                                }
                                break;
                                case 4: {
                                    _localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(141);
                                    if (!(precpred(_ctx, 44)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 44)");
                                    setState(142);
                                    match(PLUS);
                                    setState(143);
                                    exp(45);
                                }
                                break;
                                case 5: {
                                    _localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(144);
                                    if (!(precpred(_ctx, 43)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 43)");
                                    setState(145);
                                    match(MINUS);
                                    setState(146);
                                    exp(44);
                                }
                                break;
                                case 6: {
                                    _localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(147);
                                    if (!(precpred(_ctx, 42)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 42)");
                                    setState(148);
                                    match(GREATER_THAN);
                                    setState(149);
                                    exp(43);
                                }
                                break;
                                case 7: {
                                    _localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(150);
                                    if (!(precpred(_ctx, 41)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 41)");
                                    setState(151);
                                    match(LESS_THAN);
                                    setState(152);
                                    exp(42);
                                }
                                break;
                                case 8: {
                                    _localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(153);
                                    if (!(precpred(_ctx, 40)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 40)");
                                    setState(154);
                                    match(GREATER_THAN_OR_EQ);
                                    setState(155);
                                    exp(41);
                                }
                                break;
                                case 9: {
                                    _localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(156);
                                    if (!(precpred(_ctx, 39)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                                    setState(157);
                                    match(LESS_THAN_OR_EQ);
                                    setState(158);
                                    exp(40);
                                }
                                break;
                                case 10: {
                                    _localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(159);
                                    if (!(precpred(_ctx, 38)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                                    setState(160);
                                    match(EQUALS);
                                    setState(161);
                                    exp(39);
                                }
                                break;
                                case 11: {
                                    _localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(162);
                                    if (!(precpred(_ctx, 37)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 37)");
                                    setState(163);
                                    match(SUB_TYPE);
                                    setState(164);
                                    exp(38);
                                }
                                break;
                                case 12: {
                                    _localctx = new ConditionalContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(165);
                                    if (!(precpred(_ctx, 36)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 36)");
                                    setState(166);
                                    match(QUESTION_MARK);
                                    setState(167);
                                    exp(0);
                                    setState(168);
                                    match(COLON);
                                    setState(169);
                                    exp(37);
                                }
                                break;
                                case 13: {
                                    _localctx = new AndContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(171);
                                    if (!(precpred(_ctx, 34)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 34)");
                                    setState(172);
                                    match(AND);
                                    setState(173);
                                    exp(35);
                                }
                                break;
                                case 14: {
                                    _localctx = new OrContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(174);
                                    if (!(precpred(_ctx, 33)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 33)");
                                    setState(175);
                                    match(OR);
                                    setState(176);
                                    exp(34);
                                }
                                break;
                                case 15: {
                                    _localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(177);
                                    if (!(precpred(_ctx, 29)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 29)");
                                    setState(178);
                                    match(NOT_EQUAL);
                                    setState(179);
                                    exp(30);
                                }
                                break;
                                case 16: {
                                    _localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(180);
                                    if (!(precpred(_ctx, 28)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 28)");
                                    setState(181);
                                    match(EQ);
                                    setState(182);
                                    exp(29);
                                }
                                break;
                                case 17: {
                                    _localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(183);
                                    if (!(precpred(_ctx, 27)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                                    setState(184);
                                    match(ADD_ASGN);
                                    setState(185);
                                    exp(28);
                                }
                                break;
                                case 18: {
                                    _localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(186);
                                    if (!(precpred(_ctx, 26)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                                    setState(187);
                                    match(SUB_ASGN);
                                    setState(188);
                                    exp(27);
                                }
                                break;
                                case 19: {
                                    _localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(189);
                                    if (!(precpred(_ctx, 25)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(190);
                                    match(TIMES_ASGN);
                                    setState(191);
                                    exp(26);
                                }
                                break;
                                case 20: {
                                    _localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(192);
                                    if (!(precpred(_ctx, 24)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(193);
                                    match(DIVIDE_ASGN);
                                    setState(194);
                                    exp(25);
                                }
                                break;
                                case 21: {
                                    _localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(195);
                                    if (!(precpred(_ctx, 23)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(196);
                                    match(INV_DIVIDE_ASGN);
                                    setState(197);
                                    exp(24);
                                }
                                break;
                                case 22: {
                                    _localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(198);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(199);
                                    match(REMAINDER_ASGN);
                                    setState(200);
                                    exp(23);
                                }
                                break;
                                case 23: {
                                    _localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(201);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(202);
                                    match(POWER_ASGN);
                                    setState(203);
                                    exp(22);
                                }
                                break;
                                case 24: {
                                    _localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(204);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(205);
                                    match(BITWISE_AND_ASGN);
                                    setState(206);
                                    exp(21);
                                }
                                break;
                                case 25: {
                                    _localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(207);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(208);
                                    match(BITWISE_OR_ASGN);
                                    setState(209);
                                    exp(20);
                                }
                                break;
                                case 26: {
                                    _localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(210);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(211);
                                    match(BITWISE_XOR_ASGN);
                                    setState(212);
                                    exp(19);
                                }
                                break;
                                case 27: {
                                    _localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(213);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(214);
                                    match(LSR_ASGN);
                                    setState(215);
                                    exp(18);
                                }
                                break;
                                case 28: {
                                    _localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(216);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(217);
                                    match(ASR_ASGN);
                                    setState(218);
                                    exp(17);
                                }
                                break;
                                case 29: {
                                    _localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(219);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(220);
                                    match(ASL_ASGN);
                                    setState(221);
                                    exp(16);
                                }
                                break;
                                case 30: {
                                    _localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(222);
                                    if (!(precpred(_ctx, 48)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 48)");
                                    setState(223);
                                    match(INSTANCE_OF);
                                    setState(224);
                                    typeExpression();
                                }
                                break;
                                case 31: {
                                    _localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(225);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(226);
                                    match(ELLIPSE);
                                }
                                break;
                            }
                        }
                    }
                    setState(231);
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
            setState(278);
            switch (_input.LA(1)) {
                case INCLUDE:
                    _localctx = new IncludeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(232);
                    match(INCLUDE);
                    setState(233);
                    match(LEFT_BRACKET);
                    setState(234);
                    match(STRING);
                    setState(235);
                    match(RIGHT_BRACKET);
                }
                break;
                case USING:
                    _localctx = new UsingContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(236);
                    match(USING);
                    setState(237);
                    match(ID);
                }
                break;
                case IMPORT:
                    _localctx = new ImporttContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(238);
                    match(IMPORT);
                    setState(239);
                    match(ID);
                    setState(240);
                    match(COLON);
                    setState(241);
                    match(ID);
                    setState(246);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(242);
                                match(COMMA);
                                setState(243);
                                match(ID);
                            }
                        }
                        setState(248);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case IMPORT_ALL:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(249);
                    match(IMPORT_ALL);
                    setState(250);
                    match(ID);
                }
                break;
                case EXPORT:
                    _localctx = new ExportContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(251);
                    match(EXPORT);
                    setState(252);
                    match(ID);
                    setState(257);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(253);
                                match(COMMA);
                                setState(254);
                                match(ID);
                            }
                        }
                        setState(259);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case MODULE:
                    _localctx = new ModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(260);
                    match(MODULE);
                    setState(261);
                    match(ID);
                    setState(263);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(262);
                                statement();
                            }
                        }
                        setState(265);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(267);
                    match(END);
                }
                break;
                case BAREMODULE:
                    _localctx = new BareModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(269);
                    match(BAREMODULE);
                    setState(270);
                    match(ID);
                    setState(272);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(271);
                                statement();
                            }
                        }
                        setState(274);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(276);
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
            setState(301);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new CompactFunctionDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(280);
                    match(ID);
                    setState(282);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(281);
                            typeParameters();
                        }
                    }

                    setState(284);
                    parameters();
                    setState(285);
                    match(EQ);
                    setState(286);
                    exp(0);
                }
                break;
                case FUNCTION:
                    _localctx = new GeneralFunctionDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(288);
                    match(FUNCTION);
                    setState(289);
                    match(ID);
                    setState(291);
                    _la = _input.LA(1);
                    if (_la == LEFT_CURLY) {
                        {
                            setState(290);
                            typeParameters();
                        }
                    }

                    setState(293);
                    parameters();
                    setState(295);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(294);
                                statement();
                            }
                        }
                        setState(297);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(299);
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
                setState(303);
                match(LEFT_BRACKET);
                setState(312);
                _la = _input.LA(1);
                if (_la == INSTANCE_OF || _la == ID) {
                    {
                        setState(304);
                        parameter();
                        setState(309);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(305);
                                    match(COMMA);
                                    setState(306);
                                    parameter();
                                }
                            }
                            setState(311);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(315);
                _la = _input.LA(1);
                if (_la == ELLIPSE) {
                    {
                        setState(314);
                        match(ELLIPSE);
                    }
                }

                setState(317);
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
            setState(325);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    _localctx = new NamedTypedParamContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(319);
                    match(ID);
                    setState(320);
                    match(INSTANCE_OF);
                    setState(321);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new AnonymousTypedParamContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(322);
                    match(INSTANCE_OF);
                    setState(323);
                    typeExpression();
                }
                break;
                case 3:
                    _localctx = new NamedParamContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(324);
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
            setState(437);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                    _localctx = new Int8Context(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(327);
                    match(INT8);
                }
                break;
                case 2:
                    _localctx = new Uint8Context(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(328);
                    match(UINT8);
                }
                break;
                case 3:
                    _localctx = new Int16Context(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(329);
                    match(INT16);
                }
                break;
                case 4:
                    _localctx = new Uint16Context(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(330);
                    match(UINT16);
                }
                break;
                case 5:
                    _localctx = new Int32Context(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(331);
                    match(INT32);
                }
                break;
                case 6:
                    _localctx = new Uint32Context(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(332);
                    match(UINT32);
                }
                break;
                case 7:
                    _localctx = new Int64Context(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(333);
                    match(INT64);
                }
                break;
                case 8:
                    _localctx = new Uint64Context(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(334);
                    match(UINT64);
                }
                break;
                case 9:
                    _localctx = new Int128Context(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(335);
                    match(INT128);
                }
                break;
                case 10:
                    _localctx = new Uint128Context(_localctx);
                    enterOuterAlt(_localctx, 10);
                {
                    setState(336);
                    match(UINT128);
                }
                break;
                case 11:
                    _localctx = new BoolContext(_localctx);
                    enterOuterAlt(_localctx, 11);
                {
                    setState(337);
                    match(BOOL);
                }
                break;
                case 12:
                    _localctx = new CharContext(_localctx);
                    enterOuterAlt(_localctx, 12);
                {
                    setState(338);
                    match(CHAR);
                }
                break;
                case 13:
                    _localctx = new Float16Context(_localctx);
                    enterOuterAlt(_localctx, 13);
                {
                    setState(339);
                    match(FLOAT16);
                }
                break;
                case 14:
                    _localctx = new Float32Context(_localctx);
                    enterOuterAlt(_localctx, 14);
                {
                    setState(340);
                    match(FLOAT32);
                }
                break;
                case 15:
                    _localctx = new Float64Context(_localctx);
                    enterOuterAlt(_localctx, 15);
                {
                    setState(341);
                    match(FLOAT64);
                }
                break;
                case 16:
                    _localctx = new AbstractSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 16);
                {
                    setState(342);
                    match(ABSTRACT);
                    setState(343);
                    match(ID);
                    setState(344);
                    match(SUB_TYPE);
                    setState(345);
                    match(ID);
                }
                break;
                case 17:
                    _localctx = new AbstractTypeContext(_localctx);
                    enterOuterAlt(_localctx, 17);
                {
                    setState(346);
                    match(ABSTRACT);
                    setState(347);
                    match(ID);
                }
                break;
                case 18:
                    _localctx = new BitsSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 18);
                {
                    setState(348);
                    match(BITS_TYPE);
                    setState(349);
                    match(SIZE);
                    setState(350);
                    match(ID);
                    setState(351);
                    match(SUB_TYPE);
                    setState(352);
                    match(ID);
                }
                break;
                case 19:
                    _localctx = new BitsTtypeContext(_localctx);
                    enterOuterAlt(_localctx, 19);
                {
                    setState(353);
                    match(BITS_TYPE);
                    setState(354);
                    match(SIZE);
                    setState(355);
                    match(ID);
                }
                break;
                case 20:
                    _localctx = new ParameterisedTypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 20);
                {
                    setState(356);
                    match(TYPE);
                    setState(357);
                    match(ID);
                    setState(358);
                    typeParameters();
                    setState(362);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(359);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(364);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 27, _ctx);
                    }
                    setState(368);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(365);
                                functionDeclaration();
                            }
                        }
                        setState(370);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(371);
                    match(END);
                }
                break;
                case 21:
                    _localctx = new TypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 21);
                {
                    setState(373);
                    match(TYPE);
                    setState(374);
                    match(ID);
                    setState(378);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(375);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(380);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                    }
                    setState(384);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(381);
                                functionDeclaration();
                            }
                        }
                        setState(386);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(387);
                    match(END);
                }
                break;
                case 22:
                    _localctx = new ImmutableTypeDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 22);
                {
                    setState(388);
                    match(IMMUTABLE);
                    setState(389);
                    match(ID);
                    setState(393);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(390);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(395);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
                    }
                    setState(399);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(396);
                                functionDeclaration();
                            }
                        }
                        setState(401);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(402);
                    match(END);
                }
                break;
                case 23:
                    _localctx = new UnionTypeContext(_localctx);
                    enterOuterAlt(_localctx, 23);
                {
                    setState(403);
                    match(UNION);
                    setState(404);
                    match(LEFT_CURLY);
                    setState(407);
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
                            setState(405);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(406);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(414);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(409);
                                match(COMMA);
                                setState(412);
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
                                        setState(410);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(411);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(416);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == COMMA);
                    setState(418);
                    match(RIGHT_CURLY);
                }
                break;
                case 24:
                    _localctx = new ParametricTypeContext(_localctx);
                    enterOuterAlt(_localctx, 24);
                {
                    setState(419);
                    match(ID);
                    setState(420);
                    match(LEFT_CURLY);
                    setState(423);
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
                            setState(421);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(422);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(432);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(425);
                                match(COMMA);
                                setState(428);
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
                                        setState(426);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(427);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(434);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(435);
                    match(RIGHT_CURLY);
                }
                break;
                case 25:
                    _localctx = new TypeReferenceContext(_localctx);
                    enterOuterAlt(_localctx, 25);
                {
                    setState(436);
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
            setState(443);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                case 1:
                    _localctx = new TypedFieldDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(439);
                    match(ID);
                    setState(440);
                    match(INSTANCE_OF);
                    setState(441);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new UntypedFieldDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(442);
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
                setState(445);
                match(LEFT_CURLY);
                setState(446);
                typeParameter();
                setState(451);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(447);
                            match(COMMA);
                            setState(448);
                            typeParameter();
                        }
                    }
                    setState(453);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(454);
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
            setState(463);
            switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                case 1:
                    _localctx = new NamedSubtypeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(456);
                    match(ID);
                    setState(457);
                    match(SUB_TYPE);
                    setState(458);
                    typeExpression();
                }
                break;
                case 2:
                    _localctx = new InstanceContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(459);
                    match(INSTANCE_OF);
                    setState(460);
                    typeExpression();
                }
                break;
                case 3:
                    _localctx = new UntypedContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(461);
                    match(ID);
                }
                break;
                case 4:
                    _localctx = new NumberContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(462);
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
                setState(465);
                match(TYPE_ALIAS);
                setState(466);
                match(ID);
                setState(468);
                _la = _input.LA(1);
                if (_la == LEFT_CURLY) {
                    {
                        setState(467);
                        typeParameters();
                    }
                }

                setState(470);
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
        int _la;
        try {
            setState(511);
            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                case 1:
                    _localctx = new ForEqContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(472);
                    match(FOR);
                    setState(473);
                    exp(0);
                    setState(474);
                    match(EQ);
                    setState(475);
                    exp(0);
                    setState(476);
                    match(COLON);
                    setState(477);
                    exp(0);
                    setState(479);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(478);
                                statement();
                            }
                        }
                        setState(481);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(483);
                    match(END);
                }
                break;
                case 2:
                    _localctx = new ForEqStepContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(485);
                    match(FOR);
                    setState(486);
                    exp(0);
                    setState(487);
                    match(EQ);
                    setState(488);
                    exp(0);
                    setState(489);
                    match(COLON);
                    setState(490);
                    exp(0);
                    setState(491);
                    match(COLON);
                    setState(492);
                    exp(0);
                    setState(494);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(493);
                                statement();
                            }
                        }
                        setState(496);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(498);
                    match(END);
                }
                break;
                case 3:
                    _localctx = new ForInContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(500);
                    match(FOR);
                    setState(501);
                    exp(0);
                    setState(502);
                    match(IN);
                    setState(503);
                    exp(0);
                    setState(505);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(504);
                                statement();
                            }
                        }
                        setState(507);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(509);
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
            _localctx = new ConditionalStatementContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(513);
                match(IF);
                setState(514);
                exp(0);
                setState(516);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(515);
                            statement();
                        }
                    }
                    setState(518);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                setState(528);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ELSE_IF) {
                    {
                        {
                            setState(520);
                            match(ELSE_IF);
                            setState(522);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(521);
                                        statement();
                                    }
                                }
                                setState(524);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                        }
                    }
                    setState(530);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(537);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(531);
                        match(ELSE);
                        setState(533);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(532);
                                    statement();
                                }
                            }
                            setState(535);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    }
                }

                setState(539);
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
                return precpred(_ctx, 47);
            case 1:
                return precpred(_ctx, 46);
            case 2:
                return precpred(_ctx, 45);
            case 3:
                return precpred(_ctx, 44);
            case 4:
                return precpred(_ctx, 43);
            case 5:
                return precpred(_ctx, 42);
            case 6:
                return precpred(_ctx, 41);
            case 7:
                return precpred(_ctx, 40);
            case 8:
                return precpred(_ctx, 39);
            case 9:
                return precpred(_ctx, 38);
            case 10:
                return precpred(_ctx, 37);
            case 11:
                return precpred(_ctx, 36);
            case 12:
                return precpred(_ctx, 34);
            case 13:
                return precpred(_ctx, 33);
            case 14:
                return precpred(_ctx, 29);
            case 15:
                return precpred(_ctx, 28);
            case 16:
                return precpred(_ctx, 27);
            case 17:
                return precpred(_ctx, 26);
            case 18:
                return precpred(_ctx, 25);
            case 19:
                return precpred(_ctx, 24);
            case 20:
                return precpred(_ctx, 23);
            case 21:
                return precpred(_ctx, 22);
            case 22:
                return precpred(_ctx, 21);
            case 23:
                return precpred(_ctx, 20);
            case 24:
                return precpred(_ctx, 19);
            case 25:
                return precpred(_ctx, 18);
            case 26:
                return precpred(_ctx, 17);
            case 27:
                return precpred(_ctx, 16);
            case 28:
                return precpred(_ctx, 15);
            case 29:
                return precpred(_ctx, 48);
            case 30:
                return precpred(_ctx, 14);
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

    public static class Ffloat32Context extends ExpContext {
        public Ffloat32Context(ExpContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode FLOAT32() {
            return getToken(JuliaParser.FLOAT32, 0);
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

        public TerminalNode RIGHT_BRACKET() {
            return getToken(JuliaParser.RIGHT_BRACKET, 0);
        }

        public List<ExpContext> exp() {
            return getRuleContexts(ExpContext.class);
        }

        public ExpContext exp(int i) {
            return getRuleContext(ExpContext.class, i);
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

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
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

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TerminalNode LEFT_SQUARE() {
            return getToken(JuliaParser.LEFT_SQUARE, 0);
        }

        public TerminalNode RIGHT_SQUARE() {
            return getToken(JuliaParser.RIGHT_SQUARE, 0);
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

        public TerminalNode FLOAT64() {
            return getToken(JuliaParser.FLOAT64, 0);
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

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
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

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
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

    public static class ParameterisedTypeDeclarationContext extends TypeExpressionContext {
        public ParameterisedTypeDeclarationContext(TypeExpressionContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TYPE() {
            return getToken(JuliaParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TerminalNode END() {
            return getToken(JuliaParser.END, 0);
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
                ((JuliaParserListener) listener).enterParameterisedTypeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener)
                ((JuliaParserListener) listener).exitParameterisedTypeDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitParameterisedTypeDeclaration(this);
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

    public static class UntypedContext extends TypeParameterContext {
        public UntypedContext(TypeParameterContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterUntyped(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitUntyped(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitUntyped(this);
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
}