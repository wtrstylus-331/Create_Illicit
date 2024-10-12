package com.waterstylus331.createillicititems.effect.custom;

import com.waterstylus331.createillicititems.effect.ModEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;

public class StonedEffect extends MobEffect {
    public StonedEffect(MobEffectCategory category) {
        super(category, 0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (!entity.isDeadOrDying() && !entity.level().isClientSide()) {
            if (entity.hasEffect(ModEffects.EUPHORIA.get())) {
                entity.removeEffect(ModEffects.EUPHORIA.get());

                if (entity.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                    entity.removeEffect(MobEffects.MOVEMENT_SPEED);
                }
            }

            entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 0) {
                @Override
                public boolean showIcon() {
                    return false;
                }

                @Override
                public boolean isVisible() {
                    return false;
                }
            });

            entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 0) {
                @Override
                public boolean showIcon() {
                    return false;
                }

                @Override
                public boolean isVisible() {
                    return false;
                }
            });
        }

        super.applyEffectTick(entity, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
