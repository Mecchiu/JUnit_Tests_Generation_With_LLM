// ResourceServiceTest.java
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
	}
}