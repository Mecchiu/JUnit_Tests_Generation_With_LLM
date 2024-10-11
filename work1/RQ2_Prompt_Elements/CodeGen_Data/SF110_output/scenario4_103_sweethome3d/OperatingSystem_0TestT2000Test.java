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
// A class for holding testing of Operating Systems.
        private OperatingSystem operatingSystem;

		// Tests
		@Test
		public void OperatingSystem_0_01_createTemporaryFile_CreateEmptyFile() throws IOException {
			FileManager.initialize(new File(System.getProperty("user.dir")));
			// Test
			// 1: create a temporary folder that will be deleted
			File temp = OperatingSystem_0Test.createTemporaryFile(null, null);
			assertTrue(temp.isDirectory() == false);
			assertTrue(temp.exists());
			assertTrue(temp.canWrite() == true);
			FileManager.setDefaultTemporaryFolder(temp);
		}

		@Test
		public void OperatingSystem_0_02_createTemporaryFile_CreateEmptyFileFromParent() throws IOException {
			// Set up test
			FileManager.initialize(new File(System.getProperty("user.dir")));
			// Test
			// 1: create a temporary folder that will be deleted
			File temp = OperatingSystem_0Test.createTemporaryFile(null, null);
			assertTrue(temp.isDirectory() == false);
			assertTrue(temp.exists());
			assertTrue(temp.canWrite() == true);
			FileManager.setDefaultTemporaryFolder(temp);
			try {
				FileManager.setHome(Home.HOME_USER_0);
				// Test: failed
				// 1: create a temporary folder that will be deleted
				// 2: create a temporary file  that will be deleted
				// 3: delete the temp file
				File temp2 = OperatingSystem_0Test.createTemporaryFile(null, null);
				assertTrue(temp2.isDirectory() == false);
				assertTrue(temp2.exists());
				assertTrue(temp2.canWrite() == true);
				FileManager.setDefaultTemporaryFolder(temp2);
				// Test: failed
				// 1: create new test folder
				// 2: create a new temp folder
				// 3: delete the temp folder
				// 4: delete the temp file
				// 5: delete the temporary folder
			} finally {
				// Release temporary files
				FileManager.deinitialize();
			}
		}

		@Test
		public void OperatingSystem_0_03_createTemporaryFile_CreatedEmptyFile() throws IOException {
			// Set up test
			FileManager.initialize(new File(System.getProperty("user.dir")));
			File temp = OperatingSystem_0Test.createTemporaryFile(String.valueOf(UUID.randomUUID()), null);
			assertTrue(temp.isFile() == false);
			// Test
			// 1: create a temporary folder that will be deleted
			FileManager.setDefaultTemporaryFolder(temp);
			// Test: succeeded
		}

		@Test
		public void OperatingSystem_0_04_createTemporaryFile_CreateEmptyFileFromEmptyParent() throws IOException {
			// Set up test
			FileManager.initialize(new File(System.getProperty("user.dir")));
			File temp = OperatingSystem_0Test.createTemporaryFile(null, null);
			assertTrue(temp.isFile() == false);
			// Test: failed
			// 1: create a temporary folder that will be deleted
			// 2: create a new empty temp folder
			// 3: create a new empty file
			FileManager.setDefaultTemporaryFolder(temp);
			// Test: failed
			// 1: create a new temp folder that will be deleted
			// 2: create a new empty file
			FileManager.setDefaultTemporaryFolder();
		}

		@Test
		public void OperatingSystem_0_05_createTemporaryFile_CreateFromParent() throws IOException {
			// Set up temp
			FileManager.initialize(new File(System.getProperty("user.dir")));
			File temp = OperatingSystem_0Test.createTemporaryFile(String.valueOf(UUID.randomUUID()), null);
			// Test: check if the temp file is created
			// 1: create a folder that will be deleted
			assertTrue(temp.isDirectory() == false);
			assertTrue(temp.exists());
			assertTrue(temp.canWrite() == true);
			FileManager.setDefaultTemporaryFolder(temp);
			// Test: failed
			// 2: create a new folder that will be deleted
			// 3: create a new empty file
			FileManager.setDefaultTemporaryFolder();
			// Test: failed
			// 2: create a new folder that will be deleted
			// 3: create a new file
			FileManager.setDefaultTemporaryFolder();
		}
}
