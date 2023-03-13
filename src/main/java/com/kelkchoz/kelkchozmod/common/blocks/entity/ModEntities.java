package com.kelkchoz.kelkchozmod.common.blocks.entity;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import com.kelkchoz.kelkchozmod.common.blocks.BlocksInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KelkchozMod.MODID);
    public static final RegistryObject<BlockEntityType<CoffeeMachineEntity>> COFFEEMACHINE_ENTITY = BLOCK_ENTITIES.register("coffeemachine", () -> BlockEntityType.Builder.of(CoffeeMachineEntity::new, BlocksInit.COFFEEMACHINE.get()).build(null));
    
}

