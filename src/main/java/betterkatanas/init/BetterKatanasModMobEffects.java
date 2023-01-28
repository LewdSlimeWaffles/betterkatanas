
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import betterkatanas.potion.SuzumebachiFlowerMobEffect;

import betterkatanas.BetterKatanasMod;

public class BetterKatanasModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BetterKatanasMod.MODID);
	public static final RegistryObject<MobEffect> SUZUMEBACHI_FLOWER = REGISTRY.register("suzumebachi_flower",
			() -> new SuzumebachiFlowerMobEffect());
}
