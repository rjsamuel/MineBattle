package net.link404.minebattle.util;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class TimeAlive implements Listener
{	
	// config or naw
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerLogin(PlayerLoginEvent e)
	{
		org.bukkit.entity.Player player = e.getPlayer();
			player.sendMessage("Here are a list of all our available social media links.");
	}

}
