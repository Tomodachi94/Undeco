package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalBlockTagProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Set;
import java.util.function.Supplier;

public class UDBlockTags extends OrnamentalBlockTagProvider {

    private ImmutableSet<Supplier<? extends DoorBlock>> doors = ImmutableSet.of(
            ModBlocks.granite_door, ModBlocks.polished_granite_door, ModBlocks.diorite_door, ModBlocks.polished_diorite_door, ModBlocks.andesite_door, ModBlocks.polished_andesite_door,
            ModBlocks.oak_log_door, ModBlocks.spruce_log_door, ModBlocks.birch_log_door, ModBlocks.jungle_log_door, ModBlocks.acacia_log_door, ModBlocks.dark_oak_log_door,
            ModBlocks.crimson_stem_door, ModBlocks.warped_stem_door, ModBlocks.blackstone_door, ModBlocks.polished_blackstone_door, ModBlocks.stone_door, ModBlocks.smooth_stone_door,
            ModBlocks.cobblestone_door, ModBlocks.mossy_cobblestone_door, ModBlocks.sandstone_door, ModBlocks.smooth_sandstone_door, ModBlocks.red_sandstone_door,
            ModBlocks.smooth_red_sandstone_door, ModBlocks.stone_brick_door, ModBlocks.cracked_stone_brick_door, ModBlocks.mossy_stone_brick_door, ModBlocks.prismarine_door,
            ModBlocks.prismarine_brick_door, ModBlocks.dark_prismarine_door, ModBlocks.purpur_door);
    private ImmutableSet<Supplier<? extends FenceGateBlock>> fence_gates = ImmutableSet.of(
            ModBlocks.granite_fence_gate, ModBlocks.polished_granite_fence_gate, ModBlocks.diorite_fence_gate, ModBlocks.polished_diorite_fence_gate, ModBlocks.andesite_fence_gate,
            ModBlocks.polished_andesite_fence_gate, ModBlocks.oak_log_fence_gate, ModBlocks.spruce_log_fence_gate, ModBlocks.birch_log_fence_gate, ModBlocks.jungle_log_fence_gate,
            ModBlocks.acacia_log_fence_gate, ModBlocks.dark_oak_log_fence_gate, ModBlocks.crimson_stem_fence_gate, ModBlocks.warped_stem_fence_gate, ModBlocks.blackstone_fence_gate,
            ModBlocks.polished_blackstone_fence_gate, ModBlocks.stone_fence_gate, ModBlocks.smooth_stone_fence_gate, ModBlocks.cobblestone_fence_gate, ModBlocks.mossy_cobblestone_fence_gate,
            ModBlocks.sandstone_fence_gate, ModBlocks.smooth_sandstone_fence_gate, ModBlocks.red_sandstone_fence_gate, ModBlocks.smooth_red_sandstone_fence_gate, ModBlocks.stone_brick_fence_gate,
            ModBlocks.cracked_stone_brick_fence_gate, ModBlocks.mossy_stone_brick_fence_gate, ModBlocks.prismarine_fence_gate, ModBlocks.prismarine_brick_fence_gate, ModBlocks.dark_prismarine_fence_gate, ModBlocks.purpur_fence_gate
    );
    private ImmutableSet<Supplier<? extends FenceBlock>> fences = ImmutableSet.of(
            ModBlocks.granite_fence, ModBlocks.polished_granite_fence, ModBlocks.diorite_fence, ModBlocks.polished_diorite_fence, ModBlocks.andesite_fence,
            ModBlocks.polished_andesite_fence, ModBlocks.oak_log_fence, ModBlocks.spruce_log_fence, ModBlocks.birch_log_fence, ModBlocks.jungle_log_fence, ModBlocks.acacia_log_fence,
            ModBlocks.dark_oak_log_fence, ModBlocks.crimson_stem_fence, ModBlocks.warped_stem_fence, ModBlocks.blackstone_fence, ModBlocks.polished_blackstone_fence, ModBlocks.stone_fence,
            ModBlocks.smooth_stone_fence, ModBlocks.cobblestone_fence, ModBlocks.mossy_cobblestone_fence, ModBlocks.sandstone_fence, ModBlocks.smooth_sandstone_fence,
            ModBlocks.red_sandstone_fence,  ModBlocks.smooth_red_sandstone_fence, ModBlocks.stone_brick_fence, ModBlocks.cracked_stone_brick_fence, ModBlocks.mossy_stone_brick_fence,
            ModBlocks.prismarine_fence, ModBlocks.prismarine_brick_fence, ModBlocks.dark_prismarine_fence, ModBlocks.purpur_fence);
    private ImmutableSet<Supplier<? extends Block>> nonflamable = ImmutableSet.of(
            ModBlocks.warped_stem_stairs, ModBlocks.warped_stem_slab, ModBlocks.warped_stem_fence, ModBlocks.warped_stem_trapdoor, ModBlocks.warped_stem_fence_gate, ModBlocks.warped_stem_door, ModBlocks.warped_stem_pole, ModBlocks.warped_stem_beam,
            ModBlocks.crimson_stem_stairs, ModBlocks.crimson_stem_slab, ModBlocks.crimson_stem_fence, ModBlocks.crimson_stem_trapdoor, ModBlocks.crimson_stem_fence_gate, ModBlocks.crimson_stem_door, ModBlocks.crimson_stem_pole, ModBlocks.crimson_stem_beam);
    private ImmutableSet<Supplier<? extends SlabBlock>> slabs = ImmutableSet.of(
            ModBlocks.oak_log_slab, ModBlocks.spruce_log_slab, ModBlocks.birch_log_slab, ModBlocks.jungle_log_slab, ModBlocks.acacia_log_slab,
            ModBlocks.dark_oak_log_slab, ModBlocks.crimson_stem_slab, ModBlocks.warped_stem_slab, ModBlocks.cracked_stone_brick_slab);
    private ImmutableSet<Supplier<? extends StairsBlock>> stairs = ImmutableSet.of(
            ModBlocks.oak_log_stairs, ModBlocks.spruce_log_stairs, ModBlocks.birch_log_stairs, ModBlocks.jungle_log_stairs, ModBlocks.acacia_log_stairs, ModBlocks.dark_oak_log_stairs,
            ModBlocks.crimson_stem_stairs, ModBlocks.warped_stem_stairs, ModBlocks.smooth_stone_stairs, ModBlocks.cracked_stone_brick_stairs);
    private ImmutableSet<Supplier<? extends DoorBlock>> wooddoor = ImmutableSet.of(
            ModBlocks.oak_log_door, ModBlocks.spruce_log_door, ModBlocks.birch_log_door, ModBlocks.jungle_log_door,
            ModBlocks.acacia_log_door, ModBlocks.dark_oak_log_door, ModBlocks.crimson_stem_door, ModBlocks.warped_stem_door);
    private ImmutableSet<Supplier<? extends FenceBlock>> woodfence = ImmutableSet.of(
            ModBlocks.oak_log_fence, ModBlocks.spruce_log_fence, ModBlocks.birch_log_fence, ModBlocks.jungle_log_fence,
            ModBlocks.acacia_log_fence, ModBlocks.dark_oak_log_fence, ModBlocks.crimson_stem_fence, ModBlocks.warped_stem_fence);
    private ImmutableSet<Supplier<? extends SlabBlock>> woodslab = ImmutableSet.of(
            ModBlocks.oak_log_slab, ModBlocks.spruce_log_slab, ModBlocks.birch_log_slab, ModBlocks.jungle_log_slab,
            ModBlocks.acacia_log_slab, ModBlocks.dark_oak_log_slab, ModBlocks.crimson_stem_slab,ModBlocks.warped_stem_slab);
    private ImmutableSet<Supplier<? extends StairsBlock>> woodstairs = ImmutableSet.of(
            ModBlocks.oak_log_stairs, ModBlocks.spruce_log_stairs, ModBlocks.birch_log_stairs, ModBlocks.jungle_log_stairs,
            ModBlocks.acacia_log_stairs, ModBlocks.dark_oak_log_stairs, ModBlocks.crimson_stem_stairs, ModBlocks.warped_stem_stairs);
    private ImmutableSet<Supplier<? extends TrapDoorBlock>> woodtrapdoor = ImmutableSet.of(
            ModBlocks.oak_log_trapdoor, ModBlocks.spruce_log_trapdoor, ModBlocks.birch_log_trapdoor, ModBlocks.jungle_log_trapdoor,
            ModBlocks.acacia_log_trapdoor, ModBlocks.dark_oak_log_trapdoor, ModBlocks.crimson_stem_trapdoor, ModBlocks.warped_stem_trapdoor);
    private ImmutableSet<Supplier<? extends FenceGateBlock>> woodfencegate = ImmutableSet.of(
            ModBlocks.oak_log_fence_gate, ModBlocks.spruce_log_fence_gate, ModBlocks.birch_log_fence_gate, ModBlocks.jungle_log_fence_gate,
            ModBlocks.acacia_log_fence_gate, ModBlocks.dark_oak_log_fence_gate, ModBlocks.crimson_stem_fence_gate, ModBlocks.warped_stem_fence_gate);

