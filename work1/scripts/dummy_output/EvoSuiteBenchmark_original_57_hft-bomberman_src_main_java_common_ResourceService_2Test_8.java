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
		public ResourceService_2Test() {
	}
/*
 * Loads an image from the class path.
 */
@Test
public void loadImage() throws IOException {
        
        test("/resources/Image1_0.png");
    }
/*
 * Tests if the specified image is loaded as a resource from the current VM class
* path.
 */
@Test
void test(final String path) throws IOException {
        
		final InputStream is = ResourceService.getInputStream(path);
		if (is == null) {
			return;
		}
		final int code = ImageIO.read(is);
		assertEquals(500, code);
				
}

/*
 * Test if the specified {@link InputStream} is cached as a resource.
 */
@Test
public void testInputStreamCache(InputStream is) throws IOException {
		
		final InputStream isFromMock = test("/resources/InputStreamAndCacheable.png");
		assertNotNull("Expecting to cache the image resource", isFromMock);
		
		final InputStream isFromCacheFromVM = test("/resources/InputStreamAndFromRemote.png");
		assertNotNull("Expecting to cache the image resource", isFromCacheFromVM);
		
/*
 * Cache a value in cache.
 */
	final BufferedImage imgFromCacheFromVm = ImageIO.read(isFromCacheFromVM);
	assertNotNull("Failed to cache, image is not loaded from VM", imgFromCacheFromVm);
	final int code = ImageIO.read(isFromCacheFromVm);
	assertEquals(500, code);
	
	/*
	 * Test that cached image is cached.
	 */
	assertSame(imgFromCacheFromVm, ImageIO.read(is));
}

/**
 * Tests if the specified {@link InputStream} is cached in memory.
 */
@Test
public void testMemoryCache(InputStream is) throws IOException {
		
		final InputStream isFromMock = test("/resources/InputStreamAndFromRemote.png");
		assertNotNull("Expecting to cache the image resource", isFromMock);
		
		final InputStream isFromInMemory = test("/resources/InputStreamMemoryCache.png");
		assertNotNull("Expecting to cache the image resource", isFromInMemory);
		
/*
 * Test if the specified {@link InputStream} is local to the VM class path.
 */
}
}