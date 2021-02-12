package com.androsa.undeco;

import com.androsa.ornamental.builder.OrnamentBuilder;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class UDBuilders {

    public static final OrnamentBuilder OAK_PLANKS = createPlankOrnament("oak", MaterialColor.WOOD);
    public static final OrnamentBuilder SPRUCE_PLANKS = createPlankOrnament("spruce", MaterialColor.OBSIDIAN);
    public static final OrnamentBuilder BIRCH_PLANKS = createPlankOrnament("birch", MaterialColor.SAND);
    public static final OrnamentBuilder JUNGLE_PLANKS = createPlankOrnament("jungle", MaterialColor.DIRT);
    public static final OrnamentBuilder ACACIA_PLANKS = createPlankOrnament("acacia", MaterialColor.ADOBE);
    public static final OrnamentBuilder DARK_OAK_PLANKS = createPlankOrnament("dark_oak", MaterialColor.BROWN);
    public static final OrnamentBuilder CRIMSON_PLANKS = createPlankOrnament("crimson", Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM);
    public static final OrnamentBuilder WARPED_PLANKS = createPlankOrnament("warped", Material.NETHER_WOOD, MaterialColor.WARPED_STEM);
    public static final OrnamentBuilder GRANITE = createStoneOrnament("granite", MaterialColor.DIRT);
    public static final OrnamentBuilder POLISHED_GRANITE = createStoneOrnament("polished_granite", MaterialColor.DIRT);
    public static final OrnamentBuilder DIORITE = createStoneOrnament("diorite", MaterialColor.QUARTZ);
    public static final OrnamentBuilder POLISHED_DIORITE = createStoneOrnament("polished_diorite", MaterialColor.QUARTZ);
    public static final OrnamentBuilder ANDESITE = createStoneOrnament("andesite", MaterialColor.STONE);
    public static final OrnamentBuilder POLISHED_ANDESITE = createStoneOrnament("polished_andesite", MaterialColor.STONE);
    public static final OrnamentBuilder OAK_LOG = createLogOrnament("oak_log", MaterialColor.WOOD);
    public static final OrnamentBuilder SPRUCE_LOG = createLogOrnament("spruce_log", MaterialColor.OBSIDIAN);
    public static final OrnamentBuilder BIRCH_LOG = createLogOrnament("birch_log", MaterialColor.SAND);
    public static final OrnamentBuilder JUNGLE_LOG = createLogOrnament("jungle_log", MaterialColor.DIRT);
    public static final OrnamentBuilder ACACIA_LOG = createLogOrnament("acacia_log", MaterialColor.ADOBE);
    public static final OrnamentBuilder DARK_OAK_LOG = createLogOrnament("dark_oak_log", MaterialColor.BROWN);
    public static final OrnamentBuilder CRIMSON_STEM = createStemOrnament("crimson_stem", MaterialColor.CRIMSON_STEM);
    public static final OrnamentBuilder WARPED_STEM = createStemOrnament("warped_stem", MaterialColor.WARPED_STEM);
    public static final OrnamentBuilder BLACKSTONE = createStoneOrnament("blackstone", MaterialColor.BLACK);
    public static final OrnamentBuilder POLISHED_BLACKSTONE = createStoneOrnament("polished_blackstone", MaterialColor.BLACK);
    public static final OrnamentBuilder STONE = createStoneOrnament("stone", MaterialColor.STONE);
    public static final OrnamentBuilder SMOOTH_STONE = createStoneToughOrnament("smooth_stone", MaterialColor.STONE);
    public static final OrnamentBuilder COBBLESTONE = createStoneToughOrnament("cobblestone", MaterialColor.STONE);
    public static final OrnamentBuilder MOSSY_COBBLESTONE = createStoneToughOrnament("mossy_cobblestone", MaterialColor.STONE);
    public static final OrnamentBuilder SANDSTONE = createSandstoneOrnament("sandstone", MaterialColor.SAND);
    public static final OrnamentBuilder SMOOTH_SANDSTONE = createSandstoneOrnament("smooth_sandstone", MaterialColor.SAND);
    public static final OrnamentBuilder RED_SANDSTONE = createSandstoneOrnament("red_sandstone", MaterialColor.ADOBE);
    public static final OrnamentBuilder SMOOTH_RED_SANDSTONE = createSandstoneOrnament("smooth_red_sandstone", MaterialColor.ADOBE);
    public static final OrnamentBuilder STONE_BRICKS = createStoneOrnament("stone_brick", MaterialColor.STONE);
    public static final OrnamentBuilder CRACKED_STONE_BRICKS = createStoneOrnament("cracked_stone_brick", MaterialColor.STONE);
    public static final OrnamentBuilder MOSSY_STONE_BRICKS = createStoneOrnament("mossy_stone_brick", MaterialColor.STONE);
    public static final OrnamentBuilder PRISMARINE = createStoneOrnament("prismarine", MaterialColor.CYAN);
    public static final OrnamentBuilder PRISMARINE_BRICKS = createStoneOrnament("prismarine_brick", MaterialColor.DIAMOND);
    public static final OrnamentBuilder DARK_PRISMARINE = createStoneOrnament("dark_prismarine", MaterialColor.DIAMOND);
    public static final OrnamentBuilder PURPUR = createStoneOrnament("purpur", MaterialColor.MAGENTA);

    private static OrnamentBuilder createPlankOrnament(String name, MaterialColor color) {
        return createPlankOrnament(name, Material.WOOD, color);
    }

    private static OrnamentBuilder createPlankOrnament(String name, Material material, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(material, color)
                .hardnessAndResistance(2.0F, 3.0F)
                .sound(SoundType.WOOD)
                .tool(ToolType.AXE, false)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150)
                .canOpen();
    }

    private static OrnamentBuilder createStoneOrnament(String name, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(Material.ROCK, color)
                .hardnessAndResistance(1.5F, 6.0F)
                .sound(SoundType.STONE)
                .tool(ToolType.PICKAXE, 0, true);
    }

    private static OrnamentBuilder createStoneToughOrnament(String name, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(Material.ROCK, color)
                .hardnessAndResistance(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .tool(ToolType.PICKAXE, 0, true);
    }

    private static OrnamentBuilder createLogOrnament(String name, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(Material.WOOD, color)
                .hardnessAndResistance(2.0F)
                .sound(SoundType.WOOD)
                .tool(ToolType.AXE, false)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150)
                .canOpen();
    }

    private static OrnamentBuilder createStemOrnament(String name, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(Material.NETHER_WOOD, color)
                .hardnessAndResistance(2.0F)
                .sound(SoundType.HYPHAE)
                .tool(ToolType.AXE, false)
                .burnTime(200, 300, 300, 150, 300, 300, 150, 150)
                .canOpen();
    }

    private static OrnamentBuilder createSandstoneOrnament(String name, MaterialColor color) {
        return new OrnamentBuilder(name)
                .properties(Material.ROCK, color)
                .hardnessAndResistance(0.8F)
                .sound(SoundType.STONE)
                .tool(ToolType.PICKAXE, true);

    }
}
