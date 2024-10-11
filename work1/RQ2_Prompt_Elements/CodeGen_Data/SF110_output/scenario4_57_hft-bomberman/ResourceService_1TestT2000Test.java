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
/**
		* This tests the {@link ResourceService#getImageIcon(String)}
		* method based on a simple input stream.
		*/
		@Test
		public void testGetImageIconWithInputStream() throws IOException {
			// An input stream is required and is required to read a resource.
			InputStream inStream = getInputStream("ResourceService_1Test.jpg");
			
			// Loading the image from the stream.
			Image image1 = ImageIO.read(inStream);
			assertNotNull(image1);
			
			assertTrue(image1.getSource() instanceof
				BufferedImage
				);
		}
		
		/**
		* This tests the {@link ResourceService#getImageIcon(String)}
		* method based on a simple path.
		*/
		@Test
		public void testGetImageIconWithPath() throws IOException {
			// An input stream is required and is required to read a resource.
			InputStream inStream = getInputStream("ResourceService_1Test.jpg");
			
			// Loading the image from the path.
			Image image1 = ImageIO.read(inStream);
			assertNotNull(image1);
			
			assertTrue(image1.getSource() instanceof
				BufferedImage
				);
		}
		
		/**
		* This tests the {@link ResourceService#getImageIcon(String)}
		* method based on an already loaded {@link ImageIcon} of a given
		* resource type.
		*/
		@Test
		public void testGetImageIconWithImageIcon() throws IOException {
			InputStream inStream = getInputStream("ResourceService_1Test.jpg");
			ImageIcon imageIcon = ImageIO.read(inStream);
			
			assertNotNull(imageIcon);
		}
		
		/**
		* This tests the {@link ResourceService#getImageIcon(String)}
		* method based on an already loaded {@link ImageIcon} of a given
		* resource type that is not of type {@link java.awt.image.BufferedImage}.
		*/
	@Test
		public void testGetImageIconWithImageIconOfNotOfTypeBufferedImage()
			throws IOException {
		
			InputStream inStream = getInputStream("ResourceService_1Test.jpg");
			Image image = ImageIO.read(inStream);
			
			assertNull(image);
		}
		
		/**
		 * This tests that the method
		 * {@link ResourceService#getImageIcon(String)}
		 * throws an {@link IllegalArgumentException} if the specified
		 * image path does not exist.
		*/
		@Test(expected = IllegalArgumentException.class)
		public void testGetImageIconWithNoPathThrowsException()
			throws IOException {
			try {
				ResourceService.getImageIcon("nonexistent");
			} catch(IllegalArgumentException e) {
				fail("There should be an exception thrown for a nonexistent path");
			}
		}

}

// ResourceService_2Test.java
