
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import betterkatanas.item.YamiKatanaItem;
import betterkatanas.item.YamiAdvitaSlashItem;
import betterkatanas.item.WoodSwordItem;
import betterkatanas.item.VoidKatanaItem;
import betterkatanas.item.StoneKatanaItem;
import betterkatanas.item.SnakeSwordItem;
import betterkatanas.item.ObsidianKatanaItem;
import betterkatanas.item.NetheriteKatanaItem;
import betterkatanas.item.MurasameItem;
import betterkatanas.item.IronKatanaItem;
import betterkatanas.item.HeartForAdvancmentsItem;
import betterkatanas.item.GoldKatanaItem;
import betterkatanas.item.EmeraldKatanaItem;
import betterkatanas.item.DiamondKatanaItem;
import betterkatanas.item.AmethystKatanaItem;

import betterkatanas.BetterKatanasMod;

public class BetterKatanasModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterKatanasMod.MODID);
	public static final RegistryObject<Item> WOOD_SWORD = REGISTRY.register("wood_sword", () -> new WoodSwordItem());
	public static final RegistryObject<Item> STONE_KATANA = REGISTRY.register("stone_katana", () -> new StoneKatanaItem());
	public static final RegistryObject<Item> IRON_KATANA = REGISTRY.register("iron_katana", () -> new IronKatanaItem());
	public static final RegistryObject<Item> GOLD_KATANA = REGISTRY.register("gold_katana", () -> new GoldKatanaItem());
	public static final RegistryObject<Item> DIAMOND_KATANA = REGISTRY.register("diamond_katana", () -> new DiamondKatanaItem());
	public static final RegistryObject<Item> NETHERITE_KATANA = REGISTRY.register("netherite_katana", () -> new NetheriteKatanaItem());
	public static final RegistryObject<Item> OBSIDIAN_KATANA = REGISTRY.register("obsidian_katana", () -> new ObsidianKatanaItem());
	public static final RegistryObject<Item> EMERALD_KATANA = REGISTRY.register("emerald_katana", () -> new EmeraldKatanaItem());
	public static final RegistryObject<Item> VOID_KATANA = REGISTRY.register("void_katana", () -> new VoidKatanaItem());
	public static final RegistryObject<Item> MURASAME = REGISTRY.register("murasame", () -> new MurasameItem());
	public static final RegistryObject<Item> AKAME_BOSS = REGISTRY.register("akame_boss_spawn_egg",
			() -> new ForgeSpawnEggItem(BetterKatanasModEntities.AKAME_BOSS, -16777216, -6750208,
					new Item.Properties().tab(BetterKatanasModTabs.TAB_BETTER_KATANAS_MOBS)));
	public static final RegistryObject<Item> HEART_FOR_ADVANCMENTS = REGISTRY.register("heart_for_advancments", () -> new HeartForAdvancmentsItem());
	public static final RegistryObject<Item> YAMI_SUKEHIRO = REGISTRY.register("yami_sukehiro_spawn_egg",
			() -> new ForgeSpawnEggItem(BetterKatanasModEntities.YAMI_SUKEHIRO, -16777216, -10066330,
					new Item.Properties().tab(BetterKatanasModTabs.TAB_BETTER_KATANAS_MOBS)));
	public static final RegistryObject<Item> YAMI_KATANA = REGISTRY.register("yami_katana", () -> new YamiKatanaItem());
	public static final RegistryObject<Item> AMETHYST_KATANA = REGISTRY.register("amethyst_katana", () -> new AmethystKatanaItem());
	public static final RegistryObject<Item> YAMI_ADVITA_SLASH = REGISTRY.register("yami_advita_slash", () -> new YamiAdvitaSlashItem());
	public static final RegistryObject<Item> SASUKE_UCHIHA = REGISTRY.register("sasuke_uchiha_spawn_egg",
			() -> new ForgeSpawnEggItem(BetterKatanasModEntities.SASUKE_UCHIHA, -13421773, -10092544,
					new Item.Properties().tab(BetterKatanasModTabs.TAB_BETTER_KATANAS_MOBS)));
	public static final RegistryObject<Item> SNAKE_SWORD = REGISTRY.register("snake_sword", () -> new SnakeSwordItem());
}
