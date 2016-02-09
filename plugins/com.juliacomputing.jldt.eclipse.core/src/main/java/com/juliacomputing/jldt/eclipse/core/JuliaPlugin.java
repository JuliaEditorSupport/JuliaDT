package com.juliacomputing.jldt.eclipse.core;

//import com.juliacomputing.jldt.kernel.api.Kernel;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

//import org.osgi.framework.ServiceReference;

public class JuliaPlugin extends Plugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.core";

  private static JuliaPlugin instance;

  public static JuliaPlugin getDefault() {
    return instance;
  }

  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
    // final ServiceReference<?> serviceReference =
    // context.getServiceReference(Kernel.class.getName());
    // final Kernel service = (Kernel) context.getService(serviceReference);
  }

  public void stop(BundleContext context) throws Exception {
    instance = null;
    super.stop(context);
  }

}
