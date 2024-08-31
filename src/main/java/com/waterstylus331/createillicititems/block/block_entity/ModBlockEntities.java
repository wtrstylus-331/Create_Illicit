package com.waterstylus331.createillicititems.block.block_entity;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import com.waterstylus331.createillicititems.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreateIllicitItems.MODID);

    public static final RegistryObject<BlockEntityType<FermentingBarrelBlockEntity>> FERMENTING_BARREL_BE =
            BLOCK_ENTITIES.register("fermenting_barrel_be", () ->
                    BlockEntityType.Builder.of(FermentingBarrelBlockEntity::new,
                            ModBlocks.FERMENTING_BARREL.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
