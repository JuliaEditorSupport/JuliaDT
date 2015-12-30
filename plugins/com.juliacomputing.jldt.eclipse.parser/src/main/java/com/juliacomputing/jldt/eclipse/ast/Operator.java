package com.juliacomputing.jldt.eclipse.ast;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

public class Operator extends Expression {

    private final String symbol;
    private final Expression[] operands;


    public Operator(String symbol, int start, int end, Expression... operands) {
        super(start, end);
        this.symbol = symbol;
        this.operands = operands;
    }

    @Override
    public int getKind() {
        return 0;
    }

    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        if (visitor.visit(this)) {
            for (Expression expression : this.operands) {
                expression.traverse(visitor);
            }
            visitor.endvisit(this);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public Expression[] getOperands() {
        return operands;
    }

}
