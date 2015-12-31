lexer grammar JuliaLexer;
@header {
package org.julia.lang.parser;
    }
DOT                 : '.';
EQ                  : '=';
DOUBLE_ARROW        : '=>';
ADD_ASGN            : '+=';
SUB_ASGN            : '-=';
TIMES_ASGN          : '*=';
DIVIDE_ASGN         : '/=';
INV_DIVIDE_ASGN     :'\\=';
REMAINDER_ASGN      : '%=';
POWER_ASGN          : '^=';
BITWISE_AND_ASGN    : '&=';
BITWISE_OR_ASGN     : '|=';
BITWISE_XOR_ASGN    : '$=';
LSR_ASGN            : '>>>=';
ASR_ASGN            : '>>=';
ELLIPSE             : '...';
ASL_ASGN            : '<<=';
QUESTION_MARK       : '?';
IN                  : 'in';
IF                  : 'if';
ELSE_IF             : 'elseif';
ELSE                : 'else';
FOR                 : 'for';
CONST               : 'const';
INCLUDE             : 'include';
USING               : 'using';
IMPORT              : 'import';
COLON               : ':';
COMMA               : ',';
IMPORT_ALL          : 'importall';
EXPORT              : 'export';
MODULE              : 'module';
END                 : 'end';
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
MINUS               : '-';
INSTANCE_OF         : '::';
EXPONENT            : '^';
FRACTION            : '//';
TIMES               : '*';
DIVIDE              : '/';
PLUS                : '+';
NOT_EQUAL           : ('!='|'≠');
GREATER_THAN        : '>';
LESS_THAN           : '<';
GREATER_THAN_OR_EQ  : '>=';
LESS_THAN_OR_EQ     : '<=';
EQUALS              : '==';
NOT                 : '!';
AND                 : '&&';
OR                  : '||';
LEFT_BRACKET        : '(';
RIGHT_BRACKET       : ')';
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
LEFT_CURLY          : '{';
RIGHT_CURLY         : '}';
LEFT_SQUARE         : '[';
RIGHT_SQUARE        : ']';
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

ID                  :   ('_'|UNi) ('_'|UNi|DEC_DGT)* '!'?;
STRING              :   '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote
WS                  :   [ \r\t\n]+ ->skip;
//EOL_COMMENT     :   '#' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
//COMMENT         :   '/*' .*? '*/' -> skip ; // Match "/*" stuff "*/"

LINE_COMMENT        :   '#' ~[\r\n]* -> skip;

fragment DEC_DGT    :   [0-9];
fragment BIN_DGT    :   [0-1];
fragment OCT_DGT    :   [0-7];
fragment HEX_DGT    :   [0-9a-z];
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
