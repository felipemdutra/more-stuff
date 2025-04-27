package com.felipemdutra.moreStuff.item;

import com.felipemdutra.moreStuff.MoreStuff;
import com.felipemdutra.moreStuff.item.custom.CustomToolMaterials;
import com.felipemdutra.moreStuff.item.custom.FireSwordItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final FireSwordItem FIRE_SWORD;

    @SuppressWarnings("unchecked")
    private static <T extends Item> RegistryKey<T> keyOf(String id) {
        return (RegistryKey<T>) RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreStuff.ID, id));
    }

    public static <T extends Item> T register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    public static <T extends Item> T register(String id, Function<Item.Settings, Item> factory) {
        return register(id, factory, new Item.Settings());
    }

    @SuppressWarnings("unchecked")
    public static <T extends Item> T register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        T item = (T) factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> {
            itemGroup.add(FIRE_SWORD);
        });

        MoreStuff.LOGGER.info("ModItems initialized!");
    }

    static {
        FIRE_SWORD = register("fire_sword", settings -> new FireSwordItem(CustomToolMaterials.FIRE,
                3.0f, -2.4f, settings));
    }
}
