package net.brcdev.shopgui.player;

import net.brcdev.shopgui.gui.gui.OpenGui;
import net.brcdev.shopgui.modifier.WrappedPriceModifiers;

import java.util.UUID;

public interface PlayerData {

  UUID getId();

  String getName();

  WrappedPriceModifiers getPriceModifiers();

  long getLastGuiClick();

  long getLastAmountSelectionGuiClick();

  OpenGui getOpenGui();

  boolean hasOpenGui();

  boolean isSwitchingGui();
}
