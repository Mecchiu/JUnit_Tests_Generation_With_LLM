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
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method returns an input stream for a valid resource path.
	*/
	@Test
	void testGetInputStreamValid() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an invalid resource path.
	*/
	@Test
	void testGetInputStreamInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon2.png");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an empty resource path.
	*/
	@Test
	void testGetInputStreamEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a null resource path.
	*/
	@Test
	void testGetInputStreamNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream(null);
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading slash.
	*/
	@Test
	void testGetInputStreamLeadingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a trailing slash.
	*/
	@Test
	void testGetInputStreamTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash2() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash3() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash4() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
}
```

## Exercise 2

### Task 1

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

    public static InputStream getInputStream(String path) {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream(path);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("No such resource: " + path);
        }
        return resourceAsStream;
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
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method returns an input stream for a valid resource path.
	*/
	@Test
	void testGetInputStreamValid() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an invalid resource path.
	*/
	@Test
	void testGetInputStreamInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon2.png");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an empty resource path.
	*/
	@Test
	void testGetInputStreamEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a null resource path.
	*/
	@Test
	void testGetInputStreamNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream(null);
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading slash.
	*/
	@Test
	void testGetInputStreamLeadingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a trailing slash.
	*/
	@Test
	void testGetInputStreamTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash2() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash3() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash4() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
}
```

### Task 2

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

    public static InputStream getInputStream(String path) {
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream(path);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("No such resource: " + path);
        }
        return resourceAsStream;
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
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method returns an input stream for a valid resource path.
	*/
	@Test
	void testGetInputStreamValid() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an invalid resource path.
	*/
	@Test
	void testGetInputStreamInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon2.png");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an empty resource path.
	*/
	@Test
	void testGetInputStreamEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a null resource path.
	*/
	@Test
	void testGetInputStreamNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream(null);
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading slash.
	*/
	@Test
	void testGetInputStreamLeadingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a trailing slash.
	*/
	@Test
	void testGetInputStreamTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlash2() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource path with a leading and trailing slash.
