package org.julia.lang.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;

/**
 * Adhoc
 *
 * @author snefru
 */
public class Adhoc {

    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("/Applications/Julia-0.4.1.app/Contents/Resources/julia/share/julia/base/array.jl"))); // create a lexer that feeds off of input CharStream
        JuliaLexer lexer = new JuliaLexer(input); // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
        JuliaParser parser = new JuliaParser(tokens);
        ParseTree tree = parser.unit(); // begin parsing at init rule
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
