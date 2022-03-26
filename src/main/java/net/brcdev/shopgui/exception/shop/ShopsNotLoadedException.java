package net.brcdev.shopgui.exception.shop;

public class ShopsNotLoadedException extends Exception {

  public ShopsNotLoadedException() {
    super("Shops aren't loaded yet");
  }
}
