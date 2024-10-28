package dev.kiddo.CRDisplay.recipes;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class BaseRecipe {
    private final List<List<ItemStack>> layout;
    private final ItemStack result;
    private final String category;

    public BaseRecipe(List<List<ItemStack>> layout, ItemStack result, String category) {
        this.layout = layout;
        this.result = result;
        this.category = category;
    }

    public List<List<ItemStack>> getLayout() {
        return layout;
    }

    public ItemStack getResult() {
        return result;
    }

    public String getCategory() { return category; }
}
