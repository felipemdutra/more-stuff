package com.felipemdutra.moreStuff;

import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModComponents {
    public static ComponentType<List<NbtCompound>> TOTEM_DATA;

    private static <T> ComponentType<T> register(String id) {
        return register(id, null);
    }

    private static <T> ComponentType<T> register(String id, Codec<T> codec) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(MoreStuff.ID, id),
                ComponentType.<T>builder().codec(codec).build());
    }

    static {
        TOTEM_DATA = register("totem_data");
    }
}
