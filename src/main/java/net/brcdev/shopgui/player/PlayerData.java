package net.brcdev.shopgui.player;

import net.brcdev.shopgui.gui.gui.OpenGui;
import net.brcdev.shopgui.modifier.WrappedPriceModifiers;

import java.util.UUID;

public class PlayerData {

  public UUID getId() {
    return null;
  }

  public String getName() {
    return null;
  }

  public WrappedPriceModifiers getPriceModifiers() {
    return null;
  }

  public long getLastGuiClick() {
    return 0;
  }

  public long getLastAmountSelectionGuiClick() {
    return 0;
  }

  public OpenGui getOpenGui() {
    return null;
  }

  public boolean hasOpenGui() {
    return false;
  }

  public boolean isSwitchingGui() {
    return false;
  }
}
