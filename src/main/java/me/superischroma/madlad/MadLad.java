package me.superischroma.madlad;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import me.superischroma.madlad.command.*;

public class MadLad extends JavaPlugin 
{
    ConsoleCommandSender console = getServer().getConsoleSender();
    @Override
    public void onEnable() {
        console.sendMessage(Variables.PREFIX + "Enabled MadLad v" + Variables.PLUGIN_VERSION);
        console.sendMessage(Variables.PREFIX + "Loaded " + Variables.COMMAND_AMOUNT + " command(s).");
        
        this.getCommand("madlad").setExecutor(new Command_madlad());
    }
    @Override
    public void onDisable() {
        console.sendMessage("Disabled MadLad v" + Variables.PLUGIN_VERSION);
    }
}
