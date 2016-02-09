package com.juliacomputing.jldt.eclipse.internal.ui.preferences;

import org.eclipse.dltk.ui.preferences.ScriptCorePreferencePage;

import com.juliacomputing.jldt.eclipse.ui.JuliaUIPlugin;

public class JuliaPreferences extends ScriptCorePreferencePage {

  protected String getHelpId() {
    return null;
  }

  protected void setDescription() {
    setDescription("General Julia Preferences");
  }

  protected void setPreferenceStore() {
    setPreferenceStore(JuliaUIPlugin.getDefault().getPreferenceStore());
  }
}