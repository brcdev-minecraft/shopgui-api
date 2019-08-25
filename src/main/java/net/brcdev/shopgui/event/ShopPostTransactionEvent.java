package net.brcdev.shopgui.event;

import net.brcdev.shopgui.shop.ShopTransactionResult;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public abstract class ShopPostTransactionEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public abstract HandlerList getHandlers();

  public abstract ShopTransactionResult getResult();
}
