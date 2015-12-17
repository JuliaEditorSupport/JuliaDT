package com.juliacomputing.jldt.eclipse.core;


import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class JuliaPlugin extends Plugin {

    public static final String ID = "com.juliacomputing.jldt.eclipse.core";

    private static JuliaPlugin instance;

    public static JuliaPlugin getDefault() {
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
