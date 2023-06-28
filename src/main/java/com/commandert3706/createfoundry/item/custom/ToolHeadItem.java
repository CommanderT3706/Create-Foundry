package com.commandert3706.createfoundry.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolHeadItem extends Item {
    public ToolHeadItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.hasNbt()) {
            String currentMaterial = stack.getNbt().getString("material");
            tooltip.add(new TranslatableText("material.createfoundry." + currentMaterial).formatted(Formatting.BLUE));
        }
    }
}
