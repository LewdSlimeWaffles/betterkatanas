
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import betterkatanas.enchantment.TrueSharpnessEnchantment;
import betterkatanas.enchantment.StrengthEnchantment;
import betterkatanas.enchantment.SpeedEnchantment;
import betterkatanas.enchantment.RadialSlashEnchantment;
import betterkatanas.enchantment.LightningBladeEnchantment;

import betterkatanas.BetterKatanasMod;

public class BetterKatanasModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetterKatanasMod.MODID);
	public static final RegistryObject<Enchantment> RADIAL_SLASH = REGISTRY.register("radial_slash", () -> new RadialSlashEnchantment());
	public static final RegistryObject<Enchantment> TRUE_SHARPNESS = REGISTRY.register("true_sharpness", () -> new TrueSharpnessEnchantment());
	public static final RegistryObject<Enchantment> LIGHTNING_BLADE = REGISTRY.register("lightning_blade", () -> new LightningBladeEnchantment());
	public static final RegistryObject<Enchantment> STRENGTH = REGISTRY.register("strength", () -> new StrengthEnchantment());
	public static final RegistryObject<Enchantment> SPEED = REGISTRY.register("speed", () -> new SpeedEnchantment());
}
