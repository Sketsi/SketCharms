package com.sketsi.charm;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CharmEffectsCommands implements CommandExecutor {
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		
		if (args[0].equalsIgnoreCase("help")) {
			player.sendMessage("One.");
		} else if (args[0].equalsIgnoreCase("list")) {
			player.sendMessage("info"); 	
		} else {
			player.sendMessage("Use /number 1 or 2.");
		}
		
		return false;
	}
		
}
