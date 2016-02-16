package com.juliacomputing.jldt.eclipse.ast;

import org.eclipse.dltk.ast.references.SimpleReference;

public class Symbol extends SimpleReference {

  public Symbol(int start, int end, String name) {
    super(start, end, name);
  }
}
