package winlyps.placeSound

import org.bukkit.plugin.java.JavaPlugin

class PlaceSound : JavaPlugin() {

    override fun onEnable() {
        // Register the BlockBreakListener
        server.pluginManager.registerEvents(PlaceSoundListener(this), this)
        logger.info("BreakSound plugin enabled.")
    }

    override fun onDisable() {
        logger.info("PlaceSound plugin disabled.")
    }
}
