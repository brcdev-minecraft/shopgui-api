package net.brcdev.shopgui.player;

import org.bukkit.entity.Player;

public interface PlayerManager {
  boolean isPlayerLoaded(Player player);

  PlayerData getPlayerData(Player player);
}
