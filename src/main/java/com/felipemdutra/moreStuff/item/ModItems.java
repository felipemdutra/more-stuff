package com.felipemdutra.moreStuff.item;

import com.felipemdutra.moreStuff.MoreStuff;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item TEST_ITEM;

    @SuppressWarnings("unchecked")
    private static <T extends Item> RegistryKey<T> keyOf(String id) {
        return (RegistryKey<T>) RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreStuff.ID, id));
    }

    public static <T extends Item> T register(String id, Function<Item.Settings, Item> factory, Item.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    @SuppressWarnings("unchecked")
    public static <T extends Item> T register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        T item = (T) factory.apply(settings.registryKey(key));
        return Registry.register(Registries.ITEM, key, item);
    }

    public static void initialize() {
        MoreStuff.LOGGER.info("ModItems initialized!");
    }

    static {
        TEST_ITEM = register("test_item", Item::new, new Item.Settings());
    }
}
