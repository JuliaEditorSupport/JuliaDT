package com.juliacomputing.jldt.eclipse.internal.ui.wizard;

import org.eclipse.dltk.ui.wizards.NewSourceModulePage;
import org.eclipse.dltk.ui.wizards.NewSourceModuleWizard;

public class JuliaNewFileWizard extends NewSourceModuleWizard {

    public static final String ID = "com.juliacomputing.jldt.eclipse.wizards.newFile"; //$NON-NLS-1$

    @Override
    protected NewSourceModulePage createNewSourceModulePage() {
        return new NewSourceModulePage() {
            @Override
            protected String getPageTitle() {
                return "Empty Julia File";
            }

            @Override
            protected String getPageDescription() {
                return "Create a new empty Julia File";
            }

            @Override
            protected String getRequiredNature() {
                return "com.juliacomputing.jldt.eclipse.core.nature";
            }
        };
    }
}