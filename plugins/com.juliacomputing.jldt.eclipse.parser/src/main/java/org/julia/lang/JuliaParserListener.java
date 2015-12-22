// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaParser.g4 by ANTLR 4.5.1

package org.julia.lang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JuliaParser}.
 */
public interface JuliaParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link JuliaParser#unit}.
     *
     * @param ctx the parse tree
     */
    void enterUnit(JuliaParser.UnitContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#unit}.
     *
     * @param ctx the parse tree
     */
    void exitUnit(JuliaParser.UnitContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(JuliaParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(JuliaParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code tt}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTt(JuliaParser.TtContext ctx);

    /**
     * Exit a parse tree produced by the {@code tt}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTt(JuliaParser.TtContext ctx);

    /**
     * Enter a parse tree produced by the {@code nan32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNan32(JuliaParser.Nan32Context ctx);

    /**
     * Exit a parse tree produced by the {@code nan32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNan32(JuliaParser.Nan32Context ctx);

    /**
     * Enter a parse tree produced by the {@code octal}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterOctal(JuliaParser.OctalContext ctx);

    /**
     * Exit a parse tree produced by the {@code octal}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitOctal(JuliaParser.OctalContext ctx);

    /**
     * Enter a parse tree produced by the {@code symbol}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterSymbol(JuliaParser.SymbolContext ctx);

    /**
     * Exit a parse tree produced by the {@code symbol}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitSymbol(JuliaParser.SymbolContext ctx);

    /**
     * Enter a parse tree produced by the {@code conditional}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterConditional(JuliaParser.ConditionalContext ctx);

    /**
     * Exit a parse tree produced by the {@code conditional}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitConditional(JuliaParser.ConditionalContext ctx);

    /**
     * Enter a parse tree produced by the {@code type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterType(JuliaParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitType(JuliaParser.TypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code bitwiseXorAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code bitwiseXorAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code lSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterLSRAssign(JuliaParser.LSRAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code lSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitLSRAssign(JuliaParser.LSRAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code coeffient}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterCoeffient(JuliaParser.CoeffientContext ctx);

    /**
     * Exit a parse tree produced by the {@code coeffient}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitCoeffient(JuliaParser.CoeffientContext ctx);

    /**
     * Enter a parse tree produced by the {@code invDivexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code invDivexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code divexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code divexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code nan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNan(JuliaParser.NanContext ctx);

    /**
     * Exit a parse tree produced by the {@code nan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNan(JuliaParser.NanContext ctx);

    /**
     * Enter a parse tree produced by the {@code hex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterHex(JuliaParser.HexContext ctx);

    /**
     * Exit a parse tree produced by the {@code hex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitHex(JuliaParser.HexContext ctx);

    /**
     * Enter a parse tree produced by the {@code greaterThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterGreaterThan(JuliaParser.GreaterThanContext ctx);

    /**
     * Exit a parse tree produced by the {@code greaterThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitGreaterThan(JuliaParser.GreaterThanContext ctx);

    /**
     * Enter a parse tree produced by the {@code bitwiseAndAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code bitwiseAndAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code identifier}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(JuliaParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by the {@code identifier}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(JuliaParser.IdentifierContext ctx);

    /**
     * Enter a parse tree produced by the {@code inf32Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterInf32Type(JuliaParser.Inf32TypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code inf32Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitInf32Type(JuliaParser.Inf32TypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code notEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNotEqual(JuliaParser.NotEqualContext ctx);

    /**
     * Exit a parse tree produced by the {@code notEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNotEqual(JuliaParser.NotEqualContext ctx);

    /**
     * Enter a parse tree produced by the {@code tbc1}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTbc1(JuliaParser.Tbc1Context ctx);

    /**
     * Exit a parse tree produced by the {@code tbc1}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTbc1(JuliaParser.Tbc1Context ctx);

    /**
     * Enter a parse tree produced by the {@code aSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterASRAssign(JuliaParser.ASRAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code aSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitASRAssign(JuliaParser.ASRAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code plus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterPlus(JuliaParser.PlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code plus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitPlus(JuliaParser.PlusContext ctx);

    /**
     * Enter a parse tree produced by the {@code greaterThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);

    /**
     * Exit a parse tree produced by the {@code greaterThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);

    /**
     * Enter a parse tree produced by the {@code bitwiseOrAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code bitwiseOrAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code minusInf32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMinusInf32(JuliaParser.MinusInf32Context ctx);

    /**
     * Exit a parse tree produced by the {@code minusInf32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMinusInf32(JuliaParser.MinusInf32Context ctx);

    /**
     * Enter a parse tree produced by the {@code binary}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterBinary(JuliaParser.BinaryContext ctx);

    /**
     * Exit a parse tree produced by the {@code binary}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitBinary(JuliaParser.BinaryContext ctx);

    /**
     * Enter a parse tree produced by the {@code lessThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);

    /**
     * Exit a parse tree produced by the {@code lessThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);

    /**
     * Enter a parse tree produced by the {@code aSLAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterASLAssign(JuliaParser.ASLAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code aSLAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitASLAssign(JuliaParser.ASLAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code unaryMinus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryMinus(JuliaParser.UnaryMinusContext ctx);

    /**
     * Exit a parse tree produced by the {@code unaryMinus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryMinus(JuliaParser.UnaryMinusContext ctx);

    /**
     * Enter a parse tree produced by the {@code addAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterAddAssign(JuliaParser.AddAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code addAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitAddAssign(JuliaParser.AddAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code nan16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNan16(JuliaParser.Nan16Context ctx);

    /**
     * Exit a parse tree produced by the {@code nan16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNan16(JuliaParser.Nan16Context ctx);

    /**
     * Enter a parse tree produced by the {@code ff}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterFf(JuliaParser.FfContext ctx);

    /**
     * Exit a parse tree produced by the {@code ff}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitFf(JuliaParser.FfContext ctx);

    /**
     * Enter a parse tree produced by the {@code minus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMinus(JuliaParser.MinusContext ctx);

    /**
     * Exit a parse tree produced by the {@code minus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMinus(JuliaParser.MinusContext ctx);

    /**
     * Enter a parse tree produced by the {@code string}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterString(JuliaParser.StringContext ctx);

    /**
     * Exit a parse tree produced by the {@code string}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitString(JuliaParser.StringContext ctx);

    /**
     * Enter a parse tree produced by the {@code timesAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTimesAssign(JuliaParser.TimesAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code timesAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTimesAssign(JuliaParser.TimesAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code float64}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterFloat64(JuliaParser.Float64Context ctx);

    /**
     * Exit a parse tree produced by the {@code float64}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitFloat64(JuliaParser.Float64Context ctx);

    /**
     * Enter a parse tree produced by the {@code minusAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMinusAssign(JuliaParser.MinusAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code minusAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMinusAssign(JuliaParser.MinusAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code remainderAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterRemainderAssign(JuliaParser.RemainderAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code remainderAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitRemainderAssign(JuliaParser.RemainderAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code tuple}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTuple(JuliaParser.TupleContext ctx);

    /**
     * Exit a parse tree produced by the {@code tuple}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTuple(JuliaParser.TupleContext ctx);

    /**
     * Enter a parse tree produced by the {@code not}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterNot(JuliaParser.NotContext ctx);

    /**
     * Exit a parse tree produced by the {@code not}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitNot(JuliaParser.NotContext ctx);

    /**
     * Enter a parse tree produced by the {@code times}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTimes(JuliaParser.TimesContext ctx);

    /**
     * Exit a parse tree produced by the {@code times}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTimes(JuliaParser.TimesContext ctx);

    /**
     * Enter a parse tree produced by the {@code subtype}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterSubtype(JuliaParser.SubtypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code subtype}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitSubtype(JuliaParser.SubtypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code and}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterAnd(JuliaParser.AndContext ctx);

    /**
     * Exit a parse tree produced by the {@code and}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitAnd(JuliaParser.AndContext ctx);

    /**
     * Enter a parse tree produced by the {@code lessThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterLessThan(JuliaParser.LessThanContext ctx);

    /**
     * Exit a parse tree produced by the {@code lessThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitLessThan(JuliaParser.LessThanContext ctx);

    /**
     * Enter a parse tree produced by the {@code divide}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterDivide(JuliaParser.DivideContext ctx);

    /**
     * Exit a parse tree produced by the {@code divide}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitDivide(JuliaParser.DivideContext ctx);

    /**
     * Enter a parse tree produced by the {@code powerAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterPowerAssign(JuliaParser.PowerAssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code powerAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitPowerAssign(JuliaParser.PowerAssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code inf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterInf(JuliaParser.InfContext ctx);

    /**
     * Exit a parse tree produced by the {@code inf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitInf(JuliaParser.InfContext ctx);

    /**
     * Enter a parse tree produced by the {@code or}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterOr(JuliaParser.OrContext ctx);

    /**
     * Exit a parse tree produced by the {@code or}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitOr(JuliaParser.OrContext ctx);

    /**
     * Enter a parse tree produced by the {@code apply}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterApply(JuliaParser.ApplyContext ctx);

    /**
     * Exit a parse tree produced by the {@code apply}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitApply(JuliaParser.ApplyContext ctx);

    /**
     * Enter a parse tree produced by the {@code float32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterFloat32(JuliaParser.Float32Context ctx);

    /**
     * Exit a parse tree produced by the {@code float32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitFloat32(JuliaParser.Float32Context ctx);

    /**
     * Enter a parse tree produced by the {@code inf16Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterInf16Type(JuliaParser.Inf16TypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code inf16Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitInf16Type(JuliaParser.Inf16TypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code int}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterInt(JuliaParser.IntContext ctx);

    /**
     * Exit a parse tree produced by the {@code int}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitInt(JuliaParser.IntContext ctx);

    /**
     * Enter a parse tree produced by the {@code typedExpression}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterTypedExpression(JuliaParser.TypedExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code typedExpression}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitTypedExpression(JuliaParser.TypedExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code fraction}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterFraction(JuliaParser.FractionContext ctx);

    /**
     * Exit a parse tree produced by the {@code fraction}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitFraction(JuliaParser.FractionContext ctx);

    /**
     * Enter a parse tree produced by the {@code minusInf16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMinusInf16(JuliaParser.MinusInf16Context ctx);

    /**
     * Exit a parse tree produced by the {@code minusInf16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMinusInf16(JuliaParser.MinusInf16Context ctx);

    /**
     * Enter a parse tree produced by the {@code equals}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterEquals(JuliaParser.EqualsContext ctx);

    /**
     * Exit a parse tree produced by the {@code equals}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitEquals(JuliaParser.EqualsContext ctx);

    /**
     * Enter a parse tree produced by the {@code minusInf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterMinusInf(JuliaParser.MinusInfContext ctx);

    /**
     * Exit a parse tree produced by the {@code minusInf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitMinusInf(JuliaParser.MinusInfContext ctx);

    /**
     * Enter a parse tree produced by the {@code arrayIndex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterArrayIndex(JuliaParser.ArrayIndexContext ctx);

    /**
     * Exit a parse tree produced by the {@code arrayIndex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitArrayIndex(JuliaParser.ArrayIndexContext ctx);

    /**
     * Enter a parse tree produced by the {@code assign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(JuliaParser.AssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code assign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(JuliaParser.AssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code include}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterInclude(JuliaParser.IncludeContext ctx);

    /**
     * Exit a parse tree produced by the {@code include}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitInclude(JuliaParser.IncludeContext ctx);

    /**
     * Enter a parse tree produced by the {@code using}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterUsing(JuliaParser.UsingContext ctx);

    /**
     * Exit a parse tree produced by the {@code using}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitUsing(JuliaParser.UsingContext ctx);

    /**
     * Enter a parse tree produced by the {@code importt}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterImportt(JuliaParser.ImporttContext ctx);

    /**
     * Exit a parse tree produced by the {@code importt}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitImportt(JuliaParser.ImporttContext ctx);

    /**
     * Enter a parse tree produced by the {@code importAll}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterImportAll(JuliaParser.ImportAllContext ctx);

    /**
     * Exit a parse tree produced by the {@code importAll}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitImportAll(JuliaParser.ImportAllContext ctx);

    /**
     * Enter a parse tree produced by the {@code export}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterExport(JuliaParser.ExportContext ctx);

    /**
     * Exit a parse tree produced by the {@code export}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitExport(JuliaParser.ExportContext ctx);

    /**
     * Enter a parse tree produced by the {@code moduleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code moduleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code bareModuleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void enterBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code bareModuleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     */
    void exitBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#functionDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionDeclaration(JuliaParser.FunctionDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#functionDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionDeclaration(JuliaParser.FunctionDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#parameters}.
     *
     * @param ctx the parse tree
     */
    void enterParameters(JuliaParser.ParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#parameters}.
     *
     * @param ctx the parse tree
     */
    void exitParameters(JuliaParser.ParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void enterParameter(JuliaParser.ParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#parameter}.
     *
     * @param ctx the parse tree
     */
    void exitParameter(JuliaParser.ParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#typeExpression}.
     *
     * @param ctx the parse tree
     */
    void enterTypeExpression(JuliaParser.TypeExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#typeExpression}.
     *
     * @param ctx the parse tree
     */
    void exitTypeExpression(JuliaParser.TypeExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#fieldDeclaration}.
     *
     * @param ctx the parse tree
     */
    void enterFieldDeclaration(JuliaParser.FieldDeclarationContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#fieldDeclaration}.
     *
     * @param ctx the parse tree
     */
    void exitFieldDeclaration(JuliaParser.FieldDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#typeParameters}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameters(JuliaParser.TypeParametersContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#typeParameters}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameters(JuliaParser.TypeParametersContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#typeParameter}.
     *
     * @param ctx the parse tree
     */
    void enterTypeParameter(JuliaParser.TypeParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#typeParameter}.
     *
     * @param ctx the parse tree
     */
    void exitTypeParameter(JuliaParser.TypeParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#typeAlias}.
     *
     * @param ctx the parse tree
     */
    void enterTypeAlias(JuliaParser.TypeAliasContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#typeAlias}.
     *
     * @param ctx the parse tree
     */
    void exitTypeAlias(JuliaParser.TypeAliasContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void enterForStatement(JuliaParser.ForStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#forStatement}.
     *
     * @param ctx the parse tree
     */
    void exitForStatement(JuliaParser.ForStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link JuliaParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(JuliaParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link JuliaParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(JuliaParser.IfStatementContext ctx);
}