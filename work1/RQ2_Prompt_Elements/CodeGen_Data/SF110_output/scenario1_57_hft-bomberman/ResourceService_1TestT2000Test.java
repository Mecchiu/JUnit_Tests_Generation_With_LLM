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
// Create a new String resource name.
    private static String name = "META-INF/resources/image";
    // Create a new string resource path.
    private static String path = path + "/" + name;
    // Create a new File resource path.
    private static String path2 = path + "/" + name;
    // Create a new string resource path that contains non-existing path elements.
    private static String path3 = "resource" + "/file";
	@Test
    public void testImageIconGetter() {
        // Instantiate Service and load an existing resource to see if it
        // has gotten back
        new ImageService();

        // Check if resource is loaded successfully.
        String imageIcon = ResourceService_1Test.getImageIcon(path);
        Image image = ResourceService_1Test.getImage(imageIcon);
        Image icon = ResourceService_1Test.getImageIcon(resourcePath);
        assertTrue(image!= null);
        assertTrue(icon!= null);
    }

    @Test
    public void testGetImageIconResource2() {
        // Instantiate Service and load an existing resource to see if it
        // has gotten back
        new ImageService();

        // Check if resource is loaded successfully.
        String path2 = path + "/" + "testGetImageIconResource2";
        Image image = ResourceService_1Test.getImage(ResourceService_1Test.getImageIcon(path2));
        assertTrue(image!= null);
    }
public class ImageService {
		public void start() {
		}
		public void stop() {
		}
		public final Image getImage(String path) {
		return new ImageIcon(getImage(path)).getImage();
	}
		public final String getImageIcon(String path) {
		return getImage(path).toString();
	}

    public InputStream getImageIconStream(String path) throws IOException {
        return getImageIconStream(path, ImageIO.class);
    }

    /**
     * Class of Input Stream used by ImageService
     * to access image resource.
     * @param path path to the resource (String)
     * @param InputStream class of Input Stream to load an image from (BufferedImage)
     * @return instance of InputStream
     */
    public static InputStream getImageIconStream(String path, Class<?> InputStreamClass) {
        // create InputStream object.
        InputStream imageStream = null;
        try {
            imageStream = (InputStream)InputStreamClass.getResourceAsStream(path);
        } catch (RuntimeException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // cast to byte array as buffer
        byte[] inputData = new byte[imageStream.available()];
        imageStream.read(inputData);

        // return inputstream
        return InputStream.wrap(inputData);
    }
}

// ResourceService_2Test.java
