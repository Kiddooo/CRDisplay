package dev.kiddo.CRDisplay.recipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UncraftingRecipes {

    public static BaseRecipe createWoolToStringRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.BLUE_WOOL),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.STRING, 4); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }

    public static BaseRecipe createQuartzBlockToQuartzRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.QUARTZ_BLOCK),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.QUARTZ, 4); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }

    public static BaseRecipe createBlueIceToPackedIceRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.BLUE_ICE),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.PACKED_ICE, 9); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }

    public static BaseRecipe createPackedIceToIceRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.PACKED_ICE),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.ICE, 9); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }

    public static BaseRecipe createNetherWartBlockToNetherWartRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.NETHER_WART_BLOCK),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.NETHER_WART, 9); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }

    public static BaseRecipe createAmethystBlockToAmethystShardRecipe() {
        List<List<ItemStack>> layout = new ArrayList<>();
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AMETHYST_BLOCK),
                new ItemStack(Material.AIR)
        ));
        layout.add(Arrays.asList(
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),
                new ItemStack(Material.AIR)
        ));

        ItemStack result = new ItemStack(Material.AMETHYST_SHARD, 4); // Resulting item

        return new BaseRecipe(layout, result, "Uncrafting");
    }
}
