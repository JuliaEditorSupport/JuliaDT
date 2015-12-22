package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.core.Julia;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.*;

import java.util.ArrayList;
import java.util.List;

public class JuliaCodeScanner extends AbstractScriptScanner {

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
        return TOKEN_PROPERTIES;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    protected List createRules() {
        final List<IRule> rules = new ArrayList<>();
        final IToken keyword = getToken(JuliaColourConstants.KEYWORD);
        final IToken comment = getToken(JuliaColourConstants.COMMENT);
        final IToken other = getToken(JuliaColourConstants.DEFAULT);
        rules.add(new EndOfLineRule("#", comment));
        rules.add(new WhitespaceRule(new JuliaWhitespaceDetector()));
        final WordRule wordRule = new WordRule(new JuliaWordDetector(), other);
        for (final String entry : Julia.keywords())
            wordRule.addWord(entry, keyword);
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