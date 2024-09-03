package com.waterstylus331.createillicititems.effect.custom;

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
        if (entity instanceof Player player) {
            if (!player.isDeadOrDying()) {
                player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 400, 1) {
                    @Override
                    public boolean showIcon() {
                        return false;
                    }
                });

                player.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 1) {
                    @Override
                    public boolean showIcon() {
                        return false;
                    }
                });
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
