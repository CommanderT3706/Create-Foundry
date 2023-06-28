package com.commandert3706.createfoundry.datagen.models;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;

public class Material {
    public Item Unit;
    public Item Block;
    public Item EmptyMould;
    public Item FilledMould;
    public Fluid Molten;
    public boolean HasRaw;
    public boolean HasCrushed;
    public Item Crushed;
    public Item Raw;
    public Item RawBlock;
    public int LootMultiplier;

    public Material(Item unit, Item block, Item emptyMould, Item filledMould, Fluid molten, boolean hasRaw, boolean hasCrushed, int lootMultiplier)
    {
        Unit = unit;
        Block = block;
        EmptyMould = emptyMould;
        FilledMould = filledMould;
        Molten = molten;
        HasRaw = hasRaw;
        HasCrushed = hasCrushed;
        LootMultiplier = lootMultiplier;
    }

    public Material(Item unit, Item block, Item emptyMould, Item filledMould, Fluid molten, boolean hasRaw, boolean hasCrushed, Item raw, Item rawBlock, int lootMultiplier)
    {
        Unit = unit;
        Block = block;
        EmptyMould = emptyMould;
        FilledMould = filledMould;
        HasRaw = hasRaw;
        HasCrushed = hasCrushed;
        Raw = raw;
        RawBlock = rawBlock;
        LootMultiplier = lootMultiplier;
    }

    public Material(Item unit, Item block, Item emptyMould, Item filledMould, Fluid molten, boolean hasRaw, boolean hasCrushed, Item crushed, int lootMultiplier)
    {
        Unit = unit;
        Block = block;
        EmptyMould = emptyMould;
        FilledMould = filledMould;
        HasRaw = hasRaw;
        HasCrushed = hasCrushed;
        Crushed = crushed;
        LootMultiplier = lootMultiplier;
    }

    public Material(Item unit, Item block, Item emptyMould, Item filledMould, Fluid molten, boolean hasRaw, boolean hasCrushed, Item raw, Item rawBlock, Item crushed, int lootMultiplier)
    {
        Unit = unit;
        Block = block;
        EmptyMould = emptyMould;
        FilledMould = filledMould;
        HasRaw = hasRaw;
        HasCrushed = hasCrushed;
        Raw = raw;
        RawBlock = rawBlock;
        Crushed = crushed;
        LootMultiplier = lootMultiplier;
    }
}
