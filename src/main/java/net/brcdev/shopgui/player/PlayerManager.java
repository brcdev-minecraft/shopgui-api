package net.brcdev.shopgui.player;

import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PlayerManager {

  public boolean isPlayerLoaded(OfflinePlayer player) {
    return false;
  }

  public PlayerData getPlayerData(OfflinePlayer player) throws PlayerDataNotLoadedException {
    return null;
  }
}
