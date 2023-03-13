package com.kelkchoz.kelkchozmod.common.blocks;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KelkchozMod.MODID);

    public static final RegistryObject<Block> COFFEECROP_BLOCK = BLOCKS.register("coffee_crop", () -> new CoffeeCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));
    public static final RegistryObject<Block> COFFEEMACHINE = BLOCKS.register("coffeemachine", () -> new CoffeeMachine(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()));

}
