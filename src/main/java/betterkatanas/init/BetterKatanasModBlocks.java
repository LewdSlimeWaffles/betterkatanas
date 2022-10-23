
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import betterkatanas.block.TestingBlock;

import betterkatanas.BetterKatanasMod;

public class BetterKatanasModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterKatanasMod.MODID);
	public static final RegistryObject<Block> TESTING = REGISTRY.register("testing", () -> new TestingBlock());
}
