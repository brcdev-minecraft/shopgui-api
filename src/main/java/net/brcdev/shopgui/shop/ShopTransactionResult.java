package net.brcdev.shopgui.shop;

import org.bukkit.entity.Player;

import static net.brcdev.shopgui.shop.ShopManager.ShopAction;

public class ShopTransactionResult {

  public ShopAction getShopAction() {
    return null;
  }

  public ShopTransactionResultType getResult() {
    return null;
  }

  public ShopItem getShopItem() {
    return null;
  }

  public Player getPlayer() {
    return null;
  }

  public int getAmount() {
    return 0;
  }

  public double getPrice() {
    return 0;
  }

  public enum ShopTransactionResultType {
    SUCCESS,
    FAILURE_CANCELLED,
    FAILURE_NO_MONEY,
    FAILURE_NO_ITEMS,
    FAILURE_FULL_INVENTORY
  }
}
