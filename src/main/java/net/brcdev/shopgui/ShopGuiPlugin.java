package net.brcdev.shopgui;

import net.brcdev.shopgui.core.BConfig;
import net.brcdev.shopgui.database.DataManager;
import net.brcdev.shopgui.modifier.PriceModifierManager;
import net.brcdev.shopgui.player.PlayerManager;
import net.brcdev.shopgui.shop.ShopManager;
import net.brcdev.shopgui.spawner.SpawnerManager;

public interface ShopGuiPlugin {

  BConfig getConfigMain();

  BConfig getConfigLang();

  BConfig getConfigPriceModifiers();

  BConfig getConfigShops();

  DataManager getDataManager();

  PlayerManager getPlayerManager();

  PriceModifierManager getPriceModifierManager();

  ShopManager getShopManager();

  SpawnerManager getSpawnerManager();
}
