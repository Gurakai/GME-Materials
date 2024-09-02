package github.gurakai.gme_materials.initilization;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInitialization {
    public static final ForgeTier guralloy = new ForgeTier(
            5,
            3000,
            1.6f,
            4,
            30,
            TagInitialization.NEEDS_GURALLOY_TOOL,
            () -> Ingredient.of(ItemInitialization.ingot_guralloy.get())
    );
}
