package com.waterstylus331.createillicititems;

import com.waterstylus331.createillicititems.block.ModBlocks;
import com.waterstylus331.createillicititems.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class Tab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateIllicitItems.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = TABS.register("mod_tab_main",
            () -> CreativeModeTab.builder().title(Component.translatable("creativetab.mod_tab_main"))
                    .icon(() -> new ItemStack(ModItems.CANNABIS_LEAF.get()))
                    .displayItems((pParameter, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.COCA_SEEDS.get()));
                        pOutput.accept(new ItemStack(ModItems.COCA_LEAF.get()));
                        pOutput.accept(new ItemStack(ModItems.DRIED_COCA_LEAF.get()));
                        pOutput.accept(new ItemStack(ModItems.BURNT_COCA_LEAF.get()));
                        pOutput.accept(new ItemStack(ModItems.COCA_PASTE.get()));
                        pOutput.accept(new ItemStack(ModItems.COCA_PASTE_MIXTURE.get()));
                        pOutput.accept(new ItemStack(ModItems.TRONA_CHUNK.get()));
                        pOutput.accept(new ItemStack(ModItems.SODIUM_BICARBONATE.get()));
                        pOutput.accept(new ItemStack(ModItems.SODIUM_CARBONATE.get()));
                        pOutput.accept(new ItemStack(ModItems.POWDERED_CHALK.get()));
                        pOutput.accept(new ItemStack(ModItems.CRUDE_COCA.get()));
                        pOutput.accept(new ItemStack(ModItems.CRUDE_COCA_MIXTURE.get()));
                        pOutput.accept(new ItemStack(ModItems.RAW_COCAINE.get()));
                        pOutput.accept(new ItemStack(ModItems.COCAINE.get()));

                        pOutput.accept(new ItemStack(ModItems.POTATO_MASH.get()));
                        pOutput.accept(new ItemStack(ModItems.EMPTY_VODKA_BOTTLE.get()));

                        pOutput.accept(new ItemStack(ModItems.CANNABIS_SEEDS.get()));
                        pOutput.accept(new ItemStack(ModItems.CANNABIS_LEAF.get()));
                        pOutput.accept(new ItemStack(ModItems.ROLLED_PAPER.get()));
                        pOutput.accept(new ItemStack(ModItems.BLUNT.get()));

                        pOutput.accept(new ItemStack(ModItems.OPIUM_SEEDS.get()));
                        pOutput.accept(new ItemStack(ModItems.OPIUM_POPPY_POD.get()));

                        pOutput.accept(new ItemStack(ModBlocks.COCAINE_BLOCK.get()));

                        pOutput.accept(new ItemStack(ModBlocks.FERMENTING_BARREL.get()));

                        pOutput.accept(new ItemStack(ModBlocks.TRONA_ORE.get()));
                        pOutput.accept(new ItemStack(ModBlocks.DEEPSLATE_TRONA_ORE.get()));
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> LIQUIDS_TAB = TABS.register("mod_tab_liquids",
            () -> CreativeModeTab.builder().title(Component.translatable("createivetab.mod_tab_liquids"))
                    .icon(() -> new ItemStack(ModItems.VODKA_BOTTLE.get()))
                    .displayItems((pParameter, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.CANE_JUICE.get()));
                        pOutput.accept(new ItemStack(ModItems.FERMENTED_CANE_JUICE.get()));
                        pOutput.accept(new ItemStack(ModItems.HEATED_FERMENTED_CANE_JUICE.get()));
                        pOutput.accept(new ItemStack(ModItems.ETHANOL_BOTTLE.get()));

                        pOutput.accept(new ItemStack(ModItems.POTATO_MASH_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.FERM_POTATO_MASH_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.HEAT_FERM_POTATO_MASH_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.RAW_VODKA_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.VODKA_BOTTLE.get()));

                        pOutput.accept(new ItemStack(ModItems.OPIUM_LATEX_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.MORPHINE_SOLUTION_BOTTLE.get()));
                        pOutput.accept(new ItemStack(ModItems.CODEINE_SOLUTION_BOTTLE.get()));

                        pOutput.accept(new ItemStack(ModItems.CANE_JUICE_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.FERMENTED_CANE_JUICE_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.HEATED_FERMENTED_CANE_JUICE_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.ETHANOL_BUCKET.get()));

                        pOutput.accept(new ItemStack(ModItems.POTATO_MASH_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.FERM_POTATO_MASH_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.HEAT_FERM_POTATO_MASH_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.RAW_VODKA_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.VODKA_BUCKET.get()));

                        pOutput.accept(new ItemStack(ModItems.OPIUM_LATEX_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.MORPHINE_SOLUTION_BUCKET.get()));
                        pOutput.accept(new ItemStack(ModItems.CODEINE_SOLUTION_BUCKET.get()));
                    })
                    .build());

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
