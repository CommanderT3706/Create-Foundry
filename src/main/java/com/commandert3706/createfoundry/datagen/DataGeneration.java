package com.commandert3706.createfoundry.datagen;

import com.commandert3706.createfoundry.datagen.recipe.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(FillingRecipeGenerator::new);
        fabricDataGenerator.addProvider(DeployingRecipeGenerator::new);
        fabricDataGenerator.addProvider(MixingRecipeGenerator::new);
        fabricDataGenerator.addProvider(SequencedAssemblyRecipeGenerator::new);
        fabricDataGenerator.addProvider(PressingRecipeGenerator::new);
        fabricDataGenerator.addProvider(CompactingRecipeGenerator::new);
    }
}
