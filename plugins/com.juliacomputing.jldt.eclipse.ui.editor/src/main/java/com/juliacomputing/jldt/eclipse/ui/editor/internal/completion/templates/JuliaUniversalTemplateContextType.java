package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.templates.ScriptTemplateContext;
import org.eclipse.dltk.ui.templates.ScriptTemplateContextType;
import org.eclipse.jface.text.IDocument;

public class JuliaUniversalTemplateContextType extends ScriptTemplateContextType {

  public static final String CONTEXT_TYPE_ID = "juliaUniversalTemplateContextType";

  public JuliaUniversalTemplateContextType() {
  }

  public JuliaUniversalTemplateContextType(String id, String name) {
    super(id, name);
  }

  public JuliaUniversalTemplateContextType(String id) {
    super(id);
  }

  public ScriptTemplateContext createContext(IDocument document, int completionPosition, int length,
      ISourceModule sourceModule) {
    return new JuliaTemplateContext(this, document, completionPosition, length, sourceModule);
  }
}
