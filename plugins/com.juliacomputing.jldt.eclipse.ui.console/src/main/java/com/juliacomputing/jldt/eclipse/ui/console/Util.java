package com.juliacomputing.jldt.eclipse.ui.console;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by snefru on 22/03/2016.
 */
public class Util {

  private static final String ENCODING = "UTF-8";

  private Util() {
  }

  static String escapedString(String str, boolean escapeSingleQuote) throws IOException {
    final StringWriter out = new StringWriter();
    if (out == null) {
      throw new IllegalArgumentException("The Writer must not be null");
    }
    if (str == null) {
      return str;
    }

    int sz;
    sz = str.length();
    for (int i = 0; i < sz; i++) {
      char ch = str.charAt(i);

      // handle unicode
      if (ch > 0xfff) {
        out.write("\\u" + hex(ch));
      }
      else if (ch > 0xff) {
        out.write("\\u0" + hex(ch));
      }
      else if (ch > 0x7f) {
        out.write("\\u00" + hex(ch));
      }
      else if (ch < 32) {
        switch (ch) {
          case '\b':
            out.write('\\');
            out.write('b');
            break;
          case '\n':
            out.write('\\');
            out.write('n');
            break;
          case '\t':
            out.write('\\');
            out.write('t');
            break;
          case '\f':
            out.write('\\');
            out.write('f');
            break;
          case '\r':
            out.write('\\');
            out.write('r');
            break;
          default:
            if (ch > 0xf) {
              out.write("\\u00" + hex(ch));
            }
            else {
              out.write("\\u000" + hex(ch));
            }
            break;
        }
      }
      else {
        switch (ch) {
          case '\'':
            if (escapeSingleQuote) {
              out.write('\\');
            }
            out.write('\'');
            break;
          case '"':
            out.write('\\');
            out.write('"');
            break;
          case '\\':
            out.write('\\');
            out.write('\\');
            break;
          default:
            out.write(ch);
            break;
        }
      }
    }
    return out.toString();
  }

  private static String hex(char ch) {
    return Integer.toHexString(ch).toUpperCase(Locale.getDefault());
  }

  static void publish(final String plot, String topic) {
    BundleContext ctx = FrameworkUtil.getBundle(JuliaConsolePlugin.class).getBundleContext();
    ServiceReference<EventAdmin> ref = ctx.getServiceReference(EventAdmin.class);
    EventAdmin eventAdmin = ctx.getService(ref);
    Map<String, Object> properties = new HashMap<>();
    properties.put("plot", plot);
    Event event = new Event(topic, properties);
    eventAdmin.sendEvent(event);
  }

  static final String sample() {
    return read("script/sample.xml");
  }

  static String read(String path) {
    URL url = FrameworkUtil.getBundle(JuliaConsolePlugin.class).getEntry(path);
    try (InputStream stream = url.openStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, ENCODING))) {
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        builder.append(line);
        builder.append(System.lineSeparator());
      }
      return builder.toString();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
