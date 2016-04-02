package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class DefaultEventHandler implements EventHandler {

  public DefaultEventHandler() {
  }

  private static Display getDisplay() {
    Display display = Display.getCurrent();
    if (display == null)
      display = Display.getDefault();
    return display;
  }

  public void handleEvent(final Event event) {
    getDisplay().syncExec(new Runnable() {
      public void run() {
        try {
          JuliaCanvas canvas = (JuliaCanvas) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
              .getActivePage().findView(JuliaCanvas.ID);
          if (canvas == null)
            canvas = (JuliaCanvas) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().showView(JuliaCanvas.ID);
          final String plot = (String) event.getProperty("plot");
          canvas.display(plot);
        }
        catch (PartInitException e) {
          e.printStackTrace();
        }
      }
    });
  }

}
