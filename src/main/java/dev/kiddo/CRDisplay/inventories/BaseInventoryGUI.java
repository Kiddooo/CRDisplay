package dev.kiddo.CRDisplay.inventories;

import dev.kiddo.CRDisplay.utils.InventoryHelper;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.List;

import static dev.kiddo.CRDisplay.utils.InventoryHelper.fillWithDefaultItems;
import static dev.kiddo.CRDisplay.utils.ItemUtils.createInventoryItem;

public class BaseInventoryGUI {
    private static final int INVENTORY_SIZE = 27;
    private static final Component INVENTORY_TITLE = Component.text("Custom Recipes");

    // List of slots that contain items
    private static final List<Integer> ITEM_SLOTS = List.of(10, 12, 14, 16);

    private static Inventory baseInventory;

    public static synchronized Inventory getBaseInventory() {
        if (baseInventory == null) {
            InventoryHelper.logInventoryInitialization("Base");
            baseInventory = Bukkit.createInventory(null, INVENTORY_SIZE, INVENTORY_TITLE);
            initializeItems();
            InventoryHelper.logInventoryInitialized("Base");
        }
        return baseInventory;
    }

    public static void initializeItems() {
        if (baseInventory != null) {
            // Fill glass panes using the utility method for empty slots
            fillWithDefaultItems(baseInventory, INVENTORY_SIZE, ITEM_SLOTS);

            // Set specific items
            setupInventoryItems();
        } else {
            InventoryHelper.logInventoryError("Base");
        }
    }

    private static void setupInventoryItems() {
        baseInventory.setItem(10, createInventoryItem(Material.BLUE_CONCRETE_POWDER, Component.text("Universal Dyeing")));
        baseInventory.setItem(12, createInventoryItem(Material.TUBE_CORAL_BLOCK, Component.text("Coral")));
        baseInventory.setItem(14, createInventoryItem(Material.COPPER_BLOCK, Component.text("Copper")));
        baseInventory.setItem(16, createInventoryItem(Material.BOOKSHELF, Component.text("Misc Items")));
    }
}
