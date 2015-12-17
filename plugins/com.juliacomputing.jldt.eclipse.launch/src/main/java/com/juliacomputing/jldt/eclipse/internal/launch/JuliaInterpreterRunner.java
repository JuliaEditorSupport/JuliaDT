package com.juliacomputing.jldt.eclipse.internal.launch;

import com.juliacomputing.jldt.eclipse.launch.JuliaLaunchConfigurationConstants;
import org.eclipse.dltk.launching.AbstractInterpreterRunner;
import org.eclipse.dltk.launching.IInterpreterInstall;

public class JuliaInterpreterRunner extends AbstractInterpreterRunner {
    public JuliaInterpreterRunner(IInterpreterInstall install) {
        super(install);
    }

    protected String getProcessType() {
        return JuliaLaunchConfigurationConstants.ID_JULIA_PROCESS_TYPE;
    }
}
