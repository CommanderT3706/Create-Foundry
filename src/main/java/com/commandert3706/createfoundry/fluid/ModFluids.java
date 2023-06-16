package com.commandert3706.createfoundry.fluid;

import com.commandert3706.createfoundry.CreateFoundry;
import com.commandert3706.createfoundry.block.ModBlocks;
import com.commandert3706.createfoundry.item.MiscItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateFoundry.MOD_ID);



    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_STILL
            = FLUIDS.register("molten_copper", () -> new ForgeFlowingFluid.Source(ModFluids.COPPER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_FLOWING
            = FLUIDS.register("molten_copper_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.COPPER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties COPPER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_COPPER_STILL.get(), () -> MOLTEN_COPPER_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xffeb6e34)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_COPPER.get()).bucket(() -> MiscItems.MOLTEN_COPPER_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER = ModBlocks.BLOCKS.register("molten_copper",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_COPPER_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_STILL
            = FLUIDS.register("molten_iron", () -> new ForgeFlowingFluid.Source(ModFluids.IRON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_FLOWING
            = FLUIDS.register("molten_iron_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.IRON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties IRON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_IRON_STILL.get(), () -> MOLTEN_IRON_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xff6a6c6e)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_IRON.get()).bucket(() -> MiscItems.MOLTEN_IRON_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_IRON = ModBlocks.BLOCKS.register("molten_iron",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_IRON_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_STILL
            = FLUIDS.register("molten_gold", () -> new ForgeFlowingFluid.Source(ModFluids.GOLD_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_FLOWING
            = FLUIDS.register("molten_gold_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.GOLD_PROPERTIES));

    public static final ForgeFlowingFluid.Properties GOLD_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_GOLD_STILL.get(), () -> MOLTEN_GOLD_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xffffcc00)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_GOLD.get()).bucket(() -> MiscItems.MOLTEN_GOLD_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD = ModBlocks.BLOCKS.register("molten_gold",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_GOLD_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_STILL
            = FLUIDS.register("molten_carbon", () -> new ForgeFlowingFluid.Source(ModFluids.CARBON_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_FLOWING
            = FLUIDS.register("molten_carbon_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.CARBON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CARBON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_CARBON_STILL.get(), () -> MOLTEN_CARBON_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xff262626)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_CARBON.get()).bucket(() -> MiscItems.MOLTEN_CARBON_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_CARBON = ModBlocks.BLOCKS.register("molten_carbon",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_CARBON_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_STILL
            = FLUIDS.register("molten_diamond", () -> new ForgeFlowingFluid.Source(ModFluids.DIAMOND_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_FLOWING
            = FLUIDS.register("molten_diamond_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.DIAMOND_PROPERTIES));

    public static final ForgeFlowingFluid.Properties DIAMOND_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_DIAMOND_STILL.get(), () -> MOLTEN_DIAMOND_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xff00d1c0)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_DIAMOND.get()).bucket(() -> MiscItems.MOLTEN_DIAMOND_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND = ModBlocks.BLOCKS.register("molten_diamond",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_DIAMOND_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_STILL
            = FLUIDS.register("molten_zinc", () -> new ForgeFlowingFluid.Source(ModFluids.ZINC_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_FLOWING
            = FLUIDS.register("molten_zinc_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.ZINC_PROPERTIES));

    public static final ForgeFlowingFluid.Properties ZINC_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_ZINC_STILL.get(), () -> MOLTEN_ZINC_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xffe8e8e8)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_ZINC.get()).bucket(() -> MiscItems.MOLTEN_ZINC_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC = ModBlocks.BLOCKS.register("molten_zinc",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_ZINC_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));


    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_STILL
            = FLUIDS.register("molten_brass", () -> new ForgeFlowingFluid.Source(ModFluids.BRASS_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_FLOWING
            = FLUIDS.register("molten_brass_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.BRASS_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BRASS_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_BRASS_STILL.get(), () -> MOLTEN_BRASS_FLOWING.get(), FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(7).viscosity(2).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA)
            .overlay(WATER_OVERLAY_RL).color(0xffb57300)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> ModFluids.MOLTEN_BRASS.get()).bucket(() -> MiscItems.MOLTEN_BRASS_BUCKET.get());

    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS = ModBlocks.BLOCKS.register("molten_brass",
            () -> new LiquidBlock(() -> ModFluids.MOLTEN_BRASS_STILL.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noCollission().strength(100f).noDrops()));
    


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
