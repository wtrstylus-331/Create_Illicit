package com.waterstylus331.createillicititems.effect.custom;

import com.waterstylus331.createillicititems.effect.ModEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class EuphoriaEffect extends MobEffect {
    public EuphoriaEffect(MobEffectCategory category) {
        super(category, 0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player) {
            if (!player.isDeadOrDying() && !player.level().isClientSide()) {
                if (player.hasEffect(ModEffects.STONED.get())) {
                    return;
                }

                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0) {
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
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
