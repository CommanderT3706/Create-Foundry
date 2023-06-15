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
            = FLUIDS.register("molten_copper_still", () -> new ForgeFlowingFluid.Source(ModFluids.COPPER_PROPERTIES));
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


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
