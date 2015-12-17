package com.juliacomputing.jldt.eclipse.ui.editor;

import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaCodeScanner;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaColourConstants;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaContentAssistPreference;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaPartition;
import org.eclipse.dltk.ui.text.*;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
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

    public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
        return new IAutoEditStrategy[]{new DefaultIndentLineAutoEditStrategy()};
    }

    public String[] getIndentPrefixes(ISourceViewer sourceViewer,
                                      String contentType) {
        return new String[]{"\t", "        "};
    }

    protected ContentAssistPreference getContentAssistPreference() {
        return JuliaContentAssistPreference.getDefault();
    }

    protected void initializeScanners() {
        this.codeScanner = new JuliaCodeScanner(this.getColorManager(), this.fPreferenceStore);
        this.stringScanner = new SingleTokenScriptScanner(this.getColorManager(), this.fPreferenceStore, JuliaColourConstants.STRING);
        this.commentScanner = new SingleTokenScriptScanner(this.getColorManager(), this.fPreferenceStore, JuliaColourConstants.COMMENT);
    }

    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
        PresentationReconciler reconciler = new ScriptPresentationReconciler();
        reconciler.setDocumentPartitioning(this.getConfiguredDocumentPartitioning(sourceViewer));

        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(this.codeScanner);
        reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
        reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

        dr = new DefaultDamagerRepairer(this.stringScanner);
        reconciler.setDamager(dr, JuliaPartition.STRING);
        reconciler.setRepairer(dr, JuliaPartition.STRING);

        dr = new DefaultDamagerRepairer(this.commentScanner);
        reconciler.setDamager(dr, JuliaPartition.COMMENT);
        reconciler.setRepairer(dr, JuliaPartition.COMMENT);

        return reconciler;
    }

    public void handlePropertyChangeEvent(PropertyChangeEvent event) {
        if (this.codeScanner.affectsBehavior(event)) {
            this.codeScanner.adaptToPreferenceChange(event);
        }
        if (this.stringScanner.affectsBehavior(event)) {
            this.stringScanner.adaptToPreferenceChange(event);
        }
    }

    public boolean affectsTextPresentation(PropertyChangeEvent event) {
        return this.codeScanner.affectsBehavior(event) || this.stringScanner.affectsBehavior(event);
    }
}