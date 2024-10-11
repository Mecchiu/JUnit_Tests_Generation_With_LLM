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
	 * @throws IOException
	 */
	@Test
	void testGetImage() throws IOException {
		Image image = ResourceService.getImage("/images/test.png");
		assertNotNull(image);
		assertEquals(image.getWidth(null), 100);
		assertEquals(image.getHeight(null), 100);
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
     *
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static Image getImage(String path) {
        BufferedImage image;
        try {
            image = ImageIO.read(getInputStream(path));
        } catch (IOException e) {
            image = null;
        }
        return image;
    }

    /**
     * Loads the {@link InputStream} that is located at the specified path.
     *
     * @param path The location of the stream within the classpath.
     * @return The loaded {@link InputStream} or null if there was an IOException while trying
     * to read the stream.
     */
    public static InputStream getInputStream(String path) {
        InputStream stream = ResourceService.class.getResourceAsStream(path);
        return stream;
    }
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
	 * @throws IOException
	 */
	@Test
	void testGetImage() throws IOException {
		Image image = ResourceService.getImage("/images/test.png");
		assertNotNull(image);
		assertEquals(image.getWidth(null), 100);
		assertEquals(image.getHeight(null), 100);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream stream = ResourceService.getInputStream("/images/test.png");
		assertNotNull(stream);
		assertTrue(stream.available() > 0);
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
     *
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static Image getImage(String path) {
        BufferedImage image;
        try {
            image = ImageIO.read(getInputStream(path));
        } catch (IOException e) {
            image = null;
        }
        return image;
    }

    /**
     * Loads the {@link InputStream} that is located at the specified path.
     *
     * @param path The location of the stream within the classpath.
     * @return The loaded {@link InputStream} or null if there was an IOException while trying
     * to read the stream.
     */
    public static InputStream getInputStream(String path) {
        InputStream stream = ResourceService.class.getResourceAsStream(path);
        return stream;
    }
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
	 * @throws IOException
	 */
	@Test
	void testGetImage() throws IOException {
		Image image = ResourceService.getImage("/images/test.png");
		assertNotNull(image);
		assertEquals(image.getWidth(null), 100);
		assertEquals(image.getHeight(null), 100);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream stream = ResourceService.getInputStream("/images/test.png");
		assertNotNull(stream);
		assertTrue(stream.available() > 0);
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
     *
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static Image getImage(String path) {
        BufferedImage image;
        try {
            image = ImageIO.read(getInputStream(path));
        } catch (IOException e) {
            image = null;
        }
        return image;
    }

    /**
     * Loads the {@link InputStream} that is located at the specified path.
     *
     * @param path The location of the stream within the classpath.
     * @return The loaded {@link InputStream} or null if there was an IOException while trying
     * to read the stream.
     */
   