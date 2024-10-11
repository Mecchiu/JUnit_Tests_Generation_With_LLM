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
		ResourceService tEjb;
	
	/**
	 * It also contains one test for each loaded {@link ImageIcon} in the classpath.
	 */
	@Test
	public void testGetImage() {
		tEjb.getImage("java/test_image_01.jpg");
		//System.out.println("FINAL: " + tEjb.getImage("java/test_image_01.jpg"));
		tEjb.getImage("java/test_image_02.png");
		//System.out.println("FINAL: " + tEjb.getImage("java/test_image_02.png"));
		Image image = tEjb.getImage("java/test_image_03.jpg");
		ImageIcon icon = tEjb.getImageIcon("java/test_image_04.png");
	}

	// ResourceService_1Test.java
		/**
		 * Test method for {@link ResourceService#getImage(String)}.
		 */
		@Test
		public void testGetImage() {
			assertEquals(Image.class, tEjb.getImage("java/test_image_01.jpg").getClass());
			assertTrue(tEjb.getImage("java/test_image_01.jpg") instanceof BufferedImage);
	}

	// ResourceService_2Test.java
		/**
		 * Test method for {@link ResourceService#getImageIcon(String)}.
		 */
		@Test
		public void testGetImageIcon() {
			ImageIcon imageIcon = tEjb.getImageIcon("java/test_image_01.png");
			assertTrue(imageIcon.getIcon() instanceof ImageIcon);
			assertTrue(tEjb.getImageIcon("java/test_image_01.png") instanceof ImageIcon);
			ImageIcon imageIcon2 = tEjb.getImageIcon("java/test_image_00.jpg");
			//System.out.println(imageIcon instanceof ImageIcon);	// Not yet working...
	}

	// ResourceService_3Test.java
		/**
		 * Test method for {@link ResourceService#getInputStream(String)}.
		 */
		@Test
		public void testGetInputStream() {
			InputStream inputStream = tEjb.getInputStream("java/test_input_01.png");
			assertEquals("java/test_input_01.png", tEjb.getInputStream("java/test_input_01.png"));
			assertEquals("java/test_input_01.png", tEjb.getInputStream("java/test_input_01.png"));
			Integer result = tEjb.getInputStream("java/test_input_02.png");
			//System.out.println(result instanceof Integer);	// Not yet working...
			
			inputStream = tEjb.getInputStream("java/test_input_01.png");
			//System.out.println(result instanceof InputStream);	// Not yet working...
		}

	// ResourceService_4Test.java
		/**
		 * Test method for {@link ResourceService#getInputStream(String)}.
		 */
		@Test
		public void testGetInputStreamNoResolution() {
			String testCode = "ResourceService_4Test.java";
			try {
				InputStream inputStream = tEjb.getInputStreamAndSetResolution(testCode);
				System.out.println(inputStream.getClass().getName());	// Not yet working...
			}
			catch (NoClassDefFoundError nc) {
				if (nc.toString().toLowerCase().endsWith(testCode.toLowerCase())) {
					// OK
				}
				else {
					// OK but class wasn't found...
					System.err.println(nc);
				}
			}
			catch (IOException ioe) {
				System.err.println(ioe);
			}
			fail("Can't load test code: " + testCode);
		}

	// ResourceService_5Test.java
		/**
		 * Test method for {@link ResourceService#getInputStream(String)}.
		 */
		@Test
		public void testGetInputStreamWithCustomPath() {
			String testCode = "ResourceService_5Test.java";
			try {
				InputStream inputStream = tEjb.getInputStream(testCode);
				System.out.println(inputStream.getClass().getName());	// Not yet working...
	
			}
			catch (IOException ioe) {
				System.err.println(ioe);
			}
			fail("Can't load test code: " + testCode);
		}
}

//=================================================================
// RESOURCES MANAGMENT
//=================================================================
public class ResourceService {
	static InputStream getClassesResourcesStream() {
		try {
			return ResourceService_0Tester.class.getClassLoader().getResourceAsStream("classes");
		}
		catch (IOException ioe) {
			throw ioe;
		}
		catch (ClassNotFoundException cnfe) {
			throw cnfe;
		}
		catch (SecurityException se) {
			throw se;
		}
		catch (NoClassDefFoundError ncfe) {
			throw ncfe;
		}
	}

	static BufferedImage getImage(String path) throws IOException {
		//System.out.println(path);	// Not yet working...
		InputStream inputStream = getClassesResourcesStream();
		return ImageIO.read(inputStream);
	}

	static ImageIcon getImageIcon(String path) throws IOException {
		//System.out.println("IMAGE: " + path);
		inputStream = getClassesResourcesStream();
		return ImageIO.read(inputStream);
	}

	static Image getImage(String path) throws ClassNotFoundException, IOException {
		try {
			return getImage(path);
		}
		catch (IOException ioe) {
			return getImageIcon(path);
		}
	}
}