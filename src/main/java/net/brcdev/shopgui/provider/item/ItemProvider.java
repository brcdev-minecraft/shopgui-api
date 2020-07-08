package net.brcdev.shopgui.provider.item;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

public abstract class ItemProvider {

  boolean ready;

  ItemProvider() {
    this.ready = true;
  }

  public abstract String getName();

  public abstract boolean isValidItem(ItemStack itemStack);

  public abstract ItemStack loadItem(ConfigurationSection configurationSection);

  public abstract boolean compare(ItemStack itemStack1, ItemStack itemStack2);

  public boolean isReady() {
    return ready;
  }
}