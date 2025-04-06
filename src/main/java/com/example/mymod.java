package com.example;

import com.example.commands.Commands;
import com.example.features.dwarvenmines.MithrilPowderTracker;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "mymod", useMetadata=true)
public class mymod {
    public Commands commands;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        this.commands = new Commands();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MithrilPowderTracker());
    }

    @SubscribeEvent
    public void onOverlayRender(RenderGameOverlayEvent.Text event) {

    }
}
