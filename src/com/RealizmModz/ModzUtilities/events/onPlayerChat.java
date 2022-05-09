package com.RealizmModz.ModzUtilities.events;

import com.RealizmModz.ModzUtilities.Ranks.Rank;
import com.RealizmModz.ModzUtilities.Ranks.Ranks;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onPlayerChat implements Listener {

    @EventHandler

    public static void onPlayerChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();
        String playername = player.getName();
        int highestWeight = 0;
        Rank highestRank = null;

        for (Rank rank : Ranks.rankList) {
            if (player.hasPermission(rank.permissionGroup) && rank.weight > highestWeight) {
                highestRank = rank;
                highestWeight = rank.weight;
            }

            event.setFormat(ChatColor.GRAY + "[" + highestRank.color + highestRank.rankName + ChatColor.GRAY + "] " + ChatColor.WHITE + playername + ": " + event.getMessage());
        }
    }
}