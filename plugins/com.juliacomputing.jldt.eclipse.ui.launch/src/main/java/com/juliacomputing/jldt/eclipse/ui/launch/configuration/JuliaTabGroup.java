package com.juliacomputing.jldt.eclipse.ui.launch.configuration;

import org.eclipse.debug.ui.*;
import org.eclipse.dltk.debug.ui.launchConfigurations.InterpreterTab;
import org.eclipse.dltk.debug.ui.launchConfigurations.ScriptArgumentsTab;

public class JuliaTabGroup extends AbstractLaunchConfigurationTabGroup {
  @Override
  public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
    JuliaMainLaunchConfigurationTab main = new JuliaMainLaunchConfigurationTab(mode);
    ILaunchConfigurationTab[] tabs = { main, new ScriptArgumentsTab(), new InterpreterTab(main),
        new EnvironmentTab(), new CommonTab() };

    setTabs(tabs);
  }
}
