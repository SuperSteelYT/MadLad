package me.superischroma.madlad.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import me.superischroma.madlad.Variables;

public class Command_madlad implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String c, String[] args) 
    {
        if (c.equalsIgnoreCase("madlad")) 
        {
            if (args.length == 0) 
            {
                cs.sendMessage(ChatColor.BLUE + "The MadLad plugin created by " + ChatColor.GOLD + Variables.AUTHOR);
                cs.sendMessage(ChatColor.BLUE + "MadLad: A server modification for the fun of it.");
                cs.sendMessage(ChatColor.BLUE + "Version " + ChatColor.GOLD + Variables.PLUGIN_VERSION);
                cs.sendMessage(ChatColor.BLUE + "GitHub link: " + ChatColor.GOLD + Variables.GITHUB_LINK);
                return true;
            }
            if (args.length == 1) 
            {
                if (args[0].equalsIgnoreCase("github")) 
                {
                    cs.sendMessage(ChatColor.BLUE + "GitHub link: " + ChatColor.GOLD + Variables.GITHUB_LINK);
                    return true;
                }
                if (args[0].equalsIgnoreCase("help")) 
                {
                    cs.sendMessage(ChatColor.BLUE + "List of commands here: " + ChatColor.GOLD + "/? MadLad");
                    return true;
                }
                if (args[0].equalsIgnoreCase("feedback")) 
                {
                    cs.sendMessage(ChatColor.BLUE + "Feedback/support can be sent to the following email:");
                    cs.sendMessage(ChatColor.GOLD + Variables.EMAIL);
                    return true;
                }
            }
        }
        return false;
    }
}
