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
	 * Test of the {@link ResourceService#getImage(String)} method with invalid path.
	 */
	@Test
	public void testGetImage_2_InvalidPath() {
		boolean result = ResourceService.getImage(null) == null;
		
		assertTrue(result);
	}
	
	/**
	 * Test of the {@link ResourceService#getImage(String)} method with invalid path.
	 */
	@Test
	public void testGetImage_2_InvalidPath_2() {
		boolean result = ResourceService.getImage("") == null;
		
		assertTrue(result);
	}
	
	/**
	 * Test of the {@link ResourceService#getImage(String)} method with path.
	 */
	@Test
	public void testGetImage_2_ValidPath() {
		String path = "/img/test_image.png";
		Image result = ResourceService.getImage(path);
		
		assertNotNull(path, result);
		
		ImageIcon icon = new ImageIcon(result).getImage();
		assertSame(path, ((ImageIcon)icon).getImage());
	}
	
	/**
	 * Test of the {@link ResourceService#getImage(String)} method with path.
	 */
	@Test
	public void testGetImage_2_ValidPath_3() {
		String path = "/img/test_image.png";
		Image result = ResourceService.getImage(path);
		
		assertNotNull(path, result);
		
		ImageIcon icon = new ImageIcon(result).getImage();
		assertSame(path, ((ImageIcon) icon).getImage());
	}
	
	/**
	 * Test of the {@link ResourceService#getInputStream(String)} method with invalid path.
	 */
	@Test
	public void testGetInputStream_2_InvalidPath() throws IOException {
		String path = "/img/test_image.png";
		InputStream result = ResourceService.getInputStream(path);
		
		assertTrue(result == null);
	}
	
	/**
	 * Test of the {@link ResourceService#getInputStream(String)} method with valid path.
	 */
	@Test
	public void testGetInputStream_2_ValidPath() throws IOException {
		String path = "/images/test_image.png";
		InputStream result = ResourceService.getInputStream(path);
		
		assertNotNull(path, result);
		
		BufferedImage resultImage = ImageIO.read(result);
		
		assertEquals(50, resultImage.getWidth(), 0);
		assertEquals(50, resultImage.getHeight(), 0);
	}
}// ResourceService_0Testclass