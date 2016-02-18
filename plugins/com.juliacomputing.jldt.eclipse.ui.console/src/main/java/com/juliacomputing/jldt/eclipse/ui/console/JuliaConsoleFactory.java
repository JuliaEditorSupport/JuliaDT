package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleFactoryBase;
import org.eclipse.dltk.launching.IInterpreterInstall;

public class JuliaConsoleFactory extends ScriptConsoleFactoryBase {

  private static final String CONSOLE_NAME = "Julia REPL";
  private final IInterpreterInstall interpreter;

  public JuliaConsoleFactory(final IInterpreterInstall interpreter) {
    this.interpreter = interpreter;
  }

  @Override
  protected IScriptConsole createConsoleInstance() {
    final JuliaScriptConsole console = new JuliaScriptConsole(CONSOLE_NAME, "interactive");
    console.setInterpreter(new JuliaConsoleInterpreter(interpreter.getInstallLocation()
        .getCanonicalPath()));
    console.setPrompt(new ScriptConsolePrompt("julia>", "/"));
    return console;
  }
}
