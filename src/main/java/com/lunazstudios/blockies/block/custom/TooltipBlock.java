package com.lunazstudios.blockies.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TooltipBlock extends Block {
    private final String tooltipTranslation;
    public TooltipBlock(Settings settings, String tooltipTranslation) {
        super(settings);
        this.tooltipTranslation = tooltipTranslation;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable(tooltipTranslation).setStyle(Style.EMPTY.withColor(Formatting.GRAY)));

        super.appendTooltip(stack, world, tooltip, options);
    }
}
