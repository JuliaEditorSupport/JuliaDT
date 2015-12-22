package com.juliacomputing.jldt.eclipse.internal.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.julia.lang.JuliaLexer;
import org.julia.lang.JuliaParser;
import org.julia.lang.JuliaParser.UnitContext;

/**
 * JuliaEclipseParser
 *
 * @author snefru
 */
public class JuliaEclipseParser extends AbstractSourceParser {


    public ModuleDeclaration parse(IModuleSource source, IProblemReporter reporter) {
        final String content = source.getSourceContents();
        final CharStream stream = new ANTLRInputStream(content);
        final JuliaLexer lexer = new JuliaLexer(stream);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final JuliaParser parser = new JuliaParser(tokens);
        final UnitContext unit = parser.unit();
        return new ModuleDeclaration(content.length());
    }
}
