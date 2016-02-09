package com.juliacomputing.jldt.eclipse.internal.parser;

import org.eclipse.dltk.ast.parser.ISourceParser;
import org.eclipse.dltk.ast.parser.ISourceParserFactory;

public class JuliaSourceParserFactory implements ISourceParserFactory {

  public ISourceParser createSourceParser() {
    return new JuliaEclipseParser();
  }

}