// ResourceServiceTest.java
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
* It contains ten unit test cases for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceServiceTest {

	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath2() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test2.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath3() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test3.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath4() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test4.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath5() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test5.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath6() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test6.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath7() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test7.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath8() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test8.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath9() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test9.png");
		assertNotNull(imageIcon);
	}
	
	/**
	* Test case for the {@link ResourceService#getImageIcon(String)} method.
	* It tests if the method returns an image icon for a valid path.
	*/
	@Test
	void testGetImageIconValidPath10() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/test10.png");
		assertNotNull(imageIcon);
	}
}