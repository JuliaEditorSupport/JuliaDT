package com.juliacomputing.jldt.eclipse.launch;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.launching.IInterpreterRunner;
import org.eclipse.dltk.launching.InterpreterConfig;

public class JuliaLaunchConfigurationDelegate extends AbstractScriptLaunchConfigurationDelegate {

    @Override
    public String getLanguageId() {
        return JuliaNature.ID;
    }


    protected void runRunner(ILaunchConfiguration configuration,
                             IInterpreterRunner runner, InterpreterConfig config,
                             ILaunch launch, IProgressMonitor monitor) throws CoreException {
        runner.run(config, launch, monitor);
    }

    @Override
    protected InterpreterConfig createInterpreterConfig(ILaunchConfiguration configuration, ILaunch launch) throws CoreException {
        return super.createInterpreterConfig(configuration, launch);
    }

    @Override
    public IInterpreterRunner getInterpreterRunner(ILaunchConfiguration configuration, String mode) throws CoreException {
        return super.getInterpreterRunner(configuration, mode);
    }
}
