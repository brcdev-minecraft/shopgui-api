package net.brcdev.shopgui.exception;

public class UnsupportedMinecraftVersionException extends RuntimeException {

  public UnsupportedMinecraftVersionException() {
    super("This Minecraft version is unsupported by the plugin. Try downgrading Minecraft or upgrading the plugin.");
  }
}
