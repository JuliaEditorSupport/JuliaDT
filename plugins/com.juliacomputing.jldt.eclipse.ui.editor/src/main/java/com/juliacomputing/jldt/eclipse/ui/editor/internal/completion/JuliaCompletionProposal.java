package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
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
}
