package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.swt.widgets.Display;

import java.io.File;

public class JuliaREPLLaunchConfigurationDelegate extends AbstractScriptLaunchConfigurationDelegate {

  public void launch(final ILaunchConfiguration configuration, String mode, ILaunch launch,
      IProgressMonitor monitor) throws CoreException {

    monitor.setCanceled(true);

    final String workingDirectory = getProjectLocation(configuration);
    final String source = getSourceModule(configuration).getElementName();
    final String script = new File(workingDirectory, source).getAbsolutePath();

    Display.getDefault().asyncExec(new Runnable() {
      public void run() {
        final JuliaConsoleFactory consoleFactory = new JuliaConsoleFactory();
        final JuliaScriptConsole console = consoleFactory.newConsole();
        console.executeCommand(String.format("include(\"%s\")",script));
      }
    });
  }

  @Override
  public String getLanguageId() {
    return "com.juliacomputing.jldt.eclipse.core.nature";
  }
}
