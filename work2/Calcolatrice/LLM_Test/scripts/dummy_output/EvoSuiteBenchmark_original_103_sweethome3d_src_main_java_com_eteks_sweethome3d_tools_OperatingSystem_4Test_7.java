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
	void ensureCorrectDefaultPathIsCreated() {
		Home home = Home.INSTANCE;
		File parentFile = home.getUserHome();
		String newPath = OperatingSystem.getDefaultApplicationFolder() + File.separator + UUID.randomUUID().toString();
		try {
			assertEquals(parentFile, new File(newPath));
		} catch (IOException io) {
		}
	}
	
	@Test
	void ensureCorrectApplicationFolderIsCreated() throws IOException {
		File root = OperatingSystem.getDefaultApplicationFolder();
		File folder = new File(root.getAbsolutePath() + File.separator + "/Temporary");
		folder.mkdir();
		assertTrue(folder.exists());
	}
	
	@Test
	void ensureCorrectApplicationFolderForEquality() throws IOException {
		for (File folder : OperatingSystem.getDefaultApplicationFolder().listFiles()) {
		}
		File root = OperatingSystem.getDefaultApplicationFolder();
		File folder = new File(root.getAbsolutePath() + File.separator + "/Temporary");
		assertFalse(folder.exists());
	}
	
	@Test
	void getDefaultTemporaryFolderDoesNotExist() {
		File folder = OperatingSystem.getDefaultTemporaryFolder(true);
		assertEquals("Could not create temporary files", 0, folder.listFiles().length);
	}
	
	/**
	 * This class contains utility methods that are not part of class of org.junit.jupiter.api.Jupiter
	 */
	public class MacOSXFileManagerTest {
		
		@Test
		void ensureSystemDefaultsFolderIsReadOnly() throws IOException {
			assertTrue("File should be created with read only access",
					MacOSXFileManager.hasFileBeenCreated(new File("/tmp")));
		}
		
		public boolean hasFileBeenCreated(File file) {
			return file.exists() && file.isFile();
		}
		
	}
	
	/**
	 * This class contains utility methods that are not part of class of org.junit.jupiter.api.Jupiter
	 */
	public class getDefaultTemporaryFolderTest {
		
		@Test
		void ensureTemporaryFolderExists() throws IOException {
			assertTrue("File should be created",
					MacOSXFileManager.hasFileBeenCreated(OperatingSystem.getDefaultTemporaryFolder(true)));
		}
		
	}
}