package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class JuliaConsolePlugin extends AbstractUIPlugin {

  public static final String ID = "com.juliacomputing.jldt.eclipse.ui.console.JuliaConsolePlugin";

  private static JuliaConsolePlugin instance;

  public static JuliaConsolePlugin getDefault() {
    return instance;
  }

  /**
   * Returns an image descriptor for the image file at the given plug-in relative path
   * 
   * @param path
   *          the path
   * @return the image descriptor
   */
  public static ImageDescriptor getImageDescriptor(String path) {
    return imageDescriptorFromPlugin(ID, path);
  }

  private static String retrieveMessage(String property, String bundle) {
    ResourceBundle res = ResourceBundle.getBundle(bundle, Locale.getDefault());
    return (String) res.getObject(property);
  }

  static public String getString(String key) {
    return retrieveMessage(key, JuliaConsolePlugin.class.getName()); // BUNDLE_NAME);
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
    catch (NullPointerException e) {
      return "!" + key + "!";
    }
  }

  public static void showErrorMessage(Shell shell, String message) {
    MessageDialog.openError(shell, getString("err.dialog.title"), message);
  }

  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
  }

  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    instance = null;
  }
}