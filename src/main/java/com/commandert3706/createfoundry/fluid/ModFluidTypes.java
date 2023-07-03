package com.commandert3706.createfoundry.fluid;

import com.commandert3706.createfoundry.CreateFoundry;
import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final FluidType.Properties DEFAULT_FLUID = FluidType.Properties.create()
            .lightLevel(7).density(15).viscosity(2).sound(SoundAction.get("empty"), SoundEvents.BUCKET_EMPTY_LAVA)
            .sound(SoundAction.get("fill"), SoundEvents.BUCKET_FILL_LAVA);

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateFoundry.MOD_ID);

    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties,
                                                      int tintColor, int R, int G, int B) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, WATER_OVERLAY_RL,
                tintColor, new Vector3f(R / 255f, G / 255f, B / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }


    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE = register("molten_copper",
            DEFAULT_FLUID, 0xffeb6e34, 0xeb, 0x6e, 0x34);
    public static final RegistryObject<FluidType> MOLTEN_IRON_FLUID_TYPE = register("molten_iron",
            DEFAULT_FLUID, 0xff6a6c6e, 0x6a, 0x6c, 0x6e);
    public static final RegistryObject<FluidType> MOLTEN_GOLD_FLUID_TYPE = register("molten_gold",
            DEFAULT_FLUID, 0xffffcc00, 0xff, 0xcc, 0x00);
    public static final RegistryObject<FluidType> MOLTEN_CARBON_FLUID_TYPE = register("molten_carbon",
            DEFAULT_FLUID, 0xff262626, 0x26, 0x26, 0x26);
    public static final RegistryObject<FluidType> MOLTEN_DIAMOND_FLUID_TYPE = register("molten_diamond",
            DEFAULT_FLUID, 0xff00d1c0, 0xe00, 0xd1, 0xc0);
    public static final RegistryObject<FluidType> MOLTEN_ZINC_FLUID_TYPE = register("molten_zinc",
            DEFAULT_FLUID, 0xffe8e8e8, 0xe8, 0xe8, 0xe8);
    public static final RegistryObject<FluidType> MOLTEN_BRASS_FLUID_TYPE = register("molten_brass",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);

    public static final RegistryObject<FluidType> MOLTEN_EMERALD_FLUID_TYPE = register("molten_emerald",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);
    public static final RegistryObject<FluidType> MOLTEN_REDSTONE_FLUID_TYPE = register("molten_redstone",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);
    public static final RegistryObject<FluidType> MOLTEN_LAPIS_FLUID_TYPE = register("molten_lapis",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);
    public static final RegistryObject<FluidType> MOLTEN_ANCIENT_DEBRIS_FLUID_TYPE = register("molten_ancient_debris",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);
    public static final RegistryObject<FluidType> MOLTEN_NETHERITE_FLUID_TYPE = register("molten_netherite",
            DEFAULT_FLUID, 0xffb57300, 0xb5, 0x73, 0x00);
}
