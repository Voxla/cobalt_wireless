
package net.mcreator.cobaltwireless.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CobaltshardItem extends Item {
	public CobaltshardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
