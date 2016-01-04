package com.juliacomputing.jldt.eclipse.ast;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.SimpleReference;

import java.util.List;
import java.util.stream.Collectors;


public class QualifiedName extends SimpleReference {

    public QualifiedName(List<String> entries, int start, int stop) {
        super(start, stop, entries.stream().collect(Collectors.joining(".")));
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
}
