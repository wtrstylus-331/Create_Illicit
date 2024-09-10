package com.waterstylus331.createillicititems.item.drugs;

import com.waterstylus331.createillicititems.effect.ModEffects;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class BluntItem extends Item {
    public BluntItem(Properties properties) {
        super(properties);
    }

    protected int count;
    protected long firstConsumptionTime;

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        return ItemUtils.startUsingInstantly(level, player, hand);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return true;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack p_41454_) {
        return 40;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity entity) {
        if (entity instanceof Player player && !level.isClientSide()) {
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
                    player.addEffect(new MobEffectInstance(ModEffects.STONED.get(), 400));
                }
            } else {
                player.addEffect(new MobEffectInstance(ModEffects.EUPHORIA.get(), 400));
            }

            tag.putInt("consumptionCount", this.count);
            tag.putLong("firstConsumptionTime", this.firstConsumptionTime);

            itemStack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
        }
        return itemStack;
    }
}
