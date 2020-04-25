package net.brcdev.shopgui.spawner;

import net.brcdev.shopgui.spawner.external.provider.ExternalSpawnerProvider;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class SpawnerManager {

  public ItemStack getSpawnerItem(EntityType entityType) {
    return null;
  }

  public EntityType getEntityType(ItemStack itemStack) {
    return null;
  }

  public void registerExternalSpawnerProvider(ExternalSpawnerProvider spawnerProvider) {
  }
}
