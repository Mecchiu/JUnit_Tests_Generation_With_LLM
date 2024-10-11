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
     * This method creates a new {@link ResourceService} instance.
     */
     @Test
     void test1GetImageIcon() {
            System.out.println("ResourceService_1Test.test1GetImageIcon");
            ResourceService rspserv = new ResourceService();
            String path1 = "E:\\Data\\TestResources2\\TEST_FILE\\0101001_file.txt";
            System.out.println(rspserv.getImageIcon(path1));
            assertThat(rspserv.getResource(path1), is(instanceOf(ImageIcon.class)));
         }
}