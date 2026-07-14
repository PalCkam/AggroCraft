package com.palckam.aggrocraft.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class SentinelEntity extends PathAwareEntity
{
	
	public SentinelEntity(EntityType<? extends PathAwareEntity> entityType, World world)
	{
		super(entityType, world);
	}
	
	@Override
	protected void initGoals()
	{
		WanderAroundFarGoal goal = new WanderAroundFarGoal(this, 1.0D);
		this.goalSelector.add(1, goal);
	}
}
