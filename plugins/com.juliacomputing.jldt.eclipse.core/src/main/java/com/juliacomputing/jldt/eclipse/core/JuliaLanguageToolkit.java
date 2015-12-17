package com.juliacomputing.jldt.eclipse.core;

import org.eclipse.dltk.core.AbstractLanguageToolkit;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;

public class JuliaLanguageToolkit extends AbstractLanguageToolkit {

    protected static JuliaLanguageToolkit instance = new JuliaLanguageToolkit();

    public JuliaLanguageToolkit() {
    }

    public static IDLTKLanguageToolkit getDefault() {
        return instance;
    }

    public boolean languageSupportZIPBuildpath() {
        return false;
    }

    public String getNatureId() {
        return JuliaNature.ID;
    }

    public String getLanguageName() {
        return "Julia"; //$NON-NLS-1$
    }

    public String getLanguageContentType() {
        return "com.juliacomputing.jldt.eclipse.core.juliaContentType"; //$NON-NLS-1$
    }

    public String getPreferenceQualifier() {
        return JuliaPlugin.ID;
    }

}

