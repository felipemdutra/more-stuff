package com.felipemdutra.moreStuff.item.custom;

import com.felipemdutra.moreStuff.ModTags;
import com.felipemdutra.moreStuff.MoreStuff;
import net.minecraft.item.ToolMaterial;

public class CustomToolMaterials {
    public static final ToolMaterial FIRE = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_FIRE_TOOL, 1261, 7.0F, 3.0F, 11, ModTags.Items.FIRE_REPAIR);

    public static void initialize() {
        MoreStuff.LOGGER.info("CustomToolMaterials initialized!");
    }
}
