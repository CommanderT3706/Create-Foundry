package com.commandert3706.createfoundry.fluid;

import com.commandert3706.createfoundry.block.ModBlocks;
import com.commandert3706.createfoundry.item.MiscItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MoltenEmeraldFluid extends FlowableFluid {
    public Fluid getFlowing() {
        return ModFluids.MOLTEN_EMERALD_FLOWING;
    }

    public Fluid getStill() {
        return ModFluids.MOLTEN_EMERALD_STILL;
    }

    public Item getBucketItem() {
        return MiscItems.MOLTEN_EMERALD_BUCKET;
    }

    @Nullable
    public ParticleEffect getParticle() {
        return ParticleTypes.DRIPPING_LAVA;
    }

    protected boolean isInfinite() {
        return false;
    }

    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        if (!world.isClient()) {
            world.playSound(null, pos, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1f, 1f);
        }
    }

    public int getFlowSpeed(WorldView world) {
        return 2;
    }

    public BlockState toBlockState(FluidState state) {
        return ModBlocks.MOLTEN_EMERALD_FLUID_BLOCK.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public boolean matchesType(Fluid fluid) {
        return fluid == ModFluids.MOLTEN_EMERALD_STILL || fluid == ModFluids.MOLTEN_EMERALD_FLOWING;
    }

    public int getLevelDecreasePerBlock(WorldView world) {
        return 2;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    public int getTickRate(WorldView world) {
        return 30;
    }

    public boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return false;
    }

    protected float getBlastResistance() {
        return 100.0F;
    }

    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.ITEM_BUCKET_FILL);
    }

    public static class Flowing extends MoltenEmeraldFluid {

        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        public int getLevel(FluidState state) {
            return (Integer)state.get(LEVEL);
        }
    }

    public static class Still extends MoltenEmeraldFluid {

        public int getLevel(FluidState state) {
            return 8;
        }

        public boolean isStill(FluidState state) {
            return true;
        }
    }
}
