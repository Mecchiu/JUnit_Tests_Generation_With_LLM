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

	// @Test
	// void testConstructor() throws IOException {
	// InputStream in = ResourceService.class.getClassLoader().getResourceAsStream("testImage.png");
	// BufferedImage im = ImageIO.read(in);
	// assertNotNull("The Image cannot be null",im);
	// assertEquals("The Image must have the expected width and height",im.getWidth(),64);
	// assertEquals("The Image must have the expected height",im.getHeight(),64);
	// }
	
	// Some common functions for unit tests. These functions contain a bunch of test cases.
	
	/**
	 * This is the default constructor of {@link ResourceService}.
	 *
	 */
	public ResourceService_1Test() {
	}
	
	/**
	 * This function is a static method that is called by {@link ResourceService_1Test#testConstructor()}.
	 * It contains one test case for the {@link ResourceService#getImageIcon(String)} method.
	 * @param in The location of the image within the classpath.
	 * @return The loaded {@link ImageIcon} of the specified path
	 */
	public static ImageIcon getImageIcon(InputStream in)
	throws IOException {
		return new ImageIcon("image/png", in);	
	}
	
	/**
	 * Tests for the case of loading the 'non existing' image by
	 * calling {@link ResourceService#getImageIcon(InputStream)} again.
	 */
	@Test(expected=IOException.class)
	public void testGetImageIcon() throws IOException {
		ImageIcon i = (ImageIcon) ResourceService.getImageIcon(ResourceService_1Test.class.getClassLoader().getResourceAsStream("testImage.png")); 
		expectThrown("An Exception must have been thrown by the getImageIcon call",() -> i.getImage());
	}
	
}