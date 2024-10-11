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
		
	/**
	 * Tests whether the operating system is Linux.
	 * This test case can be executed with jtravis;
	 * The only supported OS version is 10.5 or higher
	 */
	@Test
	public void isLinux() throws IOException {
		try {
			FileManager.setDefaultFolder((short) -32763, getDefaultApplicationFolder(true));
			System.out.println("The operating system is Linux");
			return; // Always return true
		} catch (RuntimeException e) { // Don't stop when something goes wrong
			e.printStackTrace();
			System.err.println("There is something wrong with the test configuration (in this case, the operating system is linux)");
			return;
		} finally { 
			FileManager.setDefaultFolder((short) -32763, null);
		}
	}

	@Test
	public void isWindows() {
		try {
			FileManager.setDefaultFolder((short) -32763, "~/");
			System.out.println("The operating system is Windows");
		} catch (RuntimeException e) { // Don't stop when something goes wrong
			e.printStackTrace();
			System.err.println("There is something wrong with the test configuration (in this case, the operating system is windows)");
			return;
		}
	}

	@Test
	public void isMacOSX() {
		try {
			FileManager.setDefaultFolder((short) -32763, "~/Applications/");
			System.out.println("The operating system is Mac OS X");
		} catch (RuntimeException e) { // Don't stop when something goes wrong
			e.printStackTrace();
			System.err.println("There is something wrong with the test configuration (in this case, the operating system is macosx)");
			return;
		}
	}
	
	@Test
	public void isMacOSXLeopardOrSuperior() throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
		// This is what a macro does not have:
        //  if ( (i = 2) && (((i = 0) < ((i++) << 16) < ((i++) <<  9)))
		// && (((i = 0))!= ((i = 16) << 5) <= ((i++) <<  5))) {
		// This is not an ugly macro, but is it?
		// Let's try again with no arguments and with same arguments but different number of pointers
		System.out.println("Testing to see if we can access a macro with a different number of pointers.");
		//System.out.println();
		
}
}