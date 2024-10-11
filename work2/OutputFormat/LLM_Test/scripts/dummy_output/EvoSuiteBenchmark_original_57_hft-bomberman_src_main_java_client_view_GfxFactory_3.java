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
		
	@Test
        public void testGetPowerUpImage() throws Exception { 
            
            String type = "ice", name = "ice";
            File tile = new File(new File(basePath + "/" + name + ".png"));
            //Tile images should be loaded if tile set is defined
            
            Image tileImage = loadImage(tile);
            assertNotNull(tileImage);
            assertEquals("Expected 0", 0, tileImage.getWidth());
            assertEquals("Expected 0", 0, tileImage.getHeight());
            

            assertEquals("Expected Image", type, tileImage.getType());
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getWidth(new Dimension())));
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getHeight(new Dimension()))); 

            
        }
        
    @Test
        public void testGetWallImage() throws Exception { 
            
            String type = "ice", name = "ice";
            File tile = new File(new File(basePath + "/" + name + ".png"));
            Image tileImage = loadImage(tile);
            assertNotNull(tileImage);
            assertEquals("Expected 0", 0, tileImage.getWidth());
            assertEquals("Expected 0", 0, tileImage.getHeight());
                        
            assertEquals("Expected Image", type, tileImage.getType());
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getWidth(new Dimension())));
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getHeight(new Dimension())));

        }
        
    @Test
        public void testGetTileImage() throws Exception { 
            
            String type = "ice", name = "ice";
            File tile = new File(new File(basePath + "/" + name + ".png"));
            Image tileImage = loadImage(tile);
            assertNotNull(tileImage);
            assertEquals("Expected 0", 0, tileImage.getWidth());
            assertEquals("Expected 0", 0, tileImage.getHeight());
                        
            assertEquals("Expected Image", type, tileImage.getType());
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getWidth(new Dimension())));
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getHeight(new Dimension()))); 

        }
    
    @Test
        public void testGetExplosionImage() throws Exception { 
            
            String type = "ice", name = "ice";
            File tile = new File(new File(basePath + "/" + name + ".png"));
            Image tileImage = loadImage(tile);
            assertNotNull(tileImage);
            assertEquals("Expected 0", 0, tileImage.getWidth());
            assertEquals("Expected 0", 0, tileImage.getHeight());
                        
            assertEquals("Expected Image", type, tileImage.getType());
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getWidth(new Dimension())));
                        
            assertEquals("Expected Image size", new Integer(1024), new Integer(
                    tileImage.getHeight(new Dimension()))); 

            assertEquals("Expected Explosion image", tileImage.getURL(), explosionImageCache.get(
                new Integer(idTranslator.get(tileImage.getID()))).getURL());
            
        }
    
    @Test
        public void testSetTileSet() throws Exception { 
            
            File tile = new File(new File(basePath + "/ExplO.png"));
            tileImageCache = new HashMap<Integer, Image>(1);
            tileImageCache.put(currentId, loadImage(tile));
            //TODO: add support for multiple tiles in one tile set
            File tile2 = new File(new File(basePath + "/ExplO2.png"));
            tileImageCache = new HashMap<Integer, Image>();
            tileImageCache.put(currentId, loadImage(tile2)); 
            //TODO: add ability to set multiple tiles in one tile set
            
            GfxFactory.setTileSet("ice");
            
        }

    public Image getWallImage(int state) {
        return tileImageCache.get(state);
    }

    private Image loadImage(String type) {
        String imagePath = new File(basePath + "/" + name + ".png")
               .getAbsolutePath();
        return ImageIO.read(new File(imagePath));
    }
	
}