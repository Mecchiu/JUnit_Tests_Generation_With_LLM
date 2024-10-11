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
		
        /**
         * Test case for {@link GfxFactory#getWallImage(int)}
         * The actual image resource might be stored to a specific local file.
         * @throws JavaNanoRuntimeException if a problem occurs
         */
        @Test
        void testGetPowerUpImage() throws JavaNanoRuntimeException {
                ArrayDimensions dim = new ArrayDimensions(0, 0);
                Image image = null;
                try {
                        image = ImageIO.read(new File("testClass/GfxFactoryTest/testgetWALPImage.png"));
                } catch (IOException ioe) {
                        String errorMessage = "Unexpected error when loading image. Error message: " + ioe.getMessage();
                        System.err.println(errorMessage);
                        throw new JavaNanoRuntimeException(errorMessage, ioe);
                }

                assertTrue(image!= null);

                GfxFactory gfxFactory = new GfxFactory();
                Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
                assertEquals(size, gfxFactory.getTileImage(tileSet).getSize(null));
        }
	
        @Test
        void testExplosionImage() throws JavaNanoRuntimeException {
                ArrayDimensions dim = new ArrayDimensions(0, 0);
                Image image = null;
                try {
                        image = ImageIO.read(new File("testClass/GfxFactoryTest/testExplosionImage.png"));
                } catch (IOException ioe) {
                        String errorMessage = "Unexpected error when loading image. Error message: " + ioe.getMessage();
                        System.err.println(errorMessage);
                        throw new JavaNanoRuntimeException(errorMessage, ioe);
                }

                assertNotNull(image);

                PowerUpType powerUpType = PowerUpType.EXPLOSION;

                assertTrue(ExplosionGfxFactory.isPowerUp(powerUpType));

                GfxFactory gfxFactory = new GfxFactory();
                Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));

                assertTrue(size.width >= dim.y);
                assertTrue(size.width - dim.x >= dim.y);
                assertTrue(size.height >= dim.y);
                assertTrue(size.height - dim.x >= dim.y);
        }
		
	
	/*@Test
	public void testGetO()
	{
	ArrayDimensions dim = new ArrayDimensions(0, 0);
	Image image = null;
	try {
	image = ImageIO.read(new File("testClass/GfxFactoryTest/testO.png"));
	} catch (IOException ioe) {
	String errorMessage = "Unexpected error when loading image. Error message: " + ioe.getMessage();
	System.err.println(errorMessage);
	throw new JavaNanoRuntimeException(errorMessage, ioe);
	}
	
	assertNotNull(image);
	assertTrue(Dimension.width == dim.width);
	assertTrue(Dimension.height == dim.height);
	assertEquals("Water", ImageIO.read(new File("testClass/GfxFactoryTest/testO.png")));
	
	HashMap<String, String> map = new HashMap<>();
	map.put("O", new StringBuilder().
			append("o").
			append("a").
			append("b").
			append("c").
			toString());
	assertEquals(new File("testClass/GfxFactoryTest/testO_testGfxFactory.png"),
			new File("testClass/GfxFactoryTest/testO_GfxFactory.png"));
	assertEquals(new File("testClass/GfxFactoryTest/testO_testGfxC.png"), 
			new File("testClass/GfxFactoryTest/testO_GfxC.png"));
	}*/
}