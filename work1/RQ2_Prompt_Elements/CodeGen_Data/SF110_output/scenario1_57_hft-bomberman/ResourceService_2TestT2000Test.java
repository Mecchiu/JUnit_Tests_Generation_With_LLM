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

    @Test
    public void testGetInputStream() {
        //Test
        InputStream resourceAsStream = ResourceService.class.getResourceAsStream("META-INF/image1.png");
        //Assert
        assertNotNull(resourceAsStream);
        //Close resource as stream
        try {
            resourceAsStream.close();
            //Fail
            assertNull(resourceAsStream);
        } catch (IOException e) {
            ExceptionPrinter.printHistory(e, "...Test getInputStream()...");
            fail();
        }
    }

}

class ResourceService_3Test {
	
    @Test
    public void testGetInputStream() {
        //Test with no resources
        
    	//Fail
    	try {
    		ResourceService.getInputStream("META-INF/image2.png");
                   fail();
    	} catch (IOException e) {
    		ExceptionPrinter.printHistory(e, "Test getInputStream() without resources was skipped...");
    	}
    	
    /**
     * Failure, because the path is a classpath resource.
     */
    public static void test_getInputStream() {		
        //Tests
        
        try {
            //Failing
            //Fail
            InputStream resourceAsStream = ResourceService.getInputStream("META-INF/image2.png");
            fail();
        } catch (IOException e) {
            //Success
            //Successful
            InputStream resourceAsStream = ResourceService.getInputStream("META-INF/image2.gif");
            assertTrue(resourceAsStream.read() == -1);
            //Close resource as stream
            InputStream resourceAsStream2 = resourceAsStream.close();
            assertTrue(resourceAsStream.read() == -1);
            //Close stream
            resourceAsStream2.close();
            //Fail
            e.printStackTrace();
            fail();
        }
		
        
		
}

//ResourceService_4Test.java
