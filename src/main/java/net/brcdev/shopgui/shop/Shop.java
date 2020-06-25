package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.economy.EconomyType;
import net.brcdev.shopgui.gui.element.button.GuiButton;
import net.brcdev.shopgui.player.PlayerData;
import net.brcdev.shopgui.provider.economy.EconomyProvider;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public class Shop {

  public Shop(String id, String name, Map<Integer, String> namePerPage, int size, boolean enablePerItemPermissions,
              boolean denyDirectAccess, EconomyType economyType, ItemStack fillItem, List<String> worldsWhitelist,
              List<String> worldsBlacklist, List<ShopItem> shopItems) {
  }

  public String getId() {
    return null;
  }

  public void setId(String id) {
  }

  public String getName() {
    return null;
  }

  public void setName(String name) {
  }

  public Map<Integer, String> getNamePerPage() {
    return null;
  }

  public void setNamePerPage(Map<Integer, String> namePerPage) {
  }

  public String getName(int page) {
    return null;
  }

  public int getSize() {
    return 0;
  }

  public void setSize(int size) {
  }

  public boolean isEnablePerItemPermissions() {
    return false;
  }

  public void setEnablePerItemPermissions(boolean enablePerItemPermissions) {
  }

  public boolean isDenyDirectAccess() {
    return false;
  }

  public void setDenyDirectAccess(boolean denyDirectAccess) {
  }

  public EconomyType getEconomyType() {
    return null;
  }

  public void setEconomyType(EconomyType economyType) {
  }

  public ItemStack getFillItem() {
    return null;
  }

  public void setFillItem(ItemStack fillItem) {
  }

  public List<String> getWorldsWhitelist() {
    return null;
  }

  public void setWorldsWhitelist(List<String> worldsWhitelist) {
  }

  public List<String> getWorldsBlacklist() {
    return null;
  }

  public void setWorldsBlacklist(List<String> worldsBlacklist) {
  }

  public List<ShopItem> getShopItems() {
    return null;
  }

  public void setShopItems(List<ShopItem> shopItems) {
  }

  public ShopItem getShopItem(String itemId) {
    return null;
  }

  public ShopItem getShopItem(int page, int slot) {
    return null;
  }

  public GuiButton getButtonGoBack() {
    return null;
  }

  public void setButtonGoBack(GuiButton buttonGoBack) {
  }

  public GuiButton getButtonPreviousPage() {
    return null;
  }

  public void setButtonPreviousPage(GuiButton buttonPreviousPage) {
  }

  public GuiButton getButtonNextPage() {
    return null;
  }

  public void setButtonNextPage(GuiButton buttonNextPage) {
  }

  public boolean hasAccess(Player player, ShopItem shopItem, boolean sendMessage) {
    return false;
  }

  public ShopItem findShopItem(Player player, PlayerData playerData, ItemStack itemStack,
                                      boolean excludeFreeItems) {
    return null;
  }

  public ShopItem findShopItem(ItemStack itemStack, boolean excludeFreeItems) {
    return null;
  }

  public EconomyProvider getEconomyProvider() {
    return null;
  }

}
