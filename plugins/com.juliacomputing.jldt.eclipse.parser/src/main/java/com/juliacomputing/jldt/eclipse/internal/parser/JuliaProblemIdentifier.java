package com.juliacomputing.jldt.eclipse.internal.parser;

import com.juliacomputing.jldt.eclipse.parser.JuliaParserPlugin;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.compiler.problem.IProblemIdentifierFactory;

public enum JuliaProblemIdentifier implements IProblemIdentifier {

    SYNTAX_ERROR;

    public String contributor() {
        return JuliaParserPlugin.ID;
    }

    public static class Resolver implements IProblemIdentifierFactory {

        public IProblemIdentifier valueOf(String localName)
                throws IllegalArgumentException {
            return JuliaProblemIdentifier.valueOf(localName);
        }

        public IProblemIdentifier[] values() {
            return JuliaProblemIdentifier.values();
        }

    }

}