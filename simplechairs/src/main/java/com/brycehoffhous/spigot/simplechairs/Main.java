package com.brycehoffhous.spigot.simplechairs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info("Successfully enabled SimpleChairs");
    }
    @Override
    public void onDisable() {
        getLogger().info("Successfully disabled SimpleChairs");
    }
}