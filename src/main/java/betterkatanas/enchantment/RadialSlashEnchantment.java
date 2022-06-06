
package betterkatanas.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
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
		if (stack.getItem() == BetterKatanasModItems.WOOD_SWORD.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.STONE_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.IRON_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.GOLD_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.DIAMOND_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.NETHERITE_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.OBSIDIAN_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.EMERALD_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.VOID_KATANA.get())
			return true;
		if (stack.getItem() == BetterKatanasModItems.AMETHYST_KATANA.get())
			return true;
		return false;
	}
}
