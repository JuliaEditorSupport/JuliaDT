package com.juliacomputing.jldt.kernel;

import java.util.UUID;

public abstract class Command {

  private final UUID uuid = UUID.randomUUID();

  public UUID getUuid() {
    return uuid;
  }
}
