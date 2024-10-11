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
	void testGetImage_0() throws IOException {
		Image img = getImage("/home/andi/ResourceService/resource.png");
		assertNotNull(img);
		ImageIcon imgIcon = getImageIcon("/home/andi/ResourceService/image_00.png");
		assertNotNull(imgIcon);
	}
	
	@Test
	void testGetIcon_0() throws IOException {
		Image img = getImage("/home/andi/ResourceService/ImageService/icon/image_00.png");
		assertNotNull(img);
		ImageIcon imgIcon = getImageIcon("/home/andi/ResourceService/IconService/image_00.png");
		assertNotNull(imgIcon);
	}
	
	@Test
	void testGetImage_Failing() throws IOException {
		InputStream is = getInputStream("/home/andi/Test.txt");
		BufferedImage img = ImageIO.read(is);
		assertNotNull(img);
	} 
	
	@Test
	void testGetIcon_Failing() throws IOException {
		InputStream is = getInputStream("/home/andi/Test_IconService/icon/ImageService/icon_00.png");
		BufferedImage img = ImageIO.read(is);
		assertNotNull(img);
	}
	
}