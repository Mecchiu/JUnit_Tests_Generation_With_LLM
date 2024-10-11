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
		
	@Test
	public void isMacOSXLeopardOrSuperior() throws IOException, ResourceBundle.MissingResourceException {

		final OperatingSystem thisOS = OperatingSystem.getInstance();

		assertNotNull(thisOS);
		assertNotNull(thisOS.getApplicationSupportFolder());
		assertNotNull(thisOS.getDefaultApplicationFolder());
		assertNotNull(thisOS.getDefaultTemporaryFolder(false));
		
		System.out.format("This OS: '%s' is operating under Mac OS X.\n", thisOS.toString());
		// No default folder.
		
		assertEquals(false, thisOS.isMacOSXLeopardOrSuperior());
		assertEquals(true, thisOS.isWindows());
		
		assertEquals(false, thisOS.isWindows());
		assertEquals(false, thisOS.isMacOSXLeopardOrSuperior());
		
		assertEquals(false, thisOS.isWindows());

		// Check home folder with only one folder inside it.
		thisOS.getHome();
		assertEquals(true, thisOS.isWindows());
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());
		
		assertEquals(true, thisOS.isWindows());		
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());
		
		// Check home folder with folder named "Application Settings".
		assertNotNull(thisOS.getApplicationSupportFolder());
		assertEquals(true, thisOS.isWindows());
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());
		
		assertEquals(true, thisOS.isWindows());
		
		// Check home folder with only root folder inside it.
		assertNotNull(thisOS.getDefaultApplicationFolder());
		assertNotNull(thisOS.getTempFolder(true));
		assertEquals(true, thisOS.isWindows());
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());
		
		assertEquals(true, thisOS.isWindows());		
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());		

		assertEquals(false, thisOS.isMacOSXLeopardOrSuperior());
		assertEquals(false, thisOS.isWindows());

		// Check home folder with single file inside it.
		thisOS.getTempFolder(true);
		assertNotNull(thisOS.getApplicationSupportFolder());
		assertNotNull(thisOS.getTempFolder(true));
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());

		// Check home folder with only 1 folder inside it.
		assertNotNull(thisOS.getDefaultTemporaryFolder(true));
		assertNotNull(thisOS.getTempFolder(true));
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());
		
		// Check home folder with only root folder inside it.
		assertNotNull(thisOS.getDefaultApplicationFolder());
		assertNotNull(thisOS.getTempFolder(true));
		assertEquals(true, thisOS.isMacOSXLeopardOrSuperior());		

		assertEquals(false, thisOS.isNative());
		
		assertEquals(false, thisOS.isNative());
		
		// No default folder.
		
		// No application folder.
		
		// No home folder.
		
		// No temp folder.
	}


}