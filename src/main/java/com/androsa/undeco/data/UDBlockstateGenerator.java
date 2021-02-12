package com.androsa.undeco.data;

import com.androsa.ornamental.blocks.OrnamentBeam;
import com.androsa.ornamental.blocks.OrnamentPole;
import com.androsa.ornamental.data.provider.OrnamentalBlockStateProvider;
import com.androsa.undeco.ModBlocks;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nonnull;

public class UDBlockstateGenerator extends OrnamentalBlockStateProvider {

    private final UDBlockModelGenerator blockModels;

    public UDBlockstateGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, UnusuallyDecorative.MODID, helper);

        blockModels = new UDBlockModelGenerator(generator, helper) {
            @Override
            protected void registerModels() { }

            @Nonnull
            @Override
            public String getName() {
                return UDBlockstateGenerator.this.getName();
            }
        };
    }

    @Override
    public UDBlockModelGenerator models() {
        return blockModels;
    }

    @Nonnull
    @Override
    public String getName() {
        return "Ornamental: Unusually Decorative Blockstates and Block Models";
    }

    @Override
    protected void registerStatesAndModels() {
        stairsColumn(ModBlocks.oak_log_stairs, "oak_log", "oak_log_top");
        stairsColumn(ModBlocks.spruce_log_stairs, "spruce_log", "spruce_log_top");
        stairsColumn(ModBlocks.birch_log_stairs, "birch_log", "birch_log_top");
        stairsColumn(ModBlocks.jungle_log_stairs, "jungle_log", "jungle_log_top");
        stairsColumn(ModBlocks.acacia_log_stairs, "acacia_log", "acacia_log_top");
        stairsColumn(ModBlocks.dark_oak_log_stairs, "dark_oak_log", "dark_oak_log_top");
        stairsColumn(ModBlocks.crimson_stem_stairs, "crimson_stem", "crimson_stem_top");
        stairsColumn(ModBlocks.warped_stem_stairs, "warped_stem", "warped_stem_top");
        stairsBasic(ModBlocks.smooth_stone_stairs, "smooth_stone");
        stairsBasic(ModBlocks.cracked_stone_brick_stairs, "cracked_stone_bricks");

        slabColumn(ModBlocks.oak_log_slab, "oak_log", "oak_log", "oak_log_top");
        slabColumn(ModBlocks.spruce_log_slab, "spruce_log", "spruce_log", "spruce_log_top");
        slabColumn(ModBlocks.birch_log_slab, "birch_log", "birch_log", "birch_log_top");
        slabColumn(ModBlocks.jungle_log_slab, "jungle_log", "jungle_log", "jungle_log_top");
        slabColumn(ModBlocks.acacia_log_slab, "acacia_log", "acacia_log", "acacia_log_top");
        slabColumn(ModBlocks.dark_oak_log_slab, "dark_oak_log", "dark_oak_log", "dark_oak_log_top");
        slabColumn(ModBlocks.crimson_stem_slab, "crimson_stem", "crimson_stem", "crimson_stem_top");
        slabColumn(ModBlocks.warped_stem_slab, "warped_stem", "warped_stem", "warped_stem_top");
        slabBasic(ModBlocks.cracked_stone_brick_slab, "cracked_stone_bricks");

        fenceBasic(ModBlocks.granite_fence, "granite");
        fenceBasic(ModBlocks.polished_granite_fence, "polished_granite");
        fenceBasic(ModBlocks.diorite_fence, "diorite");
        fenceBasic(ModBlocks.polished_diorite_fence, "polished_diorite");
        fenceBasic(ModBlocks.andesite_fence, "andesite");
        fenceBasic(ModBlocks.polished_andesite_fence, "polished_andesite");
        fenceColumn(ModBlocks.oak_log_fence, "oak_log", "oak_log_top");
        fenceColumn(ModBlocks.spruce_log_fence, "spruce_log", "spruce_log_top");
        fenceColumn(ModBlocks.birch_log_fence, "birch_log", "birch_log_top");
        fenceColumn(ModBlocks.jungle_log_fence, "jungle_log", "jungle_log_top");
        fenceColumn(ModBlocks.acacia_log_fence, "acacia_log", "acacia_log_top");
        fenceColumn(ModBlocks.dark_oak_log_fence, "dark_oak_log", "dark_oak_log_top");
        fenceColumn(ModBlocks.crimson_stem_fence, "crimson_stem", "crimson_stem_top");
        fenceColumn(ModBlocks.warped_stem_fence, "warped_stem", "warped_stem_top");
        fenceBasic(ModBlocks.blackstone_fence, "blackstone");
        fenceBasic(ModBlocks.polished_blackstone_fence, "polished_blackstone");
        fenceBasic(ModBlocks.stone_fence, "stone");
        fenceBasic(ModBlocks.smooth_stone_fence, "smooth_stone");
        fenceBasic(ModBlocks.cobblestone_fence, "cobblestone");
        fenceBasic(ModBlocks.mossy_cobblestone_fence, "mossy_cobblestone");
        fenceTopBottom(ModBlocks.sandstone_fence, "sandstone", "sandstone_top", "sandstone_bottom");
        fenceBasic(ModBlocks.smooth_sandstone_fence, "sandstone_top");
        fenceTopBottom(ModBlocks.red_sandstone_fence, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        fenceBasic(ModBlocks.smooth_red_sandstone_fence, "red_sandstone_top");
        fenceBasic(ModBlocks.stone_brick_fence, "stone_bricks");
        fenceBasic(ModBlocks.cracked_stone_brick_fence, "cracked_stone_bricks");
        fenceBasic(ModBlocks.mossy_stone_brick_fence, "mossy_stone_bricks");
        fenceBasic(ModBlocks.prismarine_fence, "prismarine");
        fenceBasic(ModBlocks.prismarine_brick_fence, "prismarine_bricks");
        fenceBasic(ModBlocks.dark_prismarine_fence, "dark_prismarine");
        fenceBasic(ModBlocks.purpur_fence, "purpur_block");

        trapdoorVanilla(ModBlocks.granite_trapdoor, "granite");
        trapdoorBasic(ModBlocks.polished_granite_trapdoor, "polished_granite");
        trapdoorVanilla(ModBlocks.diorite_trapdoor, "diorite");
        trapdoorBasic(ModBlocks.polished_diorite_trapdoor, "polished_diorite");
        trapdoorVanilla(ModBlocks.andesite_trapdoor, "andesite");
        trapdoorBasic(ModBlocks.polished_andesite_trapdoor, "polished_andesite");
        trapdoorVanilla(ModBlocks.oak_log_trapdoor, "oak_log");
        trapdoorVanilla(ModBlocks.spruce_log_trapdoor, "spruce_log");
        trapdoorVanilla(ModBlocks.birch_log_trapdoor, "birch_log");
        trapdoorVanilla(ModBlocks.jungle_log_trapdoor, "jungle_log");
        trapdoorVanilla(ModBlocks.acacia_log_trapdoor, "acacia_log");
        trapdoorVanilla(ModBlocks.dark_oak_log_trapdoor, "dark_oak_log");
        trapdoorVanilla(ModBlocks.crimson_stem_trapdoor, "crimson_stem");
        trapdoorVanilla(ModBlocks.warped_stem_trapdoor, "warped_stem");
        trapdoorVanilla(ModBlocks.blackstone_trapdoor, "blackstone");
        trapdoorBasic(ModBlocks.polished_blackstone_trapdoor, "polished_blackstone");
        trapdoorVanilla(ModBlocks.stone_trapdoor, "stone");
        trapdoorBasic(ModBlocks.smooth_stone_trapdoor, "smooth_stone");
        trapdoorVanilla(ModBlocks.cobblestone_trapdoor, "cobblestone");
        trapdoorVanilla(ModBlocks.mossy_cobblestone_trapdoor, "mossy_cobblestone");
        trapdoorVanilla(ModBlocks.sandstone_trapdoor, "sandstone_top");
        trapdoorBasic(ModBlocks.smooth_sandstone_trapdoor, "smooth_sandstone");
        trapdoorVanilla(ModBlocks.red_sandstone_trapdoor, "red_sandstone_top");
        trapdoorBasic(ModBlocks.smooth_red_sandstone_trapdoor, "smooth_red_sandstone");
        trapdoorVanilla(ModBlocks.stone_brick_trapdoor, "stone_bricks");
        trapdoorVanilla(ModBlocks.cracked_stone_brick_trapdoor, "cracked_stone_bricks");
        trapdoorVanilla(ModBlocks.mossy_stone_brick_trapdoor, "mossy_stone_bricks");
        trapdoorVanilla(ModBlocks.prismarine_trapdoor, "prismarine");
        trapdoorBasic(ModBlocks.prismarine_brick_trapdoor, "prismarine_brick");
        trapdoorBasic(ModBlocks.dark_prismarine_trapdoor, "dark_prismarine");
        trapdoorBasic(ModBlocks.purpur_trapdoor, "purpur");

        fenceGateBasic(ModBlocks.granite_fence_gate, "granite");
        fenceGateBasic(ModBlocks.polished_granite_fence_gate, "polished_granite");
        fenceGateBasic(ModBlocks.diorite_fence_gate, "diorite");
        fenceGateBasic(ModBlocks.polished_diorite_fence_gate, "polished_diorite");
        fenceGateBasic(ModBlocks.andesite_fence_gate, "andesite");
        fenceGateBasic(ModBlocks.polished_andesite_fence_gate, "polished_andesite");
        fenceGateColumn(ModBlocks.oak_log_fence_gate, "oak_log", "oak_log_top");
        fenceGateColumn(ModBlocks.spruce_log_fence_gate, "spruce_log", "spruce_log_top");
        fenceGateColumn(ModBlocks.birch_log_fence_gate, "birch_log", "birch_log_top");
        fenceGateColumn(ModBlocks.jungle_log_fence_gate, "jungle_log", "jungle_log_top");
        fenceGateColumn(ModBlocks.acacia_log_fence_gate, "acacia_log", "acacia_log_top");
        fenceGateColumn(ModBlocks.dark_oak_log_fence_gate, "dark_oak_log", "dark_oak_log_top");
        fenceGateColumn(ModBlocks.crimson_stem_fence_gate, "crimson_stem", "crimson_stem_top");
        fenceGateColumn(ModBlocks.warped_stem_fence_gate, "warped_stem", "warped_stem_top");
        fenceGateBasic(ModBlocks.blackstone_fence_gate, "blackstone");
        fenceGateBasic(ModBlocks.polished_blackstone_fence_gate, "polished_blackstone");
        fenceGateBasic(ModBlocks.stone_fence_gate, "stone");
        fenceGateBasic(ModBlocks.smooth_stone_fence_gate, "smooth_stone");
        fenceGateBasic(ModBlocks.cobblestone_fence_gate, "cobblestone");
        fenceGateBasic(ModBlocks.mossy_cobblestone_fence_gate, "mossy_cobblestone");
        fenceGateTopBottom(ModBlocks.sandstone_fence_gate, "sandstone", "sandstone_top", "sandstone_bottom");
        fenceGateBasic(ModBlocks.smooth_sandstone_fence_gate, "sandstone_top");
        fenceGateTopBottom(ModBlocks.red_sandstone_fence_gate, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        fenceGateBasic(ModBlocks.smooth_red_sandstone_fence_gate, "red_sandstone_top");
        fenceGateBasic(ModBlocks.stone_brick_fence_gate, "stone_bricks");
        fenceGateBasic(ModBlocks.cracked_stone_brick_fence_gate, "cracked_stone_bricks");
        fenceGateBasic(ModBlocks.mossy_stone_brick_fence_gate, "mossy_stone_bricks");
        fenceGateBasic(ModBlocks.prismarine_fence_gate, "prismarine");
        fenceGateBasic(ModBlocks.prismarine_brick_fence_gate, "prismarine_bricks");
        fenceGateBasic(ModBlocks.dark_prismarine_fence_gate, "dark_prismarine");
        fenceGateBasic(ModBlocks.purpur_fence_gate, "purpur_block");

        doorBasicVanilla(ModBlocks.granite_door, "granite");
        doorBasic(ModBlocks.polished_granite_door, "polished_granite");
        doorBasicVanilla(ModBlocks.diorite_door, "diorite");
        doorBasic(ModBlocks.polished_diorite_door, "polished_diorite");
        doorBasicVanilla(ModBlocks.andesite_door, "andesite");
        doorBasic(ModBlocks.polished_andesite_door, "polished_andesite");
        doorBasicVanilla(ModBlocks.oak_log_door, "oak_log");
        doorBasicVanilla(ModBlocks.spruce_log_door, "spruce_log");
        doorBasicVanilla(ModBlocks.birch_log_door, "birch_log");
        doorBasicVanilla(ModBlocks.jungle_log_door, "jungle_log");
        doorBasicVanilla(ModBlocks.acacia_log_door, "acacia_log");
        doorBasicVanilla(ModBlocks.dark_oak_log_door, "dark_oak_log");
        doorBasicVanilla(ModBlocks.crimson_stem_door, "crimson_stem");
        doorBasicVanilla(ModBlocks.warped_stem_door, "warped_stem");
        doorBasicVanilla(ModBlocks.blackstone_door, "blackstone");
        doorBasic(ModBlocks.polished_blackstone_door, "polished_blackstone");
        doorBasicVanilla(ModBlocks.stone_door, "stone");
        doorBasic(ModBlocks.smooth_stone_door, "smooth_stone");
        doorBasicVanilla(ModBlocks.cobblestone_door, "cobblestone");
        doorBasicVanilla(ModBlocks.mossy_cobblestone_door, "mossy_cobblestone");
        doorBlockTopBottom(ModBlocks.sandstone_door, "sandstone", "sandstone_top", "sandstone_bottom");
        doorBasic(ModBlocks.smooth_sandstone_door, "smooth_sandstone");
        doorBlockTopBottom(ModBlocks.red_sandstone_door, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        doorBasic(ModBlocks.smooth_red_sandstone_door, "smooth_red_sandstone");
        doorBasicVanilla(ModBlocks.stone_brick_door, "stone_bricks");
        doorBasicVanilla(ModBlocks.cracked_stone_brick_door, "cracked_stone_bricks");
        doorBasicVanilla(ModBlocks.mossy_stone_brick_door, "mossy_stone_bricks");
        doorBasicVanilla(ModBlocks.prismarine_door, "prismarine");
        doorBasic(ModBlocks.prismarine_brick_door, "prismarine_brick");
        doorBasic(ModBlocks.dark_prismarine_door, "dark_prismarine");
        doorBasic(ModBlocks.purpur_door, "purpur");

        poleBasic(ModBlocks.oak_pole, "oak_planks");
        poleBasic(ModBlocks.spruce_pole, "spruce_planks");
        poleBasic(ModBlocks.birch_pole, "birch_planks");
        poleBasic(ModBlocks.jungle_pole, "jungle_planks");
        poleBasic(ModBlocks.acacia_pole, "acacia_planks");
        poleBasic(ModBlocks.dark_oak_pole, "dark_oak_planks");
        poleBasic(ModBlocks.crimson_pole, "crimson_planks");
        poleBasic(ModBlocks.warped_pole, "warped_planks");
        poleBasic(ModBlocks.granite_pole, "granite");
        poleBasic(ModBlocks.polished_granite_pole, "polished_granite");
        poleBasic(ModBlocks.diorite_pole, "diorite");
        poleBasic(ModBlocks.polished_diorite_pole, "polished_diorite");
        poleBasic(ModBlocks.andesite_pole, "andesite");
        poleBasic(ModBlocks.polished_andesite_pole, "polished_andesite");
        poleLog(ModBlocks.oak_log_pole, "oak_log");
        poleLog(ModBlocks.spruce_log_pole, "spruce_log");
        poleLog(ModBlocks.birch_log_pole, "birch_log");
        poleLog(ModBlocks.jungle_log_pole, "jungle_log");
        poleLog(ModBlocks.acacia_log_pole, "acacia_log");
        poleLog(ModBlocks.dark_oak_log_pole, "dark_oak_log");
        poleLog(ModBlocks.crimson_stem_pole, "crimson_stem");
        poleLog(ModBlocks.warped_stem_pole, "warped_stem");
        poleBasic(ModBlocks.blackstone_pole, "blackstone");
        poleBasic(ModBlocks.polished_blackstone_pole, "polished_blackstone");
        poleBasic(ModBlocks.stone_pole, "stone");
        poleBasic(ModBlocks.smooth_stone_pole, "smooth_stone");
        poleBasic(ModBlocks.cobblestone_pole, "cobblestone");
        poleBasic(ModBlocks.mossy_cobblestone_pole, "mossy_cobblestone");
        poleTopBottom(ModBlocks.sandstone_pole, "sandstone", "sandstone_top", "sandstone_bottom");
        poleBasic(ModBlocks.smooth_sandstone_pole, "sandstone_top", "smooth_sandstone");
        poleTopBottom(ModBlocks.red_sandstone_pole, "red_sandstone", "red_sandstone_top", "red_sandstone_bottom");
        poleBasic(ModBlocks.smooth_red_sandstone_pole, "red_sandstone_top", "smooth_red_sandstone");
        poleBasic(ModBlocks.stone_brick_pole, "stone_bricks");
        poleBasic(ModBlocks.cracked_stone_brick_pole, "cracked_stone_bricks");
        poleBasic(ModBlocks.mossy_stone_brick_pole, "mossy_stone_bricks");
        poleBasic(ModBlocks.prismarine_pole, "prismarine");
        poleBasic(ModBlocks.prismarine_brick_pole, "prismarine_bricks");
        poleBasic(ModBlocks.dark_prismarine_pole, "dark_prismarine");
        poleBasic(ModBlocks.purpur_pole, "purpur_block");

        beamBasic(ModBlocks.oak_beam, "oak", "oak_planks", true, true);
        beamBasic(ModBlocks.spruce_beam, "spruce", "spruce_planks", true, true);
        beamBasic(ModBlocks.birch_beam, "birch", "birch_planks", true, true);
        beamBasic(ModBlocks.jungle_beam, "jungle", "jungle_planks", true, true);
        beamBasic(ModBlocks.acacia_beam, "acacia", "acacia_planks", true, true);
        beamBasic(ModBlocks.dark_oak_beam, "dark_oak", "dark_oak_planks", true, true);
        beamBasic(ModBlocks.crimson_beam, "crimson", "crimson_planks", true, true);
        beamBasic(ModBlocks.warped_beam, "warped", "warped_planks", true, true);
        beamBasic(ModBlocks.granite_beam, "granite", "granite", true, true);
        beamBasic(ModBlocks.polished_granite_beam, "polished_granite", "polished_granite", true, true);
        beamBasic(ModBlocks.diorite_beam, "diorite", "diorite", true, true);
        beamBasic(ModBlocks.polished_diorite_beam, "polished_diorite", "polished_diorite", true, true);
        beamBasic(ModBlocks.andesite_beam, "andesite", "andesite", true, true);
        beamBasic(ModBlocks.polished_andesite_beam, "polished_andesite", "polished_andesite", true, true);
        beamLog(ModBlocks.oak_log_beam, "oak_log");
        beamLog(ModBlocks.spruce_log_beam, "spruce_log");
        beamLog(ModBlocks.birch_log_beam, "birch_log");
        beamLog(ModBlocks.jungle_log_beam, "jungle_log");
        beamLog(ModBlocks.acacia_log_beam, "acacia_log");
        beamLog(ModBlocks.dark_oak_log_beam, "dark_oak_log");
        beamLog(ModBlocks.crimson_stem_beam, "crimson_stem");
        beamLog(ModBlocks.warped_stem_beam, "warped_stem");
        beamBasic(ModBlocks.blackstone_beam, "blackstone", "blackstone", true, true);
        beamBasic(ModBlocks.polished_blackstone_beam, "polished_blackstone", "polished_blackstone", true, true);
        beamBasic(ModBlocks.stone_beam, "stone", "stone", true, true);
        beamBasic(ModBlocks.smooth_stone_beam, "smooth_stone", "smooth_stone", false, true);
        beamBasic(ModBlocks.cobblestone_beam, "cobblestone", "cobblestone", true, true);
        beamBasic(ModBlocks.mossy_cobblestone_beam, "mossy_cobblestone", "mossy_cobblestone", true, true);
        beamTopBottom(ModBlocks.sandstone_beam, "sandstone", "sandstone", true, true);
        beamBasic(ModBlocks.smooth_sandstone_beam, "smooth_sandstone", "sandstone_top", "smooth_sandstone", true, true);
        beamTopBottom(ModBlocks.red_sandstone_beam, "red_sandstone", "red_sandstone", true, true);
        beamBasic(ModBlocks.smooth_red_sandstone_beam, "smooth_red_sandstone", "red_sandstone_top", "smooth_red_sandstone", true, true);
        beamBasic(ModBlocks.stone_brick_beam, "stone_brick", "stone_bricks", true, true);
        beamBasic(ModBlocks.cracked_stone_brick_beam, "cracked_stone_brick", "cracked_stone_bricks", false, false);
        beamBasic(ModBlocks.mossy_stone_brick_beam, "mossy_stone_brick", "mossy_stone_bricks", true, true);
        beamBasic(ModBlocks.prismarine_beam, "prismarine", "prismarine", true, true);
        beamBasic(ModBlocks.prismarine_brick_beam, "prismarine_brick", "prismarine_bricks", true, true);
        beamBasic(ModBlocks.dark_prismarine_beam, "dark_prismarine", "dark_prismarine", true, true);
        beamBasic(ModBlocks.purpur_beam, "purpur", "purpur_block", true, true);
    }

    public void fenceTopBottom(RegistryObject<? extends FenceBlock> block, String side, String top, String bottom) {
        String baseName = block.getId().getPath();
        fourWayBlock(block.get(),
                models().fencePostTopBottom(baseName + "_post", this.locVanilla(side), this.locVanilla(top), this.locVanilla(bottom)),
                models().fenceSide(baseName + "_side", this.locVanilla(side)));
    }

    public void fenceGateTopBottom(RegistryObject<? extends FenceGateBlock> block, String side, String top, String bottom) {
        String name = block.getId().toString();
        ModelFile gate =         models().fenceGateTopBottom(name, locVanilla(side), locVanilla(top), locVanilla(bottom));
        ModelFile gateOpen =     models().fenceGateOpenTopBottom(name + "_open", locVanilla(side), locVanilla(top), locVanilla(bottom));
        ModelFile gateWall =     models().fenceGateWallTopBottom(name + "_wall", locVanilla(side), locVanilla(top), locVanilla(bottom));
        ModelFile gateWallOpen = models().fenceGateWallOpenTopBottom(name + "_wall_open", locVanilla(side), locVanilla(top), locVanilla(bottom));

        fenceGateBlock(block.get(), gate, gateOpen, gateWall, gateWallOpen);
    }

    public void doorBlockTopBottom(RegistryObject<? extends DoorBlock> block, String side, String top, String bottom) {
        String name = block.getId().toString();
        ModelFile bottomLeft = models().doorBottomLeftTB(name + "_bottom", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile bottomRight = models().doorBottomRightTB(name + "_bottom_hinge", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile topLeft = models().doorTopLeftTB(name + "_top", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile topRight = models().doorTopRightTB(name + "_top_hinge", locVanilla(side), locVanilla(bottom), locVanilla(top));
        
        doorBlock(block.get(), bottomLeft, bottomRight, topLeft, topRight);
    }

    public void poleLog(RegistryObject<? extends OrnamentPole> block, String name) {
        String blockname = block.getId().toString();
        ModelFile corner = models().poleCornerColumn(blockname + "_corner", locVanilla(name), locVanilla(name + "_top"));
        ModelFile half = models().slabVerticalColumn(blockname + "_half", locVanilla(name), locVanilla(name + "_top"));
        ModelFile cross = models().poleCrossColumn(blockname + "_cross", locVanilla(name), locVanilla(name + "_top"));
        ModelFile fill = models().stairsStraightSideColumn(blockname + "_fill", locVanilla(name), locVanilla(name + "_top"));
        ModelFile full = models().getExistingFile(locVanilla(name));

        this.poleBlock(block, corner, half, cross, fill, full);
    }

    public void poleTopBottom(RegistryObject<? extends OrnamentPole> block, String side, String top, String bottom) {
        String blockname = block.getId().toString();
        ModelFile corner = models().poleCornerTB(blockname + "_corner", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile half = models().slabVerticalTB(blockname + "_half", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile cross = models().poleCrossTB(blockname + "_cross", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile fill = models().stairsStraightSideTB(blockname + "_fill", locVanilla(side), locVanilla(bottom), locVanilla(top));
        ModelFile full = models().getExistingFile(locVanilla(side));

        this.poleBlock(block, corner, half, cross, fill, full);
    }

    public void beamLog(RegistryObject<? extends OrnamentBeam> block, String name) {
        String namebottom = name + "_slab";
        String nametop = namebottom + "_top";
        String namehalf = name + "_pole_half";
        String stairs = name + "_stairs";

        ModelFile corner = models().beamCornerColumn(block.getId().toString() + "_corner", locVanilla(name), locVanilla(name + "_top"));
        ModelFile top = models().getExistingFile(locOrnament(nametop));
        ModelFile bottom = models().getExistingFile(locOrnament(namebottom));
        ModelFile side = models().getExistingFile(locOrnament(namehalf));
        ModelFile cross  = models().beamCrossColumn(block.getId().toString() + "_cross", locVanilla(name), locVanilla(name + "_top"));
        ModelFile fill   = models().getExistingFile(locOrnament(stairs));
        ModelFile full   = models().getExistingFile(locVanilla(name));

        beamBlock(block, corner, top, bottom, side, cross, fill, full);
    }

    public void beamTopBottom(RegistryObject<? extends OrnamentBeam> block, String base, String name, boolean vstairs, boolean vslab) {
        String namebottom = base + "_slab";
        String nametop = namebottom + "_top";
        String namehalf = base + "_pole_half";
        String stairs = base + "_stairs";

        ModelFile corner = models().beamCornerTB(block.getId().toString() + "_corner", locVanilla(name), locVanilla(name + "_bottom"), locVanilla(name + "_top"));
        ModelFile top = models().getExistingFile(vslab ? locVanilla(nametop) : locOrnament(nametop));
        ModelFile bottom = models().getExistingFile(vslab ? locVanilla(namebottom) : locOrnament(namebottom));
        ModelFile side = models().getExistingFile(vslab ? locVanilla(namebottom) : locOrnament(namehalf));
        ModelFile cross  = models().beamCrossTB(block.getId().toString() + "_cross", locVanilla(name), locVanilla(name + "_bottom"), locVanilla(name + "_top"));
        ModelFile fill   = models().getExistingFile(vstairs ? locVanilla(stairs) : locOrnament(stairs));
        ModelFile full   = models().getExistingFile(locVanilla(name));

        beamBlock(block, corner, top, bottom, side, cross, fill, full);
    }
}
