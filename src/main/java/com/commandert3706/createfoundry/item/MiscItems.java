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
            new Item.Properties().tab(ModCreativeModeTab.CREATE_FOUNDRY);
    public static final BucketItem.Properties BUCKET_PROPERTIES =
            new Item.Properties().tab(ModCreativeModeTab.CREATE_FOUNDRY);

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFoundry.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("molten_copper_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_COPPER_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("molten_iron_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_IRON_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("molten_gold_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_GOLD_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_CARBON_BUCKET = ITEMS.register("molten_carbon_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_CARBON_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_DIAMOND_BUCKET = ITEMS.register("molten_diamond_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_DIAMOND_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_ZINC_BUCKET = ITEMS.register("molten_zinc_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_ZINC_STILL, BUCKET_PROPERTIES));

    public static final RegistryObject<Item> MOLTEN_BRASS_BUCKET = ITEMS.register("molten_brass_bucket",
            () -> new BucketItem(ModFluids.MOLTEN_BRASS_STILL, BUCKET_PROPERTIES));


    public static final RegistryObject<Item> INGOT_MOULD_BLUEPRINT = ITEMS.register("ingot_mould_blueprint",
            () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> COKE_MOULD_BLUEPRINT = ITEMS.register("coke_mould_blueprint",
            () -> new Item(DEFAULT_PROPERTIES));
    public static final RegistryObject<Item> GEM_MOULD_BLUEPRINT = ITEMS.register("gem_mould_blueprint",
            () -> new Item(DEFAULT_PROPERTIES));
}
