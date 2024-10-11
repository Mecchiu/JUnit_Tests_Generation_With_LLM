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
		/**
		 * Tests that user does not have any operating system files in 
		 * any of their working directories.
		*/
		@Test
		public void isWindowsWithoutMacOS() throws IOException {
			assertFalse(isWindowsWithoutMacOS());
		}

		/**
		 * Tests that user have an operating system file in all of his operating system folders
		 * and that their working directory isn't a MacOSX folder.
		*/
		@Test
		public void isMacOSXWithMacOS() throws IOException {
					assertTrue(isMacOSX());
		}

		/**
		 * Tests that user have an operating system file in all of their operating system folders
		 * and that their working directory isn't a MacOSX folder.
		*/
		@Test
		public void isMacOSXWithoutExt() throws IOException {
			assertTrue(isMacOSXWithoutExt());
		}

		/**
		 * Tests that user have an operating system file in all of their operating system folders
		 * and that the directory containing the operating system file is the current directory.
		 */
		@Test
		public void isMacOSXWithoutExtAndCurrentDirectory() throws IOException {
			String file = "/tmp/test-file";
					assertTrue(isMacOSXWithoutExtAndCurrentDirectory(file));
		}

		/**
		 * Tests that user have an operating system file in all of their operating
		 * system folders and that the directory containing the operating system
		 * file is not the current directory.
		*/
		@Test
		public void isMacOSXWithoutExtAndOtherCurrentDirectory() throws IOException {
			String file = "/tmp/test-file";
						assertFalse(isMacOSXWithoutExtAndOtherCurrentDirectory(file));
		}

		/**
		 * Tests that user have an operating system file in all of their operating
		* system folders, the operating system folder is a parent folder with no
		* file inside, and the directory containing the operating system file is
		* the current directory.
		*/
		@Test
		public void isMacOSXWithFileAndCurrentDirectory() throws IOException {
			String file = "/tmp/test-file";
						assertTrue(isMacOSXWithFileAndCurrentDirectory(file));
		}

		/**
		 * Tests that user have an operating system file in all of their operating
		* system folders, the operating system folder is a parent folder with no
		* file inside, and the directory containing the operating system file is
		* the current directory, but the file outside the directory is also
		* checked.
		*/
		@Test
		public void isMacOSXWithoutFileAndOtherCurrentDirectory() throws IOException {
			String file = "/tmp/test-file";
			assertFalse(isMacOSXWithoutFileAndOtherCurrentDirectory(file));
		}

		/**
		 * Tests that user have an operating system file in all of their operating
		* system folders, the operating system folder is a parent folder with no
		* file inside, and the directory containing the operating system file is
		* the current directory and the file outside the directory is checked.
		*/
		@Test
		public void isMacOSXWithoutFileAndFileAndOtherCurrentDirectory() throws IOException {
			String file = "/tmp/test-file";
			assertTrue(isMacOSXWithoutFileAndFileAndOtherCurrentDirectory(file));
		}

}