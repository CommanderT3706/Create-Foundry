package com.commandert3706.createfoundry;

import com.commandert3706.createfoundry.block.ModBlocks;
import com.commandert3706.createfoundry.fluid.ModFluids;
import com.commandert3706.createfoundry.item.EmptyMouldItems;
import com.commandert3706.createfoundry.item.MiscItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateFoundry.MOD_ID)
public class CreateFoundry
{
    public static final String MOD_ID = "createfoundry";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateFoundry()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EmptyMouldItems.register(eventBus);
        MiscItems.register(eventBus);

        ModBlocks.register(eventBus);

        ModFluids.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_COPPER.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_COPPER_STILL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.MOLTEN_COPPER_FLOWING.get(), RenderType.translucent());
    }

    private void setup(final FMLCommonSetupEvent event) {
        // /dev/null
    }
}
