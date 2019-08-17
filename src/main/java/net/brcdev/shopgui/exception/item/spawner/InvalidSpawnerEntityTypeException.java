package net.brcdev.shopgui.exception.item.spawner;

import net.brcdev.shopgui.exception.item.ItemLoadException;

public class InvalidSpawnerEntityTypeException extends ItemLoadException {

  public InvalidSpawnerEntityTypeException() {
    super("Invalid spawner entity type provided");
  }
}
