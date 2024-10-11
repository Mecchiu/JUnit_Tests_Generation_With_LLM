// OperatingSystem_3Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {
		/**
		 * The test case for OS X Mac OSX >= 10.5 and superior.
		 * @throws IOException if the file couldn't be created
		 */
	private OperatingSystem_3Test() throws IOException {
	}

	/**
	 * Tests the method {@link OperatingSystem#isMacOSXLeopardOrSuperior()}
	 * for operating system.
	 * @throws IOException if the file couldn't be created
	 */
	@Test
	void isMacOSXLeopardOrSuperior() throws IOException {
		assertTrue(OSX_FILEMANAGER.isMacOSXLeopardOrSuperior());
	}

	/**
	 * Test case for checking the path of the temporary files
	 * created by the program. The code is copied from
	 * {@link File#delete() File.delete()} method.
	 * @throws IOException
	 */
	@Test
	void deleteTemporaryFiles() throws IOException {
		File defaultTemp = new File(MacOSXFileManager.getApplicationSupportFolder());
		File temp = new File(MacOSXFileManager.getApplicationSupportFolder() + "/" + "temp.pdf");
		if (!temp.exists() || temp.lastModified() <= defaultTemp.lastModified()) {
			assertTrue("Last modified timestamp of temp isn't equal to that of default folder ("
				+ defaultTemp.lastModified() + ") or equal to that of user folder (" + temp.lastModified()
				+ ").", temp.lastModified() <= defaultTemp.lastModified());
		} else {
			assertEquals(defaultTemp.lastModified(), temp.lastModified());
		}
		temp.deleteOnExit();
	}

	/**
	 * Tests the method {@link OperatingSystem#getDefaultTemporaryFolder(boolean)}
	 * for operating system.
	 * @throws IOException if the file couldn't be created
	 */
	@Test
	void getDefaultTemporaryFolder() throws IOException {
		// Test with temporary folder
		File defaultTemp = new File(MacOSXFileManager.getApplicationSupportFolder());
		File temp = new File(MacOSXFileManager.getApplicationSupportFolder() + "/" + "temp.pdf");
		assertNotNull(temp.getAbsolutePath());

		// Test with no user folder
		defaultTemp =
			new File(MacOSXFileManager.getApplicationSupportFolder(), "temp.pdf");
		temp = new File(MacOSXFileManager.getApplicationSupportFolder() + "/" + "temp.pdf");
		assertNotNull(temp.getAbsolutePath());
	}

	/**
	 * Tests the method {@link OperatingSystem#getDefaultApplicationFolder()}
	 * for operating system.
	 * @throws IOException if the file couldn't be created
	 */
	@Test
	void getDefaultApplicationFolder() throws IOException {
		File defaultTemp =
			new File(MACOSXFileManager.getApplicationSupportFolder(), File.separator
				+ "AppData" + File.separator + "Library" + File.separator + "Application Support");
		File temp = new File(MACOSXFileManager.getApplicationSupportFolder()
			+ "/" + "Application Support");
		assertNotNull(temp.getAbsolutePath());
	}

	/**
	 * Tests the method {@link OperatingSystem#getDefaultTemporaryFolder(boolean)}
	 * for operating system.
	 * @throws IOException if the file couldn't be created
	 */
	@Test
	void getDefaultTemporaryFolderLeopard() throws IOException {
		// Test with temporary folder in leopard
		File defaultTemp = new File(MacOSXFileManager.getApplicationSupportFolder());
		File temp = new File(MacOSXFileManager.getApplicationSupportFolder()
			+ "/" + "temp.pdf" + File.separator + "laptop");
		assertNotNull(temp.getAbsolutePath());

		// Test with no user folder
		defaultTemp =
			new File(MacOSXFileManager.getApplicationSupportFolder()
				+ File.separator + "AppData" + File.separator
				+ "Library" + File.separator + "Application Support");
		temp = new File(MacOSXFileManager.getApplicationSupportFolder());
		assertNotNull(temp.getAbsolutePath());
	}
	
	/**
	 * Test class for handling {@link com.apple.eio.FileManager#registerPathFilter(FileFilter)}
	 * @throws IOException if the path couldn't be handled by {@link FileManager}
	 */
}