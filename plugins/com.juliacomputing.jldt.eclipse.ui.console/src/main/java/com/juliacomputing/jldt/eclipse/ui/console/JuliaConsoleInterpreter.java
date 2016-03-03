package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.*;

import java.io.*;
import java.util.List;

public class JuliaConsoleInterpreter implements IScriptInterpreter {

  private static final String ENCODING = "UTF8";

  private final Process process;
  private final BufferedWriter writer;
  private final BufferedReader reader;
  private String response;

  public JuliaConsoleInterpreter(final String path) {

    try {
      ProcessBuilder builder = new ProcessBuilder(path);
      builder.redirectErrorStream(true);
      process = builder.start();
      final OutputStream outputStream = process.getOutputStream();
      writer = new BufferedWriter(new OutputStreamWriter(outputStream, ENCODING));
      final InputStream inputStream = process.getInputStream();
      reader = new BufferedReader(new InputStreamReader(inputStream, "UTF8"));
    }
    catch (IOException e) {
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
    if (command != null && !command.isEmpty()) {
      writer.write(command);
      writer.newLine();
      writer.flush();
    }
    final StringBuilder responseBuilder = new StringBuilder();
    while (reader.ready()) {
      final String line = reader.readLine();
      responseBuilder.append(line);
      responseBuilder.append("\n");
    }
    response = responseBuilder.toString();
    return new ScriptExecResult(response);
  }

  @Override
  public int getState() {
    return response == null || response.trim().isEmpty() ? IScriptConsoleInterpreter.WAIT_CONTINUE_COMMAND
        : IScriptConsoleInterpreter.WAIT_NEW_COMMAND;
  }

  @Override
  public List<?> getCompletions(String s, int i) throws IOException {
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
