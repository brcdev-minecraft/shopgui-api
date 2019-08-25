package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ShopManager {
  void openShopMenu(Player player, String shopId, int page, boolean direct);

  WrappedShopItem findShopItemByItemStack(Player player, PlayerData playerData, ItemStack itemStack, boolean excludeFreeItems);

  Shop getShopById(String shopId);

  enum ShopAction {
    BUY,
    SELL,
    SELL_ALL
  }
}
