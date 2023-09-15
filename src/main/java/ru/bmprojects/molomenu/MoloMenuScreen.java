package ru.bmprojects.molomenu;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Options;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.client.gui.screens.OptionsSubScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.gui.screens.worldselection.WorldSelectionList;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ScreenEvent;
import org.checkerframework.checker.signature.qual.Identifier;
import ru.bmprojects.molomenu.client.screens.widget.button.BaseButton;

import java.util.Stack;

import static net.minecraft.client.renderer.entity.ShulkerRenderer.getTextureLocation;

public class MoloMenuScreen extends Screen {
    public MoloMenuScreen() {
        super(Component.translatable("narrator.screen.title"));
    }


    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float partialTick) {
        RenderSystem.setShaderTexture(0, new ResourceLocation("molomenu","textures/background.png"));
        blit(stack, 0, 0, 0, 0, width, height, width, height);
        super.render(stack, mouseX, mouseY, partialTick);
    }

    protected void init() {
        int j = this.height / 4 + 48;
        this.createNormalMenuOptions();
        this.addRenderableWidget(new BaseButton(0, this.height / 2 + 0, 160, 20, Component.translatable("menu.options"),
                (p_213096_1_) -> this.minecraft.setScreen(new OptionsScreen(this, this.minecraft.options), RenderSystem.setShaderTexture(0, new ResourceLocation("textures/gui/options.png")));
    }
    private void createNormalMenuOptions() {

    }
}