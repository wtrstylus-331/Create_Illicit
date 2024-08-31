package com.waterstylus331.createillicititems;

import com.mojang.logging.LogUtils;
import com.waterstylus331.createillicititems.block.ModBlocks;
import com.waterstylus331.createillicititems.block.block_entity.ModBlockEntities;
import com.waterstylus331.createillicititems.fluids.FluidTypes;
import com.waterstylus331.createillicititems.fluids.ModFluids;
import com.waterstylus331.createillicititems.item.ModItems;
import com.waterstylus331.createillicititems.recipe.ModRecipes;
import com.waterstylus331.createillicititems.screen.FermentingBarrelScreen;
import com.waterstylus331.createillicititems.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreateIllicitItems.MODID)
public class CreateIllicitItems
{
    public static final String MODID = "createillicititems";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateIllicitItems()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        Tab.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModItems.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        FluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::enqueue);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("CREATE ILLICIT ITEMS ON COMMON");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    public void enqueue(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModFluids.registerInteractions();

            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_ETHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_ETHANOL.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_RAW_VODKA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_RAW_VODKA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_VODKA.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_VODKA.get(), RenderType.translucent());
        });
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ModMenuTypes.FERMENTING_BARREL_MENU.get(), FermentingBarrelScreen::new);
        }
    }
}
