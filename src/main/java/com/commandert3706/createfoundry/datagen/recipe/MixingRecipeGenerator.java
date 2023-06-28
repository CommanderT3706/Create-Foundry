package com.commandert3706.createfoundry.datagen.recipe;

import com.commandert3706.createfoundry.datagen.MaterialLists;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Items;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class MixingRecipeGenerator extends ProcessingRecipeGen {
    public List<GeneratedRecipe> mixingGeneratedRecipeList = new ArrayList<>();

    public void generateRecipesFromUnit() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/" + material + "_from_ingot"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", material + "_ingot")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.CREATE_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/" + material + "_from_ingot"),
                    b -> b.require(Registry.ITEM.get(new Identifier("create", material + "_ingot")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_STANDARD_LOOT) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/" + material + "_from_gem"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", material + "_gem")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_EXTRA_LOOT) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/" + material + "_from_gem"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", material + "_gem")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/carbon_from_coal"),
                b -> b.require(Items.COAL)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/carbon_from_charcoal"),
                b -> b.require(Items.CHARCOAL)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/netherite_from_scrap"),
                b -> b.require(Items.NETHERITE_SCRAP)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_ancient_debris")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/unit/netherite_from_ingot"),
                b -> b.require(Items.NETHERITE_INGOT)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_netherite")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateRecipesFromRawOre() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/raw/" + material + "_from_raw_ore"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", "raw_" + material)))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.RAW_ORE_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/raw/zinc_from_raw_ore"),
                b -> b.require(Registry.ITEM.get(new Identifier("create", "raw_zinc")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_zinc")),
                                MaterialLists.FluidConstants.RAW_ORE_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateRecipesFromOre() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/" + material + "_from_ore"),
                    b -> b.require(TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft", material + "_ores")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.ORE_FLUID_AMOUNT)
                            .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_STANDARD_LOOT) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/" + material + "_from_ore"),
                    b -> b.require(TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft", material + "_ores")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.ORE_FLUID_AMOUNT)
                            .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_EXTRA_LOOT) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/" + material + "_from_ore"),
                    b -> b.require(TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft", material + "_ores")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.ORE_FLUID_AMOUNT * 3)
                            .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/carbon_from_ore"),
                b -> b.require(TagKey.of(Registry.ITEM_KEY, new Identifier("minecraft", "coal_ores")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")),
                                MaterialLists.FluidConstants.ORE_FLUID_AMOUNT)
                        .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/zinc_from_ore"),
                b -> b.require(TagKey.of(Registry.ITEM_KEY, new Identifier("c", "ores/zinc")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_zinc")),
                                MaterialLists.FluidConstants.ORE_FLUID_AMOUNT)
                        .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/ore/ancient_debris_from_ore"),
                b -> b.require(Items.ANCIENT_DEBRIS)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_ancient_debris")),
                                MaterialLists.FluidConstants.ORE_FLUID_AMOUNT / 4)
                        .output(Fluids.LAVA, MaterialLists.FluidConstants.ORE_LAVA_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateRecipesFromCrushedOre() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/crushed_ore/" + material + "_from_crushed_ore"),
                    b -> b.require(Registry.ITEM.get(new Identifier("create", "raw_crushed_" + material + "_ore")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.CRUSHED_ORE_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/crushed_ore/zinc_from_crushed_ore"),
                b -> b.require(Registry.ITEM.get(new Identifier("create", "raw_crushed_zinc_ore")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_zinc")),
                                MaterialLists.FluidConstants.CRUSHED_ORE_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateRecipesFromBlock() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/" + material + "_from_block"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", material + "_block")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.BLOCK_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_STANDARD_LOOT) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/" + material + "_from_block"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", material + "_block")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.BLOCK_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        for (String material : MaterialLists.CREATE_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/" + material + "_from_block"),
                    b -> b.require(Registry.ITEM.get(new Identifier("create", material + "_block")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.BLOCK_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/carbon_from_block"),
                b -> b.require(Registry.ITEM.get(new Identifier("minecraft", "coal_block")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")),
                                MaterialLists.FluidConstants.BLOCK_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/netherite_from_block"),
                b -> b.require(Items.NETHERITE_BLOCK)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_netherite")),
                                MaterialLists.FluidConstants.BLOCK_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateRecipesFromRawOreBlock() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/raw_" + material + "_from_block"),
                    b -> b.require(Registry.ITEM.get(new Identifier("minecraft", "raw_" + material + "_block")))
                            .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.RAW_BLOCK_FLUID_AMOUNT)
                            .requiresHeat(HeatCondition.SUPERHEATED)));
        }

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "melting/block/raw/zinc_from_block"),
                b -> b.require(Registry.ITEM.get(new Identifier("create", "raw_zinc_block")))
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_zinc")),
                                MaterialLists.FluidConstants.CRUSHED_ORE_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public void generateOtherMixingRecipes() {
        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "molten_brass_from_copper_zinc"),
                b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_copper")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .require(Registry.FLUID.get(new Identifier("createfoundry", "molten_zinc")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_brass")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT * 2)
                        .requiresHeat(HeatCondition.SUPERHEATED)));

        mixingGeneratedRecipeList.add(create(new Identifier("createfoundry", "molten_netherite_from_ancient_debris_gold"),
                b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_ancient_debris")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT / 2)
                        .require(Registry.FLUID.get(new Identifier("createfoundry", "molten_gold")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT / 2)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_netherite")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .requiresHeat(HeatCondition.SUPERHEATED)));
    }

    public MixingRecipeGenerator(FabricDataGenerator generator) {
        super(generator);

        generateRecipesFromUnit();
        generateRecipesFromRawOre();
        generateRecipesFromOre();
        generateRecipesFromCrushedOre();
        generateRecipesFromBlock();
        generateRecipesFromRawOreBlock();
        generateOtherMixingRecipes();
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.MIXING;
    }
}
