package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EmeraldMouldItems {
    public static final FabricItemSettings DEFAULT_MOULD =
            new FabricItemSettings().fireproof().group(ModItemGroup.CREATE_FOUNDRY).maxCount(8);

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFoundry.MOD_ID, name), item);
    }

    public static void registerMouldItems() {
        CreateFoundry.LOGGER.info("Registering Mould Items for: " + CreateFoundry.MOD_ID);
    }



    public static final Item EMERALD_GEM_MOULD = registerItem("emerald_gem_mould",
            new Item(DEFAULT_MOULD));
}
