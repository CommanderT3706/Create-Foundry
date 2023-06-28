package com.commandert3706.createfoundry.datagen.models;

import net.minecraft.fluid.Fluid;

public class ToolTemplate {
    public String Id;
    public Fluid MaterialFluid;
    public String Namespace;
    public String Prefix;

    public ToolTemplate(String id, Fluid materialFluid, String namespace, String prefix) {
        Id = id;
        MaterialFluid = materialFluid;
        Namespace = namespace;
        Prefix = prefix;
    }
}
