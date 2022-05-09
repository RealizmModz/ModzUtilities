package com.RealizmModz.ModzUtilities.commands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player player) {

            if (cmd.getName().equalsIgnoreCase("fly")) {
                if (!player.hasPermission("modzutilities.fly")) {
                    player.sendMessage("§7you dont have permission");
                    player.playSound(player.getLocation(), Sound.ENTITY_ITEM_BREAK, 1, 1);
                    return true;
                } else {
                    if (player.getAllowFlight()) {
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.GRAY + "Fly(" + ChatColor.RED + "Off" + ChatColor.GRAY + ")");
                        return true;
                    } else {
                        player.setAllowFlight(true);
                        player.sendMessage(ChatColor.GRAY + "Fly(" + ChatColor.GREEN + "On" + ChatColor.GRAY + ")");
                        return true;
                    }
                }
            }
        } else {
            System.out.println("\u001B[31m" + "You cannot fly in Console!" + "\u001B[0m");
        }
        return true;
    }
}