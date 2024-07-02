package net.lihao.haohaomod.block;

import net.lihao.haohaomod.ExampleMod;
import net.lihao.haohaomod.block.custom.LampBlock;
import net.lihao.haohaomod.block.custom.RubyBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.lihao.haohaomod.item.Moditems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, ExampleMod.MODID);
    public static final Supplier<Block> LAMP_BLOCK = registerBlock("lamp_block",
            ()->new LampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).strength(6f)
                    .requiresCorrectToolForDrops()
                    //亮度，当状态LIT为ture时则15的亮度，当false时为0
            .lightLevel(state->state.getValue(LampBlock.LIT)?15:0)));
    public static final Supplier<Block> RUBY_BLOCK = registerBlock("ruby_block", RubyBlock::new);
    //这三个方法作用就是将item和block共同绑定了，就不用在item里面再次绑定
    public static Supplier<Block> registerBlock(String name,Supplier<Block> block){
        Supplier<Block> toReturn = BLOCKS.register(name, block);
        // public static final Supplier<Item> RUBY_BLOCK = ITEMS.register("ruby_block",
        // ()->new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties()));
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    public static void registerBlockItem(String name, Supplier<Block> block){
        registerBlockItem(name, block, new Item.Properties());
    }
    public static void registerBlockItem(String name, Supplier<Block> block, Item.Properties properties){
        ITEMS.register(name, () -> new BlockItem(block.get(), properties));
    }





    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
