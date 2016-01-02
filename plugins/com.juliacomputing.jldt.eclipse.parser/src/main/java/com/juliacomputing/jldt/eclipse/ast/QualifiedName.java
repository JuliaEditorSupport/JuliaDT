package com.juliacomputing.jldt.eclipse.ast;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.expressions.Expression;

import java.util.List;
import java.util.stream.Collectors;


public class QualifiedName extends Expression {

    private final List<String> entries;

    public QualifiedName(List<String> entries, int start, int stop) {
        super(start, stop);
        this.entries = entries;
    }


    @Override
    public int getKind() {
        return 0;
    }

    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        if (visitor.visit(this)) {
            visitor.endvisit(this);
        }
    }

    public String getText() {
        return entries.stream().collect(Collectors.joining("."));
    }
}
