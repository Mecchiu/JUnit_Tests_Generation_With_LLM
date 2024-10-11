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
		
    private String tmpPath;
	static final String basePath = "./";
	static public void main(String args[]) {
		
		System.setProperty("os.name", "win"); // Windows
		
		
	};    

    /**
    * test constructor
    * 
    */
    GfxFactoryTest(){
	tmpPath = new File("d:/tmpFile").getAbsolutePath();
    };

	/**
	 * test getter of PowerUpImage(String)
	 * 
	 */
	@Test
	public void testGetPowerUpImage() {
		GfxFactory gfx = new GfxFactory();
			
		assertNotNull(gfx.getPowerUpImage(null));
	}

	/**
	 * test setter for PowerUpImage(String)
	 * 
	 */
	@Test
	public void testSetPowerUpImage() {
		//String tempPath;
		GfxFactory gfx = new GfxFactory();
		gfx.setTileSet("ice");
		System.setProperty("os.name", "win"); // Windows
			
		
		// assertFalse(tmpPath, "Failed to set default tile path");
		assertEquals(tmpPath + "/ice-default-tile", gfx.getTileSet());
		
		gfx.setTileSet("ice");
		System.setProperty("os.name", "win");
		// assertTrue(tmpPath, "Failed to set valid tile path");
			
		// String tempTmpPathTemp = new File(tmpPath).getAbsolutePath();
		
		
	}
	
	
	
	/**
	 * test setter for WallImage(File)
	 * @throws Exception An Exception thrown when the path file can not be found
	 */
	@Test
	public void testSetWallImage() {
			String path = new File("d:/tmpFile").getAbsolutePath();
	
		//String tempPath;
		GfxFactory gfx = new GfxFactory();
		gfx.setTileSet("ice");
		// assertFalse(tmpPath, "Failed to set default tile path");
			
		gfx.setTileSet("ice");
		//System.setProperty("os.name", "win"); // Windows
		// assertTrue(path, "Failed to set valid path");

		// String tempTmpPathTemp = new File(tmpPath).getAbsolutePath();
	
		assertNotNull("path file not found", path);
			
		gfx.setTileSet("ice");
		System.setProperty("os.name", "win");
		//assertEquals(path, tmpPath, "Failed to set temp path");
		assertTrue(path, "Failed to set valid path");

		// String tempTmpPathTemp = new File(tmpPathTemp).getAbsolutePath();
		assertEquals(path, tmpPath + "/ice-default-tile-1", "Failed to set temp path");
	}
	
	
	
	/**
	 * test setter for O
	 * 
	 */
	@Test
	public void testSetO() {
			
		GfxFactory gfx = new GfxFactory();
		//assertEquals(tmpPath + "/ice-default-tile", gfx.getTileSet());
			
		gfx.setTileSet("ice");
		System.setProperty("os.name", "win");
	
		// assertTrue(path, "Failed to set valid path");
		assertEquals("ice-default", gfx.getO()[0].getImagePath());
	}
	
	
	
	
	
	
	
	
	
	/**
	 * test getO
	 * 
	 */
	@Test
	public void testGetO() {
		GfxFactory gfx = new GfxFactory();
				
		System.setProperty("os.name", "win");
		assertNotNull(gfx.getO());
		//assertEquals("ice-default", gfx.getO()[0].getImagePath());
	}
	
	/**
	 * test getImage at tile id
	 * 
	 */
	@Test
	public void testGetWallImage() {
		GfxFactory gfx = new GfxFactory();
		
		GfxFactory.currentId = 1;

		Image[] tileImages = gfx.getTileImage("ice");
		assertNotNull(tileImages);
		assertEquals(tileImages[0].getM(), 1);
	}

	
	
}