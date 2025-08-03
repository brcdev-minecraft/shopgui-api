package net.brcdev.shopgui.gui.gui;

import net.brcdev.shopgui.player.PlayerData;
import net.brcdev.shopgui.shop.Shop;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class OpenGui {

  public Inventory getInventory() {
    return null;
  }

  public void setInventory(Inventory inventory) {
  }

  public Player getPlayer() {
    return null;
  }

  public void setPlayer(Player player) {
  }

  public PlayerData getPlayerData() {
    return null;
  }

  public void setPlayerData(PlayerData playerData) {
  }

  public MenuType getType() {
    return null;
  }

  public void setType(MenuType type) {
  }

  public Shop getShop() {
    return null;
  }

  public void setShop(Shop shop) {
  }

  public Inventory getOpenInventory() {
    return null;
  }

  public void setOpenInventory(Inventory openInventory) {
  }

  public enum MenuType {
    AMOUNT_SELECTION,
    AMOUNT_SELECTION_BULK_BUY,
    AMOUNT_SELECTION_BULK_SELL,
    SHOP,
    MAIN,
  }
}
