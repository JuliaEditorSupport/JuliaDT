// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaParser.g4 by ANTLR 4.5.1

package org.julia.lang;

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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3g\u0239\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3" +
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\5\4Q\n\4\3\4\3\4\3\4\3\4\7\4W\n" +
                    "\4\f\4\16\4Z\13\4\3\4\5\4]\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4e\n\4\f\4\16" +
                    "\4h\13\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4\f\4\16\4u\13\4\3\4" +
                    "\5\4x\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3" +
                    "\4\5\4\u0086\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5" +
                    "\4\u0095\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00f6\n\4\f\4\16\4\u00f9" +
                    "\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0107\n\5\f" +
                    "\5\16\5\u010a\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0112\n\5\f\5\16\5\u0115" +
                    "\13\5\3\5\3\5\3\5\6\5\u011a\n\5\r\5\16\5\u011b\3\5\3\5\3\5\3\5\3\5\6\5" +
                    "\u0123\n\5\r\5\16\5\u0124\3\5\3\5\5\5\u0129\n\5\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u013a\n\6\r\6\16\6\u013b\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0145\n\6\r\6\16\6\u0146\3\6\3\6\5\6\u014b" +
                    "\n\6\3\7\3\7\3\7\3\7\7\7\u0151\n\7\f\7\16\7\u0154\13\7\5\7\u0156\n\7\3" +
                    "\7\5\7\u0159\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0163\n\b\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3" +
                    "\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0186\n\t\f" +
                    "\t\16\t\u0189\13\t\3\t\7\t\u018c\n\t\f\t\16\t\u018f\13\t\3\t\3\t\3\t\3" +
                    "\t\3\t\7\t\u0196\n\t\f\t\16\t\u0199\13\t\3\t\7\t\u019c\n\t\f\t\16\t\u019f" +
                    "\13\t\3\t\3\t\3\t\3\t\7\t\u01a5\n\t\f\t\16\t\u01a8\13\t\3\t\7\t\u01ab" +
                    "\n\t\f\t\16\t\u01ae\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01b5\n\t\3\t\3\t\3\t" +
                    "\5\t\u01ba\n\t\6\t\u01bc\n\t\r\t\16\t\u01bd\3\t\3\t\3\t\3\t\3\t\5\t\u01c5" +
                    "\n\t\3\t\3\t\3\t\5\t\u01ca\n\t\7\t\u01cc\n\t\f\t\16\t\u01cf\13\t\3\t\3" +
                    "\t\5\t\u01d3\n\t\3\n\3\n\3\n\3\n\5\n\u01d9\n\n\3\13\3\13\3\13\3\13\7\13" +
                    "\u01df\n\13\f\13\16\13\u01e2\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3" +
                    "\f\5\f\u01ed\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\6\16\u01fb\n\16\r\16\16\16\u01fc\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3" +
                    "\16\3\16\3\16\3\16\6\16\u020a\n\16\r\16\16\16\u020b\3\16\3\16\3\16\3\16" +
                    "\3\16\3\16\3\16\6\16\u0215\n\16\r\16\16\16\u0216\3\16\3\16\5\16\u021b" +
                    "\n\16\3\17\3\17\3\17\6\17\u0220\n\17\r\17\16\17\u0221\3\17\3\17\6\17\u0226" +
                    "\n\17\r\17\16\17\u0227\7\17\u022a\n\17\f\17\16\17\u022d\13\17\3\17\3\17" +
                    "\6\17\u0231\n\17\r\17\16\17\u0232\5\17\u0235\n\17\3\17\3\17\3\17\2\3\6" +
                    "\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2Y[\u02bf\2\37\3\2\2\2\4" +
                    ".\3\2\2\2\6\u0094\3\2\2\2\b\u0128\3\2\2\2\n\u014a\3\2\2\2\f\u014c\3\2" +
                    "\2\2\16\u0162\3\2\2\2\20\u01d2\3\2\2\2\22\u01d8\3\2\2\2\24\u01da\3\2\2" +
                    "\2\26\u01ec\3\2\2\2\30\u01ee\3\2\2\2\32\u021a\3\2\2\2\34\u021c\3\2\2\2" +
                    "\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2" +
                    "\2#/\5\b\5\2$/\5\n\6\2%&\7\30\2\2&\'\7c\2\2\'(\7\3\2\2(/\5\6\4\2)/\5\20" +
                    "\t\2*/\5\30\r\2+/\5\32\16\2,/\5\34\17\2-/\5\6\4\2.#\3\2\2\2.$\3\2\2\2" +
                    ".%\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2" +
                    "\2\60\61\b\4\1\2\61\62\7,\2\2\62\u0095\5\6\4\65\63\64\79\2\2\64\u0095" +
                    "\5\6\4%\65\u0095\7#\2\2\66\u0095\7$\2\2\67\u0095\7%\2\28\u0095\7&\2\2" +
                    "9\u0095\7\'\2\2:\u0095\7(\2\2;\u0095\7)\2\2<\u0095\7*\2\2=\u0095\7+\2" +
                    "\2>D\t\2\2\2?E\7c\2\2@A\7<\2\2AB\5\6\4\2BC\7=\2\2CE\3\2\2\2D?\3\2\2\2" +
                    "D@\3\2\2\2E\u0095\3\2\2\2FL\t\2\2\2GM\7c\2\2HI\7<\2\2IJ\5\6\4\2JK\7=\2" +
                    "\2KM\3\2\2\2LG\3\2\2\2LH\3\2\2\2M\u0095\3\2\2\2NP\7c\2\2OQ\5\24\13\2P" +
                    "O\3\2\2\2PQ\3\2\2\2QR\3\2\2\2R\\\7<\2\2ST\5\6\4\2TU\7\35\2\2UW\3\2\2\2" +
                    "VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[]\5\6\4\2" +
                    "\\X\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^\u0095\7=\2\2_`\7c\2\2`f\7J\2\2ab\5\6" +
                    "\4\2bc\7\35\2\2ce\3\2\2\2da\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3" +
                    "\2\2\2hf\3\2\2\2ik\5\6\4\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2l\u0095\7K\2\2" +
                    "ms\7<\2\2no\5\6\4\2op\7\35\2\2pr\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2" +
                    "st\3\2\2\2tw\3\2\2\2us\3\2\2\2vx\5\6\4\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2" +
                    "y\u0095\7=\2\2z\u0095\5\20\t\2{\u0081\7J\2\2|}\5\6\4\2}~\7\35\2\2~\u0080" +
                    "\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082" +
                    "\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\5\6\4\2\u0085" +
                    "\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0095\7K" +
                    "\2\2\u0088\u0095\7>\2\2\u0089\u0095\7?\2\2\u008a\u0095\7[\2\2\u008b\u0095" +
                    "\7\\\2\2\u008c\u0095\7]\2\2\u008d\u0095\7^\2\2\u008e\u0095\7Y\2\2\u008f" +
                    "\u0095\7Z\2\2\u0090\u0095\7d\2\2\u0091\u0095\7c\2\2\u0092\u0093\7\34\2" +
                    "\2\u0093\u0095\7c\2\2\u0094\60\3\2\2\2\u0094\63\3\2\2\2\u0094\65\3\2\2" +
                    "\2\u0094\66\3\2\2\2\u0094\67\3\2\2\2\u00948\3\2\2\2\u00949\3\2\2\2\u0094" +
                    ":\3\2\2\2\u0094;\3\2\2\2\u0094<\3\2\2\2\u0094=\3\2\2\2\u0094>\3\2\2\2" +
                    "\u0094F\3\2\2\2\u0094N\3\2\2\2\u0094_\3\2\2\2\u0094m\3\2\2\2\u0094z\3" +
                    "\2\2\2\u0094{\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u008a" +
                    "\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d\3\2\2\2\u0094" +
                    "\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2" +
                    "\2\2\u0094\u0092\3\2\2\2\u0095\u00f7\3\2\2\2\u0096\u0097\f\61\2\2\u0097" +
                    "\u0098\7/\2\2\u0098\u00f6\5\6\4\62\u0099\u009a\f\60\2\2\u009a\u009b\7" +
                    "\60\2\2\u009b\u00f6\5\6\4\61\u009c\u009d\f/\2\2\u009d\u009e\7\61\2\2\u009e" +
                    "\u00f6\5\6\4\60\u009f\u00a0\f.\2\2\u00a0\u00a1\7\62\2\2\u00a1\u00f6\5" +
                    "\6\4/\u00a2\u00a3\f-\2\2\u00a3\u00a4\7,\2\2\u00a4\u00f6\5\6\4.\u00a5\u00a6" +
                    "\f,\2\2\u00a6\u00a7\7\64\2\2\u00a7\u00f6\5\6\4-\u00a8\u00a9\f+\2\2\u00a9" +
                    "\u00aa\7\65\2\2\u00aa\u00f6\5\6\4,\u00ab\u00ac\f*\2\2\u00ac\u00ad\7\66" +
                    "\2\2\u00ad\u00f6\5\6\4+\u00ae\u00af\f)\2\2\u00af\u00b0\7\67\2\2\u00b0" +
                    "\u00f6\5\6\4*\u00b1\u00b2\f(\2\2\u00b2\u00b3\78\2\2\u00b3\u00f6\5\6\4" +
                    ")\u00b4\u00b5\f\'\2\2\u00b5\u00b6\7A\2\2\u00b6\u00f6\5\6\4(\u00b7\u00b8" +
                    "\f&\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5\6\4\2\u00ba\u00bb\7\34\2\2" +
                    "\u00bb\u00bc\5\6\4\'\u00bc\u00f6\3\2\2\2\u00bd\u00be\f$\2\2\u00be\u00bf" +
                    "\7:\2\2\u00bf\u00f6\5\6\4%\u00c0\u00c1\f#\2\2\u00c1\u00c2\7;\2\2\u00c2" +
                    "\u00f6\5\6\4$\u00c3\u00c4\f\37\2\2\u00c4\u00c5\7\63\2\2\u00c5\u00f6\5" +
                    "\6\4 \u00c6\u00c7\f\36\2\2\u00c7\u00c8\7\3\2\2\u00c8\u00f6\5\6\4\37\u00c9" +
                    "\u00ca\f\35\2\2\u00ca\u00cb\7\4\2\2\u00cb\u00f6\5\6\4\36\u00cc\u00cd\f" +
                    "\34\2\2\u00cd\u00ce\7\5\2\2\u00ce\u00f6\5\6\4\35\u00cf\u00d0\f\33\2\2" +
                    "\u00d0\u00d1\7\6\2\2\u00d1\u00f6\5\6\4\34\u00d2\u00d3\f\32\2\2\u00d3\u00d4" +
                    "\7\7\2\2\u00d4\u00f6\5\6\4\33\u00d5\u00d6\f\31\2\2\u00d6\u00d7\7\b\2\2" +
                    "\u00d7\u00f6\5\6\4\32\u00d8\u00d9\f\30\2\2\u00d9\u00da\7\t\2\2\u00da\u00f6" +
                    "\5\6\4\31\u00db\u00dc\f\27\2\2\u00dc\u00dd\7\n\2\2\u00dd\u00f6\5\6\4\30" +
                    "\u00de\u00df\f\26\2\2\u00df\u00e0\7\13\2\2\u00e0\u00f6\5\6\4\27\u00e1" +
                    "\u00e2\f\25\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00f6\5\6\4\26\u00e4\u00e5\f" +
                    "\24\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00f6\5\6\4\25\u00e7\u00e8\f\23\2\2" +
                    "\u00e8\u00e9\7\16\2\2\u00e9\u00f6\5\6\4\24\u00ea\u00eb\f\22\2\2\u00eb" +
                    "\u00ec\7\17\2\2\u00ec\u00f6\5\6\4\23\u00ed\u00ee\f\21\2\2\u00ee\u00ef" +
                    "\7\21\2\2\u00ef\u00f6\5\6\4\22\u00f0\u00f1\f\62\2\2\u00f1\u00f2\7-\2\2" +
                    "\u00f2\u00f6\5\20\t\2\u00f3\u00f4\f\20\2\2\u00f4\u00f6\7\20\2\2\u00f5" +
                    "\u0096\3\2\2\2\u00f5\u0099\3\2\2\2\u00f5\u009c\3\2\2\2\u00f5\u009f\3\2" +
                    "\2\2\u00f5\u00a2\3\2\2\2\u00f5\u00a5\3\2\2\2\u00f5\u00a8\3\2\2\2\u00f5" +
                    "\u00ab\3\2\2\2\u00f5\u00ae\3\2\2\2\u00f5\u00b1\3\2\2\2\u00f5\u00b4\3\2" +
                    "\2\2\u00f5\u00b7\3\2\2\2\u00f5\u00bd\3\2\2\2\u00f5\u00c0\3\2\2\2\u00f5" +
                    "\u00c3\3\2\2\2\u00f5\u00c6\3\2\2\2\u00f5\u00c9\3\2\2\2\u00f5\u00cc\3\2" +
                    "\2\2\u00f5\u00cf\3\2\2\2\u00f5\u00d2\3\2\2\2\u00f5\u00d5\3\2\2\2\u00f5" +
                    "\u00d8\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00de\3\2\2\2\u00f5\u00e1\3\2" +
                    "\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e7\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5" +
                    "\u00ed\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2" +
                    "\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\7\3\2\2\2\u00f9\u00f7" +
                    "\3\2\2\2\u00fa\u00fb\7\31\2\2\u00fb\u00fc\7<\2\2\u00fc\u00fd\7d\2\2\u00fd" +
                    "\u0129\7=\2\2\u00fe\u00ff\7\32\2\2\u00ff\u0129\7c\2\2\u0100\u0101\7\33" +
                    "\2\2\u0101\u0102\7c\2\2\u0102\u0103\7\34\2\2\u0103\u0108\7c\2\2\u0104" +
                    "\u0105\7\35\2\2\u0105\u0107\7c\2\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2" +
                    "\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0129\3\2\2\2\u010a" +
                    "\u0108\3\2\2\2\u010b\u010c\7\36\2\2\u010c\u0129\7c\2\2\u010d\u010e\7\37" +
                    "\2\2\u010e\u0113\7c\2\2\u010f\u0110\7\35\2\2\u0110\u0112\7c\2\2\u0111" +
                    "\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2" +
                    "\2\2\u0114\u0129\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7 \2\2\u0117" +
                    "\u0119\7c\2\2\u0118\u011a\5\4\3\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2" +
                    "\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d" +
                    "\u011e\7!\2\2\u011e\u0129\3\2\2\2\u011f\u0120\7\"\2\2\u0120\u0122\7c\2" +
                    "\2\u0121\u0123\5\4\3\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122" +
                    "\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\7!\2\2\u0127" +
                    "\u0129\3\2\2\2\u0128\u00fa\3\2\2\2\u0128\u00fe\3\2\2\2\u0128\u0100\3\2" +
                    "\2\2\u0128\u010b\3\2\2\2\u0128\u010d\3\2\2\2\u0128\u0116\3\2\2\2\u0128" +
                    "\u011f\3\2\2\2\u0129\t\3\2\2\2\u012a\u012b\7c\2\2\u012b\u012c\5\24\13" +
                    "\2\u012c\u012d\5\f\7\2\u012d\u012e\7\3\2\2\u012e\u012f\5\6\4\2\u012f\u014b" +
                    "\3\2\2\2\u0130\u0131\7c\2\2\u0131\u0132\5\f\7\2\u0132\u0133\7\3\2\2\u0133" +
                    "\u0134\5\6\4\2\u0134\u014b\3\2\2\2\u0135\u0136\7G\2\2\u0136\u0137\7c\2" +
                    "\2\u0137\u0139\5\f\7\2\u0138\u013a\5\4\3\2\u0139\u0138\3\2\2\2\u013a\u013b" +
                    "\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d" +
                    "\u013e\7!\2\2\u013e\u014b\3\2\2\2\u013f\u0140\7G\2\2\u0140\u0141\7c\2" +
                    "\2\u0141\u0142\5\24\13\2\u0142\u0144\5\f\7\2\u0143\u0145\5\4\3\2\u0144" +
                    "\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2" +
                    "\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7!\2\2\u0149\u014b\3\2\2\2\u014a" +
                    "\u012a\3\2\2\2\u014a\u0130\3\2\2\2\u014a\u0135\3\2\2\2\u014a\u013f\3\2" +
                    "\2\2\u014b\13\3\2\2\2\u014c\u0155\7<\2\2\u014d\u0152\5\16\b\2\u014e\u014f" +
                    "\7\35\2\2\u014f\u0151\5\16\b\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2" +
                    "\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152" +
                    "\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157" +
                    "\u0159\7\20\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3" +
                    "\2\2\2\u015a\u015b\7=\2\2\u015b\r\3\2\2\2\u015c\u015d\7c\2\2\u015d\u015e" +
                    "\7-\2\2\u015e\u0163\5\20\t\2\u015f\u0160\7-\2\2\u0160\u0163\5\20\t\2\u0161" +
                    "\u0163\7c\2\2\u0162\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0161\3\2" +
                    "\2\2\u0163\17\3\2\2\2\u0164\u01d3\7L\2\2\u0165\u01d3\7M\2\2\u0166\u01d3" +
                    "\7N\2\2\u0167\u01d3\7O\2\2\u0168\u01d3\7P\2\2\u0169\u01d3\7Q\2\2\u016a" +
                    "\u01d3\7R\2\2\u016b\u01d3\7S\2\2\u016c\u01d3\7T\2\2\u016d\u01d3\7U\2\2" +
                    "\u016e\u01d3\7V\2\2\u016f\u01d3\7W\2\2\u0170\u01d3\7X\2\2\u0171\u01d3" +
                    "\7Y\2\2\u0172\u01d3\7Z\2\2\u0173\u0174\7@\2\2\u0174\u0175\7c\2\2\u0175" +
                    "\u0176\7A\2\2\u0176\u01d3\7c\2\2\u0177\u0178\7@\2\2\u0178\u01d3\7c\2\2" +
                    "\u0179\u017a\7B\2\2\u017a\u017b\7g\2\2\u017b\u017c\7c\2\2\u017c\u017d" +
                    "\7A\2\2\u017d\u01d3\7c\2\2\u017e\u017f\7B\2\2\u017f\u0180\7g\2\2\u0180" +
                    "\u01d3\7c\2\2\u0181\u0182\7D\2\2\u0182\u0183\7c\2\2\u0183\u0187\5\24\13" +
                    "\2\u0184\u0186\5\22\n\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187" +
                    "\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018d\3\2\2\2\u0189\u0187\3\2" +
                    "\2\2\u018a\u018c\5\n\6\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d" +
                    "\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2" +
                    "\2\2\u0190\u0191\7!\2\2\u0191\u01d3\3\2\2\2\u0192\u0193\7D\2\2\u0193\u0197" +
                    "\7c\2\2\u0194\u0196\5\22\n\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197" +
                    "\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019d\3\2\2\2\u0199\u0197\3\2" +
                    "\2\2\u019a\u019c\5\n\6\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d" +
                    "\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2" +
                    "\2\2\u01a0\u01d3\7!\2\2\u01a1\u01a2\7E\2\2\u01a2\u01a6\7c\2\2\u01a3\u01a5" +
                    "\5\22\n\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2" +
                    "\u01a6\u01a7\3\2\2\2\u01a7\u01ac\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab" +
                    "\5\n\6\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac" +
                    "\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01d3\7!" +
                    "\2\2\u01b0\u01b1\7F\2\2\u01b1\u01b4\7H\2\2\u01b2\u01b5\5\20\t\2\u01b3" +
                    "\u01b5\7[\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01bb\3\2" +
                    "\2\2\u01b6\u01b9\7\35\2\2\u01b7\u01ba\5\20\t\2\u01b8\u01ba\7[\2\2\u01b9" +
                    "\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b6\3\2" +
                    "\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be" +
                    "\u01bf\3\2\2\2\u01bf\u01d3\7I\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c4\7H\2" +
                    "\2\u01c2\u01c5\5\20\t\2\u01c3\u01c5\7[\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3" +
                    "\3\2\2\2\u01c5\u01cd\3\2\2\2\u01c6\u01c9\7\35\2\2\u01c7\u01ca\5\20\t\2" +
                    "\u01c8\u01ca\7[\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cc" +
                    "\3\2\2\2\u01cb\u01c6\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd" +
                    "\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\7I" +
                    "\2\2\u01d1\u01d3\7c\2\2\u01d2\u0164\3\2\2\2\u01d2\u0165\3\2\2\2\u01d2" +
                    "\u0166\3\2\2\2\u01d2\u0167\3\2\2\2\u01d2\u0168\3\2\2\2\u01d2\u0169\3\2" +
                    "\2\2\u01d2\u016a\3\2\2\2\u01d2\u016b\3\2\2\2\u01d2\u016c\3\2\2\2\u01d2" +
                    "\u016d\3\2\2\2\u01d2\u016e\3\2\2\2\u01d2\u016f\3\2\2\2\u01d2\u0170\3\2" +
                    "\2\2\u01d2\u0171\3\2\2\2\u01d2\u0172\3\2\2\2\u01d2\u0173\3\2\2\2\u01d2" +
                    "\u0177\3\2\2\2\u01d2\u0179\3\2\2\2\u01d2\u017e\3\2\2\2\u01d2\u0181\3\2" +
                    "\2\2\u01d2\u0192\3\2\2\2\u01d2\u01a1\3\2\2\2\u01d2\u01b0\3\2\2\2\u01d2" +
                    "\u01c0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\21\3\2\2\2\u01d4\u01d5\7c\2\2" +
                    "\u01d5\u01d6\7-\2\2\u01d6\u01d9\5\20\t\2\u01d7\u01d9\7c\2\2\u01d8\u01d4" +
                    "\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\23\3\2\2\2\u01da\u01db\7H\2\2\u01db" +
                    "\u01e0\5\26\f\2\u01dc\u01dd\7\35\2\2\u01dd\u01df\5\26\f\2\u01de\u01dc" +
                    "\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1" +
                    "\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\7I\2\2\u01e4\25\3\2\2\2" +
                    "\u01e5\u01e6\7c\2\2\u01e6\u01e7\7A\2\2\u01e7\u01ed\5\20\t\2\u01e8\u01e9" +
                    "\7-\2\2\u01e9\u01ed\5\20\t\2\u01ea\u01ed\7c\2\2\u01eb\u01ed\7[\2\2\u01ec" +
                    "\u01e5\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2" +
                    "\2\2\u01ed\27\3\2\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1" +
                    "\5\24\13\2\u01f1\u01f2\5\20\t\2\u01f2\31\3\2\2\2\u01f3\u01f4\7\27\2\2" +
                    "\u01f4\u01f5\5\6\4\2\u01f5\u01f6\7\3\2\2\u01f6\u01f7\5\6\4\2\u01f7\u01f8" +
                    "\7\34\2\2\u01f8\u01fa\5\6\4\2\u01f9\u01fb\5\4\3\2\u01fa\u01f9\3\2\2\2" +
                    "\u01fb\u01fc\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe" +
                    "\3\2\2\2\u01fe\u01ff\7!\2\2\u01ff\u021b\3\2\2\2\u0200\u0201\7\27\2\2\u0201" +
                    "\u0202\5\6\4\2\u0202\u0203\7\3\2\2\u0203\u0204\5\6\4\2\u0204\u0205\7\34" +
                    "\2\2\u0205\u0206\5\6\4\2\u0206\u0207\7\34\2\2\u0207\u0209\5\6\4\2\u0208" +
                    "\u020a\5\4\3\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2" +
                    "\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7!\2\2\u020e" +
                    "\u021b\3\2\2\2\u020f\u0210\7\27\2\2\u0210\u0211\5\6\4\2\u0211\u0212\7" +
                    "\23\2\2\u0212\u0214\5\6\4\2\u0213\u0215\5\4\3\2\u0214\u0213\3\2\2\2\u0215" +
                    "\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2" +
                    "\2\2\u0218\u0219\7!\2\2\u0219\u021b\3\2\2\2\u021a\u01f3\3\2\2\2\u021a" +
                    "\u0200\3\2\2\2\u021a\u020f\3\2\2\2\u021b\33\3\2\2\2\u021c\u021d\7\24\2" +
                    "\2\u021d\u021f\5\6\4\2\u021e\u0220\5\4\3\2\u021f\u021e\3\2\2\2\u0220\u0221" +
                    "\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u022b\3\2\2\2\u0223" +
                    "\u0225\7\25\2\2\u0224\u0226\5\4\3\2\u0225\u0224\3\2\2\2\u0226\u0227\3" +
                    "\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229" +
                    "\u0223\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2" +
                    "\2\2\u022c\u0234\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7\26\2\2\u022f" +
                    "\u0231\5\4\3\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2" +
                    "\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u022e\3\2\2\2\u0234" +
                    "\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7!\2\2\u0237\35\3\2\2\2" +
                    "\67!.DLPX\\fjsw\u0081\u0085\u0094\u00f5\u00f7\u0108\u0113\u011b\u0124" +
                    "\u0128\u013b\u0146\u014a\u0152\u0155\u0158\u0162\u0187\u018d\u0197\u019d" +
                    "\u01a6\u01ac\u01b4\u01b9\u01bd\u01c4\u01c9\u01cd\u01d2\u01d8\u01e0\u01ec" +
                    "\u01fc\u020b\u0216\u021a\u0221\u0227\u022b\u0232\u0234";
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
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
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
            setState(44);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(33);
                    moduleDirective();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(34);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(35);
                    match(CONST);
                    setState(36);
                    match(ID);
                    setState(37);
                    match(EQ);
                    setState(38);
                    exp(0);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(39);
                    typeExpression();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(40);
                    typeAlias();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(41);
                    forStatement();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(42);
                    ifStatement();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(43);
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
                setState(146);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                    case 1: {
                        _localctx = new UnaryMinusContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(47);
                        match(MINUS);
                        setState(48);
                        exp(51);
                    }
                    break;
                    case 2: {
                        _localctx = new NotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(49);
                        match(NOT);
                        setState(50);
                        exp(35);
                    }
                    break;
                    case 3: {
                        _localctx = new Inf16TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(51);
                        match(INF16);
                    }
                    break;
                    case 4: {
                        _localctx = new Inf32TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(52);
                        match(INF32);
                    }
                    break;
                    case 5: {
                        _localctx = new InfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(53);
                        match(INF);
                    }
                    break;
                    case 6: {
                        _localctx = new MinusInf16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(54);
                        match(MINUS_INF16);
                    }
                    break;
                    case 7: {
                        _localctx = new MinusInf32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(55);
                        match(MINUS_INF32);
                    }
                    break;
                    case 8: {
                        _localctx = new MinusInfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(56);
                        match(MINUS_INF);
                    }
                    break;
                    case 9: {
                        _localctx = new Nan16Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(57);
                        match(NAN16);
                    }
                    break;
                    case 10: {
                        _localctx = new Nan32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(58);
                        match(NAN32);
                    }
                    break;
                    case 11: {
                        _localctx = new NanContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(59);
                        match(NAN);
                    }
                    break;
                    case 12: {
                        _localctx = new CoeffientContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(60);
                        _la = _input.LA(1);
                        if (!(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (FLOAT32 - 87)) | (1L << (FLOAT64 - 87)) | (1L << (INT - 87)))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(66);
                        switch (_input.LA(1)) {
                            case ID: {
                                setState(61);
                                match(ID);
                            }
                            break;
                            case LEFT_BRACKET: {
                                setState(62);
                                match(LEFT_BRACKET);
                                setState(63);
                                exp(0);
                                setState(64);
                                match(RIGHT_BRACKET);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                    case 13: {
                        _localctx = new CoeffientContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(68);
                        _la = _input.LA(1);
                        if (!(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (FLOAT32 - 87)) | (1L << (FLOAT64 - 87)) | (1L << (INT - 87)))) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(74);
                        switch (_input.LA(1)) {
                            case ID: {
                                setState(69);
                                match(ID);
                            }
                            break;
                            case LEFT_BRACKET: {
                                setState(70);
                                match(LEFT_BRACKET);
                                setState(71);
                                exp(0);
                                setState(72);
                                match(RIGHT_BRACKET);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    break;
                    case 14: {
                        _localctx = new ApplyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(76);
                        match(ID);
                        setState(78);
                        _la = _input.LA(1);
                        if (_la == LEFT_CURLY) {
                            {
                                setState(77);
                                typeParameters();
                            }
                        }

                        setState(80);
                        match(LEFT_BRACKET);
                        setState(90);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                            {
                                setState(86);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                    if (_alt == 1) {
                                        {
                                            {
                                                setState(81);
                                                exp(0);
                                                setState(82);
                                                match(COMMA);
                                            }
                                        }
                                    }
                                    setState(88);
                                    _errHandler.sync(this);
                                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                                }
                                setState(89);
                                exp(0);
                            }
                        }

                        setState(92);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 15: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(93);
                        match(ID);
                        setState(94);
                        match(LEFT_SQUARE);
                        setState(100);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(95);
                                        exp(0);
                                        setState(96);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(102);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
                        }
                        setState(104);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                            {
                                setState(103);
                                exp(0);
                            }
                        }

                        setState(106);
                        match(RIGHT_SQUARE);
                    }
                    break;
                    case 16: {
                        _localctx = new TupleContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(107);
                        match(LEFT_BRACKET);
                        setState(113);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(108);
                                        exp(0);
                                        setState(109);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(115);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                        }
                        setState(117);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                            {
                                setState(116);
                                exp(0);
                            }
                        }

                        setState(119);
                        match(RIGHT_BRACKET);
                    }
                    break;
                    case 17: {
                        _localctx = new TypeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(120);
                        typeExpression();
                    }
                    break;
                    case 18: {
                        _localctx = new ArrayIndexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(121);
                        match(LEFT_SQUARE);
                        setState(127);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(122);
                                        exp(0);
                                        setState(123);
                                        match(COMMA);
                                    }
                                }
                            }
                            setState(129);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                        }
                        setState(131);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLON) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0)) {
                            {
                                setState(130);
                                exp(0);
                            }
                        }

                        setState(133);
                        match(RIGHT_SQUARE);
                    }
                    break;
                    case 19: {
                        _localctx = new TtContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(134);
                        match(TRUE);
                    }
                    break;
                    case 20: {
                        _localctx = new FfContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(135);
                        match(FALSE);
                    }
                    break;
                    case 21: {
                        _localctx = new IntContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(136);
                        match(INT);
                    }
                    break;
                    case 22: {
                        _localctx = new BinaryContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(137);
                        match(BINARY);
                    }
                    break;
                    case 23: {
                        _localctx = new OctalContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(138);
                        match(OCTAL);
                    }
                    break;
                    case 24: {
                        _localctx = new HexContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(139);
                        match(HEX);
                    }
                    break;
                    case 25: {
                        _localctx = new Float32Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(140);
                        match(FLOAT32);
                    }
                    break;
                    case 26: {
                        _localctx = new Float64Context(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(141);
                        match(FLOAT64);
                    }
                    break;
                    case 27: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(142);
                        match(STRING);
                    }
                    break;
                    case 28: {
                        _localctx = new IdentifierContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(143);
                        match(ID);
                    }
                    break;
                    case 29: {
                        _localctx = new SymbolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(144);
                        match(COLON);
                        setState(145);
                        match(ID);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(245);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(243);
                            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                                case 1: {
                                    _localctx = new FractionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(148);
                                    if (!(precpred(_ctx, 47)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 47)");
                                    setState(149);
                                    match(FRACTION);
                                    setState(150);
                                    exp(48);
                                }
                                break;
                                case 2: {
                                    _localctx = new TimesContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(151);
                                    if (!(precpred(_ctx, 46)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 46)");
                                    setState(152);
                                    match(TIMES);
                                    setState(153);
                                    exp(47);
                                }
                                break;
                                case 3: {
                                    _localctx = new DivideContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(154);
                                    if (!(precpred(_ctx, 45)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 45)");
                                    setState(155);
                                    match(DIVIDE);
                                    setState(156);
                                    exp(46);
                                }
                                break;
                                case 4: {
                                    _localctx = new PlusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(157);
                                    if (!(precpred(_ctx, 44)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 44)");
                                    setState(158);
                                    match(PLUS);
                                    setState(159);
                                    exp(45);
                                }
                                break;
                                case 5: {
                                    _localctx = new MinusContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(160);
                                    if (!(precpred(_ctx, 43)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 43)");
                                    setState(161);
                                    match(MINUS);
                                    setState(162);
                                    exp(44);
                                }
                                break;
                                case 6: {
                                    _localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(163);
                                    if (!(precpred(_ctx, 42)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 42)");
                                    setState(164);
                                    match(GREATER_THAN);
                                    setState(165);
                                    exp(43);
                                }
                                break;
                                case 7: {
                                    _localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(166);
                                    if (!(precpred(_ctx, 41)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 41)");
                                    setState(167);
                                    match(LESS_THAN);
                                    setState(168);
                                    exp(42);
                                }
                                break;
                                case 8: {
                                    _localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(169);
                                    if (!(precpred(_ctx, 40)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 40)");
                                    setState(170);
                                    match(GREATER_THAN_OR_EQ);
                                    setState(171);
                                    exp(41);
                                }
                                break;
                                case 9: {
                                    _localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(172);
                                    if (!(precpred(_ctx, 39)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                                    setState(173);
                                    match(LESS_THAN_OR_EQ);
                                    setState(174);
                                    exp(40);
                                }
                                break;
                                case 10: {
                                    _localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(175);
                                    if (!(precpred(_ctx, 38)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                                    setState(176);
                                    match(EQUALS);
                                    setState(177);
                                    exp(39);
                                }
                                break;
                                case 11: {
                                    _localctx = new SubtypeContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(178);
                                    if (!(precpred(_ctx, 37)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 37)");
                                    setState(179);
                                    match(SUB_TYPE);
                                    setState(180);
                                    exp(38);
                                }
                                break;
                                case 12: {
                                    _localctx = new ConditionalContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(181);
                                    if (!(precpred(_ctx, 36)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 36)");
                                    setState(182);
                                    match(QUESTION_MARK);
                                    setState(183);
                                    exp(0);
                                    setState(184);
                                    match(COLON);
                                    setState(185);
                                    exp(37);
                                }
                                break;
                                case 13: {
                                    _localctx = new AndContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(187);
                                    if (!(precpred(_ctx, 34)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 34)");
                                    setState(188);
                                    match(AND);
                                    setState(189);
                                    exp(35);
                                }
                                break;
                                case 14: {
                                    _localctx = new OrContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(190);
                                    if (!(precpred(_ctx, 33)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 33)");
                                    setState(191);
                                    match(OR);
                                    setState(192);
                                    exp(34);
                                }
                                break;
                                case 15: {
                                    _localctx = new NotEqualContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(193);
                                    if (!(precpred(_ctx, 29)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 29)");
                                    setState(194);
                                    match(NOT_EQUAL);
                                    setState(195);
                                    exp(30);
                                }
                                break;
                                case 16: {
                                    _localctx = new AssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(196);
                                    if (!(precpred(_ctx, 28)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 28)");
                                    setState(197);
                                    match(EQ);
                                    setState(198);
                                    exp(29);
                                }
                                break;
                                case 17: {
                                    _localctx = new AddAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(199);
                                    if (!(precpred(_ctx, 27)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                                    setState(200);
                                    match(ADD_ASGN);
                                    setState(201);
                                    exp(28);
                                }
                                break;
                                case 18: {
                                    _localctx = new MinusAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(202);
                                    if (!(precpred(_ctx, 26)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                                    setState(203);
                                    match(SUB_ASGN);
                                    setState(204);
                                    exp(27);
                                }
                                break;
                                case 19: {
                                    _localctx = new TimesAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(205);
                                    if (!(precpred(_ctx, 25)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                                    setState(206);
                                    match(TIMES_ASGN);
                                    setState(207);
                                    exp(26);
                                }
                                break;
                                case 20: {
                                    _localctx = new DivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(208);
                                    if (!(precpred(_ctx, 24)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                                    setState(209);
                                    match(DIVIDE_ASGN);
                                    setState(210);
                                    exp(25);
                                }
                                break;
                                case 21: {
                                    _localctx = new InvDivexpeAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(211);
                                    if (!(precpred(_ctx, 23)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                                    setState(212);
                                    match(INV_DIVIDE_ASGN);
                                    setState(213);
                                    exp(24);
                                }
                                break;
                                case 22: {
                                    _localctx = new RemainderAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(214);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(215);
                                    match(REMAINDER_ASGN);
                                    setState(216);
                                    exp(23);
                                }
                                break;
                                case 23: {
                                    _localctx = new PowerAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(217);
                                    if (!(precpred(_ctx, 21)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                                    setState(218);
                                    match(POWER_ASGN);
                                    setState(219);
                                    exp(22);
                                }
                                break;
                                case 24: {
                                    _localctx = new BitwiseAndAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(220);
                                    if (!(precpred(_ctx, 20)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    setState(221);
                                    match(BITWISE_AND_ASGN);
                                    setState(222);
                                    exp(21);
                                }
                                break;
                                case 25: {
                                    _localctx = new BitwiseOrAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(223);
                                    if (!(precpred(_ctx, 19)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    setState(224);
                                    match(BITWISE_OR_ASGN);
                                    setState(225);
                                    exp(20);
                                }
                                break;
                                case 26: {
                                    _localctx = new BitwiseXorAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(226);
                                    if (!(precpred(_ctx, 18)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    setState(227);
                                    match(BITWISE_XOR_ASGN);
                                    setState(228);
                                    exp(19);
                                }
                                break;
                                case 27: {
                                    _localctx = new LSRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(229);
                                    if (!(precpred(_ctx, 17)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    setState(230);
                                    match(LSR_ASGN);
                                    setState(231);
                                    exp(18);
                                }
                                break;
                                case 28: {
                                    _localctx = new ASRAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(232);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(233);
                                    match(ASR_ASGN);
                                    setState(234);
                                    exp(17);
                                }
                                break;
                                case 29: {
                                    _localctx = new ASLAssignContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(235);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(236);
                                    match(ASL_ASGN);
                                    setState(237);
                                    exp(16);
                                }
                                break;
                                case 30: {
                                    _localctx = new TypedExpressionContext(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(238);
                                    if (!(precpred(_ctx, 48)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 48)");
                                    setState(239);
                                    match(INSTANCE_OF);
                                    setState(240);
                                    typeExpression();
                                }
                                break;
                                case 31: {
                                    _localctx = new Tbc1Context(new ExpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_exp);
                                    setState(241);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(242);
                                    match(ELLIPSE);
                                }
                                break;
                            }
                        }
                    }
                    setState(247);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
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
            setState(294);
            switch (_input.LA(1)) {
                case INCLUDE:
                    _localctx = new IncludeContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(248);
                    match(INCLUDE);
                    setState(249);
                    match(LEFT_BRACKET);
                    setState(250);
                    match(STRING);
                    setState(251);
                    match(RIGHT_BRACKET);
                }
                break;
                case USING:
                    _localctx = new UsingContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(252);
                    match(USING);
                    setState(253);
                    match(ID);
                }
                break;
                case IMPORT:
                    _localctx = new ImporttContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(254);
                    match(IMPORT);
                    setState(255);
                    match(ID);
                    setState(256);
                    match(COLON);
                    setState(257);
                    match(ID);
                    setState(262);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(258);
                                match(COMMA);
                                setState(259);
                                match(ID);
                            }
                        }
                        setState(264);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case IMPORT_ALL:
                    _localctx = new ImportAllContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(265);
                    match(IMPORT_ALL);
                    setState(266);
                    match(ID);
                }
                break;
                case EXPORT:
                    _localctx = new ExportContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(267);
                    match(EXPORT);
                    setState(268);
                    match(ID);
                    setState(273);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(269);
                                match(COMMA);
                                setState(270);
                                match(ID);
                            }
                        }
                        setState(275);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case MODULE:
                    _localctx = new ModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(276);
                    match(MODULE);
                    setState(277);
                    match(ID);
                    setState(279);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(278);
                                statement();
                            }
                        }
                        setState(281);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(283);
                    match(END);
                }
                break;
                case BAREMODULE:
                    _localctx = new BareModuleDeclarationContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(285);
                    match(BAREMODULE);
                    setState(286);
                    match(ID);
                    setState(288);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(287);
                                statement();
                            }
                        }
                        setState(290);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(292);
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
            setState(328);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(296);
                    match(ID);
                    setState(297);
                    typeParameters();
                    setState(298);
                    parameters();
                    setState(299);
                    match(EQ);
                    setState(300);
                    exp(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(302);
                    match(ID);
                    setState(303);
                    parameters();
                    setState(304);
                    match(EQ);
                    setState(305);
                    exp(0);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(307);
                    match(FUNCTION);
                    setState(308);
                    match(ID);
                    setState(309);
                    parameters();
                    setState(311);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(310);
                                statement();
                            }
                        }
                        setState(313);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(315);
                    match(END);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(317);
                    match(FUNCTION);
                    setState(318);
                    match(ID);
                    setState(319);
                    typeParameters();
                    setState(320);
                    parameters();
                    setState(322);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(321);
                                statement();
                            }
                        }
                        setState(324);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(326);
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

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(LEFT_BRACKET);
                setState(339);
                _la = _input.LA(1);
                if (_la == INSTANCE_OF || _la == ID) {
                    {
                        setState(331);
                        parameter();
                        setState(336);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(332);
                                    match(COMMA);
                                    setState(333);
                                    parameter();
                                }
                            }
                            setState(338);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(342);
                _la = _input.LA(1);
                if (_la == ELLIPSE) {
                    {
                        setState(341);
                        match(ELLIPSE);
                    }
                }

                setState(344);
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
            setState(352);
            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(346);
                    match(ID);
                    setState(347);
                    match(INSTANCE_OF);
                    setState(348);
                    typeExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(349);
                    match(INSTANCE_OF);
                    setState(350);
                    typeExpression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(351);
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
            setState(464);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(354);
                    match(INT8);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(355);
                    match(UINT8);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(356);
                    match(INT16);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(357);
                    match(UINT16);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(358);
                    match(INT32);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(359);
                    match(UINT32);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(360);
                    match(INT64);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(361);
                    match(UINT64);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(362);
                    match(INT128);
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(363);
                    match(UINT128);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(364);
                    match(BOOL);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(365);
                    match(CHAR);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(366);
                    match(FLOAT16);
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(367);
                    match(FLOAT32);
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(368);
                    match(FLOAT64);
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(369);
                    match(ABSTRACT);
                    setState(370);
                    match(ID);
                    setState(371);
                    match(SUB_TYPE);
                    setState(372);
                    match(ID);
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(373);
                    match(ABSTRACT);
                    setState(374);
                    match(ID);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(375);
                    match(BITS_TYPE);
                    setState(376);
                    match(SIZE);
                    setState(377);
                    match(ID);
                    setState(378);
                    match(SUB_TYPE);
                    setState(379);
                    match(ID);
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(380);
                    match(BITS_TYPE);
                    setState(381);
                    match(SIZE);
                    setState(382);
                    match(ID);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(383);
                    match(TYPE);
                    setState(384);
                    match(ID);
                    setState(385);
                    typeParameters();
                    setState(389);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(386);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(391);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                    }
                    setState(395);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(392);
                                functionDeclaration();
                            }
                        }
                        setState(397);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(398);
                    match(END);
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(400);
                    match(TYPE);
                    setState(401);
                    match(ID);
                    setState(405);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
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
                        _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
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
                    enterOuterAlt(_localctx, 22);
                {
                    setState(415);
                    match(IMMUTABLE);
                    setState(416);
                    match(ID);
                    setState(420);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(417);
                                    fieldDeclaration();
                                }
                            }
                        }
                        setState(422);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                    }
                    setState(426);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == FUNCTION || _la == ID) {
                        {
                            {
                                setState(423);
                                functionDeclaration();
                            }
                        }
                        setState(428);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(429);
                    match(END);
                }
                break;
                case 23:
                    enterOuterAlt(_localctx, 23);
                {
                    setState(430);
                    match(UNION);
                    setState(431);
                    match(LEFT_CURLY);
                    setState(434);
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
                            setState(432);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(433);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(441);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(436);
                                match(COMMA);
                                setState(439);
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
                                        setState(437);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(438);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(443);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == COMMA);
                    setState(445);
                    match(RIGHT_CURLY);
                }
                break;
                case 24:
                    enterOuterAlt(_localctx, 24);
                {
                    setState(446);
                    match(ID);
                    setState(447);
                    match(LEFT_CURLY);
                    setState(450);
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
                            setState(448);
                            typeExpression();
                        }
                        break;
                        case INT: {
                            setState(449);
                            match(INT);
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(459);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(452);
                                match(COMMA);
                                setState(455);
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
                                        setState(453);
                                        typeExpression();
                                    }
                                    break;
                                    case INT: {
                                        setState(454);
                                        match(INT);
                                    }
                                    break;
                                    default:
                                        throw new NoViableAltException(this);
                                }
                            }
                        }
                        setState(461);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(462);
                    match(RIGHT_CURLY);
                }
                break;
                case 25:
                    enterOuterAlt(_localctx, 25);
                {
                    setState(463);
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
            setState(470);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(466);
                    match(ID);
                    setState(467);
                    match(INSTANCE_OF);
                    setState(468);
                    typeExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(469);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(472);
                match(LEFT_CURLY);
                setState(473);
                typeParameter();
                setState(478);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(474);
                            match(COMMA);
                            setState(475);
                            typeParameter();
                        }
                    }
                    setState(480);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(481);
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
            setState(490);
            switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(483);
                    match(ID);
                    setState(484);
                    match(SUB_TYPE);
                    setState(485);
                    typeExpression();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(486);
                    match(INSTANCE_OF);
                    setState(487);
                    typeExpression();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(488);
                    match(ID);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(489);
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
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(492);
                match(TYPE_ALIAS);
                setState(493);
                match(ID);
                setState(494);
                typeParameters();
                setState(495);
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
            setState(536);
            switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(497);
                    match(FOR);
                    setState(498);
                    exp(0);
                    setState(499);
                    match(EQ);
                    setState(500);
                    exp(0);
                    setState(501);
                    match(COLON);
                    setState(502);
                    exp(0);
                    setState(504);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(503);
                                statement();
                            }
                        }
                        setState(506);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(508);
                    match(END);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(510);
                    match(FOR);
                    setState(511);
                    exp(0);
                    setState(512);
                    match(EQ);
                    setState(513);
                    exp(0);
                    setState(514);
                    match(COLON);
                    setState(515);
                    exp(0);
                    setState(516);
                    match(COLON);
                    setState(517);
                    exp(0);
                    setState(519);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(518);
                                statement();
                            }
                        }
                        setState(521);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(523);
                    match(END);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(525);
                    match(FOR);
                    setState(526);
                    exp(0);
                    setState(527);
                    match(IN);
                    setState(528);
                    exp(0);
                    setState(530);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(529);
                                statement();
                            }
                        }
                        setState(532);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    setState(534);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(538);
                match(IF);
                setState(539);
                exp(0);
                setState(541);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(540);
                            statement();
                        }
                    }
                    setState(543);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                setState(553);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ELSE_IF) {
                    {
                        {
                            setState(545);
                            match(ELSE_IF);
                            setState(547);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            do {
                                {
                                    {
                                        setState(546);
                                        statement();
                                    }
                                }
                                setState(549);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                        }
                    }
                    setState(555);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(562);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(556);
                        match(ELSE);
                        setState(558);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(557);
                                    statement();
                                }
                            }
                            setState(560);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << CONST) | (1L << INCLUDE) | (1L << USING) | (1L << IMPORT) | (1L << COLON) | (1L << IMPORT_ALL) | (1L << EXPORT) | (1L << MODULE) | (1L << BAREMODULE) | (1L << INF16) | (1L << INF32) | (1L << INF) | (1L << MINUS_INF16) | (1L << MINUS_INF32) | (1L << MINUS_INF) | (1L << NAN16) | (1L << NAN32) | (1L << NAN) | (1L << MINUS) | (1L << NOT) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ABSTRACT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BITS_TYPE - 64)) | (1L << (TYPE_ALIAS - 64)) | (1L << (TYPE - 64)) | (1L << (IMMUTABLE - 64)) | (1L << (UNION - 64)) | (1L << (FUNCTION - 64)) | (1L << (LEFT_SQUARE - 64)) | (1L << (INT8 - 64)) | (1L << (UINT8 - 64)) | (1L << (INT16 - 64)) | (1L << (UINT16 - 64)) | (1L << (INT32 - 64)) | (1L << (UINT32 - 64)) | (1L << (INT64 - 64)) | (1L << (UINT64 - 64)) | (1L << (INT128 - 64)) | (1L << (UINT128 - 64)) | (1L << (BOOL - 64)) | (1L << (CHAR - 64)) | (1L << (FLOAT16 - 64)) | (1L << (FLOAT32 - 64)) | (1L << (FLOAT64 - 64)) | (1L << (INT - 64)) | (1L << (BINARY - 64)) | (1L << (OCTAL - 64)) | (1L << (HEX - 64)) | (1L << (ID - 64)) | (1L << (STRING - 64)))) != 0));
                    }
                }

                setState(564);
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

    public static class TypeContext extends ExpContext {
        public TypeContext(ExpContext ctx) {
            copyFrom(ctx);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitType(this);
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

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
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

        public TerminalNode FUNCTION() {
            return getToken(JuliaParser.FUNCTION, 0);
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
            return RULE_functionDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener)
                ((JuliaParserListener) listener).enterFunctionDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFunctionDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitFunctionDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParametersContext extends ParserRuleContext {
        public ParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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
        public int getRuleIndex() {
            return RULE_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParameterContext extends ParserRuleContext {
        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeExpressionContext extends ParserRuleContext {
        public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode INT8() {
            return getToken(JuliaParser.INT8, 0);
        }

        public TerminalNode UINT8() {
            return getToken(JuliaParser.UINT8, 0);
        }

        public TerminalNode INT16() {
            return getToken(JuliaParser.INT16, 0);
        }

        public TerminalNode UINT16() {
            return getToken(JuliaParser.UINT16, 0);
        }

        public TerminalNode INT32() {
            return getToken(JuliaParser.INT32, 0);
        }

        public TerminalNode UINT32() {
            return getToken(JuliaParser.UINT32, 0);
        }

        public TerminalNode INT64() {
            return getToken(JuliaParser.INT64, 0);
        }

        public TerminalNode UINT64() {
            return getToken(JuliaParser.UINT64, 0);
        }

        public TerminalNode INT128() {
            return getToken(JuliaParser.INT128, 0);
        }

        public TerminalNode UINT128() {
            return getToken(JuliaParser.UINT128, 0);
        }

        public TerminalNode BOOL() {
            return getToken(JuliaParser.BOOL, 0);
        }

        public TerminalNode CHAR() {
            return getToken(JuliaParser.CHAR, 0);
        }

        public TerminalNode FLOAT16() {
            return getToken(JuliaParser.FLOAT16, 0);
        }

        public TerminalNode FLOAT32() {
            return getToken(JuliaParser.FLOAT32, 0);
        }

        public TerminalNode FLOAT64() {
            return getToken(JuliaParser.FLOAT64, 0);
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

        public TerminalNode BITS_TYPE() {
            return getToken(JuliaParser.BITS_TYPE, 0);
        }

        public TerminalNode SIZE() {
            return getToken(JuliaParser.SIZE, 0);
        }

        public TerminalNode TYPE() {
            return getToken(JuliaParser.TYPE, 0);
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

        public TerminalNode IMMUTABLE() {
            return getToken(JuliaParser.IMMUTABLE, 0);
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
        public int getRuleIndex() {
            return RULE_typeExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitTypeExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FieldDeclarationContext extends ParserRuleContext {
        public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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
        public int getRuleIndex() {
            return RULE_fieldDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterFieldDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitFieldDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitFieldDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeParametersContext extends ParserRuleContext {
        public TypeParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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
        public int getRuleIndex() {
            return RULE_typeParameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitTypeParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeParameterContext extends ParserRuleContext {
        public TypeParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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

        public TerminalNode INSTANCE_OF() {
            return getToken(JuliaParser.INSTANCE_OF, 0);
        }

        public TerminalNode INT() {
            return getToken(JuliaParser.INT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterTypeParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitTypeParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitTypeParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TypeAliasContext extends ParserRuleContext {
        public TypeAliasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode TYPE_ALIAS() {
            return getToken(JuliaParser.TYPE_ALIAS, 0);
        }

        public TerminalNode ID() {
            return getToken(JuliaParser.ID, 0);
        }

        public TypeParametersContext typeParameters() {
            return getRuleContext(TypeParametersContext.class, 0);
        }

        public TypeExpressionContext typeExpression() {
            return getRuleContext(TypeExpressionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeAlias;
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

    public static class ForStatementContext extends ParserRuleContext {
        public ForStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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

        public TerminalNode IN() {
            return getToken(JuliaParser.IN, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterForStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitForStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitForStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfStatementContext extends ParserRuleContext {
        public IfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
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
        public int getRuleIndex() {
            return RULE_ifStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).enterIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof JuliaParserListener) ((JuliaParserListener) listener).exitIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof JuliaParserVisitor)
                return ((JuliaParserVisitor<? extends T>) visitor).visitIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }
}