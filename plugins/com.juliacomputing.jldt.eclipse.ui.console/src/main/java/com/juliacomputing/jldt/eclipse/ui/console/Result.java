package com.juliacomputing.jldt.eclipse.ui.console;

public class Result {
  private final Status status;
  private final String value;
  public Result(Status status, String value) {
    this.status = status;
    this.value = value;
  }

  public Status getStatus() {
    return status;
  }

  public String getValue() {
    return value;
  }

  public enum Status {
    complete, incomplete, error
  }


}
