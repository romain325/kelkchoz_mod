package com.kelkchoz.kelkchozmod.common.event.loot;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEventLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, KelkchozMod.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_COFFEE_TO_WHEAT =
            LOOT_MODIFIER_SERIALIZER.register("add_item", AddItemModifier.CODEC);
}
