package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.swt.widgets.Display;

public class JuliaREPLLaunchConfigurationDelegate extends LaunchConfigurationDelegate {

  public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch,
      IProgressMonitor monitor) throws CoreException {
    monitor.setCanceled(true);
    Display.getDefault().asyncExec(new Runnable() {
      public void run() {
        final JuliaConsoleFactory consoleFactory = new JuliaConsoleFactory();
        consoleFactory.openConsole();
      }
    });
  }

}
