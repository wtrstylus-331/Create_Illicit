package com.waterstylus331.createillicititems.block;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import com.waterstylus331.createillicititems.block.custom.*;
import com.waterstylus331.createillicititems.fluids.ModFluids;
import com.waterstylus331.createillicititems.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("deprecation")
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateIllicitItems.MODID);

    public static final RegistryObject<Block> COCA_PLANT = BLOCKS.register("coca_crop",
            () -> new CocaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_COCA_PLANT = BLOCKS.register("wild_coca_crop",
            () -> new WildCropBlock(MobEffects.CONFUSION,6, BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> FERMENTING_BARREL = registerBlock("fermenting_barrel",
            () -> new FermentingBarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()));

    public static final RegistryObject<Block> CANNABIS_PLANT = BLOCKS.register("cannabis_crop",
            () -> new CannabisCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_CANNABIS_PLANT = BLOCKS.register("wild_cannabis_crop",
            () -> new WildCropBlock(MobEffects.CONFUSION,6, BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> OPIUM_POPPY_PLANT = BLOCKS.register("opium_poppy_plant",
            () -> new OpiumPoppyBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_OPIUM_POPPY = BLOCKS.register("wild_opium_poppy_plant",
            () -> new WildCropBlock(MobEffects.CONFUSION,6, BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> COCAINE_BLOCK = registerBlock("cocaine_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).noOcclusion()));

    // for ethanol
    public static final RegistryObject<LiquidBlock> CANE_JUICE_BLOCK = registerBlock("cane_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CANE_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<Block> DRIED_CANE_JUICE_BLOCK = registerBlock("dried_cane_juice_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<LiquidBlock> FERMENTED_CANE_JUICE_BLOCK = registerBlock("fermented_cane_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FERMENT_CANE_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> HEATED_FERMENTED_CANE_JUICE_BLOCK = registerBlock("heated_fermented_cane_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HEAT_FERMENT_CANE_JUICE, BlockBehaviour.Properties.copy(Blocks.LAVA)) {
                @Override
                public void entityInside(BlockState state, Level level, BlockPos blockPos, Entity entity) {
                    if (!level.isClientSide()) {
                        if (entity instanceof LivingEntity) {
                            entity.setSecondsOnFire(8);
                        }
                    }
                }
            });

    public static final RegistryObject<LiquidBlock> ETHANOL_BLOCK = registerBlock("ethanol_block",
            () -> new LiquidBlock(ModFluids.SOURCE_ETHANOL, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<Block> DRIED_ETHANOL_BLOCK = registerBlock("dried_ethanol_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(1.5f).requiresCorrectToolForDrops()));

    // for vodka
    public static final RegistryObject<LiquidBlock> POTATO_MASH_JUICE_BLOCK = registerBlock("potato_mash_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_POTATO_MASH_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> FERMENTED_POTATO_MASH_JUICE_BLOCK = registerBlock("fermented_potato_mash_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_FERM_POTATO_MASH_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> HEATED_FERMENTED_POTATO_MASH_JUICE_BLOCK =
            registerBlock("heated_fermented_potato_mash_juice_block",
            () -> new LiquidBlock(ModFluids.SOURCE_HEAT_FERM_POTATO_MASH_JUICE, BlockBehaviour.Properties.copy(Blocks.LAVA)) {
                @Override
                public void entityInside(BlockState state, Level level, BlockPos blockPos, Entity entity) {
                    if (!level.isClientSide()) {
                        if (entity instanceof LivingEntity) {
                            entity.setSecondsOnFire(8);
                        }
                    }
                }
            });

    public static final RegistryObject<LiquidBlock> RAW_VODKA_BLOCK = registerBlock("raw_vodka_block",
            () -> new LiquidBlock(ModFluids.SOURCE_RAW_VODKA, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> VODKA_BLOCK = registerBlock("vodka_block",
            () -> new LiquidBlock(ModFluids.SOURCE_VODKA, BlockBehaviour.Properties.copy(Blocks.WATER)));

    // for opium
    public static final RegistryObject<LiquidBlock> OPIUM_LATEX_BLOCK = registerBlock("opium_latex_block",
            () -> new LiquidBlock(ModFluids.SOURCE_OPIUM_LATEX, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> MORPHINE_SOLUTION_BLOCK = registerBlock("morphine_solution_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MORPHINE_SOLUTION, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> CODEINE_SOLUTION_BLOCK = registerBlock("codeine_solution_block",
            () -> new LiquidBlock(ModFluids.SOURCE_CODEINE_SOLUTION, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> PURE_CODEINE_BLOCK = registerBlock("pure_codeine_block",
            () -> new LiquidBlock(ModFluids.SOURCE_PURE_CODEINE, BlockBehaviour.Properties.copy(Blocks.WATER)));

    public static final RegistryObject<LiquidBlock> IMPURE_SEDIMENT_BLOCK = registerBlock("impure_sediment_block",
            () -> new LiquidBlock(ModFluids.SOURCE_IMPURE_SEDIMENT, BlockBehaviour.Properties.copy(Blocks.WATER)));

    // for chalk
    public static final RegistryObject<DropExperienceBlock> TRONA_ORE = registerBlock("trona_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));

    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_TRONA_ORE = registerBlock("deepslate_trona_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
