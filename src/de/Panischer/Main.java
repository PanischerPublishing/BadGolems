package de.Panischer;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin
{
	public static Main plugin;
	public void onEnable()
	{
		plugin = this;
		getServer().getPluginManager().registerEvents(new EventManager(), this);
		GolemTargetTask.startTimer();
	}
}
