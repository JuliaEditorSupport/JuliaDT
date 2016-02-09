package com.juliacomputing.jldt.eclipse.ui.launch.configuration;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import com.juliacomputing.jldt.eclipse.launch.JuliaLaunchPlugin;

import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.debug.ui.launchConfigurations.RemoteLaunchConfigurationTab;

/**
 * 'Connect' launch configuration tab for remote julia scripts
 */
public class JuliaRemoteLaunchConfigurationTab extends RemoteLaunchConfigurationTab {

  public JuliaRemoteLaunchConfigurationTab(String mode) {
    super(mode);
  }

  /*
   * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#
   * breakOnFirstLinePrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
   */
  protected boolean breakOnFirstLinePrefEnabled(PreferencesLookupDelegate delegate) {
    return delegate.getBoolean(JuliaLaunchPlugin.ID,
        DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE);
  }

  /*
   * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#
   * dbpgLoggingPrefEnabled (org.eclipse.dltk.core.PreferencesLookupDelegate)
   */
  protected boolean dbpgLoggingPrefEnabled(PreferencesLookupDelegate delegate) {
    return delegate.getBoolean(JuliaLaunchPlugin.ID,
        DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING);
  }

  /*
   * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#getNatureID()
   */
  protected String getNatureID() {
    return JuliaNature.ID;
  }

}
