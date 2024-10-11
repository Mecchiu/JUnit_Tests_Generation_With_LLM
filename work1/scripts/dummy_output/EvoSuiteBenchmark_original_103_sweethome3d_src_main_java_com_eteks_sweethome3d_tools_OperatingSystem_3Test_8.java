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
		
	private static final boolean UNDETERMINED = false;
	
	private static final boolean WINEDETERMINED = true;

    /**
     * Method that checks if the operating system is Linux.
     * @throws IOException if the OS isn't Linux,
     */
	@Test
	public void isLinux() throws IOException {
		checkOperatingSystemState(true);
	}
	
	/**
	 * Method that checks if the operating system is Windows.
	 * @throws IOException if the OS isn't Windows,
	 */
	@Test(expected = IOException.class)
	public void isWindows() throws IOException {
		checkOperatingSystemState(false);
	}

	/**
	 * Test class of {@link OperatingSystem} that uses Windows.
	 * It contains one test case for the {@link OperatingSystem#getDefaultApplicationFolder() getDefaultApplicationFolder}.
	 */
	private static class WindowsFileManager extends MacOSXFileManager {

		private final File defaultApplicationFolder;
		
		/**
		 * Creates a file manager instance that use the default application folder as default folder.
		 * @param defaultApplicationFolder default folder
		 */
		WindowsFileManager(final File defaultApplicationFolder) {
			super();
			
			this.defaultApplicationFolder = defaultApplicationFolder;
		}
	}

    /**
     * Method that checks if the operating system is Mac OS X or later.
     * @throws IOException if the operating system is not Mac OS X
     */
	@Test
	public void isMacOSX() throws IOException {
		checkOperatingSystemState(false);
	}

	/**
	 * Test class of {@link OperatingSystem} that uses Mac OS X or later.
	 * It contains one test case for the {@link OperatingSystem#getDefaultApplicationFolder() getDefaultApplicationFolder}.
	 */
	private static class MacOSXFileManager extends MacOSXFileManager {

		@Override
		protected File getDefaultApplicationFolder() throws IOException {
			throw new IOException("This class shouldn't be invoked for Mac OS X");
		}
	}
	
	/**
	 * Method returns the application's folder, and creates one if it doesn't have one.
	 * @throws IOException if the OS isn't Mac OS X or later,
	 */
	@Test
	public void getDefaultApplicationFolder() throws IOException {
		checkOperatingSystemState(UNDETERMINED);
	}

	/**
	 * Method that checks if the current running operating system is Windows or macOS specific for Windows.
	 * @throws IOException if the OS isn't Windows or macOS specific to Windows,
	 */
	@Test
	public void getDefaultApplicationFolderWindows() throws IOException {
		checkOperatingSystemState(UNDETERMINED);
	}

	/**
	 * Method that checks if OperatingSystem is Windows specific to Windows.
	 * @throws IOException if the operating system isn't Windows specific to Windows,
	 */
	@Test
	public void getDefaultApplicationFolderWindowsSpecificToWindows() throws IOException {
		checkOperatingSystemState(UNDETERMINED);
	}

	/**
	 * Method that checks if OperatingSystem is not Windows specific to Windows.
	 * @throws IOException if the operating system isn't Windows specific to Windows,
	 */
	@Test
	public void getDefaultApplicationFolderNonWindowsSpecificToWindows() throws IOException {
		checkOperatingSystemState(UNDETERMINED);
	}

	/**
	 * @throws IOException if the operating system isn't MacOSX or later
	 */
	private void checkOperatingSystemState(boolean isMacOSXLeopardOrSuperior) throws IOException {
		final File defaultApplicationFolder = getDefaultApplicationFolder();
		if (isMacOSXLeopardOrSuperior) {
			assertTrue(isWindows());
		} else {
			assertTrue(isMacOSXSpecificToWindows());
		}
		final File defaultApplicationFolderWindows = isMacOSXLeopardOrSuperior? new File(WINDOWS_FOLDER, "home.yaml") : null;
		assertNotNull(defaultApplicationFolder);
		assertFalse(defaultApplicationFolder.exists());
		assertFalse(defaultApplicationFolderWindows.exists());
	}
}