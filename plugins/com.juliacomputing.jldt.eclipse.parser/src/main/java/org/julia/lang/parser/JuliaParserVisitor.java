// Generated from org/julia/lang/parser/JuliaParser.g4 by ANTLR 4.5.1
package org.julia.lang.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced by
 * {@link JuliaParser}.
 *
 * @param <T>
 *          The return type of the visit operation. Use {@link Void} for operations with no return
 *          type.
 */
public interface JuliaParserVisitor<T> extends ParseTreeVisitor<T> {
  /**
   * Visit a parse tree produced by {@link JuliaParser#unit}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUnit(JuliaParser.UnitContext ctx);

  /**
   * Visit a parse tree produced by the {@code using} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUsing(JuliaParser.UsingContext ctx);

  /**
   * Visit a parse tree produced by the {@code importt} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitImportt(JuliaParser.ImporttContext ctx);

  /**
   * Visit a parse tree produced by the {@code importAll} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitImportAll(JuliaParser.ImportAllContext ctx);

  /**
   * Visit a parse tree produced by the {@code export} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExport(JuliaParser.ExportContext ctx);

  /**
   * Visit a parse tree produced by the {@code moduleDeclaration} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code bareModuleDeclaration} labeled alternative in
   * {@link JuliaParser#moduleDirective}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);

  /**
   * Visit a parse tree produced by {@link JuliaParser#statement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitStatement(JuliaParser.StatementContext ctx);

  /**
   * Visit a parse tree produced by the {@code tt} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTt(JuliaParser.TtContext ctx);

  /**
   * Visit a parse tree produced by the {@code octal} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitOctal(JuliaParser.OctalContext ctx);

  /**
   * Visit a parse tree produced by the {@code symbol} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSymbol(JuliaParser.SymbolContext ctx);

  /**
   * Visit a parse tree produced by the {@code nan32} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNan32(JuliaParser.Nan32Context ctx);

  /**
   * Visit a parse tree produced by the {@code constant} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitConstant(JuliaParser.ConstantContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmTimes} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmTimes(JuliaParser.ElmTimesContext ctx);

  /**
   * Visit a parse tree produced by the {@code project} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitProject(JuliaParser.ProjectContext ctx);

  /**
   * Visit a parse tree produced by the {@code ternaryConditional} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTernaryConditional(JuliaParser.TernaryConditionalContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitwiseAnd} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitwiseAnd(JuliaParser.BitwiseAndContext ctx);

  /**
   * Visit a parse tree produced by the {@code applyFunction} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitApplyFunction(JuliaParser.ApplyFunctionContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmMinus} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmMinus(JuliaParser.ElmMinusContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitwiseXorAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code lSRAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLSRAssign(JuliaParser.LSRAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code coeffient} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCoeffient(JuliaParser.CoeffientContext ctx);

  /**
   * Visit a parse tree produced by the {@code invDivexpeAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code lambda} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLambda(JuliaParser.LambdaContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmLessThanOrEqual} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmLessThanOrEqual(JuliaParser.ElmLessThanOrEqualContext ctx);

  /**
   * Visit a parse tree produced by the {@code divexpeAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code let} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLet(JuliaParser.LetContext ctx);

  /**
   * Visit a parse tree produced by the {@code block} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBlock(JuliaParser.BlockContext ctx);

  /**
   * Visit a parse tree produced by the {@code hex} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitHex(JuliaParser.HexContext ctx);

  /**
   * Visit a parse tree produced by the {@code nan} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNan(JuliaParser.NanContext ctx);

  /**
   * Visit a parse tree produced by the {@code enumeration} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEnumeration(JuliaParser.EnumerationContext ctx);

  /**
   * Visit a parse tree produced by the {@code ffloat32} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFfloat32(JuliaParser.Ffloat32Context ctx);

  /**
   * Visit a parse tree produced by the {@code exponent} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExponent(JuliaParser.ExponentContext ctx);

  /**
   * Visit a parse tree produced by the {@code greaterThan} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGreaterThan(JuliaParser.GreaterThanContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitwiseAndAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code identifier} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIdentifier(JuliaParser.IdentifierContext ctx);

  /**
   * Visit a parse tree produced by the {@code inf32Type} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInf32Type(JuliaParser.Inf32TypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code implicitTuple} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitImplicitTuple(JuliaParser.ImplicitTupleContext ctx);

  /**
   * Visit a parse tree produced by the {@code in} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIn(JuliaParser.InContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmPlus} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmPlus(JuliaParser.ElmPlusContext ctx);

  /**
   * Visit a parse tree produced by the {@code notEqual} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNotEqual(JuliaParser.NotEqualContext ctx);

  /**
   * Visit a parse tree produced by the {@code chained} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitChained(JuliaParser.ChainedContext ctx);

  /**
   * Visit a parse tree produced by the {@code is} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitIs(JuliaParser.IsContext ctx);

  /**
   * Visit a parse tree produced by the {@code tbc1} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTbc1(JuliaParser.Tbc1Context ctx);

  /**
   * Visit a parse tree produced by the {@code aSRAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitASRAssign(JuliaParser.ASRAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code comprehension} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitComprehension(JuliaParser.ComprehensionContext ctx);

  /**
   * Visit a parse tree produced by the {@code plus} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPlus(JuliaParser.PlusContext ctx);

  /**
   * Visit a parse tree produced by the {@code greaterThanOrEqual} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitwiseOrAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmDivide} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmDivide(JuliaParser.ElmDivideContext ctx);

  /**
   * Visit a parse tree produced by the {@code regex} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRegex(JuliaParser.RegexContext ctx);

  /**
   * Visit a parse tree produced by the {@code invokeMarco1} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInvokeMarco1(JuliaParser.InvokeMarco1Context ctx);

  /**
   * Visit a parse tree produced by the {@code minusInf32} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMinusInf32(JuliaParser.MinusInf32Context ctx);

  /**
   * Visit a parse tree produced by the {@code elmEquals} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmEquals(JuliaParser.ElmEqualsContext ctx);

  /**
   * Visit a parse tree produced by the {@code binary} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBinary(JuliaParser.BinaryContext ctx);

  /**
   * Visit a parse tree produced by the {@code lessThanOrEqual} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);

  /**
   * Visit a parse tree produced by the {@code aSLAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitASLAssign(JuliaParser.ASLAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code unaryMinus} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUnaryMinus(JuliaParser.UnaryMinusContext ctx);

  /**
   * Visit a parse tree produced by the {@code addAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAddAssign(JuliaParser.AddAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code endLiteral} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEndLiteral(JuliaParser.EndLiteralContext ctx);

  /**
   * Visit a parse tree produced by the {@code nan16} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNan16(JuliaParser.Nan16Context ctx);

  /**
   * Visit a parse tree produced by the {@code ff} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFf(JuliaParser.FfContext ctx);

  /**
   * Visit a parse tree produced by the {@code minus} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMinus(JuliaParser.MinusContext ctx);

  /**
   * Visit a parse tree produced by the {@code charaacter} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCharaacter(JuliaParser.CharaacterContext ctx);

  /**
   * Visit a parse tree produced by the {@code string} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitString(JuliaParser.StringContext ctx);

  /**
   * Visit a parse tree produced by the {@code anonymousFunction} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);

  /**
   * Visit a parse tree produced by the {@code timesAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTimesAssign(JuliaParser.TimesAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code range} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRange(JuliaParser.RangeContext ctx);

  /**
   * Visit a parse tree produced by the {@code invokeMarco2} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInvokeMarco2(JuliaParser.InvokeMarco2Context ctx);

  /**
   * Visit a parse tree produced by the {@code elmGreaterThan} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmGreaterThan(JuliaParser.ElmGreaterThanContext ctx);

  /**
   * Visit a parse tree produced by the {@code minusAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMinusAssign(JuliaParser.MinusAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code remainderAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRemainderAssign(JuliaParser.RemainderAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code tuple} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTuple(JuliaParser.TupleContext ctx);

  /**
   * Visit a parse tree produced by the {@code not} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNot(JuliaParser.NotContext ctx);

  /**
   * Visit a parse tree produced by the {@code times} labeled alternative in {@link JuliaParser#exp}
   * .
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTimes(JuliaParser.TimesContext ctx);

  /**
   * Visit a parse tree produced by the {@code subtype} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitSubtype(JuliaParser.SubtypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code and} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnd(JuliaParser.AndContext ctx);

  /**
   * Visit a parse tree produced by the {@code lessThan} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitLessThan(JuliaParser.LessThanContext ctx);

  /**
   * Visit a parse tree produced by the {@code divide} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitDivide(JuliaParser.DivideContext ctx);

  /**
   * Visit a parse tree produced by the {@code powerAssign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPowerAssign(JuliaParser.PowerAssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code inf} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInf(JuliaParser.InfContext ctx);

  /**
   * Visit a parse tree produced by the {@code naryConditional} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNaryConditional(JuliaParser.NaryConditionalContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmLessThan} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmLessThan(JuliaParser.ElmLessThanContext ctx);

  /**
   * Visit a parse tree produced by the {@code or} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitOr(JuliaParser.OrContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitwisOr} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitwisOr(JuliaParser.BitwisOrContext ctx);

  /**
   * Visit a parse tree produced by the {@code applyPrecedng} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);

  /**
   * Visit a parse tree produced by the {@code elmFraction} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmFraction(JuliaParser.ElmFractionContext ctx);

  /**
   * Visit a parse tree produced by the {@code inf16Type} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInf16Type(JuliaParser.Inf16TypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code int} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt(JuliaParser.IntContext ctx);

  /**
   * Visit a parse tree produced by the {@code pair} labeled alternative in {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPair(JuliaParser.PairContext ctx);

  /**
   * Visit a parse tree produced by the {@code typedExpression} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypedExpression(JuliaParser.TypedExpressionContext ctx);

  /**
   * Visit a parse tree produced by the {@code fraction} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFraction(JuliaParser.FractionContext ctx);

  /**
   * Visit a parse tree produced by the {@code minusInf16} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMinusInf16(JuliaParser.MinusInf16Context ctx);

  /**
   * Visit a parse tree produced by the {@code elmGreaterThanOrEqual} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitElmGreaterThanOrEqual(JuliaParser.ElmGreaterThanOrEqualContext ctx);

  /**
   * Visit a parse tree produced by the {@code equals} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitEquals(JuliaParser.EqualsContext ctx);

  /**
   * Visit a parse tree produced by the {@code minusInf} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMinusInf(JuliaParser.MinusInfContext ctx);

  /**
   * Visit a parse tree produced by the {@code arrayIndex} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitArrayIndex(JuliaParser.ArrayIndexContext ctx);

  /**
   * Visit a parse tree produced by the {@code ffloat64} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFfloat64(JuliaParser.Ffloat64Context ctx);

  /**
   * Visit a parse tree produced by the {@code remainder} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitRemainder(JuliaParser.RemainderContext ctx);

  /**
   * Visit a parse tree produced by the {@code bracketed} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBracketed(JuliaParser.BracketedContext ctx);

  /**
   * Visit a parse tree produced by the {@code ttypeExpression} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTtypeExpression(JuliaParser.TtypeExpressionContext ctx);

  /**
   * Visit a parse tree produced by the {@code assign} labeled alternative in
   * {@link JuliaParser#exp}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAssign(JuliaParser.AssignContext ctx);

  /**
   * Visit a parse tree produced by the {@code int8} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt8(JuliaParser.Int8Context ctx);

  /**
   * Visit a parse tree produced by the {@code uint8} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUint8(JuliaParser.Uint8Context ctx);

  /**
   * Visit a parse tree produced by the {@code int16} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt16(JuliaParser.Int16Context ctx);

  /**
   * Visit a parse tree produced by the {@code uint16} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUint16(JuliaParser.Uint16Context ctx);

  /**
   * Visit a parse tree produced by the {@code int32} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt32(JuliaParser.Int32Context ctx);

  /**
   * Visit a parse tree produced by the {@code uint32} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUint32(JuliaParser.Uint32Context ctx);

  /**
   * Visit a parse tree produced by the {@code int64} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt64(JuliaParser.Int64Context ctx);

  /**
   * Visit a parse tree produced by the {@code uint64} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUint64(JuliaParser.Uint64Context ctx);

  /**
   * Visit a parse tree produced by the {@code int128} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInt128(JuliaParser.Int128Context ctx);

  /**
   * Visit a parse tree produced by the {@code uint128} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUint128(JuliaParser.Uint128Context ctx);

  /**
   * Visit a parse tree produced by the {@code bool} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBool(JuliaParser.BoolContext ctx);

  /**
   * Visit a parse tree produced by the {@code char} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitChar(JuliaParser.CharContext ctx);

  /**
   * Visit a parse tree produced by the {@code float16} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFloat16(JuliaParser.Float16Context ctx);

  /**
   * Visit a parse tree produced by the {@code float32} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFloat32(JuliaParser.Float32Context ctx);

  /**
   * Visit a parse tree produced by the {@code float64} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitFloat64(JuliaParser.Float64Context ctx);

  /**
   * Visit a parse tree produced by the {@code unionType} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUnionType(JuliaParser.UnionTypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code returnExp} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitReturnExp(JuliaParser.ReturnExpContext ctx);

  /**
   * Visit a parse tree produced by the {@code return} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitReturn(JuliaParser.ReturnContext ctx);

  /**
   * Visit a parse tree produced by the {@code parametricType} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitParametricType(JuliaParser.ParametricTypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code userDefinedType} labeled alternative in
   * {@link JuliaParser#typeExpression}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUserDefinedType(JuliaParser.UserDefinedTypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code compactFunctionDeclaration} labeled alternative in
   * {@link JuliaParser#functionDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code generalFunctionDeclaration} labeled alternative in
   * {@link JuliaParser#functionDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code pparameters} labeled alternative in
   * {@link JuliaParser#parameters}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitPparameters(JuliaParser.PparametersContext ctx);

  /**
   * Visit a parse tree produced by the {@code namedTypedParam} labeled alternative in
   * {@link JuliaParser#parameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);

  /**
   * Visit a parse tree produced by the {@code anonymousTypedParam} labeled alternative in
   * {@link JuliaParser#parameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);

  /**
   * Visit a parse tree produced by the {@code vararg} labeled alternative in
   * {@link JuliaParser#parameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitVararg(JuliaParser.VarargContext ctx);

  /**
   * Visit a parse tree produced by the {@code namedParam} labeled alternative in
   * {@link JuliaParser#parameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNamedParam(JuliaParser.NamedParamContext ctx);

  /**
   * Visit a parse tree produced by the {@code typeAlias} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypeAlias(JuliaParser.TypeAliasContext ctx);

  /**
   * Visit a parse tree produced by the {@code abstractType} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitAbstractType(JuliaParser.AbstractTypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitsSubtype} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitsSubtype(JuliaParser.BitsSubtypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code bitsTtype} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitBitsTtype(JuliaParser.BitsTtypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code mutableTypeDeclaration} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code immutableTypeDeclaration} labeled alternative in
   * {@link JuliaParser#typeDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code typedFieldDeclaration} labeled alternative in
   * {@link JuliaParser#fieldDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code untypedFieldDeclaration} labeled alternative in
   * {@link JuliaParser#fieldDeclaration}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);

  /**
   * Visit a parse tree produced by the {@code ttypeParameters} labeled alternative in
   * {@link JuliaParser#typeParameters}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitTtypeParameters(JuliaParser.TtypeParametersContext ctx);

  /**
   * Visit a parse tree produced by the {@code namedSubtype} labeled alternative in
   * {@link JuliaParser#typeParameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNamedSubtype(JuliaParser.NamedSubtypeContext ctx);

  /**
   * Visit a parse tree produced by the {@code instance} labeled alternative in
   * {@link JuliaParser#typeParameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitInstance(JuliaParser.InstanceContext ctx);

  /**
   * Visit a parse tree produced by the {@code expression} labeled alternative in
   * {@link JuliaParser#typeParameter}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitExpression(JuliaParser.ExpressionContext ctx);

  /**
   * Visit a parse tree produced by the {@code forEq} labeled alternative in
   * {@link JuliaParser#forStatement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitForEq(JuliaParser.ForEqContext ctx);

  /**
   * Visit a parse tree produced by the {@code forEqStep} labeled alternative in
   * {@link JuliaParser#forStatement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitForEqStep(JuliaParser.ForEqStepContext ctx);

  /**
   * Visit a parse tree produced by the {@code forIn} labeled alternative in
   * {@link JuliaParser#forStatement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitForIn(JuliaParser.ForInContext ctx);

  /**
   * Visit a parse tree produced by {@link JuliaParser#whileStatement}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitWhileStatement(JuliaParser.WhileStatementContext ctx);

  /**
   * Visit a parse tree produced by the {@code nname} labeled alternative in
   * {@link JuliaParser#name}.
   * 
   * @param ctx
   *          the parse tree
   * @return the visitor result
   */
  T visitNname(JuliaParser.NnameContext ctx);
}