grammar Julia;
@lexer::members {
   int nesting = 0;
   int bracketNesting = 0;
}

unit                        :   NL* block NL*;

block                       :   (statement (NL+))*
                            |   statement (SEMI_COLON NL* statement)*
                            ;

statement                   :   NL* USING NL* ID
                            |   NL* IMPORT NL* name COLON NL* ID NL* (NL* COMMA NL* ID)*
                            |   NL* IMPORT NL* name
                            |   NL* IMPORT_ALL  NL* name
                            |   NL* EXPORT NL* ID (NL* COMMA NL* ID)*
                            |   NL* moduleDeclaration
                            |   NL* typeDeclaration
                            |   NL* functionDeclaration
                            |   NL* macroDeclaration

                            |   NL* RETURN exp
                            |   NL* RETURN
                            |   NL* FOR NL* exp EQ NL* exp (COLON exp)? (COLON exp)? NL* block NL* END
                            |   NL* FOR NL* exp NL* 'in' NL* exp NL* block NL* END
                            |   NL* WHILE NL* exp NL* block NL* END
                            |   NL* BREAK
                            |   NL* CONTINUE
                            |   NL* QUOTE NL* block NL* END

                            |   NL* exp
                            ;

moduleDeclaration           :   NL* MODULE NL* ID NL* block NL*  END                                                       #module
                            |   NL* BARE_MODULE NL* ID NL* block NL* END                                                  #bareModule
                            ;

macroDeclaration            :   NL* MACRO NL* ID parameters  NL* block NL* END;

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
                            |   exp AND statement                                                         #lazyAnd
                            |   exp OR statement                                                          #lazyOr
                            |   exp ARROW_OPERATOR exp                                                    #arrow
                            |   exp CONDITIONAL_OPERATOR exp COLON exp                                    #ternaryConditional
                            |   exp EQ exp                                                                #simpleAssignment
                            |   exp ASSIGNMENT_OPERATOR exp                                               #assignment
                            |   <assoc=right> exp ARROW exp                                               #lambda
                            |   GLOBAL exp (COMMA exp)*                                                   #global
                            |   LOCAL exp EQ exp                                                          #local
                            |   END_LITERAL                                                               #endLiteral
                            |   IF NL* exp NL* block NL* (ELSE_IF NL* exp NL* block NL* )* (ELSE NL* block)? END                       #naryConditional
                            |   LET (ID EQ NL* exp NL*)* statement NL* END                                            #let
                            |   BEGIN block END                                                             #primitiveBlock
                            |   DO ((ID COMMA)* ID)? block END                                            #anonymousFunction
                            |   CCALL LEFT_PARENTHESIS exp COMMA exp COMMA exp RIGHT_PARENTHESIS          #ccall
                            |   exp 'in' exp                                                              #in
                            |   exp ELLIPSE                                                               #tbc1
                            |   exp '\''                                                                  #transpose
                            |   AT name exp+ NL*                                                        #macroInvoke
                            |   TRY NL* block NL* (CATCH NL* block NL*)? (FINALLY NL* block NL*)?  END                                                 #tryCatch
                            |   LEFT_PARENTHESIS RIGHT_PARENTHESIS                                        #emptyTuple
                            |   LEFT_PARENTHESIS (exp COMMA)+ exp? RIGHT_PARENTHESIS                      #tuple //todo review ambiguous tuple vs exp
                            |   LEFT_PARENTHESIS exp RIGHT_PARENTHESIS                                    #parenthesised  //todo review ambiguous tuple vs exp


                            |   name typeParameters? LEFT_PARENTHESIS ((exp  COMMA)* exp)? RIGHT_PARENTHESIS    #applyFunction
                            |   operator typeParameters? LEFT_PARENTHESIS ((exp  COMMA)* exp)? RIGHT_PARENTHESIS    #applyOperator

                            |   (LEFT_BRACKET (exp COMMA)* exp? RIGHT_BRACKET)+                           #enumeration
                            |   LEFT_BRACKET exp FOR exp ('='|'in') exp (COLON exp)? RIGHT_BRACKET        #comprehension
                            |   (INT_LITERAL|FLOAT32_LITERAL|FLOAT64_LITERAL) (ID | LEFT_PARENTHESIS exp RIGHT_PARENTHESIS )        #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)


                            |   exp (LEFT_BRACKET (exp COMMA)* exp? RIGHT_BRACKET)+                       #arrayIndex
//                            |   name                                                                    #nname

                            |   exp SEMI_COLON exp                                                        #sequence
                            |   ID                                                                        #identifier
                            |   typeExpression                                                            #ttypeExpression

                            |   operator                                                                  #operatorSymbol

                            |   REGEX                                                                     #regex
                            |   'true'                                                                    #tt
                            |   'false'                                                                   #ff
                            |   INT_LITERAL                                                               #int
                            |   BINARY                                                                    #binary
                            |   OCTAL                                                                     #octal
                            |   HEX                                                                       #hex
                            |   FLOAT32_LITERAL                                                           #ffloat32
                            |   FLOAT64_LITERAL                                                           #ffloat64
                            |   HEX_FLOAT                                                                 #hexFloat
                            |   CHARACTER_LITERAL                                                         #character
                            |   STRING                                                                    #string
                            |   COLON ID                                                                  #symbol
                            |   CONST ID EQ exp                                                           #constant

                            |   exp COMMA exp                                                             #implicitTuple

