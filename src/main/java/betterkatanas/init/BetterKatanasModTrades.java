
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package betterkatanas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetterKatanasModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(BetterKatanasModItems.WOOD_SWORD.get()), 10, 10, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10),

					new ItemStack(BetterKatanasModItems.STONE_KATANA.get()), 10, 10, 0.06f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20),

					new ItemStack(BetterKatanasModItems.IRON_KATANA.get()), 6, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(BetterKatanasModItems.EMERALD_KATANA.get()), 4, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25),

					new ItemStack(BetterKatanasModItems.DIAMOND_KATANA.get()), 4, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 35),

					new ItemStack(BetterKatanasModItems.NETHERITE_KATANA.get()), 2, 5, 0.05f));
		}
	}
}
