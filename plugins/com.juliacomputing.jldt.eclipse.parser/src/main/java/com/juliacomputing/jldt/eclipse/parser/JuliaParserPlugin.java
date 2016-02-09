package com.juliacomputing.jldt.eclipse.parser;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class JuliaParserPlugin extends Plugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.parser";

  private static JuliaParserPlugin instance;

  public JuliaParserPlugin() {
  }

  public static JuliaParserPlugin getDefault() {
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