package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates.JuliaTemplateCompletionProcessor;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;

public class JuliaCompletionProposalComputer extends ScriptCompletionProposalComputer {

    public JuliaCompletionProposalComputer() {
    }

    protected ScriptCompletionProposalCollector createCollector(ScriptContentAssistInvocationContext context) {
        return new JuliaCompletionProposalCollector(context.getSourceModule());
    }

    protected TemplateCompletionProcessor createTemplateProposalComputer(ScriptContentAssistInvocationContext context) {
        return new JuliaTemplateCompletionProcessor(context);
    }
}
