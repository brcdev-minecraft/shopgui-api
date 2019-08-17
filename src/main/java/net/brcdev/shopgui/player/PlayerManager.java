package net.brcdev.shopgui.player;

import net.brcdev.shopgui.exception.player.PlayerDataNotLoadedException;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public interface PlayerManager {

  boolean isPlayerLoaded(OfflinePlayer player);

  PlayerData getPlayerData(Player player) throws PlayerDataNotLoadedException;
}
