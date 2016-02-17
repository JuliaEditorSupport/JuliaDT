package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.IScriptConsoleIO;
import org.eclipse.dltk.console.IScriptExecResult;
import org.eclipse.dltk.console.IScriptInterpreter;
import org.eclipse.dltk.console.ScriptExecResult;

import java.io.*;
import java.util.List;


public class JuliaConsoleInterpreter implements IScriptInterpreter {

  private static final String EOM = "\"<eom>\"";

  private final Process process;
  private final BufferedWriter writer;
  private final BufferedReader reader;

  public JuliaConsoleInterpreter() {

    try {
      ProcessBuilder builder = new ProcessBuilder("/Applications/Julia-0.4.1.app/Contents/Resources/julia/bin/julia");
      builder.redirectErrorStream(true);
      process = builder.start();
      final OutputStream outputStream = process.getOutputStream();
      writer = new BufferedWriter(new OutputStreamWriter(outputStream));
      final InputStream inputStream = process.getInputStream();
      reader = new BufferedReader(new InputStreamReader(inputStream));
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }


  @Override
  public void addInitialListenerOperation(Runnable runnable) {

  }

  @Override
  public InputStream getInitialOutputStream() {
    return process.getInputStream();
  }

  @Override
  public boolean isValid() {
    return true;
  }

  @Override
  public void consoleConnected(IScriptConsoleIO iScriptConsoleIO) {
  }

  @Override
  public IScriptExecResult exec(String command) throws IOException {
    writer.write(command);
    writer.newLine();
    writer.write(EOM);
    writer.newLine();
    writer.flush();
    final StringBuilder response = new StringBuilder();
    String line;
    while (!(line = reader.readLine()).contains(EOM)) {
      response.append(line);
      response.append("\n");
    }
    response.append(line.replace(EOM, ""));
    return new ScriptExecResult(response.toString());
  }

  @Override
  public int getState() {
    return 0;
  }

  @Override
  public List getCompletions(String s, int i) throws IOException {
    return null;
  }

  @Override
  public String getDescription(String s, int i) throws IOException {
    return null;
  }

  @Override
  public String[] getNames(String s) throws IOException {
    return new String[0];
  }

  @Override
  public void close() throws IOException {
    process.destroy();
  }
}
