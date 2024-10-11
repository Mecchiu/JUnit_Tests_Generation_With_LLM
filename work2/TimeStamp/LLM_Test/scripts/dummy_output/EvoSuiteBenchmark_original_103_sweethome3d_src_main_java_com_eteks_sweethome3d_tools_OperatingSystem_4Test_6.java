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
		* Tests the {@link OperatingSystem.getDefaultApplicationFolder()} method.
		*/
		@Test
		public void testGetDefaultApplicationFolder() {
			assertNotNull(
				"The default application folder doesn't exist.",  //$NON-NLS-1$
				OperatingSystem.getDefaultApplicationFolder()
			);
			assertEquals(
				"The current application folder can't be equal to the default application folder.",  //$NON-NLS-1$
				new File(getDefaultApplicationFolder()).getAbsolutePath(),
				OperatingSystem.getDefaultApplicationFolder()
	);
		}

		/**
		* Tests if the default application folder exists.
         * @throws IOException if the default application folder doesn't exist
		 */
		@Test
		public void testCheckApplicationFolderExists() throws IOException {
			try {
				FileManager.createFolder(getDefaultApplicationFolder());
			}
			catch(AccessControlException e) {
				// The Application's home folder can't be created.
				return;
			}
			FileManager.createFolder(new File(getDefaultApplicationFolder()).getAbsolutePath());

			assertTrue(
				"The default application folder should be created.",
				FileManager.exists(getDefaultApplicationFolder())
			);
		}

		/**
		* Tests if default working directory is in a temporary folder.
		* @throws IOException
		*/
		@Test
		public void testIsTempDirectory() throws IOException {
			createTemporaryFolder("");
}
}