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
		
	static {
		try {
			// Add folder from system's resource sub folder
		    File resourceFile = new File(OperatingSystem_3Test.class.getProtectionDomain().getCodeSource().getLocation().getFile());
		    resourceFile = resourceFile.getParentFile().getParentFile();
		    resourceFile = new File(resourceFile, "../Platform/Resources/");
		    resourceFile = new File(resourceFile, System.getProperty("user.dir"));
		    FileManager.addToSystemFileManager(resourceFile);
		}
		catch (AccessControlException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void isLinux(){
		assertNotNull(OperatingSystem_3Test.LinuxFileManager.getApplicationSupportFolder());
	}



	@Test
	public void isWindows(){
		assertNotNull(OperatingSystem_3Test.WindowsFileManager.getApplicationSupportFolder());
	}
	
	@Test
	public void isMacOSXLeopardOrSuperior(){
		assertNotNull(OperatingSystem_3Test.MacOSXFileManager.getApplicationSupportFolder());
	}

	@Test
	public void isMacOSXLeopardOrSuperior_testFileManager(){
		Timer timer = new Timer("File manager");
		FileManager fileManager = new MacOSXFileManager();
		timer.schedule(new FileManagerTask(fileManager), 10, 1000);
		assertNotNull(fileManager);
	}

	/**
	 * Class that represent a task when operating system manager executes {@link FileManagerTask}.
	 */
	@SuppressWarnings("unchecked")
	private class FileManagerTask implements TimerTask {
		private FileManager fileManager;

		public FileManagerTask(FileManager fileManager){
			this.fileManager = fileManager;
				
		}
		
}
}