package tr.donsuzturk.antibuild;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getLogger().info("Plugin enabled!");
        final PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new BListener(),
                this);
    }

    private static String prefix;

    static {
        Main.prefix = ChatColor.DARK_RED + "HEY " + ChatColor.GRAY + "- ";
    }

    public static void sendMessage(final Player p, final String msg) {
        p.sendMessage(Main.prefix + ChatColor.translateAlternateColorCodes('&', msg));
    }

}
