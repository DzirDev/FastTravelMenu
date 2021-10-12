package org.lcdt.fasttravelmenu.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.lcdt.fasttravelmenu.Main;
import org.lcdt.fasttravelmenu.util.ConfigManager;

public class TravelCommand implements CommandExecutor
{ // All things Travel related

    private final Inventory inv;
    private Main plugin;
    private Player p;
    private ConfigManager cm;

    public TravelCommand(Main plugin, ConfigManager cm)
    { // creates an inventory with no owner, a size of 18, named Travel Menu
        this.inv = Bukkit.createInventory(null, 18, "Travel Menu");
        this.plugin = plugin.getPlugin();
        this.cm = cm;
        // test comment
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    { //onCommand
        p = (Player) sender;
        if(cmd.getLabel().equalsIgnoreCase("travel"))
        {

        }
        return true;
    }

    public Inventory makeGUI(Player p)
    { // create the GUI for the travel menu
        return inv;
    }


}
