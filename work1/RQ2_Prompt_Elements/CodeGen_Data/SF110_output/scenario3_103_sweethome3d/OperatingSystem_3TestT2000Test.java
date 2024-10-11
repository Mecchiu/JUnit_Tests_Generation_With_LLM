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
public OperatingSystem_3Test() {
			super();
		}
	/**
	 * Test if Operating Systems is in Lion Leopard or superior.
	 * @throws IOException
	 * @throws MissingResourceException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void testIsMacOSXLeopardOrSuperior() throws IOException, MissingResourceException, ClassNotFoundException {
		File home = File.createTempFile("MacOSXLeopardOrSuperiorTest","");
		File homeDirectory = home.getAbsoluteFile();
		File managerDirectory = home.getAbsoluteFile();
				
		FileManager.removeDirectory(home);
		FileManager.removeDirectory(homeDirectory);
		
		homeDirectory.delete();

		File srcFolder = home.getCanonicalFile();
		File destFolder = homeDirectory;

		FileManager.setDefaultFolder(srcFolder);
		FileManager.setDefaultFolder(destFolder);

		// Create folder "MacOSXLeopardOrSuperior"
		File osxFolder = homeDirectory;
		if ( isMacOSXLeopardOrSuperior() )
			osxFolder = Home.getHome();
		FileManager.createFolder(osxFolder);

		FileManager.setCurrentWorkingDirectory(osxFolder);
		
		// Change home directory to home folder
		FileManager.setCurrentWorkingDirectory(HOME);
		
		// Create folder "home"
		FileManager.createFolder("home");
		
		// Check if home folder is empty
		boolean homeFolderEmpty = home.listFiles().length == 0;
		
		// Check if home is empty 
		assertFalse(homeFolderEmpty);
		

		fileAndFolderInSrc(managerDirectory, homeFolderEmpty, home);
		// Check if home folder has correct size
		int folderSize = home.listFiles().length;
		assertTrue(folderSize == 2);

		FileManager.setCurrentWorkingDirectory(homeDirectory);
		FileManager.setCurrentWorkingDirectory(home);

		// Check if home folder is empty 
		homeFolderEmpty = home.listFiles().length == 0;
		
		// Check if home is empty
		assertTrue(homeFolderEmpty);
		
		fileAndFolderInSrc(managerDirectory, homeFolderEmpty, home);
		
		// Check if home folder has correct size
		int folderSize = home.listFiles().length;
		assertTrue(folderSize == 2);

    	// Check if home directory is not empty
		homeDirectoryEmpty = homeDirectory.listFiles().length == 0;
		
		// Check if home is not empty
		assertTrue(homeDirectoryEmpty);

	}

	private void fileAndFolderInSrc(File inDir, boolean result, File folder) {
    	if ( result ) {
    		try {
    			home = Home.getHome();
    			home.setDirName(folder.getName());
            }
        	catch (Exception e) {
        		// Do nothing
        	}
    		
    		FileManager.addDirectory(folder);

    		FileManager.setDefaultFolder("home");
    		FileManager.getCurrentWorkingDirectory();
    	}
    	else
    	{
    		FileManager.removeDirectory("home");
    		
    		home = Home.getHome();
    	}
		FileUtils utils = new FileUtils();
		utils.changeExtension("jpeg", ".jpeg");
		utils.changeExtension("png", ".png");
		
		FileManager.removeFile("file.jpeg");
		FileManager.removeFile("file.png");

		utils.addFile(folder.getAbsolutePath());
		utils.addFile(folder);

		if ( folder.listFiles()!= null )
			fileManager.updateDirectoryCache(folder.getPath());
		else {
			fileManager.flushLocalCache();
			return ;
		}
		
		utils.clearDirectoryCache();
		fileManager.flushLocalCache();
		
	}

	private final static String HOME = "home";
	private final static String CURRENT_STORAGE_LEVEL = "storageLevel";
	/**
	 * @param args Command-line arguments.
	 * @throws IOException
	 */
	@Test
	public void testOperationFileManager() throws IOException {
		
		Timer timer = new Timer(false);
		FileManager fileManager = FileManager.getFileManager(Home.DEFAULT_UPLOAD_DIRECTORY);
 		
		TimerTask ttask = new TimerTask() {
			
			public void run() {
					
				// System.out.print("[Timer ]: time of " + System.currentTimeMillis() + "... ");
			
				FileManager.addFile("/home/user/foo.jpeg");
				FileManager.removeFile("/home/user/bar.jpeg");
				
				fileManager.flushLocalCache();
        			
				// System.out.print("[Timer ]: time of " + System.currentTimeMillis() + "... ");
			
				
				
				
				
			}
			
		};
	 
		timer.schedule(ttask, 3000);
	 
	}
		



	/**
	 * Returns the default user operating system name
	 */
		
	private static String getOsuSystemProperty() {
        return System.getProperty("os");
        
        
    }
}
