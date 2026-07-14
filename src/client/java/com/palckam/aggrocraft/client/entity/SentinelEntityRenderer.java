package com.palckam.aggrocraft.client.entity;

import com.palckam.aggrocraft.entity.SentinelEntity;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class SentinelEntityRenderer extends BipedEntityRenderer<SentinelEntity, BipedEntityModel<SentinelEntity>>
{
	
	private static final Identifier TEXTURE = Identifier.of("aggrocraft", "textures/entity/sentinel.png");
	
	public SentinelEntityRenderer(EntityRendererFactory.Context entityContext)
	{
		super(entityContext, new BipedEntityModel<>(entityContext.getPart(EntityModelLayers.ZOMBIE)), 0.5f);
	}
	
	@Override
	public Identifier getTexture(SentinelEntity entity)
	{
		return TEXTURE;
	}
}