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
		
	static {
        // Force compilation of ResourceBouncer, because it uses classloader by default.
		// Resource Bouncer cannot be used together: it causes a link error so we have to manually set it.
		ResourceBundle bundle = ResourceBundle.getBundle(OperationSystem.class.getName()+".resources.UTF-8");
		FileManager.setResourceLoader(bundle);
		
		// This class will run each time System.loadLibrary will be called.
		// It needs the file manager, which is also loaded when calling loadLibrary
		System.loadLibrary("android");
	}

	
	/**
	* Test empty constructor.
	*/
	
	int noopOpens;
	
	/**
	* Test isMacOSX method.
	*/

	public static void isMacOSX() throws IOException, AccessControlException, InterruptedException, IOException, ClassNotFoundException {
		try {
			new OperatingSystem();
			fail();
		} catch (Exception e) {
			assertInstanceOf(IOException.class, e.getCause());
		}
	}

	private OperatingSystem() throws IOException, ClassNotFoundException, MissingResourceException {
		// Create File manager
		System.setProperty("apple.data_direction", "heap");
		FileManager manager = new FileManager("os/home/home1");
		manager.ensureRoot();

		String userDataDir;
		if (AccessControlException.class == Class.forName("com.apple.eio.FileManager.FileManagerException").getClass()) {
			// We assume that there won't be any issues with user data directory.
		} else {
			// We assume that the user home directory may be different from the
			// application data directory. For the moment it's not.
		}

		File homePath;
		homePath = manager.getHomePath();
		UUID u1 = UUID.randomUUID();
		System.setProperty("os.system-user-dir", homePath.getParentFile().getAbsolutePath());
		System.setProperty("os.system-home-dir", "/home/data");
		userDataDir = System.getProperty("os.system-user-data");

		File tempFolder = createTemporaryFolder("");
		createTemporaryFile("", ".appdata");
		
		File tempSessionsFolder = createTemporaryFolder("");
		createTemporaryFile("", ".session");
		
	// TODO test if this is still used in a real program
		homePath.mkdir();
		
		File tempApplicationFolder = createTemporaryFolder("application");
		File tempApplicationSettingsFolder = createTemporaryFolder("app-settings");
		File tempApplicationDataFolder = createTemporaryFolder("app-data");
		createdFiles = createApplicationDataFolder().mkdir();
		createdFiles = createApplicationDataFolder().mkdir();
		
	// TODO test if this is still used in a real program
		homePath.mkdir();
		
		createdFiles = homePath.mkdir();
	// TODO test if this is still used in a real program
		homePath = homePath.mkdir();
		createdFiles = homePath.mkdir();
		
	// TODO test if this is still used in a real program

		FileManager.setResourceLoader(manager);
		
		new File(userDataDir).mkdir();
		new File(tmpApplicationFolder).mkdir();
		
		homePath.mkdir();
	
		System.setProperty("os.system-home-dir", homePath.getAbsolutePath());

		// This method was deprecated. The main problem it is about is that
		// the FileManager returned by the constructor doesn't have the
		// necessary system properties set. This can cause problems in case
		// of a crash within a user application as there is no way
		// to get the original classloader.
		// The alternative is to call  systemClassLoader.getClass().toString(),
		// but it doesn't do anything...

		byte[] bytes = manager.getClassloader().toByteArray();
		String classText = new String(bytes);
		File applicationDataFolder = new File(
		    "application-data:" + 
		        userDataDir);
		
		// The following is in case of a crash during testing.
		// I want to be safe and leave any other problems, though
}
}