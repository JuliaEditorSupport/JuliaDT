package com.juliacomputing.jldt.eclipse.ui.formatter;

import com.juliacomputing.jldt.eclipse.ui.formatter.internal.ISymbols;
import com.juliacomputing.jldt.eclipse.ui.formatter.internal.JuliaHeuristicScanner;
import com.juliacomputing.jldt.eclipse.ui.formatter.internal.JuliaPreferenceInterpreter;
import com.juliacomputing.jldt.eclipse.ui.formatter.internal.JuliaSymbols;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.text.util.AutoEditUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.*;

import java.util.Arrays;


//based on dltk.ruby
public class JuliaAutoIndentStrategy extends DefaultIndentLineAutoEditStrategy {

    private static final int[] INDENT_TO_BLOCK_TOKENS = {
            JuliaSymbols.TokenELSE, JuliaSymbols.TokenELSIF,
            JuliaSymbols.TokenEND, JuliaSymbols.TokenENSURE,
            JuliaSymbols.TokenRESCUE, JuliaSymbols.TokenWHEN,
            JuliaSymbols.TokenRBRACE};
    private static final int[] CONTINUATION_TOKENS = {
            JuliaSymbols.TokenBACKSLASH, JuliaSymbols.TokenCOMMA,
            JuliaSymbols.TokenSLASH, JuliaSymbols.TokenPLUS,
            JuliaSymbols.TokenMINUS, JuliaSymbols.TokenSTAR};
    private static final int[] REMOVE_IDENTATION_TOKENS = {
            JuliaSymbols.TokenRDOCBEGIN, JuliaSymbols.TokenRDOCEND};

    static {
        Arrays.sort(INDENT_TO_BLOCK_TOKENS);
        Arrays.sort(CONTINUATION_TOKENS);
        Arrays.sort(REMOVE_IDENTATION_TOKENS);
    }

    private boolean fIsSmartMode;
    private boolean fCloseBlocks = true;
    private JuliaPreferenceInterpreter fPreferences;


    public JuliaAutoIndentStrategy(String partitioning) {
        this(partitioning, JuliaFormatterPlugin.getDefault().getPreferenceStore());
    }

    public JuliaAutoIndentStrategy(String partitioning, IPreferenceStore store) {
        fPreferences = new JuliaPreferenceInterpreter(store);
    }

//    private void clearCachedValues() {
//        fCloseBlocks = fPreferences.closeBlocks();
//        fIsSmartMode = fPreferences.isSmartMode();
//    }

    private static int getBlockBalance(IDocument document, int offset) {
        if (offset < 1)
            return -1;
        if (offset >= document.getLength())
            return 1;

        int begin = offset;
        int end = offset - 1;

        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(document);

        while (true) {
            begin = scanner.findBlockBeginningOffset(begin);
            end = scanner.findBlockEndingOffset(end);
            if (begin == JuliaHeuristicScanner.NOT_FOUND
                    && end == JuliaHeuristicScanner.NOT_FOUND)
                return 0;
            if (begin == JuliaHeuristicScanner.NOT_FOUND)
                return -1;
            if (end == JuliaHeuristicScanner.NOT_FOUND)
                return 1;
        }
    }

    private void closeBlock(IDocument d, DocumentCommand c, String indent,
                            String afterCursor, JuliaHeuristicScanner scanner)
            throws BadLocationException {
        c.caretOffset = c.offset + c.text.length();
        c.length = afterCursor.length();
        c.shiftsCaret = false;
        String delimiter = TextUtilities.getDefaultLineDelimiter(d);
        c.text += afterCursor.trim() + delimiter + indent
                + getApropriateBlockEnding(d, scanner, c.offset);
    }

    private String getApropriateBlockEnding(IDocument d,
                                            JuliaHeuristicScanner scanner, int offset)
            throws BadLocationException {
        int beginning = scanner.findBlockBeginningOffset(offset);
        if (beginning == JuliaHeuristicScanner.NOT_FOUND)
            throw new BadLocationException();

        IRegion line = d.getLineInformationOfOffset(beginning);
        int ending = Math.min(line.getOffset() + line.getLength(), offset);
        int blockOffset = scanner.findBlockBeginningOffset(ending);
        int token = scanner.nextToken(blockOffset, ending);
        if (token == JuliaSymbols.TokenLBRACE) {
            return "}"; //$NON-NLS-1$
        } else {
            return "end"; //$NON-NLS-1$
        }
    }

    private boolean isSmartMode() {
        return fIsSmartMode;
    }

