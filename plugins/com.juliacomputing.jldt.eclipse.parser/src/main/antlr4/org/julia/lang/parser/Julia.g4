grammar Julia;
@lexer::members {
   int nesting = 0;
   int bracketNesting = 0;
}

unit                        :   block;

block                       :   (statement)*;

statement                   :   USING ID
                            |   IMPORT name COLON ID (COMMA ID)*
                            |   IMPORT name
                            |   IMPORT_ALL name
                            |   EXPORT ID (COMMA ID)*
                            |   moduleDeclaration
                            |   typeDeclaration
                            |   functionDeclaration
                            |   macroDeclaration
                            |   exp
                            |   EOL
                            ;

moduleDeclaration           :   MODULE ID block END                                                       #module
                            |   BARE_MODULE ID block END                                                  #bareModule
                            ;

macroDeclaration            :   MACRO ID parameters block END;

exp                         :   MINUS exp                                                                 #unaryMinus
                            |   PLUS exp                                                                  #unaryPlus
                            |   COLON exp                                                                 #symbol
                            |   NOT exp                                                                   #not
                            |   BITWISE_NOT exp                                                           #bitwiseNot
                            |   DOLLAR exp                                                                #dollarExp //tbc
                            |   exp DOT exp                                                               #dot
                            |   exp INSTANCE_OF typeExpression                                            #typedExpression
                            |   <assoc=right> exp POWER_OPERATOR exp                                      #exponent
                            |   exp SUB_TYPE exp                                                          #subType
                            |   exp RATIONAL_OPERATOR exp                                                 #rational
                            |   exp (TIMES exp)+                                                          #times
                            |   exp MULTIPLICATIVE_OPERATOR exp                                           #multiplicative
                            |   exp BIT_SHIFT_OPERATOR exp                                                #bitShift
                            |   exp (PLUS exp)+                                                           #plus
                            |   exp ADDITIVE_OPERATOR exp                                                 #aditive
                            |   exp MINUS exp                                                             #minus
                            |   exp COLON exp                                                             #range
                            |   exp PIPE_OPERATOR exp                                                     #applyPrecedng
                            |   exp RELATIONAL_OPERATOR exp                                               #relational
                            |   exp AND exp                                                               #lazyAnd
                            |   exp OR exp                                                                #lazyOr
                            |   exp ARROW_OPERATOR exp                                                    #arrow
                            |   exp CONDITIONAL_OPERATOR exp COLON exp                                    #ternaryConditional
                            |   exp EQ exp                                                                #simpleAssignment
                            |   exp ASSIGNMENT_OPERATOR exp                                               #assignment
                            |   <assoc=right> exp ARROW exp                                               #lambda
                            |   GLOBAL exp (COMMA exp)*                                                   #global
                            |   END_LITERAL                                                               #endLiteral
                            |   IF exp block (ELSE_IF exp block)* (ELSE block)? END                       #naryConditional
                            |   LET (ID EQ exp)* statement END                                            #let
                            |   BEGIN exp END                                                             #primitiveBlock
                            |   DO ((ID COMMA)* ID)? block END                                            #anonymousFunction
                            |   AT name LEFT_PARENTHESIS (exp COMMA)* exp? RIGHT_PARENTHESIS              #invokeMacro
                            |   AT name (exp)*                                                            #invokeMacro
                            |   CCALL LEFT_PARENTHESIS exp COMMA exp COMMA exp RIGHT_PARENTHESIS          #ccall
                            |   exp 'in' exp                                                              #in
                            |   exp ELLIPSE                                                               #tbc1

                            |   TRY block CATCH block END                                                 #tryCatch
                            |   FOR exp EQ exp (COLON exp)? (COLON exp)? block END                        #forEq
                            |   FOR exp 'in' exp block END                                                #forIn
                            |   WHILE exp block END                                                       #while
                            |   BREAK                                                                     #break
                            |   QUOTE block END                                                           #quote
                            |   LEFT_PARENTHESIS RIGHT_PARENTHESIS                                        #emptyTuple
                            |   LEFT_PARENTHESIS (exp COMMA)+ exp? RIGHT_PARENTHESIS                      #tuple //todo review ambiguous tuple vs exp
                            |   LEFT_PARENTHESIS exp RIGHT_PARENTHESIS                                    #parenthesised  //todo review ambiguous tuple vs exp


                            |   name typeParameters? LEFT_PARENTHESIS ((exp  COMMA)* exp)? RIGHT_PARENTHESIS    #applyFunction

                            |   (LEFT_BRACKET (exp COMMA)* exp? RIGHT_BRACKET)+                           #enumeration
                            |   LEFT_BRACKET exp FOR exp ('='|'in') exp (COLON exp)? RIGHT_BRACKET        #comprehension
