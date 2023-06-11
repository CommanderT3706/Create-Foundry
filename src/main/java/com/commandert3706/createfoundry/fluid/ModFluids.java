package com.commandert3706.createfoundry.fluid;

import com.commandert3706.createfoundry.CreateFoundry;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModFluids {
    public static final FlowableFluid MOLTEN_COPPER_STILL = registerFluid("molten_copper",
            new MoltenCopperFluid.Still());
    public static final FlowableFluid MOLTEN_COPPER_FLOWING = registerFluid("molten_copper_flowing",
            new MoltenCopperFluid.Flowing());

    public static final FlowableFluid MOLTEN_IRON_STILL = registerFluid("molten_iron",
            new MoltenIronFluid.Still());
    public static final FlowableFluid MOLTEN_IRON_FLOWING = registerFluid("molten_iron_flowing",
            new MoltenIronFluid.Flowing());

    public static final FlowableFluid MOLTEN_GOLD_STILL = registerFluid("molten_gold",
            new MoltenGoldFluid.Still());
    public static final FlowableFluid MOLTEN_GOLD_FLOWING = registerFluid("molten_gold_flowing",
            new MoltenGoldFluid.Flowing());

    public static final FlowableFluid MOLTEN_CARBON_STILL = registerFluid("molten_carbon",
            new MoltenCarbonFluid.Still());
    public static final FlowableFluid MOLTEN_CARBON_FLOWING = registerFluid("molten_carbon_flowing",
            new MoltenCarbonFluid.Flowing());

    public static final FlowableFluid MOLTEN_DIAMOND_STILL = registerFluid("molten_diamond",
            new MoltenDiamondFluid.Still());
    public static final FlowableFluid MOLTEN_DIAMOND_FLOWING = registerFluid("molten_diamond_flowing",
            new MoltenDiamondFluid.Flowing());

    public static final FlowableFluid MOLTEN_ZINC_STILL = registerFluid("molten_zinc",
            new MoltenZincFluid.Still());
    public static final FlowableFluid MOLTEN_ZINC_FLOWING = registerFluid("molten_zinc_flowing",
            new MoltenZincFluid.Flowing());

    public static final FlowableFluid MOLTEN_BRASS_STILL = registerFluid("molten_brass",
            new MoltenBrassFluid.Still());
    public static final FlowableFluid MOLTEN_BRASS_FLOWING = registerFluid("molten_brass_flowing",
            new MoltenBrassFluid.Flowing());

    private static FlowableFluid registerFluid(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(CreateFoundry.MOD_ID, name), flowableFluid);
    }
}
