package net.mattias.pedestals.core.world.inventory;

import net.mattias.pedestals.core.registry.ModMenus;
import net.mattias.pedestals.core.world.block.entity.PedestalBlockEntity;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;

public class PedestalMenu extends AbstractContainerMenu {
    public final PedestalBlockEntity blockEntity;
    private final Level level;

    public PedestalMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()));
    }

    public PedestalMenu(int pContainerId, Inventory inv, BlockEntity blockEntity) {
        super(ModMenus.PEDESTAL.get(), pContainerId);
        if (blockEntity instanceof PedestalBlockEntity pedestalBE) {
            this.blockEntity = pedestalBE;
        } else {
            throw new IllegalArgumentException("BlockEntity is not a PedestalBlockEntity!");
        }
        this.level = inv.player.level();

        addPlayerInventory(inv);
        addPlayerHotbar(inv);
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory, 0, 80, 35));
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }
    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }


    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;

        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        final int PLAYER_INVENTORY_START_INDEX = 0;
        final int PLAYER_INVENTORY_END_INDEX = VANILLA_SLOT_COUNT - 1;
        final int PEDESTAL_SLOT_START_INDEX = VANILLA_SLOT_COUNT;
        final int PEDESTAL_SLOT_END_INDEX = PEDESTAL_SLOT_START_INDEX + TE_INVENTORY_SLOT_COUNT - 1;

        if (pIndex >= PLAYER_INVENTORY_START_INDEX && pIndex <= PLAYER_INVENTORY_END_INDEX) {
            if (!moveItemStackTo(sourceStack, PEDESTAL_SLOT_START_INDEX, PEDESTAL_SLOT_END_INDEX + 1, false)) {
                return ItemStack.EMPTY;
            }
        }
        else if (pIndex >= PEDESTAL_SLOT_START_INDEX && pIndex <= PEDESTAL_SLOT_END_INDEX) {
            if (!moveItemStackTo(sourceStack, PLAYER_INVENTORY_START_INDEX, PLAYER_INVENTORY_END_INDEX + 1, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.err.println("Invalid slotIndex encountered in quickMoveStack: " + pIndex);
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }

        sourceSlot.onTake(playerIn, sourceStack);

        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        Block atPos = level.getBlockState(blockEntity.getBlockPos()).getBlock();
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer,
                atPos);
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT; // Total slots in player inventory + hotbar
    private static final int VANILLA_FIRST_SLOT_INDEX = 0; // Player inventory starts at index 0 in the slots list

    private static final int TE_INVENTORY_SLOT_COUNT = 1;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_SLOT_COUNT;
}