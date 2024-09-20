package github.gurakai.gme_materials.initilization;

import github.gurakai.gme_materials.gme_materials;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(75f, 1500f)
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
                    .mapColor(MapColor.COLOR_RED)
                    .strength(6f, 13f)
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

    public static final RegistryObject<Block> block_the_rarest_steak = BLOCKS.register("block_the_rarest_steak",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK)
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.1f)
                    .instrument(NoteBlockInstrument.BASS)
                    .pushReaction(PushReaction.DESTROY)
            ));

    public static final RegistryObject<Block> ingot_block_platinum = BLOCKS.register("ingot_block_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(ingot_block_red_silvarium.get())
                    .mapColor(MapColor.COLOR_CYAN)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.PUSH_ONLY)
            ));

    //ores

    public static final RegistryObject<DropExperienceBlock> ore_nickel = BLOCKS.register("ore_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3.0f),
                    UniformInt.of(0,2)
            ));

    public static final RegistryObject<DropExperienceBlock> ore_deepslate_nickel = BLOCKS.register("ore_deepslate_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(4.5f,3.0f),
                    UniformInt.of(1,3)
            ));

    public static final RegistryObject<DropExperienceBlock> ore_silver = BLOCKS.register("ore_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)
                    .strength(3.0f),
                    UniformInt.of(0,2)
            ));

    public static final RegistryObject<DropExperienceBlock> ore_deepslate_silver = BLOCKS.register("ore_deepslate_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)
                    .strength(4.5f,3.0f),
                    UniformInt.of(1,3)
            ));

//compressed blocks

    public static final RegistryObject<Block> compressed_cobblestone_singularity = BLOCKS.register("compressed_cobblestone_singularity",
            () -> new Block(BlockBehaviour.Properties.copy(ingot_block_guralloy.get())
                    .strength(150f,3000f)
            ));

    public static final RegistryObject<Block> compressed_cobblestone_9 = BLOCKS.register("compressed_cobblestone_9",
            () -> new Block(BlockBehaviour.Properties.copy(ingot_block_guralloy.get())
            ));

    public static final RegistryObject<Block> compressed_cobblestone_8 = BLOCKS.register("compressed_cobblestone_8",
            () -> new Block(BlockBehaviour.Properties.copy(ingot_block_guralloy.get())
            ));

    public static final RegistryObject<Block> compressed_cobblestone_7 = BLOCKS.register("compressed_cobblestone_7",
            () -> new Block(BlockBehaviour.Properties.copy(ingot_block_guralloy.get())
            ));

    public static final RegistryObject<Block> compressed_cobblestone_6 = BLOCKS.register("compressed_cobblestone_6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
            ));

    public static final RegistryObject<Block> compressed_cobblestone_5 = BLOCKS.register("compressed_cobblestone_5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
            ));

    public static final RegistryObject<Block> compressed_cobblestone_4 = BLOCKS.register("compressed_cobblestone_4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)
            ));

    public static final RegistryObject<Block> compressed_cobblestone_3 = BLOCKS.register("compressed_cobblestone_3",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
            ));

    public static final RegistryObject<Block> compressed_cobblestone_2 = BLOCKS.register("compressed_cobblestone_2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
            ));

    public static final RegistryObject<Block> compressed_cobblestone = BLOCKS.register("compressed_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
            ));

}