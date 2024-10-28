package dev.kiddo.CRDisplay.inventories;

import dev.kiddo.CRDisplay.utils.InventoryHelper;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import java.util.List;

import static dev.kiddo.CRDisplay.utils.InventoryHelper.fillWithDefaultItems;
import static dev.kiddo.CRDisplay.utils.ItemUtils.*;

public class UniversalDyeingInventoryGUI {
    private static final int INVENTORY_SIZE = 54;
    private static final Component INVENTORY_TITLE = Component.text("Universal Dyeing", NamedTextColor.BLUE);
    private static final List<Integer> ITEM_SLOTS = List.of(20, 21, 22, 23, 24, 29, 31, 33, 40, 49);

    private static Inventory universalDyeingInventory;

    public static synchronized Inventory getBaseInventory() {
        if (universalDyeingInventory == null) {
            InventoryHelper.logInventoryInitialization("Universal Dyeing");
            universalDyeingInventory = Bukkit.createInventory(null, INVENTORY_SIZE, INVENTORY_TITLE);
            initializeItems();
            InventoryHelper.logInventoryInitialized("Universal Dyeing");
        }
        return universalDyeingInventory;
    }

    private static void initializeItems() {
        if (universalDyeingInventory != null) {
            fillWithDefaultItems(universalDyeingInventory, INVENTORY_SIZE, ITEM_SLOTS);
            setupInventoryItems();
        } else {
            InventoryHelper.logInventoryError("Universal Dyeing");
        }
    }

    private static void setupInventoryItems() {
        universalDyeingInventory.setItem(20, createInventoryItem(Material.BLUE_WOOL, Component.text("Wool")));
        universalDyeingInventory.setItem(21, createInventoryItem(Material.BLUE_CANDLE, Component.text("Candles")));
        universalDyeingInventory.setItem(22, createInventoryItem(Material.BLUE_STAINED_GLASS, Component.text("Glass")));
        universalDyeingInventory.setItem(31, createInventoryItem(Material.BLUE_STAINED_GLASS_PANE, Component.text("Glass Panes")));
        universalDyeingInventory.setItem(29, createInventoryItem(Material.BLUE_CONCRETE_POWDER, Component.text("Concrete Powder")));
        universalDyeingInventory.setItem(23, createInventoryItem(Material.BLUE_BED, Component.text("Beds")));
        universalDyeingInventory.setItem(24, createInventoryItem(Material.BLUE_TERRACOTTA, Component.text("Terracotta")));
        universalDyeingInventory.setItem(33, createInventoryItem(Material.BLUE_GLAZED_TERRACOTTA, Component.text("Glazed Terracotta")));
        universalDyeingInventory.setItem(40, getUniversalDyeingInformation());
        universalDyeingInventory.setItem(49, getBackButton());
    }
}