    public void customizeDocumentCommand(IDocument d, DocumentCommand c) {
        if (c.doit == false)
            return;

//        clearCachedValues();
//        if (!isSmartMode()) {
//            super.customizeDocumentCommand(d, c);
//            return;
//        }

        try {
            if (c.length == 0 && c.text != null && isLineDelimiter(d, c.text))
                smartIndentAfterNewLine(d, c);
            else if (c.length == 0 && c.text != null && isSpace(c.text))
                smartInsertEndOnSpace(d, c);
            else if (isRepresentingTab(c.text))
                smartTab(d, c);
            else if (c.text.length() == 1)
                smartIndentOnKeypress(d, c);
            else if (c.text.length() > 1 && fPreferences.isSmartPaste())
                smartPaste(d, c); // no smart backspace for paste
            else
                super.customizeDocumentCommand(d, c);
        } catch (BadLocationException e) {
            DLTKUIPlugin.log(e);
        }
    }

    /**
     * @param document
     * @param c
     * @throws BadLocationException
     */
    private void smartInsertEndOnSpace(IDocument document, DocumentCommand c)
            throws BadLocationException {
        IRegion line = document.getLineInformationOfOffset(c.offset);
        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(document);
        int prevToken = scanner.previousToken(c.offset - 1, line.getOffset());
        if (c.offset > 1 && prevToken == ISymbols.TokenEOF) {
            return;
        }
        int prevTokenOffset = scanner.getPosition();
        if (prevTokenOffset < 0)
            prevTokenOffset = 0;
        String previous = document.get(prevTokenOffset,
                c.offset - prevTokenOffset).trim();

        int hasOffset = line.getOffset();
        int hasLength = (prevTokenOffset - line.getOffset());
        boolean hasPrefixContent = ((hasLength > 0) && (document.get(hasOffset,
                hasLength).trim().length() > 0));

        hasOffset = (prevTokenOffset + previous.length() + 1);
        hasLength = (line.getLength() - (hasOffset - line.getOffset()));
        boolean hasSuffixContent = ((hasLength > 0)
                && ((hasOffset + hasLength) <= document.getLength()) && (document
                .get(hasOffset, hasLength).trim().length() > 0));

        if (!"case".equals(previous) && !"class".equals(previous) //$NON-NLS-1$ //$NON-NLS-2$
                && !"def".equals(previous) && !"do".equals(previous) //$NON-NLS-1$ //$NON-NLS-2$
                && !"if".equals(previous) && !"module".equals(previous) //$NON-NLS-1$ //$NON-NLS-2$
                && !"unless".equals(previous) //$NON-NLS-1$
                && !"while".equals(previous)) //$NON-NLS-1$
            return;
        if ((hasPrefixContent && !"do".equals(previous)) //$NON-NLS-1$
                || hasSuffixContent)
            return;
        if ((prevTokenOffset + previous.length()) < (c.offset - 1))
            return;
        if (fCloseBlocks && !isBlockClosed(document, c.offset)) {
            c.caretOffset = c.offset + 1;
            c.shiftsCaret = false;
            c.text = c.text + TextUtilities.getDefaultLineDelimiter(document)
                    + getBlockIndent(document, c.offset, scanner) + "end"; //$NON-NLS-1$
        }
    }

