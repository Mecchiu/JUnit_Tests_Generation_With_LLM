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