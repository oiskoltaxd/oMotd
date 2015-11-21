package Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
  public void onDisable()
  {
  }

  public void onEnable()
  {
    PluginManager pm = Bukkit.getPluginManager();

    pm.registerEvents(new Motd(this), this);
  }
}