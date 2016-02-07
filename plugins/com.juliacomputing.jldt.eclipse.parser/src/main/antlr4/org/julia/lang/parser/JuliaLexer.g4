lexer grammar JuliaLexer;
@members {
    int nesting = 0;
    int squareNesting = 0;
    }
ARROW               : '->';
AT                  : '@';
DOT                 : '.';
SEMI_COLON          : ';';
IS                  : '===';
EQUALS              : '==';
NOT_EQUAL           : ('!='|'≠');
GREATER_THAN        : '>';
LESS_THAN           : '<';
GREATER_THAN_OR_EQ  : '>='|'≥';
LESS_THAN_OR_EQ     : '<='|'≤';


MINUS               : '-';
EXPONENT            : '^';
FRACTION            : '//';
TIMES               : '*';
DIVIDE              : '/';
PLUS                : '+';


ELM_EQUALS              : '.==';
ELM_NOT_EQUAL           : ('.!='|.'≠');
ELM_GREATER_THAN        : '.>';
ELM_LESS_THAN           : '.<';
ELM_GREATER_THAN_OR_EQ  : '.>=';
ELM_LESS_THAN_OR_EQ     : '.<='|'≤';


ELM_MINUS               : '.-';
ELM_EXPONENT            : '.^';
ELM_FRACTION            : './/';
ELM_TIMES               : '.*';
ELM_DIVIDE              : './';
ELM_PLUS                : '.+';


RAPP                : '|>';
EQ                  : '=';
DOUBLE_ARROW        : '=>';
ADD_ASGN            : '+=';
SUB_ASGN            : '-=';
TIMES_ASGN          : '*=';
DIVIDE_ASGN         : '/=';
INV_DIVIDE_ASGN     :'\\=';
REMAINDER_ASGN      : '%=';
REM                 : '%';
POWER_ASGN          : '^=';
BITWISE_AND_ASGN    : '&=';
BITWISE_OR_ASGN     : '|=';
BITWISE_XOR_ASGN    : '$=';
LSR_ASGN            : '>>>=';
ASR_ASGN            : '>>=';
ELLIPSE             : '...';
ASL_ASGN            : '<<=';
QUESTION_MARK       : '?';
WHILE               : 'while';
BEGIN               : 'begin';
RETURN              : 'return';
IN                  : 'in';
IF                  : 'if';
ELSE_IF             : 'elseif';
ELSE                : 'else';
FOR                 : 'for';
CONST               : 'const';
USING               : 'using';
IMPORT              : 'import';
INSTANCE_OF         : '::';
COLON               : ':';
COMMA               : ',';
DO                  : 'do';
IMPORT_ALL          : 'importall';
EXPORT              : 'export';
MODULE              : 'module';
LET                 : 'let';
END                 : 'end'                                 {squareNesting==0}?;
END_LITERAL         : 'end'                                 {squareNesting>0}?;
BAREMODULE          : 'baremodule';
INF16               : 'Inf16';
INF32               : 'Inf32';
INF                 : 'Inf';
MINUS_INF16         : '-Inf16';
MINUS_INF32         : '-Inf32';
MINUS_INF           : '-Inf';
NAN16               : 'NaN16';
NAN32               : 'NaN32';
NAN                 : 'NaN';

NOT                 : '!';
AND                 : '&&';
BITWISE_AND         : '&';
OR                  : '||';
BITWISE_OR         : '|';
LEFT_BRACKET        : '('                                   {nesting++;};
RIGHT_BRACKET       : ')'                                   {nesting--;};
TRUE                : 'true';
FALSE               : 'false';
ABSTRACT            : 'abstract';
SUB_TYPE            : '<:';
BITS_TYPE           : 'bitstype';
TYPE_ALIAS          : 'typealias';
TYPE                : 'type';
IMMUTABLE           : 'immutable';
UNION               : 'Union';
FUNCTION            : 'function';
LEFT_CURLY          : '{'                                   {nesting++;};
RIGHT_CURLY         : '}'                                   {nesting--;};
LEFT_SQUARE         : '['                                   {nesting++;squareNesting++;};
RIGHT_SQUARE        : ']'                                   {nesting--;squareNesting--;};
INT8                : 'Int8';
UINT8               : 'Uint8';
INT16               : 'Int16';
UINT16              : 'Uint16';
INT32               : 'Int32';
UINT32              : 'Uint32';
INT64               : 'Int64';
UINT64              : 'Uint64';
INT128              : 'Int128';
UINT128             : 'Uint128';
BOOL                : 'Bool';
CHAR                : 'Char';
FLOAT16             : 'Float16';
FLOAT32             : 'Float32';
FLOAT64             : 'Float64';
REGEX               : 'r' STRING;
INT                 : DEC_DGT+;
BINARY              : '0b'BIN_DGT+;
OCTAL               : '0o'OCT_DGT+;
HEX                 : '0x'HEX_DGT+;
FLOAT32_LITERAL     : DEC_DGT+ [\.] DEC_DGT* EXP32?
                    | '.' DEC_DGT* EXP32?
                    ;
EXP32               : [f] [+\-]? DEC_DGT+;

FLOAT64_LITERAL     : DEC_DGT+ [\.] DEC_DGT* EXP64?
                    | '.' DEC_DGT* EXP64?
                    ;
EXP64               : [e] [+\-]? DEC_DGT+;


FQN                 :   (Identifier '\\.')+ ID;
ID                  :   ('_'|UNi) ('_'|UNi|DEC_DGT)* '!'?;


CHARACTER_LITERAL   :   ('\'' (~'\'') '\'')|('\'' '\\'.'\'') ;

STRING              :   '"' ('\\"'|~'"')* '"' ; // quote-quote is an escaped quote
//EOL                 :   ('\r'? '\n') {nesting==0}?;
//IGNORED_EOL         :   ('\r'? '\n') {nesting>0}?  ->skip;
//WS                  :   [ \t]+ ->skip;

WS                  :   [ \r\t\n]+ ->skip;
//EOL                 :   '\r\n'|'\r'|'\n';

COMMENT             :   '#=' .*? '=#' -> skip ;
LINE_COMMENT        :   '#' ~[\r\n]* -> skip;

fragment Identifier :   ('_'|UNi) ('_'|UNi|DEC_DGT)*;
fragment DEC_DGT    :   [0-9];
fragment BIN_DGT    :   [0-1];
fragment OCT_DGT    :   [0-7];
fragment HEX_DGT    :   [0-9A-F];
SIZE                :   '8'|'16'|'32'|'64'|'128'|'256'|'512';//... currently restricted to multiples of 8


//http://www.youtube.com/watch?v=MijmeoH9LT4
//人人生而自由
fragment UNi        :   'A'..'Z'
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
