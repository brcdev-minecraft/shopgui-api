package net.brcdev.shopgui;

import net.brcdev.shopgui.exception.api.ExternalSpawnerProviderNameConflictException;
import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import net.brcdev.shopgui.modifier.PriceModifier;
import net.brcdev.shopgui.modifier.PriceModifierActionType;
import net.brcdev.shopgui.provider.economy.EconomyProvider;
import net.brcdev.shopgui.provider.item.ItemProvider;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.item.ShopItem;
import net.brcdev.shopgui.spawner.external.provider.ExternalSpawnerProvider;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ShopGuiPlusApi {

  private static ShopGuiPlugin shopGuiPlugin;

  /**
   * Gets shop with specified shop ID
   *
   * @param shopId ID of the shop
   * @return requested shop if exists, null otherwise
   */
  public static Shop getShop(String shopId) {
    return shopGuiPlugin.getShopManager().getShopById(shopId);
  }

  /**
   * Opens the main shop menu to the specified player
   *
   * @param player Player
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void openMainMenu(Player player) throws PlayerDataNotLoadedException {
    if (!shopGuiPlugin.getPlayerManager().isPlayerLoaded(player)) {
      throw new PlayerDataNotLoadedException(player);
    }

    shopGuiPlugin.getShopManager().openMainMenu(player);
  }

  /**
   * Opens the specified shop to the specified player
   *
   * @param player Player
   * @param shopId Shop ID
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void openShop(Player player, String shopId, int page) throws PlayerDataNotLoadedException {
    if (!shopGuiPlugin.getPlayerManager().isPlayerLoaded(player)) {
      throw new PlayerDataNotLoadedException(player);
    }

    shopGuiPlugin.getShopManager().openShopMenu(player, shopId, page, false);
  }

  /**
   * Gets the {@link Shop shop} where an item stack belongs to
   *
   * @param player    Player attempting to get the shop (eg. won't return shops the player doesn't have
   *                  access to)
   * @param itemStack Item stack to search for
   * @return shop if found, null otherwise
   */
  public static Shop getItemStackShop(Player player, ItemStack itemStack) {
    ShopItem shopItem = getShopItem(player, itemStack);
    return shopItem != null ? shopItem.getShop() : null;
  }

  /**
   * Gets the {@link Shop shop} where an item stack belongs to. It searches all shops, including these the
   * player may not have access to. It's safer and recommended to use
   * {@link #getItemStackShop(Player player, ItemStack itemStack)} instead.
   *
   * @param itemStack Item stack to search for
   * @return shop if found, null otherwise
   */
  public static Shop getItemStackShop(ItemStack itemStack) {
    ShopItem shopItem = getShopItem(itemStack);
    return shopItem != null ? shopItem.getShop() : null;
  }

  /**
   * Gets a {@link ShopItem shop item} of an item stack
   *
   * @param player    Player attempting to get the shop item (eg. won't return shop items in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to search for
   * @return shop item if found, null otherwise
   */
  public static ShopItem getItemStackShopItem(Player player, ItemStack itemStack) {
    return getShopItem(player, itemStack);
  }

  /**
   * Gets a {@link ShopItem shop item} of an item stack. Warning: This ignores price modifiers a player could
   * potentially have. It also searches all shops, including these the player may not have access to. It's safer and
   * recommended to use {@link #getItemStackShopItem(Player, ItemStack)} instead.
   *
   * @param itemStack Item stack to search for
   * @return shop item if found, null otherwise
   */
  public static ShopItem getItemStackShopItem(ItemStack itemStack) {
    return getShopItem(itemStack);
  }

  /**
   * Gets buy price of an item
   *
   * @param player    Player attempting to get the buy the item (eg. won't check prices in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to check
   * @return buy price for the specified amount if found, -1.0 otherwise
   */
  public static double getItemStackPriceBuy(Player player, ItemStack itemStack) {
    ShopItem shopItem = getShopItem(player, itemStack);

    if (shopItem == null) {
      return -1.0;
    }

    return shopItem.getBuyPriceForAmount(player, itemStack.getAmount());
  }

  /**
   * Gets buy price of an item. Warning: This ignores price modifiers a player could potentially have. It also
   * searches all shops, including these the player may not have access to. It's safer and
   * recommended to use {@link #getItemStackPriceBuy(Player, ItemStack)} instead.
   *
   * @param itemStack Item stack to check
   * @return buy price for the specified amount if found, -1.0 otherwise
   */
  public static double getItemStackPriceBuy(ItemStack itemStack) {
    ShopItem shopItem = getShopItem(itemStack);

    if (shopItem == null) {
      return -1.0;
    }

    return shopItem.getBuyPriceForAmount(itemStack.getAmount());
  }

  /**
   * Gets price of an item
   *
   * @param player    Player attempting to get the sell the item (eg. won't check prices in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to check
   * @return sell price for the specified amount if found, -1.0 otherwise
   */
  public static double getItemStackPriceSell(Player player, ItemStack itemStack) {
    ShopItem shopItem = getShopItem(player, itemStack);

    if (shopItem == null) {
      return -1.0;
    }

    return shopItem.getSellPriceForAmount(player, itemStack.getAmount());
  }

  /**
   * Gets price of an item. Warning: This ignores price modifiers a player could potentially have. It also searches
   * all shops, including these the player may not have access to. It's safer and recommended to use
   * {@link #getItemStackPriceSell(Player, ItemStack)} instead.
   *
   * @param itemStack Item stack to check
   * @return sell price for the specified amount if found, -1.0 otherwise
   */
  public static double getItemStackPriceSell(ItemStack itemStack) {
    ShopItem shopItem = getShopItem(itemStack);

    if (shopItem == null) {
      return -1.0;
    }

    return shopItem.getSellPriceForAmount(itemStack.getAmount());
  }

  /**
   * Gets player's price modifier for a shop item (including shop item, shop and global price modifiers)
   *
   * @param player   Player to check
   * @param shopItem Shop item player has the modifier for
   * @param type     Type (buy/sell/both) of price modifier to check
   * @return price modifier player has
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static PriceModifier getPriceModifier(Player player, ShopItem shopItem, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    return shopGuiPlugin.getPriceModifierManager().getPriceModifier(player, shopItem, type);
  }

  /**
   * Sets player's price modifier for a shop item
   *
   * @param player   Player to set the price modifier for
   * @param shopItem Shop item player has the modifier for
   * @param type     Type (buy/sell/both) of price modifier to set
   * @param modifier Price modifier value (1.0 is 100% of the original price)
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void setPriceModifier(Player player, ShopItem shopItem, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().setPriceModifier(player, shopItem, type, modifier);
  }

  /**
   * Resets player's price modifier for a shop item
   *
   * @param player   Player to reset the price modifier for
   * @param shopItem Shop item player has the modifier for
   * @param type     Type (buy/sell/both) of price modifier to reset
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void resetPriceModifier(Player player, ShopItem shopItem, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().resetPriceModifier(player, shopItem, type);
  }

  /**
   * Gets price modifier player has for a shop (including shop and global price modifiers)
   *
   * @param player Player to check
   * @param shop   Shop player has the modifier for
   * @param type   Type (buy/sell/both) of price modifier to check
   * @return price modifier player has
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static PriceModifier getPriceModifier(Player player, Shop shop, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    return shopGuiPlugin.getPriceModifierManager().getPriceModifier(player, shop, type);
  }

  /**
   * Sets player's price modifier for a shop
   *
   * @param player   Player to check
   * @param shop     Shop player has the modifier for
   * @param type     Type (buy/sell/both) of price modifier to set
   * @param modifier Price modifier value (1.0 is 100% of the original price)
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void setPriceModifier(Player player, Shop shop, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().setPriceModifier(player, shop, type, modifier);
  }

  /**
   * Resets player's price modifier for a shop
   *
   * @param player Player to check
   * @param shop   Shop player has the modifier for
   * @param type   Type (buy/sell/both) of price modifier to reset
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void resetPriceModifier(Player player, Shop shop, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().resetPriceModifier(player, shop, type);
  }

  /**
   * Gets player's global price modifier (including only global price modifiers)
   *
   * @param player Player to check
   * @param type   Type (buy/sell/both) of price modifier to check
   * @return price modifier player has
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static PriceModifier getPriceModifier(Player player, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    return shopGuiPlugin.getPriceModifierManager().getPriceModifier(player, type);
  }

  /**
   * Sets player's global price modifier
   *
   * @param player   Player to check
   * @param type     Type (buy/sell/both) of price modifier to set
   * @param modifier Price modifier value (1.0 is 100% of the original price)
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void setPriceModifier(Player player, PriceModifierActionType type, double modifier)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().setPriceModifier(player, type, modifier);
  }

  /**
   * Resets player's global price modifier
   *
   * @param player Player to check
   * @param type   Type (buy/sell/both) of price modifier to reset
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static void resetPriceModifier(Player player, PriceModifierActionType type)
    throws PlayerDataNotLoadedException {
    shopGuiPlugin.getPriceModifierManager().resetPriceModifier(player, type);
  }

  /**
   * Registers a custom spawner provider
   *
   * @param spawnerProvider Implementation of custom spawner provider
   */
  public static void registerSpawnerProvider(ExternalSpawnerProvider spawnerProvider)
    throws ExternalSpawnerProviderNameConflictException {
    shopGuiPlugin.getSpawnerManager().registerExternalSpawnerProvider(spawnerProvider);
  }

  /**
   * Registers a custom economy provider
   *
   * @param economyProvider Implementation of custom economy provider
   */
  public static void registerEconomyProvider(EconomyProvider economyProvider) {
    shopGuiPlugin.getEconomyManager().registerCustomEconomyProvider(economyProvider);
  }

  /**
   * Registers a custom item provider
   *
   * @param itemProvider Implementation of custom item provider
   */
  public static void registerItemProvider(ItemProvider itemProvider) {
    shopGuiPlugin.getItemManager().registerItemProvider(itemProvider);
  }

  /**
   * Returns the instance of ShopGUI+'s main class
   *
   * @return ShopGUI+ main class instance
   */
  public static ShopGuiPlugin getPlugin() {
    return shopGuiPlugin;
  }

  static void setPlugin(ShopGuiPlugin instance) {
    shopGuiPlugin = instance;
  }

  private static ShopItem getShopItem(Player player, ItemStack itemStack) {
    return shopGuiPlugin.getShopManager().findShopItemByItemStack(player, itemStack, false);
  }

  private static ShopItem getShopItem(ItemStack itemStack) {
    return shopGuiPlugin.getShopManager().findShopItemByItemStack(itemStack, false);
  }
}
