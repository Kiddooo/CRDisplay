package dev.kiddo.CRDisplay.event;

import dev.kiddo.CRDisplay.CRDisplay;
import dev.kiddo.CRDisplay.inventories.*;
import dev.kiddo.CRDisplay.recipes.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.logging.Logger;


public class ClickInventoryEvent implements Listener {

    private static final Logger logger = CRDisplay.pluginInstance.getLogger();
    private static Inventory previousInventory;

    private void openInventory(Player player, Inventory currentInventory, Inventory targetInventory) {
        previousInventory = currentInventory;
        player.openInventory(targetInventory);
    }

    private void openRecipeInventory(Player player, Inventory currentInventory, BaseRecipe recipe) {
        previousInventory = currentInventory;
        CraftingDisplayGUI.setRecipe(player, recipe);
        player.openInventory(CraftingDisplayGUI.getPlayerSpecificGUI(player));
    }

    @EventHandler
    public void onInventoryClick(final InventoryClickEvent inventoryClickEvent) {
        if (inventoryClickEvent.getInventory() == null || inventoryClickEvent.getClickedInventory() == null) {
            logger.warning("Null inventory detected");
            return;
        }

        final Player player = (Player) inventoryClickEvent.getWhoClicked();
        final Inventory clickedInventory = inventoryClickEvent.getClickedInventory();
        final int clickedSlot = inventoryClickEvent.getRawSlot();
        final ItemStack clickedItem = inventoryClickEvent.getCurrentItem();

        if (!clickedInventory.equals(BaseInventoryGUI.getBaseInventory()) &&
                !clickedInventory.equals(UniversalDyeingInventoryGUI.getBaseInventory()) &&
                !clickedInventory.equals(CraftingDisplayGUI.getPlayerSpecificGUI(player))&&
                !clickedInventory.equals(CoralInventoryGUI.getBaseInventory()) &&
                !clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player))

        ) return;

        inventoryClickEvent.setCancelled(true);

        if (clickedItem == null || clickedItem.getType().isAir())
            return;

        /// Base Inventory Categories

        if (clickedInventory.equals(BaseInventoryGUI.getBaseInventory())) {
            switch (clickedSlot) {
                case 10:
                    openInventory(player, clickedInventory, UniversalDyeingInventoryGUI.getBaseInventory());
                    return;
                case 12:
                    openInventory(player, clickedInventory, CoralInventoryGUI.getBaseInventory());
                    return;
                case 14:
                    openInventory(player, clickedInventory, UniversalDyeingInventoryGUI.getBaseInventory());
                    return;
                case 16:
                    MiscItemsInventoryGUI.setCurrentPage(player, 1);
                    MiscItemsInventoryGUI.refreshInventory(player);
                    openInventory(player, clickedInventory, MiscItemsInventoryGUI.getBaseInventory(player));
                    return;
            }
        }


        /// Universal Dyeing Items
        if (clickedInventory.equals(UniversalDyeingInventoryGUI.getBaseInventory())) {
            switch (clickedSlot) {
                case 20:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createWoolRecipe());
                    return;
                case 21:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createCandleRecipe());
                    return;
                case 22:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createGlassRecipe());
                    return;
                case 23:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createBedRecipe());
                    return;
                case 24:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createTerracottaRecipe());
                    return;
                case 29:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createConcretePowderRecipe());
                    return;
                case 31:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createGlassPaneRecipe());
                    return;
                case 33:
                    openRecipeInventory(player, clickedInventory, UniversalDyeingRecipes.createGlazedTerracottaRecipe());
                    return;
            }
        }

        /// Coral Items
        if (clickedInventory.equals(CoralInventoryGUI.getBaseInventory())) {
            switch (clickedSlot) {
                case 12:
                    openRecipeInventory(player, clickedInventory, CoralRecipes.createCoralFanRecipe());
                    return;
                case 14:
                    openRecipeInventory(player, clickedInventory, CoralRecipes.createDeadCoralFanRecipe());
                    return;
            }
        }
        /// Misc Items page 1
        if (clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player)) && MiscItemsInventoryGUI.getPlayerPage(player).equals(1)) {
            switch (clickedSlot) {
                case 10:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createCalciteRecipe());
                    return;
                case 12:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createGildedBlackstoneRecipe());
                    return;
                case 14:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createPotterySherdRecipe());
                    return;
                case 16:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createRedSandRecipe());
                    return;
                case 20:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createBundleRecipe());
                    return;
                case 24:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createInkSacRecipe());
                    return;
                case 28:
                    openRecipeInventory(player, clickedInventory, WandRecipes.createItemFrameWandRecipe());
                    return;
                case 30:
                    openRecipeInventory(player, clickedInventory, WandRecipes.createArmorStandWandRecipe());
                    return;
                case 32:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createRootedDirtRecipe());
                    return;
                case 34:
                    openRecipeInventory(player, clickedInventory, MiscItemRecipes.createRedSandstoneRecipe());
                    return;
                case 38:
                    openRecipeInventory(player, clickedInventory, DispenserRecipes.createDispenserRecipe());
                    return;
                case 42:
                    openRecipeInventory(player, clickedInventory, DispenserRecipes.createAltDispenserRecipe());
                    return;
                case 53:
                    // Set to page 2
                    MiscItemsInventoryGUI.setCurrentPage(player, 2);
                    MiscItemsInventoryGUI.refreshInventory(player);
                    return;
            }
        }

        /// Misc items page 2
        if (clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player)) && MiscItemsInventoryGUI.getPlayerPage(player).equals(2)) {
            switch (clickedSlot) {
                case 10:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createWoolToStringRecipe());
                    return;
                case 12:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createQuartzBlockToQuartzRecipe());
                    return;
                case 14:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createBlueIceToPackedIceRecipe());
                    return;
                case 16:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createPackedIceToIceRecipe());
                    return;
                case 20:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createNetherWartBlockToNetherWartRecipe());
                    return;
                case 24:
                    openRecipeInventory(player, clickedInventory, UncraftingRecipes.createAmethystBlockToAmethystShardRecipe());
                    return;
                case 45:
                    // Set to page 1
                    MiscItemsInventoryGUI.setCurrentPage(player, 1);
                    MiscItemsInventoryGUI.refreshInventory(player);
                    return;
            }
        }

        // Back buttons
        if (clickedInventory.equals(CraftingDisplayGUI.getPlayerSpecificGUI(player)) && clickedSlot == 40) {
            if (previousInventory == null) {
                previousInventory = BaseInventoryGUI.getBaseInventory(); // Default to a known inventory
            }
            player.openInventory(previousInventory);
            return;
        }
        // Universal Dyeing Base > Base
        if (clickedInventory.equals(UniversalDyeingInventoryGUI.getBaseInventory()) && clickedSlot == 49) {
            player.openInventory(BaseInventoryGUI.getBaseInventory());
            return;
        }
        // Coral Base > Base
        if (clickedInventory.equals(CoralInventoryGUI.getBaseInventory()) && clickedSlot == 22) {
            player.openInventory(BaseInventoryGUI.getBaseInventory());
            return;
        }
        // Misc Items Base > Base
        if (clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player)) && clickedSlot == 49) {
            player.openInventory(BaseInventoryGUI.getBaseInventory());
            return;
        }

        if (clickedInventory.equals(BaseInventoryGUI.getBaseInventory()) && clickedSlot > 26) return;
        if (clickedInventory.equals(UniversalDyeingInventoryGUI.getBaseInventory()) && clickedSlot > 53) return;
        if (clickedInventory.equals(CraftingDisplayGUI.getPlayerSpecificGUI(player)) && clickedSlot > 44) return;
        if (clickedInventory.equals(CoralInventoryGUI.getBaseInventory()) && clickedSlot > 26) return;
        if (clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player)) && clickedSlot > 53) return;

        logger.info(String.format("Final slot message sent: You clicked slot: %d", clickedSlot));
    }

    @EventHandler
    public void onInventoryDrag(final InventoryDragEvent inventoryDragEvent) {
        if (inventoryDragEvent.getInventory() == null) return;

        Inventory clickedInventory = inventoryDragEvent.getInventory();
        Player player = (Player) inventoryDragEvent.getWhoClicked();
        if (clickedInventory.equals(UniversalDyeingInventoryGUI.getBaseInventory()) ||
                clickedInventory.equals(BaseInventoryGUI.getBaseInventory()) ||
                clickedInventory.equals(CraftingDisplayGUI.getPlayerSpecificGUI(player)) ||
                clickedInventory.equals(CoralInventoryGUI.getBaseInventory()) ||
                clickedInventory.equals(MiscItemsInventoryGUI.getBaseInventory(player))
        ) inventoryDragEvent.setCancelled(true);
    }
}
