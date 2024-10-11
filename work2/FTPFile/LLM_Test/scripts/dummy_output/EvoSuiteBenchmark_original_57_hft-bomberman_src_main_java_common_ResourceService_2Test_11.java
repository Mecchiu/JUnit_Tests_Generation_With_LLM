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
		 * The test case.
		 */
		ResourceService_2Test() {
			// create and create initial image
			BufferedImage tmpImg = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);

			// store the image that will be loaded
			image = ImageIO.read(tmpImg.getSource());
		}

		// get the image
		private Image image;

		@Test
		public void test1() throws IOException {
			// the test case
			checkImage(image);
		}

}

/**
 * Creates a connection to a resource within the classpath by using
 * its path as the input stream.
 * @param path The resource to load.
 * @return The requested {@link InputStream} from the resource.
 */
InputStream getInputStream(String path) {
	return ResourceService.class.getResourceAsStream(path);
}

/**
* Checks the received {@link Image} by executing some basic tests:
* <ol>
* <li>It should be an empty BufferedImage for the default format (JPG) </li>
* <li>It should have an image width equal to the image height</li>
* <li>It should have an image height equal to the image width</li>
* </ol>
*/
private static void checkImage(Image im) {
	try {
		// check the width and height
		assertEquals(im.getWidth("test"), 0);
		assertEquals(im.getHeight("test"), 0);

		// it should be a 2x width for the default format (JPG)
		BufferedImage img = ImageIO.read(new InputStream() {
					public int read() throws IOException {
						throw new AssertionError("test");
					}});
		assertEquals(2*img.getWidth(), img.getHeight());

		// it should have a 2x height for the default format (JPG)
		img = ImageIO.read(new InputStream() {
					public int read() throws IOException {
						throw new AssertionError("test");
					}});
		assertEquals(3*img.getWidth(), img.getHeight());
	} catch (IOException ignore) {
		System.err.println("IOException when test");
	}
}

/**
 * Utility class that offers methods to create an uninitialized
 * {@link ImageIcon} based on a {@link ImageIO} object. This class will
 * also be used to load an image (invalid)
 * @author andi
 */
class ResourceService__InvalidImage extends ResourceService {

    /**
     *
     * @param inputStream the inputStream that points the image to
     *            load
     */
    public ResourceService__InvalidImage(String path) {
        super(path);
        try {
            // set the image to empty
            super.setImage(super.getInputStream(path));
        } catch (IOException ex) {

        }
    }

    /**
     * This should return the default resolution with a JPG image format.
     * @return a default resolution
     */
    public ImageIcon getDefaultImage() {
        return new ImageIcon(getImage("res/default.jpg"));
    }

    /**
     * The {@link ImageIcon} that is set.
     */
    private ImageIcon icon;
    
    /**
     * Create a {@link IconImage} based on an array of {@link Image} with
     * a different array view than the default one.
     */
    @Override
    protected ImageIcon getImageIcon() {
        Image[] images = new Image[2];
        images[0] = super.getImage();
        images[1] = getDefaultImage();
        return new IconImage((javax.swing.border.SoftBevelBorder) images[0].getBorder(),
                this, images[1]);
    }

    public ImageIcon getIcon() {
        if(icon == null) {
            addComponentListener(new ResourceService__InvalidImage(
                    getImage(getPath()).getWidth(), getPath().length()));
            icon = getImageIcon();
        }
        return icon;
    }

}

/**
 * A utility class that offers methods to create a {@link ImageIcon} based
 * on a {@link ImageIcon} object. This class will also be used to load a
 * image (set to "res/default.png")
 * @author andi
 */
class ResourceService__InvalidImage2 extends ResourceService {

    /**
     * Create a {@link IconImage} based on an array of {@link Image} with
     * a different array view than the default one.
     */
    public ImageIcon getIcon() {
        try {
            // set the image to empty
            setImage(getImage("res/default.png"));
            return this;
        } catch (IOException ignore) {
        }
    }

    /**
     * This should return the default resolution with a JPG image format.
     * @return a default resolution
     * @throws IOException if the stream fails
     */
    public ImageIcon getDefaultImage() throws IOException {
        return ImageIcon.createImage("res/default.png");
    }
    
}

public class ResourceService_2Test {
    public static void main(String args[]) {
        System.runLater(() -> {
            new ResourceService__InvalidImage().test1();
            new ResourceService__InvalidImage2().test1();
            new ResourceService__InvalidImage().test1();
            new ResourceService__InvalidImage2().test1();
        });
    }
}