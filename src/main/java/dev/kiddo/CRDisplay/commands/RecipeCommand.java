/* Licensed under the <LICENSE> */
package dev.kiddo.CRDisplay.commands;

import dev.kiddo.CRDisplay.inventories.BaseInventoryGUI;
import dev.kiddo.CRDisplay.inventories.MiscItemsInventoryGUI;
import dev.kiddo.CRDisplay.inventories.UniversalDyeingInventoryGUI;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.incendo.cloud.annotations.Argument;
import org.incendo.cloud.annotations.Command;
import org.incendo.cloud.annotations.CommandDescription;
import org.incendo.cloud.annotations.suggestion.Suggestions;
import org.jspecify.annotations.NonNull;

import java.util.List;

public class RecipeCommand {

  private static final List<String> PAGES = List.of("universaldyeing", "default", "misc", "copper");

  @Command("cr|recipes|customrecipes [page]")
  @CommandDescription("View our custom recipes in game.")
  @SuppressWarnings({"unused", "UnstableApiUsage"})
  public void recipeCommand(CommandSourceStack sourceStack, @Argument(value = "page", suggestions = "pages") String page) {
    CommandSender sender = sourceStack.getSender();
    if (!(sender instanceof Player player)) {
      sender.sendMessage("You must be a player to use this command.");
      return;
    }
    if (page == null || page.equalsIgnoreCase("default")) {
      player.openInventory(BaseInventoryGUI.getBaseInventory());
      return;
    }
    if (page.equalsIgnoreCase("universaldyeing")) {
      player.openInventory(UniversalDyeingInventoryGUI.getBaseInventory());
      return;
    }
    if (page.equalsIgnoreCase("misc")) {
      MiscItemsInventoryGUI.setCurrentPage(player, 1);
      player.openInventory(MiscItemsInventoryGUI.getBaseInventory(player));
      return;
    }
    if (page.equalsIgnoreCase("copper")) {
      player.openInventory(MiscItemsInventoryGUI.getBaseInventory(player));
    }
  }

  @Suggestions("pages")
  public @NonNull List<String> suggestPages() {
    return PAGES;
  }


}
