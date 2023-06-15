package com.commandert3706.createfoundry.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_FOUNDRY = new CreativeModeTab("create_foundry") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MiscItems.MOLTEN_COPPER_BUCKET.get());
        }
    };
}
