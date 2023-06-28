package com.commandert3706.createfoundry.datagen.recipe;

import com.commandert3706.createfoundry.datagen.MaterialLists;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.util.ArrayList;
import java.util.List;

import com.commandert3706.createfoundry.datagen.models.BlueprintTemplate;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class DeployingRecipeGenerator extends ProcessingRecipeGen {
    public List<GeneratedRecipe> deployingGeneratedRecipeList = new ArrayList<>();

    public void registerRecipes() {
        for (BlueprintTemplate blueprint : MaterialLists.BLUEPRINT_ITEMS) {
            deployingGeneratedRecipeList.add(create(
                    new Identifier("createfoundry", blueprint.getName() + "_blueprint_from_paper"),
                    b -> b.require(Items.PAPER)
                            .require(blueprint.getBlueprintShapeItem())
                            .toolNotConsumed()
                            .output(blueprint.getBlueprintItem())));
        }
    }

    public DeployingRecipeGenerator(FabricDataGenerator generator) {
        super(generator);

        registerRecipes();
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.DEPLOYING;
    }
}
