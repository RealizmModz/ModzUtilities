package com.RealizmModz.ModzUtilities.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {return false;}

        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("feed")) {
            if (player.hasPermission("ModzUtilities.feed")) {
                if(player.getFoodLevel() < 20) {
                    player.setFoodLevel(20);
                    player.sendMessage("§aYou are no longer hungry!");
                } else {
                    player.sendMessage("§cIt would appear you are not hungry!");
                }
            }
        }
        return true;
    }
}