//                            |   (INT_LITERAL|FLOAT32_LITERAL|FLOAT64_LITERAL) (ID | LEFT_PARENTHESIS exp RIGHT_PARENTHESIS )        #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)


                            |   exp (LEFT_BRACKET (exp COMMA)* exp? RIGHT_BRACKET)+                       #arrayIndex
//                            |   name                                                                    #nname

                            |   exp SEMI_COLON exp                                                        #sequence

                            |   ID                                                                        #identifier
                            |   REGEX                                                                     #regex
                            |   'true'                                                                    #tt
                            |   'false'                                                                   #ff
                            |   INT_LITERAL                                                               #int
                            |   BINARY                                                                    #binary
                            |   OCTAL                                                                     #octal
                            |   HEX                                                                       #hex
                            |   FLOAT32_LITERAL                                                           #ffloat32
                            |   FLOAT64_LITERAL                                                           #ffloat64
                            |   CHARACTER_LITERAL                                                         #charaacter
                            |   STRING                                                                    #string
                            |   COLON ID                                                                  #symbol
                            |   CONST ID EQ exp                                                           #constant
                            |   INF16                                                                     #inf16Type
                            |   INF32                                                                     #inf32Type
                            |   INF                                                                       #inf
                            |   MINUS_INF16                                                               #minusInf16
                            |   MINUS_INF32                                                               #minusInf32
                            |   MINUS_INF                                                                 #minusInf
                            |   NAN16                                                                     #nan16
                            |   NAN32                                                                     #nan32
                            |   NAN                                                                       #nan

                            |   exp COMMA exp                                                             #implicitTuple
                            |   RETURN exp                                                                #returnExp //todo review only occurs in a function body
                            |   RETURN                                                                    #return

//                            |   exp exp                                                                 #apply
                            |   typeExpression                                                            #ttypeExpression
                            ;

typeExpression              :   'Union' LEFT_BRACE typeExpression ( COMMA typeExpression)* RIGHT_BRACE    #unionType
                            |   ID typeParameters                                                         #parametricType
                            |   ID                                                                        #predefinedType
                            ;

functionDeclaration         :   name typeParameters? parameters EQ exp                                    #compactFunctionDeclaration //todo review name usage definition vs reference
                            |   FUNCTION name typeParameters? parameters block END                        #generalFunctionDeclaration
                            ;

parameters                  :   LEFT_PARENTHESIS (parameter ((COMMA|SEMI_COLON) parameter)*)? RIGHT_PARENTHESIS                        #pparameters
                            ;

parameter                   :   ID INSTANCE_OF typeExpression (EQ exp)?                                   #namedTypedParam
                            |   INSTANCE_OF typeExpression (EQ exp)?                                      #anonymousTypedParam
                            |   ID (EQ exp)?                                                              #namedParam
                            |   parameter ELLIPSE                                                         #vararg
                            ;

typeDeclaration             :   TYPE_ALIAS ID typeParameters? typeExpression                              #typeAlias
                            |   ABSTRACT ID typeParameters? (SUB_TYPE ID typeParameters?)?                #abstractType
                            |   BITS_TYPE SIZE ID SUB_TYPE ID                                             #bitsSubtype
                            |   BITS_TYPE SIZE ID                                                         #bitsTtype
                            |   TYPE ID typeParameters? (SUB_TYPE ID)? fieldDeclaration* functionDeclaration* END                       #mutableTypeDeclaration
                            |   IMMUTABLE ID typeParameters? (SUB_TYPE ID typeParameters?)? fieldDeclaration* functionDeclaration* END  #immutableTypeDeclaration
                            ;

