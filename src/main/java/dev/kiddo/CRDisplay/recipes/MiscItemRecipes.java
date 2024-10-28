package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiscItemRecipes {

    public static BaseRecipe createCalciteRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.DIORITE),
                new ItemStack(Material.BONE_BLOCK)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.CALCITE, 2); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createGildedBlackstoneRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.BLACKSTONE),
                new ItemStack(Material.GOLD_NUGGET)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLD_NUGGET)
        ));

        ItemStack result = new ItemStack(Material.GILDED_BLACKSTONE, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createPotterySherdRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.BRICK),
                new ItemStack(Material.ARMS_UP_POTTERY_SHERD),
                new ItemStack(Material.BRICK)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.BRICK),
                new ItemStack(Material.DIAMOND),
                new ItemStack(Material.BRICK)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.BRICK),
                new ItemStack(Material.BRICK),
                new ItemStack(Material.BRICK)
        ));

        ItemStack result = new ItemStack(Material.ARMS_UP_POTTERY_SHERD, 2); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createRedSandRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.SAND),
                new ItemStack(Material.SAND),
                new ItemStack(Material.SAND)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.SAND),
                new ItemStack(Material.RED_DYE),
                new ItemStack(Material.SAND)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.SAND),
                new ItemStack(Material.SAND),
                new ItemStack(Material.SAND)
        ));

        ItemStack result = new ItemStack(Material.RED_SAND, 8); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createRedSandstoneRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.SANDSTONE),
                new ItemStack(Material.SANDSTONE),
                new ItemStack(Material.SANDSTONE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.SANDSTONE),
                new ItemStack(Material.RED_DYE),
                new ItemStack(Material.SANDSTONE)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.SANDSTONE),
                new ItemStack(Material.SANDSTONE),
                new ItemStack(Material.SANDSTONE)
        ));

        ItemStack result = new ItemStack(Material.RED_SANDSTONE, 8); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createRootedDirtRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.DIRT),
                new ItemStack(Material.HANGING_ROOTS)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.ROOTED_DIRT, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createBundleRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.STRING),
                new ItemStack(Material.LEATHER),
                new ItemStack(Material.STRING)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.LEATHER),
                new ItemStack(Material.AIR),
                new ItemStack(Material.LEATHER)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.LEATHER),
                new ItemStack(Material.LEATHER),
                new ItemStack(Material.LEATHER)
        ));

        ItemStack result = new ItemStack(Material.BUNDLE, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createInkSacRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.COAL),
                new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.BONE_MEAL)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.INK_SAC, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }


}
