package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInitialization {
    public static final TagKey<Block> NEEDS_GURALLOY_TOOL = tag("needs_guralloy_tool");

    private static TagKey<Block> tag(String name) {

        return BlockTags.create(new ResourceLocation(gme_materials.MODID, name));
    }
}
