```java
package common;

import java.awt.Image;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResourceService_1Test {

    @Test
    void testGetImageIcon_NullPath() {
        ImageIcon icon = ResourceService.getImageIcon(null);
        assertNull(icon);
    }

    @Test
    void testGetImageIcon_EmptyPath() {
        ImageIcon icon = ResourceService.getImageIcon("");
        assertNull(icon);
    }

    @Test
    void testGetImageIcon_NonExistingPath() {
        ImageIcon icon = ResourceService.getImageIcon("non_existing.png");
        assertNull(icon);
    }

    @Test
    void testGetImageIcon_ValidPath() {
        ImageIcon icon = ResourceService.getImageIcon("/images/logo.png");
        assertNotNull(icon);
    }

    @Test
    void testGetImageIcon_InvalidImageFormat() {
        ImageIcon icon = ResourceService.getImageIcon("/images/invalid.jpg");
        assertNull(icon);
    }

    @Test
    void testGetImageIcon_ExceptionThrown() {
        ImageIcon icon = ResourceService.getImageIcon("/images/exception.png");
        assertNull(icon);
    }

    @Test
    void testGetImageIcon_MultipleCalls() {
        ImageIcon icon1 = ResourceService.getImageIcon("/images/logo.png");
        ImageIcon icon2 = ResourceService.getImageIcon("/images/logo.png");
        assertNotSame(icon1, icon2);
    }

    @Test
    void testGetImageIcon_SameImage() {
        ImageIcon icon1 = ResourceService.getImageIcon("/images/logo.png");
        ImageIcon icon2 = ResourceService.getImageIcon("/images/logo.png");
        assertEquals(icon1.getImage(), icon2.getImage());
    }

    @Test
    void testGetImageIcon_DifferentImages() {
        ImageIcon icon1 = ResourceService.getImageIcon("/images/logo.png");
        ImageIcon icon2 = ResourceService.getImageIcon("/images/icon.png");
        assertNotEquals(icon1.getImage(), icon2.getImage());
    }
}
```