package com.juliacomputing.jldt.eclipse.internal.ui;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.editors.text.EditorsUI;

import com.juliacomputing.jldt.eclipse.ui.JuliaUIPlugin;

public class JuliaUIPreferenceInitializer extends AbstractPreferenceInitializer {

  public void initializeDefaultPreferences() {
    final IPreferenceStore store = JuliaUIPlugin.getDefault().getPreferenceStore();
    EditorsUI.useAnnotationsPreferencePage(store);
    EditorsUI.useQuickDiffPreferencePage(store);
  }
}