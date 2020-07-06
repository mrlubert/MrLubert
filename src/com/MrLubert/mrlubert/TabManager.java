package com.MrLubert.mrlubert;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_16_R1.ChatComponentText;
import net.minecraft.server.v1_16_R1.PacketPlayOutPlayerListHeaderFooter;

public class TabManager {
	
	private List<ChatComponentText> headers = new ArrayList<>();
	private List<ChatComponentText> footers = new ArrayList<>();
	
	private Main plugin;
	public TabManager(Main plugin) {
		this.plugin = plugin;
	}
	
	public void showTab() {
		if (headers.isEmpty() && footers.isEmpty())
			return;
		
		Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
			
			PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();
			int count1 = 0; // header
			int count2 = 0; // footer
			
			@Override
			public void run() {
				try {
					
					Field a = packet.getClass().getDeclaredField("header");
					a.setAccessible(true);
					
					Field b = packet.getClass().getDeclaredField("footer");
					b.setAccessible(true);
					
					if(count1 >= headers.size())
						count1 = 0;
					
					if(count2 >= footers.size())
						count2 = 0;
					
					a.set(packet, headers.get(count1));
					
					b.set(packet, footers.get(count2));
					
					count1++;
					count2++;
					
					System.out.println(ChatColor.DARK_RED + "Loop");
					
					
					{
						for (Player player : Bukkit.getOnlinePlayers())
							((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
						System.out.println(ChatColor.DARK_RED + "Sent Packet");
				}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}, 10, 40);
	}

	public void addHeader(String header) {
		headers.add(new ChatComponentText(format(header)));
	}
	
	public void addFooter(String footer) {
		footers.add(new ChatComponentText(format(footer)));
	}
	
	private String format(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
	
	

}