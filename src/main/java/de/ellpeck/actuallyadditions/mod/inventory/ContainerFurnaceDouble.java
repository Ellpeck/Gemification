package de.ellpeck.actuallyadditions.mod.inventory;

import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotItemHandlerUnconditioned;
import de.ellpeck.actuallyadditions.mod.inventory.slot.SlotOutput;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityBase;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityFurnaceDouble;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerFurnaceDouble extends Container {

    private final TileEntityFurnaceDouble tileFurnace;

    public ContainerFurnaceDouble(InventoryPlayer inventory, TileEntityBase tile) {
        this.tileFurnace = (TileEntityFurnaceDouble) tile;

        this.addSlotToContainer(new SlotItemHandlerUnconditioned(this.tileFurnace.inv, TileEntityFurnaceDouble.SLOT_INPUT_1, 51, 21));
        this.addSlotToContainer(new SlotOutput(this.tileFurnace.inv, TileEntityFurnaceDouble.SLOT_OUTPUT_1, 51, 69));
        this.addSlotToContainer(new SlotItemHandlerUnconditioned(this.tileFurnace.inv, TileEntityFurnaceDouble.SLOT_INPUT_2, 109, 21));
        this.addSlotToContainer(new SlotOutput(this.tileFurnace.inv, TileEntityFurnaceDouble.SLOT_OUTPUT_2, 108, 69));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 97 + i * 18));
            }
        }
        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 155));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
        int inventoryStart = 4;
        int inventoryEnd = inventoryStart + 26;
        int hotbarStart = inventoryEnd + 1;
        int hotbarEnd = hotbarStart + 8;

        Slot theSlot = this.inventorySlots.get(slot);

        if (theSlot != null && theSlot.getHasStack()) {
            ItemStack newStack = theSlot.getStack();
            ItemStack currentStack = newStack.copy();

            //Slots in Inventory to shift from
            if (slot == TileEntityFurnaceDouble.SLOT_OUTPUT_1 || slot == TileEntityFurnaceDouble.SLOT_OUTPUT_2) {
                if (!this.mergeItemStack(newStack, inventoryStart, hotbarEnd + 1, true)) { return StackUtil.getEmpty(); }
                theSlot.onSlotChange(newStack, currentStack);
            }
            //Other Slots in Inventory excluded
            else if (slot >= inventoryStart) {
                //Shift from Inventory
                if (StackUtil.isValid(FurnaceRecipes.instance().getSmeltingResult(newStack))) {
                    if (!this.mergeItemStack(newStack, TileEntityFurnaceDouble.SLOT_INPUT_1, TileEntityFurnaceDouble.SLOT_INPUT_1 + 1, false)) {
                        if (!this.mergeItemStack(newStack, TileEntityFurnaceDouble.SLOT_INPUT_2, TileEntityFurnaceDouble.SLOT_INPUT_2 + 1, false)) { return StackUtil.getEmpty(); }
                    }
                }
                //

                else if (slot >= inventoryStart && slot <= inventoryEnd) {
                    if (!this.mergeItemStack(newStack, hotbarStart, hotbarEnd + 1, false)) { return StackUtil.getEmpty(); }
                } else if (slot >= inventoryEnd + 1 && slot < hotbarEnd + 1 && !this.mergeItemStack(newStack, inventoryStart, inventoryEnd + 1, false)) { return StackUtil.getEmpty(); }
            } else if (!this.mergeItemStack(newStack, inventoryStart, hotbarEnd + 1, false)) { return StackUtil.getEmpty(); }

            if (!StackUtil.isValid(newStack)) {
                theSlot.putStack(StackUtil.getEmpty());
            } else {
                theSlot.onSlotChanged();
            }

            if (newStack.getCount() == currentStack.getCount()) { return StackUtil.getEmpty(); }
            theSlot.onTake(player, newStack);

            return currentStack;
        }
        return StackUtil.getEmpty();
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return this.tileFurnace.canPlayerUse(player);
    }
}