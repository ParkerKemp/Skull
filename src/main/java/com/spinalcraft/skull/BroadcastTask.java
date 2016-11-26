package com.spinalcraft.skull;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class BroadcastTask extends BukkitRunnable{
	private String message;
	
	public BroadcastTask(String message){
		this.message = message;
	}

	@Override
	public void run() {
		Bukkit.broadcastMessage(replaceColors(message));
	}
	
	public static String replaceColors(String string){
		return string.replaceAll("(?i)&([a-k0-9])", "\u00A7$1");
	}
}
