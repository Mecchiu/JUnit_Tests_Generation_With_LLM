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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceServiceTest {

	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is null.
	 * </p>
	 */
	@Test
	void testGetImage_nullPath() {
		Image image = ResourceService.getImage(null);
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is empty.
	 * </p>
	 */
	@Test
	void testGetImage_emptyPath() {
		Image image = ResourceService.getImage("");
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is invalid.
	 * </p>
	 */
	@Test
	void testGetImage_invalidPath() {
		Image image = ResourceService.getImage("invalid");
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageNotFound() {
		Image image = ResourceService.getImage("images/notfound.png");
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound() {
		Image image = ResourceService.getImage("images/test.png");
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound_width() {
		Image image = ResourceService.getImage("images/test.png");
		assertEquals(image.getWidth(null), 100);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound_height() {
		Image image = ResourceService.getImage("images/test.png");
		assertEquals(image.getHeight(null), 100);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound_width_height() {
		Image image = ResourceService.getImage("images/test.png");
		assertEquals(image.getWidth(null), image.getHeight(null));
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound_width_height_2() {
		Image image = ResourceService.getImage("images/test.png");
		assertEquals(image.getWidth(null), 100);
		assertEquals(image.getHeight(null), 100);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 * </p>
	 */
	@Test
	void testGetImage_validPath_imageFound_width_height_3() {
		Image image = ResourceService.getImage("images/test.png");
		assertEquals(image.getWidth(null), image.getHeight(null));
		assertEquals(image.getWidth(null), 100);
		assertEquals(image.getHeight(null), 100);
	}
}
```

## Unit Test Case

A unit test case is a test case that tests a single method of a class.

### Example

```java
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
     *
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static Image getImage(String path);
}

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
* It contains ten unit test cases for the {@link ResourceService#getImage(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is null.
	 * </p>
	 */
	@Test
	void testGetImage_nullPath() {
		Image image = ResourceService.getImage(null);
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is empty.
	 * </p>
	 */
	@Test
	void testGetImage_emptyPath() {
		Image image = ResourceService.getImage("");
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is invalid.
	 * </p>
	 */
	@Test
	void testGetImage_invalidPath() {
		Image image = ResourceService.getImage("invalid");
		assertNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 * 
	 * <p>
	 * This test case checks if the method returns null if the path is valid but the image
	 * is not found.
	 *