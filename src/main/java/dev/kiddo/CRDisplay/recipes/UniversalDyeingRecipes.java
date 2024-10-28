package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversalDyeingRecipes {

    // Method to create a wool recipe
    public static BaseRecipe createWoolRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.WHITE_WOOL),
                new ItemStack(Material.BLUE_DYE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.BLUE_WOOL, 1); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createCandleRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CANDLE),
                new ItemStack(Material.WHITE_CANDLE),
                new ItemStack(Material.WHITE_CANDLE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CANDLE),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_CANDLE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CANDLE),
                new ItemStack(Material.WHITE_CANDLE),
                new ItemStack(Material.WHITE_CANDLE)
        ));

        ItemStack result = new ItemStack(Material.BLUE_CANDLE, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createGlassRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS),
                new ItemStack(Material.WHITE_STAINED_GLASS),
                new ItemStack(Material.WHITE_STAINED_GLASS)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_STAINED_GLASS)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS),
                new ItemStack(Material.WHITE_STAINED_GLASS),
                new ItemStack(Material.WHITE_STAINED_GLASS)
        ));

        ItemStack result = new ItemStack(Material.BLUE_STAINED_GLASS, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createGlassPaneRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE),
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE),
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE),
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE),
                new ItemStack(Material.WHITE_STAINED_GLASS_PANE)
        ));

        ItemStack result = new ItemStack(Material.BLUE_STAINED_GLASS_PANE, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createConcretePowderRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CONCRETE_POWDER),
                new ItemStack(Material.WHITE_CONCRETE_POWDER),
                new ItemStack(Material.WHITE_CONCRETE_POWDER)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CONCRETE_POWDER),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_CONCRETE_POWDER)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_CONCRETE_POWDER),
                new ItemStack(Material.WHITE_CONCRETE_POWDER),
                new ItemStack(Material.WHITE_CONCRETE_POWDER)
        ));

        ItemStack result = new ItemStack(Material.BLUE_CONCRETE_POWDER, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createBedRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.WHITE_BED),
                new ItemStack(Material.BLUE_DYE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.BLUE_BED, 1); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createTerracottaRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_TERRACOTTA),
                new ItemStack(Material.WHITE_TERRACOTTA),
                new ItemStack(Material.WHITE_TERRACOTTA)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_TERRACOTTA),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_TERRACOTTA)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_TERRACOTTA),
                new ItemStack(Material.WHITE_TERRACOTTA),
                new ItemStack(Material.WHITE_TERRACOTTA)
        ));

        ItemStack result = new ItemStack(Material.BLUE_TERRACOTTA, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }

    public static BaseRecipe createGlazedTerracottaRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
                new ItemStack(Material.BLUE_DYE),
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA),
                new ItemStack(Material.WHITE_GLAZED_TERRACOTTA)
        ));

        ItemStack result = new ItemStack(Material.BLUE_GLAZED_TERRACOTTA, 8); // Resulting item

        return new BaseRecipe(layout, result, "UniversalDyeing");
    }
}
