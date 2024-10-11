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
/**
		 * Checks that OperatingSystem_4Test.getDefaultApplicationFolder returns correctly
		 * defined folder.
		 */
		@Test
		void getDefaultApplicationFolder_1() {
			assertNotNull( OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../../../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../../../../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("..build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../..build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../../..build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("..../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("..../../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("../..../build"), OperatingSystem.getDefaultApplicationFolder());
			assertEquals(new File("..../../..build"), OperatingSystem.getDefaultApplicationFolder());
			assertNull( OperatingSystem.getDefaultApplicationFolder());
			try {
				OperatingSystem.getDefaultApplicationFolder();
				assertTrue("Could not get an application folder", false);
			} catch (final Exception e) {
				assertTrue(true);
			}
		}
	}
