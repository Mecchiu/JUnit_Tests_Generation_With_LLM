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
		
	/**
	 * Checks that operating system is able to create directory with the supplied path.
	*/
	@Test
	public void testGetDefaultApplicationFolder() throws IOException {
		File workingDirectory = new File(System.getProperty("user.dir"));

		Home home = Home.getHome();
		home.setEnvironmentType(Home.TYPE_WINDOWS);
		home = home.addDeviceType(Home.TYPE_WINDOWS);

		// creating sub directory
		File tempHomeSubFolder = home.newDirectory(home.newFolder(home.getApplicationSubFolderName()));
		home.setApplicationSubFolderName(home.newFolder(home.getApplicationSubFolderName()));
		home.setApplicationSubFolder(home.newFile(home.newFolder(home.getApplicationSubFolderName() + "/") + home.getApplicationSubFolderName()));
		home.addApplicationSubDirectory(tempHomeSubFolder);

		// creating application folder
		File tempApplicationFolder = home.newFolder(home.getApplicationFolderName() + "/" + home.getApplicationSubFolderName());
		home.setApplicationFolderName(home.newFolder(home.getApplicationFolderName()));
		home.setApplicationFolder(home.newFile(home.newFolder(home.getApplicationFolderName() + "/") + home.getApplicationFolderName()));
		home.addApplicationFolder(tempApplicationFolder);

		//creates temp folders for testing
		home.getApplicationSubFolderName() + "/" + home.getApplicationSubFolderName();
		home.getApplicationFolderName() + "/" + home.getApplicationFolderName() + "/";
		home.getApplicationSubFolderName() + "/" + home.getApplicationSubFolderName();
		home.getApplicationFolderName() + "/" + home.getApplicationFolderName();

		if(!workingDirectory.exists()) {
			workingDirectory.mkdirs();
		}
		File tempHome = home.getDefaultHome();
		File tempApplicationFolder = home.getApplicationFolder();
		home.deleteHome();
		home.deleteFolder();
		home.deleteFolder();

		assertTrue("Could not create directory", workingDirectory.createNewFile());
		assertTrue("Create folder before creating application", workingDirectory.mkdirs() == 0);
		assertTrue("Application folder not created", tempApplicationFolder.exists() );
		assertTrue("Application folder should exists", tempApplicationFolder.isDirectory());
		assertEquals("Name of application folder does not match expected", home.getApplicationFolderName(),tempApplicationFolder.getName());
		assertTrue("Home folder not created", home.getHome() == null);
		assertTrue("Home folder doesn't exist", home.getHome() == null);

		File home_3_6 = home.getDefaultApplicationFolder();
		assertTrue("Application folder should exist", home_3_6!= null);
		assertTrue("Application folder does not exist",!home_3_6.exists());
		assertTrue("Delete home folder", home.deleteHome());
		home.shutdown();

		assertTrue("Could not create folder", home_3_6.mkdir());
		assertTrue("Home folder created", home_3_6.exists() == true);
		assertTrue("Home folder doesn't exist", home_3_6.isDirectory());
		home_3_6.delete();
		assertTrue("Home folder deleted", home_3_6.exists() == false);
	}


	//@Test
	  public void testGetDefaultApplicationFolder() throws IOException {
	        File workingDirectory = new File(System.getProperty("user.dir"));

	    Home home = Home.getHome();
	    home.setEnvironmentType(Home.TYPE_WINDOWS);
	    home = home.addDeviceType(Home.TYPE_WINDOWS);

	    // creating sub directory
	    File tempHomeSubFolder = home.newDirectory(home.newFolder(home.getApplicationSubFolderName()));
	    home.setApplicationSubFolderName(home.newFolder(home.getApplicationSubFolderName()));
	    home.setApplicationSubFolder(home.newFile(home.newFolder(home.getApplicationSubFolderName() + "/") + home.getApplicationSubFolderName()));
	    home.addApplicationSubDirectory(tempHomeSubFolder);

	    // creating application folder
	    File tempApplicationFolder = home.newFolder(home.getApplicationFolderName() + "/" + home.getApplicationSubFolderName());
	    home.setApplicationFolderName(home.newFolder(home.getApplicationFolderName()));
}
}