package com.kelkchoz.kelkchozmod.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class CoffeeEffect extends MobEffect {
    protected CoffeeEffect() {
        super(MobEffectCategory.BENEFICIAL, 5516580);
        this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "43707153-8814-4509-92CC-091FC944AD74", 0.5F, AttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(Attributes.ATTACK_SPEED, "E796DB36-2216-41DA-AFDD-77B253070475", 0.5F, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
