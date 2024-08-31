package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInitialization {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, gme_materials.MODID);

    public static final RegistryObject<Block> ingot_block_guralloy = BLOCKS.register("ingot_block_guralloy",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(10f, 17f)
                    .instrument(NoteBlockInstrument.DIDGERIDOO)
                    .lightLevel(state -> 5)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> ingot_block_invar = BLOCKS.register("ingot_block_invar",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.COW_BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final  RegistryObject<Block> ingot_block_nickel = BLOCKS.register("ingot_block_nickel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> ingot_block_red_silvarium = BLOCKS.register("ingot_block_red_silvarium",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.CHIME)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));

    public static final RegistryObject<Block> ingot_block_silver = BLOCKS.register("ingot_block_silver",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(5f, 13f)
                    .instrument(NoteBlockInstrument.BELL)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.NORMAL)
            ));
}
