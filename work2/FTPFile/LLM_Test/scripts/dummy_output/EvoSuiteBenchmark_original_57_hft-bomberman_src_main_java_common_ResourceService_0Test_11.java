// ResourceService_0Test.java
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
* It contains one unit test case for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_0Test {
		/**
		 * Tests {@link ResourceService#getImage(String)}.
		 */
		@Test
		public void testGetImage( ) {
					assertEquals("image/png", ResourceService.getImage( "test_image/test.png" ).getImageType());
				}
		/**
		 * Tests {@link ResourceService#getImageIcon(String)}.
		 */
		@Test
		public void testGetImageIcon( ) {
			assertEquals(
					"image/png",
					ResourceService.getImageIcon( "test_image/test.png" ).getImageType()
			);
		}
	}