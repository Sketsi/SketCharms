package com.sketsi.charm;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CharmMain extends JavaPlugin implements Listener {
	
	// Strings
	String CharmPrefix = ChatColor.DARK_RED + "SketBot: " + ChatColor.GOLD;
	String ChatPrefix = ChatColor.AQUA + "YouTube follow-along " ;
	String PluginName = this.getConfig().getString("Prefix");
	
	public void onEnable() {
		System.out.println(ChatColor.DARK_AQUA + PluginName + "has been enabled!");
		
		getCommand("help").setExecutor(new HelpCommand());					// List of Commands
		getCommand("give").setExecutor(new GiveCommand());					// Give charm
		getCommand("list").setExecutor(new ListCommand());					// List of Charms
		getCommand("info").setExecutor(new InfoCommand());					// Information regarding a charm
		getCommand("reload").setExecutor(new ReloadCommand());				// Reload the plugin
		getCommand("CharmEffects").setExecutor(new CharmEffectsCommands()); // Command for all
		
		Bukkit.getPluginManager().registerEvents(new CharmEvents() , this);
		Bukkit.getPluginManager().registerEvents(this, this);
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();	
	}
	
	public void onDisable() {
		
		}
	
	
	/*
	 *  On player join initialize player inactive charm checker
	 *  Check if player has charm effects after 21 seconds of applying the effect
	 *  Check if player has any inactive charms in their inventory and activate it
	 *  On player leave deactivate inactive charms for player 
	 */
	
	
	
	/*
	 
 On player join:
    Initialize inactive charm checker

 Inactive charm checker:
    For each (delay) seconds--
    Get list of inactive charms for player
    Check if player has charm in ten slots
        True: Activate charm

 Charm-specific active charm checker:
    For each (duration) + (delay) seconds--
    Check if player has this charm in ten slots
        True: Activate charm
        False: Inactivate charm

 Activate charm:
    Mark charm as active (remove from inactive charm list and run active charm checker for charm)
    Add effect to player

 Inactivate charm:
    Mark charm as inactive (add to inactive charm list)

 On player leave:
    Remove charm effects
    Turn off all checkers for player
    
    
    
    loop through items in specific slots and compare item material with list of charms -- if material matches, then check lore
    
    
	 */
}


