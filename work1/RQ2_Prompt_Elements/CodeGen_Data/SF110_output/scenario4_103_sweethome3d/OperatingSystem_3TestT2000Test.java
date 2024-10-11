// OperatingSystem_3Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {

    @Test
    public void macosxLeopard() throws IOException, MissingResourceException, AccessControlException {

		// Create temporary folder for temporal file
		File folder = new File(OperatingSystem_3Test.getDefaultTemporaryFolder(false));
        assertTrue(folder.mkdir());
        assertTrue(folder.isDirectory());

        // Create sub-folder with temporary file
        File subsubFolder = new File(""+System.currentTimeMillis());
        assertTrue(subsubFolder.mkdir());
        assertTrue(subsubFolder.isDirectory());

		// Create a temporary sub-directory and a temporary file in it
        File subdirRoot = new File("/"+subsubFolder.getName());
        File tempFile = createTemporaryFile(subdirRoot.getAbsolutePath(), ".tmp");
        assertTrue(tempFile.isFile());

		// Test if the temporal file is in the directory
		assertTrue(subsubFolder.contains(tempFile.toString()));
	}
	
    @Test
    public void macosxSuperior() throws IOException, MissingResourceException, AccessControlException {

		// Create temporary folder for temporal file
		File folder = new File(OperatingSystem_3Test.getDefaultTemporaryFolder(true));
        assertTrue(folder.mkdir());
        assertTrue(folder.isDirectory());

        // Create sub-folder with temporary file
        File subsubFolder = new File(""+System.currentTimeMillis());
        assertTrue(subsubFolder.mkdir());
        assertTrue(subsubFolder.isDirectory());

		// Create a temporary sub-directory and a temporary file in it
        File subdirRoot = new File("/"+subsubFolder.getName());
        File tempFile = createTemporaryFile(subdirRoot.getAbsolutePath(), ".tmp");
        assertTrue(tempFile.isFile());

		// Test if the temporal file is in the sub-directory
		assertTrue(subsubFolder.contains(tempFile.toString()));
	}
	
	/**
	 * Test if file is created correctly in the file manager, 
	 * according to the OS.exe file manager
	 */
	@Test
    public void exesystemFileManager() throws IOException {
    	// Use a temporary file manager to avoid deadlock
        FileManager manager = new MacOSXFileManager();
        String path = getDefaultTemporaryFolder(true).getAbsolutePath();

        // Create file
        File tempFile = createTemporaryFile("default", ".txt");
		assertTrue( tempFile.exists());
        assertTrue( manager.getFile(tempFile.toString()) == tempFile);
 

		// Update timestamp and delete file
        tempFile.delete();
        assertFalse("File should be deleted", manager.getFile(tempFile.toString()) == null);
    }

    @Test
    public void testWindowsExe() throws IOException, MissingResourceException, AccessControlException {
        // Create temporary folder for temporal file
        File folder = new File(OperatingSystem_3Test.getDefaultTemporaryFolder(false));
        assertTrue(folder.mkdir());
        assertTrue(folder.isDirectory());

        // Update timestamp and delete file
        File tempFile = createTemporaryFile("default", ".old");
        assertTrue( tempFile.exists() );
        tempFile.delete();
        assertFalse("File should be deleted", tempFile.exists() );
    }

    @Test
    public void testInvalidTimeFormat() throws IOException, MissingResourceException, AccessControlException {

        // Update timestamp and delete file
        File tempFile = createTemporaryFile("default", ".notanexicalstring");
        assertTrue( tempFile.exists() );
        tempFile.delete();
        assertFalse("File should be deleted", tempFile.exists() );
    }
}
