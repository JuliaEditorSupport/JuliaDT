package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import java.util.Dictionary;
import java.util.Hashtable;

public class JuliaPlot extends ViewPart {
  public static final String ID = JuliaPlot.class.getName();
  private Browser browser;
  private IStatusLineManager statusLine;

  private void register(final Composite parent, final Browser browser) {
    BundleContext ctx = FrameworkUtil.getBundle(JuliaConsolePlugin.class).getBundleContext();
    EventHandler handler = new EventHandler() {
      public void handleEvent(final Event event) {
        final String plot = (String) event.getProperty("plot");
        if (parent.getDisplay().getThread() == Thread.currentThread()) {
          show(plot);
        }
        else {
          parent.getDisplay().syncExec(new Runnable() {
            public void run() {
              show(plot);
            }
          });
        }
      }

      private boolean show(String plot) {
        return browser.setText(String.format("<html>%s</html>", plot));
      }
    };

    final Dictionary<String, String> properties = new Hashtable<>();
    properties.put(EventConstants.EVENT_TOPIC, "julia/plot");
    ctx.registerService(EventHandler.class, handler, properties);
  }

  @Override
  public void createPartControl(Composite parent) {
    Composite comp = new Composite(parent, SWT.NONE);
    comp.setLayout(new GridLayout(1, true));
    try {
      browser = new Browser(comp, SWT.NONE);
    }
    catch (SWTError e) {
      JuliaConsolePlugin.showErrorMessage(getViewSite().getShell(), "Error creating browser:" + e);
      return;
    }
    browser.setLayoutData(new GridData(GridData.FILL_BOTH));
    browser.addProgressListener(new ProgressListener() {
      public void changed(ProgressEvent event) {
        onProgress(event);
      }

      public void completed(ProgressEvent event) {
      }
    });
    statusLine = getViewSite().getActionBars().getStatusLineManager();
    register(parent, browser);
  }

  @Override
  public void setFocus() {
    if (browser != null)
      browser.setFocus();
  }

  private void onProgress(ProgressEvent event) {
    if (event.total == 0)
      return;
    int ratio = event.current * 100 / event.total;
    if (statusLine != null)
      statusLine.getProgressMonitor().worked(ratio);

  }

}
