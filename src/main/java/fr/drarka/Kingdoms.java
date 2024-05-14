package fr.drarka;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.drarka.commands.CommandTest;
import fr.drarka.listeners.JoinListener;
import fr.drarka.systems.Kingdom;

public final class Kingdoms extends JavaPlugin {

    public static List<Kingdom> kingdoms = new ArrayList<>();

    @Override
    public void onEnable() {
        /*
         * Config
         */
        saveDefaultConfig();

        /*
         * Listeners
         */
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new JoinListener(), this);

        /*
         * Commands
         */
        getCommand("test").setExecutor(new CommandTest());


        System.out.println("Bismillah");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
