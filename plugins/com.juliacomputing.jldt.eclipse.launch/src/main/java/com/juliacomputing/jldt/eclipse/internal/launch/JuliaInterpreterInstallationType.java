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
  public static final String BASE_LIBRARY = "share/julia/base"; //$NON-NLS-1$
  public static final String NAME = "Generic Julia Installation"; //$NON-NLS-1$
  private static final String[] EXECUTABLES = { "julia" }; //$NON-NLS-1$

  public String getNatureId() {
    return JuliaNature.ID;
  }

  public String getName() {
    return NAME;
  }

  public LibraryLocation[] getDefaultLibraryLocations(IFileHandle installLocation,
      EnvironmentVariable[] variables, IProgressMonitor monitor) {
    return getDefaultLibraryLocations(installLocation);
  }

  protected String getPluginId() {
    return JuliaLaunchPlugin.ID;
  }

  protected String[] getPossibleInterpreterNames() {
    return EXECUTABLES;
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

  @Override
  public synchronized LibraryLocation[] getDefaultLibraryLocations(IFileHandle installLocation) {
    return new LibraryLocation[0];
  }
}
