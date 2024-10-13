package com.waterstylus331.createillicititems.effect.custom;

import com.waterstylus331.createillicititems.effect.ModEffects;
import com.waterstylus331.createillicititems.misc.ModDamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class OverdoseEffect extends MobEffect {
    public OverdoseEffect(MobEffectCategory category) {
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

            entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 2) {
                @Override
                public boolean showIcon() {
                    return false;
                }

                @Override
                public boolean isVisible() {
                    return false;
                }
            });

            double posX = (Math.random() - 0.5) * 2;
            double posZ = (Math.random() - 0.5) * 2;
            entity.setDeltaMovement(posX, entity.getDeltaMovement().y, posZ);
            entity.hurtMarked = true;

            entity.hurt(ModDamageTypes.causeOverdoseDamage(entity), 4f * ((float) amplifier / 2));
        }

        super.applyEffectTick(entity, amplifier);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
