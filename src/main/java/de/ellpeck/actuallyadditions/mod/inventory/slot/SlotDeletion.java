package de.ellpeck.actuallyadditions.mod.inventory.slot;

import de.ellpeck.actuallyadditions.mod.util.ItemStackHandlerAA;
import net.minecraft.item.ItemStack;

public class SlotDeletion extends SlotItemHandlerUnconditioned {

    public SlotDeletion(ItemStackHandlerAA inv, int slot, int x, int y) {
        super(inv, slot, x, y);
    }

    @Override
    public void putStack(ItemStack stack) {
        this.onSlotChanged();
    }
}