//                            |   exp exp                                                                 #apply
                            ;

typeExpression              :   'Union' LEFT_BRACE typeExpression ( COMMA typeExpression)* RIGHT_BRACE    #unionType
                            |   ID typeParameters                                                         #parametricType
                            |   ID                                                                        #predefinedType
                            ;

functionDeclaration         :   fnID typeParameters? parameters EQ NL* exp                                    #compactFunctionDeclaration //todo review name usage definition vs reference
                            |   FUNCTION NL* fnID NL* typeParameters? parameters NL* block NL* END                        #generalFunctionDeclaration
                            ;

parameters                  :   LEFT_PARENTHESIS (parameter ((COMMA|SEMI_COLON) parameter)*)? RIGHT_PARENTHESIS                        #pparameters
                            ;

parameter                   :   ID INSTANCE_OF typeExpression (EQ exp)?                                   #namedTypedParam
                            |   INSTANCE_OF typeExpression (EQ exp)?                                      #anonymousTypedParam
                            |   ID (EQ exp)?                                                              #namedParam
                            |   parameter ELLIPSE                                                         #vararg
                            ;

typeDeclaration             :   TYPE_ALIAS NL* ID NL* typeParameters? NL* typeExpression                              #typeAlias
                            |   ABSTRACT NL* ID typeParameters? NL* (SUB_TYPE NL* ID  NL* typeParameters?)?                #abstractType
                            |   BITS_TYPE NL* SIZE NL* ID SUB_TYPE NL* ID                                             #bitsSubtype
                            |   BITS_TYPE NL* SIZE ID                                                         #bitsTtype
                            |   TYPE NL* ID NL*  typeParameters? (SUB_TYPE ID typeParameters?)?  (NL* fieldDeclaration NL*)* (functionDeclaration NL*)* END                       #mutableTypeDeclaration
                            |   IMMUTABLE NL* ID NL* typeParameters? (SUB_TYPE ID typeParameters?)? NL* (fieldDeclaration NL*)* (NL*  functionDeclaration NL)* NL*  END  #immutableTypeDeclaration
                            ;

fieldDeclaration            :   ID NL*  INSTANCE_OF NL*  typeExpression                                             #typedFieldDeclaration
                            |   ID                                                                        #untypedFieldDeclaration
                            ;

typeParameters              :   LEFT_BRACE (typeParameter (COMMA typeParameter)*)? RIGHT_BRACE            #ttypeParameters
                            ;

typeParameter               :   ID SUB_TYPE typeExpression                                                #constrainedType
                            |   INSTANCE_OF typeExpression                                                #anonymousType
                            |   exp                                                                       #expressionType
                            ;


fnID                        :   name                                                                      #functionName
                            |   operator                                                                  #functionSymbol
                            |   LEFT_PARENTHESIS fnID RIGHT_PARENTHESIS                                   #parenthesisedFnID
                            ;

operator                    :   RELATIONAL_OPERATOR
                            |   ADDITIVE_OPERATOR
                            |   MULTIPLICATIVE_OPERATOR
                            |   PLUS
                            |   TIMES
                            |   OR
                            |   AND
                            |   MINUS
                            |   NOT
                            |   BITWISE_NOT
                            |   COLON
                            |   ASSIGNMENT_OPERATOR
                            |   INSTANCE_OF
                            |   'in' //todo review
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
//AMPERSAND                   : '&';

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
FINALLY                     : 'finally';

ARROW                       : '->';
AT                          : '@';
SEMI_COLON                  : ';';

ELLIPSE                     : '...';

ELSE_IF                     : 'elseif';
ELSE                        : 'else';
COMMA                       : ',';

END                         : {bracketNesting==0}? 'end';
END_LITERAL                 : {bracketNesting>0}? 'end';


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

HEX_FLOAT                   : '0x' HEX_DGT? ('.' HEX_DGT*)? ( 'p' | 'P' ) ( '+' | '-' )? DEC_DGT+;

fragment
EXP32                       : [f] [+\-]? DEC_DGT+;

FLOAT64_LITERAL             : DEC_DGT+ [\.] DEC_DGT* EXP64?
                            | '.' DEC_DGT* EXP64?
                            ;
fragment
EXP64                       : [e] [+\-]? DEC_DGT+;

CHARACTER_LITERAL           : ('\'' (~'\'') '\'')|('\'' '\\'.'\'') ;

STRING                      :   '"' ('\\"'|~'"')* '"' ; // quote-quote is an escaped quote




fragment
SPACES                      : [ \t]+;

WS                          :   SPACES ->skip;

NL                          :   (('\r'? '\n') SPACES?)+ {nesting==0}?;
IGNORED_EOL                 :   (('\r'? '\n') SPACES?)+ {nesting>0}? ->skip;


//EOL                         :   ('\r'? '\n');

COMMENT                     :   '#=' .*? '=#' -> skip ; //todo nesting
LINE_COMMENT                :   '#' ~[\r\n]* -> skip;

ID                          :   ('_'|UNi) ('_'|UNi|DEC_DGT)* '!'?;
fragment DEC_DGT            :   [0-9_];
fragment BIN_DGT            :   [0-1_];
fragment OCT_DGT            :   [0-7_];
fragment HEX_DGT            :   [0-9A-Fa-f_];
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
