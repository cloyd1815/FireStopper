package me.cloyd1815.firethingy;

import me.cloyd1815.firethingy.listeners.FireListener;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	private static Main plugin;
	@Override
	public void onEnable() {
		plugin = this;
		registerEvents(plugin, new FireListener());
	}
	
	@Override
	public void onDisable() {
		
	}

	public static void registerEvents(org.bukkit.plugin.Plugin plugin,
			Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager()
					.registerEvents(listener, plugin);
		}
	}

	public static Plugin getPlugin() {
		return plugin;
	}
}
