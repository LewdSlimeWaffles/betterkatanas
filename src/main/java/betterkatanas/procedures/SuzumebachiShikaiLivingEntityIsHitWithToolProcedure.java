package betterkatanas.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import betterkatanas.init.BetterKatanasModMobEffects;

public class SuzumebachiShikaiLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(BetterKatanasModMobEffects.SUZUMEBACHI_FLOWER.get()) : false) {
			entity.hurt(DamageSource.GENERIC, 300);
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(BetterKatanasModMobEffects.SUZUMEBACHI_FLOWER.get(), 60000, 1));
		}
	}
}
