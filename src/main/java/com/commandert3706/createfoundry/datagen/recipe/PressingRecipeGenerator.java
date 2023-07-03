package com.commandert3706.createfoundry.datagen.recipe;

import com.commandert3706.createfoundry.datagen.MaterialLists;
import com.commandert3706.createfoundry.item.EmptyMouldItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class PressingRecipeGenerator extends ProcessingRecipeGen {
    public List<GeneratedRecipe> pressingGeneratedRecipeList = new ArrayList<>();

    public void generatePressingRecipes() {
        for (String material : MaterialLists.MINECRAFT_INGOT_MATERIALS) {
            pressingGeneratedRecipeList.add(create(
                    new Identifier("createfoundry", material + "_ingot_from_mould"), b -> b
                            .require(Registry.ITEM.get(new Identifier("createfoundry", material + "_ingot_mould")))
                            .output(Registry.ITEM.get(new Identifier("minecraft", material + "_ingot")))
                            .output(EmptyMouldItems.EMPTY_INGOT_MOULD)
            ));
        }

        for (String material : MaterialLists.MINECRAFT_GEM_MATERIALS_STANDARD_LOOT) {
            pressingGeneratedRecipeList.add(create(
                    new Identifier("createfoundry", material + "_from_mould"), b -> b
                            .require(Registry.ITEM.get(new Identifier("createfoundry", material + "_gem_mould")))
                            .output(Registry.ITEM.get(new Identifier("minecraft", material)))
                            .output(EmptyMouldItems.EMPTY_GEM_MOULD)
            ));
        }

        for (String material : MaterialLists.CREATE_INGOT_MATERIALS) {
            pressingGeneratedRecipeList.add(create(
                    new Identifier("createfoundry", material + "_from_mould"), b -> b
                            .require(Registry.ITEM.get(new Identifier("createfoundry", material + "_ingot_mould")))
                            .output(Registry.ITEM.get(new Identifier("create", material + "_ingot")))
                            .output(EmptyMouldItems.EMPTY_INGOT_MOULD)
            ));
        }

        pressingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "charcoal_from_mould"), b -> b
                        .require(Registry.ITEM.get(new Identifier("createfoundry", "filled_coke_mould")))
                        .output(Items.CHARCOAL)
                        .output(EmptyMouldItems.EMPTY_COKE_MOULD)
        ));

        pressingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "lapis_from_mould"), b -> b
                        .require(Registry.ITEM.get(new Identifier("createfoundry", "lapis_gem_mould")))
                        .output(Items.LAPIS_LAZULI)
                        .output(EmptyMouldItems.EMPTY_GEM_MOULD)
        ));

        pressingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "redstone_from_mould"), b -> b
                        .require(Registry.ITEM.get(new Identifier("createfoundry", "redstone_gem_mould")))
                        .output(Items.REDSTONE)
                        .output(EmptyMouldItems.EMPTY_GEM_MOULD)
        ));

        pressingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "netherite_scrap_from_mould"), b -> b
                        .require(Registry.ITEM.get(new Identifier("createfoundry", "ancient_debris_gem_mould")))
                        .output(Items.NETHERITE_SCRAP)
                        .output(EmptyMouldItems.EMPTY_GEM_MOULD)
        ));

        pressingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "netherite_ingot_from_mould"), b -> b
                        .require(Registry.ITEM.get(new Identifier("createfoundry", "netherite_ingot_mould")))
                        .output(Items.NETHERITE_INGOT)
                        .output(EmptyMouldItems.EMPTY_INGOT_MOULD)
        ));
    }

    public PressingRecipeGenerator(FabricDataGenerator generator) {
        super(generator);

        generatePressingRecipes();
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.PRESSING;
    }
}
