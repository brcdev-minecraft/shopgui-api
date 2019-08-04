package net.brcdev.shopgui;

import net.brcdev.shopgui.player.PlayerManager;
import net.brcdev.shopgui.shop.ShopManager;

public interface ShopGuiPlugin {
  PlayerManager getPlayerManager();

  ShopManager getShopManager();
}
