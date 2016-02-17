package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaConsolePlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.ui.console.JuliaConsolePlugin";

  private static JuliaConsolePlugin instance;

  public static JuliaConsolePlugin getDefault() {
    return instance;
  }

  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
  }

  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    instance = null;
  }
}