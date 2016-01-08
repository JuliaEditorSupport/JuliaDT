package com.juliacomputing.jldt.eclipse.internal.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.julia.lang.parser.JuliaLexer;
import org.julia.lang.parser.JuliaParser;
import org.julia.lang.parser.JuliaParser.UnitContext;

public class JuliaEclipseParser extends AbstractSourceParser {


    public ModuleDeclaration parse(IModuleSource source, IProblemReporter reporter) {
        System.out.println(source.getFileName());
        System.out.println("--------------------");
        final String content = source.getSourceContents();
        final CharStream stream = new ANTLRInputStream(content);
        final JuliaLexer lexer = new JuliaLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final JuliaParser parser = new JuliaParser(tokens);
        parser.setErrorHandler(new ErrorHandler(reporter));
        final UnitContext unit = parser.unit();
        final JuliaModuleFactory factory = new JuliaModuleFactory();
//        reporter.reportProblem(new DefaultProblem("a","message",JuliaProblemIdentifier.SYNTAX_ERROR,new String[0], ProblemSeverity.ERROR,0,10,1,1));
        return factory.create(unit);
    }


}
