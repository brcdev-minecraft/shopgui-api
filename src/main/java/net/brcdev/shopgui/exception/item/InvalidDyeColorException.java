package net.brcdev.shopgui.exception.item;

public class InvalidDyeColorException extends ItemLoadException {

  public InvalidDyeColorException() {
    super("Invalid dye color specified");
  }
}
