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
	 * Test case for {@link ResourceService#getInputStream(String)} method.
	 * <p>
	 * It will retrieve all images associated to the specified {@link
	 * InputStream} and {@link ImageIcon} from the resource directory at
	 * {@code java.jar} path. The first image obtained will be cached for subsequent calls.
	 * For a non-cached image, it will be loaded and then stored in the temporary folder at {@code test/inputstream-cache}
	 * </p>
	 * <p>
	 * For any of the remaining tests, each test will create a new {@link BufferedImage}
	 * from an {@link InputStream}.
	 * </p>
	 * @throws IOException
	 * @see ResourceService#getImage(String)
	 * @throws Exception
	 */
	@Test
	void testGetInputStream_1() throws IOException, Exception {
		ImageIcon icon = 
			new ImageIcon(getImage(ResourceService_2Test.class.getClassLoader().getResource("../images/icon.png").toExternalForm()));
		final int imgWidth = icon.getIconHeight();
	
		// First: get a new image
		ImageIcon temp = 
			new ImageIcon(getInputStream(ResourceService_2Test.class.getClassLoader().getResource("../images/icon_temp_0.png").toExternalForm()));
		
		// Create a new instance
		BufferedImage buffer = new BufferedImage(imgWidth, imgWidth, BufferedImage.TYPE_INT_RGB);
		
		// Then: draw a rectangle on the temp image
		buffer.getGraphics().drawRenderedImage(temp);
		
		// Now: load the rectangle image and read the actual resource file
		Image image = new ImageIcon(getInputStream(ResourceService_2Test.class.getClassLoader().getResource("../images/circle.png").toExternalForm()).getAsStream()).getImage();
		
		// Read the resource file
		testGetImage(buffer, image);
	}

	/**
	 * Test case for the {@link ResourceService#getOutputStream(String)} method.
	 * <p>
	 * If the resource path specified is not in {@link ResourceService#RESOURCES_PATH} it
	 * will get the classpath image path from the first non-cached image found.
	 * </p>
	 * @throws IOException
	 * @see ResourceService#getInputStream(String)
	 */
	@Test
	void testGetOutputStream() throws IOException {
		final InputStream is = ResourceService_2Test.class.getClassLoader().getResource("../images/icon.png").toInputStream();
	
		BufferedImage icon = new BufferedImage(is.available() + 2, is.available() + 2, BufferedImage.TYPE_INT_RGB);
		is.read();
		is.read();
		is.read();
		
		// Make sure the specified path works
		ResourceService.getOutputStream(ResourceService_2Test.class.getClassLoader().getResource("../../images/icon.png").toExternalForm());
	
		// Read the returned path
		ImageIcon icon_temp = new ImageIcon(getInputStream(ResourceService_2Test.class.getClassLoader().getResource("../../images/icon_temp.png").toExternalForm()).getAsStream());
		
		final int imgWidth = icon_temp.getIconWidth();
		final int imgHeight = icon_temp.getIconHeight();
		assertTrue(imgWidth > 64);
		assertTrue(imgHeight > 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getOutputStream(String)} method.
	 * <p>
	 * If there is a custom path for the current class, it must be specified by adding a
	 * new resource method. An existing custom resource path property file will be used.
	 * </p>
	 * @throws IOException
	 */	   
	@Test
	void testGetOutputStream_3_getOutputStream() throws IOException{ 
		final InputStream is = getInputStream(ResourceService_2Test.class.getClassLoader().getResource("../images/icon.png").toExternalForm());
	
		try {
			BufferedImage icon = getImage(ResourceService_2Test.class.getClassLoader().getResource("../images/icon_temp.png").toExternalForm());
			
			ResourceService.getOutputStream(ResourceService_2Test.class.getClassLoader().getResource("../../images/icon.png").toExternalForm());
			
		} catch(Exception e){
			assertTrue(is!= is.getClass().getResourceAsStream());
		}
	}	
}