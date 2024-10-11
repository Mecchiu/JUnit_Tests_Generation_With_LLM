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
		private OperatingSystem operatingSystem;
		{
			try {
				System.setProperty("os.name", "Mac OS X");
			} catch (MissingResourceException e) {
				e.printStackTrace();
			}
			operatingSystem = new OperatingSystem();
		}
		public OperatingSystem_3Test() {
			super();
		}

		@Test
		public void testMacLeopard() {
			assertFalse(operatingSystem.isMacOSXLeopardOrSuperior());
			
			operatingSystem.addApplication("ApplicationLeopard", "path");
			assertTrue(operatingSystem.isMacOSXLeopardOrSuperior());		
		}
		
		@Test
		public void testWindowsLeopard() {
			assertFalse(operatingSystem.isWindows());
			
			operatingSystem.addApplication("PackageLeopard", "path");
			assertTrue(operatingSystem.isWindows());
		}
		
		@Test
		public void testWindowsLeopardLea() {
			assertTrue(operatingSystem.isWindows());
			
			// TODO: check some more lea-based
			// TODO: check this
			File tmp = createTemporaryFile(".app", "temppath");
			operatingSystem.addApplication("PackageLeopardLea", tmp.getAbsolutePath());
			File tmp2 = createTemporaryFile(".app", ".tmp");
			operatingSystem.addApplication("PackageLeopardLea", tmp2.getAbsolutePath());
			
			operatingSystem.deleteTemporaryFiles();
			
			assertFalse(operatingSystem.isWindows());
			assertFalse(operatingSystem.isWindowsLeopard());
			
			File tmp3 = createTemporaryFile(".app", "anothertemppath");
			operatingSystem.addApplication("PackageLeopardLea", tmp3.getAbsolutePath());
			File tmp4 = createTemporaryFile(".app", ".tmp");
			operatingSystem.addApplication("PackageLeopardLea", tmp4.getAbsolutePath());
		}

		
		@Test
		public void testLinuxLeopard() {
			assertFalse(operatingSystem.isLinux());
			
			// TODO: check some more lea-based
			// TODO: check this
			File tmp = createTemporaryFile(".app", "temppath");
			operatingSystem.addApplication("com.eteks.home3d.ApplicationLeopard", tmp.getAbsolutePath());
			
			// Wait some time to wait for the process to start.
			Timer timer = new Timer();
			timer.schedule(new TimeOutTask(), 0, 5000);
			
			operatingSystem.deleteTemporaryFiles();
			
			assertTrue(operatingSystem.isLinux());
			
			assertFalse(operatingSystem.isLinuxLeopard());
		}

		@Test
		public void testWindows() {
			assertFalse(operatingSystem.isWindows());
			
			// TODO: check some more lea-based
			// TODO: check this
			File tmp = createTemporaryFile(".app", "temppath");
			
}
}