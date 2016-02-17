package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleFactoryBase;

public class JuliaConsoleFactory extends ScriptConsoleFactoryBase {

  @Override
  protected IScriptConsole createConsoleInstance() {
    return new JuliaScriptConsole("Julia REPL", "interactive");
  }
}
