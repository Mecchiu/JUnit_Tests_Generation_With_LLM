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
		// Operator version as a global variable.
	private static String testVersion;

	@Test
	void isWindowsTest() throws IOException, AccessControlException {
		assertFalse(testVersion.isEmpty());
		assertEquals("isWindows", OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
	}

	@Test
	void isLinuxTest() throws IOException, AccessControlException {
		assertFalse(testVersion.isEmpty());
		assertEquals("isLinux", OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
	}

	@Test
	void isMacOSXTest() throws IOException, AccessControlException {
		assertTrue(testVersion.isEmpty());
		assertEquals("Mac OS X", OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
	}
		
	@Test
	void isMacOSXLeopardOrSuperiorTest() throws IOException, AccessControlException {
		assertTrue(testVersion.isEmpty());
		assertEquals("Mac OS X Leopard or Superior", OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
	}
	
	@Test
	void isMacOSXTest() throws IOException {
		assertFalse(testVersion.isEmpty());
		assertEquals("Mac OS X", OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
	}

	@Test
	public void getApplicationFolderTest() throws IOException {
		assertNull(testVersion);
		assertEquals("com.eteks.sweethome3d", OperatingSystem.class.getPackage().getName());
	}

	@Test
	public void getDefaultTemporaryFolderTest() throws IOException {
		assertNull(testVersion);
		File defaultDirectory1 = OperatingSystem.getDefaultTemporaryFolder((boolean) (new Timer()).cancel());
		assertNotNull("Get default temp folder", defaultDirectory1);
		File defaultFolder2 = OperatingSystem.getDefaultTemporaryFolder(false);
		//Tests the return of FileManager.findFolder(false)
		//Test if the folder is the default one
		File expectedFile = new File(defaultFolder2, OperatingSystem.class.getPackage().getName() + ".OperatingSystem");
		assertTrue("File shouldn't exist on a non-default temp folder!" + defaultFolder2, expectedFile.exists());
		FileManager.deleteFile(expectedFile);
	}
}