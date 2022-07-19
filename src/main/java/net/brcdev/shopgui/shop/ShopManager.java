package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.exception.shop.ShopsNotLoadedException;
import net.brcdev.shopgui.shop.item.ShopItem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public class ShopManager {

  public Set<Shop> getShops() throws ShopsNotLoadedException {
    return null;
  }

  public boolean areShopsLoaded() {
    return false;
  }

  public void load() {
  }

  public void openMainMenu(final Player player) {
  }

  public void openShopMenu(Player player, String shopId, int page, boolean direct) {
  }

  public ShopItem findShopItemByItemStack(Player player, ItemStack itemStack, boolean excludeFreeItems) {
    return null;
  }

  public ShopItem findShopItemByItemStack(ItemStack itemStack, boolean excludeFreeItems) {
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
