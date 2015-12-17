package com.juliacomputing.jldt.eclipse.ui.launch.interpreter;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import org.eclipse.dltk.internal.debug.ui.interpreters.AbstractInterpreterContainerWizardPage;

public class JuliaInterpreterContainerWizardPage extends
        AbstractInterpreterContainerWizardPage {

    @Override
    public String getScriptNature() {
        return JuliaNature.ID;
    }

}
