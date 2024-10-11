// OperatingSystem_1Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {

	/**
	 * Checks if current operating is Windows and throws
	 * {@link IllegalAccessException} on error.
	 */
	@Test
	public void isWindows() {
		
		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("com.apple.eio.FileManager");

		// Check if current operating is Windows
		assertTrue("Operating system isWindows() should return true",
					 OperatingSystem.isWindows());
				
		// Check if exception will be thrown
		try {
			// Run the test case
			OperatingSystem.isWindows();
			
		} catch (IllegalAccessException e) {
			// Exception will be thrown
			throw new AssertionError("Error exception thrown on check");
		}
		
	}
	
	/**
	 * Checks if current operating is OSX and throws
	 * {@link IllegalAccessException} on error.
	 */
	@Test
	public void isOSX() {
		
		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("com.example.osx.osx.Android.native");

		// Check if current operating is OSX
		assertTrue("Operating system isOSX() should return true",
					 OperatingSystem.isOSX());

		// Check if exception will be thrown
		try {
			// Run the test case
			OperatingSystem.isOSX();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// Exception will be thrown
			throw new AssertionError("Error exception thrown on check");
		}	
	}
	
	/**
	 * Returns <code>true</code> if current operating is MacOS, <code>false</code>
	 * if it's unknown.
	 */
	@Test
	public void isMac() {
		
		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("com.example.osx.osx.Mac.native");

		// Check if current operating is mac
		assertTrue("Operating system isOSX() should return true",
					 OperatingSystem.isMac());

	}
	
	
	/**
	 * Returns <code>true</code> if current operating is Linux,
	 * <code>false</code> if it's unknown.
	 */
	@Test
	public void isLinux() {
		
		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("com.example.osx.osx.Linux");

		// Check if current operating is linux
		assertTrue("Operating system isOSX() should return true",
				 OperatingSystem.isLinux());

	}
	
	/**
	 * Returns <code>true</code> if current operating is Linux,
	 * <code>false</code> if it's unknown.
	 */
	@Test
	public void isUnixRootFS() {
		
		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("/");
		
		// Run the test case
		assertTrue("Operating system isUnixRootFS() should return true",
					 OperatingSystem.isUnixRootFS());
			
	}
	
	/**
	 * Returns <code>true</code> if current operating is MacOS,
	 * <code>false</code> if it's unknown.
	 */
	private boolean isMac() {
		return OperatingSystem.isMac() || OperatingSystem.isMacRootFS();
	}
	
	/**
	 * Returns <code>true</code> if current operating is Linux,
	 * <code>false</code> if it's unknown.
	 */
	private boolean isLinux() {
		return OperatingSystem.isLinux();
	}
	
	/**
	 * Returns <code>true</code> if current operating is linux,
	 * <code>false</code> if it's unknown.
	 */
	private boolean isUnixRootFS() {
		return OperatingSystem.isUnixRootFS();
	}
		
    /**
     * Run the test case with given filenames.
     * Run method is run on the default home directory.
     * Method is executed for each test case.
     * 
     * @return <code>true</code> if test passed, <code>false</code>
     * on error.
     *  */
	@Test
	public void runOsTest() {
		
		// Define directory containing the test case dir
		File testHomeAbsolute = FileManager.getFileSystemRoot().getFile("/");

		// Create the test case directory
		File testHomeDir = new File(testHomeAbsolute, "Home");
		if (!testHomeDir.getParentFile().exists()) {
			testHomeDir.mkdir();
		}

		// Define filter on the class name
		FileFilter filter = fil -> fil.getName().equals("/");
		
		// For every directory in the test case directory
		for(File filterItr = testHomeDir.listFiles(filter);
				filterItr.length()!= 0; 
				filterItr.delete(),
				fileItr = testHomeDir.listFiles(filter)) {
			
			// Run method
			File testDir = fileItr;
			File testFile1 = new File(testDir, "File1");
			File testFile2 = new File(testDir, "File2");
			File testFile3 = new File(testDir, "File3");

			// Check if exception on case is thrown
			try {
				// Set file content in test case directory
				FileManager.setFileContent(testFile1.getCanonicalPath());
				assertEquals("Incorrect content on test case file",
							 FileManager.getFileContent(), "File1 contents");
			} catch (IOException e) {
				assertThrown(e,
				 "Failed to set content on test case file");
			}

			// Check if exception on case is thrown
			try {
				// Set file content in test case directory
				FileManager.setFileContent(testFile2.getCanonicalPath());
				assertEquals("Incorrect content on test case file",
							 FileManager.getFileContent(), "File2 contents");
			} catch (IOException e) {
				assertThrown(e,
				 "Failed to set content on test case file");
			}

			// Check if exception on case is thrown
			try {
				// Set file content in test case directory
				FileManager.setFileContent(testFile3.getCanonicalPath());
				assertEquals("Incorrect content on test case file",
							 FileManager.getFileContent(), "File3 contents");
			} catch (IOException e) {
				assertThrown(e,
			"Failed to set content on test case file");
			}
			
			// Run run method