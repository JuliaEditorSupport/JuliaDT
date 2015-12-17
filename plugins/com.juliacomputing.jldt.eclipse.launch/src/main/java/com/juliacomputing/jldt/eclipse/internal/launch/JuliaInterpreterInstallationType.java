package com.juliacomputing.jldt.eclipse.internal.launch;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.launching.EnvironmentVariable;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.LibraryLocation;

import java.io.IOException;

public class JuliaInterpreterInstallationType extends AbstractInterpreterInstallType {
    private static final String[] EXECUTABLES = {"julia"};

    public String getNatureId() {
        return JuliaNature.ID;
    }

    public String getName() {
        return "Generic Julia Installation"; //$NON-NLS-1$
    }

    public LibraryLocation[] getDefaultLibraryLocations(
            IFileHandle installLocation, EnvironmentVariable[] variables,
            IProgressMonitor monitor) {
        return new LibraryLocation[0];
    }

    protected String getPluginId() {
        return JuliaLaunchPlugin.ID;
    }

    protected String[] getPossibleInterpreterNames() {
        return JuliaInterpreterInstallationType.EXECUTABLES;
    }

    protected IInterpreterInstall doCreateInterpreterInstall(String id) {
        return new JuliaInterpreterInstall(this, id);
    }

    protected IPath createPathFile(IDeployment deployment) throws IOException {
        throw new UnsupportedOperationException();
    }

    protected ILog getLog() {
        return JuliaLaunchPlugin.getDefault().getLog();
    }
}
