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
		
	//Test to ensure correct implementation.
	@Test
	public void testOperatingSystemMethod() {
		try {
			// Create home using the current running Operating System object.
			Home h;
			h = Home.createHome();
			// Now you must wait for the startup of the home, this will trigger when the
			// user has finished changing the values.
			h.waitHomeUpdatedAndReady();

			// You must call isMacOSX() before you can call getDefaultTemporaryFolder()
			assertThrows(IOException.class, () -> OperatingSystem.isMacOSX());
			// Test if default folder does not exists
			assertThrows(IOException.class, () -> Environment.getDefaultHome().getDefaultTemporaryFolder());

			// Calling updateTemplate() or reload() with empty templates.
			h.updateTemplate("");
			h.updateTemplate("");
		}
		catch (AccessControlException e) {
			fail(e.getMessage());
			// Just log here in case there is an expected exception at some level
			// than AccessControlException
			LogManager.printLog();
			LogManager.printLog();
			LogManager.printLog();
			LogManager.printLog();
		}
		catch (IOException e) {
			fail(e.getMessage());
			// Just log here in case there is an expected exception at some level
			// than IOException
			LogManager.printLog();
			LogManager.printLog();
			LogManager.printLog();
		}
	}

	private File getDefaultTemporaryFolder(boolean create) throws IOException {
		if (create && (System.getProperty("os.name").toLowerCase().startsWith("windows"))) {
			return FileManager.findFolder("temp", 0x61737570);
		}

		// Not created yet
		try {
			return Environment.getDefaultHome().getDefaultTemporaryFolder();
		} catch (AccessControlException e) {
			assertThrows(IOException.class, () -> Environment.getDefaultHome().getDefaultTemporaryFolder());
			return Environment.getDefaultHome().getDefaultTemporaryFolder();
		}
	}

	/**
	 * Checks to see if the operating system can handle the given directory.
	 */
    	@Test
    	public void canHandleHome() throws IOException {
		final Home h = Home.createHome();
		h.waitHomeUpdatedAndReady();

		// Test if default home does not exists
		assertNoFile(h, "/Applications", "/System/Library", "/Library/Java");
	}

	/**
	 * Tests to see if user has launched the system already correctly.
	*/
    @Test
    public void canLaunchHome() throws IOException {
		final Home h;

		// Create home using the current running Operating System object.
		h = Home.createHome();
		// Now you must wait for the startup of the home, this will trigger when the
		// user has finished changing the values.
		h.waitHomeUpdatedAndReady();

		// User has launched the home, so now the check should work.
		assertDoesNotThrow(() -> h.canLaunchHome());
    }

    /**
     * Tests to see if a temporal file without extension or folder structure exists.
     */
    @Test
    public void canNotBeExistsWithUndefinedExtensionFile() {
        final Home h;

        // Create home using the current running Operating System object.
        h = Home.createHome();

        // New home is created
        h.createTemp();

        // Not ready yet
        assertDoesNotThrow(() -> h.canLaunchHome());
    }

    @Test
    public void canNotBeExistsWithUndefinedFolder() throws RuntimeException {
        final Home h;

        // Create home using the current running Operating System object.
        h = Home.createHome();

        // New home is created
        h.createTemp();

        // Not ready yet
        assertDoesNotThrow(() -> h.canLaunchHome());
    }

    /**
     * Tests to see if a folder without extension or folder structure exists.
     */
    @Test
    public void canNotBeExistsWithUndefinedFolder() throws RuntimeException {
        final Home h;

        // Create home using the current running Operating System object.
        h = Home.createHome();

        // New home is created
        h.createTemp();

        // Not ready yet
        assertDoesNotThrow(() -> h.canLaunchHome());
    }

    /**
     * Tests to see if a temporal file with extension without extension also has the extension 'TTF' present.
     */
}