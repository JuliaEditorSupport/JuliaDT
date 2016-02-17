package com.juliacomputing.jldt.eclipse.launch;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class JuliaLaunchPlugin extends Plugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.launch"; //$NON-NLS-1$

  private static JuliaLaunchPlugin plugin;

  public JuliaLaunchPlugin() {
    plugin = this;
  }

  public static JuliaLaunchPlugin getDefault() {
    return plugin;
  }

  public static String getUniqueIdentifier() {
    return ID;
  }

  public static void log(IStatus status) {
    getDefault().getLog().log(status);
  }

  public static void log(String message) {
    log(new Status(IStatus.ERROR, getUniqueIdentifier(), IStatus.ERROR, message, null));
  }

  public static void log(Throwable e) {
    log(new Status(IStatus.ERROR, getUniqueIdentifier(), IStatus.ERROR, e.getMessage(), e));
  }

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }
}
