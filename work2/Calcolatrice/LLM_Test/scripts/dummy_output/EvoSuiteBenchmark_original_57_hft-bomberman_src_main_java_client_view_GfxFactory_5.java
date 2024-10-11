// GfxFactoryTest.java
package client.view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;
import common.ResourceService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GfxFactory}.
* It contains one unit test case for the {@link GfxFactory#getPowerUpImage(String)} method.
*/
class GfxFactoryTest {
		/**
		* Test cases.
		*/
	@Test
	public void getPowerUpImageTest() {
		// Initialize log4j logger.
		Logger.getLogger("");
		Logger.getLogger("");
		Logger.getLogger(this.getClass().getName());

		Logger log = Logger.getLogger("");

		log.debug("test");
				// Initialize wallImageCache.
		Logger.getLogger(GfxFactory.class.getName().toString()).debug("creating "+GfxFactory.class.getName().toString() + "");
		Logger.getLogger(GfxFactoryTest.class.getName().toString()).debug("creating wallImageCache");
		wallImageCache = new HashMap<Integer, Image>();
		//Logger.getLogger(GfxFactory.class.getName().toString()).debug("creating tileImageCache");

		File f = new File("");
		Image img = null;

		// log.debug("testFile="+testFile);
		try {
			log.debug("testFile="+f.getCanonicalPath());
			img = loadImage(f.getCanonicalPath());
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

		assertNotNull(img);
		assertEquals(f.getPath(),img.getSource());

		Integer x = new Integer(0);
		Integer y = new Integer(0);
		Integer z1 = new Integer(GfxFactory.O);
		Integer z2 = new Integer(14);	
}
}