package com.juliacomputing.jldt.eclipse.ui.console;

import com.juliacomputing.jldt.eclipse.ui.console.Result.Status;

import org.eclipse.dltk.console.*;

import java.io.*;
import java.util.List;

public class JuliaConsoleInterpreter implements IScriptInterpreter {

  private static final String ENCODING = "UTF8";
  private static final String REPL_WRAPPER = "module EclipseREPL %n" +
          "  function execute(statement)%n" +
          "    status=\"complete\" %n" +
          "    try %n" +
          "      expression = parse(statement,1; greedy=true, raise=false)%n" +
          "      if isa(expression[1],Expr) %n" +
          "        state = expression[1].head%n" +
          "      else%n" +
          "        state = nothing%n" +
          "      end      %n" +
          "      status = state==:incomplete ? \"incomplete\" : state==:error ? \"error\" : \"complete\"%n" +
          "      result=nothing%n" +
          "      if(status==\"complete\")%n" +
          "        result=include_string(statement)%n" +
          "        if result!=nothing%n" +
          "          println(result)%n" +
          "        end%n" +
          "      end%n" +
          "    catch e%n" +
          "        showerror(STDOUT, e); println()%n " +
          "        status = \"error\"%n" +
          "    finally  %n" +
          "      flush(STDOUT)%n" +
          "      println(\"<<$status>>\")%n" +
          "      println(\"<<eox>>\")%n" +
          "    end  %n" +
          "  end%n" +
          "end%n";

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
      writer.write(String.format(REPL_WRAPPER));
      writer.newLine();
      writer.flush();
      reader.readLine();

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
    block.append(command.replace("\"", "\\\""));
    block.append(System.lineSeparator());
    final String message = String.format("EclipseREPL.execute(\"%s\")", block);
    final Result result = execute(message);
    return new ScriptExecResult(result.getValue());
  }

  private Result execute(String statement) throws IOException {
    writer.write(statement);
    writer.newLine();
    writer.flush();
    final StringBuilder response = new StringBuilder();
    //final String statusLine = reader.readLine().trim();
   
    String line = reader.readLine().trim();
    System.out.println("*****"+line);
    while (!line.contains("<<")){
    	response.append(line);
    	response.append(System.lineSeparator());
    	line = reader.readLine().trim();
    	System.out.println("*****"+line);
    }
    final Status status = Status.valueOf(line.substring(2, line.length()-2));
    line = reader.readLine().trim();
    System.out.println("*****"+line);
    while (!line.equals("<<eox>>")) {
      response.append(line);
      response.append(System.lineSeparator());
      line = reader.readLine().trim();
      System.out.println("*****"+line);
    }
    switch (status) {
      case incomplete:
        state = IScriptConsoleInterpreter.WAIT_USER_INPUT;
        return null;
      default:
        state = IScriptConsoleInterpreter.WAIT_NEW_COMMAND;
        block = new StringBuilder();
        return new Result(status, response.toString());
    }
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
