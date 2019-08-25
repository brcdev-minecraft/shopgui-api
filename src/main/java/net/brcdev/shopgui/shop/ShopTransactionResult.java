package net.brcdev.shopgui.shop;

import org.bukkit.entity.Player;

import static net.brcdev.shopgui.shop.ShopManager.ShopAction;

public interface ShopTransactionResult {

  ShopAction getShopAction();

  ShopTransactionResultType getResult();

  ShopItem getShopItem();

  Player getPlayer();

  int getAmount();

  double getPrice();

  enum ShopTransactionResultType {
    SUCCESS,
    FAILURE_CANCELLED,
    FAILURE_NO_MONEY,
    FAILURE_NO_ITEMS,
    FAILURE_FULL_INVENTORY
  }
}
