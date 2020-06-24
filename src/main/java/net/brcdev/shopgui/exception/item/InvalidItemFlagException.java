package net.brcdev.shopgui.exception.item;

import net.brcdev.shopgui.exception.item.ItemLoadException;

public class InvalidItemFlagException extends ItemLoadException {

  public InvalidItemFlagException() {
    super("Invalid item flag name specified");
  }
}
