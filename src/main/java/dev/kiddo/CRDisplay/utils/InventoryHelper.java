package dev.kiddo.CRDisplay.utils;

import dev.kiddo.CRDisplay.CRDisplay;
import org.bukkit.inventory.Inventory;

import java.util.List;

import static dev.kiddo.CRDisplay.utils.ItemUtils.getBlackStainedGlassPane;

public class InventoryHelper {

    public static void fillWithDefaultItems(Inventory inventory, Integer inventorySize, List<Integer> recipeSlots) {
        for (int i = 0; i < inventorySize; i++) {
            if (!recipeSlots.contains(i) && inventory.getItem(i) == null) {
                inventory.setItem(i, getBlackStainedGlassPane());
            }
        }
    }

    public static void logInventoryInitialization(String inventoryName) {
        CRDisplay.pluginInstance.getLogger().info("Initializing " + inventoryName + " inventory...");
    }

    public static void logInventoryInitialized(String inventoryName) {
        CRDisplay.pluginInstance.getLogger().info(inventoryName + " inventory initialized successfully");
    }

    public static void logInventoryError(String inventoryName) {
        CRDisplay.pluginInstance.getLogger().severe("Error: " + inventoryName + " inventory is null during initialization");
    }
}
