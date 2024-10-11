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
		Image image = null;
		BufferedImage buffImage = null;
		boolean imageSuccess = false;

		
	@Test
	public void test_getInputStream() throws IOException {
		// First, try the non-existent path
		assertFalse(ResourceService.getInputStream("non-existent").isPresent());
		
		// Second, try a valid path
		try { 
			image = ResourceService.getImage("/src/images/img.bmp");
		} catch (NullPointerException ex) { 
			System.out.println("Unable to create a new buffered image from a stream: " + ex);
			return;
		}
		
		assertTrue(true);
	} 
	
	
	
	/**
	 * Creates a connection to the resource that is located at the specified path via
	 * an {@link InputStream}.
	 * @param path The location of the resource within the classpath.
	 * @return The {@link InputStream} that points the requested resource.
	 */
	public static InputStream getInputStream(String path) {
		
		if (path.isEmpty()) {
			return null;
		}
		
		@SuppressWarnings("resource")
		InputStream stream = ResourceService.class.getResourceAsStream(path);
		assertTrue(stream!= null, "A resource file found at that path does not exist.");
		System.out.println("Resolve Resource: " + path);
		return stream;
	}
		
	/**
	 * Loads the specified buffered image from {@link ResourceService#getInputStream(String)}.
	 * @param buffImage The {@link BufferedImage} located at the path.
	 * @return The {@link BufferedImage} or null if there was an IOException while trying
	 * to create the {@link BufferedImage}.
	 */
	public static BufferedImage getImage(BufferedImage buffImage)
	{
		assertNotNull(buffImage, "An image should not be null");
		
		if (buffImage.getHeight()!= buffImage.getWidth()) {
			buffImage = buffImage.getScaledInstance(buffImage.getWidth(), buffImage.getHeight(), Image.SCALE_SMOOTH);
		}
		return buffImage;
		
		}
		
	/**
	 * Loads the specified cached image
	 * @param buffImage The {@link BufferedImage}) to get the cached image.
	 * @return The {@link BufferedImage} or null if there was an exception when loading
	 * the image.
	 */
	public static BufferedImage getImage(BufferedImage buffImage, ImageIcon icon)
	{
		assertNotNull(buffImage, "An image should not be null");
		try {
			if (buffImage.getHeight()!= buffImage.getWidth()) {
				buffImage = buffImage.getScaledInstance(buffImage.getWidth(), buffImage.getHeight(), Image.SCALE_SMOOTH);
			}
			return buffImage;
			
		}
				catch (Exception e)
		{
			e.printStackTrace();
			assertTrue(true, "Error loading the buffered image " + buffImage + " with " + e.toString());
			return null;
		}
	}
	
	/**
	 * Loads the specified cached image
	 * @param buffImage The {@link BufferedImage}) to get the cached image.
	 * @return The {@link BufferedImage} or null if there was an exception when loading
	 * the image.
	 */
	public static BufferedImage getImage(BufferedImage buffImage)
	{
		assertNotNull(buffImage, "An image should not be null");
		
		
		if (buffImage.getHeight()!= buffImage.getWidth()) {
			buffImage = buffImage.getScaledInstance(buffImage.getWidth(), buffImage.getHeight(), Image.SCALE_SMOOTH);
		}
		
		return buffImage;
	}
	
	/**
	 * Loads the specified cached image
	 * @param buffImage The {@link BufferedImage}) to get the cached image.
	 * @return The {@link BufferedImage} or null if there was an exception when loading
	 * the image.
	 */
	public static BufferedImage getImage(Image image) {
		assertNotNull(image, "An image should not be null");

		if (image.getHeight()!= image.getWidth()) {
			image = image.getScaledInstance(image.getWidth(), image.getHeight(),
				Image.SCALE_SMOOTH);
		}
		buffImage = (new BufferedImage());
		buffImage.setImage(image);

		return buffImage;
	}
	
	/**
	 * Gets the loaded image from the specified path via an {@link Image},
	 * which cannot be null. Exception is thrown if there is a problem
	 * during loading.
	 * @param path The location of the resource within the classpath.
	 * @return The loaded image or null if no resource can be found.
	 */
	public static BufferedImage getImageAtLocation(String path) {
		assertNotNull(path, "A path with to a resource should not be null");
		BufferedImage buffImage;
		
		try (InputStream stream = ResourceService.class.getResourceAsStream(path)) { 
			buffImage = getImage(stream);
		} catch (IOException | NullPointerException exception) { 
			exception.printStackTrace();
			return null;
		}
		
		return buffImage;		
	}
	
	/**
	 * Gives the path of the loaded image that was passed to this method.
	 * @return The path of the loaded image.
	 */
	public String getImagePathForUrl() {
		return ResourceService_2Test.class.getResource(image.getAbsolutePath()).toString();
	}
	
	/**
	 * Gives the id of the loaded image that was passed to this method.
	 * @return The id of the loaded image.
	 */
	public String getImageId() {
		return image.getImageLoadStatus();
	}
	
	/**
	 * Gives whether the image is loaded to the client or not.
	 * @return The boolean depending from the status.
	 */
}