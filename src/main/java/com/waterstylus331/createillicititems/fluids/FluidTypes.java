package com.waterstylus331.createillicititems.fluids;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class FluidTypes {
    public static final ResourceLocation DEFAULT_STILL = new ResourceLocation("block/water_still");
    public static final ResourceLocation DEFAULT_FLOW = new ResourceLocation("block/water_flow");

    public static final ResourceLocation CANE_JUICE = new ResourceLocation(CreateIllicitItems.MODID,"fluid/in_cane_juice");

    public static final ResourceLocation FERMENTED_CANE_JUICE = new ResourceLocation(CreateIllicitItems.MODID,"fluid/in_fermented_cane_juice");

    public static final ResourceLocation TRANSLUCENT_STILL = new ResourceLocation(CreateIllicitItems.MODID,"block/translucent_still");
    public static final ResourceLocation TRANSLUCENT_FLOW = new ResourceLocation(CreateIllicitItems.MODID,"block/translucent_flow");
    public static final ResourceLocation DARK_TRANSLUCENT_STILL = new ResourceLocation(CreateIllicitItems.MODID,"block/darker_translucent_still");
    public static final ResourceLocation DARK_TRANSLUCENT_FLOW = new ResourceLocation(CreateIllicitItems.MODID,"block/darker_translucent_flow");
    public static final ResourceLocation IN_TRANSLUCENT = new ResourceLocation(CreateIllicitItems.MODID,"fluid/in_translucent");

    public static final ResourceLocation POTATO_MASH_JUICE = new ResourceLocation(CreateIllicitItems.MODID,"fluid/in_potato_mash_juice");

    public static final ResourceLocation MORPHINE = new ResourceLocation(CreateIllicitItems.MODID,"fluid/in_morphine");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateIllicitItems.MODID);

    public static final RegistryObject<FluidType> CANE_JUICE_FLUID_TYPE = register("cane_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, CANE_JUICE, 0xFFFF9B59, new Vector3f(1.0f, 155f / 255f, 89f / 255f),
            FluidType.Properties.create().lightLevel(1).density(10).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(true).supportsBoating(false));

    public static final RegistryObject<FluidType> FERMENTED_CANE_JUICE_TYPE = register("fermented_cane_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, FERMENTED_CANE_JUICE, 0xFFB68B3D, new Vector3f(182f / 255f, 139f / 255f, 61f / 255f),
            FluidType.Properties.create().lightLevel(1).density(10).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(true).supportsBoating(false));

    public static final RegistryObject<FluidType> HEATED_FERMENTED_CANE_JUICE_TYPE = register("heated_fermented_cane_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, FERMENTED_CANE_JUICE, 0xFF8E611C, new Vector3f(142f / 255f, 97f / 255f, 28f / 255f),
            FluidType.Properties.create().lightLevel(2).density(10).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> ETHANOL_FLUID_TYPE = register("ethanol_fluid",
            TRANSLUCENT_STILL, TRANSLUCENT_FLOW, IN_TRANSLUCENT, 0x50F2F2F2, new Vector3f(242f / 255f, 242f / 255f, 242f / 255f),
            FluidType.Properties.create().lightLevel(1).density(6).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(true).supportsBoating(false));

    public static final RegistryObject<FluidType> POTATO_MASH_JUICE_FLUID_TYPE = register("potato_mash_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, POTATO_MASH_JUICE, 0xFFBF8728, new Vector3f(191f / 255f, 135f / 255f, 40f / 255f),
            FluidType.Properties.create().lightLevel(1).density(15).viscosity(6).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> FERMENTED_POTATO_MASH_JUICE_FLUID_TYPE = register("fermented_potato_mash_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, POTATO_MASH_JUICE, 0xFFC8973A, new Vector3f(200f / 255f, 151f / 255f, 58f / 255f),
            FluidType.Properties.create().lightLevel(1).density(15).viscosity(6).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> HEAT_FERMENTED_POTATO_MASH_JUICE_FLUID_TYPE = register("heated_fermented_potato_mash_juice_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, POTATO_MASH_JUICE, 0xFFE5C050, new Vector3f(229f / 255f, 192f / 255f, 80f / 255f),
            FluidType.Properties.create().lightLevel(1).density(15).viscosity(6).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> RAW_VODKA_FLUID_TYPE = register("raw_vodka_fluid",
            TRANSLUCENT_STILL, TRANSLUCENT_FLOW, IN_TRANSLUCENT, 0x50F2F2F2, new Vector3f(242f / 255f, 242f / 255f, 242f / 255f),
            FluidType.Properties.create().lightLevel(1).density(8).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> VODKA_FLUID_TYPE = register("vodka_fluid",
            TRANSLUCENT_STILL, TRANSLUCENT_FLOW, IN_TRANSLUCENT, 0x50F2F2F2, new Vector3f(242f / 255f, 242f / 255f, 242f / 255f),
            FluidType.Properties.create().lightLevel(1).density(8).viscosity(3).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> OPIUM_LATEX_FLUID_TYPE = register("opium_latex_fluid",
            DEFAULT_STILL, DEFAULT_FLOW, IN_TRANSLUCENT, 0xFFEFEFEF, new Vector3f(239f / 255f, 239f / 255f, 239f / 255f),
            FluidType.Properties.create().lightLevel(1).density(8).viscosity(4).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> MORPHINE_SOLUTION_FLUID_TYPE = register("morphine_solution_fluid",
            DARK_TRANSLUCENT_STILL, DARK_TRANSLUCENT_FLOW, MORPHINE, 0x904C2F19, new Vector3f(76f / 255f, 47f / 255f, 25f / 255f),
            FluidType.Properties.create().lightLevel(1).density(8).viscosity(4).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    public static final RegistryObject<FluidType> CODEINE_SOLUTION_FLUID_TYPE = register("codeine_solution_fluid",
            DARK_TRANSLUCENT_STILL, DARK_TRANSLUCENT_FLOW, MORPHINE, 0x806B451D, new Vector3f(107f / 255f, 69f / 255f, 29f / 255f),
            FluidType.Properties.create().lightLevel(1).density(8).viscosity(4).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK).canDrown(true).canSwim(false).supportsBoating(false));

    private static RegistryObject<FluidType> register(String name, ResourceLocation still, ResourceLocation flow, ResourceLocation in,
            int tintColor, Vector3f fogColor, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new ModFluidType(still, flow, in,
                tintColor, fogColor, properties));
    }


    public static void register(IEventBus bus) {
        FLUID_TYPES.register(bus);
    }
}
