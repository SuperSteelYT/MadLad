package me.superischroma.madlad;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import me.superischroma.madlad.command.*;

public class MadLad extends JavaPlugin 
{
    // Console builder
    ConsoleCommandSender console = getServer().getConsoleSender();
    
    // Enable
    @Override
    public void onEnable() {
        console.sendMessage(Variables.PREFIX + "Enabled MadLad v" + Variables.PLUGIN_VERSION);
        console.sendMessage(Variables.PREFIX + "Loaded " + Variables.COMMAND_AMOUNT + " command(s).");
        
        // Main command executor
        this.getCommand("madlad").setExecutor(new Command_madlad());
        // Other commands
        this.getCommand("nero").setExecutor(new Command_nero());
        this.getCommand("robin").setExecutor(new Command_robin());
        this.getCommand("basedrobin").setExecutor(new Command_basedrobin());
    }
    
    // Disable
    @Override
    public void onDisable() {
        console.sendMessage("Disabled MadLad v" + Variables.PLUGIN_VERSION);
    }
}
