// ResourceService_2Test.java
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
* It contains one unit test case for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {

    /**
     * Loads the {@link ImageIcon} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link ImageIcon} or null if there was an IOException while trying
     * to read the image from a stream.
     */
    public static ImageIcon getIcon(String path);
    
    /**
     * Loads the {@link Image} that is located at the specified path.
     * @param path The location of the image within the classpath.
     * @return The loaded {@link Image}
     */
    public static Image getImage(String path);
    
    /**
     * Checks that loading a {@link ImageIcon} is always successful.
     */
    @Test
    public void testIconLoading() {
        assertEquals(ImageIcon.class,  getIcon(path()).getClass());
    }
    
    /**
     * Checks that loading a {@link BufferedImage} is always successful.
     */
    @Test
    public void testImageLoading() {
        assertNotNull(getImage(path()) );
    }
    
    
    /**
     * Checks that loading a {@link ImageIcon} is always successful.
     */
    @Test
    public void testIconLoading_2() {
        assertNotNull(getIcon(path()));
    }

    /**
     * Checks that loading a {@link ImageIcon} is always successful.
     */
    @Test
    public void testIconLoading_3() {
    	assertNotNull(getIcon(path()));
    }

    /**
     * Checks that loading an {@link ImageIcon} fails.
     */
    @Test(expected = IOException.class)
    public void testIconLoading_4() {
        getIcon(path()).getClass();
    }
}

// ResourceService_3Test.java
