package net.brcdev.shopgui.provider.economy;

import org.bukkit.entity.Player;

public interface EconomyProvider {

  /**
   * Returns user-friendly name of economy
   *
   * @return economy name
   */
  String getName();

  /**
   * Gets the money balance of specified player
   *
   * @param player Player to check balance
   * @return money balance
   */
  double getBalance(Player player);

  /**
   * Adds the specified money amount to player's balance
   *
   * @param player Player whose balance shall be modified
   * @param amount Money amount
   */
  void deposit(Player player, double amount);

  /**
   * Removes the specified money amount from player's balance
   *
   * @param player Player whose balance shall be modified
   * @param amount Money amount
   */
  void withdraw(Player player, double amount);

  /**
   * Checks whether player's balance is equal or higher than the specified money amount
   *
   * @param player Player whose balance shall be checked
   * @param amount Amount required from player
   * @return whether player has enough money
   */
  boolean has(Player player, double amount);
}
