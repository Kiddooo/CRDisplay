package dev.kiddo.CRDisplay.inventories;

import dev.kiddo.CRDisplay.recipes.WandRecipes;
import dev.kiddo.CRDisplay.utils.InventoryHelper;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static dev.kiddo.CRDisplay.utils.InventoryHelper.fillWithDefaultItems;
import static dev.kiddo.CRDisplay.utils.ItemUtils.createInventoryItem;
import static dev.kiddo.CRDisplay.utils.ItemUtils.getBackButton;

public class MiscItemsInventoryGUI {
    private static final int INVENTORY_SIZE = 54;
    private static final Component INVENTORY_TITLE = Component.text("Custom Recipes");
    private static final List<Integer> ITEM_SLOTS_PAGE1 = List.of(10, 12, 14, 16, 20, 24, 28, 30, 32, 34, 38, 42);
    private static final List<Integer> ITEM_SLOTS_PAGE2 = List.of(10, 12, 14, 16, 20, 24);

    // Map to hold player-specific inventories
    private static final Map<Player, Inventory> playerInventories = new HashMap<>();
    private static final Map<Player, Integer> playerCurrentPage = new HashMap<>();

    public static synchronized Inventory getBaseInventory(Player player) {
        // Check if the player already has an inventory
        if (!playerInventories.containsKey(player)) {
            InventoryHelper.logInventoryInitialization("Misc");
            Inventory inventory = Bukkit.createInventory(null, INVENTORY_SIZE, INVENTORY_TITLE);
            playerInventories.put(player, inventory);
            playerCurrentPage.put(player, 1); // Set the initial page
            initializeItems(inventory, player);
            InventoryHelper.logInventoryInitialized("Misc");
        }
        return playerInventories.get(player);
    }

    public static Integer getPlayerPage(Player player) {
        return playerCurrentPage.get(player);
    }

    private static void initializeItems(Inventory inventory, Player player) {
        if (inventory != null) {
            inventory.clear();
            setupInventoryItems(inventory, player);
        } else {
            InventoryHelper.logInventoryError("Misc");
        }
    }

    private static void setupInventoryItems(Inventory inventory, Player player) {
        int currentPage = playerCurrentPage.get(player); // Get the current page for this player

        if (currentPage == 1) {
            fillWithDefaultItems(inventory, INVENTORY_SIZE, ITEM_SLOTS_PAGE1);
            setupPageOneItems(inventory);
        } else {
            fillWithDefaultItems(inventory, INVENTORY_SIZE, ITEM_SLOTS_PAGE2);
            setupPageTwoItems(inventory);
        }

        inventory.setItem(49, getBackButton());
    }

    private static void setupPageOneItems(Inventory inventory) {
        inventory.setItem(10, createInventoryItem(Material.CALCITE, null));
        inventory.setItem(12, createInventoryItem(Material.GILDED_BLACKSTONE, null));
        inventory.setItem(14, createInventoryItem(Material.ARMS_UP_POTTERY_SHERD, null));
        inventory.setItem(16, createInventoryItem(Material.RED_SAND, null));
        inventory.setItem(20, createInventoryItem(Material.BUNDLE, null));
        inventory.setItem(24, createInventoryItem(Material.INK_SAC, null));
        inventory.setItem(28, createInventoryItem(WandRecipes.getItemFrameWandItem(), Component.text("Item Frame Wand", NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false)));
        inventory.setItem(30, createInventoryItem(WandRecipes.getArmorStandWandItem(), Component.text("Armor Stand Wand", NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false)));
        inventory.setItem(32, createInventoryItem(Material.ROOTED_DIRT, null));
        inventory.setItem(34, createInventoryItem(Material.RED_SANDSTONE, null));
        inventory.setItem(38, createInventoryItem(Material.DISPENSER, null));
        inventory.setItem(42, createInventoryItem(Material.DISPENSER, null));

        // Add a button to go to the next page
        inventory.setItem(53, createInventoryItem(Material.ARROW, Component.text("Next Page", NamedTextColor.GREEN)));

    }

    private static void setupPageTwoItems(Inventory inventory) {
        // Add items for the second page
        inventory.setItem(10, createInventoryItem(Material.STRING, null));
        inventory.setItem(12, createInventoryItem(Material.QUARTZ, null));
        inventory.setItem(14, createInventoryItem(Material.PACKED_ICE, null));
        inventory.setItem(16, createInventoryItem(Material.ICE, null));
        inventory.setItem(20, createInventoryItem(Material.NETHER_WART, null));
        inventory.setItem(24, createInventoryItem(Material.AMETHYST_SHARD, null));

        // Add a button to return to the previous page
        inventory.setItem(45, createInventoryItem(Material.ARROW, Component.text("Previous Page", NamedTextColor.GREEN)));
    }

    public static void setCurrentPage(Player player, int page) {
        playerCurrentPage.put(player, page);
    }

    public static void refreshInventory(Player player) {
        Inventory inventory = playerInventories.get(player);
        if (inventory != null) {
            initializeItems(inventory, player); // Reinitialize the inventory to update the items based on the current page
            player.openInventory(inventory); // Reopen the inventory for the player
        }
    }
}
