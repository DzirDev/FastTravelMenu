package org.lcdt.fasttravelmenu;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.lcdt.fasttravelmenu.commands.TravelCommand;
import org.lcdt.fasttravelmenu.events.MenuListener;
import org.lcdt.fasttravelmenu.util.ConfigManager;

public class Main extends JavaPlugin
{
    private Main plugin;
    private FileConfiguration config = this.getConfig();

    public void onEnable()
    {
        Bukkit.getLogger().info("[FastTravelMenu] Enabled.");
        Bukkit.getPluginManager().registerEvents(new MenuListener(), this);
        Bukkit.getPluginCommand("travel").setExecutor(new TravelCommand(plugin, new ConfigManager(plugin)));
    }

    public void onDisable()
    {
        Bukkit.getLogger().info("[FastTravelMenu] Disabled.");
    }

    public Main getPlugin()
    {
        return plugin;
    }

    public void setupConfig()
    {
      this.saveDefaultConfig();
      this.saveConfig();
    }

    public FileConfiguration getConfig()
    {
        return config;
    }

}
