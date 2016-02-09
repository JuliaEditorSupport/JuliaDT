package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;

import org.eclipse.dltk.ui.text.completion.ScriptCompletionProcessor;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.ui.IEditorPart;

public class JuliaScriptCompletionProcessor extends ScriptCompletionProcessor {
  public JuliaScriptCompletionProcessor(IEditorPart editor, ContentAssistant assistant,
      String partition) {
    super(editor, assistant, partition);
  }

  protected String getNatureId() {
    return JuliaNature.ID;
  }

}