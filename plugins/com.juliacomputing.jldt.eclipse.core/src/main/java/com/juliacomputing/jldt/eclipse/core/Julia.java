package com.juliacomputing.jldt.eclipse.core;

/**
 * Julia definitions todo extract to a separate Declarative Service
 */
public enum Julia {
  ;

  private static final String[] KEYWORDS = { "begin", "new", "while", "if", "else", "elseif", "for",
      "try", "catch", "finally", "return", "break", "continue", "function", "macro", "quote", "let",
      "local", "global", "const", "abstract", "typealias", "type", "bitstype", "immutable", "ccall",
      "do", "module", "baremodule", "using", "import", "export", "importall", "end", "in" };

  public static String[] keywords() {
    return KEYWORDS;
  }
}
