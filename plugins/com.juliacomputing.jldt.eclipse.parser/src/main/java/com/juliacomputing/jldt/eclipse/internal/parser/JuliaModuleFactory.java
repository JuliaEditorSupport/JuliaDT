package com.juliacomputing.jldt.eclipse.internal.parser;

import com.juliacomputing.jldt.eclipse.ast.Operator;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.eclipse.dltk.ast.ASTListNode;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.ast.declarations.Argument;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.references.VariableReference;
import org.eclipse.dltk.ast.statements.Block;
import org.julia.lang.parser.JuliaParser.*;
import org.julia.lang.parser.JuliaParserBaseVisitor;

import java.util.List;


//todo review start/stop indices

public class JuliaModuleFactory extends JuliaParserBaseVisitor<ASTNode> {

    public ModuleDeclaration create(UnitContext context) {
        return visitUnit(context);
    }

    @Override
    public ModuleDeclaration visitUnit(UnitContext ctx) {
        final ModuleDeclaration moduleDeclaration = new ModuleDeclaration(ctx.getText().length());
        final List<StatementContext> statementContexts = ctx.statement();
        for (StatementContext statementContext : statementContexts) {
            final ASTNode statement = visit(statementContext);
            if (statement == null)
                continue;
            moduleDeclaration.addStatement(statement);
        }
        return moduleDeclaration;
    }

    @Override
    public ASTNode visitAssign(AssignContext ctx) {
        final Expression lhs = (Expression) visit(ctx.exp(0));
        final Expression rhs = (Expression) visit(ctx.exp(1));
        return new Operator("<-", start(ctx), stop(ctx), lhs, rhs);
    }

    @Override
    public ASTNode visitPlus(PlusContext ctx) {
        final Expression lhs = (Expression) visit(ctx.exp(0));
        final Expression rhs = (Expression) visit(ctx.exp(1));
        return new Operator("+", start(ctx), stop(ctx), lhs, rhs);
    }

    @Override
    public ASTNode visitIdentifier(IdentifierContext ctx) {
        final Token identifier = ctx.ID().getSymbol();
        return new VariableReference(start(identifier), stop(identifier), identifier.getText());
    }

    @Override
    public ASTNode visitAbstractType(AbstractTypeContext ctx) {
        final Token type = ctx.ID().getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(ctx.ID().getText(), start(type), stop(type), start(ctx), stop(ctx));
        typeDeclaration.setModifier(Modifiers.AccAbstract);
        return typeDeclaration;
    }


    @Override
    public ASTNode visitTypedFieldDeclaration(TypedFieldDeclarationContext ctx) {
        final Token type = ctx.ID().getSymbol();
        return new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
    }

    @Override
    public ASTNode visitUntypedFieldDeclaration(UntypedFieldDeclarationContext ctx) {
        final Token type = ctx.ID().getSymbol();
        return new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
    }


    @Override
    public ASTNode visitImmutableTypeDeclaration(ImmutableTypeDeclarationContext ctx) {
        final Token type = ctx.ID().getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
        final Block block = new Block();
        final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
        for (FieldDeclarationContext field : fields) {
            block.addStatement(visit(field));
        }
        typeDeclaration.setBody(block);
        return typeDeclaration;
    }

    @Override
    public ASTNode visitImmutableSubTypeDeclaration(ImmutableSubTypeDeclarationContext ctx) {
        final Token type = ctx.ID(0).getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
        final Token superType = ctx.ID(1).getSymbol();
        final TypeReference typeReference = new TypeReference(start(superType), stop(superType), superType.getText());
        typeDeclaration.addSuperClass(typeReference);
        final Block block = new Block();
        final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
        for (FieldDeclarationContext field : fields) {
            block.addStatement(visit(field));
        }
        typeDeclaration.setBody(block);
        return typeDeclaration;
    }

