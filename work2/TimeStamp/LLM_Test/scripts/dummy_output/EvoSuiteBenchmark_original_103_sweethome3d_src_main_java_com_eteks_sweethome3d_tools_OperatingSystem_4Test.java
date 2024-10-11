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
		static final ThreadLocal<Home> home = new ThreadLocal<Home>();
		
		@Test
		void getDefaultApplicationFolderTest01() {
			assertNotNull(getDefaultApplicationFolder());
		}

		@Test
		void getDefaultApplicationFolderTest02() {
			Home testHome = home.get();
			assertEquals("foo.com", testHome.getProperty("Foo.com"));
		}
		
		@Test
		void getDefaultApplicationFolderTest03() {
			Home testHome = home.get();
			ResourceBundle props = new ResourceBundle() {

				@Override
				protected Object handleGetObject(String key) {
					Object value = super.handleGetObject(key);
					assertTrue(value instanceof File);
					return value;
				}
			};
			assertEquals("file.path", testHome.getProperty("File.path"));
			assertEquals("file.properties", testHome.getProperty("File.properties"));
			assertEquals("file.txt", testHome.getProperty("File.txt"));
		}
		
		@Test
		void getDefaultApplicationFolderTest44() throws IOException {
			assertNotNull(getDefaultApplicationFolder());
		}


		@Test
		void deleteTempFolderTest01() {
			File tmpFolder = createTemporaryFile("tmpFolder", TEMPORARY_FILE_SUFFIX);
			assertNotNull("createTemporaryFile failed", tmpFolder);
			
			// This test does not work as we delete old sub folders without
			// the above test.  Instead we just delete empty sub folder and keep it
			assertFalse("Could not clean temporary folder", tmpFolder.exists());
    	}
    
    	@Test
    	void deleteTempFolderTest02() throws IOException {
    		File tmpFolder = createTemporaryFile("tmpFolder", TEMPORARY_SUB_FILE_SUFFIX);
    		assertNotNull("createTemporaryFile failed", tmpFolder);
    		
    		assertTrue("Could not delete temporary folder", tmpFolder.exists());
    	}
    	
    	@Test
    	void deleteTempFolderTest03() {
    		File tmpFolder = createTemporaryFile("tmpFolder", TEMPORARY_SUB_FILE_SUFFIX);
    		assertNotNull("createTemporaryFile failed", tmpFolder);
    		assertTrue("Could not delete temporary folder", tmpFolder.exists());
    		
    		try {
				tmpFolder.delete();
			} catch (SecurityException e) {
				// Do nothing and the test succeeded.
			}
    		assertFalse("Could not delete temporary folder", tmpFolder.exists());
    	}

    	@Test
    	void deleteTempFolderTest05() {
    		assertTrue("Unable to delete temporary folder",
				!FileManager.exists(new File(getDefaultTemporaryFolder().getAbsolutePath(), TEMPORARY_SUB_FOLDER)));
    	}


		@Test
		void deleteTempFolderTest06() throws IOException {
			File tmpFolder = createTemporaryFile("tmpFolder", TEMPORARY_SUB_FILE_SUFFIX);
			assertNotNull("createTemporaryFile failed", tmpFolder);
			assertTrue("Could not delete temporary folder", tmpFolder.exists());
			
			assertTrue("Could not delete temporary folder", 
					FileManager.exists(new File(tmpFolder.getAbsolutePath(), TEMPORARY_SUB_FOLDER)));
			
			assertTrue("Could not delete temporary folder",
					FileManager.exists(new File(getDefaultTemporaryFolder().getAbsolutePath(), tmpFolder)));
			
			try {
				FileManager.deleteFile(tmpFolder);
			} catch (AccessControlException e) {
				// This is a temporary error, so it should just fail.
			} 

			assertFalse("Could not delete temporary folder", 
					FileManager.exists(new File(tmpFolder.getAbsolutePath())));
			assertFalse("Could not delete temporary folder",
					FileManager.exists(new File(getDefaultTemporaryFolder().getAbsolutePath())));
		}
		
		@Test
		void isMacOsXTestTest01() throws IOException {
			assertFalse(isMacOSX());
		}

		@Test
		void isMacOsX() {
			assertFalse(isMacOSX());
			assertTrue(isLinux());
			assertTrue(isWindows());
            
            assertTrue(isWindows());
        }
}