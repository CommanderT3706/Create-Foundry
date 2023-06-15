package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EmptyMouldItems {
    public static final Item.Properties DEFAULT_MOULD =
            new Item.Properties().tab(ModCreativeModeTab.CREATE_FOUNDRY).stacksTo(8).fireResistant();

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFoundry.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> EMPTY_INGOT_MOULD = ITEMS.register("empty_ingot_mould",
            () -> new Item(DEFAULT_MOULD));

    public static final RegistryObject<Item> EMPTY_COKE_MOULD = ITEMS.register("empty_coke_mould",
            () -> new Item(DEFAULT_MOULD));

    public static final RegistryObject<Item> EMPTY_GEM_MOULD = ITEMS.register("empty_gem_mould",
            () -> new Item(DEFAULT_MOULD));
}
