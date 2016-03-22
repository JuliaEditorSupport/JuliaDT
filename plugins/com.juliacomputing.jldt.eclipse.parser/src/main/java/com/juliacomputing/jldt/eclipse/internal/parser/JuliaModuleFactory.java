package com.juliacomputing.jldt.eclipse.internal.parser;

import com.juliacomputing.jldt.eclipse.ast.Operator;
import com.juliacomputing.jldt.eclipse.ast.QualifiedName;
import com.juliacomputing.jldt.eclipse.ast.Symbol;

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
import org.eclipse.dltk.ast.expressions.BigNumericLiteral;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.ast.references.TypeReference;
import org.eclipse.dltk.ast.statements.Block;
import org.julia.lang.parser.JuliaBaseVisitor;
import org.julia.lang.parser.JuliaParser.*;

import java.util.ArrayList;
import java.util.List;

public class JuliaModuleFactory extends JuliaBaseVisitor<ASTNode> {

  public ModuleDeclaration create(UnitContext context) {
    return visitUnit(context);
  }

  @Override
  public ASTNode visitStatementList(StatementListContext ctx) {
    return toStatements(ctx.statement());
  }

  @Override
  public ASTNode visitStatementSequence(StatementSequenceContext ctx) {
    return toStatements(ctx.statement());
  }

  private ASTNode toStatements(List<StatementContext> statementContexts) {
    final ASTListNode statements = new ASTListNode();
    for (StatementContext statementContext : statementContexts) {
      final ASTNode statement = visit(statementContext);
      if (statement == null)
        continue;
      statements.addNode(statement);
    }
    return statements;
  }

  @Override
  public ModuleDeclaration visitUnit(UnitContext ctx) {
    final ModuleDeclaration moduleDeclaration = new ModuleDeclaration(ctx.getText().length());
    final ASTNode statements = visit(ctx.block());
    if (statements != null)
      moduleDeclaration.setStatements(statements.getChilds());
    return moduleDeclaration;
  }

  @Override
  public ASTNode visitModule(ModuleContext ctx) {
    final ModuleDeclaration moduleDeclaration = new ModuleDeclaration(ctx.getText().length());
    final ASTNode statements = visit(ctx.block());
    moduleDeclaration.setStatements(statements.getChilds());
    return moduleDeclaration;
  }

  @Override
  public ASTNode visitBareModule(BareModuleContext ctx) {
    return visit(ctx.block());
  }

