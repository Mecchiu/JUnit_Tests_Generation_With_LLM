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
		
		static String TEST_APP_FOLDER = "test-app";
		
		@Test
		public void isWindows_returnsTrue() throws IOException, IOException, AccessControlException {
		
			File workingDir =  new File("/Volumes/DataDir/home");
			File tempWorkingDir =  new File("/Volumes/DataDir/temp");
			File tempTempDirectory =  new File (tempWorkingDir, TEST_APP_FOLDER + "/test/" + "temp");
			File tempSessionDirectory =  new File(tempTempDirectory, TEST_APP_FOLDER + "/test/session");
			
        // Set the temporary working folder
        FileManager.setCurrentWorkingFolder(new File(tempWorkingDir, "home"));
        FileManager.setCurrentSessionWorkingDirectory(new File(tempTempDirectory, TEST_APP_FOLDER + "/test/session"));
        
        FileManager.setUserSessionName("temporary");
        FileManager.setUserSessionID(new UUID(0,0));
        FileManager.setUserSessionTypeName(new UUID(0,0));
        
		    try {
				if (!isWindows()) {
					System.exit();
				} else {
					File workingFile = (File) FileManager.findFolder(Home.ACTUAL_POD_HOME, 0x61737570);
					System.err.println("TEST_APP_FOLDER = "+ TEST_APP_FOLDER);
					assertTrue(workingFile.getAbsolutePath().endsWith("home"));
				}
		    }
		    catch (AccessControlException ex) {
		        System.err.print("Error in access control");
		        ex.printStackTrace(System.err);
			    assertTrue(false);
		    }
		}
}