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
	public void testGetPowerUpImage() {
    	currentId = 1;
		Image image = new Image("/tmp/icon.png");
		assertEquals(image, getPowerUpImage("powerUp"));
    }
    
    @Test
    public void testLoadBackgroundBackground() {
        for (int i=0; i < currentId; i++) {
            currentId = currentId + 1;
            Image image = new Image("/tmp/icon.png");
            Image backgroundImage = new Image("/tmp/icon2.png");;
            currentId = currentId + 1;
            // test get background
            Image background = getBackgroundImage(1, i - 1);
            assertNotSame("Background should not be the same", image, background);
            assertEquals(image.toString(), background.toString());
            currentId = currentId + 1;
            // test get background
            background = getBackgroundImage(2, i - 1);
            assertNotSame("Background should not be the same", image, background);
            assertEquals(image.toString(), background.toString());
        }
	}
    
	@Test
	public void testLoadBackgroundNoBackground() {
		for (int i=0; i < currentId; i++) {
			currentId = currentId + 1;
			Image image = new Image("/tmp/icon.png");
			currentId = currentId + 1;
			// test get background
			Image background = getBackgroundImage(1, i - 1);
			assertNull("Background should be null", background);
			currentId = currentId + 1;
			// test get background
			Image background2 = getBackgroundImage(2, i - 1);
			assertNull("Background should be null", background2);
			currentId = currentId + 1;
			Image background3 = getBackgroundImage(3, i - 1);
			assertNull("Background should be null", background3);
			currentId = currentId + 1;
			Image background4 = getBackgroundImage(4, i - 1);
			assertNull("Background should be null", background4);
            assertNotSame("Background should not be the same", image, background);
            assertNotSame("Background should not be the same", image, background2);
            assertNotSame("Background should not be the same", image, background3);
            assertNotSame("Background should not be the same", image, background4);
		}
	}
	
	@Test
	public void testLoadBackgroundBackground() {
		currentId = 1;
		Image image = new Image("/tmp/icon.png");
		currentId = 1;
		Image backgroundImage = new Image("/tmp/icon2.png");;
		// test get background
		Image background = getBackgroundImage(1, image.getWidth() - 1);
		assertNotSame("Background should not be the same", image, background);
		// test get background
		Image background2 = getBackgroundImage(2, image.getWidth() - 1);
		assertNotSame("Background should not be the same", image, background2);
	}
   
    private Image getBackgroundImage(int width, int height) {
        return new Image("/tmp/background.png");
    }

    private Image getPowerUpImage(String sizeType) {
        return new Image("/tmp/"+sizeType+".png");
    }

    private Image getWallImage(int tileColId) {
        return new Image("/tmp/tilewall"+tileColId+".png");
    }

    private Image getTileImage(int tileColId, int tileRowId) {
        return new Image("/tmp/tile"+tileColId+"-"+tileRowId+".png");
    }

    private Image getWallImage(int tileRowId) {
        return new Image("/tmp/tilewall"+tileRowId+".png");
    }

    private Image getTileImage(String tileId) {
        return new Image("/tmp/tile"+tileId+".png");
    }

}