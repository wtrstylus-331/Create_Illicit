package com.waterstylus331.createillicititems.misc;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.LivingEntity;

public class ModDamageTypes {
    public static final ResourceKey<DamageType> OVERDOSE = ResourceKey.create(Registries.DAMAGE_TYPE,
            new ResourceLocation(CreateIllicitItems.MODID, "overdose"));

    public static DamageSource causeOverdoseDamage(LivingEntity attacker) {
        return new DamageSource(attacker.level().registryAccess().registry(Registries.DAMAGE_TYPE).get().getHolderOrThrow(OVERDOSE));
    }
}
