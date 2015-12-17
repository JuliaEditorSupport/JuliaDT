package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.*;

import java.util.ArrayList;
import java.util.List;

public class JuliaCodeScanner extends AbstractScriptScanner {
    private static final String[] KEYWORDS = {"begin", "new", "while", "if", "else", "elseif", "for", "try", "catch", "finally",
            "return", "break", "continue", "function", "macro", "quote", "let", "local", "global", "const", "abstract",
            "typealias", "type", "bitstype", "immutable", "ccall", "do", "module", "baremodule", "using", "import",
            "export", "importall", "end", "in"};

    private static final String TOKEN_PROPERTIES[] = {
            JuliaColourConstants.COMMENT,
            JuliaColourConstants.STRING,
            JuliaColourConstants.DEFAULT,
            JuliaColourConstants.KEYWORD};

    public JuliaCodeScanner(IColorManager manager, IPreferenceStore store) {
        super(manager, store);
        initialize();
    }

    protected String[] getTokenProperties() {
        return JuliaCodeScanner.TOKEN_PROPERTIES;
    }

    protected List createRules() {
        List<IRule> rules = new ArrayList<>();
        IToken keyword = getToken(JuliaColourConstants.KEYWORD);
        IToken comment = getToken(JuliaColourConstants.COMMENT);
        IToken other = getToken(JuliaColourConstants.DEFAULT);
        rules.add(new EndOfLineRule("#", comment));
        rules.add(new WhitespaceRule(new JuliaWhitespaceDetector()));
        WordRule wordRule = new WordRule(new JuliaWordDetector(), other);
        for (int i = 0; i < KEYWORDS.length; i++) {
            wordRule.addWord(KEYWORDS[i], keyword);
        }
        rules.add(wordRule);
        setDefaultReturnToken(other);
        return rules;
    }

    public class JuliaWhitespaceDetector implements IWhitespaceDetector {
        public boolean isWhitespace(char character) {
            return Character.isWhitespace(character);
        }
    }

    public class JuliaWordDetector implements IWordDetector {
        public boolean isWordPart(char character) {
            return Character.isJavaIdentifierPart(character);
        }

        public boolean isWordStart(char character) {
            return Character.isJavaIdentifierStart(character);
        }
    }
}