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

  private static final String[] EXECUTABLES = { "julia" };
  private static final String JULIA_BASE = "share/julia/base";
  private static final String NAME = "Generic Julia Installation";

  public String getNatureId() {
    return JuliaNature.ID;
  }

  public String getName() {
    return NAME; //$NON-NLS-1$
  }

  @Override
  public LibraryLocation[] getDefaultLibraryLocations(IFileHandle installLocation,
      EnvironmentVariable[] variables, IProgressMonitor monitor) {
    return getLibraryLocations(installLocation);
  }

  @Override
  protected String getPluginId() {
    return JuliaLaunchPlugin.ID;
  }

  @Override
  protected String[] getPossibleInterpreterNames() {
    return EXECUTABLES;
  }

  @Override
  protected IInterpreterInstall doCreateInterpreterInstall(String id) {
    return new JuliaInterpreterInstall(this, id);
  }

  @Override
  protected IPath createPathFile(IDeployment deployment) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  protected ILog getLog() {
    return JuliaLaunchPlugin.getDefault().getLog();
  }

  @Override
  public synchronized LibraryLocation[] getDefaultLibraryLocations(IFileHandle installLocation) {
    return getLibraryLocations(installLocation);
  }

  private LibraryLocation[] getLibraryLocations(IFileHandle installLocation) {
    return new LibraryLocation[0];
    // final File library = new File(Path.fromOSString(installLocation.getCanonicalPath()).toFile()
    // .getParentFile().getParentFile(), JULIA_BASE);
    // return new LibraryLocation[] { new LibraryLocation(new Path(library.getPath())) };
  }
}
