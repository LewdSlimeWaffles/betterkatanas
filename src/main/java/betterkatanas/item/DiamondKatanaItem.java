
package betterkatanas.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import betterkatanas.init.BetterKatanasModTabs;

public class DiamondKatanaItem extends SwordItem {
	public DiamondKatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 1600;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.DIAMOND));
			}
		}, 3, -2f, new Item.Properties().tab(BetterKatanasModTabs.TAB_KATANA_COLLECTION));
	}
}
