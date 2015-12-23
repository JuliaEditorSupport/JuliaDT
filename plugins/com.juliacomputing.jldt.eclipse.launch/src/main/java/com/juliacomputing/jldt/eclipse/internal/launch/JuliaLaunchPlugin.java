package com.juliacomputing.jldt.eclipse.internal.launch;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class JuliaLaunchPlugin extends Plugin {

    public static final String ID = "com.juliacomputing.jldt.eclipse.internal.launch";

    private static JuliaLaunchPlugin instance;

    public static JuliaLaunchPlugin getDefault() {
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