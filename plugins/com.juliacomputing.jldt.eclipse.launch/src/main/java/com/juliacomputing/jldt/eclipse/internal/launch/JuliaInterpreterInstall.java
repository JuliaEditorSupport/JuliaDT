package com.juliacomputing.jldt.eclipse.internal.launch;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterRunner;

public class JuliaInterpreterInstall extends AbstractInterpreterInstall {

  public JuliaInterpreterInstall(IInterpreterInstallType type, String id) {
    super(type, id);
  }

  @Override
  public String getNatureId() {
    return JuliaNature.ID;
  }

  public IInterpreterRunner getInterpreterRunner(String mode) {
    IInterpreterRunner runner = super.getInterpreterRunner(mode);
    if (runner != null)
      return runner;
    switch (mode) {
      case ILaunchManager.RUN_MODE:
        return new JuliaInterpreterRunner(this);
      default:
        return null;
    }
  }
}