package me.superischroma.madlad.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import me.superischroma.madlad.Variables;

public class Command_basedrobin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String c, String[] args) 
    {
    if (c.equalsIgnoreCase("basedrobin")) 
        {
            if (args.length == 0) 
            {
                cs.sendMessage(ChatColor.GRAY + "https://imgur.com/a/vbLVo17");
                return true;
            }
            if (args.length >= 1) 
            {
                cs.sendMessage(Variables.TOO_MANY_ARGS);
                return true;
            }
        }
        return true;
    }
}