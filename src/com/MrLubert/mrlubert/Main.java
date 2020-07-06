package com.MrLubert.mrlubert;

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

		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSu Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lS Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lServer\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lServer\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lServer\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l  Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l   Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l    Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l     Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l      Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l     Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l    Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l   Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l  Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&l Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lS Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lSu Server\n&4----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");
		tab.addHeader("&b&lSketch's &5&lSub Server\n&b----------------------");

		tab.showTab();
	}

	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled!");
	}

}
