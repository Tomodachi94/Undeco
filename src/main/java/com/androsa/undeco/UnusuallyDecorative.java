package com.androsa.undeco;

import com.androsa.undeco.data.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(UnusuallyDecorative.MODID)
public class UnusuallyDecorative {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "undeco";

    public UnusuallyDecorative() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::doClientStuff);
        bus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);

        ModBlocks.BLOCKS.register(bus);
        ModBlocks.ITEMS.register(bus);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> UnusuallyDecorative::registerRenderTypes));
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        BlockTagsProvider blockTags = new UDBlockTags(generator, helper);

        if (event.includeClient()) {
            generator.addProvider(new UDBlockstateGenerator(generator, helper));
            generator.addProvider(new UDItemModelGenerator(generator, helper));
        }
        if (event.includeServer()) {
            generator.addProvider(new UDLootTables(generator));
            generator.addProvider(new UDRecipes(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new UDItemTags(generator, blockTags, helper));
        }
    }

    private static void registerRenderTypes() {
        RenderTypeLookup.setRenderLayer(ModBlocks.smooth_sandstone_trapdoor.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.smooth_red_sandstone_trapdoor.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.purpur_trapdoor.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.smooth_sandstone_door.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.smooth_red_sandstone_door.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.purpur_door.get(), RenderType.getCutout());
    }
}
