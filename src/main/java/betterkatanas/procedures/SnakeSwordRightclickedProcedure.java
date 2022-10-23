package betterkatanas.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.Map;

import betterkatanas.init.BetterKatanasModEnchantments;

public class SnakeSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double CurrentSharpLvl = 0;
		double counter = 0;
		double raytrace_distance = 0;
		(itemstack).enchant(BetterKatanasModEnchantments.LIGHTNING_BLADE.get(), 1);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(BetterKatanasModEnchantments.LIGHTNING_BLADE.get())) {
						_enchantments.remove(BetterKatanasModEnchantments.LIGHTNING_BLADE.get());
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 400);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 200);
	}
}
