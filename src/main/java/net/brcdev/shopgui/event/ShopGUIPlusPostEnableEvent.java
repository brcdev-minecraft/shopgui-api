package net.brcdev.shopgui.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class ShopGUIPlusPostEnableEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  public ShopGUIPlusPostEnableEvent() {
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}
