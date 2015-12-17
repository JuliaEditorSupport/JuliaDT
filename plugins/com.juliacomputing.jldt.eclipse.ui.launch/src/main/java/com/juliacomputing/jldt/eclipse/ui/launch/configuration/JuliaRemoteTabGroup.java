package com.juliacomputing.jldt.eclipse.ui.launch.configuration;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class JuliaRemoteTabGroup extends AbstractLaunchConfigurationTabGroup {

    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {

        this.setTabs(new ILaunchConfigurationTab[]{
                new JuliaRemoteLaunchConfigurationTab(mode), new CommonTab()});

    }

}
