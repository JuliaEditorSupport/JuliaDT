package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptOverrideCompletionProposal;
import org.eclipse.swt.graphics.Image;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;

public final class JuliaCompletionProposalCollector extends ScriptCompletionProposalCollector {

  private static final char[] VAR_TRIGGER = { '\t', ' ', '=', ';', '.' };

  public JuliaCompletionProposalCollector(ISourceModule module) {
    super(module);
  }

  protected char[] getVarTrigger() {
    return VAR_TRIGGER;
  }

  // Specific proposals creation. May be use factory?
  protected ScriptCompletionProposal createScriptCompletionProposal(String completion,
      int replaceStart, int length, Image image, String displayString, int relevance) {
    return new JuliaCompletionProposal(completion, replaceStart, length, image, displayString,
        relevance);
  }

  protected ScriptCompletionProposal createScriptCompletionProposal(String completion,
      int replaceStart, int length, Image image, String displayString, int relevance,
      boolean isInDoc) {
    return new JuliaCompletionProposal(completion, replaceStart, length, image, displayString,
        relevance, isInDoc);
  }

  protected ScriptCompletionProposal createOverrideCompletionProposal(IScriptProject scriptProject,
      ISourceModule compilationUnit, String name, String[] paramTypes, int start, int length,
      String displayName, String completionProposal) {
    return new ScriptOverrideCompletionProposal(scriptProject, compilationUnit, name, paramTypes,
        start, length, displayName, completionProposal);
  }

  @Override
  protected String getNatureId() {
    return JuliaNature.ID;
  }
}
