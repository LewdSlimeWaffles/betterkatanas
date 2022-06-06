
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package betterkatanas.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import betterkatanas.client.renderer.YamiSukehiroRenderer;
import betterkatanas.client.renderer.YamiAdvitaSlashRenderer;
import betterkatanas.client.renderer.SasukeUchihaRenderer;
import betterkatanas.client.renderer.AkameBossRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterKatanasModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BetterKatanasModEntities.AKAME_BOSS.get(), AkameBossRenderer::new);
		event.registerEntityRenderer(BetterKatanasModEntities.YAMI_SUKEHIRO.get(), YamiSukehiroRenderer::new);
		event.registerEntityRenderer(BetterKatanasModEntities.YAMI_ADVITA_SLASH.get(), YamiAdvitaSlashRenderer::new);
		event.registerEntityRenderer(BetterKatanasModEntities.SASUKE_UCHIHA.get(), SasukeUchihaRenderer::new);
	}
}
