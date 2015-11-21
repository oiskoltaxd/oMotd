package Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Motd
  implements Listener
{
  Main pl;

  public Motd(Main pl)
  {
    this.pl = pl;
  }
  

	
  @EventHandler
  public void onMODT(ServerListPingEvent e) {
	  e.setMotd("§c╔§a═§c═§a═§c═§a═§b☃ §e§lWeihnachten §6§l2015 §b☃§c═§a═§c═§a═§c═§a╗\n§c╚§a═§c═§a═§c═§a═§c═§a═§f❄ §7Frohes Fest §f❄§c═§a═§c═§a═§c═§a═§c═§a╝");
  }
}