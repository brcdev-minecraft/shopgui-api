package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ShopManager {

  public void openMainMenu(final Player player) {
  }

  public void openShopMenu(Player player, String shopId, int page, boolean direct) {
  }

  public WrappedShopItem findShopItemByItemStack(Player player, PlayerData playerData, ItemStack itemStack,
                                                 boolean excludeFreeItems) {
    return null;
  }

  public WrappedShopItem findShopItemByItemStack(ItemStack itemStack, boolean excludeFreeItems) {
    return null;
  }

  public Shop getShopById(String shopId) {
    return null;
  }

  public enum ShopAction {
    BUY,
    SELL,
    SELL_ALL
  }
}
