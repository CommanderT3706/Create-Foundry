package com.commandert3706.createfoundry.datagen.recipe;

import com.commandert3706.createfoundry.item.EmptyMouldItems;
import com.commandert3706.createfoundry.item.MiscItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.CreateRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.util.function.UnaryOperator;

public class SequencedAssemblyRecipeGenerator extends CreateRecipeProvider {
    GeneratedRecipe COKE_MOULD = create("coke_mould", b -> b.require(AllItems.STURDY_SHEET.get())
            .transitionTo(AllItems.INCOMPLETE_REINFORCED_SHEET.get())
            .addOutput(EmptyMouldItems.EMPTY_COKE_MOULD, 1)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(MiscItems.COKE_MOULD_BLUEPRINT))
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(CuttingRecipe::new, rb -> rb));

    GeneratedRecipe INGOT_MOULD = create("ingot_mould", b -> b.require(AllItems.STURDY_SHEET.get())
            .transitionTo(AllItems.INCOMPLETE_REINFORCED_SHEET.get())
            .addOutput(EmptyMouldItems.EMPTY_INGOT_MOULD, 1)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(MiscItems.INGOT_MOULD_BLUEPRINT))
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(CuttingRecipe::new, rb -> rb));

    GeneratedRecipe GEM_MOULD = create("gem_mould", b -> b.require(AllItems.STURDY_SHEET.get())
            .transitionTo(AllItems.INCOMPLETE_REINFORCED_SHEET.get())
            .addOutput(EmptyMouldItems.EMPTY_GEM_MOULD, 1)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(MiscItems.GEM_MOULD_BLUEPRINT))
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(CuttingRecipe::new, rb -> rb));

    public SequencedAssemblyRecipeGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    protected GeneratedRecipe create(String name, UnaryOperator<SequencedAssemblyRecipeBuilder> transform) {
        GeneratedRecipe generatedRecipe =
                c -> transform.apply(new SequencedAssemblyRecipeBuilder(Create.asResource(name)))
                        .build(c);
        all.add(generatedRecipe);
        return  generatedRecipe;
    }

    @Override
    public String getName() {
        return "Sequenced Assembly";
    }
}
