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
		
	/**
	 * Test method for {@link OperatingSystem#isMacOSX()}.
	 */
	@Test
	public void testIsMacOSX() throws IOException {
		
		File file = new File(System.getProperty("user.home") + "/Library/Application Support/" + "Praata_praata.xcode");
		assertTrue("File " + file + " expected to exist", file.exists());
		
		// Get the BUNDLE and BUNDLE PARSER location from ResourceBundles
		String key = OperatingSystem.class.getName().replace(".", "/") + ".key";
		String bundleLocation = System.getProperty((System.getProperty("user.home") + "/Library/") + "/Resources") + "/" + "BUNDLE/*.dat";
		String bundlePropLocation = System.getProperty(key) + "/" + "BUNDLE/*.dat";
		
		// Assert if the BUNDLE folder doesn't exist
		assertFalse("BUNDLE folder doesn't exist", new File(bundleLocation).exists());
		
		// Assert if the BUNDLE PARSER file doesn't exist
		assertFalse("BUNDLE PARSER location doesn't exist", new File(bundlePropLocation).exists());
		
		// Assert if the SYSTEM variable doesn't exist
		assertFalse("SYSTEM variable doesn't exist", System.getenv("SYSTEM"));
		
		// Create a file to create temp file
		File temp = createTemporaryFile("xcode", ".xcode");
		try {
			// Assert if file couldn't be created
			assertTrue("File couldn't be created", temp.exists());
		} catch (IOException E) {
			// Catch the case where code fails here
			fail("Couldn't create temp file.");
		}
		
		// Assert if it could be read
		assertTrue("File could be read.", temp.length() > 0);
		
                // Create a Timer to create the temp folder
		TimerTask createTimerTask = new CreateTempFolderTask();
		createTimer = new java.util.Timer(null);
		createTimer.scheduleAtFixedRate(createTimerTask, 0, 2000, 10);
		TimerTask runTimerTask = new RunTimerTask();
		runTimer = new java.util.Timer(null);
		runTimer.schedule(runTimerTask, 500, 500);
		
		// Assert if running time wasn't exceeded
		assertTrue("Running time wasn't exceeded after creating temp folder", 1 < runTimer.getQueueLength());
		
                // Assert if folder gets created with an Xcode file
		// FIXME: The framework only checks it for a few files in the folder.
                // Do I want to check every folder?
		Home home = Home.getHomeDirectory();
		assertFalse("folder does not exist", home == null || home.getHomeFolders().size() == 0);
		
		// Create folder with a property file
		File propertyFile = new File(temp.getAbsolutePath() + File.separator + "PROPERTY");
                // Assert if the temp folder gets created with the property file
		assertTrue("File couldn't be created", propertyFile.exists());
		
		// Assert if home folder gets created with an Xcode folder
		File folder = home == null? null : home.getHomeFolders().get(0);
                // Assert if home folder gets created with a property file
		assertTrue("folder getXcode folder expected to exist", folder!= null);
                // Assert if property file doesn't exist
		assertFalse("property file exists", propertyFile.exists());
                // Assert if home folder doesn't have an Xcode folder
		assertFalse("home folder doesn't have a Xcode folder", home == null || home.getHomeFolders().size() == 0);
		
		// Exit JVM
		System.exit(0);
	}
		
		

        public static class CreateTempFolderTask extends TimerTask {


                public void run() {
                        try {
                                System.setProperty(OperatingSystem.class.getName().replace(".", "/"), "home");
                        } catch (AccessControlException E) {
                                throw new RuntimeException(E);
                        }
                        new File(System.getProperty("user.home"))//Set HOME environment variable
                               .mkdir();
                }
        }
	

        public static class RunTimerTask extends TimerTask {

}
}