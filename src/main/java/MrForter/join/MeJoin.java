package MrForter.join;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;

import MrForter.join.listener.*;

public class MeJoin extends PluginBase implements Listener{
	@Override
	public void onEnable(){
		this.saveDefaultConfig();
		this.getServer().getPluginManager().registerEvents((Listener)new EventListener(this), (MeJoin)this);
	}
}