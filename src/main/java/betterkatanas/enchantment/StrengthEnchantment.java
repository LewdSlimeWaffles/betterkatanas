
package betterkatanas.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

import betterkatanas.init.BetterKatanasModEnchantments;

public class StrengthEnchantment extends Enchantment {
	public StrengthEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return !List.of(BetterKatanasModEnchantments.TRUE_SHARPNESS.get()).contains(ench);
	}
}
