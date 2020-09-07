package de.ellpeck.actuallyadditions.mod.blocks.render;

import java.util.Locale;

import de.ellpeck.actuallyadditions.mod.blocks.InitBlocks;
import de.ellpeck.actuallyadditions.mod.misc.cloud.ISmileyCloudEasterEgg;
import de.ellpeck.actuallyadditions.mod.misc.cloud.SmileyCloudEasterEggs;
import de.ellpeck.actuallyadditions.mod.misc.special.RenderSpecial;
import de.ellpeck.actuallyadditions.mod.misc.special.SpecialRenderInit;
import de.ellpeck.actuallyadditions.mod.tile.TileEntitySmileyCloud;
import de.ellpeck.actuallyadditions.mod.util.AssetUtil;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSmileyCloud extends TileEntitySpecialRenderer<TileEntitySmileyCloud> {

    @Override
    public void render(TileEntitySmileyCloud theCloud, double x, double y, double z, float par5, int partial, float f) {
        if (theCloud instanceof TileEntitySmileyCloud) {

            GlStateManager.pushMatrix();
            GlStateManager.translate((float) x + 0.5F, (float) y - 0.5F, (float) z + 0.5F);
            GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);
            GlStateManager.translate(0.0F, -2F, 0.0F);

            if (theCloud.name != null && !theCloud.name.isEmpty()) {
                boolean renderedEaster = false;

                easterEggs: for (ISmileyCloudEasterEgg cloud : SmileyCloudEasterEggs.CLOUD_STUFF) {
                    for (String triggerName : cloud.getTriggerNames()) {
                        if (triggerName != null && theCloud.name != null) {
                            if (triggerName.equalsIgnoreCase(theCloud.name)) {
                                GlStateManager.pushMatrix();

                                IBlockState state = theCloud.getWorld().getBlockState(theCloud.getPos());
                                if (state.getBlock() == InitBlocks.blockSmileyCloud) {
                                    switch (state.getValue(BlockHorizontal.FACING)) {
                                    case NORTH:
                                        GlStateManager.rotate(180, 0, 1, 0);
                                        break;
                                    case EAST:
                                        GlStateManager.rotate(270, 0, 1, 0);
                                        break;
                                    case WEST:
                                        GlStateManager.rotate(90, 0, 1, 0);
                                        break;
                                    default:
                                        break;
                                    }
                                }

                                cloud.renderExtra(0.0625F);
                                GlStateManager.popMatrix();

                                renderedEaster = true;
                                break easterEggs;
                            }
                        }
                    }
                }

                String nameLower = theCloud.name.toLowerCase(Locale.ROOT);
                if (SpecialRenderInit.SPECIAL_LIST.containsKey(nameLower)) {
                    RenderSpecial render = SpecialRenderInit.SPECIAL_LIST.get(nameLower);
                    if (render != null) {
                        GlStateManager.pushMatrix();
                        GlStateManager.translate(0F, renderedEaster ? 0.05F : 0.25F, 0F);
                        GlStateManager.rotate(180F, 1.0F, 0.0F, 1.0F);
                        GlStateManager.scale(0.75F, 0.75F, 0.75F);
                        render.render();
                        GlStateManager.popMatrix();
                    }
                }
            }
            GlStateManager.popMatrix();

            Minecraft mc = Minecraft.getMinecraft();
            if (theCloud.name != null && !theCloud.name.isEmpty() && !mc.gameSettings.hideGUI) {
                if (mc.player.getDistanceSq(theCloud.getPos()) <= 36) {
                    AssetUtil.renderNameTag(theCloud.name, x + 0.5F, y + 1.5F, z + 0.5F);
                }
            }
        }
    }
}
