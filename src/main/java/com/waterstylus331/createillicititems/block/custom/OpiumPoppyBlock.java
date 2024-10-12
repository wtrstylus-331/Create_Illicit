package com.waterstylus331.createillicititems.block.custom;

import com.waterstylus331.createillicititems.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class OpiumPoppyBlock extends CropBlock {
    public static final int maxAge = 7;
    public static final IntegerProperty age = BlockStateProperties.AGE_7;

    public OpiumPoppyBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.OPIUM_SEEDS.get();
    }

    @Override
    protected IntegerProperty getAgeProperty() {
        return age;
    }

    @Override
    public int getMaxAge() {
        return maxAge;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(age);
    }
}
