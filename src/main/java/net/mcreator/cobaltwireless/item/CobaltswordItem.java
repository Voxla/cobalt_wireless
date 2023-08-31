
package net.mcreator.cobaltwireless.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cobaltwireless.init.CobaltWirelessModItems;

public class CobaltswordItem extends SwordItem {
	public CobaltswordItem() {
		super(new Tier() {
			public int getUses() {
				return 200;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CobaltWirelessModItems.COBALTINGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
