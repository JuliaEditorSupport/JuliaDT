parser grammar JuliaParser;
options{
    tokenVocab=JuliaLexer;
    }
@header {
package org.julia.lang.parser;
    }
unit                        :   statement*
                            ;

statement                   :   moduleDirective
                            |   functionDeclaration
                            |   typeExpression
                            |   typeAlias
                            |   forStatement
                            |   ifStatement
                            |   exp
                            ;

exp                         :   MINUS exp                                                               #unaryMinus
//                          |   (INT|FLOAT32|FLOAT64) (ID | LEFT_BRACKET exp RIGHT_BRACKET )            #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)
//                          |   (INT|FLOAT32|FLOAT64) (ID | LEFT_BRACKET exp RIGHT_BRACKET)             #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)
                            |   exp INSTANCE_OF typeExpression                                          #typedExpression
//                          |   exp EXPONENT <assoc=right>  exp                                       #exponent

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
                            |   END                                                                     #end
                            |   name typeParameters? LEFT_BRACKET ((exp  COMMA)* exp)? RIGHT_BRACKET      #apply
                            |   name (LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE)+                        #arrayIndex
                            |   LEFT_BRACKET exp RIGHT_BRACKET                                          #bracketed //todo review ambiguous tuple vs exp
                            |   LEFT_BRACKET (exp ',')+ exp RIGHT_BRACKET                               #tuple //todo review ambiguous tuple vs exp
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
                            |   exp DOUBLE_ARROW exp                                                    #pair
                            |   exp ELLIPSE                                                             #tbc1
//                            |   typeExpression                                                          #type
                            |   LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE                                #arrayIndex
                            |   exp COLON exp                                                           #range
                            |   name                                                                    #qualifiedName
                            |   ID                                                                      #identifier
                            |   REGEX                                                                   #regex
                            |   TRUE                                                                    #tt
                            |   FALSE                                                                   #ff
                            |   INT                                                                     #int
                            |   BINARY                                                                  #binary
                            |   OCTAL                                                                   #octal
                            |   HEX                                                                     #hex
                            |   FLOAT32_LITERAL                                                         #ffloat32
                            |   FLOAT64_LITERAL                                                         #ffloat64
                            |   STRING                                                                  #string
                            |   COLON ID                                                                #symbol
                            |   CONST ID EQ exp                                                         #constant
                            |   INF16                                                                   #inf16Type
                            |   INF32                                                                   #inf32Type
                            |   INF                                                                     #inf
                            |   MINUS_INF16                                                             #minusInf16
                            |   MINUS_INF32                                                             #minusInf32
                            |   MINUS_INF                                                               #minusInf
                            |   NAN16                                                                   #nan16
                            |   NAN32                                                                   #nan32
                            |   NAN                                                                     #nan
                            ;

moduleDirective             :   INCLUDE  LEFT_BRACKET STRING RIGHT_BRACKET                              #include
                            |   USING ID                                                                #using
                            |   IMPORT ID COLON ID ( COMMA ID)*                                         #importt
                            |   IMPORT_ALL ID                                                           #importAll
                            |   EXPORT ID ( COMMA ID)*                                                  #export
                            |   MODULE ID statement+ END                                                #moduleDeclaration
                            |   BAREMODULE ID statement+ END                                            #bareModuleDeclaration
                            ;

functionDeclaration         :   name typeParameters? parameters  EQ exp                                   #compactFunctionDeclaration //todo review name usage definition vs reference
                            |   FUNCTION name typeParameters? parameters statement+  END                  #generalFunctionDeclaration
                            ;

parameters                  :   LEFT_BRACKET (parameter ( COMMA parameter)*)? ELLIPSE? RIGHT_BRACKET    #pparameters
                            ;
parameter                   :   ID INSTANCE_OF typeExpression                                           #namedTypedParam
                            |   INSTANCE_OF typeExpression                                              #anonymousTypedParam
                            |   ID                                                                      #namedParam
                            ;

typeExpression              :   INT8                                                                    #int8
                            |   UINT8                                                                   #uint8
                            |   INT16                                                                   #int16
                            |   UINT16                                                                  #uint16
                            |   INT32                                                                   #int32
                            |   UINT32                                                                  #uint32
                            |   INT64                                                                   #int64
                            |   UINT64                                                                  #uint64
                            |   INT128                                                                  #int128
                            |   UINT128                                                                 #uint128
                            |   BOOL                                                                    #bool
                            |   CHAR                                                                    #char
                            |   FLOAT16                                                                 #float16
                            |   FLOAT32                                                                 #float32
                            |   FLOAT64                                                                 #float64
                            |   ABSTRACT ID SUB_TYPE ID                                                 #abstractSubtype
                            |   ABSTRACT ID                                                             #abstractType
                            |   BITS_TYPE SIZE ID SUB_TYPE ID                                           #bitsSubtype
                            |   BITS_TYPE SIZE ID                                                       #bitsTtype
                            |   TYPE ID typeParameters? SUB_TYPE ID typeParameters? fieldDeclaration* functionDeclaration* END      #subTypeDeclaration
                            |   TYPE ID typeParameters? fieldDeclaration* functionDeclaration* END      #typeDeclaration
                            |   IMMUTABLE ID typeParameters? fieldDeclaration* functionDeclaration* END                 #immutableTypeDeclaration
                            |   IMMUTABLE ID typeParameters? SUB_TYPE ID typeParameters? fieldDeclaration* functionDeclaration* END      #immutableSubTypeDeclaration
                            |   UNION LEFT_CURLY (typeExpression|INT) ( COMMA (typeExpression|INT))+ RIGHT_CURLY #unionType
                            |   ID LEFT_CURLY (typeExpression|INT) ( COMMA (typeExpression|INT))* RIGHT_CURLY #parametricType
                            |   ID                                                                      #typeReference
                            ;

fieldDeclaration            :   ID INSTANCE_OF typeExpression                                           #typedFieldDeclaration
                            |   ID                                                                      #untypedFieldDeclaration
                            ;

typeParameters              :   LEFT_CURLY typeParameter (COMMA typeParameter)* RIGHT_CURLY             #ttypeParameters
                            ;

typeParameter               :   ID SUB_TYPE typeExpression                                              #namedSubtype
                            |   INSTANCE_OF typeExpression                                              #instance
                            |   typeExpression                                                          # tx
                            |   INT                                                                     #number //todo review
                            ;

typeAlias                   :   TYPE_ALIAS ID typeParameters? typeExpression                            #ttypeAlias
                            ;

forStatement                :   FOR exp EQ exp COLON exp statement+ END                                 #forEq
                            |   FOR exp EQ exp COLON exp COLON exp statement+ END                       #forEqStep
                            |   FOR exp IN exp statement+ END                                           #forIn
                            ;
ifStatement                 :   IF exp statement+ (ELSE_IF statement+)* (ELSE statement+)? END          #conditionalStatement
                            ;
name                        :   ID (DOT ID)*                                                            #nname
                            ;