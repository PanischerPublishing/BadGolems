package de.Panischer;
import org.bukkit.entity.IronGolem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
public class EventManager implements Listener
{
	@EventHandler
	public void onEntityTarget(EntityTargetLivingEntityEvent event)
	{
			if(event.getTarget() != null)
			{
				if(event.getEntity() instanceof IronGolem && MobListManager.getMobList().contains(event.getTarget().getType()))
				{
					event.setTarget(null);
				}else if(event.getTarget() instanceof IronGolem)
				{
					event.setTarget(null);
				}
			}
	}
}