fieldDeclaration            :   ID INSTANCE_OF typeExpression                                             #typedFieldDeclaration
                            |   ID                                                                        #untypedFieldDeclaration
                            ;

typeParameters              :   LEFT_BRACE (typeParameter (COMMA typeParameter)*)? RIGHT_BRACE            #ttypeParameters
                            ;

typeParameter               :   ID SUB_TYPE typeExpression                                                #constrainedType
                            |   INSTANCE_OF typeExpression                                                #anonymousType
                            |   exp                                                                       #expressionType
                            ;

name                        :   ID (DOT ID)*
                            ;

OR                          : '||';

AND                         : '&&';

//const unary_ops = Set{Symbol}([:(+),  :(-), :(!), :(~), :(<:), :(¬),:(>:), :(√), :(∛), :(∜)])
//const unary_and_binary_ops = Set{Symbol}([:(+), :(-), :($), :(&), :(~)])

MINUS                       : '-';
NOT                         : '!';
BITWISE_NOT                 : '~';
SUB_TYPE                    : '<:';
AMPERSAND                   : '&';

//todo :(¬),:(>:), :(√), :(∛), :(∜)])

ASSIGNMENT_OPERATOR         : ':=' |  '+=' | '-=' |  '*=' |  '/=' |   '//=' |  './/='
//                          | '='
                            | '.*=' | './=' | '\\=' | '.\\=' | '^=' |  '.^=' |  '%=' |   '.%='
                            | '|=' |  '&=' |  '$=' | '=>' |  '<<=' | '>>=' |  '>>>='
//                          | '~'
                            | '.+=' | '.-='
                            ;

CONDITIONAL_OPERATOR        : '?';

ARROW_OPERATOR              : '--'| '-->'
//                          | '←' | '→' | '↔' | '↚' | '↛' | '↠' | '↣' | '↦'
//                          | '↮' | '⇎' | '⇏' | '⇒' | '⇔' | '⇴' | '⇶' | '⇷' | '⇸' | '⇹'
//                          | '⇺' | '⇻' | '⇼' | '⇽' | '⇾' | '⇿' | '⟵' | '⟶' | '⟷' | '⟷'
//                          | '⟹' | '⟺' | '⟻' | '⟼' | '⟽' | '⟾' | '⟿' | '⤀' | '⤁' | '⤂'
//                          | '⤃' | '⤄' | '⤅' | '⤆' | '⤇' | '⤌' | '⤍' | '⤎' | '⤏' | '⤐'
//                          | '⤑' | '⤔' | '⤕' | '⤖' | '⤗' | '⤘' | '⤝' | '⤞' | '⤟' | '⤠'
//                          | '⥄' | '⥅' | '⥆' | '⥇' | '⥈' | '⥊' | '⥋' | '⥎' | '⥐' | '⥒'
//                          | '⥓' | '⥖' | '⥗' | '⥚' | '⥛' | '⥞' | '⥟' | '⥢' | '⥤' | '⥦'
//                          | '⥧' | '⥨' | '⥩' | '⥪' | '⥫' | '⥬' | '⥭' | '⥰' | '⧴' | '⬱'
//                          | '⬰' | '⬲' | '⬳' | '⬴' | '⬵' | '⬶' | '⬷' | '⬸' | '⬹' | '⬺'
//                          | '⬻' | '⬼' | '⬽' | '⬾' | '⬿' | '⭀' | '⭁' | '⭂' | '⭃' | '⭄'
//                          | '⭇' | '⭈' | '⭉' | '⭊' | '⭋' | '⭌' | '￩' | '￫'
                            ;


RELATIONAL_OPERATOR         : '>:' | '>' |  '<' | '>=' | '≥' | '<=' | '≤' | '==' | '===' | '≡'
//                            | '<:'
                            | '!=' | '≠' | '!==' | '≢' | '.>' | '.<' | '.>=' | '.≥' | '.<='
                            | '.≤' | '.==' | '.!=' | '.≠' | '.=' | '.!'
