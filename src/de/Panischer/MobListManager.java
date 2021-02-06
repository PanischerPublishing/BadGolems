package de.Panischer;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.EntityType;
public class MobListManager
{
	private static List<EntityType> nonTargetedEntites = new ArrayList<EntityType>();
	public static List<EntityType> getMobList()
	{
		nonTargetedEntites.add(EntityType.BLAZE);
		nonTargetedEntites.add(EntityType.DROWNED);
		nonTargetedEntites.add(EntityType.ENDER_DRAGON);
		nonTargetedEntites.add(EntityType.ENDERMAN);
		nonTargetedEntites.add(EntityType.ENDERMITE);
		nonTargetedEntites.add(EntityType.GUARDIAN);
		nonTargetedEntites.add(EntityType.ELDER_GUARDIAN);
		nonTargetedEntites.add(EntityType.HOGLIN);
		nonTargetedEntites.add(EntityType.MAGMA_CUBE);
		nonTargetedEntites.add(EntityType.PHANTOM);
		nonTargetedEntites.add(EntityType.PIGLIN);
		nonTargetedEntites.add(EntityType.PIGLIN_BRUTE);
		nonTargetedEntites.add(EntityType.SHULKER);
		nonTargetedEntites.add(EntityType.SILVERFISH);
		nonTargetedEntites.add(EntityType.SKELETON);
		nonTargetedEntites.add(EntityType.STRAY);
		nonTargetedEntites.add(EntityType.WITHER_SKELETON);
		nonTargetedEntites.add(EntityType.SLIME);
		nonTargetedEntites.add(EntityType.SPIDER);
		nonTargetedEntites.add(EntityType.CAVE_SPIDER);
		nonTargetedEntites.add(EntityType.VEX);
		nonTargetedEntites.add(EntityType.EVOKER);
		nonTargetedEntites.add(EntityType.ILLUSIONER);
		nonTargetedEntites.add(EntityType.PILLAGER);
		nonTargetedEntites.add(EntityType.RAVAGER);
		nonTargetedEntites.add(EntityType.VINDICATOR);
		nonTargetedEntites.add(EntityType.WITCH);
		nonTargetedEntites.add(EntityType.WITHER);
		nonTargetedEntites.add(EntityType.ZOMBIE);
		nonTargetedEntites.add(EntityType.HUSK);
		nonTargetedEntites.add(EntityType.ZOMBIE_VILLAGER);
		nonTargetedEntites.add(EntityType.ZOMBIFIED_PIGLIN);
		nonTargetedEntites.add(EntityType.ZOGLIN);
		nonTargetedEntites.add(EntityType.IRON_GOLEM);
		nonTargetedEntites.add(EntityType.CREEPER);
		return nonTargetedEntites;
	}
}
