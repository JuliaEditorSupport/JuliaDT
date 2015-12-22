package com.juliacomputing.jldt.eclipse.ui.editor;

import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaCodeScanner;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaColourConstants;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaContentAssistPreference;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaPartition;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.JuliaScriptCompletionProcessor;
import org.eclipse.dltk.ui.text.*;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.information.IInformationPresenter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.texteditor.ITextEditor;

public class JuliaSourceViewerConfiguration extends ScriptSourceViewerConfiguration {

    private AbstractScriptScanner codeScanner;
    private AbstractScriptScanner stringScanner;
    private AbstractScriptScanner commentScanner;

    public JuliaSourceViewerConfiguration(IColorManager colorManager,
                                          IPreferenceStore preferenceStore, ITextEditor editor,
                                          String partitioning) {
        super(colorManager, preferenceStore, editor, partitioning);
    }

    public String[] getIndentPrefixes(ISourceViewer sourceViewer, String contentType) {
        return new String[]{"\t", "        "};
    }

    protected ContentAssistPreference getContentAssistPreference() {
        return JuliaContentAssistPreference.getDefault();
    }

    protected void initializeScanners() {
        codeScanner = new JuliaCodeScanner(getColorManager(), fPreferenceStore);
        stringScanner = new SingleTokenScriptScanner(getColorManager(), fPreferenceStore, JuliaColourConstants.STRING);
        commentScanner = new SingleTokenScriptScanner(getColorManager(), fPreferenceStore, JuliaColourConstants.COMMENT);
    }

    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
        PresentationReconciler reconciler = new ScriptPresentationReconciler();
        reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(codeScanner);
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        dr = new DefaultDamagerRepairer(stringScanner);
        reconciler.setDamager(dr, JuliaPartition.STRING);
        reconciler.setRepairer(dr, JuliaPartition.STRING);

        dr = new DefaultDamagerRepairer(commentScanner);
        reconciler.setDamager(dr, JuliaPartition.COMMENT);
        reconciler.setRepairer(dr, JuliaPartition.COMMENT);

        return reconciler;
    }

    public void handlePropertyChangeEvent(PropertyChangeEvent event) {
        if (codeScanner.affectsBehavior(event)) {
            codeScanner.adaptToPreferenceChange(event);
        }
        if (stringScanner.affectsBehavior(event)) {
            stringScanner.adaptToPreferenceChange(event);
        }
    }

    public boolean affectsTextPresentation(PropertyChangeEvent event) {
        return codeScanner.affectsBehavior(event) || stringScanner.affectsBehavior(event);
    }

    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
        return null;
    }

    public IAnnotationHover getOverviewRulerAnnotationHover(ISourceViewer sourceViewer) {
        return null;
    }

    public int[] getConfiguredTextHoverStateMasks(ISourceViewer sourceViewer, String contentType) {
        return null;
    }

    public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask) {
        return null;
    }

    public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
        return null;
    }


    public IInformationControlCreator getInformationControlCreator(ISourceViewer sourceViewer) {
        return null;
    }

    public IInformationPresenter getInformationPresenter(ISourceViewer sourceViewer) {
        return null;
    }

    public IInformationPresenter getOutlinePresenter(ISourceViewer sourceViewer, boolean doCodeResolve) {
        return null;
    }

    public IInformationPresenter getHierarchyPresenter(ISourceViewer sourceViewer, boolean doCodeResolve) {
        return null;
    }

    public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) {
        return null;
    }

    protected void alterContentAssistant(ContentAssistant assistant) {
        IContentAssistProcessor scriptProcessor = new JuliaScriptCompletionProcessor(getEditor(), assistant, IDocument.DEFAULT_CONTENT_TYPE);
        assistant.setContentAssistProcessor(scriptProcessor, IDocument.DEFAULT_CONTENT_TYPE);
    }

    public IAutoEditStrategy[] getAutoEditStrategies(final ISourceViewer sourceViewer, String contentType) {
        return new IAutoEditStrategy[]{new ScriptDefaultIndentLineAutoEditStrategy(JuliaEditorPlugin.getDefault().getPreferenceStore())};
    }


}