package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.ScriptConsole;
import org.eclipse.jface.resource.ImageDescriptor;

public class JuliaScriptConsole extends ScriptConsole {

  public JuliaScriptConsole(String consoleName, String consoleType, ImageDescriptor image) {
    super(consoleName, consoleType, image);
    setInterpreter(new JuliaConsoleInterpreter());
    setPrompt(new ScriptConsolePrompt("julia>", "/"));
  }

  public JuliaScriptConsole(String consoleName, String consoleType) {
    super(consoleName, consoleType, null);
    setInterpreter(new JuliaConsoleInterpreter());
    setPrompt(new ScriptConsolePrompt("julia>", "/"));
  }
}
