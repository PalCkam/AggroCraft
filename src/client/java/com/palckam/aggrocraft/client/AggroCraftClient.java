package com.palckam.aggrocraft.client;

import com.palckam.aggrocraft.client.entity.SentinelEntityRenderer;
import com.palckam.aggrocraft.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AggroCraftClient implements ClientModInitializer
{
	
	@Override
	public void onInitializeClient()
	{
		EntityRendererRegistry.register(ModEntities.SENTINEL, SentinelEntityRenderer::new);
	}
}