// ResourceService_1Test.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceService}.
* It contains one unit test case for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {
		/**
		* Tests the {@link ResourceService#getImageIcon(String)} method.
		*/
		@Test
		public void test1() {
				// TODO write test for the ImageIcon class
				assertNotNull(ResourceService.getImageIcon(""));
		}
}