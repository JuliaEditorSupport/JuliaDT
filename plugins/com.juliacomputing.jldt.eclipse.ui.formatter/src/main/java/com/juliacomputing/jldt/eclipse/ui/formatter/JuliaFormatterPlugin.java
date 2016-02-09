package com.juliacomputing.jldt.eclipse.ui.formatter;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaFormatterPlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.formatter"; //$NON-NLS-1$

  private static JuliaFormatterPlugin instance;

  public static JuliaFormatterPlugin getDefault() {
    return instance;
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

  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
  }

  public void stop(BundleContext context) throws Exception {
    instance = null;
    super.stop(context);
  }
}
