/* Licensed under the <LICENSE> */
package dev.kiddo.CRDisplay;

import dev.kiddo.CRDisplay.commands.RecipeCommand;
import dev.kiddo.CRDisplay.event.ClickInventoryEvent;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.incendo.cloud.annotations.AnnotationParser;
import org.incendo.cloud.execution.ExecutionCoordinator;
import org.incendo.cloud.paper.PaperCommandManager;

public final class CRDisplay extends JavaPlugin {

  public static CRDisplay pluginInstance;
  public static PaperCommandManager<CommandSourceStack> commandManager;
  public static AnnotationParser<CommandSourceStack> annotationParser;

  @Override
  public void onEnable() {

    // Defines a variable of the plugin that can be accessed in other classes.
    pluginInstance = this;

    // Creates the command manager and annotation parser.
    commandManager =
        PaperCommandManager.builder()
            .executionCoordinator(ExecutionCoordinator.simpleCoordinator())
            .buildOnEnable(this);

    annotationParser = new AnnotationParser<>(commandManager, CommandSourceStack.class);

    // Parse the example command with our annotation parser.
    annotationParser.parse(new RecipeCommand());

    // Register the player join event.
    getServer().getPluginManager().registerEvents(new ClickInventoryEvent(), this);

    // Log that the plugin has been enabled.
    getLogger().info("Plugin has been enabled!");

  }

  @Override
  public void onDisable() {
    // Log that the plugin has been disabled.
    getLogger().info("Plugin has been disabled!");
  }
}
