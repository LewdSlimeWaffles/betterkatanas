
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterKatanasModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> WAIFUSPAWN = GameRules.register("waifuspawn", GameRules.Category.SPAWNING,
			GameRules.BooleanValue.create(true));
}
