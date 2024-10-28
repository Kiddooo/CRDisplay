package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoralRecipes {

    public static BaseRecipe createDeadCoralFanRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.DEAD_TUBE_CORAL_FAN),
                new ItemStack(Material.DEAD_TUBE_CORAL_FAN)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.DEAD_TUBE_CORAL_FAN),
                new ItemStack(Material.DEAD_TUBE_CORAL_FAN)
        ));

        ItemStack result = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK, 1); // Resulting item

        return new BaseRecipe(layout, result, "Coral");
    }

    public static BaseRecipe createCoralFanRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.TUBE_CORAL_FAN),
                new ItemStack(Material.TUBE_CORAL_FAN)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.TUBE_CORAL_FAN),
                new ItemStack(Material.TUBE_CORAL_FAN)
        ));

        ItemStack result = new ItemStack(Material.TUBE_CORAL_BLOCK, 1); // Resulting item

        return new BaseRecipe(layout, result, "Coral");
    }
}
