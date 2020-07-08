package net.brcdev.shopgui.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class ShopsPostLoadEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  public ShopsPostLoadEvent() {
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}
