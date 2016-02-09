package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;

import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.jface.preference.IPreferenceStore;

public class JuliaTemplateAccess extends ScriptTemplateAccess {

  private static final String CUSTOM_TEMPLATES_KEY = "com.juliacomputing.jldt.eclipse.Templates";

  private static JuliaTemplateAccess instance;

  public static JuliaTemplateAccess getInstance() {
    if (instance == null) {
      instance = new JuliaTemplateAccess();
    }

    return instance;
  }

  protected String getContextTypeId() {
    return JuliaUniversalTemplateContextType.CONTEXT_TYPE_ID;
  }

  protected String getCustomTemplatesKey() {
    return CUSTOM_TEMPLATES_KEY;
  }

  protected IPreferenceStore getPreferenceStore() {
    return JuliaEditorPlugin.getDefault().getPreferenceStore();
  }
}
