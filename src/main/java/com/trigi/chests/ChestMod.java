package com.trigi.chests;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("chests")
public class ChestMod {
    public ChestMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
