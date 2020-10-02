package net.brcdev.shopgui.provider.item;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public abstract class ItemProvider {

  private boolean ready;
  private String name;

  public ItemProvider(String name) {
    this.ready = true;
    this.name = name;
  }

  public abstract boolean isValidItem(ItemStack itemStack);

  public abstract ItemStack loadItem(ConfigurationSection configurationSection);

  public abstract boolean compare(ItemStack itemStack1, ItemStack itemStack2);

  public boolean isReady() {
    return ready;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ItemProvider that = (ItemProvider) o;
    return ready == that.ready && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ready, name);
  }
}
