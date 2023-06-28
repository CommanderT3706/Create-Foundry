package com.commandert3706.createfoundry.datagen;

import com.commandert3706.createfoundry.datagen.models.ArmorTemplate;
import com.commandert3706.createfoundry.datagen.models.BlueprintTemplate;
import com.commandert3706.createfoundry.datagen.models.Material;
import com.commandert3706.createfoundry.datagen.models.ToolTemplate;
import com.commandert3706.createfoundry.fluid.ModFluids;
import com.commandert3706.createfoundry.item.DiamondMouldItems;
import com.commandert3706.createfoundry.item.EmptyMouldItems;
import com.commandert3706.createfoundry.item.IronMouldItems;
import com.commandert3706.createfoundry.item.MiscItems;
import com.simibubi.create.AllItems;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MaterialLists {
    
    public static final String[] MINECRAFT_INGOT_MATERIALS = {
            "copper",
            "iron",
            "gold",
    };

    public static final String[] MINECRAFT_GEM_MATERIALS_STANDARD_LOOT = {
            "diamond",
            "emerald",
    };

    public static final String[] MINECRAFT_GEM_MATERIALS_EXTRA_LOOT = {
            "lapis",
            "redstone"
    };

    public static final String[] CREATE_INGOT_MATERIALS = {
            "zinc",
            "brass"
    };

    public static final BlueprintTemplate[] BLUEPRINT_ITEMS = {
            new BlueprintTemplate(MiscItems.INGOT_MOULD_BLUEPRINT, Registry.ITEM.get(new Identifier("minecraft:iron_ingot")),
                    "ingot"),
            new BlueprintTemplate(MiscItems.GEM_MOULD_BLUEPRINT, Registry.ITEM.get(new Identifier("minecraft:diamond")),
                    "gem"),
            new BlueprintTemplate(MiscItems.COKE_MOULD_BLUEPRINT, Registry.ITEM.get(new Identifier("minecraft:coal")),
                    "coke"),
    };

    public static class FluidConstants {
        public static final int INGOT_FLUID_AMOUNT = 8100;
        public static final int RAW_ORE_FLUID_AMOUNT = 16200;
        public static final int ORE_FLUID_AMOUNT = 40500;
        public static final int ORE_LAVA_AMOUNT = 4050;
        public static final int CRUSHED_ORE_FLUID_AMOUNT = 16200;
        public static final int BLOCK_FLUID_AMOUNT = 72900;
        public static final int RAW_BLOCK_FLUID_AMOUNT = 145800;
    }
}
