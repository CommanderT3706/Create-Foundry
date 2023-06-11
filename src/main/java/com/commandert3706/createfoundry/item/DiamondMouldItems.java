package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DiamondMouldItems {
    public static final FabricItemSettings DEFAULT_MOULD =
            new FabricItemSettings().fireproof().group(ModItemGroup.CREATE_FOUNDRY).maxCount(8);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFoundry.MOD_ID, name), item);
    }

    public static void registerMouldItems() {
        CreateFoundry.LOGGER.info("Registering Mould Items for: " + CreateFoundry.MOD_ID);
    }



    public static final Item FILLED_DIAMOND_MOULD = registerItem("diamond_gem_mould",
            new Item(DEFAULT_MOULD));
}
