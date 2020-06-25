package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import static net.brcdev.shopgui.shop.ShopManager.ItemType;

public class ShopItem {

  public ShopItem(Shop shop, String id, ItemType type) {
  }

  public ShopItem(Shop shop, String id, ItemType type, ItemStack item, boolean unstack, int page, int slot,
                  double buyPrice, double sellPrice, int originalStackSize) {
  }

  public Shop getShop() {
    return null;
  }

  public void setShop(Shop shop) {
  }

  public String getId() {
    return null;
  }

  public void setId(String id) {
  }

  public ItemStack getItem() {
    return null;
  }

  public void setItem(ItemStack item) {
  }

  public ItemStack getPlaceholder() {
    return null;
  }

  public void setPlaceholder(ItemStack placeholder) {
  }

  public ItemType getType() {
    return null;
  }

  public void setType(ItemType type) {
  }

  public int getPage() {
    return 0;
  }

  public void setPage(int page) {
  }

  public int getSlot() {
    return 0;
  }

  public void setSlot(int slot) {
  }

  public double getBuyPrice() {
    return 0;
  }

  public void setBuyPrice(double buyPrice) {
  }

  public double getBuyPrice(Player player, PlayerData playerData) {
    return 0;
  }

  public double getSellPrice() {
    return 0;
  }

  public void setSellPrice(double sellPrice) {
  }

  public double getSellPrice(Player player, PlayerData playerData) {
    return 0;
  }

  public double getBuyPriceForAmount(Player player, PlayerData playerData, int amount) {
    return 0;
  }

  public double getBuyPriceForAmount(int amount) {
    return 0;
  }

  public double getSellPriceForAmount(Player player, PlayerData playerData, int amount) {
    return 0;
  }

  public double getSellPriceForAmount(int amount) {
    return 0;
  }
}
