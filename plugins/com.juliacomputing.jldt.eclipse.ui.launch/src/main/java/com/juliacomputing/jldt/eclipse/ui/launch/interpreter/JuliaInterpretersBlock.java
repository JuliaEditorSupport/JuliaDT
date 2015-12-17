package com.juliacomputing.jldt.eclipse.ui.launch.interpreter;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import org.eclipse.dltk.core.environment.IEnvironment;
import org.eclipse.dltk.internal.debug.ui.interpreters.IScriptInterpreterDialog;
import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.ScriptRuntime;

public class JuliaInterpretersBlock extends InterpretersBlock {


    @Override
    protected IScriptInterpreterDialog createInterpreterDialog(IEnvironment environment, IInterpreterInstall standin) {
        AddJuliaInterpreterDialog dialog = new AddJuliaInterpreterDialog(
                this, this.getShell(), ScriptRuntime
                .getInterpreterInstallTypes(this.getCurrentNature()), environment,
                standin);
        dialog.setEnvironment(environment);
        return dialog;
    }

    @Override
    protected String getCurrentNature() {
        return JuliaNature.ID;
    }
}
 