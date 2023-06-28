package com.commandert3706.createfoundry.datagen.recipe;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class CompactingRecipeGenerator extends ProcessingRecipeGen {
    public List<GeneratedRecipe> compactingGeneratedRecipeList = new ArrayList<>();

    public void generateCompactingRecipes() {
        compactingGeneratedRecipeList.add(create(
                new Identifier("createfoundry", "diamond_from_carbon"), b -> b
                        .require(Registry.FLUID.get(new Identifier("createfoundry", "molten_carbon")), 8100)
                        .output(Registry.FLUID.get(new Identifier("createfoundry", "molten_diamond")), 81)
                        .requiresHeat(HeatCondition.SUPERHEATED))
        );
    }

    public CompactingRecipeGenerator(FabricDataGenerator generator) {
        super(generator);

        generateCompactingRecipes();
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.COMPACTING;
    }
}