//                          | '∈' | '∉' | '∋' | '∌' | '⊆' | '⊈' | '⊂' | '⊄' | '⊊' | '∝' | '∊' | '∍'
//                          | '∥' | '∦' | '∷' | '∺' | '∻' | '∽' | '∾' | '≁' | '≃' | '≄' | '≅'
//                          | '≆' | '≇' | '≈' | '≉' | '≊' | '≋' | '≌' | '≍' | '≎' | '≐' | '≑'
//                          | '≒' | '≓' | '≔' | '≕' | '≖' | '≗' | '≘' | '≙' | '≚' | '≛' | '≜'
//                          | '≝' | '≞' | '≟' | '≣' | '≦' | '≧' | '≨' | '≩' | '≪' | '≫' | '≬'
//                          | '≭' | '≮' | '≯' | '≰' | '≱' | '≲' | '≳' | '≴' | '≵' | '≶' | '≷'
//                          | '≸' | '≹' | '≺' | '≻' | '≼' | '≽' | '≾' | '≿' | '⊀' | '⊁' | '⊃'
//                          | '⊅' | '⊇' | '⊉' | '⊋' | '⊏' | '⊐' | '⊑' | '⊒' | '⊜' | '⊩' | '⊬'
//                          | '⊮' | '⊰' | '⊱' | '⊲' | '⊳' | '⊴' | '⊵' | '⊶' | '⊷' | '⋍' | '⋐'
//                          | '⋑' | '⋕' | '⋖' | '⋗' | '⋘' | '⋙' | '⋚' | '⋛' | '⋜' | '⋝' | '⋞'
//                          | '⋟' | '⋠' | '⋡' | '⋢' | '⋣' | '⋤' | '⋥' | '⋦' | '⋧' | '⋨' | '⋩'
//                          | '⋪' | '⋫' | '⋬' | '⋭' | '⋲' | '⋳' | '⋴' | '⋵' | '⋶' | '⋷' | '⋸'
//                          | '⋹' | '⋺' | '⋻' | '⋼' | '⋽' | '⋾' | '⋿' | '⟈' | '⟉' | '⟒' | '⦷'
//                          | '⧀' | '⧁' | '⧡' | '⧣' | '⧤' | '⧥' | '⩦' | '⩧' | '⩪' | '⩫' | '⩬'
//                          | '⩭' | '⩮' | '⩯' | '⩰' | '⩱' | '⩲' | '⩳' | '⩴' | '⩵' | '⩶' | '⩷'
//                          | '⩸' | '⩹' | '⩺' | '⩻' | '⩼' | '⩽' | '⩾' | '⩿' | '⪀' | '⪁' | '⪂'
//                          | '⪃' | '⪄' | '⪅' | '⪆' | '⪇' | '⪈' | '⪉' | '⪊' | '⪋' | '⪌' | '⪍'
//                          | '⪎' | '⪏' | '⪐' | '⪑' | '⪒' | '⪓' | '⪔' | '⪕' | '⪖' | '⪗' | '⪘'
//                          | '⪙' | '⪚' | '⪛' | '⪜' | '⪝' | '⪞' | '⪟' | '⪠' | '⪡' | '⪢' | '⪣'
//                          | '⪤' | '⪥' | '⪦' | '⪧' | '⪨' | '⪩' | '⪪' | '⪫' | '⪬' | '⪭' | '⪮'
//                          | '⪯' | '⪰' | '⪱' | '⪲' | '⪳' | '⪴' | '⪵' | '⪶' | '⪷' | '⪸' | '⪹'
//                          | '⪺' | '⪻' | '⪼' | '⪽' | '⪾' | '⪿' | '⫀' | '⫁' | '⫂' | '⫃' | '⫄'
//                          | '⫅' | '⫆' | '⫇' | '⫈' | '⫉' | '⫊' | '⫋' | '⫌' | '⫍' | '⫎' | '⫏'
//                          | '⫐' | '⫑' | '⫒' | '⫓' | '⫔' | '⫕' | '⫖' | '⫗' | '⫘' | '⫙' | '⫷'
//                          | '⫸' | '⫹' | '⫺' | '⊢' | '⊣'
                            ;

