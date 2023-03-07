package net.celpuff.celmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.units.qual.C;

import java.awt.*;

public class ModCreativeModeTab {
    public static final CreativeModeTab CEL_TAB = new CreativeModeTab("celtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.tallmartium.get());
        }
    };
}
