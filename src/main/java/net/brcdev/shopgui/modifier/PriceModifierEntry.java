package net.brcdev.shopgui.modifier;

public class PriceModifierEntry {

  public double get(PriceModifierActionType type) {
    return 0.0d;
  }

  public void set(PriceModifierActionType type, double modifier) {
  }

  public void reset(PriceModifierActionType type) {
  }

  public boolean isPrimary() {
    return false;
  }

  public String formatPlaceholders(String str) {
    return null;
  }
}
