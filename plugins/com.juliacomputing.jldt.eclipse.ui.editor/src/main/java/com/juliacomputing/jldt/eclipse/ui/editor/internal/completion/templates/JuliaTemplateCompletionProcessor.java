package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates;

import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.dltk.ui.templates.ScriptTemplateCompletionProcessor;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;

public class JuliaTemplateCompletionProcessor extends ScriptTemplateCompletionProcessor {

  private static char[] IGNORED_CHARACTERS = new char[] { '.' };

  public JuliaTemplateCompletionProcessor(ScriptContentAssistInvocationContext context) {
    super(context);
  }

  protected String getContextTypeId() {
    return JuliaUniversalTemplateContextType.CONTEXT_TYPE_ID;
  }

  protected char[] getIgnore() {
    return IGNORED_CHARACTERS;
  }

  protected ScriptTemplateAccess getTemplateAccess() {
    return JuliaTemplateAccess.getInstance();
  }
}
