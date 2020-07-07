package com.MrLubert.mrlubert;

import org.bukkit.Bukkit;

public class Update {

	public final int PlayerCount = Bukkit.getOnlinePlayers().size();
	public int playersOnline = Bukkit.getOnlinePlayers().size();
	
	public int PlayerCount() {
		if (Bukkit.getOnlinePlayers().size() != 0) {
			Bukkit.broadcastMessage("PLAYERS ONLINE: " + Bukkit.getOnlinePlayers().size());
	}
		return Bukkit.getOnlinePlayers().size();
  }
}
