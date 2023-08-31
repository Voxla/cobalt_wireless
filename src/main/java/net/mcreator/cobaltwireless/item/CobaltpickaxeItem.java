
package net.mcreator.cobaltwireless.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cobaltwireless.init.CobaltWirelessModItems;

public class CobaltpickaxeItem extends PickaxeItem {
	public CobaltpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CobaltWirelessModItems.COBALTINGOT.get()));
			}
		}, 1, -2.8f, new Item.Properties());
	}
}
