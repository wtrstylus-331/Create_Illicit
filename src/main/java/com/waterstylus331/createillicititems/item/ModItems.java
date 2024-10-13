package com.waterstylus331.createillicititems.item;

import com.waterstylus331.createillicititems.CreateIllicitItems;
import com.waterstylus331.createillicititems.block.ModBlocks;
import com.waterstylus331.createillicititems.fluids.ModFluids;
import com.waterstylus331.createillicititems.item.custom.*;
import com.waterstylus331.createillicititems.item.drugs.BluntItem;
import com.waterstylus331.createillicititems.item.drugs.CocaineItem;
import com.waterstylus331.createillicititems.item.drugs.VodkaItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateIllicitItems.MODID);

    public static final RegistryObject<Item> COCA_PLANT_ICON_ADV = ITEMS.register("coca_plant_icon",
            () -> new Item(new Item.Properties().stacksTo(64).fireResistant()));

    // for cocaine
    public static final RegistryObject<Item> COCA_SEEDS = ITEMS.register("coca_seeds",
            () -> new ItemNameBlockItem(ModBlocks.COCA_PLANT.get(), new Item.Properties()));

    public static final RegistryObject<Item> COCA_LEAF = ITEMS.register("coca_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> DRIED_COCA_LEAF = ITEMS.register("dried_coca_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BURNT_COCA_LEAF = ITEMS.register("burnt_coca_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> COCA_PASTE = ITEMS.register("coca_paste",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> COCA_PASTE_MIXTURE = ITEMS.register("coca_paste_mixture",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CRUDE_COCA = ITEMS.register("crude_coca",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CRUDE_COCA_MIXTURE = ITEMS.register("crude_coca_mixture",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_COCAINE = ITEMS.register("raw_cocaine",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine",
            () -> new CocaineItem(new Item.Properties().stacksTo(64).food
                    (new FoodProperties.Builder().saturationMod(0.5f).nutrition(1).build())));

    // for ethanol
    public static final RegistryObject<Item> CANE_JUICE = ITEMS.register("cane_juice",
            () -> new CaneJuiceItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CANE_JUICE_BUCKET = ITEMS.register("cane_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CANE_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> FERMENTED_CANE_JUICE = ITEMS.register("fermented_cane_juice",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FERMENTED_CANE_JUICE_BUCKET = ITEMS.register("fermented_cane_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FERMENT_CANE_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> HEATED_FERMENTED_CANE_JUICE = ITEMS.register("heated_fermented_cane_juice",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HEATED_FERMENTED_CANE_JUICE_BUCKET = ITEMS.register("heated_fermented_cane_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HEAT_FERMENT_CANE_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> ETHANOL_BOTTLE = ITEMS.register("ethanol_bottle",
            () -> new EthanolItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> ETHANOL_BUCKET = ITEMS.register("ethanol_bucket",
            () -> new BucketItem(ModFluids.SOURCE_ETHANOL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // for vodka
    public static final RegistryObject<Item> POTATO_MASH = ITEMS.register("potato_mash",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> POTATO_MASH_BOTTLE = ITEMS.register("potato_mash_juice_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> POTATO_MASH_BUCKET = ITEMS.register("potato_mash_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_POTATO_MASH_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> FERM_POTATO_MASH_BOTTLE = ITEMS.register("fermented_potato_mash_juice_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> FERM_POTATO_MASH_BUCKET = ITEMS.register("fermented_potato_mash_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_FERM_POTATO_MASH_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> HEAT_FERM_POTATO_MASH_BOTTLE = ITEMS.register("heated_fermented_potato_mash_juice_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> HEAT_FERM_POTATO_MASH_BUCKET = ITEMS.register("heated_fermented_potato_mash_juice_bucket",
            () -> new BucketItem(ModFluids.SOURCE_HEAT_FERM_POTATO_MASH_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> EMPTY_VODKA_BOTTLE = ITEMS.register("empty_vodka_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_VODKA_BOTTLE = ITEMS.register("raw_vodka_bottle",
            () -> new RawVodkaItem(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RAW_VODKA_BUCKET = ITEMS.register("raw_vodka_bucket",
            () -> new BucketItem(ModFluids.SOURCE_RAW_VODKA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> VODKA_BOTTLE = ITEMS.register("vodka_bottle",
            () -> new VodkaItem(new Item.Properties().stacksTo(64).food(
                    new FoodProperties.Builder().saturationMod(2f).build())));

    public static final RegistryObject<Item> VODKA_BUCKET = ITEMS.register("vodka_bucket",
            () -> new BucketItem(ModFluids.SOURCE_VODKA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // for chalk
    public static final RegistryObject<Item> TRONA_CHUNK = ITEMS.register("trona_chunk",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> POWDERED_CHALK = ITEMS.register("powdered_chalk",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // for sodium
    public static final RegistryObject<Item> SODIUM_BICARBONATE = ITEMS.register("sodium_bicarbonate",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SODIUM_CARBONATE = ITEMS.register("sodium_carbonate",
            () -> new Item(new Item.Properties().stacksTo(64)));

    // for cannabis
    public static final RegistryObject<Item> CANNABIS_LEAF = ITEMS.register("cannabis_leaf",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CANNABIS_SEEDS = ITEMS.register("cannabis_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CANNABIS_PLANT.get(), new Item.Properties()));

    public static final RegistryObject<Item> ROLLED_PAPER = ITEMS.register("rolled_paper",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> INCOMPLETE_BLUNT = ITEMS.register("incomplete_blunt",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BLUNT = ITEMS.register("blunt",
            () -> new BluntItem(new Item.Properties().durability(64).defaultDurability(64).food(
                    new FoodProperties.Builder().saturationMod(1f).build()
            )));

    // for opium
    public static final RegistryObject<Item> OPIUM_SEEDS = ITEMS.register("opium_poppy_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OPIUM_POPPY_PLANT.get(), new Item.Properties()));

    public static final RegistryObject<Item> OPIUM_POPPY_POD = ITEMS.register("opium_seed_pod",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> OPIUM_LATEX_BOTTLE = ITEMS.register("opium_latex_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> OPIUM_LATEX_BUCKET = ITEMS.register("opium_latex_bucket",
            () -> new BucketItem(ModFluids.SOURCE_OPIUM_LATEX, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> MORPHINE_SOLUTION_BOTTLE = ITEMS.register("morphine_solution_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MORPHINE_SOLUTION_BUCKET = ITEMS.register("morphine_solution_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MORPHINE_SOLUTION, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> CODEINE_SOLUTION_BOTTLE = ITEMS.register("codeine_solution_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CODEINE_SOLUTION_BUCKET = ITEMS.register("codeine_solution_bucket",
            () -> new BucketItem(ModFluids.SOURCE_CODEINE_SOLUTION, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> PURE_CODEINE_BOTTLE = ITEMS.register("pure_codeine_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PURE_CODEINE_BUCKET = ITEMS.register("pure_codeine_bucket",
            () -> new BucketItem(ModFluids.SOURCE_PURE_CODEINE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final RegistryObject<Item> IMPURE_SEDIMENT_BOTTLE = ITEMS.register("impure_sediment_bottle",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> IMPURE_SEDIMENT_BUCKET = ITEMS.register("impure_sediment_bucket",
            () -> new BucketItem(ModFluids.SOURCE_IMPURE_SEDIMENT, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
