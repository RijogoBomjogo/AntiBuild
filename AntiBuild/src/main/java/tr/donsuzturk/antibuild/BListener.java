package tr.donsuzturk.antibuild;

import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.Listener;

public class BListener implements Listener {

    @EventHandler
    public void onBlockHit(final BlockBreakEvent e) {
        if (e.getPlayer().hasPermission("anti.build")) {
            return;
        }
        e.setCancelled(true);
        Main.sendMessage(e.getPlayer(), "&cBreaking blocks is blocked from this server!");
    }

    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent e) {
        if (e.getPlayer().hasPermission("anti.build")) {
            return;
        }
        e.setCancelled(true);
        Main.sendMessage(e.getPlayer(), "&cPlacing blocks has been blocked from this server.");
    }
}
