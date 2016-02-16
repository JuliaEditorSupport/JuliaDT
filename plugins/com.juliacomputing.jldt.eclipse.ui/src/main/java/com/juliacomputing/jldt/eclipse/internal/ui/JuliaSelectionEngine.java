package com.juliacomputing.jldt.eclipse.internal.ui;

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.CallExpression;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.references.SimpleReference;
import org.eclipse.dltk.codeassist.ScriptSelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.*;

import java.util.ArrayList;
import java.util.List;

//todo complete parsing
public class JuliaSelectionEngine extends ScriptSelectionEngine {

  private void findDeclaration(final ISourceModule sourceModule, final String name, final List results) {
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
  public IModelElement[] select(IModuleSource module, final int selectionStart, int selectionEnd) {
    final ISourceModule sourceModule = (ISourceModule) module.getModelElement();
    ModuleDeclaration moduleDeclaration = SourceParserUtil.getModuleDeclaration(sourceModule, null);
    final List<IModelElement> results = new ArrayList<>();
    try {
      moduleDeclaration.traverse(new ASTVisitor() {
        public boolean visit(Expression expression) throws Exception {
          if (expression.start() <= selectionStart && selectionStart <= expression.end()) {
            if (expression instanceof SimpleReference) {
              final SimpleReference reference = (SimpleReference) expression;
              findDeclaration(sourceModule, reference.getName(), results);
              return super.visit(expression);
            }
            if (expression instanceof CallExpression) {
              final CallExpression callExpression = (CallExpression) expression;
              findDeclaration(sourceModule, callExpression.getName(), results);
              return super.visit(expression);
            }
          }
          return super.visit(expression);
        }
      });
    } catch (Exception e) {
      if (DLTKCore.DEBUG) {
        e.printStackTrace();
      }
    }
    return results.toArray(new IModelElement[results.size()]);
  }
}