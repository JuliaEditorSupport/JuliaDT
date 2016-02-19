package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.ScriptConsolePrompt;
import org.eclipse.dltk.console.ui.IScriptConsole;
import org.eclipse.dltk.console.ui.ScriptConsoleFactoryBase;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.ScriptRuntime;

public class JuliaConsoleFactory extends ScriptConsoleFactoryBase {

  private static final String CONSOLE_NAME = "Julia REPL";
  private static final String JULIA_INSTALLATION_TYPE = "org.eclipse.dltk.internal.debug.ui.launcher.JuliaInterpreterInstallationType";

  @Override
  protected IScriptConsole createConsoleInstance() {

//    final IInterpreterInstall interpreterInstall = ScriptRuntime.computeInterpreterInstall(configuration);


    final IInterpreterInstallType installType = ScriptRuntime
        .getInterpreterInstallType(JULIA_INSTALLATION_TYPE);
    final IInterpreterInstall[] interpreterInstalls = installType.getInterpreterInstalls();
    final IFileHandle location = interpreterInstalls[0].getInstallLocation();
    final JuliaScriptConsole console = new JuliaScriptConsole(CONSOLE_NAME, "interactive");
    console.setInterpreter(new JuliaConsoleInterpreter(location.getCanonicalPath()));
    console.setPrompt(new ScriptConsolePrompt("julia>", "/"));
    return console;
  }
}
