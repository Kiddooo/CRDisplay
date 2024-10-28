package dev.kiddo.CRDisplay.recipes;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WandRecipes {

    public static ItemStack getItemFrameWandItem() {
        ItemStack result = new ItemStack(Material.WOODEN_HOE, 1); // Resulting item
        ItemMeta itemMeta = result.getItemMeta();

        itemMeta.displayName(Component.text("Item Frame Wand", NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        itemMeta.lore(Arrays.asList(Component.text("Now you see me,", NamedTextColor.DARK_GREEN).decoration(TextDecoration.ITALIC, false), Component.text("now you don't", NamedTextColor.RED).decoration(TextDecoration.ITALIC, false)));
        itemMeta.addEnchant(Enchantment.MENDING, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        result.setItemMeta(itemMeta);

        return result;
    }

    public static ItemStack getArmorStandWandItem() {
        ItemStack result = new ItemStack(Material.WOODEN_SWORD, 1); // Resulting item
        ItemMeta itemMeta = result.getItemMeta();

        itemMeta.displayName(Component.text("Armor Stand Wand", NamedTextColor.GOLD).decoration(TextDecoration.ITALIC, false));
        itemMeta.lore(List.of(Component.text("Controlling the moves!", NamedTextColor.DARK_PURPLE).decoration(TextDecoration.ITALIC, false)));
        itemMeta.addEnchant(Enchantment.MENDING, 1, false);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);

        result.setItemMeta(itemMeta);

        return result;
    }

    public static BaseRecipe createArmorStandWandRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.DIAMOND),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.ARMOR_STAND),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.STICK),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));



        return new BaseRecipe(layout, getArmorStandWandItem(), "Misc");
    }

    public static BaseRecipe createItemFrameWandRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.DIAMOND),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.ITEM_FRAME),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.STICK),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        return new BaseRecipe(layout, getItemFrameWandItem(), "Misc");
    }
}