    public UDBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, UnusuallyDecorative.MODID, helper);
    }

    @Override
    protected void registerTags() {
        doorTag(doors);
        fenceGateTag(fence_gates);
        fenceTag(fences);
        nonFlammableTag(nonflamable);
        slabTag(slabs);
        stairsTag(stairs);
        woodDoorTag(wooddoor);
        woodFenceTag(woodfence);
        woodSlabTag(woodslab);
        woodStairsTag(woodstairs);
        woodTrapdoorTag(woodtrapdoor);
        woodFenceGateTag(woodfencegate);
    }

    private void nonFlammableTag(Set<Supplier<? extends Block>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.NON_FLAMMABLE_WOOD).add(block.get());
        }
    }

    private void woodDoorTag(Set<Supplier<? extends DoorBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.WOODEN_DOORS).add(block.get());
        }
    }

    private void woodFenceTag(Set<Supplier<? extends FenceBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.WOODEN_FENCES).add(block.get());
            getOrCreateBuilder(Tags.Blocks.FENCES_WOODEN).add(block.get());
        }
    }

    private void woodSlabTag(Set<Supplier<? extends SlabBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.WOODEN_SLABS).add(block.get());
        }
    }

    private void woodStairsTag(Set<Supplier<? extends StairsBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.WOODEN_STAIRS).add(block.get());
        }
    }

    private void woodTrapdoorTag(Set<Supplier<? extends TrapDoorBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(BlockTags.WOODEN_TRAPDOORS).add(block.get());
        }
    }

    private void woodFenceGateTag(Set<Supplier<? extends FenceGateBlock>> set) {
        for (Supplier<? extends Block> block : set) {
            getOrCreateBuilder(Tags.Blocks.FENCE_GATES_WOODEN).add(block.get());
        }
    }
}
