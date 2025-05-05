package net.mattias.pedestals.core.registry;

import net.mattias.pedestals.core.Constants;
import net.mattias.pedestals.core.world.inventory.PedestalMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, Constants.MOD_ID);


    public static final Supplier<MenuType<PedestalMenu>> PEDESTAL =
                    MENUS.register("pedestal", () -> IMenuTypeExtension.create(PedestalMenu::new));


    public static void register(IEventBus modEventBus) {
        MENUS.register(modEventBus);
    }
}
