package me.superischroma.madlad.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class Command_robin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String c, String[] args) 
    {
    if (c.equalsIgnoreCase("robin")) 
        {
            if (args.length == 0) 
            {
                cs.sendMessage(ChatColor.GRAY + "Enter a number: 1-3");
                return true;
            }
            if (args.length == 1) 
            {
                if (args[0].equalsIgnoreCase("1")) 
                {
                    cs.sendMessage(ChatColor.DARK_PURPLE + "#Seth4Dev");
                    return true;
                }
                if (args[0].equalsIgnoreCase("2")) 
                {
                    cs.sendMessage(ChatColor.GOLD + "my dragon bot is lit go download now on my website");
                    return true;
                }
                if (args[0].equalsIgnoreCase("3")) 
                {
                    cs.sendMessage(ChatColor.DARK_AQUA + "did you know i'm a wolf irl");
                    return true;
                }
            }
        }
        return true;
    }
}


