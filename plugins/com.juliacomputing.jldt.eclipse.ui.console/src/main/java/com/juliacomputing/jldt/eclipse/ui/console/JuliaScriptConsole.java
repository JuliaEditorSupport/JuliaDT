package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.ui.ScriptConsole;

public class JuliaScriptConsole extends ScriptConsole {

  public JuliaScriptConsole(String consoleName, String consoleType) {
    super(consoleName, consoleType, null);
  }

  @Override
  public void setInterpreter(IScriptInterpreter interpreter) {
    super.setInterpreter(interpreter);
  }

}
