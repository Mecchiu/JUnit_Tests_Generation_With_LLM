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
		
    private final File homeFolder, desktopFolder, appSupportFolder;
    
    /**
     * Test method for {@link OperatingSystem#isMacOSX()}.
     * Test the existence of Apple OS X specific folder of the application user, 
     * and its associated resources folder.
     * TODO: Implement the test.
     */
    @Test
    public void isMacOSX_2_Test() throws InterruptedException, IOException {
        
        // Get the resource folder of the application user, containing files
        // of OS X specific folders and the contents of some other content of files.
        File resourcesFolder = new File(FileManager.findFolder("Mac OS X", 0x61737570));
        File file = new File(resourcesFolder, "Application User");

        String resourceFolder = "com.eteks.sweethome3d.tools.OperatingSystem_2_Test";
        String content = FileManager.contentOfFile(file, resourceFolder); 

        // Check if this content already exists!
        File existingFile = new File(content);
        assertTrue(ExistValidApplicationFile.isValidApplicationFile(existingFile));

        // Get folder containing file with correct content
        File resourceFolderContentsFile = new File(resourceFolder);

        // Check if proper folder contents exist
        assertTrue(resourceFolderContentsFile.exists());

        // Return if this test succeeds!
        assertTrue(ExistValidApplicationFile.areFileContentsTheSame(existingFile, resourceFolderContentsFile));

        // Check if proper content exists in this folder
        assertTrue(new File(resourceFolder, "Application User").exists());

        // Check if proper contents and folder for file exist
        assertTrue(new File(content).exists());
        assertTrue(new File(resourceFolder, "Application User").exists());
	
        // Delete the folder structure
        // Delete the file contents folder
        FileManager.deleteFile(file);
        File resourceFolderContentsFile = new File(resourceFolder);
        assertTrue(resourceFolderContentsFile.exists());
        FileManager.deleteFile(resourceFolderContentsFile, resourceFolder);
        assertFalse(resourceFolderContentsFile.exists());	

        // Check if resources folder for this test is empty
        resourceFolderContentsFile = appSupportFolder.listFiles(new MacOSXFileFilter());
        assertEquals(resourceFolderContentsFile.length(), 0);
        
        // Stop the timer and delete file when the test ends!
        Log.logDebug("End test");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                Log.logDebug("Cleaning up temporary files");
                FileManager.recursiveDelete(tempFileFolder());
                FileManager.recursiveDelete(desktopFolder());
                Log.logDebug("Done");
            }
        };
        timer.schedule(task, 0, 100);
        // This code will block until all the files will be deleted
        timer.cancel();	
        task.cancel();
        
        // Check contents of folder for file and folder are not identical
        FileManager.recursiveDelete(appSupportFolder.listFiles(new MacOSXFileFilter()));
        assertFalse("App support folder should contain new content!", ResourceUtils.newResourceUtils().areFileContentsTheSame(
                appSupportFolder, content));
        assertFalse("Contents folder should be empty!", appSupportFolder.listFiles(
                new MacOSXFileFilter()).length!= 0);
    }
}

/**
 * File filter to only contain file that have extension '.log' or
 * anything that is below.
 * The '.log' extension implies that the file contains the text
 * log message of some operating system.
*/
class MacOSXFileFilter extends FileFilter {

    @Override
    public boolean accept(File file) {
        String fileName = file.getName();
        String lowerCaseFileName = fileName.toLowerCase();
        for (String suffix : new String[]{"log", ".log"}) {
            if (fileName.endsWith(suffix)) {
                return true;
            }
        }
        return lowerCaseFileName.endsWith("log");
    }
}
	
/**
 * Test class for {@link OperatingSystem#isWindows()}.
 * Test case for a file that has extension ".log" and then a file that contains nothing except for "log".
*/
class WindowsLog {

	/**
	 * Test method for {@link OperatingSystem#isWindows()}.
	 * Test case for a file that has extension ".log" and then a file that contains nothing except for "log".
	 */
}