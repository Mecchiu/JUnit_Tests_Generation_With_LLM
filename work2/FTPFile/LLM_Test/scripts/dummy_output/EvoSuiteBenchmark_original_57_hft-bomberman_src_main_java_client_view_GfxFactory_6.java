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
		private static String RESOURCENAME = "gfx";
		public static String basePath = "/gfx/";
		private static Logger logger = Logger.getLogger(GfxFactoryTest.class);

		/**
     	* This method returns a Powerup image for given type.
     	* We create a new PowerupImage and copy the image into the
     	* TextureManager object.
     	* @param type	 A String (String[] contains the type of powerUp and
     	*                image path. For example 'ice' or 'powerDown'
     	*                or any integer with 0 being an illegal powerUp type.
     	* @return The Powerup Image if Powerup image for given type exists.
     	*  */
    	public Image getPowerUpImage(String type) {
		//	Image powerUpImage = null;
		Image powerUpImage = null;
    		
        	// Image image = (Image[])PowerupImageFactory.getInstance().getPowerUpImage(type);
        	powerUpImage = generatePowerUpImage(type);
		
        	
        	return powerUpImage;
    	}
    	
	/**
     * Constructor for this test class.
     * @param _type The type of powerUp.
     * @param _path The path.
     * @return
     */
    	private Image generatePowerUpImage(String _type) {
    		String resource = ResourceService.getResourceFileName(_type);
    		
            return loadImage(basePath + "/" + resoureceName + "/" + _type + "/" + resource);
    	}
    	
    	/**
     * Test Class for the {@link GfxFactory#addTilesetToAllTileImages(java.lang.String)} method.
     */
    	@Test
    	public void testAddTilesetToAllTileImages() {
    		// Create a new instance of TilesetManager for the new tileset image
    		TilesetManager.Instance manager = TilesetManager.Instance.getInstance(TilesetManager.Instance.Type.ALL_TILE_TEMPLATES);
    		// Add a new tileset
    		manager.addTileSet("TestTileSet001",
    				(byte) Image.TILE_DOWN,
    				(byte) Image.TILE_UP,
    				0,
    				0);
        	// Create a new tileset for a specific tileset.
    		TilesetInfo tilesetInfo = new TilesetInfo(manager, (byte) Image.TILE_DOWN, (byte) Image.TILE_UP);
    		// Add tile information.
    		TilesetManager.Instance tilesetManager = null;
    		try {
    			tilesetManager = TilesetManager.getInstance();
    			tilesetManager.addTileset(tilesetInfo);
    			assertTrue("The test failed.", true);
    		} catch (RuntimeException ex) {
    			String msg = "An error occurred. The test failed." + "\n" +"You cannot add an invalid tileset.";
    			logger.error(msg);
    			throw new RuntimeException(msg);
    		}
    		// Get tileset list
    		HashMap<Byte, TilesetInfo> tilesetmap = manager.getTilesets();
    		// Get tileset info with specified tileset id.
    		TilesetInfo tilesetInfo1 = tilesetmap.get( (byte) (0 * Image.TILE_UP));
    		// Set the tileset with tileset id 0.
    		TilesetManager.Instance tilesetManager1 = TilesetManager.getInstance(0);
    		
    		// Add a new player.
    		playerImageCache = new HashMap<String, Image>();
    		// Add the file name of an image file
			String tempPath = "/gfx";
			// Make a new filename and change tile.
			String tilesetFileName = tilesetInfo1.getTilesetFile();
			String tilesetFileName_sub = tilesetFileName.substring(tilesetFileName.lastIndexOf('/') + 1);
			String playerFileName   = tilesetFileName_sub + "_" + tilesetInfo1.getPlayerNumber()+".png";
    		try {
	    		Image tileImage = loadImage(basePath + "/" + playerFileName);
    			assertEquals("Player images are not the same!",
    					tileImage,
    					playerImageCache.get(playerFileName));
    		} catch (Exception ex) {
    			// assertNotNull - to remove warning: NullPointerException: No such field in the super class
    			throw new AssertionError();
    		} catch (IOException ex) {
    			// TODO Auto-generated catch block
    			logger.error(ex.toString());
    			throw new AssertionError();
    		}
    		// Get powerUp image cache for all tileset.
    		powerUpImageCache = new HashMap<String, Image>();
        	powerUpImageCache = TilesetManager.getInstance().getPowerUpImages(tilesetinfo1);
        	// Add an image to powerup image cache array.
        	Image powerUpImage_1 =
        			(powerUpImageCache.get((byte) (powerUpImageCache.size())));
    		// Get tileset image in powerup map.
    		powerUpImageCache = TilesetManager.getInstance().getPowerUpMap(powerUpImage_1);
    		// Add an image to powerup map.
}
}