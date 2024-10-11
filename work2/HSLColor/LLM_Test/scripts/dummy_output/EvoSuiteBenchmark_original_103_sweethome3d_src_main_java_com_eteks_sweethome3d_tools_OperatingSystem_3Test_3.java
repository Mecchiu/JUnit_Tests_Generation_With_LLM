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
     * Test for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
     */
	@Test
    void isMacOSXLeopardOrSuperior() throws IOException {
		
		// Create a new OperatingSystem object
		System.setProperty("java.library.path", "sun:/");
		OSMOperatingSystem operatingSystem = new OSOperatingSystem();
		
	    // Check if Mac OS X is leopard
    	assertTrue(operatingSystem.isMacOSXLeopardOrSuperior());
   
    	// Remove the previous path
    	String osXPath = System.getProperty("java.library.path");
    	System.setProperty("java.library.path", osXPath.replace("sun:/",""));
    	
    	// Remove Java Runtime Environment jar
		File path = new File(FileManager.getApplicationSupportFolder(), "javaRuntime");
		if (path.exists()) {
			path = new File(path, "javaRuntime.jar");
			File[] listPath = path.listFiles();
			for(File f : listPath) {
				if (f.getName().endsWith("Jar")) {
					System.out.println("Removing jar: " + f.getName());
					f.delete();
				}
			}
		}
		
		// Check if Java Runtime Environment jar was removed
		if (path.exists()) {
			System.out.println("Java Runtime Environment jar not removed. Please remove previous path setting.");
		} else {
			System.out.println("Java Runtime Environment jar not removed");
		}
		
	}
}