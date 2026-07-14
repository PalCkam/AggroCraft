package com.palckam.aggrocraft;

import com.palckam.aggrocraft.entity.ModEntities;
import net.fabricmc.api.ModInitializer;

public class AggroCraft implements ModInitializer
{
	
	@Override
	public void onInitialize()
	{
		ModEntities.registerModEntities();
	}
}
