package com.waterstylus331.createillicititems.recipe;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, CreateIllicitItems.MODID);

    public static final RegistryObject<RecipeSerializer<FermentingBarrelRecipe>> FERMENTING_BARREL_SERIALIZER =
            SERIALIZERS.register("fermenting_barrel", () -> FermentingBarrelRecipe.Serializer.INSTANCE);

    public static void register(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
