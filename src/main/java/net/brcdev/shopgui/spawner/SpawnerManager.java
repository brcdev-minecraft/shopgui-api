package net.brcdev.shopgui.spawner;

import net.brcdev.shopgui.spawner.external.provider.ExternalSpawnerProvider;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public interface SpawnerManager {

  ItemStack getSpawnerItem(EntityType entityType);

  EntityType getEntityType(ItemStack itemStack);

  void registerExternalSpawnerProvider(ExternalSpawnerProvider spawnerProvider);
}
