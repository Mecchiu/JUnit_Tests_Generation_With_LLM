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
		
	private static final String EDITOR_SUB_FOLDER;

	private static final String APPLICATION_SUB_FOLDER;

	private static final String TEMPORARY_SUB_FOLDER;

	private static final String TEMPORARY_SESSION_SUB_FOLDER;

	static {
		// Load the System Property that stores the temp folder string as name of a file
		ResourceBundle bundle = ResourceBundle.getBundle("org.junit.jupiter.api.Test.Resources");
		String tempFolderString = bundle.getString("TEMP_PATH");

		if (tempFolderString == null) {
			throw new MissingResourceException("You must set a temp folder in the system property", "TEMP_PATH", "org.junit.jupiter.api.Test");
		}

		// Use a temporary folder with the default name
		String tempDirectory = FileManager.getTempFolderDir();
		File folder = new File(tempFolderString);

		// Check if we have a unique temporary folder
		if (!folder.exists() && folder.mkdirs() && folder.isDirectory()) {
            Log.verbose("Got an unique temporary directory. Creating one.", "test-root");
			// Store the temp folder in the System properties and create a unique temporary folder
			String tempFolderString2 = System.getProperty("TEMP_PATH");
			if (tempFolderString2!= null) {
            Log.verbose("Got a temp folder, calling System.setProperty.", "temp-folder");
				// Load the System Property that stores the temp folder name as name of a file
				ResourceBundle bundle1 = ResourceBundle.getBundle("org.junit.jupiter.api.Test.Resources");
				tempFolder = new File((String)bundle1.getString("TEMPDIR"));
				// Call the setProperty method with the real temp folder name
                FileManager.setProperty(tempFolder, "TEMP_PATH", tempFolderString2);
			}
			// Create and launch the file manager
			if (tempFolder.exists()) {
            Log.verbose("Got a unique folder, creating a valid temporary folder.", "test-root");
				// Create and launch the File Manager client
				FileManager.launchApplication(tempFolder.getAbsolutePath(), true);
            Log.verbose("File manager started  in", "test-root");
			} else {
                throw new IOException("The temporary folder was not created or already exists.");
			}
		} else {
			throw new IOException("Could not create a unique temporary folder");
		}
		EDITOR_SUB_FOLDER = FileManager.getUniqueEditorDir().getAbsolutePath();
		APPLICATION_SUB_FOLDER = FileManager.getUniqueApplicationDir().getAbsolutePath();
		TEMPORARY_SUB_FOLDER = FileManager.getUniqueTempDir(true).getAbsolutePath();
		TEMPORARY_SESSION_SUB_FOLDER = FileManager.getUniqueTempDir(true).getAbsolutePath();
	}

	@Test
    public void testIsLinux() throws IOException {
        Log.verbose("Is a Linux system");
        assertFalse(Runtime.getRuntime().online());

        //Check that we find the file Manager class in classpath
        FileManager fileManager = new FileManager();
        fileManager.launchApplication("com.apple.eio.FileManager", true);
        assertNotNull(fileManager);

}
}