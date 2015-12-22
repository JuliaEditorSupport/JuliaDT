// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaParser.g4 by ANTLR 4.5.1

package org.julia.lang;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JuliaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface JuliaParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link JuliaParser#unit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnit(JuliaParser.UnitContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(JuliaParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by the {@code tt}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTt(JuliaParser.TtContext ctx);

    /**
     * Visit a parse tree produced by the {@code nan32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNan32(JuliaParser.Nan32Context ctx);

    /**
     * Visit a parse tree produced by the {@code octal}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOctal(JuliaParser.OctalContext ctx);

    /**
     * Visit a parse tree produced by the {@code symbol}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSymbol(JuliaParser.SymbolContext ctx);

    /**
     * Visit a parse tree produced by the {@code conditional}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConditional(JuliaParser.ConditionalContext ctx);

    /**
     * Visit a parse tree produced by the {@code type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(JuliaParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code bitwiseXorAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitwiseXorAssign(JuliaParser.BitwiseXorAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code lSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLSRAssign(JuliaParser.LSRAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code coeffient}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCoeffient(JuliaParser.CoeffientContext ctx);

    /**
     * Visit a parse tree produced by the {@code invDivexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInvDivexpeAssign(JuliaParser.InvDivexpeAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code divexpeAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivexpeAssign(JuliaParser.DivexpeAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code nan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNan(JuliaParser.NanContext ctx);

    /**
     * Visit a parse tree produced by the {@code hex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHex(JuliaParser.HexContext ctx);

    /**
     * Visit a parse tree produced by the {@code greaterThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGreaterThan(JuliaParser.GreaterThanContext ctx);

    /**
     * Visit a parse tree produced by the {@code bitwiseAndAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitwiseAndAssign(JuliaParser.BitwiseAndAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code identifier}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(JuliaParser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by the {@code inf32Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInf32Type(JuliaParser.Inf32TypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code notEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNotEqual(JuliaParser.NotEqualContext ctx);

    /**
     * Visit a parse tree produced by the {@code tbc1}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTbc1(JuliaParser.Tbc1Context ctx);

    /**
     * Visit a parse tree produced by the {@code aSRAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitASRAssign(JuliaParser.ASRAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code plus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(JuliaParser.PlusContext ctx);

    /**
     * Visit a parse tree produced by the {@code greaterThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGreaterThanOrEqual(JuliaParser.GreaterThanOrEqualContext ctx);

    /**
     * Visit a parse tree produced by the {@code bitwiseOrAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitwiseOrAssign(JuliaParser.BitwiseOrAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code minusInf32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinusInf32(JuliaParser.MinusInf32Context ctx);

    /**
     * Visit a parse tree produced by the {@code binary}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBinary(JuliaParser.BinaryContext ctx);

    /**
     * Visit a parse tree produced by the {@code lessThanOrEqual}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLessThanOrEqual(JuliaParser.LessThanOrEqualContext ctx);

    /**
     * Visit a parse tree produced by the {@code aSLAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitASLAssign(JuliaParser.ASLAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryMinus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryMinus(JuliaParser.UnaryMinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code addAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAddAssign(JuliaParser.AddAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code nan16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNan16(JuliaParser.Nan16Context ctx);

    /**
     * Visit a parse tree produced by the {@code ff}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFf(JuliaParser.FfContext ctx);

    /**
     * Visit a parse tree produced by the {@code minus}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinus(JuliaParser.MinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code string}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString(JuliaParser.StringContext ctx);

    /**
     * Visit a parse tree produced by the {@code timesAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimesAssign(JuliaParser.TimesAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code float64}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloat64(JuliaParser.Float64Context ctx);

    /**
     * Visit a parse tree produced by the {@code minusAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinusAssign(JuliaParser.MinusAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code remainderAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRemainderAssign(JuliaParser.RemainderAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code tuple}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTuple(JuliaParser.TupleContext ctx);

    /**
     * Visit a parse tree produced by the {@code not}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNot(JuliaParser.NotContext ctx);

    /**
     * Visit a parse tree produced by the {@code times}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTimes(JuliaParser.TimesContext ctx);

    /**
     * Visit a parse tree produced by the {@code subtype}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSubtype(JuliaParser.SubtypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code and}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd(JuliaParser.AndContext ctx);

    /**
     * Visit a parse tree produced by the {@code lessThan}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLessThan(JuliaParser.LessThanContext ctx);

    /**
     * Visit a parse tree produced by the {@code divide}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDivide(JuliaParser.DivideContext ctx);

    /**
     * Visit a parse tree produced by the {@code powerAssign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPowerAssign(JuliaParser.PowerAssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code inf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInf(JuliaParser.InfContext ctx);

    /**
     * Visit a parse tree produced by the {@code or}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr(JuliaParser.OrContext ctx);

    /**
     * Visit a parse tree produced by the {@code apply}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitApply(JuliaParser.ApplyContext ctx);

    /**
     * Visit a parse tree produced by the {@code float32}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFloat32(JuliaParser.Float32Context ctx);

    /**
     * Visit a parse tree produced by the {@code inf16Type}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInf16Type(JuliaParser.Inf16TypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code int}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt(JuliaParser.IntContext ctx);

    /**
     * Visit a parse tree produced by the {@code typedExpression}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypedExpression(JuliaParser.TypedExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code fraction}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFraction(JuliaParser.FractionContext ctx);

    /**
     * Visit a parse tree produced by the {@code minusInf16}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinusInf16(JuliaParser.MinusInf16Context ctx);

    /**
     * Visit a parse tree produced by the {@code equals}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEquals(JuliaParser.EqualsContext ctx);

    /**
     * Visit a parse tree produced by the {@code minusInf}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinusInf(JuliaParser.MinusInfContext ctx);

    /**
     * Visit a parse tree produced by the {@code arrayIndex}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitArrayIndex(JuliaParser.ArrayIndexContext ctx);

    /**
     * Visit a parse tree produced by the {@code assign}
     * labeled alternative in {@link JuliaParser#exp}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(JuliaParser.AssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code include}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInclude(JuliaParser.IncludeContext ctx);

    /**
     * Visit a parse tree produced by the {@code using}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUsing(JuliaParser.UsingContext ctx);

    /**
     * Visit a parse tree produced by the {@code importt}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportt(JuliaParser.ImporttContext ctx);

    /**
     * Visit a parse tree produced by the {@code importAll}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImportAll(JuliaParser.ImportAllContext ctx);

    /**
     * Visit a parse tree produced by the {@code export}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExport(JuliaParser.ExportContext ctx);

    /**
     * Visit a parse tree produced by the {@code moduleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModuleDeclaration(JuliaParser.ModuleDeclarationContext ctx);

    /**
     * Visit a parse tree produced by the {@code bareModuleDeclaration}
     * labeled alternative in {@link JuliaParser#moduleDirective}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBareModuleDeclaration(JuliaParser.BareModuleDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#functionDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunctionDeclaration(JuliaParser.FunctionDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#parameters}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameters(JuliaParser.ParametersContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#parameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParameter(JuliaParser.ParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#typeExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeExpression(JuliaParser.TypeExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#fieldDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldDeclaration(JuliaParser.FieldDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#typeParameters}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeParameters(JuliaParser.TypeParametersContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#typeParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeParameter(JuliaParser.TypeParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#typeAlias}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTypeAlias(JuliaParser.TypeAliasContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#forStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForStatement(JuliaParser.ForStatementContext ctx);

    /**
     * Visit a parse tree produced by {@link JuliaParser#ifStatement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfStatement(JuliaParser.IfStatementContext ctx);
}