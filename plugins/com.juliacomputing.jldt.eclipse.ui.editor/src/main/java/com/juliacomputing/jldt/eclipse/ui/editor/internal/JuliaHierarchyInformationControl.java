package com.juliacomputing.jldt.eclipse.ui.editor.internal;

import com.juliacomputing.jldt.eclipse.ui.editor.JuliaEditorPlugin;

import org.eclipse.dltk.internal.ui.typehierarchy.HierarchyInformationControl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Shell;

public class JuliaHierarchyInformationControl extends HierarchyInformationControl {

  public JuliaHierarchyInformationControl(Shell parent, int shellStyle, int treeStyle) {
    super(parent, shellStyle, treeStyle);
  }

  protected IPreferenceStore getPreferenceStore() {
    return JuliaEditorPlugin.getDefault().getPreferenceStore();
  }

}
