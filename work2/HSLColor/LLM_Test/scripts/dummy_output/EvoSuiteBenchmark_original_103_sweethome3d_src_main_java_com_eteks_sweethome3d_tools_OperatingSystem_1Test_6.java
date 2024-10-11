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
	void isWindows() throws IOException {
		assertTrue(OperatingSystem.isWindows());
	}

	@Test
	void isLinux() throws IOException {
		assertTrue(OperatingSystem.isLinux());
	}

	@Test
	void isMacOSX() throws IOException {
		assertTrue(OperatingSystem.isMacOSX());
	}

}