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

	Logger logger = Logger.getLogger(GfxFactoryTest.class);
	
	/**
	 * Test method for {@link GfxFactory#getPowerUpImage(String)}
	 * <p />
	 * Assertions:
	 * <ul>
	 * <li>GfxFactory doesn't throw
     * {@code IllegalStateException} when there is no powerUp image for PowerUp
     * <li>powerUp image is in the cache and it's not empty
     * </ul>
	 */
	@Test
    public void testGetPowerUpImage() {
        assertNull("The powerUp image is null", 
        		     getPowerUpImage(null));
        ResourceService resourceService = new ResourceService();
        assertNull("The powerUp image is null", 
        		     getPowerUpImage(resourceService.getImageLocation("powerUp")));
        // check that powerUp image is in the store
        assertNotNull("The powerUp image is null",	
        		  getPowerUpImage(resourceService.getImageLocation("powerUp")));
        // clear cache if powerUp image is no more in the store
        cacheClear();
    }
	
	/**
	 * Test method for {@link GfxFactory#getPowerUpImage(String)} without any powerUp image and with empty path
	 * <p />
	 * Assertions:
	 * <ul>
	 * <li>powerUp image is not in the cache and it's empty
	 * <li>powerUp image is in the cache without empty path
	 * </ul>
	 */
	@Test
    public void testGetPowerUpImageFromEmptyString() {
        assertNull("The powerUp image is null", 
        		     getPowerUpImage(null));
        ResourceService resourceService = new ResourceService();
        assertNotNull("The powerUp image is null",	
        		  getPowerUpImage(resourceService.getImageLocation("powerUp")));
        // clear cache if powerUp image is no more in the store
        cacheClear();
    }

    /**
     * Utility to clear the cache.
     * <p />
     * Assertions:
	 * <ul>
     * <li>Clear cache</li> 
     * </ul>
     */
    private void cacheClear() {
        powerUpImageCache.clear();
    }
	
	/**
	 * Test method for {@link GfxFactory#getPowerUpImage(ResourceService)}
     * 
     * 
     * Assertions:
     * <ul>
     * <li>No exception is thrown
     * <li>PowerUp file is returned
     * <li>File returned path to the PowerUp image is not null</li>
     * </ul>
     */
	@Test
    public void testGetPowerUpImageFromFile() {
        ResourceService resourceService = new ResourceService();
        // get image from file
        File imageFile = imageFile("org/xen-2/xen-2-agent/images/powerUp.png");
        Image powerUpImage = getPowerUpImage(resourceService);
        assertNotNull("The image is null", powerUpImage);
        String path = resourceService.getImageLocation("powerUp");
        assertTrue("The powerUp image doesn't have content", powerUpImage.getScaledWidth(true) > 0);
        assertTrue("The powerUp image doesn't have content", powerUpImage.getScaledHeight(true) > 0);

    }
	
//ImageFactory.java
	/**
	 * {@link GfxFactoryTest#testGetPowerUpImageFromFile()}
	 * 
	 * This test uses the following resource and its local path to the PowerUp image in the cache.
	 * 
	 * @throws java.io.IOException
	 * @throws java.lang.IllegalStateException
	 * @throws javax.imageio.IIOException
     */
	@Test
    public void testGetPowerUpImageFromFile() 
        throws IOException, IllegalStateException, IIOException {
        logger.info("Test to get powerUp image from file");
        
        // get image from file
        File imageFile = imageFile("org/xen-2/xen-2-agent/images/powerUp.png"); // no check for read mode if image is not in the cache yet
        Image powerUpImage = getPowerUpImage(new ResourceService(imageFile.getName())); // get the image from store
        assertTrue("The powerUp image doesn't have content", powerUpImage.getScaledWidth(true) > 0);
        assertTrue("The powerUp image doesn't have content", powerUpImage.getScaledHeight(true) > 0);
		
        assertNotNull("The powerUp image is null", powerUpImage);
        assertNotNull("The powerUp image's path is null", powerUpImage.getAbsolutePath());
        
        // get image from cache
        powerUpImage = getPowerUpImage(new ResourceService(imageFile.getName())); // get the image from cache
              // System.out.println("PowerUp image is:" + powerUpImage);
    }
	
	/**
	 * Utility to verify that the image is not in the cache in the cache at all with a null path
	 * 
	 * Assertions:
     * <ul>
         * <li>The powerUp image is in the cache and is not null
         * </ul>
	 */
	private void assertNotNull(String description, Image image) {
	  
	  String actual = image.getScaledHeight(false); // if image is not in the cache return the actual image
	  
	  String imageDescription = String.format("Did you forget to pass a path to this test case?");
	  assertTrue(actual == null || String.format("Got '%s' if missing in the cache", actual).length() == 0);
	  assertTrue(actual == null || String.format("Got '%s' if missing in the cache, but that was not at the cache level.", actual).length() > 0);
	 
	  logger.info(String.format(description, actual, imageDescription));
	    
    }
	
}
