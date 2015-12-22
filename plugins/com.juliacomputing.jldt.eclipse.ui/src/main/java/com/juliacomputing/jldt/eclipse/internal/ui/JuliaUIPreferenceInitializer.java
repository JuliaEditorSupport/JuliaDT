package com.juliacomputing.jldt.eclipse.internal.ui;


import com.juliacomputing.jldt.eclipse.ui.JuliaUI;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.editors.text.EditorsUI;


public class JuliaUIPreferenceInitializer extends AbstractPreferenceInitializer {

    public void initializeDefaultPreferences() {
        final IPreferenceStore store = JuliaUI.getDefault().getPreferenceStore();
        EditorsUI.useAnnotationsPreferencePage(store);
        EditorsUI.useQuickDiffPreferencePage(store);
    }
}