    @Override
    public ASTNode visitSubTypeDeclaration(SubTypeDeclarationContext ctx) {
        final Token type = ctx.ID(0).getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
        final Token superType = ctx.ID(1).getSymbol();
        final TypeReference typeReference = new TypeReference(start(superType), stop(superType), superType.getText());
        typeDeclaration.addSuperClass(typeReference);
        final Block block = new Block();
        final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
        for (FieldDeclarationContext field : fields) {
            block.addStatement(visit(field));
        }
        typeDeclaration.setBody(block);
        return typeDeclaration;
    }

    @Override
    public ASTNode visitTypeDeclaration(TypeDeclarationContext ctx) {
        final Token type = ctx.ID().getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
        final Block block = new Block();
        final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
        for (FieldDeclarationContext field : fields) {
            block.addStatement(visit(field));
        }
        typeDeclaration.setBody(block);
        return typeDeclaration;
    }



    @Override
    public ASTNode visitAbstractSubtype(AbstractSubtypeContext ctx) {
        final Token type = ctx.ID(0).getSymbol();
        final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type), stop(type), start(ctx), stop(ctx));
        typeDeclaration.setModifier(Modifiers.AccAbstract);
        final Token superType = ctx.ID(1).getSymbol();
        final TypeReference typeReference = new TypeReference(start(superType), stop(superType), superType.getText());
        typeDeclaration.addSuperClass(typeReference);
        return typeDeclaration;
    }

    @Override
    public ASTNode visitInt8(Int8Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitTtypeAlias(TtypeAliasContext ctx) {
        final Token alias = ctx.ID().getSymbol();
        final ASTNode type = visit(ctx.typeExpression());
        final TypeDeclaration typeDeclaration = new TypeDeclaration(ctx.ID().getText(), start(alias), stop(alias), start(ctx), stop(ctx));
        typeDeclaration.addSuperClass(type);
        return typeDeclaration;
    }

    @Override
    public ASTNode visitCompactFunctionDeclaration(CompactFunctionDeclarationContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final MethodDeclaration methodDeclaration = new MethodDeclaration(name.getText(), start(name), stop(name), start(ctx), stop(ctx));
        final ASTNode arguments = visit(ctx.parameters());
        methodDeclaration.acceptArguments(arguments.getChilds());
        return methodDeclaration;
    }

    @Override
    public ASTNode visitGeneralFunctionDeclaration(GeneralFunctionDeclarationContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final MethodDeclaration methodDeclaration = new MethodDeclaration(name.getText(), start(name), stop(name), start(ctx), stop(ctx));
        final ASTNode arguments = visit(ctx.parameters());
        methodDeclaration.acceptArguments(arguments.getChilds());
        return methodDeclaration;
    }

    @Override
    public ASTListNode visitPparameters(PparametersContext ctx) {
        ASTListNode arguments = new ASTListNode();
        final List<ParameterContext> parameterContexts = ctx.parameter();
        for (ParameterContext parameterContext : parameterContexts) {
            arguments.addNode(visit(parameterContext));
        }
        return arguments;
    }

    @Override
    public ASTNode visitNamedTypedParam(NamedTypedParamContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final SimpleReference reference = new SimpleReference(start(name), stop(name), name.getText());
        return new Argument(reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
    }

    @Override
    public ASTNode visitNamedParam(NamedParamContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final SimpleReference reference = new SimpleReference(start(name), stop(name), name.getText());
        final Argument argument = new Argument(reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
        return argument;
    }

    private int start(ASTNode node) {
        return node.start();
    }

    private int stop(ASTNode node) {
        return node.end();
    }

    private int start(ParserRuleContext context) {
        return start(context.getStart());
    }

    private int stop(ParserRuleContext context) {
        return stop(context.getStop());
    }

    private int start(Token token) {
        return token.getStartIndex();
    }

    private int stop(Token token) {
        return token.getStartIndex() + token.getText().length();
    }


}
