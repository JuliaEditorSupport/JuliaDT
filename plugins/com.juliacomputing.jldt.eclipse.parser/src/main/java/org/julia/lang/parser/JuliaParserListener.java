// Generated from org/julia/lang/parser/JuliaParser.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuliaParser}.
 */
public interface JuliaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JuliaParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(JuliaParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(JuliaParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code using}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterUsing(JuliaParser.UsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code using}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitUsing(JuliaParser.UsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importt}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportt(JuliaParser.ImporttContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importt}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportt(JuliaParser.ImporttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importAll}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportAll(JuliaParser.ImportAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importAll}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportAll(JuliaParser.ImportAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code export}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterExport(JuliaParser.ExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code export}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitExport(JuliaParser.ExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduleDeclaration}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduleDeclaration}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bareModuleDeclaration}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bareModuleDeclaration}
	 * labeled alternative in {@link JuliaParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JuliaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JuliaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octal}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOctal(JuliaParser.OctalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octal}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOctal(JuliaParser.OctalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAnd}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAnd(JuliaParser.BitwiseAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAnd}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAnd(JuliaParser.BitwiseAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmMinus(JuliaParser.ElmMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmMinus(JuliaParser.ElmMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseXorAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseXorAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnExp}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(JuliaParser.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnExp}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(JuliaParser.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLambda(JuliaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLambda(JuliaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divexpeAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divexpeAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code let}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLet(JuliaParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code let}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLet(JuliaParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JuliaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JuliaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterHex(JuliaParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitHex(JuliaParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNan(JuliaParser.NanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNan(JuliaParser.NanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseAndAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseAndAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JuliaParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JuliaParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inf32Type}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInf32Type(JuliaParser.Inf32TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inf32Type}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInf32Type(JuliaParser.Inf32TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterImplicitTuple(JuliaParser.ImplicitTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitTuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitImplicitTuple(JuliaParser.ImplicitTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIn(JuliaParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIn(JuliaParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmPlus(JuliaParser.ElmPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmPlus(JuliaParser.ElmPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tbc3}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTbc3(JuliaParser.Tbc3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tbc3}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTbc3(JuliaParser.Tbc3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code chained}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterChained(JuliaParser.ChainedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chained}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitChained(JuliaParser.ChainedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIs(JuliaParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIs(JuliaParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tbc1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTbc1(JuliaParser.Tbc1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tbc1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTbc1(JuliaParser.Tbc1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tbc2}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTbc2(JuliaParser.Tbc2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code tbc2}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTbc2(JuliaParser.Tbc2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterComprehension(JuliaParser.ComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comprehension}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitComprehension(JuliaParser.ComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwiseOrAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwiseOrAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRegex(JuliaParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRegex(JuliaParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeMarco1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeMarco1(JuliaParser.InvokeMarco1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeMarco1}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeMarco1(JuliaParser.InvokeMarco1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code elmEquals}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmEquals(JuliaParser.ElmEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmEquals}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmEquals(JuliaParser.ElmEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinary(JuliaParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinary(JuliaParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(JuliaParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(JuliaParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endLiteral}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEndLiteral(JuliaParser.EndLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endLiteral}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEndLiteral(JuliaParser.EndLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinus(JuliaParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinus(JuliaParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timesAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTimesAssign(JuliaParser.TimesAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timesAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTimesAssign(JuliaParser.TimesAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code range}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRange(JuliaParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code range}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRange(JuliaParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invokeMarco2}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeMarco2(JuliaParser.InvokeMarco2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code invokeMarco2}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeMarco2(JuliaParser.InvokeMarco2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code remainderAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRemainderAssign(JuliaParser.RemainderAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remainderAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRemainderAssign(JuliaParser.RemainderAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTuple(JuliaParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuple}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTuple(JuliaParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(JuliaParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(JuliaParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmLessThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmLessThan(JuliaParser.ElmLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmLessThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmLessThan(JuliaParser.ElmLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmFraction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmFraction(JuliaParser.ElmFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmFraction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmFraction(JuliaParser.ElmFractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inf16Type}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInf16Type(JuliaParser.Inf16TypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inf16Type}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInf16Type(JuliaParser.Inf16TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpression(JuliaParser.TypedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpression(JuliaParser.TypedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFraction(JuliaParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fraction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFraction(JuliaParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmGreaterThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmGreaterThanOrEqual(JuliaParser.ElmGreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmGreaterThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmGreaterThanOrEqual(JuliaParser.ElmGreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEquals(JuliaParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEquals(JuliaParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(JuliaParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(JuliaParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterReturn(JuliaParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitReturn(JuliaParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ttypeExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTtypeExpression(JuliaParser.TtypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ttypeExpression}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTtypeExpression(JuliaParser.TtypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tt}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTt(JuliaParser.TtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tt}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTt(JuliaParser.TtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(JuliaParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(JuliaParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nan32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNan32(JuliaParser.Nan32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nan32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNan32(JuliaParser.Nan32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstant(JuliaParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstant(JuliaParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmTimes}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmTimes(JuliaParser.ElmTimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmTimes}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmTimes(JuliaParser.ElmTimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code project}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterProject(JuliaParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code project}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitProject(JuliaParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryConditional(JuliaParser.TernaryConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryConditional(JuliaParser.TernaryConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyFunction(JuliaParser.ApplyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyFunction(JuliaParser.ApplyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lSRAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLSRAssign(JuliaParser.LSRAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lSRAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLSRAssign(JuliaParser.LSRAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coeffient}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCoeffient(JuliaParser.CoeffientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coeffient}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCoeffient(JuliaParser.CoeffientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invDivexpeAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invDivexpeAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmLessThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmLessThanOrEqual(JuliaParser.ElmLessThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmLessThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmLessThanOrEqual(JuliaParser.ElmLessThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(JuliaParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumeration}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(JuliaParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffloat32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFfloat32(JuliaParser.Ffloat32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ffloat32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFfloat32(JuliaParser.Ffloat32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExponent(JuliaParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponent}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExponent(JuliaParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(JuliaParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(JuliaParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(JuliaParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(JuliaParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aSRAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterASRAssign(JuliaParser.ASRAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aSRAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitASRAssign(JuliaParser.ASRAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPlus(JuliaParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPlus(JuliaParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanOrEqual}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmDivide}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmDivide(JuliaParser.ElmDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmDivide}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmDivide(JuliaParser.ElmDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusInf32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinusInf32(JuliaParser.MinusInf32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code minusInf32}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinusInf32(JuliaParser.MinusInf32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code aSLAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterASLAssign(JuliaParser.ASLAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aSLAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitASLAssign(JuliaParser.ASLAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddAssign(JuliaParser.AddAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddAssign(JuliaParser.AddAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nan16}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNan16(JuliaParser.Nan16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nan16}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNan16(JuliaParser.Nan16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ff}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFf(JuliaParser.FfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ff}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFf(JuliaParser.FfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charaacter}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCharaacter(JuliaParser.CharaacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charaacter}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCharaacter(JuliaParser.CharaacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(JuliaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(JuliaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousFunction}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(JuliaParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elmGreaterThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElmGreaterThan(JuliaParser.ElmGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elmGreaterThan}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElmGreaterThan(JuliaParser.ElmGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinusAssign(JuliaParser.MinusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinusAssign(JuliaParser.MinusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(JuliaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(JuliaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code times}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTimes(JuliaParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code times}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTimes(JuliaParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(JuliaParser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(JuliaParser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(JuliaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(JuliaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivide(JuliaParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivide(JuliaParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPowerAssign(JuliaParser.PowerAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerAssign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPowerAssign(JuliaParser.PowerAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inf}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInf(JuliaParser.InfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inf}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInf(JuliaParser.InfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNaryConditional(JuliaParser.NaryConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naryConditional}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNaryConditional(JuliaParser.NaryConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOr(JuliaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOr(JuliaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitwisOr}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBitwisOr(JuliaParser.BitwisOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitwisOr}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBitwisOr(JuliaParser.BitwisOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyPrecedng}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyPrecedng}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApplyPrecedng(JuliaParser.ApplyPrecedngContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInt(JuliaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInt(JuliaParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pair}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPair(JuliaParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pair}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPair(JuliaParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusInf16}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinusInf16(JuliaParser.MinusInf16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code minusInf16}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinusInf16(JuliaParser.MinusInf16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(JuliaParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlus}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(JuliaParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusInf}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMinusInf(JuliaParser.MinusInfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusInf}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMinusInf(JuliaParser.MinusInfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ffloat64}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFfloat64(JuliaParser.Ffloat64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ffloat64}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFfloat64(JuliaParser.Ffloat64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code remainder}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRemainder(JuliaParser.RemainderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remainder}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRemainder(JuliaParser.RemainderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketed}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBracketed(JuliaParser.BracketedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketed}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBracketed(JuliaParser.BracketedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JuliaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link JuliaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JuliaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int8}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterInt8(JuliaParser.Int8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int8}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitInt8(JuliaParser.Int8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint8}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUint8(JuliaParser.Uint8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint8}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUint8(JuliaParser.Uint8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterInt16(JuliaParser.Int16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitInt16(JuliaParser.Int16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUint16(JuliaParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUint16(JuliaParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterInt32(JuliaParser.Int32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitInt32(JuliaParser.Int32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUint32(JuliaParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUint32(JuliaParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterInt64(JuliaParser.Int64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitInt64(JuliaParser.Int64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUint64(JuliaParser.Uint64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUint64(JuliaParser.Uint64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int128}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterInt128(JuliaParser.Int128Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int128}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitInt128(JuliaParser.Int128Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint128}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUint128(JuliaParser.Uint128Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint128}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUint128(JuliaParser.Uint128Context ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterBool(JuliaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitBool(JuliaParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterChar(JuliaParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitChar(JuliaParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloat16(JuliaParser.Float16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code float16}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloat16(JuliaParser.Float16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code float32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloat32(JuliaParser.Float32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code float32}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloat32(JuliaParser.Float32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code float64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterFloat64(JuliaParser.Float64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code float64}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitFloat64(JuliaParser.Float64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(JuliaParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(JuliaParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parametricType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterParametricType(JuliaParser.ParametricTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parametricType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitParametricType(JuliaParser.ParametricTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userDefinedType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedType(JuliaParser.UserDefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userDefinedType}
	 * labeled alternative in {@link JuliaParser#typeExpression}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedType(JuliaParser.UserDefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactFunctionDeclaration(JuliaParser.CompactFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generalFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generalFunctionDeclaration}
	 * labeled alternative in {@link JuliaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGeneralFunctionDeclaration(JuliaParser.GeneralFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pparameters}
	 * labeled alternative in {@link JuliaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPparameters(JuliaParser.PparametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pparameters}
	 * labeled alternative in {@link JuliaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPparameters(JuliaParser.PparametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedTypedParam(JuliaParser.NamedTypedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code anonymousTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code anonymousTypedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousTypedParam(JuliaParser.AnonymousTypedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterVararg(JuliaParser.VarargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitVararg(JuliaParser.VarargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedParam(JuliaParser.NamedParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedParam}
	 * labeled alternative in {@link JuliaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedParam(JuliaParser.NamedParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAlias}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(JuliaParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAlias}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(JuliaParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(JuliaParser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(JuliaParser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitsSubtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBitsSubtype(JuliaParser.BitsSubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitsSubtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBitsSubtype(JuliaParser.BitsSubtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitsTtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBitsTtype(JuliaParser.BitsTtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitsTtype}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBitsTtype(JuliaParser.BitsTtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMutableTypeDeclaration(JuliaParser.MutableTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code immutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code immutableTypeDeclaration}
	 * labeled alternative in {@link JuliaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImmutableTypeDeclaration(JuliaParser.ImmutableTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedFieldDeclaration(JuliaParser.TypedFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code untypedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code untypedFieldDeclaration}
	 * labeled alternative in {@link JuliaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUntypedFieldDeclaration(JuliaParser.UntypedFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ttypeParameters}
	 * labeled alternative in {@link JuliaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTtypeParameters(JuliaParser.TtypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ttypeParameters}
	 * labeled alternative in {@link JuliaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTtypeParameters(JuliaParser.TtypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedSubtype}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterNamedSubtype(JuliaParser.NamedSubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedSubtype}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitNamedSubtype(JuliaParser.NamedSubtypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instance}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterInstance(JuliaParser.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instance}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitInstance(JuliaParser.InstanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JuliaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link JuliaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JuliaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEq}
	 * labeled alternative in {@link JuliaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEq(JuliaParser.ForEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEq}
	 * labeled alternative in {@link JuliaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEq(JuliaParser.ForEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link JuliaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIn(JuliaParser.ForInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forIn}
	 * labeled alternative in {@link JuliaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIn(JuliaParser.ForInContext ctx);
	/**
	 * Enter a parse tree produced by {@link JuliaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JuliaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JuliaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JuliaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nname}
	 * labeled alternative in {@link JuliaParser#name}.
	 * @param ctx the parse tree
	 */
	void enterNname(JuliaParser.NnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nname}
	 * labeled alternative in {@link JuliaParser#name}.
	 * @param ctx the parse tree
	 */
	void exitNname(JuliaParser.NnameContext ctx);
}