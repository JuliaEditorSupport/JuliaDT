package com.juliacomputing.jldt.eclipse.internal.ui;


import com.juliacomputing.jldt.eclipse.core.JuliaLanguageToolkit;
import com.juliacomputing.jldt.eclipse.ui.JuliaUI;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.jface.preference.IPreferenceStore;

public class JuliaUILanguageToolkit extends AbstractDLTKUILanguageToolkit {


    public IPreferenceStore getPreferenceStore() {
        return JuliaUI.getDefault().getPreferenceStore();
    }

    public IDLTKLanguageToolkit getCoreToolkit() {
        return JuliaLanguageToolkit.getDefault();
    }

}
