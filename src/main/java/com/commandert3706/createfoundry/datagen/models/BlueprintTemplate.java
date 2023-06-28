package com.commandert3706.createfoundry.datagen.models;

import net.minecraft.item.Item;

public class BlueprintTemplate {
    private Item _blueprintItem;
    private Item _blueprintShapeItem;
    private String _name;

    public BlueprintTemplate(Item blueprintItem, Item blueprintShapeItem, String name) {
        _blueprintItem = blueprintItem;
        _blueprintShapeItem = blueprintShapeItem;
        _name = name;
    }

    public void setBlueprintItem(Item blueprintItem) {
        this._blueprintItem = blueprintItem;
    }

    public void setBlueprintShapeItem(Item blueprintShapeItem) {
        this._blueprintShapeItem = blueprintShapeItem;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Item getBlueprintItem() {
        return _blueprintItem;
    }

    public Item getBlueprintShapeItem() {
        return _blueprintShapeItem;
    }

    public String getName() {
        return _name;
    }
}
