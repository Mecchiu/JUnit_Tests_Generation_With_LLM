// OperatingSystem_0Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains one unit test case for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_0Test {
		
	/**
   * Test case for {@link OperatingSystem#isLinux()}.
   */
	@Test
	void testIsLinux() {
    //System.setProperty("user.dir", System.getProperty("user.dir") + "/..");

		try {
	        assertFalse(OperatingSystem.isLinux());
	    } catch (IOException ex) {
	    	assertTrue(false);
	    }
	}
	 
  // Test case for a file
		@Test
	 void testCreateTemporaryFile() throws IOException, MissingResourceException {
	 	// Create a temporary folder
		File dir = OperatingSystem_0Test.createTemporaryFolder(false);
		// Create a temporary file in this folder
		File file = OperatingSystem.createTemporaryFile("test", "test");
		// Delete all the temporary files
		deleteTemporaryFiles();
  
  // Find out if the created file have exist in application support folder (-32763)
		assertTrue(file.isFile());
  
  // Delete temporary file
  	file.delete();
  } 
  @Test
  void testCreateTemporaryFileLeafFolder() throws IOException, MissingResourceException {
	 	// Create a temporary folder
		File dir = OperatingSystem_0Test.createTemporaryFolder(false);
		// Create a temporary folder (root: 0x61737570
	        File tmp = OperatingSystem.createTemporaryFile(String.valueOf(UUID.randomUUID()), "0_0_0_0_" + String.valueOf(UUID.randomUUID()));
	        
	 	assertTrue(tmp.isFile());
	 	
  // Find out if the created file have exist in application support folder (-32763)
		assertTrue(tmp.isDirectory());
	 
  // Delete temporary folder	(root: 0x61737570 			
  	tmp.delete();
  } 
	/**
	 * Tests for {@link OperatingSystem#createTemporaryFile(String, String) createTemporaryFile}.
	 * @throws IOException if a File cannot be written to
	 * @throws AccessControlException
	 */
	@Test
	void testCreateTemporaryFile() throws IOException, AccessControlException {
		// Create a temporary file
		File file = OperatingSystem.createTemporaryFile("default", "file");
		// Delete all the temporary files
		deleteTemporaryFiles();

		// Check if temporary file has become writable
		assertTrue(file.exists());
		assertTrue(file.canWrite());
 	}
 	/**
 	 * Tests for {@link OperatingSystem#createTemporaryFile(String, String) createTemporaryFile}.
 	 * @throws IOException
 	 * @throws AccessControlException
 	 */
	@Test
 	void testCreateTemporaryFile() throws IOException, AccessControlException {
		// Create a temporary file
		File file = OperatingSystem.createTemporaryFile("default", "file");
		// Delete all the temporary files
		deleteTemporaryFiles();

		// Check if temporary file has become writable
		assertTrue(file.exists());
		assertTrue(file.canWrite());
 	}
 	
   // Test for null argument
   @Test
    public void testCreateTemporaryFileWithNullString() {
        try {
            OperatingSystem.createTemporaryFile("", null);
            fail("OperatingSystem.createTemporaryFile() must throw IllegalArgumentException when the File cannot be written.");
        } catch (NullPointerException e) {}
    }
    
}