package com.juliacomputing.jldt.eclipse.ui.launch.interpreter;

import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterLibraryBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.LibraryLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;

public class JuliaInterpreterLibraryBlock extends AbstractInterpreterLibraryBlock {

  public JuliaInterpreterLibraryBlock(AddScriptInterpreterDialog dialog) {
    super(dialog);
  }

  protected IBaseLabelProvider getLabelProvider() {
    return new LibraryLabelProvider();
  }
}
