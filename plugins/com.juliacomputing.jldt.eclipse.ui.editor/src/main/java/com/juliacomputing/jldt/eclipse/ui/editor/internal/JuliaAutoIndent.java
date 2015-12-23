package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextUtilities;

/**
 * Auto indent strategy sensitive to brackets.
 */
public class JuliaAutoIndent extends DefaultIndentLineAutoEditStrategy {
    @Override
    public void customizeDocumentCommand(IDocument document, DocumentCommand command) {
//        if (!command.doit)
//            return;
//        if (command.length == 0 && command.text != null && isLineDelimiter(document, command.text))
//            smartIndentAfterNewLine(document, command);
//        else if (command.text.length() == 1)
//            smartIndentOnKeypress(document, command);
//        else if (command.text.length() > 1
//                && getPreferenceStore().getBoolean(
//                PreferenceConstants.EDITOR_SMART_PASTE))
//            smartPaste(document, command); // no smart backspace for paste
    }

    private boolean isLineDelimiter(IDocument document, String text) {
        String[] delimiters = document.getLegalLineDelimiters();
        if (delimiters != null)
            return TextUtilities.startsWith(delimiters, text) > -1;
        return false;
    }

}


//    static final String C_START = "/*";
//    static final String C_END = "*/";
//    /**
//     * The line comment introducer. Value is "{@value} "
//     */
//    private static final String LINE_COMMENT = "//"; //$NON-NLS-1$
//    final IScriptProject fProject;
//    JsPreferenceInterpreter prefs;
//    private boolean fCloseBrace;
//    private boolean fIsSmartTab;
//    private boolean fIsSmartMode;
//    private String fPartitioning;
//
//    /**
//     * Creates a new Java auto indent strategy for the given document
//     * partitioning.
//     *
//     * @param partitioning the document partitioning
//     * @param project      the project to get formatting preferences from, or null to use
//     *                     default preferences
//     */
//    public JavascriptAutoEditStrategy(String partitioning,IScriptProject project) {
//        fPartitioning = partitioning;
//        fProject = project;
//        this.prefs = new JsPreferenceInterpreter(JavaScriptUI.getDefault().getPreferenceStore());
//    }
//
//    static IMethod findMethod(IDocument document, int offset, boolean reconcile) {
//        final int len = document.getLength();
//        try {
//            while (offset < len
//                    && Character.isWhitespace(document.getChar(offset))) {
//                ++offset;
//            }
//        } catch (BadLocationException e) {
//            return null;
//        }
//        final IModelElement modelElement = EditorUtility
//                .getActiveEditorModelInput();
//        if (modelElement != null && modelElement instanceof ISourceModule) {
//            final ISourceModule module = (ISourceModule) modelElement;
//            if (reconcile) {
//                try {
//                    ScriptModelUtil.reconcile(module);
//                } catch (ModelException e) {
//                    return null;
//                }
//            }
//            final IModelElement member;
//            try {
//                member = module.getElementAt(offset);
//            } catch (ModelException e) {
//                return null;
//            }
//            try {
//                if (member instanceof IMethod
//                        && ((IMethod) member).getSourceRange().getOffset() == offset) {
//                    return (IMethod) member;
//                }
//            } catch (ModelException e) {
//                JavaScriptUI.log(e);
//            }
//        }
//        return null;
//    }
//
//    /**
//     * Installs a java partitioner with <code>document</code>.
//     *
//     * @param document the document
//     */
//    private static void installJavaStuff(Document document) {
//        FastPartitioner partitioner = new FastPartitioner(
//                new JavascriptPartitionScanner(),
//                IJavaScriptPartitions.LEGAL_CONTENT_TYPES);
//        partitioner.connect(document);
//        document.setDocumentPartitioner(IJavaScriptPartitions.JS_PARTITIONING,
//                partitioner);
//    }
//
//    /**
//     * Installs a java partitioner with <code>document</code>.
//     *
//     * @param document the document
//     */
//    private static void removeJavaStuff(Document document) {
//        document.setDocumentPartitioner(IJavaScriptPartitions.JS_PARTITIONING,
//                null);
//    }
//
//    /**
//     * Returns the indentation of the line <code>line</code> in
//     * <code>document</code>. The returned string may contain pairs of leading
//     * slashes that are considered part of the indentation. The space before the
//     * asterisk in a javadoc-like comment is not considered part of the
//     * indentation.
//     *
//     * @param document the document
//     * @param line     the line
//     * @return the indentation of <code>line</code> in <code>document</code>
//     * @throws BadLocationException if the document is changed concurrently
//     */
//    private static String getCurrentIndent(Document document, int line)
//            throws BadLocationException {
//        IRegion region = document.getLineInformation(line);
//        int from = region.getOffset();
//        int endOffset = region.getOffset() + region.getLength();
//
//        // go behind line comments
//        int to = from;
//        while (to < endOffset - 2 && document.get(to, 2).equals(LINE_COMMENT))
//            to += 2;
//
//        while (to < endOffset) {
//            char ch = document.getChar(to);
//            if (!Character.isWhitespace(ch))
//                break;
//            to++;
//        }
//
//        // don't count the space before javadoc like, asterisk-style comment
//        // lines
//        if (to > from && to < endOffset - 1
//                && document.get(to - 1, 2).equals(" *")) { //$NON-NLS-1$
//            String type = TextUtilities.getContentType(document,
//                    IJavaScriptPartitions.JS_PARTITIONING, to, true);
//            if (type.equals(IJavaScriptPartitions.JS_DOC)
//                    || type.equals(IJavaScriptPartitions.JS_MULTI_LINE_COMMENT))
//                to--;
//        }
//
//        return document.get(from, to - from);
//    }
//
//    /**
//     * Skips the scope opened by <code>token</code> in <code>document</code>,
//     * returns either the position of the
//     *
//     * @param pos
//     * @param token
//     * @return the position after the scope
//     */
//    private static int skipScope(JavaHeuristicScanner scanner, int pos,
//                                 int token) {
//        int openToken = token;
//        int closeToken;
//        switch (token) {
//            case Symbols.TokenLPAREN:
//                closeToken = Symbols.TokenRPAREN;
//                break;
//            case Symbols.TokenLBRACKET:
//                closeToken = Symbols.TokenRBRACKET;
//                break;
//            case Symbols.TokenLBRACE:
//                closeToken = Symbols.TokenRBRACE;
//                break;
//            default:
//                Assert.isTrue(false);
//                return -1; // dummy
//        }
//
//        int depth = 1;
//        int p = pos;
//
//        while (true) {
//            int tok = scanner.nextToken(p, JavaHeuristicScanner.UNBOUND);
//            p = scanner.getPosition();
//
//            if (tok == openToken) {
//                depth++;
//            } else if (tok == closeToken) {
//                depth--;
//                if (depth == 0)
//                    return p + 1;
//            } else if (tok == Symbols.TokenEOF) {
//                return JavaHeuristicScanner.NOT_FOUND;
//            }
//        }
//    }
//
//    static void smartCloseJSDoc(IDocument d, DocumentCommand c) {
//        if (c.offset < 3 || d.getLength() == 0)
//            return;
//        try {
//            final String content = d.get(c.offset - 2, 2);
//            if (content.equals("/*")) { //$NON-NLS-1$
//                final JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//                int pos = c.offset - 2;
//                pos = scanner.findNonWhitespaceBackward(pos - 1,
//                        JavaHeuristicScanner.UNBOUND);
//                if (pos == JavaHeuristicScanner.NOT_FOUND) {
//                    return;
//                }
//                final int prevToken = scanner.previousToken(pos,
//                        JavaHeuristicScanner.UNBOUND);
//                if (prevToken == Symbols.TokenVAR
//                        || prevToken == Symbols.TokenCOMMA
//                        && scanner.looksLikeVarStatement(scanner.getPosition())) {
//                    c.text += " " + JSDocTag.TYPE + " {} */ ";
//                    c.shiftsCaret = false;
//                    c.caretOffset = c.offset + c.text.indexOf('}');
//                } else {
//                    pos = scanner.findNonWhitespaceForward(c.offset,
//                            JavaHeuristicScanner.UNBOUND);
//                    if (pos == JavaHeuristicScanner.NOT_FOUND) {
//                        return;
//                    }
//                    final int nextToken = scanner.nextToken(pos,
//                            JavaHeuristicScanner.UNBOUND);
//                    if (nextToken == Symbols.TokenFUNCTION) {
//                        c.text += "  */";
//                        if (c.offset < d.getLength()
//                                && !Character.isWhitespace(d.getChar(c.offset))) {
//                            c.text += " ";
//                        }
//                        c.shiftsCaret = false;
//                        c.caretOffset = c.offset + 2;
//                    }
//                }
//            }
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//    }
//
//    private static IPreferenceStore getPreferenceStore() {
//        return JavaScriptUI.getDefault().getPreferenceStore();
//    }
//
//    private String getIndentOfLine(IDocument d, int line)
//            throws BadLocationException {
//        if (line > -1) {
//            int start = d.getLineOffset(line);
//            int end = start + d.getLineLength(line) - 1;
//            int whiteEnd = findEndOfWhiteSpace(d, start, end);
//            return d.get(start, whiteEnd - start);
//        } else {
//            return ""; //$NON-NLS-1$
//        }
//    }
//
//    private int getStringEnd(String d, int offset, int endOffset, char ch) {
//        while (offset < endOffset) {
//            char curr = d.charAt(offset);
//            if (curr == '\\') {
//                // ignore escaped characters
//                offset++;
//            } else if (curr == ch) {
//                return offset;
//            }
//            offset++;
//        }
//        return endOffset;
//    }
//
//    private void smartIndentAfterClosingBracket(IDocument d, DocumentCommand c) {
//        if (c.offset == -1 || d.getLength() == 0)
//            return;
//
//        try {
//            int p = (c.offset == d.getLength() ? c.offset - 1 : c.offset);
//            int line = d.getLineOfOffset(p);
//            int start = d.getLineOffset(line);
//            int whiteend = findEndOfWhiteSpace(d, start, c.offset);
//
//            JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//            JavaIndenter indenter = new JavaIndenter(d, scanner, fProject);
//
//            // shift only when line does not contain any text up to the closing
//            // bracket
//            if (whiteend == c.offset) {
//                // evaluate the line with the opening bracket that matches out
//                // closing bracket
//                int reference = indenter.findReferencePosition(c.offset, false,
//                        true, false, false);
//                int indLine = d.getLineOfOffset(reference);
//                if (indLine != -1 && indLine != line) {
//                    // take the indent of the found line
//                    StringBuffer replaceText = new StringBuffer(
//                            getIndentOfLine(d, indLine));
//                    // add the rest of the current line including the just added
//                    // close bracket
//                    replaceText.append(d.get(whiteend, c.offset - whiteend));
//                    replaceText.append(c.text);
//                    // modify document command
//                    c.length += c.offset - start;
//                    c.offset = start;
//                    c.text = replaceText.toString();
//                }
//            }
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//    }
//
//    private void smartIndentAfterOpeningBracket(IDocument d, DocumentCommand c) {
//        if (c.offset < 1 || d.getLength() == 0)
//            return;
//
//        JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//
//        int p = (c.offset == d.getLength() ? c.offset - 1 : c.offset);
//
//        try {
//            // current line
//            int line = d.getLineOfOffset(p);
//            int lineOffset = d.getLineOffset(line);
//
//            // make sure we don't have any leading comments etc.
//            if (d.get(lineOffset, p - lineOffset).trim().length() != 0)
//                return;
//
//            // line of last Java code
//            int pos = scanner.findNonWhitespaceBackward(p,
//                    JavaHeuristicScanner.UNBOUND);
//            if (pos == -1)
//                return;
//            int lastLine = d.getLineOfOffset(pos);
//
//            // only shift if the last java line is further up and is a braceless
//            // block candidate
//            if (lastLine <= line) {
//
//                JavaIndenter indenter = new JavaIndenter(d, scanner, fProject);
//                StringBuffer indent = indenter.computeIndentation(p, true);
//                String toDelete = d.get(lineOffset, c.offset - lineOffset);
//                if (indent != null && !indent.toString().equals(toDelete)) {
//                    c.text = indent.append(c.text).toString();
//                    c.length += c.offset - lineOffset;
//                    c.offset = lineOffset;
//                }
//            }
//
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//
//    }
//
//    private void smartIndentAfterNewLine(IDocument d, DocumentCommand c) {
//        JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//        JavaIndenter indenter = new JavaIndenter(d, scanner, fProject);
//        StringBuffer indent = indenter.computeIndentation(c.offset);
//        if (indent == null)
//            indent = new StringBuffer();
//
//        int docLength = d.getLength();
//        if (c.offset == -1 || docLength == 0)
//            return;
//
//        try {
//            int p = (c.offset == docLength ? c.offset - 1 : c.offset);
//            int line = d.getLineOfOffset(p);
//
//            StringBuffer buf = new StringBuffer(c.text + indent);
//
//            IRegion reg = d.getLineInformation(line);
//            int lineEnd = reg.getOffset() + reg.getLength();
//
//            int contentStart = findEndOfWhiteSpace(d, c.offset, lineEnd);
//            c.length = Math.max(contentStart - c.offset, 0);
//
//            int start = reg.getOffset();
//            // insert closing brace on new line after an unclosed opening brace
//            if (closeBrace()
//                    && countBrackets(d.get(), reg.getOffset(), c.offset, false) > 0
//                    && !isClosed(d, c.offset, c.length)) {
//                c.caretOffset = c.offset + buf.length();
//                c.shiftsCaret = false;
//
//                buf.append(TextUtilities.getDefaultLineDelimiter(d));
//                final StringBuffer reference;
//                int nonWS = findEndOfWhiteSpace(d, start, lineEnd);
//                if (nonWS < c.offset && d.getChar(nonWS) == '{')
//                    reference = new StringBuffer(d.get(start, nonWS - start));
//                else
//                    reference = indenter.getReferenceIndentation(c.offset);
//                if (reference != null)
//                    buf.append(reference);
//                buf.append('}');
//            }
//            // insert extra line upon new line between two braces
//            else if (c.offset > start && contentStart < lineEnd
//                    && d.getChar(contentStart) == '}') {
//                int firstCharPos = scanner.findNonWhitespaceBackward(
//                        c.offset - 1, start);
//                if (firstCharPos != JavaHeuristicScanner.NOT_FOUND
//                        && d.getChar(firstCharPos) == '{') {
//                    c.caretOffset = c.offset + buf.length();
//                    c.shiftsCaret = false;
//
//                    StringBuffer reference = null;
//                    int nonWS = findEndOfWhiteSpace(d, start, lineEnd);
//                    if (nonWS < c.offset && d.getChar(nonWS) == '{')
//                        reference = new StringBuffer(
//                                d.get(start, nonWS - start));
//                    else
//                        reference = indenter.getReferenceIndentation(c.offset);
//
//                    buf.append(TextUtilities.getDefaultLineDelimiter(d));
//
//                    if (reference != null)
//                        buf.append(reference);
//                }
//            } else {
//                IRegion prevLine = d.getLineInformation(line);
//                String str = d.get(prevLine.getOffset(), prevLine.getLength());
//                if (str.trim().startsWith(C_START)) {
//                    /*
//					 * handle only comment/jsdoc start here, as it happens in
//					 * code partition. Continuation is handled in
//					 * JSDocAutoIndentStrategy attached to comment/jsdoc
//					 * partitions.
//					 */
//                    String result = handleJsCodeCompleteStars(str, prevLine,
//                            line, d, c);
//                    if (result != null) {
//                        buf.setLength(0);
//                        buf.append(result);
//                    }
//                }
//            }
//
//            c.text = buf.toString();
//
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//    }
//
//    private String handleJsCodeCompleteStars(String str, IRegion prevLine,
//                                             int line, IDocument d, DocumentCommand c) {
//        int index = str.indexOf(C_START);
//        // if it is directly closed then there is no doc to append.
//        if (str.indexOf(C_END, index + 2) != -1)
//            return null;
//
//        // handle the start comment character prefix;
//        if (prevLine.getOffset() + index < c.offset) {
//            StringBuffer buf = new StringBuffer();
//            StringBuffer indentStr = new StringBuffer(index);
//            int counter = 0;
//            while (counter < index) {
//                char ch = str.charAt(counter++);
//                if (Character.isWhitespace(ch)) {
//                    indentStr.append(ch);
//                } else {
//                    indentStr.append(' ');
//                }
//            }
//
//            boolean enclosedComment = false;
//            try {
//                index = line + 1;
//                IRegion nextLine = null;
//                while ((nextLine = d.getLineInformation(index++)) != null) {
//                    String strNextLine = d.get(nextLine.getOffset(),
//                            nextLine.getLength());
//                    int stComment = strNextLine.indexOf(C_START);
//                    int endComment = strNextLine.indexOf(C_END);
//
//                    if (stComment != -1 && endComment != -1) {
//                        if (stComment < endComment) {
//                            break;
//                        }
//                    } else if (endComment != -1) {
//                        enclosedComment = true;
//                        break;
//                    } else if (stComment != -1) {
//                        break;
//                    }
//
//                }
//            } catch (Exception ex) {
//
//            }
//            final String endTag = "\n" + indentStr + " */";
//            String generatedString = null;
//            if (!enclosedComment && JSDocAutoIndentStrategy.isGenerateStub()) {
//                try {
//                    d.replace(c.offset, 0, endTag);
//                } catch (BadLocationException e) {
//                    return null;
//                }
//                c.length = endTag.length();
//                final IMethod method = findMethod(d,
//                        c.offset + endTag.length(), true);
//                if (method != null) {
//                    final String lineDelimiter = TextUtilities
//                            .getDefaultLineDelimiter(d);
//                    generatedString = JSCodeGeneration.getMethodComment(method,
//                            null, lineDelimiter);
//                    if (generatedString != null) {
//                        generatedString = JSDocAutoIndentStrategy
//                                .normalizeGeneratedDoc(generatedString);
//                        generatedString = JSCodeGeneration.changeIndent(
//                                generatedString, 0, method.getScriptProject(),
//                                indentStr.toString(), lineDelimiter);
//                    }
//                }
//            }
//            buf.append("\n" + indentStr + " * ");
//            if (generatedString != null) {
//                buf.append(generatedString);
//            }
//            c.caretOffset = c.offset + buf.length();
//            c.shiftsCaret = false;
//            if (!enclosedComment)
//                buf.append(endTag);
//            return buf.toString();
//        }
//
//        return null;
//    }
//
//    private boolean isClosed(IDocument d, int offset, int length) {
//        String sm = d.get();
//        int levelBefore = countBrackets(sm, 0, offset, true);
//        int levelAfter = -countBrackets(sm, offset, sm.length(), true);
//        return levelBefore <= levelAfter;
//    }
//
//    /**
//     * @param offset
//     * @param sm
//     * @param levelBefore
//     */
//    private int countBrackets(String sm, int start, int end, boolean countClose) {
//        int level = 0;
//        for (int a = start; a < end; a++) {
//            char charAt = sm.charAt(a);
//            switch (charAt) {
//                case '\'': {
//                    a = getStringEnd(sm, a + 1, end, '\'');
//                    break;
//                }
//                case '"': {
//                    a = getStringEnd(sm, a + 1, end, '"');
//                    break;
//                }
//                case '/': {
//                    int aPlus1 = a + 1;
//                    if (aPlus1 < end) {
//                        // test if single line comment
//                        if (sm.charAt(aPlus1) == '/') {
//                            // skip it all.
//                            a = sm.indexOf('\n', aPlus1);
//                            if (a == -1)
//                                a = sm.length();
//                        } else if (sm.charAt(aPlus1) == '*') {
//                            // start of doc search for the end..
//                            a = sm.indexOf(C_END, aPlus1);
//                            if (a == -1)
//                                a = sm.length();
//                            else
//                                a = a + 1;
//                        } else // regexp?
//                        {
//                            aPlus1++;
//                            while (aPlus1 < end) {
//                                char c = sm.charAt(aPlus1);
//                                aPlus1++;
//                                if (c == '\\') {
//                                    // escape char add one mre
//                                    aPlus1++;
//                                    continue;
//                                }
//                                if (c == '/') {
//                                    // reg exp found (/xxx/)
//                                    a = aPlus1;
//                                    break;
//                                }
//                                if (c == '\n')
//                                    break;
//                            }
//                        }
//                    }
//                    break;
//                }
//                case '<': {
//                    // xml test
//                    int aPlus1 = a + 1;
//                    StringBuilder sb = new StringBuilder(5);
//                    sb.append("</");
//                    while (aPlus1 < end) {
//                        char c = sm.charAt(aPlus1);
//                        if (Character.isJavaIdentifierPart(c)) {
//                            sb.append(c);
//                            aPlus1++;
//                        } else if ((c == '>' || c == ' ') && sb.length() > 2) {
//                            if (c == '>') {
//                                // search for close tag.
//                                int index = sm.substring(aPlus1, end).indexOf(
//                                        sb.toString());
//                                if (index != -1) {
//                                    a = aPlus1 + index + sb.length();
//                                }
//                            } else {
//                                while (++aPlus1 < end) {
//                                    c = sm.charAt(aPlus1);
//                                    if (c == '/') {
//                                        if (++aPlus1 < end) {
//                                            c = sm.charAt(aPlus1);
//                                            if (c == '>') {
//                                                a = aPlus1 + 1;
//                                                break;
//                                            }
//                                            aPlus1--;
//                                        }
//                                    } else if (c == '>') {
//                                        // search for close tag.
//                                        int index = sm.substring(aPlus1, end)
//                                                .indexOf(sb.toString());
//                                        if (index != -1) {
//                                            a = aPlus1 + index + sb.length();
//                                        }
//                                        break;
//                                    } else if (c == '"' || c == '\'') {
//                                        int index = sm.substring(aPlus1 + 1, end)
//                                                .indexOf(c);
//                                        if (index != -1) {
//                                            aPlus1 = aPlus1 + index;
//                                        }
//                                    }
//                                }
//                            }
//                            break;
//                        } else {
//                            break;
//                        }
//                    }
//                    break;
//                }
//                case '{': {
//                    level++;
//                    break;
//                }
//                case '}': {
//                    if (countClose)
//                        level--;
//                    break;
//                }
//            }
//        }
//        return level;
//    }
//
//    private void smartPaste(IDocument document, DocumentCommand command) {
//        int newOffset = command.offset;
//        int newLength = command.length;
//        String newText = command.text;
//
//        try {
//            JavaHeuristicScanner scanner = new JavaHeuristicScanner(document);
//            JavaIndenter indenter = new JavaIndenter(document, scanner,
//                    fProject);
//            int offset = newOffset;
//
//            // reference position to get the indent from
//            int refOffset = indenter.findReferencePosition(offset);
//            if (refOffset == JavaHeuristicScanner.NOT_FOUND)
//                return;
//            int peerOffset = getPeerPosition(document, command);
//            peerOffset = indenter.findReferencePosition(peerOffset);
//            refOffset = Math.min(refOffset, peerOffset);
//
//            // eat any WS before the insertion to the beginning of the line
//            int firstLine = 1; // don't format the first line per default, as
//            // it has other content before it
//            IRegion line = document.getLineInformationOfOffset(offset);
//            String notSelected = document.get(line.getOffset(),
//                    offset - line.getOffset());
//            if (notSelected.trim().length() == 0) {
//                newLength += notSelected.length();
//                newOffset = line.getOffset();
//                firstLine = 0;
//            }
//
//            // prefix: the part we need for formatting but won't paste
//            IRegion refLine = document.getLineInformationOfOffset(refOffset);
//            String prefix = document.get(refLine.getOffset(), newOffset
//                    - refLine.getOffset());
//
//            // handle the indentation computation inside a temporary document
//            Document temp = new Document(prefix + newText);
//            DocumentRewriteSession session = temp
//                    .startRewriteSession(DocumentRewriteSessionType.STRICTLY_SEQUENTIAL);
//            scanner = new JavaHeuristicScanner(temp);
//            indenter = new JavaIndenter(temp, scanner, fProject);
//            installJavaStuff(temp);
//
//            // indent the first and second line
//            // compute the relative indentation difference from the second line
//            // (as the first might be partially selected) and use the value to
//            // indent all other lines.
//            boolean isIndentDetected = false;
//            StringBuffer addition = new StringBuffer();
//            int insertLength = 0;
//            int first = document.computeNumberOfLines(prefix) + firstLine; // don't
//            // format
//            // first
//            // line
//            int lines = temp.getNumberOfLines();
//            int tabLength = getVisualTabLengthPreference();
//            boolean changed = false;
//            for (int l = first; l < lines; l++) { // we don't change the
//                // number of lines while
//                // adding indents
//
//                IRegion r = temp.getLineInformation(l);
//                int lineOffset = r.getOffset();
//                int lineLength = r.getLength();
//
//                if (lineLength == 0) // don't modify empty lines
//                    continue;
//
//                if (!isIndentDetected) {
//
//                    // indent the first pasted line
//                    String current = getCurrentIndent(temp, l);
//                    StringBuffer correct = indenter
//                            .computeIndentation(lineOffset);
//                    if (correct == null)
//                        return; // bail out
//
//                    insertLength = subtractIndent(correct, current, addition,
//                            tabLength);
//                    if (l != first
//                            && temp.get(lineOffset, lineLength).trim().length() != 0) {
//                        isIndentDetected = true;
//                        if (insertLength == 0) {
//                            // no adjustment needed, bail out
//                            if (firstLine == 0) {
//                                // but we still need to adjust the first line
//                                command.offset = newOffset;
//                                command.length = newLength;
//                                if (changed)
//                                    break; // still need to get the leading
//                                // indent of the first line
//                            }
//                            return;
//                        }
//                        removeJavaStuff(temp);
//                    } else {
//                        changed = insertLength != 0;
//                    }
//                }
//
//                // relatively indent all pasted lines
//                if (insertLength > 0)
//                    addIndent(temp, l, addition, tabLength);
//                else if (insertLength < 0)
//                    cutIndent(temp, l, -insertLength, tabLength);
//
//            }
//
//            temp.stopRewriteSession(session);
//            newText = temp.get(prefix.length(),
//                    temp.getLength() - prefix.length());
//
//            command.offset = newOffset;
//            command.length = newLength;
//            command.text = newText;
//
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//
//    }
//
//    /**
//     * Computes the difference of two indentations and returns the difference in
//     * length of current and correct. If the return value is positive,
//     * <code>addition</code> is initialized with a substring of that length of
//     * <code>correct</code>.
//     *
//     * @param correct    the correct indentation
//     * @param current    the current indentation (might contain non-whitespace)
//     * @param difference a string buffer - if the return value is positive, it will be
//     *                   cleared and set to the substring of <code>current</code> of
//     *                   that length
//     * @param tabLength  the length of a tab
//     * @return the difference in length of <code>correct</code> and
//     * <code>current</code>
//     */
//    private int subtractIndent(CharSequence correct, CharSequence current,
//                               StringBuffer difference, int tabLength) {
//        int c1 = computeVisualLength(correct, tabLength);
//        int c2 = computeVisualLength(current, tabLength);
//        int diff = c1 - c2;
//        if (diff <= 0)
//            return diff;
//
//        difference.setLength(0);
//        int len = 0, i = 0;
//        while (len < diff) {
//            char c = correct.charAt(i++);
//            difference.append(c);
//            len += computeVisualLength(c, tabLength);
//        }
//
//        return diff;
//    }
//
//    /**
//     * Indents line <code>line</code> in <code>document</code> with
//     * <code>indent</code>. Leaves leading comment signs alone.
//     *
//     * @param document  the document
//     * @param line      the line
//     * @param indent    the indentation to insert
//     * @param tabLength the length of a tab
//     * @throws BadLocationException on concurrent document modification
//     */
//    private void addIndent(Document document, int line, CharSequence indent,
//                           int tabLength) throws BadLocationException {
//        IRegion region = document.getLineInformation(line);
//        int insert = region.getOffset();
//        int endOffset = region.getOffset() + region.getLength();
//
//        // Compute insert after all leading line comment markers
//        int newInsert = insert;
//        while (newInsert < endOffset - 2
//                && document.get(newInsert, 2).equals(LINE_COMMENT))
//            newInsert += 2;
//
//        // Heuristic to check whether it is commented code or just a comment
//        if (newInsert > insert) {
//            int whitespaceCount = 0;
//            int i = newInsert;
//            while (i < endOffset - 1) {
//                char ch = document.get(i, 1).charAt(0);
//                if (!Character.isWhitespace(ch))
//                    break;
//                whitespaceCount = whitespaceCount
//                        + computeVisualLength(ch, tabLength);
//                i++;
//            }
//
//            if (whitespaceCount != 0 && whitespaceCount >= 4)
//                insert = newInsert;
//        }
//
//        // Insert indent
//        document.replace(insert, 0, indent.toString());
//    }
//
//    /**
//     * Cuts the visual equivalent of <code>toDelete</code> characters out of the
//     * indentation of line <code>line</code> in <code>document</code>. Leaves
//     * leading comment signs alone.
//     *
//     * @param document  the document
//     * @param line      the line
//     * @param toDelete  the number of space equivalents to delete
//     * @param tabLength the length of a tab
//     * @throws BadLocationException on concurrent document modification
//     */
//    private void cutIndent(Document document, int line, int toDelete,
//                           int tabLength) throws BadLocationException {
//        IRegion region = document.getLineInformation(line);
//        int from = region.getOffset();
//        int endOffset = region.getOffset() + region.getLength();
//
//        // go behind line comments
//        while (from < endOffset - 2
//                && document.get(from, 2).equals(LINE_COMMENT))
//            from += 2;
//
//        int to = from;
//        while (toDelete > 0 && to < endOffset) {
//            char ch = document.getChar(to);
//            if (!Character.isWhitespace(ch))
//                break;
//            toDelete -= computeVisualLength(ch, tabLength);
//            if (toDelete >= 0)
//                to++;
//            else
//                break;
//        }
//
//        document.replace(from, to - from, ""); //$NON-NLS-1$
//    }
//
//    /**
//     * Returns the visual length of a given <code>CharSequence</code> taking
//     * into account the visual tabulator length.
//     *
//     * @param seq       the string to measure
//     * @param tabLength the length of a tab
//     * @return the visual length of <code>seq</code>
//     */
//    private int computeVisualLength(CharSequence seq, int tabLength) {
//        int size = 0;
//
//        for (int i = 0; i < seq.length(); i++) {
//            char ch = seq.charAt(i);
//            if (ch == '\t') {
//                if (tabLength != 0)
//                    size += tabLength - size % tabLength;
//                // else: size stays the same
//            } else {
//                size++;
//            }
//        }
//        return size;
//    }
//
//    /**
//     * Returns the visual length of a given character taking into account the
//     * visual tabulator length.
//     *
//     * @param ch        the character to measure
//     * @param tabLength the length of a tab
//     * @return the visual length of <code>ch</code>
//     */
//    private int computeVisualLength(char ch, int tabLength) {
//        if (ch == '\t')
//            return tabLength;
//        else
//            return 1;
//    }
//
//    /**
//     * The preference setting for the visual tabulator display.
//     *
//     * @return the number of spaces displayed for a tabulator in the editor
//     */
//    private int getVisualTabLengthPreference() {
//        return 4;
//    }
//
//    private int getPeerPosition(IDocument document, DocumentCommand command) {
//        if (document.getLength() == 0)
//            return 0;
//		/*
//		 * Search for scope closers in the pasted text and find their opening
//		 * peers in the document.
//		 */
//        Document pasted = new Document(command.text);
//        installJavaStuff(pasted);
//        int firstPeer = command.offset;
//
//        JavaHeuristicScanner pScanner = new JavaHeuristicScanner(pasted);
//        JavaHeuristicScanner dScanner = new JavaHeuristicScanner(document);
//
//        // add scope relevant after context to peer search
//        int afterToken = dScanner.nextToken(command.offset + command.length,
//                JavaHeuristicScanner.UNBOUND);
//        try {
//            switch (afterToken) {
//                case Symbols.TokenRBRACE:
//                    pasted.replace(pasted.getLength(), 0, "}"); //$NON-NLS-1$
//                    break;
//                case Symbols.TokenRPAREN:
//                    pasted.replace(pasted.getLength(), 0, ")"); //$NON-NLS-1$
//                    break;
//                case Symbols.TokenRBRACKET:
//                    pasted.replace(pasted.getLength(), 0, "]"); //$NON-NLS-1$
//                    break;
//            }
//        } catch (BadLocationException e) {
//            // cannot happen
//            Assert.isTrue(false);
//        }
//
//        int pPos = 0; // paste text position (increasing from 0)
//        int dPos = Math.max(0, command.offset - 1); // document position
//        // (decreasing from paste
//        // offset)
//        while (true) {
//            int token = pScanner.nextToken(pPos, JavaHeuristicScanner.UNBOUND);
//            pPos = pScanner.getPosition();
//            switch (token) {
//                case Symbols.TokenLBRACE:
//                case Symbols.TokenLBRACKET:
//                case Symbols.TokenLPAREN:
//                    pPos = skipScope(pScanner, pPos, token);
//                    if (pPos == JavaHeuristicScanner.NOT_FOUND)
//                        return firstPeer;
//                    break; // closed scope -> keep searching
//                case Symbols.TokenRBRACE:
//                    int peer = dScanner.findOpeningPeer(dPos, '{', '}');
//                    dPos = peer - 1;
//                    if (peer == JavaHeuristicScanner.NOT_FOUND)
//                        return firstPeer;
//                    firstPeer = peer;
//                    break; // keep searching
//                case Symbols.TokenRBRACKET:
//                    peer = dScanner.findOpeningPeer(dPos, '[', ']');
//                    dPos = peer - 1;
//                    if (peer == JavaHeuristicScanner.NOT_FOUND)
//                        return firstPeer;
//                    firstPeer = peer;
//                    break; // keep searching
//                case Symbols.TokenRPAREN:
//                    peer = dScanner.findOpeningPeer(dPos, '(', ')');
//                    dPos = peer - 1;
//                    if (peer == JavaHeuristicScanner.NOT_FOUND)
//                        return firstPeer;
//                    firstPeer = peer;
//                    break; // keep searching
//                case Symbols.TokenCASE:
//                case Symbols.TokenDEFAULT:
//                    JavaIndenter indenter = new JavaIndenter(document, dScanner,
//                            fProject);
//                    peer = indenter.findReferencePosition(dPos, false, false,
//                            false, true);
//                    if (peer == JavaHeuristicScanner.NOT_FOUND)
//                        return firstPeer;
//                    firstPeer = peer;
//                    break; // keep searching
//
//                case Symbols.TokenEOF:
//                    return firstPeer;
//                default:
//                    // keep searching
//            }
//        }
//    }
//
//    private boolean isLineDelimiter(IDocument document, String text) {
//        String[] delimiters = document.getLegalLineDelimiters();
//        if (delimiters != null)
//            return TextUtilities.startsWith(delimiters, text) > -1;
//        return false;
//    }
//
//    private void smartIndentOnKeypress(IDocument document,
//                                       DocumentCommand command) {
//        switch (command.text.charAt(0)) {
//            case '}':
//                smartIndentAfterClosingBracket(document, command);
//                break;
//            case '{':
//                smartIndentAfterOpeningBracket(document, command);
//                break;
//            // quotes and brackets are handled by JavaScriptBracketInserter
//            // case '\"':
//            // case '\'':
//            // case '(':
//            // case '[':
//            // autoClose(document, command);
//            // break;
//            case 'e':
//                smartIndentUponE(document, command);
//                break;
//            case '*':
//                smartCloseJSDoc(document, command);
//                break;
//        }
//    }
//
//    private void smartIndentUponE(IDocument d, DocumentCommand c) {
//        if (c.offset < 4 || d.getLength() == 0)
//            return;
//
//        try {
//            String content = d.get(c.offset - 3, 3);
//            if (content.equals("els")) { //$NON-NLS-1$
//                JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//                int p = c.offset - 3;
//
//                // current line
//                int line = d.getLineOfOffset(p);
//                int lineOffset = d.getLineOffset(line);
//
//                // make sure we don't have any leading comments etc.
//                if (d.get(lineOffset, p - lineOffset).trim().length() != 0)
//                    return;
//
//                // line of last Java code
//                int pos = scanner.findNonWhitespaceBackward(p - 1,
//                        JavaHeuristicScanner.UNBOUND);
//                if (pos == -1)
//                    return;
//                int lastLine = d.getLineOfOffset(pos);
//
//                // only shift if the last java line is further up and is a
//                // braceless block candidate
//                if (lastLine < line) {
//
//                    JavaIndenter indenter = new JavaIndenter(d, scanner,
//                            fProject);
//                    int ref = indenter.findReferencePosition(p, true, false,
//                            false, false);
//                    if (ref == JavaHeuristicScanner.NOT_FOUND)
//                        return;
//                    int refLine = d.getLineOfOffset(ref);
//                    String indent = getIndentOfLine(d, refLine);
//
//                    if (indent != null) {
//                        c.text = indent.toString() + "else"; //$NON-NLS-1$
//                        c.length += c.offset - lineOffset;
//                        c.offset = lineOffset;
//                    }
//                }
//
//                return;
//            }
//
//            if (content.equals("cas")) { //$NON-NLS-1$
//                JavaHeuristicScanner scanner = new JavaHeuristicScanner(d);
//                int p = c.offset - 3;
//
//                // current line
//                int line = d.getLineOfOffset(p);
//                int lineOffset = d.getLineOffset(line);
//
//                // make sure we don't have any leading comments etc.
//                if (d.get(lineOffset, p - lineOffset).trim().length() != 0)
//                    return;
//
//                // line of last Java code
//                int pos = scanner.findNonWhitespaceBackward(p - 1,
//                        JavaHeuristicScanner.UNBOUND);
//                if (pos == -1)
//                    return;
//                int lastLine = d.getLineOfOffset(pos);
//
//                // only shift if the last java line is further up and is a
//                // braceless block candidate
//                if (lastLine < line) {
//
//                    JavaIndenter indenter = new JavaIndenter(d, scanner,
//                            fProject);
//                    int ref = indenter.findReferencePosition(p, false, false,
//                            false, true);
//                    if (ref == JavaHeuristicScanner.NOT_FOUND)
//                        return;
//                    int refLine = d.getLineOfOffset(ref);
//                    int nextToken = scanner.nextToken(ref,
//                            JavaHeuristicScanner.UNBOUND);
//                    String indent;
//                    if (nextToken == Symbols.TokenCASE
//                            || nextToken == Symbols.TokenDEFAULT)
//                        indent = getIndentOfLine(d, refLine);
//                    else
//                        // at the brace of the switch
//                        indent = indenter.computeIndentation(p).toString();
//
//                    if (indent != null) {
//                        c.text = indent.toString() + "case"; //$NON-NLS-1$
//                        c.length += c.offset - lineOffset;
//                        c.offset = lineOffset;
//                    }
//                }
//
//                return;
//            }
//
//        } catch (BadLocationException e) {
//            DLTKUIPlugin.log(e);
//        }
//    }
//
//    /*
//     * @see
//     * org.eclipse.jface.text.IAutoIndentStrategy#customizeDocumentCommand(org
//     * .eclipse.jface.text.IDocument, org.eclipse.jface.text.DocumentCommand)
//     */
//    @Override
//    public void customizeDocumentCommand(IDocument d, DocumentCommand c) {
//        if (c.doit == false)
//            return;
//        clearCachedValues();
//        if (!isSmartMode()) {
//            super.customizeDocumentCommand(d, c);
//            return;
//        }
//        if (!fIsSmartTab && isRepresentingTab(c.text))
//            return;
//        if (c.length == 0 && c.text != null && isLineDelimiter(d, c.text))
//            smartIndentAfterNewLine(d, c);
//        else if (c.text.length() == 1)
//            smartIndentOnKeypress(d, c);
//        else if (c.text.length() > 1
//                && getPreferenceStore().getBoolean(
//                PreferenceConstants.EDITOR_SMART_PASTE))
//            smartPaste(d, c); // no smart backspace for paste
//    }
//
//    /**
//     * Tells whether the given inserted string represents hitting the Tab key.
//     *
//     * @param text the text to check
//     * @return <code>true</code> if the text represents hitting the Tab key
//     * @since 3.0
//     */
//    private boolean isRepresentingTab(String text) {
//        if (text == null)
//            return false;
//
//        if (TabStyle.SPACES == prefs.getTabStyle()) {
//            if (text.length() == 0
//                    || text.length() > getVisualTabLengthPreference())
//                return false;
//            for (int i = 0; i < text.length(); i++) {
//                if (text.charAt(i) != ' ')
//                    return false;
//            }
//            return true;
//        } else {
//            return text.length() == 1 && text.charAt(0) == '\t';
//        }
//    }
//
//    private boolean closeBrace() {
//        return fCloseBrace;
//    }
//
//    private boolean isSmartMode() {
//        return fIsSmartMode;
//    }
//
//    private void clearCachedValues() {
//        fCloseBrace = prefs.closeBrackets();
//        fIsSmartTab = prefs.isSmartTab();
//        fIsSmartMode = computeSmartMode();
//    }
//
//    protected boolean computeSmartMode() {
//        IWorkbenchPage page = DLTKUIPlugin.getActivePage();
//        if (page != null) {
//            IEditorPart part = page.getActiveEditor();
//            if (part instanceof ITextEditorExtension3) {
//                ITextEditorExtension3 extension = (ITextEditorExtension3) part;
//                return extension.getInsertMode() == ITextEditorExtension3.SMART_INSERT;
//            }
//        }
//        return false;
//    }
//}
