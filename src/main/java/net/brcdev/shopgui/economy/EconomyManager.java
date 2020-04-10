package net.brcdev.shopgui.economy;

import net.brcdev.shopgui.provider.economy.EconomyProvider;

public interface EconomyManager {

  void registerCustomEconomyProvider(EconomyProvider economyProvider);
}
