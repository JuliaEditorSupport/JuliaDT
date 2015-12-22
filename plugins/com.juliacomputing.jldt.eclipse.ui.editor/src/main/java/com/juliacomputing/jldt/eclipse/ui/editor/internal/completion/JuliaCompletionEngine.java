package com.juliacomputing.jldt.eclipse.ui.editor.internal.completion;

import org.eclipse.dltk.codeassist.ScriptCompletionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;

public class JuliaCompletionEngine extends ScriptCompletionEngine {
    @Override
    public void complete(IModuleSource moduleSource, int i, int i1) {
        final String content = moduleSource.getSourceContents();
        System.out.println("content = " + content);
    }


//    IScriptProject project;
//    private CompletionRequestor requestor;
//    private int actualCompletionPosition;
//    private int offset;
//
//    public void complete(IModuleSource module, int position, int pos) {
//        actualCompletionPosition = position;
//        offset = pos;
//        for(String keyword:JuliaCodeScanner.KEYWORDS)
//            createProposal(keyword, null);
//        // Completion for model elements.
//        try {
//            module.getModelElement().accept(element -> {
//                if (element.getElementType() > IModelElement.SOURCE_MODULE) {
//                    createProposal(element.getElementName(), element);
//                }
//                return true;
//            });
//        } catch (ModelException e) {
//            if (DLTKCore.DEBUG) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private void createProposal(String name, IModelElement element) {
//        CompletionProposal proposal;
//        try {
//            if (element == null) {
//                proposal = createProposal(CompletionProposal.KEYWORD, actualCompletionPosition);
//            } else {
//                switch (element.getElementType()) {
//                    case IModelElement.METHOD:
//                        proposal = createProposal(
//                                CompletionProposal.METHOD_DECLARATION, actualCompletionPosition);
//                        proposal.setFlags(((IMethod) element).getFlags());
//                        break;
//                    case IModelElement.FIELD:
//                        proposal = createProposal(CompletionProposal.FIELD_REF, actualCompletionPosition);
//                        proposal.setFlags(((IField) element).getFlags());
//                        break;
//                    case IModelElement.TYPE:
//                        proposal = createProposal(CompletionProposal.TYPE_REF, actualCompletionPosition);
//                        proposal.setFlags(((IType) element).getFlags());
//                        break;
//                    default:
//                        proposal = createProposal(CompletionProposal.KEYWORD, actualCompletionPosition);
//                        break;
//                }
//            }
//            proposal.setName(name);
//            proposal.setCompletion(name);
//            proposal.setReplaceRange(actualCompletionPosition - offset, actualCompletionPosition - offset);
//            proposal.setRelevance(20);
//            proposal.setModelElement(element);
//            requestor.accept(proposal);
//        } catch (Exception e) {
//        }
//    }
//
//    public void setOptions(@SuppressWarnings("rawtypes") Map options) {
//    }
//
//    public void setProject(IScriptProject project) {
//        this.project = project;
//    }
//
//    public void setRequestor(CompletionRequestor requestor) {
//        this.requestor = requestor;
//    }
//
//    protected CompletionProposal createProposal(int kind, int completionOffset) {
//        CompletionProposal proposal = CompletionProposal.create(kind, completionOffset - offset);
//
//        return proposal;
//    }
//
//    @Override
//    public void setProgressMonitor(IProgressMonitor nullProgressMonitor) {
//        // empty
//    }
}