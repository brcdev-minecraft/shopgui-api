package net.brcdev.shopgui.event;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class PlayerDataPostLoadEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  public abstract Player getPlayer();

  public abstract PlayerData getPlayerData();
}
