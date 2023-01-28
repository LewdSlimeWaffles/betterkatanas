
package betterkatanas.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

import betterkatanas.init.BetterKatanasModItems;

public class RadialSlashEnchantment extends Enchantment {
	public RadialSlashEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(BetterKatanasModItems.WOOD_SWORD.get(), BetterKatanasModItems.STONE_KATANA.get(), BetterKatanasModItems.IRON_KATANA.get(),
				BetterKatanasModItems.GOLD_KATANA.get(), BetterKatanasModItems.DIAMOND_KATANA.get(), BetterKatanasModItems.NETHERITE_KATANA.get(),
				BetterKatanasModItems.OBSIDIAN_KATANA.get(), BetterKatanasModItems.EMERALD_KATANA.get(), BetterKatanasModItems.VOID_KATANA.get(),
				BetterKatanasModItems.AMETHYST_KATANA.get()).contains(item);
	}
}
