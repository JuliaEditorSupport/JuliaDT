package com.juliacomputing.jldt.eclipse.internal.parser;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;

import org.eclipse.dltk.compiler.SourceElementRequestVisitor;
import org.eclipse.dltk.core.AbstractSourceElementParser;

public class JuliaSourceElementParser extends AbstractSourceElementParser {

  protected SourceElementRequestVisitor createVisitor() {
    return new JuliaSourceElementRequestor(getRequestor());
  }

  @Override
  protected String getNatureId() {
    return JuliaNature.ID;
  }

}
