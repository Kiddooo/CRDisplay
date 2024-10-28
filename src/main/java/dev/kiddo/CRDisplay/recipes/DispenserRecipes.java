package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DispenserRecipes {

    public static BaseRecipe createDispenserRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.STICK),
                new ItemStack(Material.STRING)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.STICK),
                new ItemStack(Material.DROPPER),
                new ItemStack(Material.STRING)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.STICK),
                new ItemStack(Material.STRING)
        ));

        ItemStack result = new ItemStack(Material.DISPENSER, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }

    public static BaseRecipe createAltDispenserRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.STRING),
                new ItemStack(Material.STICK),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.STRING),
                new ItemStack(Material.DROPPER),
                new ItemStack(Material.STICK)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.STRING),
                new ItemStack(Material.STICK),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.DISPENSER, 1); // Resulting item

        return new BaseRecipe(layout, result, "Misc");
    }
}
