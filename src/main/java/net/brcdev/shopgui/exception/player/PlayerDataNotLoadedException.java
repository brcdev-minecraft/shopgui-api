package net.brcdev.shopgui.exception.player;

import org.bukkit.OfflinePlayer;

public class PlayerDataNotLoadedException extends Exception {

  public PlayerDataNotLoadedException(OfflinePlayer player) {
    super(String.format("%s's player data wasn't loaded from the database yet", player.getName()));
  }
}
