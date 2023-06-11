package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import com.commandert3706.createfoundry.fluid.ModFluids;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MiscItems {
    public static final FabricItemSettings DEFAULT_SETTINGS = new FabricItemSettings().group(ModItemGroup.CREATE_FOUNDRY);
    public static final FabricItemSettings BUCKET_SETTINGS = new FabricItemSettings().group(ModItemGroup.CREATE_FOUNDRY).maxCount(1);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFoundry.MOD_ID, name), item);
    }

    public static void registerMiscItems() {
        CreateFoundry.LOGGER.info("Registering Mould Items for: " + CreateFoundry.MOD_ID);
    }


    public static final Item MOLTEN_COPPER_BUCKET = registerItem("molten_copper_bucket",
            new BucketItem(ModFluids.MOLTEN_COPPER_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_IRON_BUCKET = registerItem("molten_iron_bucket",
            new BucketItem(ModFluids.MOLTEN_IRON_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_GOLD_BUCKET = registerItem("molten_gold_bucket",
            new BucketItem(ModFluids.MOLTEN_GOLD_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_CARBON_BUCKET = registerItem("molten_carbon_bucket",
            new BucketItem(ModFluids.MOLTEN_CARBON_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_DIAMOND_BUCKET = registerItem("molten_diamond_bucket",
            new BucketItem(ModFluids.MOLTEN_DIAMOND_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_ZINC_BUCKET = registerItem("molten_zinc_bucket",
            new BucketItem(ModFluids.MOLTEN_ZINC_STILL, BUCKET_SETTINGS));

    public static final Item MOLTEN_BRASS_BUCKET = registerItem("molten_brass_bucket",
            new BucketItem(ModFluids.MOLTEN_BRASS_STILL, BUCKET_SETTINGS));
}
