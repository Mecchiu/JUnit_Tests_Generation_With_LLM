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
		public static final String FIVE = "five";
		public static final String YELLOW = "yellow";
		
        /**
         * Load the image that is located at the specified path.
         * @param path The location of the image within the classpath.
         * @return The loaded {@link Image}.
         */
        public static Image getImage(String path) {
                InputStream input = null;
                try {
                        input = ResourceService.class.getClassLoader().getResourceAsStream(path);
                        return ImageIO.read(input);
                } catch (IOException e) {
                        return null;
                } finally {
                        if (input!= null) {
                                try {
                                        input.close();
                                } catch (IOException e) {
                                // ignored
                                }
                        }
                }
        }

        /**
         * Load the image icon from the specified path.
         * @param path The location of the image icon within the classpath.
         * @return The loaded {@link ImageIcon}.
         */
        public static ImageIcon getImageIcon(String path) {
                        return new ImageIcon(getImage(path));
        }

		@Test
        public void testGetImage() {
		assertEquals(String.format("Image should be equal to FUEL.jpg"), FIVE, getImage("/common/Resources/Image/FUEL.jpeg").getImage().getWidth());
		assertEquals(String.format("Image should be equal to FUEL.jpg"), FIVE, getImage("/common/Resources/Image/FUEL.jpg").getImage().getHeight());
		assertEquals(String.format("Image should be equal to FUEL.jpg"), YELLOW, getImage("/common/Resources/Image/FUEL.jpg").getImage().getType());
		}

        @Test
        public void testGetInputStream() {
		assertNotNull(String.format("Image should not be null"),getImage("FALFALF.jpeg"));
		}

}