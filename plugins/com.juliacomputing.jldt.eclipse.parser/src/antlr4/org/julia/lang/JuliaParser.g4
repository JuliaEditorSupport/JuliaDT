parser grammar JuliaParser;
options{
    tokenVocab=JuliaLexer;
    }
@header {
package org.julia.lang.parser;
    }
unit                        :   (statement)+                             ;

moduleDirective             :   USING ID                                                                #using
                            |   IMPORT ID COLON ID ( COMMA ID)*                                         #importt
                            |   IMPORT_ALL ID                                                           #importAll
                            |   EXPORT ID ( COMMA ID)*                                                  #export
                            |   MODULE ID (statement)+ END                                              #moduleDeclaration
                            |   BAREMODULE ID statement+ END                                            #bareModuleDeclaration
                            ;

statement                   :   moduleDirective
                            |   typeDeclaration
                            |   functionDeclaration
                            |   forStatement
                            |   whileStatement
                            |   exp
                            ;

exp                         :   MINUS exp                                                               #unaryMinus
                            |   name typeParameters? LEFT_BRACKET ((exp  COMMA)* exp)? RIGHT_BRACKET    #applyFunction
                            |   (LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE)+                             #enumeration
                            |   LEFT_SQUARE exp FOR ID (EQ|IN) exp COLON exp RIGHT_SQUARE                     #comprehension
//                            |   (INT|FLOAT32|FLOAT64) (ID | LEFT_BRACKET exp RIGHT_BRACKET )            #coeffient //TODO(see The precedence of numeric literal coefficients is the same as that of unary operators such as negation. So 2^3x is parsed as 2^(3x), and 2x^3 is parsed as 2*(x^3)
                            |   <assoc=right> exp EXPONENT exp                                          #exponent
                            |   exp INSTANCE_OF typeExpression                                          #typedExpression
                            |   exp FRACTION exp                                                        #fraction
                            |   exp TIMES exp                                                           #times
                            |   exp REM exp                                                             #remainder
                            |   exp DIVIDE exp                                                          #divide
                            |   exp PLUS exp                                                            #plus
                            |   exp MINUS exp                                                           #minus
                            |   exp GREATER_THAN exp                                                    #greaterThan
                            |   exp LESS_THAN exp                                                       #lessThan
                            |   exp GREATER_THAN_OR_EQ exp                                              #greaterThanOrEqual
                            |   exp LESS_THAN_OR_EQ exp                                                 #lessThanOrEqual
                            |   exp EQUALS exp                                                          #equals

                            |   exp ELM_FRACTION exp                                                        #elmFraction
                            |   exp ELM_TIMES exp                                                           #elmTimes
                            |   exp ELM_DIVIDE exp                                                          #elmDivide
                            |   exp ELM_PLUS exp                                                            #elmPlus
                            |   exp ELM_MINUS exp                                                           #elmMinus
                            |   exp ELM_GREATER_THAN exp                                                    #elmGreaterThan
                            |   exp ELM_LESS_THAN exp                                                       #elmLessThan
                            |   exp ELM_GREATER_THAN_OR_EQ exp                                              #elmGreaterThanOrEqual
                            |   exp ELM_LESS_THAN_OR_EQ exp                                                 #elmLessThanOrEqual
                            |   exp ELM_EQUALS exp                                                          #elmEquals

                            |   exp SUB_TYPE exp                                                        #subtype
                            |   exp QUESTION_MARK exp COLON exp                                         #ternaryConditional
                            |   NOT exp                                                                 #not
                            |   exp AND exp                                                             #and
                            |   exp BITWISE_AND exp                                                     #bitwiseAnd
                            |   exp OR exp                                                              #or
                            |   exp BITWISE_OR exp                                                     #bitwisOr
                            |   END_LITERAL                                                             #endLiteral
                            |   IF exp statement* (ELSE_IF exp statement*)* (ELSE statement*)? END      #naryConditional
                            |   LET (ID EQ exp)* statement END                                          #let
                            |   BEGIN exp END                                                           #block
                            |   LEFT_BRACKET exp RIGHT_BRACKET                                          #bracketed //todo review ambiguous tuple vs exp
                            |   LEFT_BRACKET (exp ',')* exp? RIGHT_BRACKET                               #tuple //todo review ambiguous tuple vs exp
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
                            |   exp COLON exp                                                           #range
                            |   exp IN exp                                                              #in
                            |   exp IS exp                                                              #is
                            |   exp SEMI_COLON exp                                                      #chained
                            |   exp ELLIPSE                                                             #tbc1
                            |   exp RAPP exp                                                            #applyPrecedng
                            |   <assoc=right> exp ARROW exp                                             #lambda
                            |   DO ((ID COMMA)* ID)? statement* END                                       #anonymousFunction
                            |   name (LEFT_SQUARE (exp ',')* exp? RIGHT_SQUARE)+                        #arrayIndex


                            |   AT name exp*                                                            #invokeMarco1 //todo revew - tuple handling as one arg
                            |   AT name LEFT_BRACKET (exp COMMA)* exp? RIGHT_BRACKET                    #invokeMarco2

                            | exp DOT exp                                                               #project
