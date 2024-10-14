package com.waterstylus331.createillicititems.fluids;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import com.waterstylus331.createillicititems.block.ModBlocks;
import com.waterstylus331.createillicititems.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidInteractionRegistry;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateIllicitItems.MODID);

    // for ethanol
    public static final RegistryObject<FlowingFluid> SOURCE_CANE_JUICE = FLUIDS.register("cane_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_CANE_JUICE = FLUIDS.register("flowing_cane_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_FERMENT_CANE_JUICE = FLUIDS.register("fermented_cane_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.FERMENT_CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_FERMENTED_CANE_JUICE = FLUIDS.register("flowing_fermented_cane_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FERMENT_CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_HEAT_FERMENT_CANE_JUICE = FLUIDS.register("heated_fermented_cane_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.HEAT_FERMENT_CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_HEATED_FERMENTED_CANE_JUICE = FLUIDS.register("flowing_heated_fermented_cane_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HEAT_FERMENT_CANE_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_ETHANOL = FLUIDS.register("ethanol",
            () -> new ForgeFlowingFluid.Source(ModFluids.ETHANOL_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_ETHANOL = FLUIDS.register("flowing_ethanol",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.ETHANOL_PROPS));

    // for vodka
    public static final RegistryObject<FlowingFluid> SOURCE_POTATO_MASH_JUICE = FLUIDS.register("potato_mash_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_POTATO_MASH_JUICE = FLUIDS.register("flowing_potato_mash_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_FERM_POTATO_MASH_JUICE = FLUIDS.register("fermented_potato_mash_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.FERMENTED_POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_FERM_POTATO_MASH_JUICE = FLUIDS.register("flowing_fermented_potato_mash_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.FERMENTED_POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_HEAT_FERM_POTATO_MASH_JUICE = FLUIDS.register("heated_fermented_potato_mash_juice",
            () -> new ForgeFlowingFluid.Source(ModFluids.HEATED_FERMENTED_POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_HEAT_FERM_POTATO_MASH_JUICE = FLUIDS.register("flowing_heated_fermented_potato_mash_juice",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HEATED_FERMENTED_POTATO_MASH_JUICE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_RAW_VODKA = FLUIDS.register("raw_vodka",
            () -> new ForgeFlowingFluid.Source(ModFluids.RAW_VODKA_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_RAW_VODKA = FLUIDS.register("flowing_raw_vodka",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.RAW_VODKA_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_VODKA = FLUIDS.register("vodka",
            () -> new ForgeFlowingFluid.Source(ModFluids.VODKA_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_VODKA = FLUIDS.register("flowing_vodka",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.VODKA_PROPS));

    // for opium
    public static final RegistryObject<FlowingFluid> SOURCE_OPIUM_LATEX = FLUIDS.register("opium_latex",
            () -> new ForgeFlowingFluid.Source(ModFluids.OPIUM_LATEX_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_OPIUM_LATEX = FLUIDS.register("flowing_opium_latex",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.OPIUM_LATEX_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_MORPHINE_SOLUTION = FLUIDS.register("morphine_solution",
            () -> new ForgeFlowingFluid.Source(ModFluids.MORPHINE_SOLUTION_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_MORPHINE_SOLUTION = FLUIDS.register("flowing_morphine_solution",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MORPHINE_SOLUTION_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_CODEINE_SOLUTION = FLUIDS.register("codeine_solution",
            () -> new ForgeFlowingFluid.Source(ModFluids.CODEINE_SOLUTION_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_CODEINE_SOLUTION = FLUIDS.register("flowing_codeine_solution",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.CODEINE_SOLUTION_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_PURE_CODEINE = FLUIDS.register("pure_codeine",
            () -> new ForgeFlowingFluid.Source(ModFluids.PURE_CODEINE_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_PURE_CODEINE = FLUIDS.register("flowing_pure_codeine",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PURE_CODEINE_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_IMPURE_SEDIMENT = FLUIDS.register("impure_sediment",
            () -> new ForgeFlowingFluid.Source(ModFluids.IMPURE_SEDIMENT_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_IMPURE_SEDIMENT = FLUIDS.register("flowing_impure_sediment",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.IMPURE_SEDIMENT_PROPS));

    public static final RegistryObject<FlowingFluid> SOURCE_COUGH_SYRUP = FLUIDS.register("cough_syrup",
            () -> new ForgeFlowingFluid.Source(ModFluids.COUGH_SYRUP_PROPS));

    public static final RegistryObject<FlowingFluid> FLOWING_COUGH_SYRUP = FLUIDS.register("flowing_cough_syrup",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.COUGH_SYRUP_PROPS));

    // for ethanol
    public static final ForgeFlowingFluid.Properties CANE_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.CANE_JUICE_FLUID_TYPE, SOURCE_CANE_JUICE, FLOWING_CANE_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.CANE_JUICE_BLOCK)
            .bucket(ModItems.CANE_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties FERMENT_CANE_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.FERMENTED_CANE_JUICE_TYPE, SOURCE_FERMENT_CANE_JUICE, FLOWING_FERMENTED_CANE_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.FERMENTED_CANE_JUICE_BLOCK)
            .bucket(ModItems.FERMENTED_CANE_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties HEAT_FERMENT_CANE_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.HEATED_FERMENTED_CANE_JUICE_TYPE, SOURCE_HEAT_FERMENT_CANE_JUICE, FLOWING_HEATED_FERMENTED_CANE_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.HEATED_FERMENTED_CANE_JUICE_BLOCK)
            .bucket(ModItems.HEATED_FERMENTED_CANE_JUICE_BUCKET);

    public static final ForgeFlowingFluid.Properties ETHANOL_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.ETHANOL_FLUID_TYPE, SOURCE_ETHANOL, FLOWING_ETHANOL)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.ETHANOL_BLOCK)
            .bucket(ModItems.ETHANOL_BUCKET);

    // for vodka
    public static final ForgeFlowingFluid.Properties POTATO_MASH_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.POTATO_MASH_JUICE_FLUID_TYPE, SOURCE_POTATO_MASH_JUICE, FLOWING_POTATO_MASH_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.POTATO_MASH_JUICE_BLOCK)
            .bucket(ModItems.POTATO_MASH_BUCKET);

    public static final ForgeFlowingFluid.Properties FERMENTED_POTATO_MASH_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.FERMENTED_POTATO_MASH_JUICE_FLUID_TYPE, SOURCE_FERM_POTATO_MASH_JUICE, FLOWING_FERM_POTATO_MASH_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.FERMENTED_POTATO_MASH_JUICE_BLOCK)
            .bucket(ModItems.FERM_POTATO_MASH_BUCKET);

    public static final ForgeFlowingFluid.Properties HEATED_FERMENTED_POTATO_MASH_JUICE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.HEAT_FERMENTED_POTATO_MASH_JUICE_FLUID_TYPE, SOURCE_HEAT_FERM_POTATO_MASH_JUICE, FLOWING_HEAT_FERM_POTATO_MASH_JUICE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.HEATED_FERMENTED_POTATO_MASH_JUICE_BLOCK)
            .bucket(ModItems.HEAT_FERM_POTATO_MASH_BUCKET);

    public static final ForgeFlowingFluid.Properties RAW_VODKA_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.RAW_VODKA_FLUID_TYPE, SOURCE_RAW_VODKA, FLOWING_RAW_VODKA)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.RAW_VODKA_BLOCK)
            .bucket(ModItems.RAW_VODKA_BUCKET);

    public static final ForgeFlowingFluid.Properties VODKA_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.VODKA_FLUID_TYPE, SOURCE_VODKA, FLOWING_VODKA)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.VODKA_BLOCK)
            .bucket(ModItems.VODKA_BUCKET);

    // for opium
    public static final ForgeFlowingFluid.Properties OPIUM_LATEX_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.OPIUM_LATEX_FLUID_TYPE, SOURCE_OPIUM_LATEX, FLOWING_OPIUM_LATEX)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.OPIUM_LATEX_BLOCK)
            .bucket(ModItems.OPIUM_LATEX_BUCKET);

    public static final ForgeFlowingFluid.Properties MORPHINE_SOLUTION_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.MORPHINE_SOLUTION_FLUID_TYPE, SOURCE_MORPHINE_SOLUTION, FLOWING_MORPHINE_SOLUTION)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.MORPHINE_SOLUTION_BLOCK)
            .bucket(ModItems.MORPHINE_SOLUTION_BUCKET);

    public static final ForgeFlowingFluid.Properties CODEINE_SOLUTION_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.CODEINE_SOLUTION_FLUID_TYPE, SOURCE_CODEINE_SOLUTION, FLOWING_CODEINE_SOLUTION)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.CODEINE_SOLUTION_BLOCK)
            .bucket(ModItems.CODEINE_SOLUTION_BUCKET);

    public static final ForgeFlowingFluid.Properties PURE_CODEINE_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.PURE_CODEINE_FLUID_TYPE, SOURCE_PURE_CODEINE, FLOWING_PURE_CODEINE)
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(ModBlocks.PURE_CODEINE_BLOCK)
            .bucket(ModItems.PURE_CODEINE_BUCKET);

    public static final ForgeFlowingFluid.Properties IMPURE_SEDIMENT_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.IMPURE_SEDIMENT_FLUID_TYPE, SOURCE_IMPURE_SEDIMENT, FLOWING_IMPURE_SEDIMENT)
            .slopeFindDistance(1)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.IMPURE_SEDIMENT_BLOCK)
            .bucket(ModItems.IMPURE_SEDIMENT_BUCKET);

    // cough syrup
    public static final ForgeFlowingFluid.Properties COUGH_SYRUP_PROPS = new ForgeFlowingFluid.Properties(
            FluidTypes.COUGH_SYRUP_FLUID_TYPE, SOURCE_COUGH_SYRUP, FLOWING_COUGH_SYRUP)
            .slopeFindDistance(1)
            .levelDecreasePerBlock(1)
            .block(ModBlocks.COUGH_SYRUP_BLOCK)
            .bucket(ModItems.COUGH_SYRUP_BUCKET);

    // fluid interactions
    public static void registerInteractions() {
        FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                SOURCE_ETHANOL.get().getFluidType(),
                fluidState -> {
                    if (fluidState.isSource()) {
                        return ModBlocks.DRIED_ETHANOL_BLOCK.get().defaultBlockState();
                    } else {
                        return ModBlocks.DRIED_ETHANOL_BLOCK.get().defaultBlockState();
                    }
                }
        ));

        FluidInteractionRegistry.addInteraction(ForgeMod.LAVA_TYPE.get(), new FluidInteractionRegistry.InteractionInformation(
                SOURCE_CANE_JUICE.get().getFluidType(),
                fluidState -> {
                    if (fluidState.isSource()) {
                        return ModBlocks.DRIED_CANE_JUICE_BLOCK.get().defaultBlockState();
                    } else {
                        return ModBlocks.DRIED_CANE_JUICE_BLOCK.get().defaultBlockState();
                    }
                }
        ));
    }

    public static void register(IEventBus bus) {
        FLUIDS.register(bus);
    }
}
