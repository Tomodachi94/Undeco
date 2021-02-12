package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentLootTableProvider;
import com.androsa.undeco.ModBlocks;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class UDLootTables extends LootTableProvider {

    public UDLootTables(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "Ornamental: Unusually Decorative Loot Tables";
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(UDLootTables.BlockTables::new, LootParameterSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
    }

    public static class BlockTables extends OrnamentLootTableProvider {

        @Override
        protected void addTables() {
            dropSelf(ModBlocks.oak_log_stairs);
            dropSelf(ModBlocks.spruce_log_stairs);
            dropSelf(ModBlocks.birch_log_stairs);
            dropSelf(ModBlocks.jungle_log_stairs);
            dropSelf(ModBlocks.acacia_log_stairs);
            dropSelf(ModBlocks.dark_oak_log_stairs);
            dropSelf(ModBlocks.crimson_stem_stairs);
            dropSelf(ModBlocks.warped_stem_stairs);
            dropSelf(ModBlocks.smooth_stone_stairs);
            dropSelf(ModBlocks.cracked_stone_brick_stairs);

            dropSlab(ModBlocks.oak_log_slab);
            dropSlab(ModBlocks.spruce_log_slab);
            dropSlab(ModBlocks.birch_log_slab);
            dropSlab(ModBlocks.jungle_log_slab);
            dropSlab(ModBlocks.acacia_log_slab);
            dropSlab(ModBlocks.dark_oak_log_slab);
            dropSlab(ModBlocks.crimson_stem_slab);
            dropSlab(ModBlocks.warped_stem_slab);
            dropSlab(ModBlocks.cracked_stone_brick_slab);

            dropSelf(ModBlocks.granite_fence);
            dropSelf(ModBlocks.polished_granite_fence);
            dropSelf(ModBlocks.diorite_fence);
            dropSelf(ModBlocks.polished_diorite_fence);
            dropSelf(ModBlocks.andesite_fence);
            dropSelf(ModBlocks.polished_andesite_fence);
            dropSelf(ModBlocks.oak_log_fence);
            dropSelf(ModBlocks.spruce_log_fence);
            dropSelf(ModBlocks.birch_log_fence);
            dropSelf(ModBlocks.jungle_log_fence);
            dropSelf(ModBlocks.acacia_log_fence);
            dropSelf(ModBlocks.dark_oak_log_fence);
            dropSelf(ModBlocks.crimson_stem_fence);
            dropSelf(ModBlocks.warped_stem_fence);
            dropSelf(ModBlocks.blackstone_fence);
            dropSelf(ModBlocks.polished_blackstone_fence);
            dropSelf(ModBlocks.stone_fence);
            dropSelf(ModBlocks.smooth_stone_fence);
            dropSelf(ModBlocks.cobblestone_fence);
            dropSelf(ModBlocks.mossy_cobblestone_fence);
            dropSelf(ModBlocks.sandstone_fence);
            dropSelf(ModBlocks.smooth_sandstone_fence);
            dropSelf(ModBlocks.red_sandstone_fence);
            dropSelf(ModBlocks.smooth_red_sandstone_fence);
            dropSelf(ModBlocks.stone_brick_fence);
            dropSelf(ModBlocks.cracked_stone_brick_fence);
            dropSelf(ModBlocks.mossy_stone_brick_fence);
            dropSelf(ModBlocks.prismarine_fence);
            dropSelf(ModBlocks.prismarine_brick_fence);
            dropSelf(ModBlocks.dark_prismarine_fence);
            dropSelf(ModBlocks.purpur_fence);

            dropSelf(ModBlocks.granite_trapdoor);
            dropSelf(ModBlocks.polished_granite_trapdoor);
            dropSelf(ModBlocks.diorite_trapdoor);
            dropSelf(ModBlocks.polished_diorite_trapdoor);
            dropSelf(ModBlocks.andesite_trapdoor);
            dropSelf(ModBlocks.polished_andesite_trapdoor);
            dropSelf(ModBlocks.oak_log_trapdoor);
            dropSelf(ModBlocks.spruce_log_trapdoor);
            dropSelf(ModBlocks.birch_log_trapdoor);
            dropSelf(ModBlocks.jungle_log_trapdoor);
            dropSelf(ModBlocks.acacia_log_trapdoor);
            dropSelf(ModBlocks.dark_oak_log_trapdoor);
            dropSelf(ModBlocks.crimson_stem_trapdoor);
            dropSelf(ModBlocks.warped_stem_trapdoor);
            dropSelf(ModBlocks.blackstone_trapdoor);
            dropSelf(ModBlocks.polished_blackstone_trapdoor);
            dropSelf(ModBlocks.stone_trapdoor);
            dropSelf(ModBlocks.smooth_stone_trapdoor);
            dropSelf(ModBlocks.cobblestone_trapdoor);
            dropSelf(ModBlocks.mossy_cobblestone_trapdoor);
            dropSelf(ModBlocks.sandstone_trapdoor);
            dropSelf(ModBlocks.smooth_sandstone_trapdoor);
            dropSelf(ModBlocks.red_sandstone_trapdoor);
            dropSelf(ModBlocks.smooth_red_sandstone_trapdoor);
            dropSelf(ModBlocks.stone_brick_trapdoor);
            dropSelf(ModBlocks.cracked_stone_brick_trapdoor);
            dropSelf(ModBlocks.mossy_stone_brick_trapdoor);
            dropSelf(ModBlocks.prismarine_trapdoor);
            dropSelf(ModBlocks.prismarine_brick_trapdoor);
            dropSelf(ModBlocks.dark_prismarine_trapdoor);
            dropSelf(ModBlocks.purpur_trapdoor);

            dropSelf(ModBlocks.granite_fence_gate);
            dropSelf(ModBlocks.polished_granite_fence_gate);
            dropSelf(ModBlocks.diorite_fence_gate);
            dropSelf(ModBlocks.polished_diorite_fence_gate);
            dropSelf(ModBlocks.andesite_fence_gate);
            dropSelf(ModBlocks.polished_andesite_fence_gate);
            dropSelf(ModBlocks.oak_log_fence_gate);
            dropSelf(ModBlocks.spruce_log_fence_gate);
            dropSelf(ModBlocks.birch_log_fence_gate);
            dropSelf(ModBlocks.jungle_log_fence_gate);
            dropSelf(ModBlocks.acacia_log_fence_gate);
            dropSelf(ModBlocks.dark_oak_log_fence_gate);
            dropSelf(ModBlocks.crimson_stem_fence_gate);
            dropSelf(ModBlocks.warped_stem_fence_gate);
            dropSelf(ModBlocks.blackstone_fence_gate);
            dropSelf(ModBlocks.polished_blackstone_fence_gate);
            dropSelf(ModBlocks.stone_fence_gate);
            dropSelf(ModBlocks.smooth_stone_fence_gate);
            dropSelf(ModBlocks.cobblestone_fence_gate);
            dropSelf(ModBlocks.mossy_cobblestone_fence_gate);
            dropSelf(ModBlocks.sandstone_fence_gate);
            dropSelf(ModBlocks.smooth_sandstone_fence_gate);
            dropSelf(ModBlocks.red_sandstone_fence_gate);
            dropSelf(ModBlocks.smooth_red_sandstone_fence_gate);
            dropSelf(ModBlocks.stone_brick_fence_gate);
            dropSelf(ModBlocks.cracked_stone_brick_fence_gate);
            dropSelf(ModBlocks.mossy_stone_brick_fence_gate);
            dropSelf(ModBlocks.prismarine_fence_gate);
            dropSelf(ModBlocks.prismarine_brick_fence_gate);
            dropSelf(ModBlocks.dark_prismarine_fence_gate);
            dropSelf(ModBlocks.purpur_fence_gate);

            dropDoor(ModBlocks.granite_door);
            dropDoor(ModBlocks.polished_granite_door);
            dropDoor(ModBlocks.diorite_door);
            dropDoor(ModBlocks.polished_diorite_door);
            dropDoor(ModBlocks.andesite_door);
            dropDoor(ModBlocks.polished_andesite_door);
            dropDoor(ModBlocks.oak_log_door);
            dropDoor(ModBlocks.spruce_log_door);
            dropDoor(ModBlocks.birch_log_door);
            dropDoor(ModBlocks.jungle_log_door);
            dropDoor(ModBlocks.acacia_log_door);
            dropDoor(ModBlocks.dark_oak_log_door);
            dropDoor(ModBlocks.crimson_stem_door);
            dropDoor(ModBlocks.warped_stem_door);
            dropDoor(ModBlocks.blackstone_door);
            dropDoor(ModBlocks.polished_blackstone_door);
            dropDoor(ModBlocks.stone_door);
            dropDoor(ModBlocks.smooth_stone_door);
            dropDoor(ModBlocks.cobblestone_door);
            dropDoor(ModBlocks.mossy_cobblestone_door);
            dropDoor(ModBlocks.sandstone_door);
            dropDoor(ModBlocks.smooth_sandstone_door);
            dropDoor(ModBlocks.red_sandstone_door);
            dropDoor(ModBlocks.smooth_red_sandstone_door);
            dropDoor(ModBlocks.stone_brick_door);
            dropDoor(ModBlocks.cracked_stone_brick_door);
            dropDoor(ModBlocks.mossy_stone_brick_door);
            dropDoor(ModBlocks.prismarine_door);
            dropDoor(ModBlocks.prismarine_brick_door);
            dropDoor(ModBlocks.dark_prismarine_door);
            dropDoor(ModBlocks.purpur_door);

            dropPole(ModBlocks.oak_pole);
            dropPole(ModBlocks.spruce_pole);
            dropPole(ModBlocks.birch_pole);
            dropPole(ModBlocks.jungle_pole);
            dropPole(ModBlocks.acacia_pole);
            dropPole(ModBlocks.dark_oak_pole);
            dropPole(ModBlocks.crimson_pole);
            dropPole(ModBlocks.warped_pole);
            dropPole(ModBlocks.granite_pole);
            dropPole(ModBlocks.polished_granite_pole);
            dropPole(ModBlocks.diorite_pole);
            dropPole(ModBlocks.polished_diorite_pole);
            dropPole(ModBlocks.andesite_pole);
            dropPole(ModBlocks.polished_andesite_pole);
            dropPole(ModBlocks.oak_log_pole);
            dropPole(ModBlocks.spruce_log_pole);
            dropPole(ModBlocks.birch_log_pole);
            dropPole(ModBlocks.jungle_log_pole);
            dropPole(ModBlocks.acacia_log_pole);
            dropPole(ModBlocks.dark_oak_log_pole);
            dropPole(ModBlocks.crimson_stem_pole);
            dropPole(ModBlocks.warped_stem_pole);
            dropPole(ModBlocks.blackstone_pole);
            dropPole(ModBlocks.polished_blackstone_pole);
            dropPole(ModBlocks.stone_pole);
            dropPole(ModBlocks.smooth_stone_pole);
            dropPole(ModBlocks.cobblestone_pole);
            dropPole(ModBlocks.mossy_cobblestone_pole);
            dropPole(ModBlocks.sandstone_pole);
            dropPole(ModBlocks.smooth_sandstone_pole);
            dropPole(ModBlocks.red_sandstone_pole);
            dropPole(ModBlocks.smooth_red_sandstone_pole);
            dropPole(ModBlocks.stone_brick_pole);
            dropPole(ModBlocks.cracked_stone_brick_pole);
            dropPole(ModBlocks.mossy_stone_brick_pole);
            dropPole(ModBlocks.prismarine_pole);
            dropPole(ModBlocks.prismarine_brick_pole);
            dropPole(ModBlocks.dark_prismarine_pole);
            dropPole(ModBlocks.purpur_pole);

            dropBeam(ModBlocks.oak_beam);
            dropBeam(ModBlocks.spruce_beam);
            dropBeam(ModBlocks.birch_beam);
            dropBeam(ModBlocks.jungle_beam);
            dropBeam(ModBlocks.acacia_beam);
            dropBeam(ModBlocks.dark_oak_beam);
            dropBeam(ModBlocks.crimson_beam);
            dropBeam(ModBlocks.warped_beam);
            dropBeam(ModBlocks.granite_beam);
            dropBeam(ModBlocks.polished_granite_beam);
            dropBeam(ModBlocks.diorite_beam);
            dropBeam(ModBlocks.polished_diorite_beam);
            dropBeam(ModBlocks.andesite_beam);
            dropBeam(ModBlocks.polished_andesite_beam);
            dropBeam(ModBlocks.oak_log_beam);
            dropBeam(ModBlocks.spruce_log_beam);
            dropBeam(ModBlocks.birch_log_beam);
            dropBeam(ModBlocks.jungle_log_beam);
            dropBeam(ModBlocks.acacia_log_beam);
            dropBeam(ModBlocks.dark_oak_log_beam);
            dropBeam(ModBlocks.crimson_stem_beam);
            dropBeam(ModBlocks.warped_stem_beam);
            dropBeam(ModBlocks.blackstone_beam);
            dropBeam(ModBlocks.polished_blackstone_beam);
            dropBeam(ModBlocks.stone_beam);
            dropBeam(ModBlocks.smooth_stone_beam);
            dropBeam(ModBlocks.cobblestone_beam);
            dropBeam(ModBlocks.mossy_cobblestone_beam);
            dropBeam(ModBlocks.sandstone_beam);
            dropBeam(ModBlocks.smooth_sandstone_beam);
            dropBeam(ModBlocks.red_sandstone_beam);
            dropBeam(ModBlocks.smooth_red_sandstone_beam);
            dropBeam(ModBlocks.stone_brick_beam);
            dropBeam(ModBlocks.cracked_stone_brick_beam);
            dropBeam(ModBlocks.mossy_stone_brick_beam);
            dropBeam(ModBlocks.prismarine_beam);
            dropBeam(ModBlocks.prismarine_brick_beam);
            dropBeam(ModBlocks.dark_prismarine_beam);
            dropBeam(ModBlocks.purpur_beam);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
        }
    }
}
