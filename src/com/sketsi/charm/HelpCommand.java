package com.sketsi.charm;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class HelpCommand implements CommandExecutor {

	/*
	 * If player has permission to use the command, add it to the list, else show only the essentials.
	 * 
	 * charmeffects.admin || charmeffects.reload || charmeffects.give || charmeffects.* || * 
	 * 
	 */
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		player.sendMessage(ChatColor.GOLD + PluginName + ":");
		
		if (player.hasPermission("charmeffects.reload")) {
			player.sendMessage("One.");
		} else if (player.hasPermission("charmeffects.give")) {
			player.sendMessage("info"); 	
		} else {
			player.sendMessage(ChatColor.GOLD + PluginName + ":");
		}
		
		return false;
	}

}

