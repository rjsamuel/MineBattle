package com.nbrandwine.autobalance;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener
{
	FileConfiguration conf = getConfig();
	ConsoleCommandSender con = Bukkit.getServer().getConsoleSender();
	File F = new File(getDataFolder(), "config.yml");
	
	public void buildConfig()
	{
		conf.addDefault("", "");
	}
	
	@Override
	public void onEnable()
	{
		if(!F.exists()) 
		{
			try 
			{
				F.createNewFile();
				buildConfig();
			} catch (Exception e) 
			{
				con.sendMessage(ChatColor.RED + "ERROR!");
				con.sendMessage(ChatColor.RED + "The config (AutoBalance) could not be built!");
				con.sendMessage(e.getMessage());
			}
		}
	}
	
	@Override
	public void onDisable()
	{
		this.saveDefaultConfig();
		
		try 
		{
			conf.save(F);
		} catch (IOException e) {
			con.sendMessage(ChatColor.RED + "ERROR!");
			con.sendMessage(ChatColor.RED + "The config (AutoBalance) could not be built!");
			con.sendMessage(e.getMessage());
		}
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		
	}
	
}