//                            |   name                                                                    #qualifiedName
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
                            |   CHARACTER_LITERAL                                                       #charaacter
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
                            |   exp COMMA exp                                                           #implicitTuple
//                            |   exp exp                                                   #sequence
                            |   typeExpression                                                          #ttypeExpression
                            ;

//reference                   :   ID (LEFT_SQUARE exp RIGHT_SQUARE)+
//                            |   ID
//                            |   reference DOT reference
//                            |   reference COMMA reference
//                            ;

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
                            |   UNION LEFT_CURLY typeExpression ( COMMA typeExpression)* RIGHT_CURLY    #unionType
                            |   RETURN exp                                                              #returnExp //todo review only occurs in a function body
                            |   RETURN                                                                  #return
                            |   ID LEFT_CURLY (exp ( COMMA exp)*)? RIGHT_CURLY                          #parametricType
                            |   ID                                                                      #userDefinedType
                            ;

functionDeclaration         :   name typeParameters? parameters EQ exp                                  #compactFunctionDeclaration //todo review name usage definition vs reference
                                /*
                                There is a second, more terse syntax for defining a function in Julia. The traditional function declaration syntax demonstrated above is equivalent to the following compact “assignment form”:
                                f(x,y) = x + y
                                In the assignment form, the body of the function must be a single expression, although it can be a compound expression (see Compound Expressions).
                                */
                            |   FUNCTION name typeParameters? parameters (statement)*  END                                              #generalFunctionDeclaration
                            ;

parameters                  :   LEFT_BRACKET (parameter ((COMMA|SEMI_COLON) parameter)*)? RIGHT_BRACKET                                 #pparameters
                            ;

parameter                   :   ID INSTANCE_OF typeExpression (EQ exp)?                                                                 #namedTypedParam
                            |   INSTANCE_OF typeExpression (EQ exp)?                                                                    #anonymousTypedParam
                            |   ID ELLIPSE                                                                                              #vararg
                            |   ID (EQ exp)?                                                                                            #namedParam
                            ;

typeDeclaration             :   TYPE_ALIAS ID typeParameters? exp                                                                       #typeAlias
                            |   ABSTRACT ID typeParameters? (SUB_TYPE ID typeParameters?)?                                              #abstractType
                            |   BITS_TYPE SIZE ID SUB_TYPE ID                                                                           #bitsSubtype
                            |   BITS_TYPE SIZE ID                                                                                       #bitsTtype
                            |   TYPE ID typeParameters? (SUB_TYPE ID)? fieldDeclaration* functionDeclaration* END                       #mutableTypeDeclaration
                            |   IMMUTABLE ID typeParameters? (SUB_TYPE ID typeParameters?)? fieldDeclaration* functionDeclaration* END  #immutableTypeDeclaration
                            ;

fieldDeclaration            :   ID INSTANCE_OF typeExpression                                                                           #typedFieldDeclaration
                            |   ID                                                                                                      #untypedFieldDeclaration
                            ;

typeParameters              :   LEFT_CURLY typeParameter (COMMA typeParameter)* RIGHT_CURLY                                             #ttypeParameters
                            ;

typeParameter               :   ID SUB_TYPE typeExpression                                                                              #namedSubtype
                            |   INSTANCE_OF typeExpression                                                                              #instance
                            |   exp                                                                                                     #expression //todo review
                            ;


forStatement                :   FOR exp EQ exp COLON exp statement* END                                                                 #forEq
                            |   FOR exp EQ exp COLON exp COLON exp statement* END                                                       #forEqStep
                            |   FOR exp IN exp statement* END                                                                           #forIn
                            ;

whileStatement              :   WHILE exp statement* END
                            ;

name                        :   ID (DOT ID)*                                                                                            #nname
                            ;