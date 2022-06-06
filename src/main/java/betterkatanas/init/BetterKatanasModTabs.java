
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BetterKatanasModTabs {
	public static CreativeModeTab TAB_KATANA_COLLECTION;
	public static CreativeModeTab TAB_ANIME_KATANA_COLLECTION;
	public static CreativeModeTab TAB_BETTER_KATANAS_MOBS;

	public static void load() {
		TAB_KATANA_COLLECTION = new CreativeModeTab("tabkatana_collection") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BetterKatanasModItems.VOID_KATANA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ANIME_KATANA_COLLECTION = new CreativeModeTab("tabanime_katana_collection") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BetterKatanasModItems.MURASAME.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BETTER_KATANAS_MOBS = new CreativeModeTab("tabbetter_katanas_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.SPIDER_SPAWN_EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
