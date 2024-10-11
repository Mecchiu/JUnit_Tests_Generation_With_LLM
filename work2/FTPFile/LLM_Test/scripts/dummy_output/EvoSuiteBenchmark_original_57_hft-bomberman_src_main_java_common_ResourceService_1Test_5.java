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
         * A simple test case which allows a resource to be accessed
         * using one of the static methods of this class which returns an {@link ImageIcon}.
         * @throws IOException If an IO Exception occurs attempting to read the resource
         */
    @Test
    void testGetImageIcon_staticMethods() throws IOException {
        final ImageIcon result = ImageService.getImageIcon("TestImage");
        assertNotNull(result);
        assertTrue(result instanceof ImageIcon);
    }

    /**
    * Test that the {@link ImageIcon#getImage} method is called
    * and the return value equals the {@link ImageIcon#getImage} on a
    * Java implementation running on a Sun implementation.
    **/
    @Test
    public void testGetImage_javaMethods() {
        Image image = getImage("/java/image");
        assertNotNull(image);
        ImageIcon result = ImageService.getImageIcon(image);
        assertNotNull(result);
        assertTrue(result instanceof ImageIcon);
    }


    /**
    * Test that the {@link ImageIcon#getImage} method is called
    * and the return value equals the {@link ImageIcon#getImage} on a
    * Sun implementation running a Java implementation.
    **/
    @Test
    public void testGetImage_resources() {
        Image image = getImage("/java/image");
        assertNotNull(image);
        Image icon = ImageService.getImageIcon(image);
        assertNotNull(icon);
        assertTrue(icon instanceof ImageIcon);
    }

    /**
    * Test that the {@link ImageIcon#getImage} method is called
    * and a {@link InputStream} instance is passed as a parameter
    **/
    @Test
    public void testGetInputStream_javaInstance() throws IOException {
        assertNotNull(ImageService.getInputStream("/java/image"));
    }

    /**
    * Test that the {@link ImageIcon#getImage} method is called
    * and a {@link InputStream} instance is passed as a parameter
    * and a {@link InputStream} instance passed as the second argument with
    * a second try should never throw a {@link IOException}.
    **/
    @Test
    public void testGetInputStream_javaInstance_noException() throws IOException {
        assertNotNull(ImageService.getInputStream("/java/image", new byte[0]));
    }

    /**
    * Test that the {@link ImageIcon#getImage} method is called
    * and a {@link InputStream} instance is passed as a parameter
    * and a {@link InputStream} instance passed as the second argument
    * as a second try should never throw a {@link IOException}.
    **/
    @Test
    public void testGetInputStream_javaInstance_withException() throws IOException {
        assertNotNull(ImageService.getInputStream("/java/image", new byte[0], 0));
    }
}

// The following are the test cases which will need to be implemented with an assertion.
// ResourceService_1Test.java does not include assert.