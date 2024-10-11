// ResourceService_2Test.java
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
* It contains one unit test case for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {

	/**
	 * Unit test for getting a {@link Image} from the resource.
	 *
	 * @throws Exception 
	 */
	@Test
	public void testGetInputStream() throws Exception {
		InputStream is = getInputStream("R:/resources/audio.wav");
		
		assertTrue(is!= null);
		assertTrue(is instanceof AudioInputStream);
		
	}
	
	/**
	 * Unit test for getting a {@link BufferedImage} from the resource.
	 *
	 * @throws IOException
	 */
	@Test
	public void testGetBufferedImage() throws IOException {
		InputStream is = getInputStream("R:/resources/audio.wav");
		
		assertTrue(is!= null);
		BufferedImage image = ImageIO.read(is);

		assertNotNull(image);
		assertFalse(is.markSupported());
		
	}

	
	/**
	 * Unit test for getting an {@link ImageIcon}.
	 *
	 * @throws IOException 
	 */
	@Test
	public void testGetImageIcon() throws IOException {
		InputStream is = getInputStream("R:/resources/audio.wav");
		
		assertTrue(is!= null);
		ImageIcon icon = ImageIO.read(is);

		assertNotNull(icon);
		assertTrue(icon.getImage()!= null);
		assertTrue(icon.getImage().getWidth() > 0 && icon.getImage().getHeight() > 0);

	}
	
}

// ResourceService.java
