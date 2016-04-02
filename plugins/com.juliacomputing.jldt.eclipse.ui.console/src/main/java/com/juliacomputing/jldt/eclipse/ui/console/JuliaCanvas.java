package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import java.util.Dictionary;
import java.util.Hashtable;

public class JuliaCanvas extends ViewPart {
  public static final String ID = JuliaCanvas.class.getName();
  private Browser browser;


  @Override
  public void createPartControl(Composite parent) {
    final Composite composite = new Composite(parent, SWT.NONE);
    composite.setLayout(new GridLayout(1, true));
    browser = new Browser(composite, SWT.NONE);
    browser.setLayoutData(new GridData(GridData.FILL_BOTH));
  }

  @Override
  public void setFocus() {
    if (browser != null)
      browser.setFocus();
  }

  public boolean display(final String plot) {
    return browser.setText(String.format("<!DOCTYPE html>" + "<html>" + "<head>"
        + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\"/>" + "</head>" + "<body>"
        + "%s" + "</body>" + "</html>", plot));
  }
}
