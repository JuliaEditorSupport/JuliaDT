package com.juliacomputing.jldt.eclipse.ui.launch;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaUILaunchPlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.ui.launch";

  private static JuliaUILaunchPlugin instance;

  public static JuliaUILaunchPlugin getDefault() {
    return JuliaUILaunchPlugin.instance;
  }

  public void start(BundleContext context) throws Exception {
    super.start(context);
    JuliaUILaunchPlugin.instance = this;
  }

  public void stop(BundleContext context) throws Exception {
    JuliaUILaunchPlugin.instance = null;
    super.stop(context);
  }
}
