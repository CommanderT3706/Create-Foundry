package com.commandert3706.createfoundry.block;

import com.commandert3706.createfoundry.CreateFoundry;
import com.commandert3706.createfoundry.fluid.ModFluids;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CreateFoundry.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(CreateFoundry.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CreateFoundry.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        CreateFoundry.LOGGER.info("Registering blocks for: " + CreateFoundry.MOD_ID);
    }

    public static final Block MOLTEN_COPPER_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_copper",
            new FluidBlock(ModFluids.MOLTEN_COPPER_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_IRON_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_iron",
            new FluidBlock(ModFluids.MOLTEN_IRON_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_GOLD_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_gold",
            new FluidBlock(ModFluids.MOLTEN_GOLD_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_CARBON_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_carbon",
            new FluidBlock(ModFluids.MOLTEN_CARBON_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_DIAMOND_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_diamond",
            new FluidBlock(ModFluids.MOLTEN_DIAMOND_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_ZINC_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_zinc",
            new FluidBlock(ModFluids.MOLTEN_ZINC_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_BRASS_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_brass",
            new FluidBlock(ModFluids.MOLTEN_BRASS_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_EMERALD_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_emerald",
            new FluidBlock(ModFluids.MOLTEN_EMERALD_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_LAPIS_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_lapis",
            new FluidBlock(ModFluids.MOLTEN_LAPIS_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_REDSTONE_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_redstone",
            new FluidBlock(ModFluids.MOLTEN_REDSTONE_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_ANCIENT_DEBRIS_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_ancient_debris",
            new FluidBlock(ModFluids.MOLTEN_ANCIENT_DEBRIS_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);

    public static final Block MOLTEN_NETHERITE_FLUID_BLOCK = registerBlockWithoutBlockItem("molten_netherite",
            new FluidBlock(ModFluids.MOLTEN_NETHERITE_STILL, FabricBlockSettings.of(Material.LAVA)
                    .noCollision().nonOpaque().dropsNothing().luminance(7)), ItemGroup.MISC);
}
