package com.juliacomputing.jldt.eclipse.ui.editor;

import com.juliacomputing.jldt.eclipse.ui.editor.internal.*;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.JuliaScriptCompletionProcessor;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.dltk.internal.ui.editor.ScriptSourceViewer;
import org.eclipse.dltk.internal.ui.text.ScriptElementProvider;
import org.eclipse.dltk.ui.text.*;
import org.eclipse.dltk.ui.text.completion.ContentAssistPreference;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.*;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.information.IInformationPresenter;
import org.eclipse.jface.text.information.IInformationProvider;
import org.eclipse.jface.text.information.InformationPresenter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
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

    protected void alterContentAssistant(ContentAssistant assistant) {
        IContentAssistProcessor scriptProcessor = new JuliaScriptCompletionProcessor(getEditor(), assistant, IDocument.DEFAULT_CONTENT_TYPE);
        assistant.setContentAssistProcessor(scriptProcessor, IDocument.DEFAULT_CONTENT_TYPE);
    }

    public IAutoEditStrategy[] getAutoEditStrategies(final ISourceViewer sourceViewer, String contentType) {
        return new IAutoEditStrategy[]{new JuliaAutoIndent()};
    }


    public IInformationPresenter getHierarchyPresenter(
            ScriptSourceViewer sourceViewer, boolean doCodeResolve) {
        // Do not create hierarchy presenter if there's no CU.
        if (getEditor() != null
                && getEditor().getEditorInput() != null
                && EditorUtility.getEditorInputModelElement(getEditor(), true) == null)
            return null;

        InformationPresenter presenter = new InformationPresenter(
                getHierarchyPresenterControlCreator(sourceViewer));
        presenter
                .setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
        presenter.setAnchor(AbstractInformationControlManager.ANCHOR_GLOBAL);
        IInformationProvider provider = new ScriptElementProvider(getEditor(),
                doCodeResolve);
        presenter.setInformationProvider(provider,
                IDocument.DEFAULT_CONTENT_TYPE);

        presenter.setSizeConstraints(50, 20, true, false);
        return presenter;
    }


    private IInformationControlCreator getHierarchyPresenterControlCreator(
            ISourceViewer sourceViewer) {
        return new IInformationControlCreator() {
            public IInformationControl createInformationControl(Shell parent) {
                int shellStyle = SWT.RESIZE;
                int treeStyle = SWT.V_SCROLL | SWT.H_SCROLL;
                return new JuliaHierarchyInformationControl(parent, shellStyle,
                        treeStyle);
            }
        };
    }

}