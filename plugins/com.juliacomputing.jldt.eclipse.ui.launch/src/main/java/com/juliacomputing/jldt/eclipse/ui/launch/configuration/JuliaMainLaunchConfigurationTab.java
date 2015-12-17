package com.juliacomputing.jldt.eclipse.ui.launch.configuration;

import com.juliacomputing.jldt.eclipse.core.JuliaNature;
import com.juliacomputing.jldt.eclipse.ui.launch.JuliaUILaunchPlugin;
import org.eclipse.dltk.core.PreferencesLookupDelegate;
import org.eclipse.dltk.debug.core.DLTKDebugPreferenceConstants;
import org.eclipse.dltk.debug.ui.launchConfigurations.MainLaunchConfigurationTab;

/**
 * Main launch configuration tab for julia scripts
 */
public class JuliaMainLaunchConfigurationTab extends MainLaunchConfigurationTab {

    public JuliaMainLaunchConfigurationTab(String mode) {
        super(mode);
    }

    @Override
    protected boolean canSelectDebugConsoleType() {
        return true;
    }

    /*
     * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#breakOnFirstLinePrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
     */
    @Override
    protected boolean breakOnFirstLinePrefEnabled(
            PreferencesLookupDelegate delegate) {
        return delegate.getBoolean(JuliaUILaunchPlugin.ID,
                DLTKDebugPreferenceConstants.PREF_DBGP_BREAK_ON_FIRST_LINE);
    }

    /*
     * @see org.eclipse.dltk.debug.ui.launchConfigurations.ScriptLaunchConfigurationTab#dbpgLoggingPrefEnabled(org.eclipse.dltk.core.PreferencesLookupDelegate)
     */
    @Override
    protected boolean dbpgLoggingPrefEnabled(PreferencesLookupDelegate delegate) {
        return delegate.getBoolean(JuliaUILaunchPlugin.ID,
                DLTKDebugPreferenceConstants.PREF_DBGP_ENABLE_LOGGING);
    }

    /**
     * @since 2.0
     */
    @Override
    public String getNatureID() {
        return JuliaNature.ID;
    }

}
