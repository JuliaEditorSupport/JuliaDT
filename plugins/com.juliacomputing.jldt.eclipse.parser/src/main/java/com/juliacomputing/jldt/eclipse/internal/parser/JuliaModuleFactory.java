package com.juliacomputing.jldt.eclipse.internal.parser;

import com.juliacomputing.jldt.eclipse.ast.Operator;
import com.juliacomputing.jldt.eclipse.ast.QualifiedName;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
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

import java.util.ArrayList;
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
    public ASTNode visitModuleDeclaration(ModuleDeclarationContext ctx) {
        ASTListNode statements = new ASTListNode();
        final List<StatementContext> statementContexts = ctx.statement();
        for (StatementContext statementContext : statementContexts) {
            final ASTNode statement = visit(statementContext);
            statements.addNode(statement);
        }
        return statements;
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
    public ASTNode visitUint8(Uint8Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitInt16(Int16Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitInt32(Int32Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitUint16(Uint16Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());

    }

    @Override
    public ASTNode visitUint32(Uint32Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitInt64(Int64Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitUint64(Uint64Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitInt128(Int128Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitUint128(Uint128Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitBool(BoolContext ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitChar(CharContext ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitFloat16(Float16Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitFloat32(Float32Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitFloat64(Float64Context ctx) {
        return new TypeReference(start(ctx), stop(ctx), ctx.getText());
    }

    @Override
    public ASTNode visitFfloat32(Ffloat32Context ctx) {
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
        final QualifiedName qualifiedName = (QualifiedName) visit(ctx.name());
        final MethodDeclaration methodDeclaration = new MethodDeclaration(qualifiedName.getText(), start(qualifiedName), stop(qualifiedName), start(ctx), stop(ctx));
        final ASTNode arguments = visit(ctx.parameters());
        methodDeclaration.acceptArguments(arguments.getChilds());
        return methodDeclaration;
    }


    @Override
    public ASTNode visitNname(NnameContext ctx) {
        final List<String> entries = new ArrayList<>();
        final List<TerminalNode> nodes = ctx.ID();
        for (TerminalNode node : nodes) {
            entries.add(node.getText());
        }
        return new QualifiedName(entries, start(ctx), stop(ctx));
    }

    @Override
    public ASTNode visitGeneralFunctionDeclaration(GeneralFunctionDeclarationContext ctx) {
        final QualifiedName qualifiedName = (QualifiedName) visit(ctx.name());
        final MethodDeclaration methodDeclaration = new MethodDeclaration(qualifiedName.getText(), start(qualifiedName), stop(qualifiedName), start(ctx), stop(ctx));
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

    //    todo reference type rather than name
    @Override
    public ASTNode visitNamedTypedParam(NamedTypedParamContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final SimpleReference reference = new SimpleReference(start(name), stop(name), name.getText());
        return new Argument(reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
    }

    //    todo reference type rather than name
    @Override
    public ASTNode visitNamedParam(NamedParamContext ctx) {
        final Token name = ctx.ID().getSymbol();
        final SimpleReference reference = new SimpleReference(start(name), stop(name), name.getText());
        return new Argument(reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
    }

    @Override
    public ASTNode visitAnonymousTypedParam(AnonymousTypedParamContext ctx) {
        final ASTNode reference = visit(ctx.typeExpression());
        return new Argument((SimpleReference) reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
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
