package net.brcdev.shopgui.modifier;

import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.ShopItem;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class PriceModifierManager {

  public PriceModifier getPriceModifier(Player player, ShopItem shopItem, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    return null;
  }

  public void setPriceModifier(Player player, ShopItem shopItem, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
  }

  public void resetPriceModifier(OfflinePlayer player, ShopItem shopItem, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
  }

  public PriceModifier getPriceModifier(Player player, Shop shop, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {

    return null;
  }

  public void setPriceModifier(Player player, Shop shop, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
  }

  public void resetPriceModifier(OfflinePlayer player, Shop shop, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
  }

  public PriceModifier getPriceModifier(Player player, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {

    return null;
  }

  public void setPriceModifier(Player player, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
  }

  public void resetPriceModifier(OfflinePlayer player, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
  }
}
