package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalItemModelProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class UDItemModelGenerator extends OrnamentalItemModelProvider {

    public UDItemModelGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, UnusuallyDecorative.MODID, helper);
    }

    @Override
    protected void registerModels() {
        blockItem(ModBlocks.oak_log_stairs);
        blockItem(ModBlocks.spruce_log_stairs);
        blockItem(ModBlocks.birch_log_stairs);
        blockItem(ModBlocks.jungle_log_stairs);
        blockItem(ModBlocks.acacia_log_stairs);
        blockItem(ModBlocks.dark_oak_log_stairs);
        blockItem(ModBlocks.crimson_stem_stairs);
        blockItem(ModBlocks.warped_stem_stairs);
        blockItem(ModBlocks.smooth_stone_stairs);
        blockItem(ModBlocks.cracked_stone_brick_stairs);

        blockItem(ModBlocks.oak_log_slab);
        blockItem(ModBlocks.spruce_log_slab);
        blockItem(ModBlocks.birch_log_slab);
        blockItem(ModBlocks.jungle_log_slab);
        blockItem(ModBlocks.acacia_log_slab);
        blockItem(ModBlocks.dark_oak_log_slab);
        blockItem(ModBlocks.crimson_stem_slab);
        blockItem(ModBlocks.warped_stem_slab);
        blockItem(ModBlocks.cracked_stone_brick_slab);

        blockItemFence(ModBlocks.granite_fence, "granite");
        blockItemFence(ModBlocks.polished_granite_fence, "polished_granite");
        blockItemFence(ModBlocks.diorite_fence, "diorite");
        blockItemFence(ModBlocks.polished_diorite_fence, "polished_diorite");
        blockItemFence(ModBlocks.andesite_fence, "andesite");
        blockItemFence(ModBlocks.polished_andesite_fence, "polished_andesite");
        blockItemFenceColumn(ModBlocks.oak_log_fence, "oak_log", "oak_log_top");
        blockItemFenceColumn(ModBlocks.spruce_log_fence, "spruce_log", "spruce_log_top");
        blockItemFenceColumn(ModBlocks.birch_log_fence, "birch_log", "birch_log_top");
        blockItemFenceColumn(ModBlocks.jungle_log_fence, "jungle_log", "jungle_log_top");
        blockItemFenceColumn(ModBlocks.acacia_log_fence, "acacia_log", "acacia_log_top");
        blockItemFenceColumn(ModBlocks.dark_oak_log_fence, "dark_oak_log", "dark_oak_log_top");
        blockItemFenceColumn(ModBlocks.crimson_stem_fence, "crimson_stem", "crimson_stem_top");
        blockItemFenceColumn(ModBlocks.warped_stem_fence, "warped_stem", "warped_stem_top");
        blockItemFence(ModBlocks.blackstone_fence, "blackstone");
        blockItemFence(ModBlocks.polished_blackstone_fence, "polished_blackstone");
        blockItemFence(ModBlocks.stone_fence, "stone");
        blockItemFence(ModBlocks.smooth_stone_fence, "smooth_stone");
        blockItemFence(ModBlocks.cobblestone_fence, "cobblestone");
        blockItemFence(ModBlocks.mossy_cobblestone_fence, "mossy_cobblestone");
        blockItemFenceTB(ModBlocks.sandstone_fence, "sandstone_bottom", "sandstone_top", "sandstone");
        blockItemFence(ModBlocks.smooth_sandstone_fence, "sandstone_top");
        blockItemFenceTB(ModBlocks.red_sandstone_fence, "red_sandstone_bottom", "red_sandstone_top", "red_sandstone");
        blockItemFence(ModBlocks.smooth_red_sandstone_fence, "red_sandstone_top");
        blockItemFence(ModBlocks.stone_brick_fence, "stone_bricks");
        blockItemFence(ModBlocks.cracked_stone_brick_fence, "cracked_stone_bricks");
        blockItemFence(ModBlocks.mossy_stone_brick_fence, "mossy_stone_bricks");
        blockItemFence(ModBlocks.prismarine_fence, "prismarine");
        blockItemFence(ModBlocks.prismarine_brick_fence, "prismarine_bricks");
        blockItemFence(ModBlocks.dark_prismarine_fence, "dark_prismarine");
        blockItemFence(ModBlocks.purpur_fence, "purpur_block");

        blockItemTrapdoor(ModBlocks.granite_trapdoor);
        blockItemTrapdoor(ModBlocks.polished_granite_trapdoor);
        blockItemTrapdoor(ModBlocks.diorite_trapdoor);
        blockItemTrapdoor(ModBlocks.polished_diorite_trapdoor);
        blockItemTrapdoor(ModBlocks.andesite_trapdoor);
        blockItemTrapdoor(ModBlocks.polished_andesite_trapdoor);
        blockItemTrapdoor(ModBlocks.oak_log_trapdoor);
        blockItemTrapdoor(ModBlocks.spruce_log_trapdoor);
        blockItemTrapdoor(ModBlocks.birch_log_trapdoor);
        blockItemTrapdoor(ModBlocks.jungle_log_trapdoor);
        blockItemTrapdoor(ModBlocks.acacia_log_trapdoor);
        blockItemTrapdoor(ModBlocks.dark_oak_log_trapdoor);
        blockItemTrapdoor(ModBlocks.crimson_stem_trapdoor);
        blockItemTrapdoor(ModBlocks.warped_stem_trapdoor);
        blockItemTrapdoor(ModBlocks.blackstone_trapdoor);
        blockItemTrapdoor(ModBlocks.polished_blackstone_trapdoor);
        blockItemTrapdoor(ModBlocks.stone_trapdoor);
        blockItemTrapdoor(ModBlocks.smooth_stone_trapdoor);
        blockItemTrapdoor(ModBlocks.cobblestone_trapdoor);
        blockItemTrapdoor(ModBlocks.mossy_cobblestone_trapdoor);
        blockItemTrapdoor(ModBlocks.sandstone_trapdoor);
        blockItemTrapdoor(ModBlocks.smooth_sandstone_trapdoor);
        blockItemTrapdoor(ModBlocks.red_sandstone_trapdoor);
        blockItemTrapdoor(ModBlocks.smooth_red_sandstone_trapdoor);
        blockItemTrapdoor(ModBlocks.stone_brick_trapdoor);
        blockItemTrapdoor(ModBlocks.cracked_stone_brick_trapdoor);
        blockItemTrapdoor(ModBlocks.mossy_stone_brick_trapdoor);
        blockItemTrapdoor(ModBlocks.prismarine_trapdoor);
        blockItemTrapdoor(ModBlocks.prismarine_brick_trapdoor);
        blockItemTrapdoor(ModBlocks.dark_prismarine_trapdoor);
        blockItemTrapdoor(ModBlocks.purpur_trapdoor);

        blockItem(ModBlocks.granite_fence_gate);
        blockItem(ModBlocks.polished_granite_fence_gate);
        blockItem(ModBlocks.diorite_fence_gate);
        blockItem(ModBlocks.polished_diorite_fence_gate);
        blockItem(ModBlocks.andesite_fence_gate);
        blockItem(ModBlocks.polished_andesite_fence_gate);
        blockItem(ModBlocks.oak_log_fence_gate);
        blockItem(ModBlocks.spruce_log_fence_gate);
        blockItem(ModBlocks.birch_log_fence_gate);
        blockItem(ModBlocks.jungle_log_fence_gate);
        blockItem(ModBlocks.acacia_log_fence_gate);
        blockItem(ModBlocks.dark_oak_log_fence_gate);
        blockItem(ModBlocks.crimson_stem_fence_gate);
        blockItem(ModBlocks.warped_stem_fence_gate);
        blockItem(ModBlocks.blackstone_fence_gate);
        blockItem(ModBlocks.polished_blackstone_fence_gate);
        blockItem(ModBlocks.stone_fence_gate);
        blockItem(ModBlocks.smooth_stone_fence_gate);
        blockItem(ModBlocks.cobblestone_fence_gate);
        blockItem(ModBlocks.mossy_cobblestone_fence_gate);
        blockItem(ModBlocks.sandstone_fence_gate);
        blockItem(ModBlocks.smooth_sandstone_fence_gate);
        blockItem(ModBlocks.red_sandstone_fence_gate);
        blockItem(ModBlocks.smooth_red_sandstone_fence_gate);
        blockItem(ModBlocks.stone_brick_fence_gate);
        blockItem(ModBlocks.cracked_stone_brick_fence_gate);
        blockItem(ModBlocks.mossy_stone_brick_fence_gate);
        blockItem(ModBlocks.prismarine_fence_gate);
        blockItem(ModBlocks.prismarine_brick_fence_gate);
        blockItem(ModBlocks.dark_prismarine_fence_gate);
        blockItem(ModBlocks.purpur_fence_gate);

        blockItemModel(ModBlocks.granite_door);
        blockItemModel(ModBlocks.polished_granite_door);
        blockItemModel(ModBlocks.diorite_door);
        blockItemModel(ModBlocks.polished_diorite_door);
        blockItemModel(ModBlocks.andesite_door);
        blockItemModel(ModBlocks.polished_andesite_door);
        blockItemModel(ModBlocks.oak_log_door);
        blockItemModel(ModBlocks.spruce_log_door);
        blockItemModel(ModBlocks.birch_log_door);
        blockItemModel(ModBlocks.jungle_log_door);
        blockItemModel(ModBlocks.acacia_log_door);
        blockItemModel(ModBlocks.dark_oak_log_door);
        blockItemModel(ModBlocks.crimson_stem_door);
        blockItemModel(ModBlocks.warped_stem_door);
        blockItemModel(ModBlocks.blackstone_door);
        blockItemModel(ModBlocks.polished_blackstone_door);
        blockItemModel(ModBlocks.stone_door);
        blockItemModel(ModBlocks.smooth_stone_door);
        blockItemModel(ModBlocks.cobblestone_door);
        blockItemModel(ModBlocks.mossy_cobblestone_door);
        blockItemModel(ModBlocks.sandstone_door);
        blockItemModel(ModBlocks.smooth_sandstone_door);
        blockItemModel(ModBlocks.red_sandstone_door);
        blockItemModel(ModBlocks.smooth_red_sandstone_door);
        blockItemModel(ModBlocks.stone_brick_door);
        blockItemModel(ModBlocks.cracked_stone_brick_door);
        blockItemModel(ModBlocks.mossy_stone_brick_door);
        blockItemModel(ModBlocks.prismarine_door);
        blockItemModel(ModBlocks.prismarine_brick_door);
        blockItemModel(ModBlocks.dark_prismarine_door);
        blockItemModel(ModBlocks.purpur_door);

        blockItemPole(ModBlocks.oak_pole, "oak_planks");
        blockItemPole(ModBlocks.spruce_pole, "spruce_planks");
        blockItemPole(ModBlocks.birch_pole, "birch_planks");
        blockItemPole(ModBlocks.jungle_pole, "jungle_planks");
        blockItemPole(ModBlocks.acacia_pole, "acacia_planks");
        blockItemPole(ModBlocks.dark_oak_pole, "dark_oak_planks");
        blockItemPole(ModBlocks.crimson_pole, "crimson_planks");
        blockItemPole(ModBlocks.warped_pole, "warped_planks");
        blockItemPole(ModBlocks.granite_pole, "granite");
        blockItemPole(ModBlocks.polished_granite_pole, "polished_granite");
        blockItemPole(ModBlocks.diorite_pole, "diorite");
        blockItemPole(ModBlocks.polished_diorite_pole, "polished_diorite");
        blockItemPole(ModBlocks.andesite_pole, "andesite");
        blockItemPole(ModBlocks.polished_andesite_pole, "polished_andesite");
        blockItemPole(ModBlocks.oak_log_pole, "oak_log_top", "oak_log");
        blockItemPole(ModBlocks.spruce_log_pole, "spruce_log_top", "spruce_log");
        blockItemPole(ModBlocks.birch_log_pole, "birch_log_top", "birch_log");
        blockItemPole(ModBlocks.jungle_log_pole, "jungle_log_top", "jungle_log");
        blockItemPole(ModBlocks.acacia_log_pole, "acacia_log_top", "acacia_log");
        blockItemPole(ModBlocks.dark_oak_log_pole, "dark_oak_log_top", "dark_oak_log");
        blockItemPole(ModBlocks.crimson_stem_pole, "crimson_stem_top", "crimson_stem");
        blockItemPole(ModBlocks.warped_stem_pole, "warped_stem_top", "warped_stem");
        blockItemPole(ModBlocks.blackstone_pole, "blackstone");
        blockItemPole(ModBlocks.polished_blackstone_pole, "polished_blackstone");
        blockItemPole(ModBlocks.stone_pole, "stone");
        blockItemPole(ModBlocks.smooth_stone_pole, "smooth_stone");
        blockItemPole(ModBlocks.cobblestone_pole, "cobblestone");
        blockItemPole(ModBlocks.mossy_cobblestone_pole, "mossy_cobblestone");
        blockItemPole(ModBlocks.sandstone_pole, "sandstone_bottom", "sandstone_top", "sandstone");
        blockItemPole(ModBlocks.smooth_sandstone_pole, "sandstone_top");
        blockItemPole(ModBlocks.red_sandstone_pole, "red_sandstone_bottom", "red_sandstone_top", "red_sandstone");
        blockItemPole(ModBlocks.smooth_red_sandstone_pole, "red_sandstone_top");
        blockItemPole(ModBlocks.stone_brick_pole, "stone_bricks");
        blockItemPole(ModBlocks.cracked_stone_brick_pole, "cracked_stone_bricks");
        blockItemPole(ModBlocks.mossy_stone_brick_pole, "mossy_stone_bricks");
        blockItemPole(ModBlocks.prismarine_pole, "prismarine");
        blockItemPole(ModBlocks.prismarine_brick_pole, "prismarine_bricks");
        blockItemPole(ModBlocks.dark_prismarine_pole, "dark_prismarine");
        blockItemPole(ModBlocks.purpur_pole, "purpur_block");

        blockItemBeam(ModBlocks.oak_beam, "oak_planks");
        blockItemBeam(ModBlocks.spruce_beam, "spruce_planks");
        blockItemBeam(ModBlocks.birch_beam, "birch_planks");
        blockItemBeam(ModBlocks.jungle_beam, "jungle_planks");
        blockItemBeam(ModBlocks.acacia_beam, "acacia_planks");
        blockItemBeam(ModBlocks.dark_oak_beam, "dark_oak_planks");
        blockItemBeam(ModBlocks.crimson_beam, "crimson_planks");
        blockItemBeam(ModBlocks.warped_beam, "warped_planks");
        blockItemBeam(ModBlocks.granite_beam, "granite");
        blockItemBeam(ModBlocks.polished_granite_beam, "polished_granite");
        blockItemBeam(ModBlocks.diorite_beam, "diorite");
        blockItemBeam(ModBlocks.polished_diorite_beam, "polished_diorite");
        blockItemBeam(ModBlocks.andesite_beam, "andesite");
        blockItemBeam(ModBlocks.polished_andesite_beam, "polished_andesite");
        blockItemBeam(ModBlocks.oak_log_beam, "oak_log_top", "oak_log");
        blockItemBeam(ModBlocks.spruce_log_beam, "spruce_log_top", "spruce_log");
        blockItemBeam(ModBlocks.birch_log_beam, "birch_log_top", "birch_log");
        blockItemBeam(ModBlocks.jungle_log_beam, "jungle_log_top", "jungle_log");
        blockItemBeam(ModBlocks.acacia_log_beam, "acacia_log_top", "acacia_log");
        blockItemBeam(ModBlocks.dark_oak_log_beam, "dark_oak_log_top", "dark_oak_log");
        blockItemBeam(ModBlocks.crimson_stem_beam, "crimson_stem_top", "crimson_stem");
        blockItemBeam(ModBlocks.warped_stem_beam, "warped_stem_top", "warped_stem");
        blockItemBeam(ModBlocks.blackstone_beam, "blackstone");
        blockItemBeam(ModBlocks.polished_blackstone_beam, "polished_blackstone");
        blockItemBeam(ModBlocks.stone_beam, "stone");
        blockItemBeam(ModBlocks.smooth_stone_beam, "smooth_stone");
        blockItemBeam(ModBlocks.cobblestone_beam, "cobblestone");
        blockItemBeam(ModBlocks.mossy_cobblestone_beam, "mossy_cobblestone");
        blockItemBeam(ModBlocks.sandstone_beam, "sandstone_bottom", "sandstone_top", "sandstone");
        blockItemBeam(ModBlocks.smooth_sandstone_beam, "sandstone_top");
        blockItemBeam(ModBlocks.red_sandstone_beam, "red_sandstone_bottom", "red_sandstone_top", "red_sandstone");
        blockItemBeam(ModBlocks.smooth_red_sandstone_beam, "red_sandstone_top");
        blockItemBeam(ModBlocks.stone_brick_beam, "stone_bricks");
        blockItemBeam(ModBlocks.cracked_stone_brick_beam, "cracked_stone_bricks");
        blockItemBeam(ModBlocks.mossy_stone_brick_beam, "mossy_stone_bricks");
        blockItemBeam(ModBlocks.prismarine_beam, "prismarine");
        blockItemBeam(ModBlocks.prismarine_brick_beam, "prismarine_bricks");
        blockItemBeam(ModBlocks.dark_prismarine_beam, "dark_prismarine");
        blockItemBeam(ModBlocks.purpur_beam, "purpur_block");
    }

    public void blockItemFenceTB(Supplier<? extends Block> block, String bottom, String top, String side) {
        withExistingParent(blockName(block), modLoc("block/fence_inventory_top_bottom"))
                .texture("bottom", mcLoc("block/" + bottom))
                .texture("top", mcLoc("block/" + top))
                .texture("side", mcLoc("block/" + side));
    }

    public void blockItemPole(Supplier<? extends Block> block, String bottom, String top, String side) {
        withExistingParent(blockName(block), modLoc("block/pole_top_bottom_inventory"))
                .texture("bottom", mcLoc("block/" + bottom))
                .texture("top", mcLoc("block/" + top))
                .texture("side", mcLoc("block/" + side));
    }

    public void blockItemBeam(Supplier<? extends Block> block, String bottom, String top, String side) {
        withExistingParent(blockName(block), modLoc("block/beam_top_bottom_inventory"))
                .texture("bottom", mcLoc("block/" + bottom))
                .texture("top", mcLoc("block/" + top))
                .texture("side", mcLoc("block/" + side));
    }
}
