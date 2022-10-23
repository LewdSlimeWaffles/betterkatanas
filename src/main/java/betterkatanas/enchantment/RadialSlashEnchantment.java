
package betterkatanas.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

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
		return item == BetterKatanasModItems.WOOD_SWORD.get() || item == BetterKatanasModItems.STONE_KATANA.get()
				|| item == BetterKatanasModItems.IRON_KATANA.get() || item == BetterKatanasModItems.GOLD_KATANA.get()
				|| item == BetterKatanasModItems.DIAMOND_KATANA.get() || item == BetterKatanasModItems.NETHERITE_KATANA.get()
				|| item == BetterKatanasModItems.OBSIDIAN_KATANA.get() || item == BetterKatanasModItems.EMERALD_KATANA.get()
				|| item == BetterKatanasModItems.VOID_KATANA.get() || item == BetterKatanasModItems.AMETHYST_KATANA.get();
	}
}
