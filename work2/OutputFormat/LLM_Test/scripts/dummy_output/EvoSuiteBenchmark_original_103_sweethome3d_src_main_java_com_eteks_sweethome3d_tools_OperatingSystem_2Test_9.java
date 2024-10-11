// OperatingSystem_2Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_2Test {
		
    // Utility class:  to avoid unneccessary instantiations
	private OperatingSystem() {		
    }

    // Utility class:  to avoid unneccessary instantiations
	private static class MacOSXFileManagerFactory
    {
        public static FileManager createFileManager(String name, String resourceName) 
                throws MissingResourceException, ClassNotFoundException, 
                AccessControlException, IOException {
            return FileManager.createFileManager((short) -123456, name, (short) 99, resourceName);
        }
    }

	/**
	 * Returns <code>true</code> if operating system is Mac OS X
	 */
	public static boolean isMacOSX() {
	    String osName = System.getProperty("os.name");
	    return osName.startsWith("Mac OS X");
	}
	
	/**
	 * Returns <code>true</code> if operating system is Windows
	 */
	public static boolean isWindows() {
	    String osName = System.getProperty("os.name");
	    return osName.startsWith("Windows")&&osName.endsWith("NT");
	}
	
	/**
	 * Returns <code>true</code> if operating system is a Linux system
	 */
	public static boolean isLinux() {	
        String osName = System.getProperty("os.name");
        return osName.startsWith("Linux");
    }

    /**
     * Returns <code>true</code> if operating system is a Mac OS X (10.5 or superior).
     */
    public static boolean isMacOSXLeopardOrSuperior(boolean createTemp)
    {
        return isMacOSX()||isMacOSXLeopardOrSuperior() || isMicrosoftExplorerExplorerExplorer() || isMicrosoftRhapsodyExplorerExplorer() || isIBMExplorerExplorer()||isMicrosoftExplorerExplorerExplorer();
    }

    /**
     * Provides information about the default file manager that will be used for temporary files created in program.
     */
    @Test
    public void tempFileManagerTest() throws IOException, MissingResourceException,
    AccessControlException, IOException {
		
		// Check which file manager needs to be used
		FileManager manager = getFileManager();
		
		/* Create dummy folder structure for a temporary file */
		File tempFile = createTemporaryFile(null, "hello");
		tempFolder = createTemporaryFolder(false);

		/* Check if the default file manager for this user type can be found */
		String fileManagerName = manager.getFile(tempFile.getAbsolutePath());
		assertEquals("Dummy file manager cannot be found", manager.getFileManager().getFileManagerName(), fileManagerName);
		
		/* Check if default file manager needs to be created */
		FileManager fakeManager = getFileManager();
		assertEquals("Default file manager cannot be created", fakeManager.getFileManagerName(), manager.getFileManager().getFileManagerName());
		assertTrue("Default temporary files can't be created", tempFile.exists());

		/* Check if default file manager can be deleted */
		deleteFileManager(tempFile);
		assertFalse("Default temporary files can't be deleted", tempFile.exists());
		
		// System.exit() must be called after all the tests to ensure the file manager can be deleted
		System.exit();
    }

    /**
     * This method allows overriding of the default file manager for user type.
     */
    private static void deleteFileManager(File... file) {
        if(file.length == 0) {
            FileManager.deleteFileManager();
        }
        else {
            FileManager.deleteFileManager(file[0].getAbsolutePath());
        }
    }
		
	/**
	 * Returns <code>true</code> if this file manager is available if it needs to used (Windows systems only)
	 */
	private boolean getFileManager() {
		return!isMacOSX() &&
			!isMacOSX() &&
			!isWindows();
	}
	
	/**
	 * Returns <code>true</code> if it looks for default temporary files.
	 * This method uses the getFileManager() method as it returns an FileManager that can be used to use
	 * the default temporary files.
	 */
	private static boolean tempFolderExists(File tempFolder) {
		if (tempFolder == null) {
			tempFolder = FileManager.findFolder((short) -12345, 0x61737570);
		}
		return new File("/tmp/temp").exists();
	}
	
}