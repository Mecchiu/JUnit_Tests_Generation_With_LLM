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
		/**
     * Test case for {@link ResourceService#getInputStream(String)}.
     **/
    @Test
    public void getInputStreamWithFileNameConstructor() throws IOException {
        JARReader writer = new JARReader();
        InputStream is = writer.getInputStream("resource.jar");

        assertNotNull(is);
		// System.out.println( is );
    }
    
	/**
	 * This method will test if the JAR resource exists using the classpath as the resource manager.
	 **/
	@Test
	public void testJarCreation() throws IOException {
		JARReader jr = new JARReader();
		InputStream is = jr.getInputStream("src/test/unit/resources/resource.jar");
		
		// System.out.println( jr.getClassLoader() );
       assertNotNull( is ); 
		JarsManager jars = new JarsManager();
		
		assertTrue( jars.getJarFile( "src/test/unit/resources/resource.jar" )!= null );
	}
	
	
	/**
	 * This method will test if a JAR cannot be read with the getInputStream() method.
	 **/
	@Test
	public void testFileNotFound() throws IOException {
		JARReader jr = new JARReader();
		// InputStream is = jr.getInputStream("src/test/unit/resources/resource.jar");
		InputStream is = jr.getInputStream("notfound");
		
		// System.out.println( is );
		assertNull( is );	
	}
}