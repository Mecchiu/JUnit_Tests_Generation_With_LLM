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
		
}

// ResourceServiceTest_1.java

/**
 * UnitTest Class to test the {@link ResourceService#getInputStream(String)} method.
*/
public class ResourceServiceTest_1Test {

	/**
	 * Test of getInputStream method, of class ResourceService.
	 * @throws IOException
	 */
	@Test
	@SuppressWarnings("unused")
	public void testGetInputStream() throws IOException {
		System.out.println("getInputStream");
		BufferedImage image = ResourceService.getImage("./resources/Image_Small_Small.png");
		ImageIcon icon = new ImageIcon(image);
		System.out.println("icon: " + icon);
		assertNotNull(icon);
	}

	/**
	 * Test of getImageMethod method, of class ResourceService.
	 * @throws IOException
	 */
	@Test
	public void testGetImageMethod() throws IOException {
		System.out.println("getImageMethod");
		BufferedImage image = ResourceService.getImage("/resources/Image_Small_Small.png");
		ImageIcon icon = new ImageIcon(image);
		System.out.println("icon: " + icon);
		assertNotNull(icon);
	}

	/**
	 * Test of getImageIcon method, of class ResourceService.
	 * @throws IOException
	 */
	@Test
	public void testGetImageIcon() throws IOException {
		System.out.println("getImageIcon");
		BufferedImage image = ResourceService.getImage("/resources/Image_Small_Small.png");
		ImageIcon icon = new ImageIcon(image);
		System.out.println("icon: " + icon);
		assertNotNull(icon);
	}

	/**
	 * Test of getInputStream method, of class ResourceService.
	 * @throws IOException
	 */
	@Test
	public void testGetInputStreamWithIcon() throws IOException {
		System.out.println("getInputStreamWithIcon");
		Image icon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/org/jill/game/images/Icon-16.png")));
		Image input = new Image(icon.getImageData().getWidth(), icon.getImageData().getHeight(), "jill.png");
		System.out.println("input: " + input);
		assertTrue(input.toBufferedImage() instanceof BufferedImage);
	}

}