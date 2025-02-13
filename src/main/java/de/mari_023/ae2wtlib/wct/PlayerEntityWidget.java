package de.mari_023.ae2wtlib.wct;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

public class PlayerEntityWidget extends AbstractWidget {
    private final LivingEntity entity;

    public PlayerEntityWidget(LivingEntity entity) {
        super(0, 0, 0, 0, Component.empty());
        this.entity = entity;
    }

    @Override
    public void renderWidget(PoseStack poseStack, int mouseX, int mouseY, float f) {
        InventoryScreen.renderEntityInInventoryFollowsMouse(poseStack, getX(), getY(), 30, getX() - mouseX,
                getY() - 44 - mouseY, entity);
    }

    @Override
    protected void updateWidgetNarration(NarrationElementOutput narrationElementOutput) {
    }
}
