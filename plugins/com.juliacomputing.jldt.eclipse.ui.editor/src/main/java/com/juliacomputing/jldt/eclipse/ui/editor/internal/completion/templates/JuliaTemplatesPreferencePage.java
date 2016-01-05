package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion.templates;

import com.juliacomputing.jldt.eclipse.core.JuliaPartition;
import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;
import com.juliacomputing.jldt.eclipse.ui.editor.JuliaSourceViewerConfiguration;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaTextTools;
import org.eclipse.dltk.ui.templates.ScriptTemplateAccess;
import org.eclipse.dltk.ui.templates.ScriptTemplatePreferencePage;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.text.IDocument;

public class JuliaTemplatesPreferencePage extends ScriptTemplatePreferencePage {

    protected ScriptSourceViewerConfiguration createSourceViewerConfiguration() {
        return new JuliaSourceViewerConfiguration(getTextTools()
                .getColorManager(), getPreferenceStore(), null,
                JuliaPartition.JULIA_PARTITIONING);
    }

    protected void setDocumentParticioner(IDocument document) {
        getTextTools().setupDocumentPartitioner(document, JuliaPartition.JULIA_PARTITIONING);
    }

    protected void setPreferenceStore() {
        setPreferenceStore(JuliaEditorPlugin.getDefault().getPreferenceStore());
    }

    protected ScriptTemplateAccess getTemplateAccess() {
        return JuliaTemplateAccess.getInstance();
    }

    private JuliaTextTools getTextTools() {
        return JuliaEditorPlugin.getDefault().getTextTools();
    }
}
