package com.juliacomputing.jldt.eclipse.ui.launch.interpreter;

import org.eclipse.dltk.core.environment.IEnvironment;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterLibraryBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.AddScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.IAddInterpreterDialogRequestor;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.swt.widgets.Shell;

public class AddJuliaInterpreterDialog extends AddScriptInterpreterDialog {

  public AddJuliaInterpreterDialog(IAddInterpreterDialogRequestor requestor, Shell shell,
      IInterpreterInstallType[] interpreterInstallTypes, IEnvironment environment,
      IInterpreterInstall editedInterpreter) {
    super(requestor, shell, interpreterInstallTypes, editedInterpreter);
  }

  protected AbstractInterpreterLibraryBlock createLibraryBlock(AddScriptInterpreterDialog dialog) {
    return new JuliaInterpreterLibraryBlock(dialog);
  }
}
