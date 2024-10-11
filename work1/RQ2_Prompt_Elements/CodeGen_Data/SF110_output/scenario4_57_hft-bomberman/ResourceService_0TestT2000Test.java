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

    @Test
    public void testGetImage() {
        //System.out.println("ResourceService.java.testGetImage...");

        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("sample.png");
        Image img = getImage(is);
        assertNotNull("No image loaded", img);
        BufferedImage bImg = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        bImg.getGraphics().drawImage(img, 0, 0, null);
        assertTrue("Image load from classpath did not produce correct image", bImg.getWidth(null) == img.getWidth(null));
        assertTrue("Image load from classpath did not produce correct image", bImg.getHeight(null) == img.getHeight(null));
    }

    @Test
    public void testGetImageIcon() {
        //System.out.println("ResourceService.java.testGetImageIcon...");

        ImageIcon is = Thread.currentThread().getContextClassLoader().getResourceAsIcon("sample.png");
        assertNotNull("No image icon loaded", is);
        assertTrue("Image icon got deleted", is.getPath()!= null);
    }

    @Test
    public void testGetInputStream() {
        //System.out.println("ResourceService.java.testGetInputStream...");

        InputStream is = ResourceService.class.getResourceAsStream("sample.png");
        assertNotNull("No resource was found", is);
        BufferedImage img = getImage(is);
        assertNotNull("No image loaded", img);
        assertEquals("Image not loaded correctly", img.getWidth(null), img.getHeight(null));
    }
}
