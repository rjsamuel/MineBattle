package src.main.java.net.link404.minebattle;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {

	static String PREFIX = ChatColor.DARK_GRAY + "[" + ChatColor.GRAY
			+ "Anonymous" + ChatColor.DARK_GRAY + "] ";

	public static void main(String[] args) {

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

		if (cmd.getName().equalsIgnoreCase("anon")) {
			if (args.length > 0) {
				String m = "";
				Player pfn = getServer().getPlayer(args[0]);

				StringBuilder sb = new StringBuilder();
				for (int i = 1; i < args.length; i++) {
					sb.append(args[i]).append(" ");
				}
				m = sb.toString().trim();

				// Player Check (ONLINE OR NAW)
				if (pfn.isOnline() || args[0] != player.getName()) {
					// Send shit message to shit player
					pfn.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GRAY
							+ "Anonymous" + ChatColor.DARK_GRAY + "] "
							+ ChatColor.GRAY
							+ "Someone sent you this message: ");
					pfn.sendMessage(ChatColor.GRAY + "''" + ChatColor.DARK_GRAY
							+ m + ChatColor.GRAY + "''");

					// Notify shit admins of shit player's shit message
					for (Player ap : Bukkit.getOnlinePlayers()) {
						if (ap.hasPermission("anonymous.notify")) {
							ap.sendMessage(ChatColor.DARK_GRAY + "["
									+ ChatColor.GRAY + "ANON"
									+ ChatColor.DARK_GRAY + "] "
									+ ChatColor.GRAY + "Player "
									+ ChatColor.GOLD + player.getName()
									+ ChatColor.GRAY + " sent "
									+ ChatColor.GOLD + args[0] + ChatColor.GRAY
									+ ": ");
							ap.sendMessage(ChatColor.DARK_GRAY + "["
									+ ChatColor.GRAY + "ANON"
									+ ChatColor.DARK_GRAY + "] "
									+ ChatColor.GRAY + ChatColor.GRAY + "''"
									+ ChatColor.YELLOW + m + ChatColor.GRAY
									+ "''");
						}
					}
				} else {
					player.sendMessage(PREFIX
							+ ChatColor.RED
							+ "Cannot send this message to offline player/yourself.");
				}

			} else {
				player.sendMessage(PREFIX + ChatColor.RED
						+ "Format: /anon <name> <msg>.");
			}

		}

		return true;
	}
}
