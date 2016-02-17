package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;

import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;

public class JuliaContentAssistPreference extends ContentAssistPreference {

  private static JuliaContentAssistPreference instance = new JuliaContentAssistPreference();

  public static ContentAssistPreference getDefault() {
    return instance;
  }

  protected ScriptTextTools getTextTools() {
    return JuliaEditorPlugin.getDefault().getTextTools();
  }
}