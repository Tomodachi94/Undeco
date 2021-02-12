package com.androsa.undeco;

import com.androsa.ornamental.blocks.*;
import com.androsa.ornamental.builder.OrnamentBuilder;
import com.androsa.ornamental.items.OrnamentBlockItem;
import com.androsa.ornamental.items.OrnamentTallBlockItem;
import com.androsa.ornamental.registry.PropertiesHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnusuallyDecorative.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnusuallyDecorative.MODID);

    public static final RegistryObject<OrnamentStairs> oak_log_stairs = registerStairs(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentStairs> spruce_log_stairs = registerStairs(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentStairs> birch_log_stairs = registerStairs(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentStairs> jungle_log_stairs = registerStairs(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentStairs> acacia_log_stairs = registerStairs(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentStairs> dark_oak_log_stairs = registerStairs(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentStairs> crimson_stem_stairs = registerStairs(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentStairs> warped_stem_stairs = registerStairs(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentStairs> smooth_stone_stairs = registerStairs(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentStairs> cracked_stone_brick_stairs = registerStairs(UDBuilders.CRACKED_STONE_BRICKS);

    public static final RegistryObject<OrnamentSlab> oak_log_slab = registerSlab(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentSlab> spruce_log_slab = registerSlab(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentSlab> birch_log_slab = registerSlab(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentSlab> jungle_log_slab = registerSlab(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentSlab> acacia_log_slab = registerSlab(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentSlab> dark_oak_log_slab = registerSlab(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentSlab> crimson_stem_slab = registerSlab(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentSlab> warped_stem_slab = registerSlab(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentSlab> cracked_stone_brick_slab = registerSlab(UDBuilders.CRACKED_STONE_BRICKS);

    public static final RegistryObject<OrnamentFence> granite_fence = registerFence(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentFence> polished_granite_fence = registerFence(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentFence> diorite_fence = registerFence(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentFence> polished_diorite_fence = registerFence(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentFence> andesite_fence = registerFence(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentFence> polished_andesite_fence = registerFence(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentFence> oak_log_fence = registerFence(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentFence> spruce_log_fence = registerFence(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentFence> birch_log_fence = registerFence(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentFence> jungle_log_fence = registerFence(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentFence> acacia_log_fence = registerFence(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentFence> dark_oak_log_fence = registerFence(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentFence> crimson_stem_fence = registerFence(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentFence> warped_stem_fence = registerFence(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentFence> blackstone_fence = registerFence(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentFence> polished_blackstone_fence = registerFence(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentFence> stone_fence = registerFence(UDBuilders.STONE);
    public static final RegistryObject<OrnamentFence> smooth_stone_fence = registerFence(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentFence> cobblestone_fence = registerFence(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentFence> mossy_cobblestone_fence = registerFence(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentFence> sandstone_fence = registerFence(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentFence> smooth_sandstone_fence = registerFence(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentFence> red_sandstone_fence = registerFence(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentFence> smooth_red_sandstone_fence = registerFence(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentFence> stone_brick_fence = registerFence(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentFence> cracked_stone_brick_fence = registerFence(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentFence> mossy_stone_brick_fence = registerFence(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentFence> prismarine_fence = registerFence(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentFence> prismarine_brick_fence = registerFence(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentFence> dark_prismarine_fence = registerFence(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentFence> purpur_fence = registerFence(UDBuilders.PURPUR);

    public static final RegistryObject<OrnamentTrapDoor> granite_trapdoor = registerTrapdoor(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentTrapDoor> polished_granite_trapdoor = registerTrapdoor(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentTrapDoor> diorite_trapdoor = registerTrapdoor(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentTrapDoor> polished_diorite_trapdoor = registerTrapdoor(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentTrapDoor> andesite_trapdoor = registerTrapdoor(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentTrapDoor> polished_andesite_trapdoor = registerTrapdoor(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentTrapDoor> oak_log_trapdoor = registerTrapdoor(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentTrapDoor> spruce_log_trapdoor = registerTrapdoor(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentTrapDoor> birch_log_trapdoor = registerTrapdoor(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentTrapDoor> jungle_log_trapdoor = registerTrapdoor(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentTrapDoor> acacia_log_trapdoor = registerTrapdoor(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentTrapDoor> dark_oak_log_trapdoor = registerTrapdoor(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentTrapDoor> crimson_stem_trapdoor = registerTrapdoor(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentTrapDoor> warped_stem_trapdoor = registerTrapdoor(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentTrapDoor> blackstone_trapdoor = registerTrapdoor(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentTrapDoor> polished_blackstone_trapdoor = registerTrapdoor(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentTrapDoor> stone_trapdoor = registerTrapdoor(UDBuilders.STONE);
    public static final RegistryObject<OrnamentTrapDoor> smooth_stone_trapdoor = registerTrapdoor(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentTrapDoor> cobblestone_trapdoor = registerTrapdoor(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentTrapDoor> mossy_cobblestone_trapdoor = registerTrapdoor(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentTrapDoor> sandstone_trapdoor = registerTrapdoor(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentTrapDoor> smooth_sandstone_trapdoor = registerTrapdoor(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentTrapDoor> red_sandstone_trapdoor = registerTrapdoor(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentTrapDoor> smooth_red_sandstone_trapdoor = registerTrapdoor(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentTrapDoor> stone_brick_trapdoor = registerTrapdoor(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentTrapDoor> cracked_stone_brick_trapdoor = registerTrapdoor(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentTrapDoor> mossy_stone_brick_trapdoor = registerTrapdoor(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentTrapDoor> prismarine_trapdoor = registerTrapdoor(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentTrapDoor> prismarine_brick_trapdoor = registerTrapdoor(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentTrapDoor> dark_prismarine_trapdoor = registerTrapdoor(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentTrapDoor> purpur_trapdoor = registerTrapdoor(UDBuilders.PURPUR);

    public static final RegistryObject<OrnamentFenceGate> granite_fence_gate = registerFenceGate(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentFenceGate> polished_granite_fence_gate = registerFenceGate(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentFenceGate> diorite_fence_gate = registerFenceGate(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentFenceGate> polished_diorite_fence_gate = registerFenceGate(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentFenceGate> andesite_fence_gate = registerFenceGate(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentFenceGate> polished_andesite_fence_gate = registerFenceGate(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentFenceGate> oak_log_fence_gate = registerFenceGate(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentFenceGate> spruce_log_fence_gate = registerFenceGate(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentFenceGate> birch_log_fence_gate = registerFenceGate(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentFenceGate> jungle_log_fence_gate = registerFenceGate(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentFenceGate> acacia_log_fence_gate = registerFenceGate(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentFenceGate> dark_oak_log_fence_gate = registerFenceGate(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentFenceGate> crimson_stem_fence_gate = registerFenceGate(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentFenceGate> warped_stem_fence_gate = registerFenceGate(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentFenceGate> blackstone_fence_gate = registerFenceGate(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentFenceGate> polished_blackstone_fence_gate = registerFenceGate(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentFenceGate> stone_fence_gate = registerFenceGate(UDBuilders.STONE);
    public static final RegistryObject<OrnamentFenceGate> smooth_stone_fence_gate = registerFenceGate(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentFenceGate> cobblestone_fence_gate = registerFenceGate(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentFenceGate> mossy_cobblestone_fence_gate = registerFenceGate(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentFenceGate> sandstone_fence_gate = registerFenceGate(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentFenceGate> smooth_sandstone_fence_gate = registerFenceGate(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentFenceGate> red_sandstone_fence_gate = registerFenceGate(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentFenceGate> smooth_red_sandstone_fence_gate = registerFenceGate(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentFenceGate> stone_brick_fence_gate = registerFenceGate(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentFenceGate> cracked_stone_brick_fence_gate = registerFenceGate(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentFenceGate> mossy_stone_brick_fence_gate = registerFenceGate(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentFenceGate> prismarine_fence_gate = registerFenceGate(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentFenceGate> prismarine_brick_fence_gate = registerFenceGate(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentFenceGate> dark_prismarine_fence_gate = registerFenceGate(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentFenceGate> purpur_fence_gate = registerFenceGate(UDBuilders.PURPUR);

    public static final RegistryObject<OrnamentDoor> granite_door = registerDoor(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentDoor> polished_granite_door = registerDoor(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentDoor> diorite_door = registerDoor(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentDoor> polished_diorite_door = registerDoor(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentDoor> andesite_door = registerDoor(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentDoor> polished_andesite_door = registerDoor(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentDoor> oak_log_door = registerDoor(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentDoor> spruce_log_door = registerDoor(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentDoor> birch_log_door = registerDoor(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentDoor> jungle_log_door = registerDoor(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentDoor> acacia_log_door = registerDoor(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentDoor> dark_oak_log_door = registerDoor(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentDoor> crimson_stem_door = registerDoor(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentDoor> warped_stem_door = registerDoor(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentDoor> blackstone_door = registerDoor(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentDoor> polished_blackstone_door = registerDoor(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentDoor> stone_door = registerDoor(UDBuilders.STONE);
    public static final RegistryObject<OrnamentDoor> smooth_stone_door = registerDoor(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentDoor> cobblestone_door = registerDoor(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentDoor> mossy_cobblestone_door = registerDoor(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentDoor> sandstone_door = registerDoor(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentDoor> smooth_sandstone_door = registerDoor(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentDoor> red_sandstone_door = registerDoor(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentDoor> smooth_red_sandstone_door = registerDoor(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentDoor> stone_brick_door = registerDoor(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentDoor> cracked_stone_brick_door = registerDoor(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentDoor> mossy_stone_brick_door = registerDoor(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentDoor> prismarine_door = registerDoor(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentDoor> prismarine_brick_door = registerDoor(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentDoor> dark_prismarine_door = registerDoor(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentDoor> purpur_door = registerDoor(UDBuilders.PURPUR);

    public static final RegistryObject<OrnamentPole> oak_pole = registerPole(UDBuilders.OAK_PLANKS);
    public static final RegistryObject<OrnamentPole> spruce_pole = registerPole(UDBuilders.SPRUCE_PLANKS);
    public static final RegistryObject<OrnamentPole> birch_pole = registerPole(UDBuilders.BIRCH_PLANKS);
    public static final RegistryObject<OrnamentPole> jungle_pole = registerPole(UDBuilders.JUNGLE_PLANKS);
    public static final RegistryObject<OrnamentPole> acacia_pole = registerPole(UDBuilders.ACACIA_PLANKS);
    public static final RegistryObject<OrnamentPole> dark_oak_pole = registerPole(UDBuilders.DARK_OAK_PLANKS);
    public static final RegistryObject<OrnamentPole> crimson_pole = registerPole(UDBuilders.CRIMSON_PLANKS);
    public static final RegistryObject<OrnamentPole> warped_pole = registerPole(UDBuilders.WARPED_PLANKS);
    public static final RegistryObject<OrnamentPole> granite_pole = registerPole(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentPole> polished_granite_pole = registerPole(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentPole> diorite_pole = registerPole(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentPole> polished_diorite_pole = registerPole(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentPole> andesite_pole = registerPole(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentPole> polished_andesite_pole = registerPole(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentPole> oak_log_pole = registerPole(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentPole> spruce_log_pole = registerPole(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentPole> birch_log_pole = registerPole(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentPole> jungle_log_pole = registerPole(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentPole> acacia_log_pole = registerPole(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentPole> dark_oak_log_pole = registerPole(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentPole> crimson_stem_pole = registerPole(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentPole> warped_stem_pole = registerPole(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentPole> blackstone_pole = registerPole(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentPole> polished_blackstone_pole = registerPole(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentPole> stone_pole = registerPole(UDBuilders.STONE);
    public static final RegistryObject<OrnamentPole> smooth_stone_pole = registerPole(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentPole> cobblestone_pole = registerPole(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentPole> mossy_cobblestone_pole = registerPole(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentPole> sandstone_pole = registerPole(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentPole> smooth_sandstone_pole = registerPole(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentPole> red_sandstone_pole = registerPole(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentPole> smooth_red_sandstone_pole = registerPole(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentPole> stone_brick_pole = registerPole(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentPole> cracked_stone_brick_pole = registerPole(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentPole> mossy_stone_brick_pole = registerPole(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentPole> prismarine_pole = registerPole(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentPole> prismarine_brick_pole = registerPole(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentPole> dark_prismarine_pole = registerPole(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentPole> purpur_pole = registerPole(UDBuilders.PURPUR);

    public static final RegistryObject<OrnamentBeam> oak_beam = registerBeam(UDBuilders.OAK_PLANKS);
    public static final RegistryObject<OrnamentBeam> spruce_beam = registerBeam(UDBuilders.SPRUCE_PLANKS);
    public static final RegistryObject<OrnamentBeam> birch_beam = registerBeam(UDBuilders.BIRCH_PLANKS);
    public static final RegistryObject<OrnamentBeam> jungle_beam = registerBeam(UDBuilders.JUNGLE_PLANKS);
    public static final RegistryObject<OrnamentBeam> acacia_beam = registerBeam(UDBuilders.ACACIA_PLANKS);
    public static final RegistryObject<OrnamentBeam> dark_oak_beam = registerBeam(UDBuilders.DARK_OAK_PLANKS);
    public static final RegistryObject<OrnamentBeam> crimson_beam = registerBeam(UDBuilders.CRIMSON_PLANKS);
    public static final RegistryObject<OrnamentBeam> warped_beam = registerBeam(UDBuilders.WARPED_PLANKS);
    public static final RegistryObject<OrnamentBeam> granite_beam = registerBeam(UDBuilders.GRANITE);
    public static final RegistryObject<OrnamentBeam> polished_granite_beam = registerBeam(UDBuilders.POLISHED_GRANITE);
    public static final RegistryObject<OrnamentBeam> diorite_beam = registerBeam(UDBuilders.DIORITE);
    public static final RegistryObject<OrnamentBeam> polished_diorite_beam = registerBeam(UDBuilders.POLISHED_DIORITE);
    public static final RegistryObject<OrnamentBeam> andesite_beam = registerBeam(UDBuilders.ANDESITE);
    public static final RegistryObject<OrnamentBeam> polished_andesite_beam = registerBeam(UDBuilders.POLISHED_ANDESITE);
    public static final RegistryObject<OrnamentBeam> oak_log_beam = registerBeam(UDBuilders.OAK_LOG);
    public static final RegistryObject<OrnamentBeam> spruce_log_beam = registerBeam(UDBuilders.SPRUCE_LOG);
    public static final RegistryObject<OrnamentBeam> birch_log_beam = registerBeam(UDBuilders.BIRCH_LOG);
    public static final RegistryObject<OrnamentBeam> jungle_log_beam = registerBeam(UDBuilders.JUNGLE_LOG);
    public static final RegistryObject<OrnamentBeam> acacia_log_beam = registerBeam(UDBuilders.ACACIA_LOG);
    public static final RegistryObject<OrnamentBeam> dark_oak_log_beam = registerBeam(UDBuilders.DARK_OAK_LOG);
    public static final RegistryObject<OrnamentBeam> crimson_stem_beam = registerBeam(UDBuilders.CRIMSON_STEM);
    public static final RegistryObject<OrnamentBeam> warped_stem_beam = registerBeam(UDBuilders.WARPED_STEM);
    public static final RegistryObject<OrnamentBeam> blackstone_beam = registerBeam(UDBuilders.BLACKSTONE);
    public static final RegistryObject<OrnamentBeam> polished_blackstone_beam = registerBeam(UDBuilders.POLISHED_BLACKSTONE);
    public static final RegistryObject<OrnamentBeam> stone_beam = registerBeam(UDBuilders.STONE);
    public static final RegistryObject<OrnamentBeam> smooth_stone_beam = registerBeam(UDBuilders.SMOOTH_STONE);
    public static final RegistryObject<OrnamentBeam> cobblestone_beam = registerBeam(UDBuilders.COBBLESTONE);
    public static final RegistryObject<OrnamentBeam> mossy_cobblestone_beam = registerBeam(UDBuilders.MOSSY_COBBLESTONE);
    public static final RegistryObject<OrnamentBeam> sandstone_beam = registerBeam(UDBuilders.SANDSTONE);
    public static final RegistryObject<OrnamentBeam> smooth_sandstone_beam = registerBeam(UDBuilders.SMOOTH_SANDSTONE);
    public static final RegistryObject<OrnamentBeam> red_sandstone_beam = registerBeam(UDBuilders.RED_SANDSTONE);
    public static final RegistryObject<OrnamentBeam> smooth_red_sandstone_beam = registerBeam(UDBuilders.SMOOTH_RED_SANDSTONE);
    public static final RegistryObject<OrnamentBeam> stone_brick_beam = registerBeam(UDBuilders.STONE_BRICKS);
    public static final RegistryObject<OrnamentBeam> cracked_stone_brick_beam = registerBeam(UDBuilders.CRACKED_STONE_BRICKS);
    public static final RegistryObject<OrnamentBeam> mossy_stone_brick_beam = registerBeam(UDBuilders.MOSSY_STONE_BRICKS);
    public static final RegistryObject<OrnamentBeam> prismarine_beam = registerBeam(UDBuilders.PRISMARINE);
    public static final RegistryObject<OrnamentBeam> prismarine_brick_beam = registerBeam(UDBuilders.PRISMARINE_BRICKS);
    public static final RegistryObject<OrnamentBeam> dark_prismarine_beam = registerBeam(UDBuilders.DARK_PRISMARINE);
    public static final RegistryObject<OrnamentBeam> purpur_beam = registerBeam(UDBuilders.PURPUR);

    private static RegistryObject<OrnamentStairs> registerStairs(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);
        return registerBlock(builder.name + "_stairs", () -> new OrnamentStairs(props, builder), (item) -> registerBlockItem(item, ItemGroup.BUILDING_BLOCKS, builder, 4));
    }

    private static RegistryObject<OrnamentSlab> registerSlab(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);
        return registerBlock(builder.name + "_slab", () -> new OrnamentSlab(props, builder), (item) -> registerBlockItem(item, ItemGroup.BUILDING_BLOCKS, builder, 3));
    }

    private static RegistryObject<OrnamentFence> registerFence(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);
        return registerBlock(builder.name + "_fence", () -> new OrnamentFence(props, builder), item -> registerBlockItem(item, ItemGroup.DECORATIONS, builder, 1));
    }

    private static RegistryObject<OrnamentTrapDoor> registerTrapdoor(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder)
                .notSolid()
                .setAllowsSpawn((state, reader, pos, type) -> false);

        return registerBlock(builder.name + "_trapdoor", () -> new OrnamentTrapDoor(props, builder), item ->
                registerBlockItem(item, ItemGroup.REDSTONE, builder, 5));
    }

    private static RegistryObject<OrnamentFenceGate> registerFenceGate(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);

        return registerBlock(builder.name + "_fence_gate", () -> new OrnamentFenceGate(props, builder), item ->
                registerBlockItem(item, ItemGroup.REDSTONE, builder, 2));
    }

    private static RegistryObject<OrnamentDoor> registerDoor(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder).notSolid();

        return registerBlock(builder.name + "_door", () -> new OrnamentDoor(props, builder), item ->
                registerBlockItemDoor(item, builder, 0));
    }

    private static RegistryObject<OrnamentPole> registerPole(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);

        return registerBlock(builder.name + "_pole", () -> new OrnamentPole(props, builder), item ->
                registerBlockItem(item, ItemGroup.BUILDING_BLOCKS, builder, 6));
    }

    private static RegistryObject<OrnamentBeam> registerBeam(OrnamentBuilder builder) {
        AbstractBlock.Properties props = PropertiesHelper.createProps(builder);

        return registerBlock(builder.name + "_beam", () -> new OrnamentBeam(props, builder), item ->
                registerBlockItem(item, ItemGroup.BUILDING_BLOCKS, builder, 7));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> reg = BLOCKS.register(name, block);
        ITEMS.register(name, item.apply(reg));
        return reg;
    }

    private static <T extends Block> Supplier<BlockItem> registerBlockItem(RegistryObject<T> block, ItemGroup group, OrnamentBuilder ornament, int fuelindex) {
        return () -> new OrnamentBlockItem(block.get(), PropertiesHelper.createProps(ornament, group), ornament, fuelindex);
    }

    private static <T extends Block> Supplier<BlockItem> registerBlockItemDoor(final RegistryObject<T> block, OrnamentBuilder ornament, int fuelindex) {
        return () -> new OrnamentTallBlockItem(block.get(), PropertiesHelper.createProps(ornament, ItemGroup.REDSTONE), ornament, fuelindex);
    }
}
