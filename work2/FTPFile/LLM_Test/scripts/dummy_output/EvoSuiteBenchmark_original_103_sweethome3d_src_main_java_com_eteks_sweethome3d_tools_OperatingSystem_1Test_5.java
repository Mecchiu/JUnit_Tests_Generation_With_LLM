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
		@Test
    public void isWindows() throws IOException, MissingResourceException, AccessControlException, IllegalStateException, InterruptedException {
        FileManager fileManager = new FileManager("~/data/TEST_OSX_FILES");
        FileManager systemFolder = new FileManager("/Users/user/Local Workspaces/TEST_OSX_FILES");

        FileSystem fsystem = new FileSystem(fileManager);
        FileManager dirsManager = new FileManager("/Users/user/Local Workspaces/TEST_OSX_FOLDERS");

        // Test if operating system is on Windows
        Home home = new Home("/home/user", "user", fsystem);
        assertTrue(fileManager.exists("/home/user/Library"));

        boolean wasEnabled = System.getProperty("os.name").contains("Mac");
        assertTrue(wasEnabled);

        // Start time and time for test should not overlap
        Timer timer = new Timer();
        final TimerTask task = new TimerTask() {
            public void run() {
                System.exit(0);
            }
        };
        task.scheduleAtFixedRate(task, 0L, 1L);

        // The test is a part of the automated test suite that need to be automated
        // by the automated test suite framework.
	// It was created to test the OSX support of system folders when
	// the test execution is initiated by the JVM, so we can test
	// them ourselves.

        timer.schedule(task, 1L, 2L);

        // Verify if operating system is on Windows with the given system folder
        home.setUserFolder(dirsManager.getFolder("Folders", "User"));
        assertEquals(System.getProperty("os.name"), "Linux");  // Linux by default
        assertEquals(false, isLinux());
    }
    
    /**
     * Return the file object manager used for testing.
     */
    FileManager getFileManager(String file) throws IOException {
        return new FileManager(file, "/home/user", "user", "TEST_OSX_FILES");
    }
}