package net.link404.minebattle;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class App extends JavaPlugin 
{
    public static void main( String[] args )
    {

    }
    
    @Override
	public void onEnable() {
		getLogger().info("Minebattle Plugin Enabled");
    }
	
		@Override
	public void onDisable() {
		getLogger().info("Minebattle Plugin Disabled");
	}
		
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("web")) {
			player.sendMessage("--- Social Media ---");
			return true;
		}
		return true;
}
}
