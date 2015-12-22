package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.Image;

public class JuliaCompletionProposal extends ScriptCompletionProposal {
    public JuliaCompletionProposal(String replacementString,
                                   int replacementOffset, int replacementLength, Image image,
                                   String displayString, int relevance) {
        super(replacementString, replacementOffset, replacementLength, image,
                displayString, relevance);
    }

    public JuliaCompletionProposal(String replacementString,
                                   int replacementOffset, int replacementLength, Image image,
                                   String displayString, int relevance, boolean isInDoc) {
        super(replacementString, replacementOffset, replacementLength, image,
                displayString, relevance, isInDoc);
    }

    protected boolean insertCompletion() {
        IPreferenceStore preference = JuliaEditorPlugin.getDefault().getPreferenceStore();
        return preference.getBoolean(PreferenceConstants.CODEASSIST_INSERT_COMPLETION);
    }

}
