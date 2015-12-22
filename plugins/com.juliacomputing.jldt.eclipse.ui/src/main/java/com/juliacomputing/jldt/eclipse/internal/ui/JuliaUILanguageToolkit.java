package com.juliacomputing.jldt.eclipse.internal.ui;


import com.juliacomputing.jldt.eclipse.core.JuliaLanguageToolkit;
import com.juliacomputing.jldt.eclipse.ui.JuliaUI;
import com.juliacomputing.jldt.eclipse.ui.editor.JuliaSourceViewerConfiguration;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;

public class JuliaUILanguageToolkit extends AbstractDLTKUILanguageToolkit {


    public IPreferenceStore getPreferenceStore() {
        return JuliaUI.getDefault().getPreferenceStore();
    }

    public IDLTKLanguageToolkit getCoreToolkit() {
        return JuliaLanguageToolkit.getDefault();
    }

    public ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
        return new JuliaSourceViewerConfiguration(getTextTools().getColorManager(), getPreferenceStore(), null, getPartitioningId());
    }
}
