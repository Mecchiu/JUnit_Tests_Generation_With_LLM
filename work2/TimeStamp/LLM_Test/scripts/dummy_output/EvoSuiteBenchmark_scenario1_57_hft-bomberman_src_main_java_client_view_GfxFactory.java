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
* It contains ten unit test cases for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {
		
	/**
	* Test case for {@link GfxFactory#getPowerUpImage(String)} method.
	* It checks if the method returns the correct image for the given type.
	*/
	@Test
	void testGetPowerUpImage() {
		GfxFactory gfxFactory = new GfxFactory();
		Image image = gfxFactory.getPowerUpImage("speed");
		assertEquals(image, gfxFactory.getPowerUpImage("speed"));
	}
}