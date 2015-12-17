package com.juliacomputing.jldt.eclipse.ui.editor;


import com.juliacomputing.jldt.eclipse.core.JuliaLanguageToolkit;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaPartition;
import com.juliacomputing.jldt.eclipse.ui.editor.internal.JuliaTextTools;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.ui.text.ScriptTextTools;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.ui.IEditorInput;

public class JuliaEditor extends ScriptEditor {

    public static final String ID = "com.juliacomputing.jldt.eclipse.ui.editor";
    public static final String EDITOR_CONTEXT = "#JuliaEditorContext";

    protected void initializeEditor() {
        super.initializeEditor();
        this.setEditorContextMenuId(JuliaEditor.EDITOR_CONTEXT);
    }

    @Override
    public String getEditorId() {
        return JuliaEditor.ID;
    }

    @Override
    public IDLTKLanguageToolkit getLanguageToolkit() {
        return JuliaLanguageToolkit.getDefault();
    }

    public IPreferenceStore getScriptPreferenceStore() {
        return JuliaEditorPlugin.getDefault().getPreferenceStore();
    }


    public ScriptTextTools getTextTools() {
        return JuliaEditorPlugin.getDefault().getTextTools();
    }

    protected void connectPartitioningToElement(IEditorInput input, IDocument document) {
        if (document instanceof IDocumentExtension3) {
            IDocumentExtension3 extension = (IDocumentExtension3) document;
            if (extension.getDocumentPartitioner(JuliaPartition.JULIA_PARTITIONING) == null) {
                JuliaTextTools tools = JuliaEditorPlugin.getDefault().getTextTools();
                tools.setupDocumentPartitioner(document, JuliaPartition.JULIA_PARTITIONING);
            }
        }
    }

}
