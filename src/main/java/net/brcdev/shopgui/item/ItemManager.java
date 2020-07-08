package net.brcdev.shopgui.item;

import net.brcdev.shopgui.provider.item.ItemProvider;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

public class ItemManager {

  public void registerDefaultItemProviders() {
  }

  public void registerItemProvider(ItemProvider itemProvider) {
  }

  public boolean areAllProvidersReady() {
    return false;
  }

  public ItemStack loadItem(ConfigurationSection configurationSection) {
    return null;
  }

  public boolean compare(ItemStack itemStack1, ItemStack itemStack2) {
    return false;
  }

  public void setup() {
  }
}
