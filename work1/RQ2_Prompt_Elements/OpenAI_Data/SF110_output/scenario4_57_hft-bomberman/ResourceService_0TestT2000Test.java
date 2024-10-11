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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_0Test {

	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is null.
	 */
	@Test
	void testGetImage_0() {
		Image result = ResourceService.getImage(null);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is empty.
	 */
	@Test
	void testGetImage_1() {
		Image result = ResourceService.getImage("");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_2() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_3() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_4() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_5() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_6() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_7() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_8() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImage_9() {
		Image result = ResourceService.getImage("/images/not_existing.png");
		assertNull(result);
	}
}

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
	 * Test if the method returns null if the path is null.
	 */
	@Test
	void testGetImageIcon_0() {
		ImageIcon result = ResourceService.getImageIcon(null);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is empty.
	 */
	@Test
	void testGetImageIcon_1() {
		ImageIcon result = ResourceService.getImageIcon("");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_2() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_3() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_4() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_5() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_6() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_7() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_8() {
		ImageIcon result = ResourceService.getImageIcon("/images/not_existing.png");
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ResourceService#getImageIcon(String)}
	 * <p>
	 * Test if the method returns null if the path is not valid.
	 */
	@Test
	void testGetImageIcon_9() {
		ImageIcon result = ResourceService