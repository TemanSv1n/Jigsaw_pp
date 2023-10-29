
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawpp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.jigsawpp.item.PenisItem;
import net.mcreator.jigsawpp.JigsawPpMod;

public class JigsawPpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JigsawPpMod.MODID);
	public static final RegistryObject<Item> DEDOK = block(JigsawPpModBlocks.DEDOK, null);
	public static final RegistryObject<Item> PENIS = REGISTRY.register("penis", () -> new PenisItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
