package net.lesuisse.tunnel.items;

import net.lesuisse.tunnel.Tunnel;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tunnel.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties()));

    public static CreativeModeTab TUNNEL_TAB;

    private void registerTabs(CreativeModeTabEvent.Register event)
    {
        TUNNEL_TAB = event.registerCreativeModeTab(new ResourceLocation(Tunnel.MOD_ID, "tunnel_tab"), builder -> builder
                .icon(() -> new ItemStack(ModItems.ZIRCON.get()))
                .title(Component.translatable("tabs.tunnel.main_tab")));
    }








    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}