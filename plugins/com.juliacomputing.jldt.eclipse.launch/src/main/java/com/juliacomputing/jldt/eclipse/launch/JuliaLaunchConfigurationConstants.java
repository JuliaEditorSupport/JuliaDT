package com.juliacomputing.jldt.eclipse.launch;

import org.eclipse.dltk.launching.ScriptLaunchConfigurationConstants;

public final class JuliaLaunchConfigurationConstants extends ScriptLaunchConfigurationConstants {

  public static final String DEFAULT_CONFIGURATION = "com.juliacomputing.jldt.eclipse.launch.JuliaLaunchConfigurationType"; //$NON-NLS-1$
  public static final String REPL_CONFIGURATION = "com.juliacomputing.jldt.eclipse.ui.console.interactiveConsoleConfigurationType"; //$NON-NLS-1$
  public static final String ID_JULIA_PROCESS_TYPE = "juliaInterpreter"; //$NON-NLS-1$

  private JuliaLaunchConfigurationConstants() {

  }
}
