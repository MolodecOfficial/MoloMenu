package ru.bmprojects.molomenu;

import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoloMenu.MOD_ID)

public class MoloMenu {
    public static final String MOD_ID = "molomenu";

    public static final Logger LOGGER = LogManager.getLogger();


    public MoloMenu() {
        LOGGER.info("Welcome to Recalling Of Past");
        MinecraftForge.EVENT_BUS.addListener(this::OpenGui);
    }

    @OnlyIn(Dist.CLIENT)
    public void OpenGui(ScreenEvent.Opening event) {
        if (event.getScreen() instanceof TitleScreen) {
            LOGGER.info("waiting...");
            event.setNewScreen(new MoloMenuScreen());
        }
    }
}