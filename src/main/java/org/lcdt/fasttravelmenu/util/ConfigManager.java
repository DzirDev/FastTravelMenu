package org.lcdt.fasttravelmenu.util;

import org.lcdt.fasttravelmenu.Main;

public class ConfigManager
{

    private Main plugin;

    public ConfigManager(Main plugin){
        this.plugin = plugin.getPlugin();
    }

    public void setInConfig(String s, String s2)
    {
        plugin.getConfig().set(s, s2);
        plugin.saveConfig();
    }

}
