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
	 * This unit test checks the {@link OperatingSystem#isMacOSX()} method.
	*/
	@Test
	public void testIsMacOSX() {
		
		check(isMacOSX(), 2);
	}
	
	/**
	 * This unit test checks the {@link OperatingSystem#isWindows()} method.
	 */
	@Test
	public void testIsWindows() {
		
		check(isWindows(), 2);
	}
	
	/**
	 * This unit test checks the {@link OperatingSystem#isLinux()} method.
	 */
	@Test
	public void testIsLinux() {
		
		check(isLinux(), 2);
	}
	
	/**
	 * Check if the specified operating system has a default working directory.
	* This method checks if the default working dir is not already set for current user.
	*/
	private static boolean check(boolean useDefaultWorkingDir) {
		File defaultWorkingDir = getDefaultWorkingDirectory(useDefaultWorkingDir);
		if (useDefaultWorkingDir && defaultWorkingDir == null) {
			return false;
		} else {
			return defaultWorkingDir!= null;
		}
	}
	
}