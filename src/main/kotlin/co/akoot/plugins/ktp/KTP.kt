package co.akoot.plugins.ktp

import org.bukkit.plugin.java.JavaPlugin

class KTP : JavaPlugin() {

    override fun onEnable() {
        logger.info("We are eating good tonight!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}