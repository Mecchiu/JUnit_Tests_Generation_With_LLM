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
	 * This method tests to ensure the method
	 * {@link ResourceService#getInputStream(String)} is not
	 * called when no resource found at the specified path.
	 *
	 * @throws IOException Thrown if {@link ResourceService#getInputStream(String)} failed.
	 * @throws IllegalArgumentException Thrown if the path to a resource is invalid.
	 */
	@Test
	public void testGetInputStreamNonExistentResource() throws IOException {
		String path = "mypath.wav";
		try {
			getInputStream(path);
			fail("getInputStream(\"mypath.wav\") should have thrown an exception on resource not found in class path");
		}
		catch (IllegalArgumentException ex) {
			assertEquals("Invalid path: \"\"",ex.getMessage().toUpperCase());			
		}
	}
	
	/**
	 * This method tests to ensure the method
	 * {@link ResourceService#getInputStream(String)} is not
	 * called when the stream that is located at the specified path
	 * has been closed.
	 *
	 * @throws IOException Thrown if {@link ResourceService#getInputStream(String)} failed.
	 * @throws IllegalArgumentException Thrown if the path to a resource is invalid.
	 */
	@Test
	public void testInputStreamClose() throws IOException {
		String path = "mypath.wav";
//		InputStream inputStream = getInputStream(path);
//		inputStream.close();
		try {
			getInputStream(path);
			fail("getInputStream(\"mypath.wav\") should have thrown an exception on stream closed.");
		}
		catch (IllegalArgumentException ex) {
			assertEquals("The stream at \"\" is closed.",ex.getMessage().toUpperCase());			
		}
	}
	
	/**
	 * This method tests to ensure the method
	 * {@link ResourceService#getInputStream(String)} is not
	 * called when the stream that is located at the specified path
	 * is not open.
	 *
	 * @throws IOException Thrown if {@link ResourceService#getInputStream(String)}
	 * failed.
	 * @throws IllegalArgumentException Thrown if the path to a resource is invalid.
	 */
	@Test
	public void testInputStreamNotOpen() throws IOException {
		String path = "mypath.wav";
		try {
			getInputStream(path);
			fail("getInputStream(\"mypath.wav\") should have thrown an exception on stream not open.");
		}
		catch (IllegalArgumentException ex) {
			assertEquals("The stream at \"\" is not open.",ex.getMessage().toUpperCase());			
		}
	}
	
	/**
	 * This method tests to ensure the resource contains an image of
	 * the specified name. This checks to ensure that the
	 * {@link BufferedImage} returned by {@link ImageIcon#getImage()}
	 * contains the specified file name.
	 *
	 * @throws IllegalArgumentException Thrown if the resource does not contain a
	 * image that can be rendered.
	 */
	@Test
	public void testLoadImageResourceWithFile() throws IOException {
		String path = "/icons/font-16.png";
		BufferedImage image = ResourceService.getInputStream(path).getBufferedImage();
		assertNotNull(image);
		assertEquals(16, image.getWidth());
		assertEquals(16, image.getHeight());
		ImageIcon icon = new ImageIcon(image);
		Image realImage = icon.getImage();
		assertNotNull(realImage);
		Image imgRes = getClass().getClassLoader().getResource("/" + path);
		assertNotNull(imgRes);
	}
	
	/**
	 * This method tests to ensure the resource contains an image of
	 * the specified name. This checks to ensure that the
	 * {@link BufferedImage} returned by
	 * {@link ImageIcon#getImage()} does not contain the
	 * specified file name.
	 *
	 * @throws IllegalArgumentException Thrown if the resource does not contain a
	 * image that can be rendered.
	 */
	@Test
	public void testLoadImageResourceNotFound() throws IOException {
		String path = "/icons/font-16.png";
		try {
			getInputStream(path);
			fail("getInputStream(\"/icons/font-16.png\") should have thrown an "+
			 "exception on image not found.");
		}
		catch (IllegalArgumentException ex) {
			assertEquals("The image at \"/icons/font-16.png\" was not "+ 
				 "found in the resource cache.");
		}
	}
}
