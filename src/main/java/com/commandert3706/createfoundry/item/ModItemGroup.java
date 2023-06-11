package com.commandert3706.createfoundry.item;

import com.commandert3706.createfoundry.CreateFoundry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATE_FOUNDRY = FabricItemGroupBuilder.build(
            new Identifier(CreateFoundry.MOD_ID, "create_foundry"), () -> new ItemStack(MiscItems.MOLTEN_COPPER_BUCKET));
}
