package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;

public interface ShopItem {
  double getBuyPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount);

  double getBuyPriceForAmount(int amount);

  double getSellPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount);

  double getSellPriceForAmount(int amount);
}
