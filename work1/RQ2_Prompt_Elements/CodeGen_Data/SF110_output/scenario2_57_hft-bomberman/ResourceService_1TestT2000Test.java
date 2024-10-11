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
	* Test method for {@link ResourceService#getImageIcon(String)}
	* with null as the resource.
	*/
    @Test
    public final void testGetIconForNullResource() {
        
        ImageIcon imageIcon = new ResourceService().getIcon("not the real resource");
        Image expectedImage = getImage("/not/the/real/resource");

			assertNotNull(imageIcon);
			assertNotNull(expectedImage);
			
			assertTrue(imageIcon.getImage() instanceof BufferedImage);
				
      assertTrue(getImageIcon("") instanceof ImageIcon);
				
			
    }
}

// ResourceService_2Test.java
package common;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

/**
* Test class of {@link ResourceService}.
* It contains one unit test case for the {@link ResourceService#getImageIcon(String)} method.
*/
public class ResourceService_2Test {
	
	/**
	* Test method for {@link ResourceService#getImageIcon(String)} with a null as the resource.
	*/
	@Test
	public final void testGetIconForNullResourceNoImage() throws IOException {
			
		byte[] bytes = new byte[200];
		InputStream stream = new ByteArrayInputStream(bytes);
		try {
			Image icon = ResourceService.getImageIcon(stream);
			
			assertNotNull(icon);
			
			
		}
		finally {
			try {
				stream.close();
			}
			finally {
				stream = null;
			}
		}
	}
	
	/**
	* Test method for {@link ResourceService#getImageIcon(String)} with 0 as the length of the resource.
	*/
	@Test
    public final void testNoResources() throws IOException {
    	
         InputStream stream = new ByteArrayInputStream(new byte[0]);
         Image img = null;
         
         try {
             img = ResourceService.getImageIcon(stream);
         }
         finally {
             stream.close();
         }
    }
	/**
	* Test method for loading a {@link BufferedImage} from an {@link InputStream}.
	* Loads it from the {@link InputStream} and stores it internally.
	*
	* @throws IOException If an I/O error occurs.
	* @throws InterruptedException If the test is interrupted.
	*
	*/
	@Test
	public final void testLoadImageNoSource()throws IOException, InterruptedException, ClassNotFoundException {
		
		ImageIcon temp = null;
		
			image.loadIcon(null);
			
		BufferedImage bufferedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
		
		
		temp = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		
		InputStream stream3 = new BufferedInputStream(new ByteArrayInputStream(temp.getPixels()));

		Image loadedImage = ImageIO.read(stream3);

		assertNotNull(loadedImage);
		
		
		bufferedImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		InputStream stream2 = new BufferedInputStream(new ByteArrayInputStream(temp.getPixels()));
		temp = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		InputStream stream1 = new BufferedInputStream(stream2);
		loadedImage = ImageIO.read(stream1);
		bufferedImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		InputStream stream = new ByteArrayInputStream(temp.getPixels());
		temp = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		temp = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		image.getImage().getRGB(0,0, bufferedImage.getWidth(), bufferedImage.getHeight(), temp.getRGB(0,0), 0, bufferedImage.getWidth());
		InputStream stream01 = new ByteArrayInputStream(temp.getPixels());
		this.loadedImage = ImageIO.read(stream01);
		
				assertNotNull(loadedImage);
				assertNotNull(
				image.getImage());
				assertNotNull(ImageIO.read(image.getImage().getClass().getResourceAsStream("/" + "Images/" + this.image.getType() + ".png")));
			
	}
	
	
}
