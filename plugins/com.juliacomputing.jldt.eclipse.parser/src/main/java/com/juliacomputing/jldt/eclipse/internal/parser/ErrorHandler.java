package com.juliacomputing.jldt.eclipse.internal.parser;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverity;

/**
 * ErrorHandler
 *
 * @author snefru
 */
public class ErrorHandler extends DefaultErrorStrategy {

    private final IProblemReporter problemReporter;

    public ErrorHandler(IProblemReporter problemReporter) {
        this.problemReporter = problemReporter;
    }


    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        super.reportNoViableAlternative(recognizer, e);
        final Token offendingToken = e.getOffendingToken();
        problemReporter.reportProblem(new DefaultProblem(e.getInputStream().getSourceName(),
                e.getMessage(),
                JuliaProblemIdentifier.SYNTAX_ERROR,
                new String[]{e.getMessage()},
                ProblemSeverity.DEFAULT,
                offendingToken.getStartIndex(),
                offendingToken.getStopIndex(),
                offendingToken.getLine(),
                offendingToken.getCharPositionInLine()));

    }
}
