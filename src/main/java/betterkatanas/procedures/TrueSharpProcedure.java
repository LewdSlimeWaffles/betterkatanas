package betterkatanas.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

import betterkatanas.init.BetterKatanasModEnchantments;

@Mod.EventBusSubscriber
public class TrueSharpProcedure {
	@SubscribeEvent
	public static void onUseItemStart(LivingEntityUseItemEvent.Start event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double enchant_lvl = 0;
		enchant_lvl = EnchantmentHelper.getItemEnchantmentLevel(BetterKatanasModEnchantments.TRUE_SHARPNESS.get(),
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
		if (enchant_lvl == 1) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (6 + 0.5)));
		} else if (enchant_lvl == 2) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (7 + 0.5)));
		} else if (enchant_lvl == 3) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (8 + 0.5)));
		} else if (enchant_lvl == 4) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (9 + 0.5)));
		} else if (enchant_lvl == 5) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (10 + 0.5)));
		} else if (enchant_lvl == 6) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (11 + 0.5)));
		} else if (enchant_lvl == 7) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (12 + 0.5)));
		} else if (enchant_lvl == 8) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (13 + 0.5)));
		} else if (enchant_lvl == 9) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (14 + 0.5)));
		} else if (enchant_lvl == 10) {
			entity.hurt(DamageSource.GENERIC, (float) ((itemstack).getDamageValue() + 0.5 * (15 + 0.5)));
		}
	}
}
