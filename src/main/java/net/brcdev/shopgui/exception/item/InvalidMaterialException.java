package net.brcdev.shopgui.exception.item;

public class InvalidMaterialException extends ItemLoadException {

  public InvalidMaterialException() {
    super("Invalid or no material name specified");
  }
}
