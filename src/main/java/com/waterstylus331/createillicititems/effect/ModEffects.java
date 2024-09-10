package com.waterstylus331.createillicititems.effect;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import com.waterstylus331.createillicititems.effect.custom.DrunkEffect;
import com.waterstylus331.createillicititems.effect.custom.EuphoriaEffect;
import com.waterstylus331.createillicititems.effect.custom.OverdoseEffect;
import com.waterstylus331.createillicititems.effect.custom.StonedEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOD_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateIllicitItems.MODID);

    public static final RegistryObject<MobEffect> EUPHORIA = MOD_EFFECTS.register("euphoria",
            () -> new EuphoriaEffect(MobEffectCategory.BENEFICIAL));

    public static final RegistryObject<MobEffect> STONED = MOD_EFFECTS.register("stoned",
            () -> new StonedEffect(MobEffectCategory.HARMFUL));

    public static final RegistryObject<MobEffect> DRUNK = MOD_EFFECTS.register("drunk",
            () -> new DrunkEffect(MobEffectCategory.HARMFUL));


    public static final RegistryObject<MobEffect> OVERDOSE = MOD_EFFECTS.register("overdose",
            () -> new OverdoseEffect(MobEffectCategory.HARMFUL));

    public static void register(IEventBus bus) {
        MOD_EFFECTS.register(bus);
    }
}
