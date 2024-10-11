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
	* It tests if the method returns an input stream for a valid resource.
	*/
	@Test
	void testGetInputStreamValidResource() {
		InputStream inputStream = ResourceService.getInputStream("/images/icon.png");
		assertNotNull(inputStream);
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an invalid resource.
	*/
	@Test
	void testGetInputStreamInvalidResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/invalid.png");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for an empty resource.
	*/
	@Test
	void testGetInputStreamEmptyResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a null resource.
	*/
	@Test
	void testGetInputStreamNullResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream(null);
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading slash.
	*/
	@Test
	void testGetInputStreamLeadingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a trailing slash.
	*/
	@Test
	void testGetInputStreamTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
	
	/**
	* Test case for the {@link ResourceService#getInputStream(String)} method.
	* It tests if the method throws an {@link IllegalArgumentException} for a resource with a leading and trailing slash.
	*/
	@Test
	void testGetInputStreamLeadingAndTrailingSlashResource() {
		assertThrows(IllegalArgumentException.class, () -> {
			ResourceService.getInputStream("/images/icon.png/");
		});
	}
}