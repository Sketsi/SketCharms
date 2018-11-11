package com.sketsi.charm;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class CharmEvents implements Listener {

	public void playerkillsmob(EntityDeathEvent e) {
		
	}
	
	public void charmEffects(PlayerInventory e) {
		
		//Lore to check for
		List<String> sketsiLore = new ArrayList<>();
		
		ItemStack sketsi = new ItemStack(Material.CYAN_BED, 1);
		ItemMeta sketsiMeta = sketsi.getItemMeta();

		sketsiMeta.setLore(sketsiLore);
		sketsi.setItemMeta(sketsiMeta);
		
		sketsiLore.add(ChatColor.GRAY + PluginName);
		sketsiMeta.setDisplayName(ChatColor.AQUA + "Sketsi made this, you shouldn't see it.");
		
		
		// Jump
		List<String> jumpLore = new ArrayList<>();
		
		ItemStack jump = new ItemStack(Material.SLIME_BALL, 1);
		ItemMeta jumpMeta = jump.getItemMeta();
		
		jumpMeta.setLore(jumpLore);
		jump.setItemMeta(jumpMeta);
		
		jumpMeta.setDisplayName(ChatColor.AQUA + "Jump Charm");
		sketsiLore.add(ChatColor.DARK_AQUA + PluginName);
		jumpLore.add(ChatColor.GRAY + "This charm will allow you to jump higher!");
		
		
		// Invisibility
		List<String> invisibilityLore = new ArrayList<>();

		ItemStack invisibility = new ItemStack(Material.FIREWORK_STAR, 1);
		ItemMeta invisibilityMeta = invisibility.getItemMeta();
		
		invisibilityMeta.setLore(invisibilityLore);
		invisibility.setItemMeta(invisibilityMeta);
		
		invisibilityMeta.setDisplayName(ChatColor.GRAY + "Cloak Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		invisibilityLore.add(ChatColor.DARK_GRAY + "See me, you will not!");

		
		// Fire Resistance
		List<String> fireresistanceLore = new ArrayList<>();
		
		ItemStack fireresistance = new ItemStack(Material.BLAZE_POWDER, 1);
		ItemMeta fireresistanceMeta = fireresistance.getItemMeta();
		
		fireresistanceMeta.setLore(fireresistanceLore);
		fireresistance.setItemMeta(fireresistanceMeta);
		
		fireresistanceMeta.setDisplayName(ChatColor.GOLD + "Fire Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		fireresistanceLore.add(ChatColor.GRAY + "Swimming in lava is fun!");
		
		
		// Saturation
		List<String> saturationLore = new ArrayList<>();
		
		ItemStack saturation = new ItemStack(Material.GLISTERING_MELON_SLICE, 1);
		ItemMeta saturationMeta = saturation.getItemMeta();
		
		saturationMeta.setLore(saturationLore);
		saturation.setItemMeta(saturationMeta);
		
		saturationMeta.setDisplayName(ChatColor.AQUA + "Hunger Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		saturationLore.add(ChatColor.GRAY + "This golden melon is too much.");

		
		// Luck
		List<String> luckLore = new ArrayList<>();
		
		ItemStack luck = new ItemStack(Material.RABBIT_FOOT, 1);
		ItemMeta luckMeta = luck.getItemMeta();

		luckMeta.setLore(luckLore);
		luck.setItemMeta(luckMeta);
		
		luckMeta.setDisplayName(ChatColor.AQUA + "Luck Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		luckLore.add(ChatColor.GRAY + "I am super lucky!");
		
		
		// Regeneration
		List<String> regenerationLore = new ArrayList<>();
		
		ItemStack regeneration = new ItemStack(Material.ROSE_BUSH, 1);
		ItemMeta regenerationMeta = regeneration.getItemMeta();

		regenerationMeta.setLore(regenerationLore);
		regeneration.setItemMeta(regenerationMeta);
		
		regenerationMeta.setDisplayName(ChatColor.AQUA + "Jump Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		regenerationLore.add(ChatColor.GRAY + "This charm will allow you to jump higher!");
		
		
		// Resistance
		List<String> resistanceLore = new ArrayList<>();
		
		ItemStack resistance = new ItemStack(Material.IRON_DOOR, 1);
		ItemMeta resistanceMeta = resistance.getItemMeta();

		resistanceMeta.setLore(resistanceLore);
		resistance.setItemMeta(resistanceMeta);
		
		resistanceMeta.setDisplayName(ChatColor.AQUA + "Jump Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		resistanceLore.add(ChatColor.GRAY + "This charm will allow you to jump higher!");
		
		
		// Slow Falling
		List<String> slowfallLore = new ArrayList<>();
		
		ItemStack slowfall = new ItemStack(Material.FEATHER, 1);
		ItemMeta slowfallMeta = slowfall.getItemMeta();

		slowfallMeta.setLore(slowfallLore);
		slowfall.setItemMeta(slowfallMeta);
		
		slowfallMeta.setDisplayName(ChatColor.AQUA + "Feather Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		slowfallLore.add(ChatColor.GRAY + "You are weighing me down!");
		
		
		// Speed/DolphinsGrace
		List<String> swiftnessLore = new ArrayList<>();
		
		ItemStack swiftness = new ItemStack(Material.SUGAR, 1);
		ItemMeta swiftnessMeta = swiftness.getItemMeta();

		swiftnessMeta.setLore(swiftnessLore);
		swiftness.setItemMeta(swiftnessMeta);
		
		swiftnessMeta.setDisplayName(ChatColor.AQUA + "Swiftness Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		swiftnessLore.add(ChatColor.GRAY + "Speed, I am speed!");
		
		
		// Strength
		List<String> strengthLore = new ArrayList<>();
		
		ItemStack strength = new ItemStack(Material.REDSTONE, 1);
		ItemMeta strengthMeta = strength.getItemMeta();

		strengthMeta.setLore(strengthLore);
		strength.setItemMeta(strengthMeta);
		
		strengthMeta.setDisplayName(ChatColor.AQUA + "Strength Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		strengthLore.add(ChatColor.GRAY + "Lift weights and you are strong,");
		strengthLore.add(ChatColor.GRAY + "or just use me.. that works too.");
		
		
		// Healing
		List<String> healthLore = new ArrayList<>();
		
		ItemStack health = new ItemStack(Material.STICK, 1);
		ItemMeta healthMeta = health.getItemMeta();

		healthMeta.setLore(healthLore);
		health.setItemMeta(healthMeta);
		
		healthMeta.setDisplayName(ChatColor.AQUA + "Vampire Stake");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		healthLore.add(ChatColor.GRAY + "Hitting entities will heal you..");
		
		
		// Weakness
		List<String> weaknessLore = new ArrayList<>();
		
		ItemStack weakness = new ItemStack(Material.BONE, 1);
		ItemMeta weaknessMeta = weakness.getItemMeta();

		weaknessMeta.setLore(weaknessLore);
		weakness.setItemMeta(weaknessMeta);
		
		weaknessMeta.setDisplayName(ChatColor.AQUA + "Weakness Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		weaknessLore.add(ChatColor.GRAY + "I am your kryptonite.");	
		
		
		// Wither
		List<String> witherLore = new ArrayList<>();
		
		ItemStack wither = new ItemStack(Material.WITHER_SKELETON_SKULL, 1);
		ItemMeta witherMeta = wither.getItemMeta();

		witherMeta.setLore(witherLore);
		wither.setItemMeta(witherMeta);
		
		witherMeta.setDisplayName(ChatColor.AQUA + "Wither Charm");
		sketsiLore.add(ChatColor.GRAY + PluginName);
		witherLore.add(ChatColor.GRAY + "This charm will allow you to jump higher!");		
	}

}




		
