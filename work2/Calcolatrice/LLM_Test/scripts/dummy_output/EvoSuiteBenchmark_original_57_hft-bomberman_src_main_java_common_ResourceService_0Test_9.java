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
		/**
		* Test method for
		* {@link ResourceService#getImage(String)}
		* where path is a string of the form classpath:resource.
		* @throws IOException
		*/
    @Test
	public void test_getImage_String() throws IOException {
		Image icon = ResourceService.getImage("/org/palladiowebshaker/resource/icon/image/image.png"); // /org/palladiowebshaker/resource
		ImageIcon iconRes = ResourceService.getImageIcon("/org/palladiowebshaker/resource/icon/image/icon.png"); // /org/palladiowebshaker/resource
		assertNotNull(icon);
		assertEquals("/org/palladiowebshaker/resource/img/icon/image.png", icon.getImagePath());
		assertNotNull(iconRes);
		assertEquals("/org/palladiowebshaker/resource/img/icon/icon.png", iconRes.getImagePath());
		
	}
	
	/**
	 * Unit test for {@link ResourceUtils#getIcon(String, int, int)}
	 */
	@Test
    public void test_getIcon_StringIInt_1_NoRes() throws IOException {
		int imgType = 0;
		assertNotNull(ResourceUtils.getIcon(
		ImageUtils.IMG_RESOURCE_FILE_PATH, imgType, imgType
		));
		assertEquals(ImageUtils.IMG_RESOURCE_GRAPHICS_RESOURCE_PATH,
			ResourceUtils.getIcon(
		ImageUtils.GRAPHICS_IMG_RESOURCE_FILE_PATH, imgType, imgType
		));
		
	}
	/**
	 * Unit test for {@link ResourceUtils#getIcon(String, int, int)}
	 */
    @Test
	public void test_getIcon_StringIInt_2_ImagePath() throws IOException {
		int imgType = 0;
		assertNotNull(ResourceUtils.getIcon(
		ImageUtils.IMG_RESOURCE_FILE_PATH, imgType, imgType
		));
		assertEquals(ImageUtils.IMG_RESOURCE_GRAPHICS_RESOURCE_PATH,
			ResourceUtils.getIcon(
		ImageUtils.GRAPHICS_IMG_RESOURCE_FILE_PATH, imgType, imgType
		));
	}
	
}