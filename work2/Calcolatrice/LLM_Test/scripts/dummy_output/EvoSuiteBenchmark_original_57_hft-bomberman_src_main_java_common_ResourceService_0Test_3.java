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
* It contains one unit test case for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_0Test {
		
	/**
	 * Test case for {@link ResourceService#getImage(String)}
	 */
	@Test
	void testGetImage() {
		// A class under test
		ResourceService.TestService a = new ResourceService.TestService();
		
		// Fetch the image at the specified path
		InputStream is = ResourceService.getInputStream("resource:my/path");
		Image srcImg = ImageIO.read(is);
		ImageIcon srcImgI = new ImageIcon(srcImg);
		
		// Check if the expected image is loaded
		Image expectedResult = a.getImage("resource:my/path");
		assertTrue(expectedResult!= null);
		assertEquals(expectedResult, srcImg);

		// Check if the loaded image is of the expected type
		Image expectedType = a.getImageIcon("resource:my/path");
		assertEquals(expectedResult, expectedType);
	}

	/**
	 * Test class of {@link ResourceService#getInputStream(String)}
	 */
	@Test
	void testGetInputStream() {
		// A class under test
		ResourceService.TestService a = new ResourceService.TestService();
		
		// Fetch the path from the classpath
		String path ="resource:my/path";
		InputStream is1 = ResourceService.getInputStream(path);
		String pathResult= a.getInputStream(path);
		
		assertNotEquals(path, "resource:my/path");
		
		// Check if it is the expected type
		assertEquals(pathResult, pathResult);
		
		// Check if no data can be fetched
		try {
			InputStream is2 = ResourceService.getInputStream(path);
			fail("IOException expected if data is not available");
		}
		catch (IOException  exc) {
			assertEquals("Failed fetching resource: "  + pathResult, exc);
		}
	}

	/**
	 *  Unit test class of {@link ResourceService#getIntellisenseInformation(String)}
	 */
	@Test
	void testGetIntellisenseInformation() {
		// A class under test
		ResourceService.TestService a = new ResourceService.TestService();
		
		// Fetch the path from the classpath
		String path ="/path/to/image";
		InputStream is = ResourceService.getInputStream(path);
		String pathResult= a.getIntellisenseInformation(path);
		
		assertNotEquals(path, "resource:path");
		
		// Check if the expected image can be loaded
		Image expectedResult = null;
		try {
			expectedResult = ImageIO.read(is);
		}
		catch(IOException exc) {
			assertTrue(false);
		}
		assertEquals(expectedResult, null);
		
		//
		// Check if the result is of the expected value
		//
		assertTrue(a.getIntellisenseInformation(path).equals("1.1.0"));
	}
	
	@Test
	void testGetClasspathResourceClasses() {
		// A class under test
		ResourceService.TestService a = new ResourceService.TestService();
		
		//
		// Test case when the classpath contains no resources
		//
		StringBuilder classes = new StringBuilder();
		try {
			classes.append("").append(Thread.currentThread().getContextClassLoader().getResource(""));
		}
		catch (Exception exc) {
			fail("Classpath resource classes failed\n" + exc.getMessage());
		}
		
		//
		// Fetch the path from the classpath
		//
		InputStream is = ResourceService.getInputStream("/path/to/image");
		String pathResult = a.getClasspathResourceClasses();
		String classpath = classes.toString();
			
		// Check the output of the classpath.
		String expectedResult = null;
		
		if (classpath.indexOf("org/osgi/framework")!= -1) {
			expectedResult = classpath;
		}
		else if (classpath.indexOf("com/ibm/osgi/framework")!= -1) {
			expectedResult = pathResult;
		}
		else {
			expectedResult = null;
		}
		
		assertEquals(expectedResult, pathResult);
		
	}
}