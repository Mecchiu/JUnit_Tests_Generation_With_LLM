// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains one unit test case for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {

		Logger log = Logger.getLogger(GfxFactoryTest.class);

/** Checks for existence of the cache. */
	@Test
	void checkImageCache() {

		assertNotNull("The image cache has been successfully initialized.",
				wallImageCache);
		assertNotNull("The tile cache has been successfully initialized.",
				tileImageCache);
		assertNotNull("The powerUp images have been successfully initialized.",
				powerUpImageCache);
		assertNotNull("The animation gif cache has been successfully initialized.",
				exposionImageCache);

		GfxFactory.log.trace("imageCache ===============");
		log.trace(imageCache);

		TileCache tileCache = new TileCache();
		wallImageCache.put(13, tileCache.getTileImage("wall_8"));
		tileImageCache.put("wall_8", tileCache.getTileImage("wall_8"));

		BombCache bombCache = new BombCache();
		bombImageCache.put("bomb_1", bombCache.getBombImage("1"));
		bombImageCache.put("bomb_2", bombCache.getBombImage("2"));
		bombImageCache.put("bomb_3", bombCache.getBombImage("3"));
		bombImageCache.put("bomb_4", bombCache.getBombImage("4"));

		ExplosionCache explosionCache = new ExplosionCache();
		Image image = explosionCache.getImage("explosion");
		Image loadedImage = explosionCache.getExplosionImage(300);
		int d = image.getWidth(ResourceService.getResource());
		int m = image.getHeight(ResourceService.getResource());

		assertEquals("The loaded image from cache does not equal the one expected.",
				loadedImage, image);
		assertEquals("The loaded number of tiles does not match the expected number.",
				d * m, loadedImage.getHeight(ResourceService.getResource()));
		
		TileCache tCache = new TileCache();
		assertNotNull("The loaded image from cache is null.",
				tCache.getTileImage("tilecache_image1"));
		
		GfxFactory.log.trace("tileCache ===============");
		GfxFactory.log.trace(tileCache);

		GameCache gameCache = new GameCache();
		Image image2 = gameCache.getImage("game_game");
		if (image2 == null) {
			throw new RuntimeException("Failed to load game.");
		}
		GfxFactory.log.trace("image  ===============");
		GfxFactory.log.trace(image2);

		// GFX.getExplosionImage("tilecache_explosion"); //Should return null.
		// GFX.getExplosionImage("game_game"); //Should return false.


	}

    @Test
    void initializeAndLoadAll() {
        TileService tileService = ResourceService.getTileService();

    }

}
