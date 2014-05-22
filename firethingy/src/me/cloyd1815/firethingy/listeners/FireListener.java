package me.cloyd1815.firethingy.listeners;

import me.cloyd1815.firethingy.Main;
import me.cloyd1815.firethingy.RemoveFire;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockIgniteEvent;

public class FireListener implements Listener {
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onIgnite(BlockIgniteEvent e) {
		Block block = e.getBlock();
				new RemoveFire(block).runTaskLater(Main.getPlugin(), 20*15);
	}
}
