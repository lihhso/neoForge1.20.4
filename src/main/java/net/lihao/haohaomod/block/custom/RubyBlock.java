package net.lihao.haohaomod.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class RubyBlock extends Block {
//方块复制了石头修改了硬度ofFullCopy(Blocks.STONE).strength(5f)
    public RubyBlock() {
        super(Properties.ofFullCopy(Blocks.STONE).strength(5f));
    }
}
