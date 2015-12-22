package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import com.juliacomputing.jldt.eclipse.core.Julia;
import org.eclipse.dltk.codeassist.ScriptCompletionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.CompletionProposal;

public class JuliaCompletionEngine extends ScriptCompletionEngine {
    @Override
    public void complete(IModuleSource moduleSource, int position, int offset) {
        final String content = moduleSource.getSourceContents();
        final int index = prefixStart(content, position);
        if (index == -1)
            return;
        final String prefix = content.substring(index, position);
        for (final String keyword : Julia.keywords()) {
            if (keyword.startsWith(prefix))
                addKeywordProposal(keyword, index);
        }
    }

    private int prefixStart(String content, int position) {
        if (position <= 0 || position > content.length())
            return -1;
        for (int i = position - 1; i > 0; i--)
            if (Character.isWhitespace(content.charAt(i)))
                return i + 1;
        return -1;
    }

    private void addKeywordProposal(String name, int position) {
        // accept result
        noProposal = false;
        if (!requestor.isIgnored(CompletionProposal.KEYWORD)) {
            final CompletionProposal proposal = createProposal(CompletionProposal.KEYWORD, actualCompletionPosition);
            proposal.setName(name);
            proposal.setCompletion(name);
            proposal.setRelevance(1000000);
            proposal.setReplaceRange(position, position + name.length());
            requestor.accept(proposal);
        }
    }
}