    /**
     * Tells whether the given inserted string represents hitting the Tab key.
     *
     * @param text the text to check
     * @return <code>true</code> if the text represents hitting the Tab key
     * @since 3.5
     */
    private boolean isRepresentingTab(String text) {
        if (text == null)
            return false;

        if (isInsertingSpacesForTab()) {
            if (text.length() == 0
                    || text.length() > getVisualTabLengthPreference())
                return false;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) != ' ')
                    return false;
            }
            return true;
        } else
            return text.length() == 1 && text.charAt(0) == '\t';
    }

    /**
     * The preference setting that tells whether to insert spaces when pressing
     * the Tab key.
     *
     * @return <code>true</code> if spaces are inserted when pressing the Tab
     * key
     * @since 3.5
     */
    private boolean isInsertingSpacesForTab() {
        return CodeFormatterConstants.SPACE.equals(getOption(JuliaFormatterPlugin.ID,
                CodeFormatterConstants.FORMATTER_TAB_CHAR));
    }

    private IScriptProject getProject() {
        // TODO implement getProject()
        return null;
    }

    private String getOption(String qualifier, String key) {
        return new PreferencesLookupDelegate(getProject()).getString(qualifier,
                key);
    }

    private int getIntOption(String qualifier, String key) {
        return new PreferencesLookupDelegate(getProject()).getInt(qualifier,
                key);
    }

    private int getVisualTabLengthPreference() {
        return getIntOption(JuliaFormatterPlugin.ID,
                CodeFormatterConstants.FORMATTER_TAB_SIZE);
    }

    private boolean isSpace(String text) {
        return text.length() == 1 && text.charAt(0) == ' ';
    }

    private boolean isLineDelimiter(IDocument document, String text) {
        String[] delimiters = document.getLegalLineDelimiters();
        return delimiters != null
                && TextUtilities.equals(delimiters, text) > -1;
    }

    private void smartTab(IDocument d, DocumentCommand c)
            throws BadLocationException {
        IRegion info = d.getLineInformationOfOffset(c.offset);
        int endOffset = info.getOffset() + info.getLength();
        String line = d.get(info.getOffset(), info.getLength());
        String linePrefix = line.substring(0, c.offset - info.getOffset());
        final String linePostfix = line.substring(c.offset - info.getOffset(),
                endOffset - info.getOffset());
        String postfixIndent = AutoEditUtils.getLineIndent(linePostfix);

        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(d);
        String rightIndent;
        if (nextIsIdentToBlockToken(scanner, c.offset, endOffset)) {
            rightIndent = getBlockIndent(d, c.offset, scanner);
        } else {
            rightIndent = getLineIndent(d, c.offset, scanner);
        }

        if (linePrefix.trim().length() != 0
                || (linePostfix.trim().length() != 0
                && postfixIndent.length() == 0 && computeVisualLength(linePrefix) >= computeVisualLength(rightIndent))) {
            c.text = indentation();
            return;
        }

        c.text = rightIndent + linePostfix.trim();
        c.offset = info.getOffset();
        c.length = info.getLength();
        c.caretOffset = info.getOffset() + rightIndent.length();
        c.shiftsCaret = false;
    }

    private void smartIndentOnKeypress(IDocument d, DocumentCommand c)
            throws BadLocationException {
        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(d);
        IRegion info = d.getLineInformationOfOffset(c.offset);
        int token = scanner.previousTokenAfterInput(c.offset, c.text);

        if (Arrays.binarySearch(INDENT_TO_BLOCK_TOKENS, token) >= 0) {
            String indent = ""; //$NON-NLS-1$
            indent = getBlockIndent(d, info.getOffset(), scanner);

            // ssanders: If Block was opened on same line, add extra indent
            int blockStart = scanner.findBlockBeginningOffset(c.offset);
            int prevBlockStart = scanner.findBlockBeginningOffset(info
                    .getOffset());
            if (blockStart >= info.getOffset() && prevBlockStart != -1)
                indent += indentation();

            int pos = scanner.findNonWhitespaceForwardInAnyPartition(info
                    .getOffset(), c.offset);
            String line = ""; //$NON-NLS-1$
            if (pos != JuliaHeuristicScanner.NOT_FOUND) {
                line = d.get(pos, c.offset - pos);
            }

            c.text = indent + line + c.text;
            c.length = c.offset - info.getOffset();
            c.offset = info.getOffset();

        } else if (Arrays.binarySearch(REMOVE_IDENTATION_TOKENS, token) >= 0) {
            int start = scanner.findNonWhitespaceForward(info.getOffset(),
                    c.offset);
            c.text = d.get(start, c.offset - start) + c.text;
            c.length = c.offset - info.getOffset();
            c.offset = info.getOffset();
        } else {
            // if previous was indented to block, restore original indentation
            int wsPos = scanner.findNonIdentifierBackward(c.offset, info
                    .getOffset());
            int previosToken = scanner.previousToken(c.offset, wsPos);
            if (Arrays.binarySearch(INDENT_TO_BLOCK_TOKENS, previosToken) >= 0
                    && Character.isJavaIdentifierPart(c.text.charAt(0))) {
                String indent = getPreviousLineIndent(d, info.getOffset() - 1,
                        scanner);

                int pos = scanner.findNonWhitespaceForwardInAnyPartition(info
                        .getOffset(), c.offset);
                String line = ""; //$NON-NLS-1$
                if (pos != JuliaHeuristicScanner.NOT_FOUND) {
                    line = d.get(pos, c.offset - pos);
                }

                c.text = indent + line + c.text;
                c.length = c.offset - info.getOffset();
                c.offset = info.getOffset();
            }
        }
    }

    private String getLineIndent(IDocument d, int offset,
                                 JuliaHeuristicScanner scanner) {
        int blockOffset = scanner.findBlockBeginningOffset(offset);
        if (blockOffset != JuliaHeuristicScanner.NOT_FOUND) {
            try {
                return AutoEditUtils.getLineIndent(d, d
                        .getLineOfOffset(blockOffset))
                        + indentation();
            } catch (BadLocationException e) {
                DLTKUIPlugin.log(e);
            }
        }
        return ""; //$NON-NLS-1$
    }

    private String indentation() {
        return "  ";
//        return fPreferences.getIndent();
    }

    private String getBlockIndent(IDocument d, int offset,
                                  JuliaHeuristicScanner scanner) {
        int blockOffset = scanner.findBlockBeginningOffset(offset);
        if (blockOffset != JuliaHeuristicScanner.NOT_FOUND) {
            try {
                return AutoEditUtils.getLineIndent(d, d
                        .getLineOfOffset(blockOffset));
            } catch (BadLocationException e) {
                DLTKUIPlugin.log(e);
            }
        }
        return ""; //$NON-NLS-1$
    }

    private void smartIndentAfterNewLine(IDocument d, DocumentCommand c)
            throws BadLocationException {
        IRegion line = d.getLineInformationOfOffset(c.offset);
        int lineEnd = line.getOffset() + line.getLength();
        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(d);

        // eat pending whitespace
        int nonWsPos = scanner.findNonWhitespaceForwardInAnyPartition(c.offset,
                lineEnd);
        if (nonWsPos != JuliaHeuristicScanner.NOT_FOUND) {
            c.length = nonWsPos - c.offset;
        }

        // if pending statement is end, else etc. then indent it to block
        // beginning
        if (nextIsIdentToBlockToken(scanner, c.offset, lineEnd)) {
            c.text += getBlockIndent(d, c.offset, scanner);
            return;
        }

        // else
        String indent = getPreviousLineIndent(d, c.offset, scanner);
        c.text += indent;

        if (previousIsBlockBeginning(d, scanner, c.offset)) {
            // if this line was beginning of the block
            c.text += indentation();

            // Auto close blocks
            if (fCloseBlocks
                    && scanner.isBlockBeginning(line.getOffset(), lineEnd)
                    && !isBlockClosed(d, c.offset)) {
                closeBlock(d, c, indent, d.get(c.offset, lineEnd - c.offset),
                        scanner);
            }
        } else if (previousIsFirstContinuation(d, scanner, c.offset, line
                .getOffset())) {
            // or if this line was the first line ending with one of
            // continuation symbols
            c.text += indentation();

        } else if (hasUnclosedParen(scanner, c.offset, line.getOffset())) {
            // or if this line contains unclosed paren
            c.text += indentation();
        }
    }

    private boolean hasUnclosedParen(JuliaHeuristicScanner scanner, int offset,
                                     int bound) {
        int pos = scanner.findOpeningPeer(offset, bound, '(', ')');
        return pos != JuliaHeuristicScanner.NOT_FOUND;
    }

    private boolean previousIsFirstContinuation(IDocument d,
                                                JuliaHeuristicScanner scanner, int offset, int bound)
            throws BadLocationException {

        IRegion previousLine = null;
        int line = d.getLineOfOffset(offset);
        if (line > 0) {
            previousLine = d.getLineInformation(line - 1);
        }

        return previousIsContinuation(scanner, offset, bound)
                && (previousLine == null || !previousIsContinuation(scanner,
                previousLine.getOffset() + previousLine.getLength(),
                previousLine.getOffset()));

    }

    private boolean previousIsContinuation(JuliaHeuristicScanner scanner,
                                           int offset, int bound) {
        int token = scanner.previousToken(offset, bound);
        return Arrays.binarySearch(CONTINUATION_TOKENS, token) >= 0;
    }

    private boolean previousIsBlockBeginning(IDocument d,
                                             JuliaHeuristicScanner scanner, int offset)
            throws BadLocationException {
        int previousLineOffset = scanner.findPrecedingNotEmptyLine(offset);
        IRegion previousLine = d.getLineInformationOfOffset(previousLineOffset);
        int previousLineEnd = Math.min(previousLine.getOffset()
                + previousLine.getLength(), offset);

        boolean previousIsBlockBeginning = scanner.isBlockBeginning(
                previousLine.getOffset(), previousLineEnd)
                || scanner.isBlockMiddle(previousLine.getOffset(),
                previousLineEnd);
        return previousIsBlockBeginning;
    }

    private boolean nextIsIdentToBlockToken(JuliaHeuristicScanner scanner,
                                            int offset, int bound) {
        int token = scanner.nextToken(offset, bound);
        return Arrays.binarySearch(INDENT_TO_BLOCK_TOKENS, token) >= 0;
    }

    private void smartPaste(IDocument d, DocumentCommand c)
            throws BadLocationException {
        // fix first line whitespace
        IRegion info = d.getLineInformationOfOffset(c.offset);
        String line = d.get(info.getOffset(), c.offset - info.getOffset());
        int startFixFrom = 1;
        if (line.trim().length() == 0) {
            c.length += line.length();
            c.offset -= line.length();
            startFixFrom = 0;
        }

        JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(d);
        String indent = getLineIndent(d, c.offset, scanner);
        String delimiter = TextUtilities.getDefaultLineDelimiter(d);
        boolean addLastDelimiter = c.text.endsWith(delimiter);
        String[] lines = c.text.split(delimiter);
        if (lines.length > startFixFrom) {
            String currentIndent = ""; //$NON-NLS-1$
            for (int i = startFixFrom; i < lines.length; i++) {
                if (lines[i].trim().length() != 0) {
                    currentIndent = AutoEditUtils.getLineIndent(lines[i]);
                    break;
                }
            }

            int shift = computeVisualLength(indent)
                    - computeVisualLength(currentIndent);
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < startFixFrom; i++) {
                result.append(lines[i]).append(delimiter);
            }
            for (int i = startFixFrom; i < lines.length - 1; i++) {
                result.append(shiftIdentation(lines[i], shift)).append(
                        delimiter);
            }
            result.append(shiftIdentation(lines[lines.length - 1], shift));
            if (addLastDelimiter) {
                result.append(delimiter);
            }

            c.text = result.toString();
        }
    }

    private String shiftIdentation(String line, int shift) {
        if (shift > 0) {
            return fPreferences.getIndentByVirtualSize(shift) + line;
        } else {
            int pos = 0;
            while (shift < 0 && pos < line.length()
                    && Character.isWhitespace(line.charAt(pos))) {
                shift += computeVisualLength(line.substring(pos, pos + 1));
                pos++;
            }
            return line.substring(pos);
        }
    }

    /**
     * Computes the length of a <code>CharacterSequence</code>, counting a tab
     * character as the size until the next tab stop and every other character
     * as one.
     *
     * @param indent the string to measure
     * @return the visual length in characters
     */
    private int computeVisualLength(CharSequence indent) {
        final int tabSize = fPreferences.getTabSize();
        int length = 0;
        for (int i = 0; i < indent.length(); i++) {
            char ch = indent.charAt(i);
            switch (ch) {
                case '\t':
                    if (tabSize > 0) {
                        int reminder = length % tabSize;
                        length += tabSize - reminder;
                    }
                    break;
                case ' ':
                    length++;
                    break;
            }
        }
        return length;
    }

    /**
     * Computes the indentation at <code>offset</code>.
     *
     * @param scanner
     * @param offset  the offset in the document
     * @return a String which reflects the correct indentation for the line in
     * which offset resides, or <code>null</code> if it cannot be
     * determined
     * @throws BadLocationException
     */
    private String getPreviousLineIndent(IDocument d, int offset,
                                         JuliaHeuristicScanner scanner) throws BadLocationException {
        StringBuffer result = new StringBuffer();

        if (offset < 0 || d.getLength() == 0)
            return result.toString();

        // find start of line
        int start = scanner.findPrecedingNotEmptyLine(offset);
        IRegion info = d.getLineInformationOfOffset(start);
        int end = scanner.findNonWhitespaceForwardInAnyPartition(start, start
                + info.getLength());

        if (end > start) {
            // append to input
            result.append(d.get(start, end - start));
        }
        return result.toString();
    }

    private boolean isBlockClosed(IDocument document, int offset)
            throws BadLocationException {
        // TODO: Remove this comment when Julia parser become able to report
        // unclosed blocks
        //
        // JuliaHeuristicScanner scanner = new JuliaHeuristicScanner(document);
        // IRegion sourceRange = scanner.findSurroundingBlock(offset);
        // if (sourceRange != null) {
        // String source = document.get(sourceRange.getOffset(), sourceRange
        // .getLength());
        // char[] buffer = source.toCharArray();
        //
        // SyntaxErrorListener listener = new SyntaxErrorListener();
        // ISourceParser parser;
        // try {
        // parser = DLTKLanguageManager
        // .getSourceParser(JuliaNature.NATURE_ID);
        // parser.parse(null, buffer, listener);
        // if (listener.errorOccured())
        // return false;
        // } catch (CoreException e) {
        // DLTKUIPlugin.log(e);
        // }
        // }
        return getBlockBalance(document, offset) <= 0;
    }
}