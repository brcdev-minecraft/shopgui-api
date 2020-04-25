package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static net.brcdev.shopgui.shop.ShopManager.ItemType;

public class ShopItem {

  public String getId() {
    return null;
  }

  public ItemStack getItem() {
    return null;
  }

  public ItemStack getPlaceholder() {
    return null;
  }

  public ItemType getType() {
    return null;
  }

  public int getPage() {
    return 0;
  }

  public int getSlot() {
    return 0;
  }

  public double getBuyPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount) {
    return 0;
  }

  public double getBuyPriceForAmount(int amount) {
    return 0;
  }

  public double getSellPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount) {
    return 0;
  }

  public double getSellPriceForAmount(int amount) {
    return 0;
  }
}
