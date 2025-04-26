package com.felipemdutra.moreStuff;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FIRE_REPAIR = createTag("fire_repair");

        private static TagKey<Item> createTag(String id) {
            MoreStuff.LOGGER.info("ModTags::Items::createTag called!");
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreStuff.ID, id));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_FIRE_TOOL = createTag("incorrect_for_fire_tool");

        private static TagKey<Block> createTag(String id) {
            MoreStuff.LOGGER.info("ModTags::Blocks::createTag called!");
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MoreStuff.ID, id));
        }
    }
}
