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
		
	final String path = "/common/resources/image.jpg";
	final String resource = "ResName";  
	
	// Load the first image with the given name.
	// Note: this test does NOT attempt to load an image from the classpath since an ImageIO
	// library has yet been installed.
	// 
	Image getImg(String name) throws Throwable {
        return ResourceService_2Test.getImage(path);
	}
	
	// Load the first image with the given name using its default constructor.
	// Note: this test does NOT attempt to load an image from the classpath since an
	// ImageIO library has yet been installed.
	// 
	ImageIcon getImgIcon(String name) throws Throwable {
        return ResourceService_2Test.getImageIcon(path);
	}
	
	// Load the first image using its default constructor using an appropriate image name. 
	// Note: this test does NOT attempt to load an image from the classpath since an
	// ImageIO library has yet been installed.
	// 
	ImageIcon loadImgIcon(String fileName) throws Throwable {
        return loadImgIcon(path, fileName);
	}
	
	// Load the first image using its default constructor using an appropriate image name 
	// using the specified ImageIcon instance. 
	// Note: this test does NOT attempt to load an image from the classpath since an
	// ImageIO library has yet been installed.
	// 
	ImageIcon loadImgIcon(String fileName, ImageIcon icon) throws Throwable {
        Image image = ResourceService_2Test.getImage(path);
        return new ImageIcon(fileName, image);
	}
	
    @Test
	public void testGetInputStream() {
		
		InputStream inputStream = null;
		try {
		   InputStream resStream = ResourceService.getInputStream(path);
		   image = ImageIO.read(resStream);
		} catch (IOException e) {
			fail(e.getMessage());
		}
		assertEquals(getImg(resource).getWidth(), image.getWidth(), "width");
		assertEquals(getImg(resource).getHeight(), image.getHeight(), "height");	
    }
    
		
	@Test
	public void testGetInputStreamWithInputStream() throws IOException {
		
		InputStream resStream =  ResourceService_2Test.getInputStream(path);
		image = ImageIO.read(resStream);
		
		assertEquals(getImg(resource).getWidth(), image.getWidth(), "width");
		assertEquals(getImg(resource).getHeight(), image.getHeight(), "height");	
	}
	
	@Test
	public void testGetInputStreamWithBinaryResource() throws IOException {
		
		InputStream resStream = ResourceService_2Test.getInputStream(image.getAbsolutePath());
		image = ImageIO.read(resStream);
		
		assertEquals(getImgIcon(ResourceName_2Test.resource).getIconWidth(), image.getWidth(), "width");
		assertEquals(getImgIcon(ResourceName_2Test.resource).getIconHeight(), image.getHeight(), "height");	
	}
	
	/**
	 * Returns the image resource from the classpath.
	 * 
	 * @return The image resource as a {@link BufferedImage}
	 */
	public static BufferedImage getImage() {
		InputStream is = ResourceService.getInputStream(path);
		try {
			image = ImageIO.read(is);	
		} catch (IOException e) {
			fail(e.getMessage());
		}
		return image;
	}
	
	/**
	 * Returns the path of the icon containing the specified resource.
	 * 
	 * @param name The resource name to get the path for
	 * @return The path of the icon containing the resource with the given name
	 */
	public static String getIconURL(String name) {
		InputStream is = ResourceService.getInputStream(path + "-" + name);
    	try {
			BufferedImage image = ImageIO.read(is);	
    		return ImageIO.read(is).getScaledInstance(30, 30, javax.imageio.Image.SCALE_SMOOTH).getURL().toString();
    	} catch (IOException e) {
    		throw new IllegalArgumentException(e);
    	}
	}

    /**
	 * Returns the image icon {@link ImageIcon} to be used in the specified resource.
	 * 
	 * @param name The resource name to get the icon for
	 * @return The {@link ImageIcon} instance for the requested resource
	 */
	public static ImageIcon getIconIcon(String name) {
	    InputStream is = ResourceService.getInputStream(path + "-" + name);
    	try {
			BufferedImage image = ImageIO.read(is);	
    		return new ImageIcon(image);
    	} catch (IOException e) {
    		throw new IllegalArgumentException(e);
    	}
	}
	
	private static final String PATH = "common/resources/image.jpg";
}