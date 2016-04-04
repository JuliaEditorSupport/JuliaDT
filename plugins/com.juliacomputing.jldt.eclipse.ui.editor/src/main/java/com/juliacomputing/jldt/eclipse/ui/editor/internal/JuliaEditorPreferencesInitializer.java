package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.editors.text.EditorsUI;

public class JuliaEditorPreferencesInitializer extends AbstractPreferenceInitializer {

  public static final RGB COMMENT_COLOUR = new RGB(63, 127, 95);
  public static final RGB KEYWORD_COLOUR = new RGB(127, 0, 85);
  public static final RGB STRING_COLOUR = new RGB(42, 0, 255);

  public void initializeDefaultPreferences() {
    IPreferenceStore store = JuliaEditorPlugin.getDefault().getPreferenceStore();
    EditorsUI.useAnnotationsPreferencePage(store);
    EditorsUI.useQuickDiffPreferencePage(store);
    PreferenceConstants.initializeDefaultValues(store);
    PreferenceConverter.setDefault(store, JuliaColourConstants.COMMENT, COMMENT_COLOUR);
    PreferenceConverter.setDefault(store, JuliaColourConstants.KEYWORD, KEYWORD_COLOUR);
    PreferenceConverter.setDefault(store, JuliaColourConstants.STRING, STRING_COLOUR);

    store.setDefault(JuliaColourConstants.COMMENT + PreferenceConstants.EDITOR_BOLD_SUFFIX, false);
    store
        .setDefault(JuliaColourConstants.COMMENT + PreferenceConstants.EDITOR_ITALIC_SUFFIX, false);

    store.setDefault(JuliaColourConstants.KEYWORD + PreferenceConstants.EDITOR_BOLD_SUFFIX, true);
    store
        .setDefault(JuliaColourConstants.KEYWORD + PreferenceConstants.EDITOR_ITALIC_SUFFIX, false);

    store.setDefault(PreferenceConstants.EDITOR_TAB_WIDTH, 4);
    store.setDefault(PreferenceConstants.EDITOR_SYNC_OUTLINE_ON_CURSOR_MOVE, true);

    store.setDefault(CodeFormatterConstants.FORMATTER_TAB_CHAR, CodeFormatterConstants.TAB);
    store.setDefault(CodeFormatterConstants.FORMATTER_TAB_SIZE, "4");
    store.setDefault(CodeFormatterConstants.FORMATTER_INDENTATION_SIZE, "4");
  }
}