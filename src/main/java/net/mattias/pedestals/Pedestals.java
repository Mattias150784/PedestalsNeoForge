package net.mattias.pedestals;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.ModList;
import org.slf4j.Logger;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.optional.BasePedestalVariants;
import net.mattias.pedestals.core.optional.BiomeOPlentyVariants;
import net.mattias.pedestals.core.registry.ObjectRegistry;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class Pedestals {

    public static IEventBus EVENT_BUS;
    private static final Logger LOGGER = LogUtils.getLogger();


    public Pedestals(IEventBus modEventBus) {
        EVENT_BUS = modEventBus;

        BasePedestalVariants.define();
        if (ModList.get().isLoaded("biomesoplenty")) {
            BiomeOPlentyVariants.define();
        }

        ObjectRegistry.register(EVENT_BUS);

        LOGGER.info("Pedestals (NeoForge) initialized with mod-bus {}", EVENT_BUS);
    }


    public static ResourceLocation identifier(String path) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, path);
    }
}
