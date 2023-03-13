package com.kelkchoz.kelkchozmod.common.effect;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectsInit {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KelkchozMod.MODID);
    public static final RegistryObject<MobEffect> COFFEE_EFFECT = MOB_EFFECTS.register("coffee_effect", CoffeeEffect::new);
}


