parser grammar JuliaParser;
options{
    tokenVocab=JuliaLexer;
    }
@header {
package org.julia.lang;
    }
unit                        :   statement+
                            ;

statement                   :   moduleDirective
                            |   functionDeclaration
                            |   CONST ID EQ exp
                            |   typeExpression
                            |   typeAlias
                            |   forStatement
                            |   ifStatement
                            |   exp
                            ;

exp                         :   INF16                                                                   #inf16Type
                            |   INF32                                                                   #inf32Type
                            |   INF                                                                     #inf
                            |   MINUS_INF16                                                             #minusInf16
                            |   MINUS_INF32                                                             #minusInf32
                            |   MINUS_INF                                                               #minusInf
                            |   NAN16                                                                   #nan16
                            |   NAN32                                                                   #nan32
                            |   NAN                                                                     #nan
                            |   MINUS exp                                                               #unaryMinus
                            |   (INT|FLOAT32|FLOAT64) (ID | LEFT_BRACKET exp RIGHT_BRACKET )            #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)
                            |   (INT|FLOAT32|FLOAT64) (ID | LEFT_BRACKET exp RIGHT_BRACKET)             #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)
                            |   exp INSTANCE_OF typeExpression                                          #typedExpression
//                            |   exp EXPONENT <assoc=right>  exp                                       #exponent

                            |   exp FRACTION exp                                                        #fraction
                            |   exp TIMES exp                                                           #times
                            |   exp DIVIDE exp                                                          #divide
                            |   exp PLUS exp                                                            #plus
                            |   exp MINUS exp                                                           #minus
                            |   exp GREATER_THAN exp                                                    #greaterThan
                            |   exp LESS_THAN exp                                                       #lessThan
                            |   exp GREATER_THAN_OR_EQ exp                                              #greaterThanOrEqual
                            |   exp LESS_THAN_OR_EQ exp                                                 #lessThanOrEqual
                            |   exp EQUALS exp                                                          #equals
                            |   exp SUB_TYPE exp                                                        #subtype
                            |   exp QUESTION_MARK exp COLON exp                                         #conditional
                            |   NOT exp                                                                 #not
                            |   exp AND exp                                                             #and
                            |   exp OR exp                                                              #or
                            |   ID typeParameters? LEFT_BRACKET ((exp  COMMA)* exp)? RIGHT_BRACKET      #apply
                            |   ID LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE                             #arrayIndex
                            |   LEFT_BRACKET (exp ',')* exp? RIGHT_BRACKET                              #tuple //todo review ambiguous tuple vs exp

                            |   exp NOT_EQUAL exp                                                       #notEqual
                            |   exp EQ exp                                                              #assign
                            |   exp ADD_ASGN exp                                                        #addAssign
                            |   exp SUB_ASGN exp                                                        #minusAssign
                            |   exp TIMES_ASGN exp                                                      #timesAssign
                            |   exp DIVIDE_ASGN exp                                                     #divexpeAssign
                            |   exp INV_DIVIDE_ASGN exp                                                 #invDivexpeAssign
                            |   exp REMAINDER_ASGN exp                                                  #remainderAssign
                            |   exp POWER_ASGN exp                                                      #powerAssign
                            |   exp BITWISE_AND_ASGN exp                                                #bitwiseAndAssign
                            |   exp BITWISE_OR_ASGN exp                                                 #bitwiseOrAssign
                            |   exp BITWISE_XOR_ASGN exp                                                #bitwiseXorAssign
                            |   exp LSR_ASGN exp                                                        #lSRAssign
                            |   exp ASR_ASGN exp                                                        #aSRAssign
                            |   exp ASL_ASGN exp                                                        #aSLAssign
                            |   exp ELLIPSE                                                             #tbc1
                            |   typeExpression                                                          #type
                            |   LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE                                #arrayIndex
                            |   TRUE                                                                    #tt
                            |   FALSE                                                                   #ff
                            |   INT                                                                     #int
                            |   BINARY                                                                  #binary
                            |   OCTAL                                                                   #octal
                            |   HEX                                                                     #hex
                            |   FLOAT32                                                                 #float32
                            |   FLOAT64                                                                 #float64
                            |   STRING                                                                  #string
                            |   ID                                                                      #identifier
                            |   COLON ID                                                                #symbol
                            ;

moduleDirective             :   INCLUDE  LEFT_BRACKET STRING RIGHT_BRACKET                              #include
                            |   USING ID                                                                #using
                            |   IMPORT ID COLON ID ( COMMA ID)*                                         #importt
                            |   IMPORT_ALL ID                                                           #importAll
                            |   EXPORT ID ( COMMA ID)*                                                  #export
                            |   MODULE ID statement+ END                                                #moduleDeclaration
                            |   BAREMODULE ID statement+ END                                            #bareModuleDeclaration
                            ;

functionDeclaration         :   ID typeParameters parameters  EQ exp
                            |   ID parameters EQ exp
                            |   FUNCTION ID parameters statement+  END
                            |   FUNCTION ID typeParameters parameters statement+  END
                            ;

parameters                  :   LEFT_BRACKET (parameter ( COMMA parameter)*)? ELLIPSE? RIGHT_BRACKET
                            ;
parameter                   :   ID INSTANCE_OF typeExpression
                            |   INSTANCE_OF typeExpression
                            |   ID
                            ;

typeExpression              :   INT8
                            |   UINT8
                            |   INT16
                            |   UINT16
                            |   INT32
                            |   UINT32
                            |   INT64
                            |   UINT64
                            |   INT128
                            |   UINT128
                            |   BOOL
                            |   CHAR
                            |   FLOAT16
                            |   FLOAT32
                            |   FLOAT64
                            |   ABSTRACT ID SUB_TYPE ID
                            |   ABSTRACT ID
                            |   BITS_TYPE SIZE ID SUB_TYPE ID
                            |   BITS_TYPE SIZE ID
                            |   TYPE ID typeParameters fieldDeclaration* functionDeclaration* END
                            |   TYPE ID fieldDeclaration* functionDeclaration* END
                            |   IMMUTABLE ID fieldDeclaration* functionDeclaration* END
                            |   UNION LEFT_CURLY (typeExpression|INT) ( COMMA (typeExpression|INT))+ RIGHT_CURLY
                            |   ID LEFT_CURLY (typeExpression|INT) ( COMMA (typeExpression|INT))* RIGHT_CURLY
                            |   ID
                            ;

fieldDeclaration            :   ID INSTANCE_OF typeExpression
                            |   ID
                            ;

typeParameters              :   LEFT_CURLY typeParameter (COMMA typeParameter)* RIGHT_CURLY
                            ;

typeParameter               :   ID SUB_TYPE typeExpression
                            |   INSTANCE_OF typeExpression
                            |   ID
                            |   INT //todo review
                            ;

typeAlias                   :   TYPE_ALIAS ID typeParameters typeExpression
                            ;

forStatement                :   FOR exp EQ exp COLON exp statement+ END
                            |   FOR exp EQ exp COLON exp COLON exp statement+ END
                            |   FOR exp IN exp statement+ END
                            ;
ifStatement                 :   IF exp statement+ (ELSE_IF statement+)* (ELSE statement+)? END
                            ;