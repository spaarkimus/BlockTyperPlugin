package com.blocktyper.v1_2_3.recipes;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;

import com.blocktyper.v1_2_3.IBlockTyperPlugin;

public class BlockTyperRecipe extends AbstractBlockTyperRecipe{

	public BlockTyperRecipe(String key, List<Material> materialMatrix, List<Byte> materialDataMatrix, Material output,
			IBlockTyperPlugin plugin) {
		super(key, materialMatrix, materialDataMatrix, output, plugin);
	}

	@Override
	public List<String> getLocalizedLoreForPlugin(IRecipe recipe, HumanEntity player) {
		return null;
	}

}