package com.brycehoffhous.spigot.simplechairs.Listeners;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.brycehoffhous.spigot.simplechairs.Main;

public class TrySitEvent implements Listener {

	protected final Main plugin;

	public TrySitEvent(Main plugin) {

		this.plugin = plugin;
	}

	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onPlayerInteract(PlayerInteractEvent event) {
		if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getHand() == EquipmentSlot.HAND)) {
			Player player = event.getPlayer();
			Block block = event.getClickedBlock();
			Location sitLocation = event.getClickedBlock().getLocation();
			if ((sitLocation != null) && plugin.getPlayerSitData().sitPlayer(player, block, location)) {
				event.setCancelled(true);
			}
		}
	}

}

