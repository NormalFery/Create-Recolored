package com.azasad.createcolored.content.block;

import com.azasad.createcolored.content.blockEntities.ColoredBlockEntities;
import com.simibubi.create.content.fluids.pipes.FluidPipeBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlock;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.DyeColor;

public class ColoredFluidTankBlock extends FluidTankBlock {
    protected final DyeColor color;
    protected ColoredFluidTankBlock(Settings properties, DyeColor color) {
        super(properties, false);
        this.color = color;
    }

    @Override
    public BlockEntityType<? extends FluidTankBlockEntity> getBlockEntityType() {
        return ColoredBlockEntities.COLORED_FLUID_TANK_ENTITY.get();
    }
}