package com.kelkchoz.kelkchozmod.common.screen;

import com.kelkchoz.kelkchozmod.KelkchozMod;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KelkchozMod.MODID);

    public static final RegistryObject<MenuType<CoffeemachineMenu>> COFFEEMACHINE_MENU = MENUS.register("coffeemachine_menu", () -> IForgeMenuType.create(CoffeemachineMenu::new));
}
