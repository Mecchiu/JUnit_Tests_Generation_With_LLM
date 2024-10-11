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
		
    private static final Logger log = Logger.getLogger(GfxFactoryTest.class);

    static final String BASE_PATH = "C:/Projects/";

    public GfxFactoryTest() {
       log.debug("Starting class");
    }

    @Test
    public void testLoad(){
        log.debug("Starting test");
        Image image = loadImage(BASE_PATH + "powerUp.png");
        log.debug("  " + image.getWidth() + "x"+ image.getHeight());
    }

	/**
	 * GfxFactoryTest.java
	 * @author
	 *
	 */
	public static class GfxFactoryTest2{
		
		private static final String BASE_PATH = "C:/Projects/";

		public GfxFactoryTestTest() {}

		public Image getWallImage2(int state){
			return null;

		}
	public Image getWallImage(){
		return loadImage(BASE_PATH + "wall.png");

		}

		public Image getWallImage(int state){
			return loadImage(BASE_PATH + "wall2.png");
		}

		public Image getWallImage2(int state, int diameter){
			return loadImage(BASE_PATH + "wallSmall.png");
		}
	}
}