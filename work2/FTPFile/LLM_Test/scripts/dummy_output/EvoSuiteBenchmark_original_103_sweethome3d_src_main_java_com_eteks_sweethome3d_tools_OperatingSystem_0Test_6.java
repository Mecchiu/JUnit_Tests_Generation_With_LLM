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
		private static final String TEST_MESSAGES_FOLDER = "testMessages";

		private static Home home = new Home("Test");


	@Test
	public void getOperatingSystem() {
		assertEquals("Linux", OperatingSystem.isLinux());

	}

	@Test
	public void createTempFolder() throws IOException {
		// Creates a temporary folder and checks the existence
		File folder = OperatingSystem.createTemporaryFolder(true);
		assertNotNull(folder);
		assertTrue(!folder.exists());
		assertTrue(folder.mkdir());
		assertTrue(folder.isDirectory());
		assertEquals(true, folder.exists());
	}

	@Test
	public void deleteTempFiles() throws IOException {
		// Deletes all the temporary files created by OperatingSystem.
		// This will make Windows-only operating system to behave
		// differently, so the files won't be deleted.
		// For example Windows users can run code on the file manager
		// that access to this property is Windows specific as MacOSXFileManager
		// doesn't have permissions to write to it.
		for (File file : OperatingSystem.getDefaultTemporaryFiles(false)) {
			file.delete();
		}
	}
	/**
	 * Returns a list of the operating system specific temporary folders
	 * that exist and are created by Operating System.
	 * @return a List of File objects
	 */
	private List<File> getDefaultTemporaryFiles(boolean create) throws IOException {
		List<File> list = new ArrayList<>();
		getDefaultTemporaryFolder(create);
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.FILE));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.APPLICATION_SUB_FOLDER, FileFileFilter.FILE));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TMP_SUB_FOLDER, FileFileFilter.FILE));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_FOLDER, FileFileFilter.FILE));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_FOLDER, FileFileFilter.FILES_AND_DIRS));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_FOLDER, FileFileFilter.FILE));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_FOLDER, FileFileFilter.DIRS));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_SUB_FOLDER, FileFileFilter.DIR_AND_SUB_SUB_FOLDER));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_SUB_SUB_FOLDER, FileFileFilter.SUB_FOLDER));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_SUB_SUB_SUB_FOLDER, FileFileFilter.FOLDER));
		list.addAll(FileManager.getFiles(TEMPORARY_SUB_FOLDER, FileFileFilter.TEMP_SUB_SUB_SUB_SUB_SUB_SUB_FOLDER, FileFileFilter.FOLDERS));

        return list;
    }
    /**
	 * @todo: make it better to create an instance each time this is called.
	 *       Should also create the message bundle
	 */
	private ResourceBundle getMessages() {
		if (TEST_MESSAGES_FOLDER == null) {
			throw new IllegalStateException("Messages folder is required by Operating Systems class");
		}
		ResourceBundle bundle = ResourceBundle.getBundle(
                TEST_MESSAGES_FOLDER,
                Thread.currentThread().getContextClassLoader()
		);
		return bundle;
	}

}