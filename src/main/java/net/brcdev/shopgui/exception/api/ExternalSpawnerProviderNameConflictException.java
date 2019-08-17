package net.brcdev.shopgui.exception.api;

public class ExternalSpawnerProviderNameConflictException extends Exception {

  public ExternalSpawnerProviderNameConflictException(String providerName) {
    super(String.format("Spawner provider with name '%s' is already registered!", providerName));
  }
}