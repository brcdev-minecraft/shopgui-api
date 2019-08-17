package net.brcdev.shopgui.exception.item;

public class InvalidEnchantmentException extends ItemLoadException {

  public InvalidEnchantmentException() {
    super("Invalid enchantment name specified");
  }
}
