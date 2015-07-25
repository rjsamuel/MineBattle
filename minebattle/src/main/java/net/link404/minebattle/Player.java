package net.link404.minebattle;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class Player {
	
	private String displayName;
	private int playerKills;
	private int playerDeaths;
	//private DateTime timeAlive;
	
	public Player(Plugin p)
	{
		// work with this later
	}
	
	public String getDisplayName()
	{
		return displayName;
	}
	
	public int getKills()
	{
		return playerKills;
	}
	
	public int getDeaths()
	{
		return playerDeaths;
	}
	
	public double getKdRatio()
	{
		return (playerKills/playerDeaths);
	}
	
}
