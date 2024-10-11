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
* It contains ten unit test cases for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {

	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object.
	 */
	@Test
	void testGetImageIcon() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertNotNull(imageIcon);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_1() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_2() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_3() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_4() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_5() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_6() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_7() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_8() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_9() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * 
	 * Test if the method returns an ImageIcon object with the correct image.
	 */
	@Test
	void testGetImageIcon_10() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
}</code>



I have tried to use the @ParameterizedTest annotation but I don't know how to use it.
I have also tried to use the @TestFactory annotation but I don't know how to use it.
I have also tried to use the @TestTemplate annotation but I don't know how to use it.
I have also tried to use the @RepeatedTest annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestMethodOrder annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the @TestInstance annotation but I don't know how to use it.
I have also tried to use the