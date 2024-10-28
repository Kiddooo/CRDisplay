package dev.kiddo.CRDisplay.inventories;

import dev.kiddo.CRDisplay.recipes.BaseRecipe;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

import static dev.kiddo.CRDisplay.utils.InventoryHelper.fillWithDefaultItems;
import static dev.kiddo.CRDisplay.utils.ItemUtils.*;

public class CraftingDisplayGUI {

    private static final WeakHashMap<UUID, Inventory> playerGuiInstances = new WeakHashMap<>();

    private static final Component INVENTORY_TITLE = Component.text("Crafting Display", NamedTextColor.GREEN);

    private static final int INVENTORY_SIZE = 45;
    private static final int RESULT_SLOT = 24;
    private static final int BACK_BUTTON_SLOT = 40;
    private static final int INFORMATION_SLOT = 31;


    // Define the specific slots for the recipe
    private static final List<Integer> recipeSlots = Arrays.asList(10, 11, 12, 19, 20, 21, 28, 29, 30);

    public static Inventory getPlayerSpecificGUI(Player player) {
        UUID playerId = player.getUniqueId();
        playerGuiInstances.computeIfAbsent(playerId, id -> Bukkit.createInventory(player, INVENTORY_SIZE, INVENTORY_TITLE));
        return playerGuiInstances.get(playerId);
    }

    public static void setRecipe(Player player, BaseRecipe recipe) {

        Inventory playerGui = getPlayerSpecificGUI(player);
        playerGui.clear();

        // Index to track the position in the recipe layout
        int slotIndex = 0;
        for (List<ItemStack> row : recipe.getLayout()) {
            for (ItemStack itemStack : row) {
                if (slotIndex < recipeSlots.size()) {
                    int slot = recipeSlots.get(slotIndex);

                    if (itemStack.getType() != Material.AIR) {
                        playerGui.setItem(slot, itemStack);
                    }
                    slotIndex++;
                }
            }
        }

        playerGui.setItem(RESULT_SLOT, recipe.getResult());
        playerGui.setItem(BACK_BUTTON_SLOT, getBackButton());
        if (recipe.getCategory().equals("UniversalDyeing")) playerGui.setItem(INFORMATION_SLOT, getUniversalDyeingInformation());
        if (recipe.getCategory().equals("Coral")) playerGui.setItem(INFORMATION_SLOT, getCoralCraftingInformation());

        fillWithDefaultItems(playerGui, INVENTORY_SIZE, recipeSlots);
    }
}
