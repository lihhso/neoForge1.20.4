package net.lihao.haohaomod.until;

import net.lihao.haohaomod.block.ModBlocks;
import net.lihao.haohaomod.item.Moditems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProviderEn extends LanguageProvider {
    public ModLanguageProviderEn(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        this.add(Moditems.RUBY.get(),"Ruby");
        this.add(ModBlocks.RUBY_BLOCK.get(),"Ruby block");
        this.add(ModBlocks.LAMP_BLOCK.get(),"Lamp Block");
        this.add("object.examplemod.example_object","Example Object");
    }
}
