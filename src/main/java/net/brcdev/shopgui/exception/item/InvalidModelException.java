package net.brcdev.shopgui.exception.item;

public class InvalidModelException extends ItemLoadException {

  public InvalidModelException() {
    super("Invalid model specified");
  }
}
