package dev.kiddo.CRDisplay.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItemUtils {


    public static ItemStack getBlackStainedGlassPane() {
        ItemStack BlackGlassPane = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta itemMeta = BlackGlassPane.getItemMeta();
        itemMeta.displayName(Component.empty());
        BlackGlassPane.setItemMeta(itemMeta);
        return BlackGlassPane;
    }

    public static ItemStack getBackButton() {
        ItemStack backButton = new ItemStack(Material.BARRIER);
        ItemMeta backButtonMeta = backButton.getItemMeta();
        backButtonMeta.displayName(Component.text("Back", NamedTextColor.RED, TextDecoration.BOLD));
        backButton.setItemMeta(backButtonMeta);
        return backButton;
    }

    public static ItemStack getUniversalDyeingInformation() {
        ItemStack informationItem = new ItemStack(Material.PAPER);
        ItemMeta informationItemMeta = informationItem.getItemMeta();
        informationItemMeta.displayName(Component.text("Universal Dyeing", NamedTextColor.BLUE, TextDecoration.BOLD));

        List<Component> lore = new ArrayList<>();
        lore.add(Component.text("Applies to all 16 dye colors", NamedTextColor.GRAY));
        lore.add(Component.text("and can be used on any dyeable item, excluding concrete.", NamedTextColor.GRAY));
        lore.add(Component.text("Blue is used as an example.", NamedTextColor.GRAY));

        informationItemMeta.lore(lore);

        informationItem.setItemMeta(informationItemMeta);
        return informationItem;
    }

    public static ItemStack getCoralCraftingInformation() {
        ItemStack informationItem = new ItemStack(Material.PAPER);
        ItemMeta informationItemMeta = informationItem.getItemMeta();
        informationItemMeta.displayName(Component.text("Coral Crafting", NamedTextColor.BLUE, TextDecoration.BOLD));

        List<Component> lore = new ArrayList<>();
        lore.add(Component.text("Applies to all forms of coral.", NamedTextColor.GRAY));
        lore.add(Component.text("Tube Fan is used as an example.", NamedTextColor.GRAY));

        informationItemMeta.lore(lore);

        informationItem.setItemMeta(informationItemMeta);
        return informationItem;
    }


    public static ItemStack createInventoryItem(final Object item, final Component itemName, final String... itemLore) {
        final ItemStack itemStack;

        // Check if the provided item is a Material or ItemStack
        if (item instanceof Material) {
            itemStack = new ItemStack((Material) item, 1);
        } else if (item instanceof ItemStack) {
            itemStack = (ItemStack) item;
        } else {
            throw new IllegalArgumentException("The first parameter must be either a Material or an ItemStack.");
        }

        final ItemMeta itemMeta = itemStack.getItemMeta();

        // Set item name if provided, else set it to null
        itemMeta.displayName(itemName);

        // Set item lore if provided
        if (itemLore != null && itemLore.length > 0) {
            itemMeta.lore(Arrays.asList(
                    Arrays.stream(itemLore)
                            .map(lore -> Component.text(lore).decoration(TextDecoration.ITALIC, false))
                            .toArray(Component[]::new)
            ));
        }

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

}