PIPE_OPERATOR               :  '|>'|  '<|';

INSTANCE_OF                 : '::';

COLON                       : ':';

//Colon                     : ':'|'..';

PLUS                        : '+';

ADDITIVE_OPERATOR           :  '.+'| '.-'
                            | '|'   //todo review
//                          | '∪'| '∨' | '⊕'| '⊖'| '⊞'| '⊟'|
//                          | '+'| '-'|| '$'
                            |  '⊔'| '±'| '∓'| '∔'| '∸'| '≂'| '≏'| '⊎'| '⊻'| '⊽'
                            | '⋎'| '⋓'| '⧺'| '⧻'| '⨈'| '⨢'| '⨣'| '⨤'| '⨥'| '⨦'| '⨧'
                            | '⨨'| '⨩'| '⨪'| '⨫'| '⨬'| '⨭'| '⨮'| '⨹'| '⨺'| '⩁'| '⩂'
                            | '⩅'| '⩊'| '⩌'| '⩏'| '⩐'| '⩒'| '⩔'| '⩖'| '⩗'| '⩛'| '⩝'
                            | '⩡'| '⩢'| '⩣';

BIT_SHIFT_OPERATOR          : '<<' | '>>' | '>>>' | '.<<' | '.>>' | '.>>>';

TIMES                       : '*';

MULTIPLICATIVE_OPERATOR     :  '/' | './' | '÷' | '%' | '⋅' | '∘' | '×' | '.%' | '.*' | '\\' | '.\\'
//                          |  '*'
                            | '&' //todo review
//                          | '∩' | '∧' | '⊗' | '⊘' | '⊙' | '⊚' | '⊛' | '⊠' | '⊡' | '⊓' | '∗'
//                          | '∙' | '∤' | '⅋' | '≀' | '⊼' | '⋄' | '⋆' | '⋇' | '⋉' | '⋊' | '⋋' | '⋌'
//                          | '⋏' | '⋒' | '⟑' | '⦸' | '⦼' | '⦾' | '⦿' | '⧶' | '⧷' | '⨇' | '⨰' | '⨱'
//                          | '⨲' | '⨳' | '⨴' | '⨵' | '⨶' | '⨷' | '⨸' | '⨻' | '⨼' | '⨽' | '⩀' | '⩃'
//                          | '⩄' | '⩋' | '⩍' | '⩎' | '⩑' | '⩓' | '⩕' | '⩘' | '⩚' | '⩜' | '⩞' | '⩟'
//                          | '⩠' | '⫛' | '⊍'
                            ;

RATIONAL_OPERATOR           : '//' | './/';

POWER_OPERATOR              : '^' | '.^'
//                          | '↑' | '↓' | '⇵' | '⟰' | '⟱' | '⤈' | '⤉' | '⤊' | '⤋'
//                          | '⤒' | '⤓' |  '⥉' | '⥌' | '⥍' | '⥏' | '⥑' | '⥔' | '⥕' | '⥘' | '⥙'
//                          | '⥜' | '⥝' |  '⥠' | '⥡' | '⥣' | '⥥' | '⥮' | '⥯' | '￪' | '￬'
                            ;

EQ                          : '=';
DOLLAR                      : '$';
DOT                         : '.';
BEGIN                       : 'begin';
WHILE                       : 'while';
IMPORT_ALL                  : 'importall' ;
IMPORT                      : 'import' ;

IF                          : 'if';
FOR                         : 'for';
TRY                         : 'try';
RETURN                      : 'return';
BREAK                       : 'break';
CONTINUE                    : 'continue';
FUNCTION                    : 'function';
STAGED_FUNCTION             : 'stagedfunction';
MACRO                       : 'macro';
QUOTE                       : 'quote';
LET                         : 'let';
LOCAL                       : 'local';
GLOBAL                      : 'global';
CONST                       : 'const';
ABSTRACT                    : 'abstract';
TYPE_ALIAS                  : 'typealias';
TYPE                        : 'type';
BITS_TYPE                   : 'bitstype';
IMMUTABLE                   : 'immutable';
CCALL                       : 'ccall';
MODULE                      : 'module' ;
BARE_MODULE                 : 'baremodule' ;
USING                       : 'using' ;
EXPORT                      : 'export' ;
DO                          : 'do';
CATCH                       : 'catch';


