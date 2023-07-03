package com.commandert3706.createfoundry.fluid;

import com.commandert3706.createfoundry.CreateFoundry;
import com.commandert3706.createfoundry.block.ModBlocks;
import com.commandert3706.createfoundry.item.MiscItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateFoundry.MOD_ID);

    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_SOURCE = FLUIDS.register("molten_copper",
            () -> new ForgeFlowingFluid.Source(ModFluids.COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_FLOWING = FLUIDS.register("molten_copper_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.COPPER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_COPPER_FLUID_TYPE, MOLTEN_COPPER_SOURCE, MOLTEN_COPPER_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(MiscItems.MOLTEN_COPPER_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_SOURCE = FLUIDS.register("molten_iron",
            () -> new ForgeFlowingFluid.Source(ModFluids.IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_FLOWING = FLUIDS.register("molten_iron_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.IRON_PROPERTIES));
    public static final ForgeFlowingFluid.Properties IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_FLUID_TYPE, MOLTEN_IRON_SOURCE, MOLTEN_IRON_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(MiscItems.MOLTEN_IRON_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_SOURCE = FLUIDS.register("molten_gold",
            () -> new ForgeFlowingFluid.Source(ModFluids.GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_FLOWING = FLUIDS.register("molten_gold_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.GOLD_PROPERTIES));
    public static final ForgeFlowingFluid.Properties GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_FLUID_TYPE, MOLTEN_GOLD_SOURCE, MOLTEN_GOLD_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(MiscItems.MOLTEN_GOLD_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_SOURCE = FLUIDS.register("molten_carbon",
            () -> new ForgeFlowingFluid.Source(ModFluids.CARBON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_FLOWING = FLUIDS.register("molten_carbon_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CARBON_PROPERTIES));
    public static final ForgeFlowingFluid.Properties CARBON_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_CARBON_FLUID_TYPE, MOLTEN_CARBON_SOURCE, MOLTEN_CARBON_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_CARBON_BLOCK)
            .bucket(MiscItems.MOLTEN_CARBON_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_SOURCE = FLUIDS.register("molten_diamond",
            () -> new ForgeFlowingFluid.Source(ModFluids.DIAMOND_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_FLOWING = FLUIDS.register("molten_diamond_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DIAMOND_PROPERTIES));
    public static final ForgeFlowingFluid.Properties DIAMOND_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DIAMOND_FLUID_TYPE, MOLTEN_DIAMOND_SOURCE, MOLTEN_DIAMOND_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_DIAMOND_BLOCK)
            .bucket(MiscItems.MOLTEN_DIAMOND_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_SOURCE = FLUIDS.register("molten_zinc",
            () -> new ForgeFlowingFluid.Source(ModFluids.ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_FLOWING = FLUIDS.register("molten_zinc_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ZINC_PROPERTIES));
    public static final ForgeFlowingFluid.Properties ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ZINC_FLUID_TYPE, MOLTEN_ZINC_SOURCE, MOLTEN_ZINC_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ZINC_BLOCK)
            .bucket(MiscItems.MOLTEN_ZINC_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_SOURCE = FLUIDS.register("molten_brass",
            () -> new ForgeFlowingFluid.Source(ModFluids.BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_FLOWING = FLUIDS.register("molten_brass_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BRASS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_BRASS_FLUID_TYPE, MOLTEN_BRASS_SOURCE, MOLTEN_BRASS_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_BRASS_BLOCK)
            .bucket(MiscItems.MOLTEN_BRASS_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_EMERALD_SOURCE = FLUIDS.register("molten_emerald",
            () -> new ForgeFlowingFluid.Source(ModFluids.EMERALD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_EMERALD_FLOWING = FLUIDS.register("molten_emerald_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.EMERALD_PROPERTIES));
    public static final ForgeFlowingFluid.Properties EMERALD_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_EMERALD_FLUID_TYPE, MOLTEN_EMERALD_SOURCE, MOLTEN_EMERALD_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_EMERALD_BLOCK)
            .bucket(MiscItems.MOLTEN_EMERALD_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_REDSTONE_SOURCE = FLUIDS.register("molten_redstone",
            () -> new ForgeFlowingFluid.Source(ModFluids.REDSTONE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_REDSTONE_FLOWING = FLUIDS.register("molten_redstone_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.REDSTONE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties REDSTONE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_REDSTONE_FLUID_TYPE, MOLTEN_REDSTONE_SOURCE, MOLTEN_REDSTONE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_REDSTONE_BLOCK)
            .bucket(MiscItems.MOLTEN_REDSTONE_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_LAPIS_SOURCE = FLUIDS.register("molten_lapis",
            () -> new ForgeFlowingFluid.Source(ModFluids.LAPIS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_LAPIS_FLOWING = FLUIDS.register("molten_lapis_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LAPIS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties LAPIS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_LAPIS_FLUID_TYPE, MOLTEN_LAPIS_SOURCE, MOLTEN_LAPIS_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_LAPIS_BLOCK)
            .bucket(MiscItems.MOLTEN_LAPIS_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_ANCIENT_DEBRIS_SOURCE = FLUIDS.register("molten_ancient_debris",
            () -> new ForgeFlowingFluid.Source(ModFluids.ANCIENT_DEBRIS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ANCIENT_DEBRIS_FLOWING = FLUIDS.register("molten_ancient_debris_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ANCIENT_DEBRIS_PROPERTIES));
    public static final ForgeFlowingFluid.Properties ANCIENT_DEBRIS_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_ANCIENT_DEBRIS_FLUID_TYPE, MOLTEN_ANCIENT_DEBRIS_SOURCE, MOLTEN_ANCIENT_DEBRIS_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_ANCIENT_DEBRIS_BLOCK)
            .bucket(MiscItems.MOLTEN_ANCIENT_DEBRIS_BUCKET);

    public static final RegistryObject<FlowingFluid> MOLTEN_NETHERITE_SOURCE = FLUIDS.register("molten_netherite",
            () -> new ForgeFlowingFluid.Source(ModFluids.NETHERITE_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_NETHERITE_FLOWING = FLUIDS.register("molten_netherite_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.NETHERITE_PROPERTIES));
    public static final ForgeFlowingFluid.Properties NETHERITE_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NETHERITE_FLUID_TYPE, MOLTEN_NETHERITE_SOURCE, MOLTEN_NETHERITE_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.MOLTEN_NETHERITE_BLOCK)
            .bucket(MiscItems.MOLTEN_NETHERITE_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
