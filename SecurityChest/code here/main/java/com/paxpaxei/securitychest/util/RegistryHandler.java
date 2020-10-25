package com.paxpaxei.securitychest.util;

import com.paxpaxei.securitychest.SecurityChest;
import com.paxpaxei.securitychest.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SecurityChest.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, SecurityChest.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RUBY_WORSE = ITEMS.register("ruby_worse", ItemBase::new);
    public static final RegistryObject<Item> GOLDEN_RUBY = ITEMS.register("golden_ruby", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_RUBY = ITEMS.register("diamond_ruby", ItemBase::new);
    public static final RegistryObject<Item> RUBY_ORE = ITEMS.register("ruby_ore", ItemBase::new);

}
