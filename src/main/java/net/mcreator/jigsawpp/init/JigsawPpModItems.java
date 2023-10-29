
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jigsawpp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.jigsawpp.item.PenisItem;
import net.mcreator.jigsawpp.JigsawPpMod;

public class JigsawPpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, JigsawPpMod.MODID);
	public static final RegistryObject<Item> PENIS = REGISTRY.register("penis", () -> new PenisItem());
}
