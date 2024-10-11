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
		final static String TEST_PATH = "../../../build-classes/resources/ResourceService.jar!/";
	    private final static String TEST_IMAGE_PATH = TEST_PATH + "ResourceService.jpg";
	    @ClassRule
	    public static final CommonCommonCommonTearDownClassCommonCommonClassClass common_tearDownClassCommon = new CommonCommonCommonTearDownClassCommonClass();
	    
	    @Test
	    public void testGetImageIcon() {
	    	
			String resultImage = ResourceService.getImageIcon(TEST_IMAGE_PATH).getImage().getWidth();
			assertEquals(150, resultImage.length());
	    	assertFalse("The image of the resource should not be null", resultImage.isEmpty());
	    }
	    
	    @Test
	    public void testGetImage() {
	    	
		    String resourcePath = ResourceService.TEST_PATH + "ResourceService.bin.";
		    StreamConnection connection = ResourceService.getConnection(TEST_PATH);
		    connection.start();
		    
		    BufferedImage resource = connection.getImage(resourcePath);
		    assertNotNull("The resource should not be null", resource);
		    
		    connection.end();
		    
		    assertEquals("The image of the resource should be loaded correctly.",150, resource.getWidth());
		    assertEquals("The image of the resource should be loaded correctly.",150, resource.getHeight());
	    	String resultImage = ResourceService.getImageIcon(resourcePath).getImage().getWidth();
		    assertEquals("The image of the resource should be loaded correctly.",150, resultImage.length());
	    	
	    }
	    
	    @Test
	    public void testGetInputStream() {
	    	
			InputStream resource = ResourceService.getInputStream(TEST_IMAGE_PATH);
			assertNotNull("The resource should not be null", resource);
	    	
	    	BufferedImage resource_image = ResourceService.getImageIcon(resource).getImage();
	    	assertNotNull(resource_image);
	    	
	    	int bufferSize = resource.available();
	    	byte[] byte_array = new byte[bufferSize];
	    	resource_image.getRGB(0, 0, bufferSize, resource_image.getHeight(), byte_array, 0, bufferSize);
	    	
	    	for(int i = 0; i < byte_array.length; i++){
	    		assertEquals(i<256, byte_array[i]);
	    	}
	    }
	}
	
// ResourceService_2Test.java
package common;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;


/**
 * This is an utility class that offers functionality to load the resources for the test class in the
 * common namespace. This is used to ensure that the classes in the common.java package do not define any 
 * resources in the common.pro.properties file.
 * The classes that have a resource defined in common.pro.properties have class definition, the values of which
 * are defined in the classes. It does not define any actual file for these resources.
 * Because of this, this class does not perform any validation.
 * @author andi
 */
public class ResourceService_2Test {
	
	/**
	 * Loads the {@link Image} from the specified resource at the specified index.
	 * If multiple resources exist at the specified index, the first one that matches is loaded.
	 * @param index The index of the resource that is supposed to be loaded
	 * @return The resource location as {@link URL}
	 */
	public static URL getImage(int index) {
		URL url = ResourceService_2Test.class.getClassLoader().getResource("resources/" + ResourceService_2Test.class.getPackage().getName().replace(".pro", "") + "/" + index);
		assertNotNull(url);
		return url;
	}
	
	/**
	 * Load the {@link ImageIcon} from the specified resource at the specified index.
	 * If multiple resources exist at the specified index, the first one that matches is loaded.
	 * @param index The index of the resource that is supposed to be loaded
	 * @return The resource location as {@link ImageIcon}
	 */
	public static ImageIcon getImageIcon(int index) {
		Image icon = Resources.getImage("resources/" + ResourceService_2Test.class.getPackage().getName().replace(".pro", "") + "/" + index);
		assertNotNull("The resource should not return a null image", icon);
		return new ImageIcon(icon.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
	}
	
	/**
	 * Creates a stream connection between the stream passed as argument and the input stream of the 
	 * class passed as argument.
	 * @param path The location of the resource
	 * @param streams The input stream
	 * @return The stream connection
	 */
	public static StreamConnection getConnection(String path, InputStream streams) {
		
		return new StreamConnection(new InStreamConnection(path, streams, "com.mycompany.client"));
	}
	
}