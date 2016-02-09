package com.juliacomputing.jldt.eclipse.core;

import org.eclipse.dltk.core.ScriptContentDescriber;

import java.util.regex.Pattern;

/**
 * JuliaContentDescriber
 * 
 * @see <a href="https://en.wikipedia.org/wiki/Shebang_(Unix)#Syntax">Shebang_(Unix)#Syntax</a>
 * @see <a href=
 *      "https://en.wikibooks.org/wiki/Introducing_Julia/Getting_started#Running_a_script_with_Julia">
 *      Running a script with Julia</a>
 */
public class JuliaContentDescriber extends ScriptContentDescriber {
  private static final Pattern[] HEADER_PATTERNS = { Pattern.compile(
      "^#!.*julia.*", Pattern.MULTILINE) }; //$NON-NLS-1$

  protected Pattern[] getHeaderPatterns() {
    return HEADER_PATTERNS;
  }
}
