package net.brcdev.shopgui.exception.player;

import org.bukkit.entity.Player;

public class PlayerDataNotLoadedException extends Exception {

  public PlayerDataNotLoadedException(Player player) {
    super(String.format("%s's player data wasn't loaded from the database yet", player.getName()));
  }
}