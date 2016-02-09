package com.juliacomputing.jldt.eclipse.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaUIPlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.ui"; //$NON-NLS-1$

  private static JuliaUIPlugin instance;

  public JuliaUIPlugin() {
  }

  public static JuliaUIPlugin getDefault() {
    return instance;
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