package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import com.commandert3706.createfoundry.fluid.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MiscItems {
    public static final Item.Properties DEFAULT_PROPERTIES =
            new Item.Properties().tab(CreativeModeTab.TAB_MISC);
    public static final BucketItem.Properties BUCKET_PROPERTIES =
            new Item.Properties().tab(CreativeModeTab.TAB_MISC);

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFoundry.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_COPPER_STILL, BUCKET_PROPERTIES));
}
