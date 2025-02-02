package net.lihao.haohaomod.item;

import net.lihao.haohaomod.ExampleMod;
import net.lihao.haohaomod.item.custom.RubyItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, ExampleMod.MODID);

    public static final Supplier<Item> RUBY = ITEMS.register("ruby",() -> new RubyItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}