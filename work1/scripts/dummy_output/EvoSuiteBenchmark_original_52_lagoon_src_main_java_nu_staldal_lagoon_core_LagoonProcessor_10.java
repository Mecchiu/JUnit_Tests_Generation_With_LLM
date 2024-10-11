// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		/**
		 * Test constructor.
		 */
    private final LagoonProcessor processor = new LagoonProcessor();
		/**
		 * Test static initializer.
		 */
    private static ClassLoader classLoader = LagoonProcessorTest.class.getClassLoader();
    
    /**
     * Test static constructor.
     * Only tests the constructor with the value {@link #classLoader}
     */
	@Test
    public void test_Ctor() {
        assertNotNull("classLoader should be of {@link ClassLoader#getClassLoader()}",
            classLoader);
        assertEquals("classLoader should be of type {@link ClassLoader}",
            classLoader.getClass().getClassLoader(),
                        Thread.currentThread().getContextClassLoader());
        
        File dir = new File(System.getProperty("USER.DIR"));
        File srcDir = new File(dir, "dummyDirSource");
        srcDir.mkdirs();
        File targetDir = new File(dir, "dummyDirTarget.xml");
        assertTrue("targetDir should exist", targetDir.exists());

    }

	/**
	 * Test methods for building and fetching a website.
	 */
    @Test
    public void test_build() throws Exception {
            
        File f = new File(System.getProperty("USER.DIR"),"dummyDirSource");
        FileOutputStream fos = null;
        try {

            fos = new FileOutputStream(f);
            FileUtils.write(f, "dummy");
            fos.close();
        } catch (Exception e) {

            fail("FileException (" + e.getMessage() + ")");
        }
        System.out.println("File (f) " + f);
        
        try {
           build(true);
           fail("No exception expected.");
        } catch (IOException ioe) {
           fail("Should not get exception.");
        }
		assertTrue("fetch(f) is not working", processor.fetch(f));
		assertTrue("download(f) is not working", processor.download(f));
        
        
        String targetUrl = targetDir.getCanonicalPath();
        //System.out.println("Url is " + targetUrl);
        
        try {
           f = new File(System.getProperty("USER.DIR"),"dummyDirTarget.xml");
           FileUtils.write(f, "dummyXML");
           System.out.println("Fetched from XML");
           f = new File(System.getProperty("USER.DIR"),"dummyDirSource");
           FileUtils.write(f, "dummy");
           System.out.println("Fetched from directory");
           f = new File("target");
           FileUtils.write(f, "dummy");
           System.out.println("Fetched folder");
        } catch (Exception ex) {

            fail("Failed with exception " + Utils.printException(ex));
           
        }
			   

        // Check if the fetch worked
        String resultUrl = processor.download(f);

        /*
        // Check if the fetch worked
        String resultUrl2 = processor.fetch(f);
		*/

        assertEquals("fodderUrl is equal", targetUrl,  resultUrl);

    }


        
    
}