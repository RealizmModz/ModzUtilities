package com.RealizmModz.ModzUtilities;

import com.RealizmModz.ModzUtilities.commands.FeedCommand;
import com.RealizmModz.ModzUtilities.commands.FlyCommand;
import com.RealizmModz.ModzUtilities.commands.SpawnCommand;
import com.RealizmModz.ModzUtilities.events.onPlayerChat;
import com.RealizmModz.ModzUtilities.events.onPlayerJoin;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ModzUtilities extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onPlayerChat(), this);
        getServer().getPluginManager().registerEvents(new onPlayerJoin(), this);
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "[ModzUtilities]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ModzUtilities]: Plugin is disabled!");
    }

}
