package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.ScriptRuntime;
import org.eclipse.swt.widgets.Display;

public class JuliaREPLLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

  public void launch(final ILaunchConfiguration configuration, String mode, ILaunch launch,
      IProgressMonitor monitor) throws CoreException {
    final IInterpreterInstall interpreterInstall = ScriptRuntime
        .computeInterpreterInstall(configuration);
    monitor.setCanceled(true);
    Display.getDefault().asyncExec(new Runnable() {
      public void run() {
        final JuliaConsoleFactory consoleFactory = new JuliaConsoleFactory(
                interpreterInstall);
        consoleFactory.openConsole();
      }
    });
  }
}
