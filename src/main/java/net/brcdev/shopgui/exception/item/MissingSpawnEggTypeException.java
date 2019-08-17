package net.brcdev.shopgui.exception.item;

public class MissingSpawnEggTypeException extends ItemLoadException {

  public MissingSpawnEggTypeException() {
    super("Entity type for the spawn egg wasn't provided");
  }
}
