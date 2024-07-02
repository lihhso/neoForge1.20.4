package net.lihao.haohaomod.event.client;

import com.google.common.eventbus.Subscribe;
import net.lihao.haohaomod.ExampleMod;
import net.lihao.haohaomod.item.Moditems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
public class PropertyRegistry {
    @SubscribeEvent
    public static void propertyOverrideRegistry(FMLClientSetupEvent event){
        ItemProperties.register(Moditems.MAGIC_INGOT.get(),new ResourceLocation(ExampleMod.MODID,"size"),(itemStack, level, livingEntity, num)->{
            return itemStack.getCount();
        });
    }
}
