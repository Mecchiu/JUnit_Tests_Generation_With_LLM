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
		
		private OperatingSystem operatingSystem;
		
		/**
		 * Initializes OperatingSystem_1Test (class {@link OperatingSystem_2Test}).
		 * @throws IOException if some problems found when creating temporary folder
		 */
		@Test
		void setUp() throws IOException {
			operatingSystem = new OperatingSystem();
			
			// Add a temporary folder to a temporary file manager
			File fileFolder = new File(UUID.randomUUID().toString()).getAbsoluteFile();
			operatingSystem.getDefaultTemporaryFolder(true);
			operatingSystem.getDefaultApplicationFolder();
			operatingSystem.deleteTemporaryFiles();
			
			System.out.println("Temporary folder:" + operatingSystem.getDefaultTemporaryFolder());
			System.out.println("Application folder:" + operatingSystem.getDefaultApplicationFolder());
			System.out.println("FileManager:" + operatingSystem.getFileManager(fileFolder));
		}


		/**
		 * Initializes OperatingSystem_1Test (class {@link OperatingSystem_2Test}).
		 * This constructor runs once.
		 * @throws IOException if some problems found when reading from a file manager for the temporary folder.
		 */
		@Test
		void readFileManager_1Read() throws IOException {
			File fileFolder = new File(UUID.randomUUID().toString()).getAbsoluteFile();
			operatingSystem.getFileManager(fileFolder);
			assertNotNull("Could not get file manager", operatingSystem.getFileManager(fileFolder));
		}
	} // OperatingSystem_2Test