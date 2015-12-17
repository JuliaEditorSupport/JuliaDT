package com.juliacomputing.jldt.eclipse.internal.ui.preferences;


import com.juliacomputing.jldt.eclipse.ui.JuliaUI;
import org.eclipse.dltk.ui.preferences.ScriptCorePreferencePage;

public class JuliaPreferences extends ScriptCorePreferencePage {

    protected String getHelpId() {
        return null;
    }

    protected void setDescription() {
        setDescription("General Julia Preferences");
    }

    protected void setPreferenceStore() {
        setPreferenceStore(JuliaUI.getDefault().getPreferenceStore());
    }
}