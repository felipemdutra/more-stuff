package com.felipemdutra.moreStuff.item.custom;
import com.felipemdutra.moreStuff.MoreStuff;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class CustomSwordItem extends Item {
    protected CustomSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
		super(settings.sword(material, attackDamage, attackSpeed));
        MoreStuff.LOGGER.info("CustomSwordItem constructor called - DEBUG");
    }
}
