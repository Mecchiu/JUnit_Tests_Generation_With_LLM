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

		@Test
		public void testImageLoading() {
					
			Image image = getImage("resources/Sample.jpg");
			assertNotNull(image); 
			
	    }
	 
		// @Test
		public void testImageLoading2() {
					
			Image image = getImage("client/resources/Sample.png");
			assertNotNull(image); 
			
			System.out.println(image.getBounds());
		}
	 
    }