ARROW                       : '->';
AT                          : '@';
SEMI_COLON                  : ';';

ELLIPSE                     : '...';

ELSE_IF                     : 'elseif';
ELSE                        : 'else';
COMMA                       : ',';

END                         : 'end'                                 {bracketNesting==0}?;
END_LITERAL                 : 'end'                                 {bracketNesting>0}?;

INF16                       : 'Inf16';
INF32                       : 'Inf32';
INF                         : 'Inf';
MINUS_INF16                 : '-Inf16';
MINUS_INF32                 : '-Inf32';
MINUS_INF                   : '-Inf';
NAN16                       : 'NaN16';
NAN32                       : 'NaN32';
NAN                         : 'NaN';

LEFT_PARENTHESIS            : '('                                   {nesting++;};
RIGHT_PARENTHESIS           : ')'                                   {nesting--;};

LEFT_BRACE                  : '{'                                   {nesting++;};
RIGHT_BRACE                 : '}'                                   {nesting--;};
LEFT_BRACKET                : '['                                   {nesting++;bracketNesting++;};
RIGHT_BRACKET               : ']'                                   {nesting--;bracketNesting--;};

REGEX                       : 'r' STRING;
INT_LITERAL                 : DEC_DGT+;
BINARY                      : '0b'BIN_DGT+;
OCTAL                       : '0o'OCT_DGT+;
HEX                         : '0x'HEX_DGT+;
FLOAT32_LITERAL             : DEC_DGT+ [\.] DEC_DGT* EXP32?
                            | '.' DEC_DGT* EXP32?
                            ;
fragment
EXP32                       : [f] [+\-]? DEC_DGT+;

FLOAT64_LITERAL             : DEC_DGT+ [\.] DEC_DGT* EXP64?
                            | '.' DEC_DGT* EXP64?
                            ;
fragment
EXP64                       : [e] [+\-]? DEC_DGT+;


FQN                         : (Identifier '\\.')+ ID;
ID                          : Identifier (Identifier|DEC_DGT)* '!'?;


CHARACTER_LITERAL           : ('\'' (~'\'') '\'')|('\'' '\\'.'\'') ;

STRING                      :   '"' ('\\"'|~'"')* '"' ; // quote-quote is an escaped quote




fragment
SPACES                      : [ \t]+;

WS                          :   SPACES ->skip;

//EOL                         :   (('\r'? '\n') SPACES?)+ {nesting==0}?;
//IGNORED_EOL                 :   (('\r'? '\n') SPACES?)+ {nesting>0 || ( super.getCharPositionInLine() == 0 && super.getLine() == 1)}?  ->skip;

EOL                       :   ('\r'? '\n') -> skip ;

COMMENT                     :   '#=' .*? '=#' -> skip ; //todo nesting
LINE_COMMENT                :   '#' ~[\r\n]* -> skip;

fragment Identifier         :   ('_'|UNi) ('_'|UNi|DEC_DGT)*;
fragment DEC_DGT            :   [0-9];
fragment BIN_DGT            :   [0-1];
fragment OCT_DGT            :   [0-7];
fragment HEX_DGT            :   [0-9A-F];
SIZE                        :   '8'|'16'|'32'|'64'|'128'|'256'|'512';//... currently restricted to multiples of 8

fragment UNi                :   'A'..'Z'
                            |   'a'..'z'
                            |   '\u00C0'..'\u00D6'
                            |   '\u00D8'..'\u00F6'
                            |   '\u00F8'..'\u02FF'
                            |   '\u0370'..'\u037D'
                            |   '\u037F'..'\u1FFF'
                            |   '\u200C'..'\u200D'
                            |   '\u2070'..'\u218F'
                            |   '\u2C00'..'\u2FEF'
                            |   '\u3001'..'\uD7FF'
                            |   '\uF900'..'\uFDCF'
                            |   '\uFDF0'..'\uFFFD'
                            ;
