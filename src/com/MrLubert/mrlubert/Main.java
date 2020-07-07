package com.MrLubert.mrlubert;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
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

	@Override
	public void onEnable() {
		getLogger().info("Plugin Enabled!");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		
		TabManager tab = new TabManager(this);
		tab.showTab();
		tab.Tab();
	       
	}

	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (label.equalsIgnoreCase("tabreload")) {
    		if (sender instanceof Player) {
    			Player player = (Player) sender;
    	
    	Update update = new Update();
    	
		TabManager tab = new TabManager(this);
		tab.test();

		player.sendMessage(ChatColor.DARK_RED + "Test-Player Count: " + update.PlayerCount);
		System.out.println(ChatColor.DARK_RED + "Test-Player Count: " + update.PlayerCount);
    		}
    		return true;
    	}
    		
		if (label.equalsIgnoreCase("playercount")) {
    		if (sender instanceof Player) {
    			Player player = (Player) sender;
    			
    			Update update = new Update();
    			
    			player.sendMessage(ChatColor.DARK_RED + "Player Count: " + update.PlayerCount);
    }
    		return true;
    	}
		return true;
    	
}

}
