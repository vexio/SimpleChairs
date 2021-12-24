package com.brycehoffhous.spigot.simplechairs;

import org.bukkit.Location;

public class Utils {
	protected final Main plugin;
	protected final PlayerSitData sitdata;

	public Utils(Main plugin) {
		this.plugin = plugin;
		this.sitdata = plugin.getPlayerSitData();
	}

	public Entity summonChairEntity(Location location) {
		location = location.clone().add(0, 0.4, 0);
		return location.getWorld().spawn(
			location, ArmorStand.class, armorstand -> {
				armorstand.setGravity(false);
				armorstand.setInvulnerable(true);
				armorstand.setMarker(true);
				armorstand.setVisible(false);
			}
		);
	}
}
