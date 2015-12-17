package com.juliacomputing.jldt.eclipse.launch;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class JuliaLaunchPlugin extends Plugin {

    public static final String ID = "com.juliacomputing.jldt.eclipse.launch"; //$NON-NLS-1$

    private static JuliaLaunchPlugin plugin;

    public JuliaLaunchPlugin() {
        JuliaLaunchPlugin.plugin = this;
    }

    public static JuliaLaunchPlugin getDefault() {
        return JuliaLaunchPlugin.plugin;
    }

    public static String getUniqueIdentifier() {
        return JuliaLaunchPlugin.ID;
    }

    public static void log(IStatus status) {
        JuliaLaunchPlugin.getDefault().getLog().log(status);
    }

    public static void log(String message) {
        JuliaLaunchPlugin.log(new Status(IStatus.ERROR, JuliaLaunchPlugin.getUniqueIdentifier(), IStatus.ERROR,
                message, null));
    }

    public static void log(Throwable e) {
        JuliaLaunchPlugin.log(new Status(IStatus.ERROR, JuliaLaunchPlugin.getUniqueIdentifier(), IStatus.ERROR, e
                .getMessage(), e));
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
    }

    public void stop(BundleContext context) throws Exception {
        JuliaLaunchPlugin.plugin = null;
        super.stop(context);
    }
}
