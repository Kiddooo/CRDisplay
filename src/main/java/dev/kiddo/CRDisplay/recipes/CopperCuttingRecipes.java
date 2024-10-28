package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopperCuttingRecipes {

    public static BaseRecipe createCopperDoorRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.HORN_CORAL),
                new ItemStack(Material.HORN_CORAL)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.HORN_CORAL),
                new ItemStack(Material.HORN_CORAL)
        ));

        ItemStack result = new ItemStack(Material.HORN_CORAL_BLOCK, 3); // Resulting item

        return new BaseRecipe(layout, result, "Copper");
    }

    public static BaseRecipe createCopperTrapDoorRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.HORN_CORAL),
                new ItemStack(Material.HORN_CORAL)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.HORN_CORAL),
                new ItemStack(Material.HORN_CORAL)
        ));

        ItemStack result = new ItemStack(Material.HORN_CORAL_BLOCK, 6); // Resulting item

        return new BaseRecipe(layout, result, "Copper");
    }

}
