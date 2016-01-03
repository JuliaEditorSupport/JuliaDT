package com.juliacomputing.jldt.eclipse.ui.editor;

import org.eclipse.dltk.ui.preferences.AbstractConfigurationBlockPreferencePage;
import org.eclipse.dltk.ui.preferences.EditorConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;

public class JuliaEditorPreferencesPage extends AbstractConfigurationBlockPreferencePage {

    @Override
    protected void setDescription() {
        setDescription("Julia Editor preferences");
    }

    @Override
    protected void setPreferenceStore() {
        setPreferenceStore(JuliaEditorPlugin.getDefault().getPreferenceStore());
    }

    @Override
    protected IPreferenceConfigurationBlock createConfigurationBlock(
            OverlayPreferenceStore overlayPreferenceStore) {
        return new EditorConfigurationBlock(this, overlayPreferenceStore,
                EditorConfigurationBlock.FLAG_TAB_ALWAYS_INDENT);
    }
}
