package net.brcdev.shopgui;

import net.brcdev.shopgui.exception.api.ExternalSpawnerProviderNameConflictException;
import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import net.brcdev.shopgui.player.PlayerData;
import net.brcdev.shopgui.provider.economy.EconomyProvider;
import net.brcdev.shopgui.shop.Shop;
import net.brcdev.shopgui.shop.ShopItem;
import net.brcdev.shopgui.shop.WrappedShopItem;
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
   * Gets the {@link Shop shop} when an item stack belongs to
   *
   * @param player    Player attempting to get the shop (eg. won't return shops the player doesn't have
   *                  access to)
   * @param itemStack Item stack to search for
   * @return shop if found, null otherwise
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static Shop getItemStackShop(Player player, ItemStack itemStack) throws PlayerDataNotLoadedException {
    WrappedShopItem wrappedShopItem = getWrappedShopItem(player, itemStack);
    return wrappedShopItem != null ? wrappedShopItem.getShop() : null;
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
    WrappedShopItem wrappedShopItem = getWrappedShopItem(itemStack);
    return wrappedShopItem != null ? wrappedShopItem.getShop() : null;
  }

  /**
   * Gets a {@link ShopItem shop item} of an item stack
   *
   * @param player    Player attempting to get the shop item (eg. won't return shop items in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to search for
   * @return shop item if found, null otherwise
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static ShopItem getItemStackShopItem(Player player, ItemStack itemStack) throws PlayerDataNotLoadedException {
    WrappedShopItem wrappedShopItem = getWrappedShopItem(player, itemStack);
    return wrappedShopItem != null ? wrappedShopItem.getShopItem() : null;
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
    WrappedShopItem wrappedShopItem = getWrappedShopItem(itemStack);
    return wrappedShopItem != null ? wrappedShopItem.getShopItem() : null;
  }

  /**
   * Gets buy price of an item
   *
   * @param player    Player attempting to get the buy the item (eg. won't check prices in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to check
   * @return buy price for the specified amount if found, -1.0 otherwise
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static double getItemStackPriceBuy(Player player, ItemStack itemStack) throws PlayerDataNotLoadedException {
    WrappedShopItem wrappedShopItem = getWrappedShopItem(player, itemStack);

    if (wrappedShopItem == null) {
      return -1.0;
    }

    PlayerData playerData = shopGuiPlugin.getPlayerManager().getPlayerData(player);
    return wrappedShopItem.getShopItem()
      .getBuyPriceForAmount(wrappedShopItem.getShop(), player, playerData, itemStack.getAmount());
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
    WrappedShopItem wrappedShopItem = getWrappedShopItem(itemStack);

    if (wrappedShopItem == null) {
      return -1.0;
    }

    return wrappedShopItem.getShopItem().getBuyPriceForAmount(itemStack.getAmount());
  }

  /**
   * Gets price of an item
   *
   * @param player    Player attempting to get the sell the item (eg. won't check prices in shops the
   *                  player doesn't have access to)
   * @param itemStack Item stack to check
   * @return sell price for the specified amount if found, -1.0 otherwise
   * @throws PlayerDataNotLoadedException when specified player's data isn't loaded yet
   */
  public static double getItemStackPriceSell(Player player, ItemStack itemStack) throws PlayerDataNotLoadedException {
    WrappedShopItem wrappedShopItem = getWrappedShopItem(player, itemStack);

    if (wrappedShopItem == null) {
      return -1.0;
    }

    PlayerData playerData = shopGuiPlugin.getPlayerManager().getPlayerData(player);
    return wrappedShopItem.getShopItem()
      .getSellPriceForAmount(wrappedShopItem.getShop(), player, playerData, itemStack.getAmount());
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
    WrappedShopItem wrappedShopItem = getWrappedShopItem(itemStack);

    if (wrappedShopItem == null) {
      return -1.0;
    }

    return wrappedShopItem.getShopItem().getSellPriceForAmount(itemStack.getAmount());
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

  private static WrappedShopItem getWrappedShopItem(Player player, ItemStack itemStack)
    throws PlayerDataNotLoadedException {
    if (!shopGuiPlugin.getPlayerManager().isPlayerLoaded(player)) {
      throw new PlayerDataNotLoadedException(player);
    }

    PlayerData playerData = shopGuiPlugin.getPlayerManager().getPlayerData(player);
    return shopGuiPlugin.getShopManager().findShopItemByItemStack(player, playerData, itemStack, false);
  }

  private static WrappedShopItem getWrappedShopItem(ItemStack itemStack) {
    return shopGuiPlugin.getShopManager().findShopItemByItemStack(itemStack, false);
  }
}
