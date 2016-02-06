package com.juliacomputing.jldt.eclipse.internal.ui;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.declarations.TypeDeclaration;
import org.eclipse.dltk.codeassist.ScriptSelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.*;

import java.util.ArrayList;
import java.util.List;

//todo complete parsing
public class JuliaSelectionEngine extends ScriptSelectionEngine {
    private ISourceModule sourceModule;


    private void findDeclaration(final String name, final List results) {
        try {
            sourceModule.accept(new IModelElementVisitor() {
                @Override
                public boolean visit(final IModelElement element) {
                    if (element.getElementName().equals(name)) {
                        results.add(element);
                    }
                    return true;
                }
            });
        } catch (ModelException e) {
            if (DLTKCore.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public IModelElement[] select(IModuleSource module, final int offset, int i) {
        sourceModule = (ISourceModule) module.getModelElement();
        ModuleDeclaration moduleDeclaration = SourceParserUtil
                .getModuleDeclaration(sourceModule, null);
        final List results = new ArrayList();
        try {
            moduleDeclaration.traverse(new ASTVisitor() {

                public boolean visit(MethodDeclaration s) throws Exception {
                    if (s.getNameStart() <= offset && offset <= s.getNameEnd()) {
                        findDeclaration(s.getName(), results);
                    }
                    return super.visit(s);
                }

                public boolean visit(TypeDeclaration s) throws Exception {
                    if (s.getNameStart() <= offset && offset <= s.getNameEnd()) {
                        findDeclaration(s.getName(), results);
                    }
                    return super.visit(s);
                }

            });
        } catch (Exception e) {
            if (DLTKCore.DEBUG) {
                e.printStackTrace();
            }
        }
        return (IModelElement[]) results.toArray(new IModelElement[results
                .size()]);
    }
}