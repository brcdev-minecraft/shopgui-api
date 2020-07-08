package net.brcdev.shopgui.exception.item;

public class MissingItemDefinitionException extends ItemLoadException {

  public MissingItemDefinitionException() {
    super("No item specified");
  }
}
