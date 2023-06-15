package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CarbonMouldItems {
    public static final Item.Properties DEFAULT_MOULD =
            new Item.Properties().fireResistant().stacksTo(8).tab(ModCreativeModeTab.CREATE_FOUNDRY);

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFoundry.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> FILLED_COKE_MOULD = ITEMS.register("filled_coke_mould",
            () -> new Item(DEFAULT_MOULD));
}
