package net.mattias.pedestals.core.optional;

import net.mattias.pedestals.core.util.PedestalVariant;
import net.mattias.pedestals.core.util.PedestalVariants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;


public class CobblemonVariants {

    public static void define() {}

    public static final PedestalVariant APRICORN_PLANKS = PedestalVariants.register(new PedestalVariant("apricorn_planks_pedestal", "apricorn_planks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "apricorn_planks"))));
    public static final PedestalVariant APRICORN_LOG = PedestalVariants.register(new PedestalVariant("apricorn_log_pedestal", "apricorn_log", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "apricorn_planks"))));
   
    public static final PedestalVariant TUMBLESTONE = PedestalVariants.register(new PedestalVariant("tumblestone_pedestal", "tumblestone_block", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "tumblestone_block"))));
    public static final PedestalVariant POLISHED_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("polished_tumblestone_pedestal", "polished_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "polished_tumblestone"))));
    public static final PedestalVariant CHISELED_POLISHED_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("chiseled_polished_tumblestone_pedestal", "chiseled_polished_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_polished_tumblestone"))));
    public static final PedestalVariant TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("tumblestone_bricks_pedestal", "tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "tumblestone_bricks"))));
    public static final PedestalVariant CHISELED_TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("chiseled_tumblestone_bricks_pedestal", "chiseled_tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_tumblestone_bricks"))));
    public static final PedestalVariant SMOOTH_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("smooth_tumblestone_pedestal", "smooth_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "smooth_tumblestone"))));
   
    public static final PedestalVariant POLISHED_BLACK_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("polished_black_tumblestone_pedestal", "polished_black_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "polished_black_tumblestone"))));
    public static final PedestalVariant CHISELED_POLISHED_BLACK_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("chiseled_polished_black_tumblestone_pedestal", "chiseled_polished_black_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_polished_black_tumblestone"))));
    public static final PedestalVariant BLACK_TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("black_tumblestone_bricks_pedestal", "black_tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "black_tumblestone_bricks"))));
    public static final PedestalVariant CHISELED_BLACK_TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("chiseled_black_tumblestone_bricks_pedestal", "chiseled_black_tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_black_tumblestone_bricks"))));
    public static final PedestalVariant SMOOTH_BLACK_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("smooth_black_tumblestone_pedestal", "smooth_black_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "smooth_black_tumblestone"))));
    public static final PedestalVariant BLACK_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("black_tumblestone_pedestal", "black_tumblestone_block", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "black_tumblestone_block"))));

    public static final PedestalVariant POLISHED_SKY_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("polished_sky_tumblestone_pedestal", "polished_sky_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "polished_sky_tumblestone"))));
    public static final PedestalVariant CHISELED_POLISHED_SKY_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("chiseled_polished_sky_tumblestone_pedestal", "chiseled_polished_sky_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_polished_sky_tumblestone"))));
    public static final PedestalVariant SKY_TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("sky_tumblestone_bricks_pedestal", "sky_tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "sky_tumblestone_bricks"))));
    public static final PedestalVariant CHISELED_SKY_TUMBLESTONE_BRICKS = PedestalVariants.register(new PedestalVariant("chiseled_sky_tumblestone_bricks_pedestal", "chiseled_sky_tumblestone_bricks", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "chiseled_sky_tumblestone_bricks"))));
    public static final PedestalVariant SMOOTH_SKY_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("smooth_sky_tumblestone_pedestal", "smooth_sky_tumblestone", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "smooth_sky_tumblestone"))));
    public static final PedestalVariant SKY_TUMBLESTONE = PedestalVariants.register(new PedestalVariant("sky_tumblestone_pedestal", "sky_tumblestone_block", () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("cobblemon", "sky_tumblestone_block"))));


}