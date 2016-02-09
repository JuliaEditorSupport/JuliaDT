package com.juliacomputing.jldt.eclipse.internal.ui;

import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.ui.AbstractDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;

import com.juliacomputing.jldt.eclipse.core.JuliaLanguageToolkit;
import com.juliacomputing.jldt.eclipse.ui.JuliaUIPlugin;
import com.juliacomputing.jldt.eclipse.ui.editor.JuliaSourceViewerConfiguration;

public class JuliaUILanguageToolkit extends AbstractDLTKUILanguageToolkit {

  public IPreferenceStore getPreferenceStore() {
    return JuliaUIPlugin.getDefault().getPreferenceStore();
  }

  public IDLTKLanguageToolkit getCoreToolkit() {
    return JuliaLanguageToolkit.getDefault();
  }

  public ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
    return new JuliaSourceViewerConfiguration(getTextTools().getColorManager(),
        getPreferenceStore(), null, getPartitioningId());
  }
}
