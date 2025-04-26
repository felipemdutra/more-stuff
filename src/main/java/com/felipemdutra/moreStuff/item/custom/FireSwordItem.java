package com.felipemdutra.moreStuff.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;

public class FireSwordItem extends CustomSwordItem {
    private static final float FIRE_DURATION_SECS = 5.0f;

    public FireSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings.fireproof());
    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);

        // apply fire effect for 6 seconds
        target.setOnFireFor(FIRE_DURATION_SECS);
    }
}
