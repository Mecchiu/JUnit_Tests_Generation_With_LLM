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
		 * Method to test.
		 * @throws IOException 
		 * @see ResourceService.java.
		 */
		@Test
		void testGetImage() throws IOException {
			final String path = "/src/common/resources/res2.jpg";
			ImageIcon icon = ResourceService.getImage(path);
			assertNotNull(icon);
			assertEquals(path, icon.getImagePath());
			assertNotNull(icon.getIcon());
			assertNotNull(icon.getIconImage());
			assertSame(icon.getIconImage(), icon.getIcon(0).getImage());
		}

		/**
		 * Method to test.
		 * @throws IOException 
		 * @see ResourceService.java.
		 */
		@Test
		 void testGetImageIcon() throws IOException {
			final String path = "/src/common/resources/res2.jpg";
			ImageIcon icon = ResourceService.getImage(path);
			assertNotNull(icon);
			assertEquals(path, icon.getImagePath());
			assertNotNull(icon.getIcon());
			assertNotNull(icon.getIconImage());
			assertSame(icon.getIconImage(), icon.getIcon(0).getIcon());
		}

  /**
  * Method to test.
  * It tests using a file.
  * @throws IOException Exception.
  */
  @Test
  void testGetInputStream() throws IOException {
    final String path = "/src/common/resources/res2.jpg";
    InputStream is = getInputStream(path);
    BufferedImage img = ImageIO.read(is);
    ImageIcon icon = ResourceService.getImage(path);
    assertNotNull(icon);
    assertEquals(path, icon.getImagePath());
    assertNotNull(icon.getIcon());
    assertNotNull(icon.getIconImage());
    assertSame(icon.getIconImage(), icon.getIcon(0).getImage());
  }
	}