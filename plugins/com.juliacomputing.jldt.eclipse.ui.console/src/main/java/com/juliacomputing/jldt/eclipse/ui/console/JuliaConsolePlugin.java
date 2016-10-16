package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import java.text.MessageFormat;
import java.util.*;

public class JuliaConsolePlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.ui.console.JuliaConsolePlugin";
  public static final String JULIA_PLOT_TOPIC = "julia/plot";

  private static JuliaConsolePlugin instance;

  public static JuliaConsolePlugin getDefault() {
    return instance;
  }

  private static String retrieveMessage(String property, String bundle) {
    final ResourceBundle resourceBundle = ResourceBundle.getBundle(bundle, Locale.getDefault());
    return (String) resourceBundle.getObject(property);
  }

  static public String getString(String key) {
    return retrieveMessage(key, JuliaConsolePlugin.class.getName());
  }

  /**
   * Returns a string from the resource bundle and binds it with the given arguments. If the key is
   * not found, return the key.
   */
  public static String getString(String key, Object[] args) {
    try {
      return MessageFormat.format(getString(key), args);
    }
    catch (MissingResourceException e) {
      return key;
    }
  }

  public static void log(final String message) {
    log(new Status(Status.INFO, ID, message));
  }

  public static void log(IStatus status) {
    getDefault().getLog().log(status);
  }

  public static void log(Throwable e) {
    log(new Status(4, JuliaConsolePlugin.class.getName(), e.getMessage()));
  }

  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
    registerEventHadnlers();
  }

  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    instance = null;
  }

  private void registerEventHadnlers() {
    final BundleContext ctx = FrameworkUtil.getBundle(JuliaConsolePlugin.class).getBundleContext();
    final Dictionary<String, String> properties = new Hashtable<>();
    properties.put(EventConstants.EVENT_TOPIC, JULIA_PLOT_TOPIC);
    ctx.registerService(EventHandler.class, new DefaultEventHandler(), properties);
  }
}