package com.RealizmModz.ModzUtilities.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            System.out.println(ChatColor.RED + "You cannot teleport to spawn if you are console");
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("spawn")) {
            Location spawnLocation = player.getWorld().getSpawnLocation();
            player.teleport(spawnLocation);
            player.sendMessage("§bSending you to spawn");
        }

        return true;
    }
}
