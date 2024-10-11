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
* It contains one unit test case for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {
		
	/**
	 * Unit test for the method
	 *  {@link ResourceService#getImage(String)}
	 * using the path of a resource in client jar file.
	 */
	@Test
    public void testGetImage() {
        @SuppressWarnings("unused")
		ImageIcon icon = new ResourceService().getImage("./resources/testRes.img");

        @SuppressWarnings("unused")
		ImageIcon icon_1 = new ResourceService().getImageIcon("./resources/testRes_1.png");
        @SuppressWarnings("unused")
        BufferedImage img1 = new BufferedImage (16, 16, BufferedImage.TYPE_INT_ARGB);

    }

	/**
	 * Unit test for the method
	 *  {@link ResourceService#getImageIcon(String, ImageIcon)}
	 * when a path is specified for the resource, using the specified
	 * {@link ImageIcon} object.
	 */
	@Test
    public void testGetImageIcon() {
        @SuppressWarnings("unused")
		ImageIcon icon_1 = new ResourceService().getImageIcon("testRes_1.png", new ImageIcon(new BufferedImage(10,10,256)));

        @SuppressWarnings("unused")
		ImageIcon icon_2 = new ResourceService().getImageIcon("testRes_2.png", new ImageIcon(new BufferedImage(40, 10,256)));
        @SuppressWarnings("unused")
        BufferedImage img2 = new BufferedImage(40, 10, 256);

        assertEquals(img2, icon_1.getImage());

    }

	/**
	 * Unit test for the method
	 *  {@link ResourceService#getInputStream(String)}
	 * when a path is specified for the resource, using the specified
	 * {@link InputStream} object.
	 */
	@Test
    public void testGetInputStream() {
        @SuppressWarnings("unused")
		InputStream source = new BufferedInputStream(new BufferedInputStream(new File("testRes.jar").toURI().toURL().openStream()));

        @SuppressWarnings("unused")
		InputStream source_1 = new BufferedInputStream(new File("testRes_1.jar").toURI().toURL().openStream());

        assertEquals(source, new ResourceService().getInputStream("testRes.txt"));

        assertEquals(source_1, new ResourceService().getInputStream("testRes_1.txt"));
    }


	/**
	 * Unit test for the method
	 *  {@link ResourceService#getInputStream(String)}
	 * when a path is specified for the resource, using a resource
	 * from the server jar file.
	 */
	@Test
    public void testGetInputStreamServerJar() throws IOException {
        @SuppressWarnings("unused")
		InputStream source = new BufferedInputStream(new File("testRes.jar").toURI().toURL().openStream());

        @SuppressWarnings("unused")
		InputStream source_1 = new ResourceService().getInputStream("testRes_1.txt");

        assertEquals(source_1, new ResourceService().getInputStream("testRes_1.txt"));
    }

	/**
	 * Unit test for the method
	 *  {@link ResourceService#getInputStream(String)}
	 * when a path is specified for the resource, using an empty url.
	 */
	@Test
    public void testGetInputStreamNull() {
        @SuppressWarnings("unused")
		InputStream source = new BufferedInputStream(new File("testRes.jar").toURI().toURL().openStream());

        @SuppressWarnings("unused")
		InputStream source_1 = new BufferedInputStream(new File("testRes.txt"));

        assertNull(new ResourceService().getInputStream(null));
    }

}