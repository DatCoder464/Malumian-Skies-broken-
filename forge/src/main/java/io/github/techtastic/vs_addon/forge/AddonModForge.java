package io.github.techtastic.vs_addon.forge;

import dev.architectury.platform.forge.EventBuses;
import io.github.techtastic.vs_addon.AddonMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AddonMod.MOD_ID)
public class AddonModForge {

    public AddonModForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(AddonMod.MOD_ID, bus);
        bus.addListener(this::clientSetup);

        AddonMod.init();
    }

    void clientSetup(final FMLClientSetupEvent event) {
        AddonMod.initClient();
    }
}
