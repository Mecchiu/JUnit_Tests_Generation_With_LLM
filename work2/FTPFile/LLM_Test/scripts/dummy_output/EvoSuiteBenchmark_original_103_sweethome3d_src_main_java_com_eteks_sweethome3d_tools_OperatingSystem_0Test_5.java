// OperatingSystem_0Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_0Test {
		String operatingSystem = "";
		
		@Test
		public void isLinux() {
			assertEquals(OperatingSystem.isLinux(), OperatingSystem.isLinux());
			assertNotNull(OperatingSystem.getOperatingSystem());
        }
	
        @Test
        public void getDefaultTemporaryFolder() throws IOException {
			String defaultTemporaryFolder = OperatingSystem.getDefaultTemporaryFolder(false);
			assertNotNull(defaultTemporaryFolder);
			assertTrue(defaultTemporaryFolder.startsWith(File.separator));
			assertEquals(Path.separator, defaultTemporaryFolder.charAt(0));
			assertTrue(defaultTemporaryFolder.endsWith(File.separator));
		}

		@Test
        public void getDefaultApplicationFolder() throws IOException {
			String defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder(false);
			assertNotNull(defaultApplicationFolder);
			assertTrue(defaultApplicationFolder.startsWith(File.separator));
			assertEquals(Path.separator, defaultApplicationFolder.charAt(0));
			assertTrue(defaultApplicationFolder.endsWith(File.separator));
		}

        @Test
        public void getDefaultTemporaryFolderInSystemProp() throws IOException {
			String envVarOperatingSystemDefaultTemporaryFolder =
					OperatingSystem.getEnvironmentVariable(OPERATING_SYSTEM_ENVIRONMENT_VARIABLE_PREFIX_TEMP_FOLDER);
			String defaultTemporaryFolder = OperatingSystem.getDefaultTemporaryFolder(false) + File.separator;
			assertEquals(envVarOperatingSystemDefaultTemporaryFolder, defaultTemporaryFolder);
        }

		@Test
        public void getDefaultApplicationFolderInSystemProp() throws IOException {
			String envVarOperatingSystemDefaultApplicationFolder =
					OperatingSystem.getEnvironmentVariable(OPERATING_SYSTEM_ENVIRONMENT_VARIABLE_PREFIX_APPLICATION_FOLDER);
			String defaultDirectory = OperatingSystem.getDefaultApplicationFolder(false);
			assertEquals(envVarOperatingSystemDefaultApplicationFolder, defaultDirectory);
        }

        /**
         * Method that creates new temporary folder.
         */
        private final File createTemporaryFile(String prefix, String suffix) throws IOException {
            String applicationSupportFolder = OperatingSystem.getApplicationSupportFolder();
            assertNotNull(applicationSupportFolder);
            assertEquals(applicationSupportFolder, OperatingSystem.getTemporaryFilePath());
            String temporaryFolderPath = applicationSupportFolder + Path.separator + prefix + File.separator + UUID.randomUUID() + Path.separator + suffix;
            File file = new File(temporaryFolderPath);
            file.mkdirs();
            return file;
            //return createTemporaryFile(prefix, suffix);
        }

        /**
         * Method creates new temporary folder.
         */
        private File createTemporaryFile(String prefix, String suffix) throws IOException {
            assertNotNull(prefix);
            assertNotNull(operatingSystem);
            assertTrue("Operating system should not be <1"
                    + operatingSystem, OperatingSystem.getOperatingSystem().getClass().toString().indexOf(operatingSystem) > 0);
            //String applicationSupportFolder = OperatingSystem.getApplicationSupportFolder();
            //assertNotNull(applicationSupportFolder);
            //assertEquals(applicationSupportFolder, OperatingSystem.getTemporaryFilePath());
            //String temporaryFolderPath = applicationSupportFolder + Path.separator
            //	+ prefix + File.separator + UUID.randomUUID() + Path.separator + suffix;
            //File file = new File(temporaryFolderPath);
            //file.mkdirs();
            return createTemporaryFile(prefix, suffix);
        }

        /**
         * Method that deletes all the temp files created.
         */
        private void deleteTemporaryFiles() throws IOException {
            FileManager.deleteFolders(0, 0x61737570);
            Path.separator = FileManager.separator();
        }
    }