package net.brcdev.shopgui.spawner.external.provider;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public interface ExternalSpawnerProvider {

  /**
   * Returns an unique name of the spawner provider. It's recommended to use your plugin's name here.
   *
   * @return unique name of the spawner provider
   */
  String getName();

  /**
   * Gets the spawner item stack.
   *
   * @param entityType Type of spawned entity
   * @return spawner item stack
   */
  ItemStack getSpawnerItem(EntityType entityType);

  /**
   * Gets the type of a spawner from an item stack.
   *
   * @param itemStack Spawner item stack
   * @return entity name
   */
  EntityType getSpawnerEntityType(ItemStack itemStack);
}
