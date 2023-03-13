package com.kelkchoz.kelkchozmod.common.items;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import com.kelkchoz.kelkchozmod.common.blocks.BlocksInit;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KelkchozMod.MODID);

    public static final RegistryObject<Item> COFFEEBEAN = ITEMS.register("coffeebean", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TORRIFIEDCOFFEEBEAN = ITEMS.register("torrifiedcoffeebean", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COFFEESEED = ITEMS.register("coffeeseed", () -> new ItemNameBlockItem(BlocksInit.COFFEECROP_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> COFFEEMACHINE = ITEMS.register("coffeemachine", () -> new BlockItem(BlocksInit.COFFEEMACHINE.get(), new Item.Properties()));
    public static final RegistryObject<Item> COFFEEFILTER = ITEMS.register("coffeefilter", () -> new Item(new Item.Properties()));


    public static void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.INGREDIENTS) {
            event.accept(COFFEEBEAN);
            event.accept(COFFEESEED);
            event.accept(TORRIFIEDCOFFEEBEAN);
            event.accept(COFFEEFILTER);
        }

        if (event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(COFFEEMACHINE);
        }
    }
}
