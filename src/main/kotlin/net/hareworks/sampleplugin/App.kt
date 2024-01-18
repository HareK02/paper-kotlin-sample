package net.hareworks.sampleplugin;

import org.bukkit.plugin.java.JavaPlugin

public class App : JavaPlugin() {
	companion object {
			lateinit var plugin: App
					private set
	}
    override fun onEnable() {
        plugin = this
				
				logger.info("SamplePlugin enabled!!!!")
    }
}
