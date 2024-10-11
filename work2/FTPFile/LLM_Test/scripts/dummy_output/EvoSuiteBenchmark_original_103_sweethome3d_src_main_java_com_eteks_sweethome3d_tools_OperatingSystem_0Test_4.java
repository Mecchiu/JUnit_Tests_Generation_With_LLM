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
		
	/**
	 * Tests if OperatingSystem.isLinux() returns <code>true</code> for linux
	 * family.
	* @throws ClassNotFoundException if any of class can't be loaded
	*/
	@Test
	public void isLinux() throws ClassNotFoundException{
		
		// Getting a system property which is required
		java.lang.System.setProperty(MacOSXFileManager.MACOSX_APPLICATION_FOLDER_PROPERTY, "/Applications");
		
		// Testing isLinux
		assertTrue(OperatingSystem.isLinux());
	}
	/**
	 * Tests if OperatingSystem.isLinux() returns <code>false</code> for windows
	 * family.
	* @throws ClassNotFoundException if any of class can't be loaded
	*/
	@Test
	public void isWindows() throws ClassNotFoundException{
		
		// Getting a system property which is required
		java.lang.System.setProperty(MacOSXFileManager.MACOSX_APPLICATION_FOLDER_PROPERTY, "/Applications");
		
		// Testing isWinnt
		assertFalse(OperatingSystem.isWindows());
	}


		/**
	 * Tests if OperatingSystem.isWindows() returns <code>true</code> for system with no JVM
	*/
	@Test
	public void isWindowsNoJVM () throws ClassNotFoundException{
		
		// Getting a system property which is required
		java.lang.System.setProperty(MacOSXFileManager.MACOSX_APPLICATION_FOLDER_PROPERTY, "");
		
		// Testing isWindows
		assertTrue(OperatingSystem.isWindows());
	}

		/**
	 * Tests if OperatingSystem.isWindows() returns <code>false</code> for system with a JDK6.4
	*/
	@Test
	public void isWindowsJDK6() throws ClassNotFoundException{
		
		// Getting a system property which is required
		java.lang.System.setProperty(MacOSXFileManager.MACOSX_APPLICATION_FOLDER_PROPERTY, "lib:/usr/lib/amd64");
		
		assertFalse(OperatingSystem.isWindows());
	}

	/**
	 * Tests if OperatingSystem.isWindows() returns <code>true</code> for system with an unknown JDK
	*/
	@Test
	public void isWindowsUnknownJDK() throws ClassNotFoundException{
		
		// Testing isWindows
		assertFalse(OperatingSystem.isWindows());
	}
	
/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperatingSystem[" +
			"!isLinux() ==!!"+isLinux()+","+
			!isWindows()+","+
			!isWindowsJDK()+
			"]";
	}

		/**
	 * Tests if OperatingSystem.getTemporaryFile() returns new instance of {@link
	 * java.io.File File} with given name which exists and have {@link
	 * File.Path#exists() == true}.
	* @throws ClassNotFoundException if any of class can't be loaded
	*/
	@Test
	public void getTemporaryFile() throws ClassNotFoundException, InstantiationException {
		
		try{
			// Gets the system property and checks if required name exists
			String name = System.getProperty(MacOSXFileManager.MACOSX_APPLICATION_FOLDER_PROPERTY);

			// The expected filename has prefix "tmp" and the folder can contain
			// files and sub-folders if exists
			fileExists(File.pathSeparatorChar + "tmp" + File.pathSeparatorChar + name, "/tmp");
			fileExists(File.pathSeparatorChar + "/tmp" + File.pathSeparatorChar + name, "/tmp");
			fileExists(File.pathSeparatorChar + "tmp" + File.pathSeparatorChar + name + File.pathSeparatorChar + "/tmp", "/tmp");
			fileExists(File.pathSeparatorChar + "/tmp" + File.pathSeparatorChar + name + File.pathSeparatorChar + "/tmp", "/tmp");
		} catch (FileManagerException e) {
			throw new RuntimeException("Exception while creating " + "temporary files", e);
		}
	}

}