package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class BlockInitialization {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, gme_materials.MODID);

    public static final RegistryObject<Block> ingot_block_guralloy = BLOCKS.register("ingot_block_guralloy",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(5.0f, 17f)
                    .instrument(NoteBlockInstrument.BELL)
                    .lightLevel(state -> 10)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));
}
