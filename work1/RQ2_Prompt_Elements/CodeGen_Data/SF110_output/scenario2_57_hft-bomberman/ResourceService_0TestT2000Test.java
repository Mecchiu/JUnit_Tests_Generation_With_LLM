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
     * Creates a new instance of {@link ResourceService_0Test}.
     */
    @Test
    public void test_Constructor(){
        //No Instance Creation
        assertNotNull(new ResourceService_0Test());
    }
    
    /**
     * Creates a new instance of {@link ResourceService_0Test} that is a proxy
     * against a real instance of the {@link ResourceService}.
     */
    @Test
    public void test_ConstructorProxy(){
        //Create Proxy Instance
        final ResourceService resourceService = new ResourceService_0Test();

        //Test - No Exception Occurred
        resourceService.getImage("/file_resource.png");
    }
    
    /**
	 * Test of getImage method, of class {@link ResourceService}.
	 */
    @Test
    public void test_GetImage(){
		final ResourceService instance = new ResourceService_0Test();

        //Test - No Exception Occurred and Return the Image
        assertEquals(instance.getImage("/file_resource.png"),null);
    }
    
    //////////////////
    //InputStream
	
	/**
	 * Test of the getInputStream method, of class {@link ResourceService}.
	 */
    @Test
    public void test_getInputStream(){
		final ResourceService instance = new ResourceService_0Test();
		
        //Test- No Exception Occurred
        InputStream in = resourceService.getInputStream("/file_resource.png");
		assertNotNull(in);
		// No assertion done here, as only instance of inputstream can be tested.
	}
	
    //Get InputStream Tests
    //////////////////
    
    /**
     * Test of exists method of {@link ResourceService}.
     */
    @Test
    public void test_exists(){
        //Create Object
        File file = new File("/resources/file.jpg");
        //Set File Exists
        assertTrue(resourceService.exists(file));
        //Set File Exists false
        assertFalse(resourceService.exists(null));
    }
    
    /**
     * Test of createInputStream method of {@link ResourceService}.
     */
    @Test
    public void test_createInputStream(){
        //No Exception
        InputStream in = resourceService.createInputStream("/file_resource.png");
        assertNotNull(in);
    }
    
    /**
	* Test of createInputStream method, of class {@link ResourceService}.
	*/
    @Test
    public void test_createInputStreamProxy(){
		final ResourceService resourceService = new ResourceService_0Test();

        //Test - No Exception Occurred

        InputStream in = resourceService.createInputStream("/file_resource.png");
        assertNotNull(in);
        //No Exception Occurred
    }
    
    /**
     * Test of exists method of {@link ResourceServiceProxy}.
	 */
    @Test
    public void test_exists_Proxy(){
        //No Exception
        assertFalse(resourceServiceProxy.exists("/file_resource.png"));
    }
    
    /**
     * Test of createOutputStream method of {@link ResourceServiceProxy}.
	 */
    @Test
    public void test_createOutputStream(){
        //No Exception
        assertTrue(resourceServiceProxy.createOutputStream("/file_resource.png")!=null);
    }
    
    /**
     * Test of createOutputStream method, of class {@link ResourceServiceProxy}.
	 */
    @Test
    public void test_createOutputStreamProxy(){
		ResourceService resourceServiceProxy = new ResourceService_0TestProxy();

        //Test - No Exception Occurred

        System.out.println("File created in FileOutputStream - "+resourceServiceProxy.createOutputStream("/file_resource.png"));
    }