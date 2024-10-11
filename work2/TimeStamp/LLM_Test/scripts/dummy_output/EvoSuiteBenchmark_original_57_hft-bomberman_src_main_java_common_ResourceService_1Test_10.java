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
		
    @Test
	public void getImageIcon_0Test(){
	  
		try {
					ImageIcon iIcon = ResourceService.getImageIcon("classpath:D:/temp/testimage.png");
					assertNotNull(iIcon);
	    		assertEquals("classpath:D:/temp/testimage.png",iIcon.getPath());
	    	} catch (IOException e) {
	    		assertTrue(false);
	    	}
    }
}