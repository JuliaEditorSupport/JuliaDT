package com.juliacomputing.jldt.eclipse.internal.ui.wizard;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import org.eclipse.dltk.ui.wizards.ProjectWizard;

public class JuliaNewProjectWizard extends ProjectWizard {

    public static final String ID = "com.juliacomputing.jldt.eclipse.wizards.newProject"; //$NON-NLS-1$

    @Override
    public String getScriptNature() {
        return JuliaNature.ID;
    }

}

