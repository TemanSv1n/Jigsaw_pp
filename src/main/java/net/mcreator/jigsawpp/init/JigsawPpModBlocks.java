
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawpp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jigsawpp.block.ElephjantBlock;
import net.mcreator.jigsawpp.JigsawPpMod;

public class JigsawPpModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JigsawPpMod.MODID);
	public static final RegistryObject<Block> ELEPHJANT = REGISTRY.register("elephjant", () -> new ElephjantBlock());
}
