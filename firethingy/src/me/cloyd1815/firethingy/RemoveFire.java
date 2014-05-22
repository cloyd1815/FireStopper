package me.cloyd1815.firethingy;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.scheduler.BukkitRunnable;

public class RemoveFire extends BukkitRunnable {
	Block block;

	public RemoveFire(Block block) {
		this.block = block;
	}

	@Override
	public void run() {
		for (BlockFace face : BlockFace.values()) {
			Block rel = block.getRelative(face);
			if (rel.getType().equals(Material.FIRE)) {
				rel.getLocation();
				rel.getLocation().getBlock().setType(Material.AIR);
			}
		}
	}
}
