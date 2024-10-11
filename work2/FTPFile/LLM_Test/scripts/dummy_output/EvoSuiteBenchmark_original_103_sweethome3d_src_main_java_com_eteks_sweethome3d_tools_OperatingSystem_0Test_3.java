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
		static {
                // Explicitly initialize the class and resource bundle
                // as we will be invoking the methods of this class directly
				ResourceBundle r = OperatingSystem_0Test.class.getResourceBundle(null);
				((FileManager) r.get("fileManager"))
                   .putString(UUID.randomUUID().toString(), "");
        }

		/**
        * Test of isLinux method, of class OperatingSystem.
        */
        @Test
        public void testIsLinux() throws IOException {
            SystemInfo.instance().setMacOSX();
            SystemInfo.instance().setLinux();
            assertTrue(OperatingSystem.isLinux());
        }
        
        /**
        * Test of isWindows method, of class OperatingSystem.
        */
        @Test
        public void testIsWindows() throws IOException {
            SystemInfo.instance().setMacOSXLeopardOrSuperior();
            SystemInfo.instance().setLinux();
            assertTrue(OperatingSystem.isWindows());
        }

        /**
        * Test of isMacOSX method, of class OperatingSystem.
        */
        @Test
        public void testIsMacOSX() throws IOException {
            SystemInfo.instance().setMacOSXLeopardOrSuperior();
            assertFalse("Windows system already loaded", OperatingSystem.isMacOSXLeopardOrSuperior());
            SystemInfo.instance().setLinux();
        }

        /**
        * Test of isMacOSXLeopardOrSuperior method, of class OperatingSystem.
        */
        @Test
		public void testIsMacOSXLeopardOrSuperior() throws IOException {
            SystemInfo.instance().setMacOSXLeopardOrSuperior();
            assertTrue("Windows system already loaded", OperatingSystem.isMacOSXLeopardOrSuperior());
        }


        /**
        * Test of createTemporaryFile method, of class OperatingSystem.
        */
        @Test
        public void testCreateTemporaryFile() throws IOException{
            File temp = OperatingSystem.createTemporaryFile("", "");
            SystemInfo.instance().setMacOSX();
            assertNotNull("Could not retrieve temporary folder for Mac OS X", temp);
        }

        /**
        * Test of deleteTemporaryFiles method, of class OperatingSystem.
        */
        @Test
        public void testDeleteTemporaryFiles(){
            File temp = OperatingSystem.createTemporaryFile("", "");
            SystemInfo.instance().setMacOSX();
            assertNotNull("Could not retrieve temporary folder for Mac OS X", temp);
            Utilities.remove(temp);
            Utilities.remove(temp);
        }
 
 
	}// OperatingSystem_0Test