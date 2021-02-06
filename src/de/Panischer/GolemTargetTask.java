package de.Panischer;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitRunnable;
public class GolemTargetTask
{
	public static void startTimer()
	{
	BukkitRunnable runnable = new BukkitRunnable()
	{
		@Override
		public void run()
		{
			for(World world : Bukkit.getWorlds())
			{
				world.getEntitiesByClass(IronGolem.class).forEach(ig ->
				{
					if(ig.getTarget() == null)
					{
						List<Entity> entities = ig.getNearbyEntities(20, 20, 20);
						double lowestDistanceSoFar = Double.MAX_VALUE;
						Entity closestEntity = null;
						for (Entity entity : entities)
						{
						    double distance = entity.getLocation().distance(ig.getLocation());
						    if (distance < lowestDistanceSoFar &! entity.equals(ig.getTarget()))
						    {
						    	if(entity instanceof LivingEntity &! MobListManager.getMobList().contains(entity.getType()))
						    	{
						    		lowestDistanceSoFar = distance;
						    		closestEntity = entity;
						    	}
						    }
						}
						if (closestEntity != null)
						{
								ig.setTarget((LivingEntity) closestEntity);
						}else
						{
						    ig.setTarget(null);
						}
					}
				});
			}
		}
	};
	runnable.runTaskTimer(Main.plugin, 20L, 5*20L);
	}
}
