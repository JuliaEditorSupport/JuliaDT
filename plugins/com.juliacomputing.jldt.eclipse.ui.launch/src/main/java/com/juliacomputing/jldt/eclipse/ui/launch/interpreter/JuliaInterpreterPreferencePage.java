package com.juliacomputing.jldt.eclipse.ui.launch.interpreter;

import org.eclipse.dltk.internal.debug.ui.interpreters.InterpretersBlock;
import org.eclipse.dltk.internal.debug.ui.interpreters.ScriptInterpreterPreferencePage;

public class JuliaInterpreterPreferencePage extends ScriptInterpreterPreferencePage {

    public InterpretersBlock createInterpretersBlock() {
        return new JuliaInterpretersBlock();
    }
}
