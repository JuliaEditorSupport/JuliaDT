package com.juliacomputing.jldt.eclipse.ui.editor;


import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaTextTools;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class JuliaEditorPlugin extends AbstractUIPlugin {

    public static final String ID = "com.juliacomputing.jldt.eclipse.editor"; //$NON-NLS-1$

    private static JuliaEditorPlugin instance;
    private JuliaTextTools textTools;

    public static JuliaEditorPlugin getDefault() {
        return JuliaEditorPlugin.instance;
    }

    public static String getUniqueIdentifier() {
        return JuliaEditorPlugin.ID;
    }

    public static void log(IStatus status) {
        JuliaEditorPlugin.getDefault().getLog().log(status);
    }

    public static void log(String message) {
        JuliaEditorPlugin.log(new Status(IStatus.ERROR, JuliaEditorPlugin.getUniqueIdentifier(), IStatus.ERROR, message, null));
    }

    public static void log(Throwable e) {
        JuliaEditorPlugin.log(new Status(IStatus.ERROR, JuliaEditorPlugin.getUniqueIdentifier(), IStatus.ERROR, e.getMessage(), e));
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);
        JuliaEditorPlugin.instance = this;
    }

    public void stop(BundleContext context) throws Exception {
        JuliaEditorPlugin.instance = null;
        super.stop(context);
    }

    public synchronized JuliaTextTools getTextTools() {
        if (this.textTools == null)
            this.textTools = new JuliaTextTools(true);
        return this.textTools;
    }


}