  @Override
  public ASTNode visitPlus(PlusContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator("+", start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitRelational(RelationalContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator(ctx.RELATIONAL_OPERATOR().getText(), start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitTimes(TimesContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator("*", start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitDot(DotContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator(".", start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitMultiplicative(MultiplicativeContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator(ctx.MULTIPLICATIVE_OPERATOR().getText(), start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitBitShift(BitShiftContext ctx) {
    final Expression[] operands = new Expression[ctx.exp().size()];
    for (int i = 0; i < operands.length; i++) {
      operands[i] = (Expression) visit(ctx.exp(i));
    }
    return new Operator(ctx.BIT_SHIFT_OPERATOR().getText(), start(ctx), stop(ctx), operands);
  }

  @Override
  public ASTNode visitAbstractType(AbstractTypeContext ctx) {
    final Token type = ctx.ID(0).getSymbol();
    final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type),
        stop(type), start(ctx), stop(ctx));
    typeDeclaration.setModifier(Modifiers.AccAbstract);
    if (ctx.SUB_TYPE() != null) {
      final Token superType = ctx.ID(1).getSymbol();
      final TypeReference typeReference = new TypeReference(start(superType), stop(superType),
          superType.getText());
      typeDeclaration.addSuperClass(typeReference);
    }
    return typeDeclaration;
  }

  @Override
  public ASTNode visitTypedFieldDeclaration(TypedFieldDeclarationContext ctx) {
    final Token name = ctx.ID().getSymbol();
    return new TypeDeclaration(name.getText(), start(name), stop(name), start(ctx), stop(ctx));
  }

  @Override
  public ASTNode visitUntypedFieldDeclaration(UntypedFieldDeclarationContext ctx) {
    final Token name = ctx.ID().getSymbol();
    return new TypeDeclaration(name.getText(), start(name), stop(name), start(ctx), stop(ctx));
  }

  @Override
  public ASTNode visitImmutableTypeDeclaration(ImmutableTypeDeclarationContext ctx) {
    final Token type = ctx.ID(0).getSymbol();
    final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type),
        stop(type), start(ctx), stop(ctx));
    if (ctx.ID(1) != null) {
      final Token superType = ctx.ID(1).getSymbol();
      final TypeReference typeReference = new TypeReference(start(superType), stop(superType),
          superType.getText());
      typeDeclaration.addSuperClass(typeReference);
    }
    final Block block = new Block();
    final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
    for (FieldDeclarationContext field : fields) {
      block.addStatement(visit(field));
    }
    typeDeclaration.setBody(block);
    return typeDeclaration;
  }

  @Override
  public ASTNode visitApplyFunction(ApplyFunctionContext ctx) {
    final QualifiedName qualifiedName = (QualifiedName) visit(ctx.name());
    return new CallExpression(start(ctx.name()), stop(ctx.name()), null, qualifiedName.getName(),
        null);
  }

  @Override
  public ASTNode visitMutableTypeDeclaration(MutableTypeDeclarationContext ctx) {
    final Token type = ctx.ID(0).getSymbol();
    final TypeDeclaration typeDeclaration = new TypeDeclaration(type.getText(), start(type),
        stop(type), start(ctx), stop(ctx));
    if (ctx.SUB_TYPE() != null) {
      final Token superType = ctx.ID(1).getSymbol();
      final TypeReference typeReference = new TypeReference(start(superType), stop(superType),
          superType.getText());
      typeDeclaration.addSuperClass(typeReference);
    }
    final Block block = new Block();
    final List<FieldDeclarationContext> fields = ctx.fieldDeclaration();
    for (FieldDeclarationContext field : fields) {
      block.addStatement(visit(field));
    }
    typeDeclaration.setBody(block);
    return typeDeclaration;
  }

  @Override
  public ASTNode visitFfloat32(Ffloat32Context ctx) {
    return new TypeReference(start(ctx), stop(ctx), ctx.getText());
  }

  @Override
  public ASTNode visitUnionType(UnionTypeContext ctx) {
    return new TypeReference(start(ctx), stop(ctx), ctx.getText());
  }

  @Override
  public ASTNode visitParametricType(ParametricTypeContext ctx) {
    return new TypeReference(start(ctx), stop(ctx), ctx.getText());
  }

  @Override
  public ASTNode visitTypeAlias(TypeAliasContext ctx) {
    final Token alias = ctx.ID().getSymbol();
    final ASTNode type = visit(ctx.typeExpression());
    final TypeDeclaration typeDeclaration = new TypeDeclaration(ctx.ID().getText(), start(alias),
        stop(alias), start(ctx), stop(ctx));
    typeDeclaration.addSuperClass(type);
    return typeDeclaration;
  }

  @Override
  public ASTNode visitCompactFunctionDeclaration(CompactFunctionDeclarationContext ctx) {
    final SimpleReference reference = (SimpleReference) visit(ctx.fnID());
    final MethodDeclaration methodDeclaration = new MethodDeclaration(reference.getName(),
        start(reference), stop(reference), start(ctx), stop(ctx));
    final ASTNode arguments = visit(ctx.parameters());
    methodDeclaration.acceptArguments(arguments.getChilds());
    return methodDeclaration;
  }

  @Override
  public ASTNode visitGeneralFunctionDeclaration(GeneralFunctionDeclarationContext ctx) {
    final SimpleReference reference = (SimpleReference) visit(ctx.fnID());
    final MethodDeclaration methodDeclaration = new MethodDeclaration(reference.getName(),
        start(reference), stop(reference), start(ctx), stop(ctx));
    final ASTNode arguments = visit(ctx.parameters());
    methodDeclaration.acceptArguments(arguments.getChilds());
    return methodDeclaration;
  }

  @Override
  public ASTNode visitFunctionName(FunctionNameContext ctx) {
    return visit(ctx.name());
  }

  @Override
  public ASTNode visitFunctionSymbol(FunctionSymbolContext ctx) {
    return visit(ctx.operator());
  }

  @Override
  public ASTNode visitOperator(OperatorContext ctx) {
    return new SimpleReference(start(ctx), stop(ctx), ctx.getText());
  }

  @Override
  public ASTNode visitParenthesisedFnID(ParenthesisedFnIDContext ctx) {
    return visit(ctx.fnID());
  }

  @Override
  public ASTNode visitName(NameContext ctx) {
    final List<String> entries = new ArrayList<>();
    final List<TerminalNode> nodes = ctx.ID();
    for (TerminalNode node : nodes) {
      entries.add(node.getText());
    }
    return new QualifiedName(entries, start(ctx), stop(ctx));
  }

  @Override
  public ASTNode visitIdentifier(IdentifierContext ctx) {
    return new SimpleReference(start(ctx), stop(ctx), ctx.getText());
  }

  @Override
  public ASTNode visitPredefinedType(PredefinedTypeContext ctx) {
    return new TypeReference(start(ctx), stop(ctx), ctx.getText());
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

  // todo reference type rather than name
  @Override
  public ASTNode visitNamedTypedParam(NamedTypedParamContext ctx) {
    SimpleReference type = (SimpleReference) visit(ctx.typeExpression());
    return new Argument(type, start(ctx), stop(ctx), null, Modifiers.AccPublic);
  }

  // todo reference type rather than name
  @Override
  public ASTNode visitNamedParam(NamedParamContext ctx) {
    final Token name = ctx.ID().getSymbol();
    final SimpleReference reference = new SimpleReference(start(name), stop(name), name.getText());
    return new Argument(reference, start(ctx), stop(ctx), null, Modifiers.AccPublic);
  }

  @Override
  public ASTNode visitAnonymousTypedParam(AnonymousTypedParamContext ctx) {
    SimpleReference type = (SimpleReference) visit(ctx.typeExpression());
    return new Argument(type, start(ctx), stop(ctx), null, Modifiers.AccPublic);
  }

  @Override
  public ASTNode visitInt(IntContext ctx) {
    return new BigNumericLiteral(start(ctx), stop(ctx), ctx.INT_LITERAL().getText()
        .replace("_", ""), 10);
  }

  @Override
  public ASTNode visitHex(HexContext ctx) {
    return new BigNumericLiteral(start(ctx), stop(ctx), ctx.getText().substring(2).replace("_", "")
        .trim(), 16);
  }

  @Override
  public ASTNode visitSymbol(SymbolContext ctx) {
    return new Symbol(start(ctx), stop(ctx), ctx.getText());
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
