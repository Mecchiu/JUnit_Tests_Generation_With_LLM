// OperatingSystemTest.java
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystemTest {

	@Test
	void testGetDefaultApplicationFolder() throws IOException {
		// Test 1
		File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 2
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 3
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 4
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 5
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 6
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 7
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 8
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 9
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
		
		// Test 10
		defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
		assertNotNull(defaultApplicationFolder);
		assertTrue(defaultApplicationFolder.exists());
		assertTrue(defaultApplicationFolder.isDirectory());
	}
}