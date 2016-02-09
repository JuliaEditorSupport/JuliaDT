package com.juliacomputing.jldt.eclipse.internal.parser;

import org.eclipse.dltk.compiler.IElementRequestor;
import org.eclipse.dltk.compiler.SourceElementRequestVisitor;

public class JuliaSourceElementRequestor extends SourceElementRequestVisitor {

  public JuliaSourceElementRequestor(IElementRequestor requesor) {
    super(requesor);
  }

}
