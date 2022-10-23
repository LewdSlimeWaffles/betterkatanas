package betterkatanas.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import betterkatanas.init.BetterKatanasModGameRules;

import betterkatanas.entity.YamiSukehiroEntity;
import betterkatanas.entity.SasukeUchihaEntity;
import betterkatanas.entity.AkameBossEntity;

@Mod.EventBusSubscriber
public class WaifuspawngameruleProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinWorldEvent event) {
		execute(event, event.getWorld(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(BetterKatanasModGameRules.WAIFUSPAWN) == false) {
			if (entity instanceof AkameBossEntity) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if (entity instanceof SasukeUchihaEntity) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			} else if (entity instanceof YamiSukehiroEntity) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
			}
		}
	}
}
