package com.juliacomputing.jldt.eclipse.ui.console;

import org.eclipse.dltk.console.*;

import java.io.*;
import java.util.List;

public class JuliaConsoleInterpreter implements IScriptInterpreter {

  private static final String ENCODING = "UTF8";

  private final Process process;
  private final BufferedWriter writer;
  private final BufferedReader reader;
  private StringBuilder block = new StringBuilder();
  private int state = IScriptConsoleInterpreter.WAIT_NEW_COMMAND;

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
    block.append(command);
    block.append("\n");
    if(isIncomplete(block.toString())){
      state = IScriptConsoleInterpreter.WAIT_USER_INPUT;
      return null;
    }
    final String response = execute(block.toString());
    block = new StringBuilder();
    state = IScriptConsoleInterpreter.WAIT_NEW_COMMAND;
    return new ScriptExecResult(response);
  }

  private boolean isIncomplete(final String block) throws IOException {
    final String parseCommand = String.format("parse(\"%s\",1; greedy=true, raise=false)", block);
    final String response = execute(parseCommand);
    return response.contains("incomplete");
  }

  private String execute(String statement) throws IOException {
    writer.write(statement);
    writer.newLine();
    writer.flush();
    final StringBuilder response = new StringBuilder();
    response.append(reader.readLine());
    response.append("\n");
    while (reader.ready()) {
      response.append(reader.readLine());
      response.append("\n");
    }
    return response.toString();
  }


  @Override
  public int getState() {
    return state;
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
