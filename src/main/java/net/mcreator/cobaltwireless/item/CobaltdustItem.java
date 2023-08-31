
package net.mcreator.cobaltwireless.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CobaltdustItem extends Item {
	public CobaltdustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
