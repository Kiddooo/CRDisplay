package dev.kiddo.CRDisplay.inventories;

import dev.kiddo.CRDisplay.utils.InventoryHelper;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.List;

import static dev.kiddo.CRDisplay.utils.ItemUtils.*;

public class CoralInventoryGUI {
    private static final int INVENTORY_SIZE = 27;
    private static final Component INVENTORY_TITLE = Component.text("Coral Recipes", NamedTextColor.BLUE);
    private static final List<Integer> ITEM_SLOTS = List.of(12, 13, 14, 22);

    private static Inventory coralInventory;

    public static synchronized Inventory getBaseInventory() {
        if (coralInventory == null) {
            InventoryHelper.logInventoryInitialization("Coral");
            coralInventory = Bukkit.createInventory(null, INVENTORY_SIZE, INVENTORY_TITLE);
            initializeItems();
            InventoryHelper.logInventoryInitialized("Coral");
        }
        return coralInventory;
    }

    private static void initializeItems() {
        if (coralInventory != null) {
            InventoryHelper.fillWithDefaultItems(coralInventory, INVENTORY_SIZE, ITEM_SLOTS);

            // Set specific items in designated slots
            coralInventory.setItem(12, createInventoryItem(Material.TUBE_CORAL_BLOCK, Component.text("Coral Block")));
            coralInventory.setItem(14, createInventoryItem(Material.DEAD_TUBE_CORAL_BLOCK, Component.text("Dead Coral Block")));
            coralInventory.setItem(22, getBackButton());
            coralInventory.setItem(13, getCoralCraftingInformation());
        } else {
            InventoryHelper.logInventoryError("Coral");
        }
    }
}
