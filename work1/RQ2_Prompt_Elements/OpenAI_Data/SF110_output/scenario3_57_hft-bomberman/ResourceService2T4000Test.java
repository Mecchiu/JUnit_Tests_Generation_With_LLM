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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {

	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
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
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     *
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public static InputStream getInputStream(String path) {
        return ResourceService.class.getResourceAsStream(path);
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
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
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     *
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public static InputStream getInputStream(String path) {
        return ResourceService.class.getResourceAsStream(path);
    }

    /**
     * Loads an image from the classpath.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image.
     * @throws IOException
     */
    public static Image loadImage(String path) throws IOException {
        InputStream is = getInputStream(path);
        BufferedImage img = ImageIO.read(is);
        is.close();
        return img;
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
	}
	
	/**
	 * Test case for {@link ResourceService#loadImage(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImage() throws IOException {
		Image img = ResourceService.loadImage("/images/logo.png");
		assertNotNull(img);
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
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     *
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public static InputStream getInputStream(String path) {
        return ResourceService.class.getResourceAsStream(path);
    }

    /**
     * Loads an image from the classpath.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image.
     * @throws IOException
     */
    public static Image loadImage(String path) throws IOException {
        InputStream is = getInputStream(path);
        BufferedImage img = ImageIO.read(is);
        is.close();
        return img;
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image as an {@link ImageIcon}.
     * @throws IOException
     */
    public static ImageIcon loadImageIcon(String path) throws IOException {
        Image img = loadImage(path);
        return new ImageIcon(img);
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
	}
	
	/**
	 * Test case for {@link ResourceService#loadImage(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImage() throws IOException {
		Image img = ResourceService.loadImage("/images/logo.png");
		assertNotNull(img);
	}
	
	/**
	 * Test case for {@link ResourceService#loadImageIcon(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImageIcon() throws IOException {
		ImageIcon img = ResourceService.loadImageIcon("/images/logo.png");
		assertNotNull(img);
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
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     *
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public static InputStream getInputStream(String path) {
        return ResourceService.class.getResourceAsStream(path);
    }

    /**
     * Loads an image from the classpath.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image.
     * @throws IOException
     */
    public static Image loadImage(String path) throws IOException {
        InputStream is = getInputStream(path);
        BufferedImage img = ImageIO.read(is);
        is.close();
        return img;
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image as an {@link ImageIcon}.
     * @throws IOException
     */
    public static ImageIcon loadImageIcon(String path) throws IOException {
        Image img = loadImage(path);
        return new ImageIcon(img);
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @param width The width of the image.
     * @param height The height of the image.
     * @return The loaded image as an {@link ImageIcon}.
     * @throws IOException
     */
    public static ImageIcon loadImageIcon(String path, int width, int height) throws IOException {
        Image img = loadImage(path);
        img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceServiceTest {
		
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream() throws IOException {
		InputStream is = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(is);
		is.close();
	}
	
	/**
	 * Test case for {@link ResourceService#loadImage(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImage() throws IOException {
		Image img = ResourceService.loadImage("/images/logo.png");
		assertNotNull(img);
	}
	
	/**
	 * Test case for {@link ResourceService#loadImageIcon(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImageIcon() throws IOException {
		ImageIcon img = ResourceService.loadImageIcon("/images/logo.png");
		assertNotNull(img);
	}
	
	/**
	 * Test case for {@link ResourceService#loadImageIcon(String, int, int)}
	 *
	 * @throws IOException
	 */
	@Test
	void testLoadImageIconWithSize() throws IOException {
		ImageIcon img = ResourceService.loadImageIcon("/images/logo.png", 100, 100);
		assertNotNull(img);
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
     * Creates a connection to the resource that is located at the specified
     * path via an {@link InputStream}.
     *
     * @param path The location of the resource within the classpath.
     * @return The {@link InputStream} that points the requested resource.
     */
    public static InputStream getInputStream(String path) {
        return ResourceService.class.getResourceAsStream(path);
    }

    /**
     * Loads an image from the classpath.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image.
     * @throws IOException
     */
    public static Image loadImage(String path) throws IOException {
        InputStream is = getInputStream(path);
        BufferedImage img = ImageIO.read(is);
        is.close();
        return img;
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @return The loaded image as an {@link ImageIcon}.
     * @throws IOException
     */
    public static ImageIcon loadImageIcon(String path) throws IOException {
        Image img = loadImage(path);
        return new ImageIcon(img);
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @param width The width of the image.
     * @param height The height of the image.
     * @return The loaded image as an {@link ImageIcon}.
     * @throws IOException
     */
    public static ImageIcon loadImageIcon(String path, int width, int height) throws IOException {
        Image img = loadImage(path);
        img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    /**
     * Loads an image from the classpath and creates an {@link ImageIcon} from it.
     *
     * @param path The location of the image within the classpath.
     * @param width The width of the image.
     * @param height The height of the image.
     * @param keepAspectRatio If