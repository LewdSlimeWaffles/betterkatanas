
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import betterkatanas.enchantment.TrueSharpnessEnchantment;
import betterkatanas.enchantment.RadialSlashEnchantment;

import betterkatanas.BetterKatanasMod;

public class BetterKatanasModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetterKatanasMod.MODID);
	public static final RegistryObject<Enchantment> RADIAL_SLASH = REGISTRY.register("radial_slash", () -> new RadialSlashEnchantment());
	public static final RegistryObject<Enchantment> TRUE_SHARPNESS = REGISTRY.register("true_sharpness", () -> new TrueSharpnessEnchantment());
}
