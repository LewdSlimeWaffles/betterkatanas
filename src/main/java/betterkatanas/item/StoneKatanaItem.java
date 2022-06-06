
package betterkatanas.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import betterkatanas.init.BetterKatanasModTabs;

public class StoneKatanaItem extends SwordItem {
	public StoneKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 400;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.SMOOTH_STONE));
			}
		}, 3, -2f, new Item.Properties().tab(BetterKatanasModTabs.TAB_KATANA_COLLECTION));
	}
}
