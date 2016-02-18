package com.juliacomputing.jldt.eclipse.launch;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;

import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;

public class JuliaLaunchConfigurationDelegate extends AbstractScriptLaunchConfigurationDelegate {

  @Override
  public String getLanguageId() {
    return JuliaNature.ID;
  }

}
