package mod.oregen;

import java.util.Random;

import mod.main.MoreMain;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class PlatinumOreWorldGeneration implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	switch(world.provider.dimensionId) {
	case 0:
		generateSurface(world, random, chunkX*16, chunkZ*16);
		break;
	}
		
	}

	private void generateSurface(World world, Random random, int i, int j) {
		for (int k = 0; k < 25; k++) {
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(50);
			int chunkZ = j + random.nextInt(16);
			
			(new WorldGenMinable(MoreMain.platinumOre.blockID, 8)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
	}

}
