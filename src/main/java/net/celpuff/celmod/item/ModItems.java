package net.celpuff.celmod.item;

import net.celpuff.celmod.CelMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CelMod.MOD_ID);
    public static final RegistryObject<Item> tallmartium = ITEMS.register("tallmartium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CEL_TAB)));
    public static final RegistryObject<Item> raw_tallmartium = ITEMS.register("raw_tallmartium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CEL_TAB)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}


