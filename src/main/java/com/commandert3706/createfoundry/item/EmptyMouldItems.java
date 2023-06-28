package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EmptyMouldItems {
    public static final FabricItemSettings DEFAULT_MOULD = 
            new FabricItemSettings().fireproof().group(ModItemGroup.CREATE_FOUNDRY).maxCount(8);
    
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFoundry.MOD_ID, name), item);
    }
    
    public static void registerMouldItems() {
        CreateFoundry.LOGGER.info("Registering Mould Items for: " + CreateFoundry.MOD_ID);
    }
    
    

    public static final Item EMPTY_INGOT_MOULD = registerItem("empty_ingot_mould",
            new Item(DEFAULT_MOULD));
    public static final Item EMPTY_COKE_MOULD = registerItem("empty_coke_mould",
            new Item(DEFAULT_MOULD));
    public static final Item EMPTY_GEM_MOULD = registerItem("empty_gem_mould",
            new Item(DEFAULT_MOULD));
}
