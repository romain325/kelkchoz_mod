package com.kelkchoz.kelkchozmod.common.potions;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionsInit {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, KelkchozMod.MODID);
    public static final RegistryObject<Potion> COFFEE_BUCKET = POTIONS.register("coffee_bucket", () -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 42069, 5), new MobEffectInstance(MobEffects.DIG_SPEED, 42069, 5)));
}
