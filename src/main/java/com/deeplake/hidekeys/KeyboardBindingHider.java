package com.deeplake.hidekeys;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class KeyboardBindingHider {
    //Subscribe to open GUI event,
    @SubscribeEvent
    public static void onOpenGui(net.minecraftforge.client.event.GuiOpenEvent event) {
        //If the event is not canceled, and the GUI is a keybinding GUI, cancel the event
        if (!event.isCanceled() && event.getGui() instanceof net.minecraft.client.gui.GuiControls) {

        }
    }

}
