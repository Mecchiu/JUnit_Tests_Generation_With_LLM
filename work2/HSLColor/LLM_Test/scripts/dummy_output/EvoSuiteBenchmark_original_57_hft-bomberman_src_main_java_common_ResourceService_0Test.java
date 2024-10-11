java
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
class ResourceService_0Test {

    @Test
    void testGetImage_ValidPath() {
        Image image = ResourceService.getImage("/images/test.png");
        assertNotNull(image);
    }

    @Test
    void testGetImage_NullPath() {
        Image image = ResourceService.getImage(null);
        assertNull(image);
    }

    @Test
    void testGetImage_NonExistentPath() {
        Image image = ResourceService.getImage("/images/nonexistent.png");
        assertNull(image);
    }

    @Test
    void testGetImage_IOException() {
        Image image = ResourceService.getImage("/images/ioexception.png");
        assertNull(image);
    }

    @Test
    void testGetImageIcon_ValidPath() {
        ImageIcon icon = ResourceService.getImageIcon("/images/test.png");
        assertNotNull(icon);
    }

    @Test
    void testGetImageIcon_NullPath() {
        ImageIcon icon = ResourceService.getImageIcon(null);
        assertNull(icon);
    }

    @Test
    void testGetInputStream_ValidPath() {
        InputStream inputStream = ResourceService.getInputStream("/images/test.png");
        assertNotNull(inputStream);
    }

    @Test
    void testGetInputStream_NullPath() {
        assertThrows(IllegalArgumentException.class, () -> {
            ResourceService.getInputStream(null);
        });
    }

    @Test
    void testGetInputStream_NonExistentPath() {
        assertThrows(IllegalArgumentException.class, () -> {
            ResourceService.getInputStream("/images/nonexistent.png");
        });
    }
}
