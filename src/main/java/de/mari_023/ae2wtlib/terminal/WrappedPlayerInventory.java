package de.mari_023.ae2wtlib.terminal;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;

import appeng.api.inventories.InternalInventory;

public class WrappedPlayerInventory implements InternalInventory {

    private final Inventory playerInventory;

    public WrappedPlayerInventory(Inventory playerInventory) {
        this.playerInventory = playerInventory;
    }

    @Override
    public int size() {
        return playerInventory.getContainerSize();
    }

    @Override
    public ItemStack getStackInSlot(int slotIndex) {
        return switch (slotIndex) {
            case 36, 37, 38, 39, Inventory.SLOT_OFFHAND -> playerInventory.getItem(slotIndex);
            default -> ItemStack.EMPTY;
        };
    }

    @Override
    public void setItemDirect(int slotIndex, ItemStack stack) {
        playerInventory.setItem(slotIndex, stack);
    }
}
