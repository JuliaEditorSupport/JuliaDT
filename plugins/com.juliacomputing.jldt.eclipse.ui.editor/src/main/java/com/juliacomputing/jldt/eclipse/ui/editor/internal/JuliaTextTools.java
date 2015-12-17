package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.ui.texteditor.ITextEditor;

public class JuliaTextTools extends ScriptTextTools {

    private static final String[] LEGAL_CONTENT_TYPES = {
            JuliaPartition.STRING,
            JuliaPartition.COMMENT};

    private final IPartitionTokenScanner partitionScanner;

    public JuliaTextTools(boolean autoDisposeOnDisplayDispose) {
        super(JuliaPartition.JULIA_PARTITIONING,
                JuliaTextTools.LEGAL_CONTENT_TYPES, autoDisposeOnDisplayDispose);
        this.partitionScanner = new JuliaPartitionScanner();
    }

    public ScriptSourceViewerConfiguration createSourceViewerConfiguraton(
            IPreferenceStore preferenceStore, ITextEditor editor,
            String partitioning) {
        return new JuliaSourceViewerConfiguration(this.getColorManager(),
                preferenceStore, editor, partitioning);
    }

    public IPartitionTokenScanner getPartitionScanner() {
        return this.partitionScanner;
    }
}
