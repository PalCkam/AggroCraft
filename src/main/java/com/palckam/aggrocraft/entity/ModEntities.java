package com.palckam.aggrocraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities
{
	public static final EntityType<SentinelEntity> SENTINEL = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of("aggrocraft", "sentinel"),
			EntityType.Builder.create(SentinelEntity::new, SpawnGroup.CREATURE)
					.dimensions(0.6f, 1.95f)
					.build()
	);
	
	
	public static void registerModEntities()
	{
		FabricDefaultAttributeRegistry.register(SENTINEL, SentinelEntity.createSentinelAttributes());
	}
}