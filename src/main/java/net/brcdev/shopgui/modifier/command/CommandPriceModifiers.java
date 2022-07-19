package net.brcdev.shopgui.modifier.command;

import net.brcdev.shopgui.modifier.PriceModifierActionType;
import net.brcdev.shopgui.modifier.PriceModifierEntry;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.item.ShopItem;

import java.util.Map;

public class CommandPriceModifiers {

  public PriceModifierEntry getGlobalModifier() {
    return null;
  }

  public Map<String, PriceModifierEntry> getShopModifiers() {
    return null;
  }

  public Map<String, Map<String, PriceModifierEntry>> getItemModifiers() {
    return null;
  }

  public double getItemModifier(ShopItem shopItem, PriceModifierActionType type) {
    return 0.0d;
  }

  public void setItemModifier(ShopItem shopItem, PriceModifierActionType type, double modifier) {
  }

  public void resetItemModifier(ShopItem shopItem, PriceModifierActionType type) {
  }

  public double getShopModifier(Shop shop, PriceModifierActionType type) {
    return 0.0d;
  }

  public void setShopModifier(Shop shop, PriceModifierActionType type, double modifier) {
  }

  public void resetShopModifier(Shop shop, PriceModifierActionType type) {
  }

  public double getGlobalModifier(PriceModifierActionType type) {
    return 0.0d;
  }

  public void setGlobalModifier(PriceModifierActionType type, double modifier) {
  }

  public void resetGlobalModifier(PriceModifierActionType type) {
  }
}
