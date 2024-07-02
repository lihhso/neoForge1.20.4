package net.lihao.haohaomod.until;

import net.lihao.haohaomod.block.ModBlocks;
import net.lihao.haohaomod.item.ModCreativeTab;
import net.lihao.haohaomod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add(Moditems.RUBY.get(),"红宝石");
        this.add(ModBlocks.RUBY_BLOCK.get(),"红宝石块");
        this.add(ModBlocks.LAMP_BLOCK.get(),"灯笼");
        this.add(ModCreativeTab.EXAMPLE_MOD_TAB_STRING.toString(),"浩浩");
        this.add(Moditems.MAGIC_INGOT.get(),"魔力石");
        this.add("object.examplemod.example_object","Example Object");
    }
}
