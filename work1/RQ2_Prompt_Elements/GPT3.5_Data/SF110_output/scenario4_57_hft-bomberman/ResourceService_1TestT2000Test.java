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
* It contains ten unit test cases for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {
    
    /**
     * Test case for loading an existing image.
     */
    @Test
    void testGetImageIcon_existingImage() {
        ImageIcon icon = ResourceService.getImageIcon("images/test.png");
        assertNotNull(icon);
    }
    
    /**
     * Test case for loading a non-existing image.
     */
    @Test
    void testGetImageIcon_nonExistingImage() {
        ImageIcon icon = ResourceService.getImageIcon("images/nonexisting.png");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with an invalid path.
     */
    @Test
    void testGetImageIcon_invalidPath() {
        ImageIcon icon = ResourceService.getImageIcon("invalid/path/test.png");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with a null path.
     */
    @Test
    void testGetImageIcon_nullPath() {
        ImageIcon icon = ResourceService.getImageIcon(null);
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with an empty path.
     */
    @Test
    void testGetImageIcon_emptyPath() {
        ImageIcon icon = ResourceService.getImageIcon("");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with a whitespace path.
     */
    @Test
    void testGetImageIcon_whitespacePath() {
        ImageIcon icon = ResourceService.getImageIcon("   ");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with a path that points to a directory.
     */
    @Test
    void testGetImageIcon_directoryPath() {
        ImageIcon icon = ResourceService.getImageIcon("images");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with a path that points to a non-image file.
     */
    @Test
    void testGetImageIcon_nonImageFile() {
        ImageIcon icon = ResourceService.getImageIcon("images/test.txt");
        assertNull(icon);
    }
    
    /**
     * Test case for loading an image with a path that contains special characters.
     */
    @Test
    void testGetImageIcon_specialCharactersPath() {
        ImageIcon icon = ResourceService.getImageIcon("images/!@#$%^&*()_+-={}|[]\\:\";'<>?,./test.png");
        assertNotNull(icon);
    }
    
    /**
     * Test case for loading an image with a path that contains non-ASCII characters.
     */
    @Test
    void testGetImageIcon_nonAsciiPath() {
        ImageIcon icon = ResourceService.getImageIcon("images/测试.png");
        assertNotNull(icon);
    }
}