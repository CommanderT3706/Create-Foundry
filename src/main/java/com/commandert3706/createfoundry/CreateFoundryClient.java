package com.commandert3706.createfoundry;

import com.commandert3706.createfoundry.fluid.ModFluids;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;

public class CreateFoundryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_COPPER_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xeb6e34));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_COPPER_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xeb6e34));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_IRON_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x6a6c6e));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_IRON_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x6a6c6e));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_GOLD_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xffcc00));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_GOLD_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xffcc00));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_CARBON_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x262626));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_CARBON_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x262626));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_DIAMOND_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x00d1c0));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_DIAMOND_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x00d1c0));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_ZINC_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xe8e8e8));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_ZINC_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xe8e8e8));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_BRASS_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xb57300));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_BRASS_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xb57300));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_EMERALD_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x1ac42b));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_EMERALD_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x1ac42b));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_REDSTONE_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x850e0c));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_REDSTONE_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x850e0c));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_LAPIS_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x233bd9));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_LAPIS_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x233bd9));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_ANCIENT_DEBRIS_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x6e2100));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_ANCIENT_DEBRIS_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x6e2100));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_NETHERITE_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x424242));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MOLTEN_NETHERITE_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0x424242));
    }
}
