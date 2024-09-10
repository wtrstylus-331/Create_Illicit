package com.waterstylus331.createillicititems.effect.custom;

import com.waterstylus331.createillicititems.effect.ModEffects;
import com.waterstylus331.createillicititems.misc.ModDamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class OverdoseEffect extends MobEffect {
    public OverdoseEffect(MobEffectCategory category) {
        super(category, 0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof Player player) {
            if (!player.isDeadOrDying() && !player.level().isClientSide()) {
                if (player.hasEffect(ModEffects.EUPHORIA.get())) {
                    player.removeEffect(ModEffects.EUPHORIA.get());

                    if (player.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                        player.removeEffect(MobEffects.MOVEMENT_SPEED);
                    }
                }

                player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 2) {
                    @Override
                    public boolean showIcon() {
                        return false;
                    }

                    @Override
                    public boolean isVisible() {
                        return false;
                    }
                });

                player.hurt(ModDamageTypes.causeOverdoseDamage(player), 4.5f * ((float) amplifier / 2));
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
