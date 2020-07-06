package com.MrLubert.mrlubert;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin implements Listener {

	public TabManager tab;

	@EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
		
        }
	
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {

        }

	@EventHandler
    public void onPlayerKick(PlayerKickEvent e) {

        }

	@Override
	public void onEnable() {
		getLogger().info("Plugin Enabled!");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);

		
        this.tab = new TabManager(this);
		
		tab.addHeader("&b&lSketch's Sub Server");
		tab.addHeader("&b&lSketch's Sub Server");
		tab.addHeader("&b&lSketch's Sub Server");
		tab.addHeader("&5&lSketch's Sub Server");
		tab.addHeader("&5&lSketch's Sub Server");
		tab.addHeader("&5&lSketch's Sub Server");
		
		tab.addFooter("&bPlayers Online: &b" + Bukkit.getOnlinePlayers().size() + " &8&l/ &b" + Bukkit.getMaxPlayers());
		
		tab.showTab();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled!");
	}
	
}




