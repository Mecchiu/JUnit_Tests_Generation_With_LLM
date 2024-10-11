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
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream2() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream3() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream4() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream5() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream6() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream7() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream8() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream9() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
	
	/**
	 * Test case for {@link ResourceService#getInputStream(String)}
	 *
	 * @throws IOException
	 */
	@Test
	void testGetInputStream10() throws IOException {
		InputStream inputStream = ResourceService.getInputStream("/images/logo.png");
		assertNotNull(inputStream);
		BufferedImage image = ImageIO.read(inputStream);
		assertNotNull(image);
	}
}