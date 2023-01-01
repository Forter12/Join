package MrForter.join.listener;

import cn.nukkit.event.Listener;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.utils.Config;

import MrForter.join.MeJoin;

public class EventListener implements Listener{
	
	Config config;
	
	public EventListener(MeJoin plugin){
		this.config = plugin.getConfig();
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
	    String name = event.getPlayer().getName();
		event.setJoinMessage(config.getString("join-message").replace("%name%", name));
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event){
		String name = event.getPlayer().getName();
		event.setQuitMessage(config.getString("quit-message").replace("%name%", name));
	}
}