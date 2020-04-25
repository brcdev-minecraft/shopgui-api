package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;

public class ShopItem {

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
