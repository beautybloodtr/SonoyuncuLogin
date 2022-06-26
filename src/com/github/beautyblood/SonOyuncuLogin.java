package com.github.beautyblood;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class SonOyuncuLogin extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		System.out.println("SonOyuncu Login Aktifleþtirildi"
				+ "Skidded from anywhere by BeautyBlood");
		Bukkit.getPluginManager().registerEvents(this, (Plugin) this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("SonOyuncu Login Kapatýldý"
				+ "Skidded from anywhere by BeautyBlood");
	}
	
	  @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
	  public void onPlayerLogin(PlayerLoginEvent e) {
	    if (!e.getHostname().contains("###") || !e.getHostname().contains("\",\"sig\":\"") || !e.getHostname().contains("\",\"token\":\"sl\",\"suid\":\"") || !e.getHostname().contains("\",\"launcherCHC\":\"") || !e.getHostname().split("\"")[1].startsWith("minecraft"))
	      e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§cSunucuya girebilmek için SonOyuncu client kullanmalýsýnýz!"); 
	  }
	 	
}
