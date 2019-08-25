package net.brcdev.shopgui.event;

import net.brcdev.shopgui.shop.ShopItem;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import static net.brcdev.shopgui.shop.ShopManager.ShopAction;

public abstract class ShopPreTransactionEvent extends Event implements Cancellable {

  private static final HandlerList handlers = new HandlerList();

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public abstract boolean isCancelled();

  @Override
  public abstract void setCancelled(boolean cancel);

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }

  public abstract ShopItem getShopItem();

  public abstract ShopAction getShopAction();

  public abstract Player getPlayer();

  public abstract int getAmount();

  public abstract void setAmount(int amount);

  public abstract double getPrice();

  public abstract void setPrice(double price);
}
