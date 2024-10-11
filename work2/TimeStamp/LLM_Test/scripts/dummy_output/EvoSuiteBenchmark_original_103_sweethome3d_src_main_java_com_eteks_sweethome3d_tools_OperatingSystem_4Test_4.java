// OperatingSystem_4Test.java
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
* It contains one unit test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {
		
	@Test
	void getDefaultApplicationFolder_ReturnsTheAppropriateAppFolderWhenOsWindows();
	
	@Test
	void getDefaultApplicationFolder_ReturnsTheAppropriateAppFolderWhenOsMacOSX();
	
	@Test
	void getDefaultApplicationFolder_ReturnsTheAppropriateAppFolderWhenOsMacOSXLeopardOrSuperior();
		
}

/**
* This test class specifies the {@link OperatingSystem} static fields by which all the tests for the
* class are considered within this test case. 
* Note that this test class is tested in the same test cases
* as test OperatingSystem_4Test, to compare the behavior between Java 1.7 and Java 1.6 version.
*/
interface OperatingSystem_4Test{
		
	File getDefaultApplicationFolder();
	
	File getDefaultApplicationFolderMacOSX() throws Exception;
	
	File getDefaultApplicationFolderWindows() throws Exception;
	
	File getDefaultApplicationFolderWindowsLeopard() throws Exception;

        FileManager getFileManagerByFileManagerClass(File fileManagerClass, boolean isWindows);

	File getDefaultTemporaryFile(String prefix, String suffix);
	
    File getDefaultTemporaryFolder() throws IOException;
	
	File createTemporaryFile(String prefix, String suffix) throws IOException;
	
	File createTemporaryFolder(String prefix, String suffix) throws IOException;
	
	/*
	 * (non-Javadoc)
	 * @see com.eteks.sweethome3d.model.Home#check()
	 */
	boolean check(Home home, File root);

	/*
	 * (non-Javadoc)
	 * @see com.eteks.sweethome3d..model.Home#getHome()
	 */
	Home getHome();


	/*
	 * (non-Javadoc)
	 * @see com.eteks.sweethome3d.model.Home#getApplicationSupportFolder()
	 */
	String getApplicationSupportFolder();
	
	// (non-Javadoc)
	// FileManager.Checker.FileManagerClass checkClass(FileManager.Checker.FileManagerClass fileManagerClass);
	FileManager.FileManagerClass getFileManagerClass(FileManager.FileManagerClass fileManagerClass);

	FileManager.FileManagerClass getFileManagerClassMacOSX(FileManager.FileManagerClass fileManagerClass);

	FileManager.Checker.FileManagerClass checkClass(FileManager.Checker.FileManagerClass fileManagerClass);

	File getDefaultTemporaryFolderLeopard();

	/**
	 * Creates a temporary folder
	 * @throws IOException 
	*/
	File createTemporaryFolderLeopard() throws IOException; 
	
	/**
	 * Starts timer and returns {@link TimerTask} instance to wait for process termination.
	 * @throws Exception 
	 */
	TimerTask startTimerTaskLeopard() throws Exception;

	/**
	 * Creates a temporary folder
	 * @throws IOException 
	*/
	File createTemporaryFolder() throws IOException; 
	
}