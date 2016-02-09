package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;

import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;

public class JuliaContentAssistPreference extends ContentAssistPreference {

  private static JuliaContentAssistPreference instance;

  public static ContentAssistPreference getDefault() {
    if (instance == null) {
      instance = new JuliaContentAssistPreference();
    }
    return instance;
  }

  protected ScriptTextTools getTextTools() {
    return JuliaEditorPlugin.getDefault().getTextTools();
  }
}