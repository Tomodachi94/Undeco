package com.androsa.undeco.data;

import com.androsa.ornamental.data.provider.OrnamentalBlockModelProvider;
import com.androsa.undeco.UnusuallyDecorative;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public abstract class UDBlockModelGenerator extends OrnamentalBlockModelProvider {

    private static final String UD_MODELS = "undeco:block/";

    public UDBlockModelGenerator(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, UnusuallyDecorative.MODID, helper);
    }

    public BlockModelBuilder fencePostTopBottom(String name, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        return withExistingParent(name, UD_MODELS + "fence_post_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder fenceGateTopBottom(String name, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        return withExistingParent(name, UD_MODELS + "fence_gate_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder fenceGateOpenTopBottom(String name, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        return withExistingParent(name, UD_MODELS + "fence_gate_open_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder fenceGateWallTopBottom(String name, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        return withExistingParent(name, UD_MODELS + "fence_gate_wall_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder fenceGateWallOpenTopBottom(String name, ResourceLocation side, ResourceLocation top, ResourceLocation bottom) {
        return withExistingParent(name, UD_MODELS + "fence_gate_wall_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder doorBottomLeftTB(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return doorTopBottom(name, "door_bottom", side, bottom, top);
    }

    public BlockModelBuilder doorBottomRightTB(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return doorTopBottom(name, "door_bottom_rh", side, bottom, top);
    }

    public BlockModelBuilder doorTopLeftTB(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return doorTopBottom(name, "door_top", side, bottom, top);
    }

    public BlockModelBuilder doorTopRightTB(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return doorTopBottom(name, "door_top_rh", side, bottom, top);
    }

    private BlockModelBuilder doorTopBottom(String name, String model, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + model + "_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder poleCornerTB(String name, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "pole_corner_top_bottom")
                .texture("top", top)
                .texture("bottom", bottom)
                .texture("side", side);
    }

    public BlockModelBuilder slabVerticalTB(String name, ResourceLocation side, ResourceLocation end, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "slab_vertical_top_bottom")
                .texture("top", top)
                .texture("side", side)
                .texture("bottom", end);
    }

    public BlockModelBuilder poleCrossTB(String name, ResourceLocation side, ResourceLocation end, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "pole_cross_top_bottom")
                .texture("top", top)
                .texture("side", side)
                .texture("bottom", end);
    }

    public BlockModelBuilder stairsStraightSideTB(String name, ResourceLocation side, ResourceLocation end, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "stairs_straight_side_top_bottom")
                .texture("top", top)
                .texture("side", side)
                .texture("bottom", end);
    }

    public BlockModelBuilder beamCornerTB(String name, ResourceLocation side, ResourceLocation end, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "beam_corner_top_bottom")
                .texture("top", top)
                .texture("side", side)
                .texture("bottom", end);
    }

    public BlockModelBuilder beamCrossTB(String name, ResourceLocation side, ResourceLocation end, ResourceLocation top) {
        return withExistingParent(name, UD_MODELS + "beam_cross_top_bottom")
                .texture("top", top)
                .texture("side", side)
                .texture("bottom", end);
    }
}
