package com.juliacomputing.jldt.eclipse.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaUI extends AbstractUIPlugin {

    public static final String ID = "com.juliacomputing.jldt.eclipse.ui"; //$NON-NLS-1$

    private static JuliaUI instance;

    public JuliaUI() {
    }

    public static JuliaUI getDefault() {
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