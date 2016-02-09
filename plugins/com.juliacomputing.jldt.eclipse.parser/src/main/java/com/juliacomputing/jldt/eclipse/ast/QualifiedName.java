package com.juliacomputing.jldt.eclipse.ast;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.references.SimpleReference;

import java.util.List;

public class QualifiedName extends SimpleReference {

  public static final String UNDEFINED = "undefined";

  public QualifiedName(List<String> entries, int start, int stop) {
    super(start, stop, join(entries));
  }

  private static String join(final List<String> entries) {
    final StringBuilder builder = new StringBuilder();
    if (entries.isEmpty())
      return UNDEFINED;
    builder.append(entries.get(0));
    for (int i = 1; i < entries.size(); i++) {
      builder.append(".");
      builder.append(entries.get(i));
    }
    return builder.toString();
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
