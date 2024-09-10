package com.waterstylus331.createillicititems.item.drugs;

import com.waterstylus331.createillicititems.effect.ModEffects;
import com.waterstylus331.createillicititems.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class VodkaItem extends HoneyBottleItem {
    public VodkaItem(Properties properties) {
        super(properties);
    }

    protected int count;
    protected long firstConsumptionTime;

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, player, hand);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41358_) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(ItemStack p_41360_) {
        return 40;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        if (entity instanceof Player player) {
            CompoundTag tag = itemStack.getOrCreateTag();

            this.count = tag.getInt("consumptionCount");
            this.firstConsumptionTime = tag.getLong("firstConsumptionTime");

            long currentTime = level.getGameTime();

            if (this.count == 0 || (currentTime - this.firstConsumptionTime) >= 600) {
                this.count = 0;
                this.firstConsumptionTime = currentTime;
            }

            this.count++;

            if (this.count >= 10) {
                if (!player.isDeadOrDying()) {
                    player.addEffect(new MobEffectInstance(ModEffects.DRUNK.get(), 600));
                }
            }

            tag.putInt("consumptionCount", this.count);
            tag.putLong("firstConsumptionTime", this.firstConsumptionTime);

            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);

                if (itemStack.isEmpty()) {
                    return new ItemStack(ModItems.EMPTY_VODKA_BOTTLE.get());
                } else {
                    ItemStack glassBottle = new ItemStack(ModItems.EMPTY_VODKA_BOTTLE.get());
                    if (!player.getInventory().add(glassBottle)) {
                        player.drop(glassBottle, false);
                    }
                }
            }
        }

        return itemStack.isEmpty() ? new ItemStack(ModItems.EMPTY_VODKA_BOTTLE.get()) : itemStack;
    }
}
