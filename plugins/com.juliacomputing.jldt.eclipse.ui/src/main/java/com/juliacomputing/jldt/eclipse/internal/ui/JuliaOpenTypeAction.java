package com.juliacomputing.jldt.eclipse.internal.ui;

import org.eclipse.dltk.ui.IDLTKUILanguageToolkit;
import org.eclipse.dltk.ui.actions.OpenTypeAction;

public class JuliaOpenTypeAction extends OpenTypeAction {
  protected IDLTKUILanguageToolkit getUILanguageToolkit() {
    return new JuliaUILanguageToolkit();
  }
}