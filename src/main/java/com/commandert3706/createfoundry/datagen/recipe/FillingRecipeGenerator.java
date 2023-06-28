package com.commandert3706.createfoundry.datagen.recipe;

import com.commandert3706.createfoundry.datagen.MaterialLists;
import com.commandert3706.createfoundry.item.EmptyMouldItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class FillingRecipeGenerator extends ProcessingRecipeGen {

    public List<GeneratedRecipe> fillingGeneratedRecipeList = new ArrayList<>();

    public void registerRecipes() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/" + material + "_ingot_mould"),
                    b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                            MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .require(EmptyMouldItems.EMPTY_INGOT_MOULD)
                            .output(Registry.ITEM.get(new Identifier("createfoundry", material + "_ingot_mould")))));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_STANDARD_LOOT) {
            fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/" + material + "_gem_mould"),
                    b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                            MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .require(EmptyMouldItems.EMPTY_GEM_MOULD)
                            .output(Registry.ITEM.get(new Identifier("createfoundry", material + "_gem_mould")))));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_EXTRA_LOOT) {
            fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/" + material + "_gem_mould"),
                    b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                                    MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .require(EmptyMouldItems.EMPTY_GEM_MOULD)
                            .output(Registry.ITEM.get(new Identifier("createfoundry", material + "_gem_mould")))));
        }

        for (String material : MaterialLists.CREATE_INGOT_MATERIALS) {
            fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/" + material + "_ingot_mould"),
                    b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_" + material)),
                            MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                            .require(EmptyMouldItems.EMPTY_INGOT_MOULD)
                            .output(Registry.ITEM.get(new Identifier("createfoundry", material + "_ingot_mould")))));
        }

        fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/filled_coke_mould"),
                b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")),
                        MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .require(EmptyMouldItems.EMPTY_COKE_MOULD)
                        .output(Registry.ITEM.get(new Identifier("createfoundry", "filled_coke_mould")))));

        fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/ancient_debris_gem_mould"),
                b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_ancient_debris")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .require(EmptyMouldItems.EMPTY_GEM_MOULD)
                        .output(Registry.ITEM.get(new Identifier("createfoundry", "ancient_debris_gem_mould")))));

        fillingGeneratedRecipeList.add(create(new Identifier("createfoundry", "moulds/netherite_ingot_mould"),
                b -> b.require(Registry.FLUID.get(new Identifier("createfoundry", "molten_netherite")),
                                MaterialLists.FluidConstants.INGOT_FLUID_AMOUNT)
                        .require(EmptyMouldItems.EMPTY_INGOT_MOULD)
                        .output(Registry.ITEM.get(new Identifier("createfoundry", "netherite_ingot_mould")))));
    }

    public FillingRecipeGenerator(FabricDataGenerator generator) {
        super(generator);

        registerRecipes();
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.FILLING;
    }
}
