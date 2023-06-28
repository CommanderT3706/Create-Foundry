package com.commandert3706.createfoundry;

import com.commandert3706.createfoundry.block.ModBlocks;
import com.commandert3706.createfoundry.item.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.chunk.light.ChunkLightingView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateFoundry implements ModInitializer {
	public static final String MOD_ID = "createfoundry";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Register Items
		BrassMouldItems.registerMouldItems();
		CarbonMouldItems.registerMouldItems();
		CopperMouldItems.registerMouldItems();
		DiamondMouldItems.registerMouldItems();
		EmptyMouldItems.registerMouldItems();
		GoldMouldItems.registerMouldItems();
		IronMouldItems.registerMouldItems();
		ZincMouldItems.registerMouldItems();
		EmeraldMouldItems.registerMouldItems();
		LapisMouldItems.registerMouldItems();
		RedstoneMouldItems.registerMouldItems();
		AncientDebrisMouldItems.registerMouldItems();
		NetheriteMouldItems.registerMouldItems();
		MiscItems.registerMiscItems();

		// Register Blocks
		ModBlocks.registerModBlocks();
	}
}
