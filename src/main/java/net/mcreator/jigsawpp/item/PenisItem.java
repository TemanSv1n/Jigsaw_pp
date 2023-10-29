
package net.mcreator.jigsawpp.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PenisItem extends Item {
	public PenisItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
