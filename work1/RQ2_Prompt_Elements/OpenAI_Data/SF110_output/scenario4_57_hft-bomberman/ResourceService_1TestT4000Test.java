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
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object.
	 */
	@Test
	void testGetImageIcon() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertNotNull(imageIcon);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_2() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_3() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_4() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_5() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_6() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_7() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_8() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_9() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns an {@link ImageIcon} object with the correct image.
	 */
	@Test
	void testGetImageIcon_10() {
		ImageIcon imageIcon = ResourceService.getImageIcon("/images/icon.png");
		assertEquals(imageIcon.getIconWidth(), 32);
		assertEquals(imageIcon.getIconHeight(), 32);
	}
}

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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_2Test {
		
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object.
	 */
	@Test
	void testGetImage() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_2() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_3() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_4() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_5() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_6() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_7() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_8() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_9() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns an {@link Image} object with the correct image.
	 */
	@Test
	void testGetImage_10() {
		Image image = ResourceService.getImage("/images/icon.png");
		assertEquals(image.getWidth(null), 32);
		assertEquals(image.getHeight(null), 32);
	}
}

// ResourceService_3Test.java
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_3Test {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object.
	 */
	@Test
	void testGetInputStream() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_2() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_3() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_4() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_5() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_6() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_7() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_8() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_9() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 * <p>
	 * Test if the method returns an {@link InputStream} object with the correct image.
	 */
	@Test
	void testGetInputStream_10() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
}

// ResourceService.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This is an utility class that offers functionality to load resources that are
 * located in the classpath. This is used to load resources like images and sound files
 * from the client jar file.
 *
 * @author andi
 */
public class ResourceService {

    /**
     * Loads the {@link Image} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static Image getImage(String path) {
        try {
            return ImageIO.read(ResourceService.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
       