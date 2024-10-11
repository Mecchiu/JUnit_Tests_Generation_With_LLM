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
		void testGetImage() throws Exception {
//This unit test will NOT find the client jar file!!!!!!!!!!!!!!
				try {
      InputStream stream = ResourceService.class.getResourceAsStream("image-sample.png");
//  			System.out.println("Image is Loaded From: "+ path.concat("\n"));
//      ImageIcon icon = ImageIO.read(stream);  
      BufferedImage img = ImageIO.read(stream);
// This is NOT a direct dependency of the Java 1.x standard ImageInputStream
//      assertNotNull(icon);
//  		 assertNotNull(img);
//  		 System.out.println("image is loaded");
				}
				catch (IOException e) {
			System.out.println(e);
			assertNull(e);
				}
				catch (Exception e) {
				System.out.println(e);
				assertNotNull(e);
				}
		}

		@Test
		void testGetImageIcon() throws Exception {
//This unit test will NOT find the client jar file!!!!!!!!!!!!!!
				try {
			InputStream stream = ResourceService.class.getResourceAsStream("image-sample.png");
	      ImageIcon icon = ImageIO.read(stream);  
			assertNotNull(icon);
			assertNotNull(icon);
				}
				catch (IOException e) {
			System.out.println(e);
			assertNull(e);
				}
				catch (Exception e) {
				System.out.println(e);
				assertNotNull(e);
				}
		}
}