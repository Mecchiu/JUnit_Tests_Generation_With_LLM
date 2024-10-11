// OperatingSystem_5Test.java
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_5Test {

		private static final String EDITOR_SUB_FOLDER;

		private static final String APPLICATION_SUB_FOLDER;

		private static final String TEMPORARY_SUB_FOLDER;

		private static final String TEMPORARY_SESSION_SUB_FOLDER;

		static {
				// Retrieve sub folders where is stored application data
				ResourceBundle resource = ResourceBundle.getBundle(OperatingSystem.class.getName());
				if (OperatingSystem.isMacOSX()) {
						EDITOR_SUB_FOLDER = resource.getString("editorSubFolder.Mac OS X");
						APPLICATION_SUB_FOLDER = resource.getString("applicationSubFolder.Mac OS X");
				} else if (OperatingSystem.isWindows()) {
						EDITOR_SUB_FOLDER = resource.getString("editorSubFolder.Windows");
						APPLICATION_SUB_FOLDER = resource.getString("applicationSubFolder.Windows");
				} else {
						EDITOR_SUB_FOLDER = resource.getString("editorSubFolder");
						APPLICATION_SUB_FOLDER = resource.getString("applicationSubFolder");
				}
				String temporarySubFolder;
				try {
						temporarySubFolder = resource.getString("temporarySubFolder");
						if (temporarySubFolder.trim().length() == 0) {
								temporarySubFolder = null;
						}
				} catch (MissingResourceException ex) {
						temporarySubFolder = "work";
				}
				try {
						temporarySubFolder = System.getProperty("com.eteks.sweethome3d.tools.temporarySubFolder", temporarySubFolder);
				} catch (AccessControlException ex) {
						// Don't change temporarySubFolder value
				}
				TEMPORARY_SUB_FOLDER = temporarySubFolder;
				TEMPORARY_SESSION_SUB_FOLDER = UUID.randomUUID().toString();
		}

		// This class contains only static methods
		private OperatingSystem_5Test() {
		}

		/**
		 * Returns <code>true</code> if current operating is Linux.
		 */
		public static boolean isLinux() {
				return System.getProperty("os.name").startsWith("Linux");
		}

		/**
		 * Returns <code>true</code> if current operating is Windows.
		 */
		public static boolean isWindows() {
				return System.getProperty("os.name").startsWith("Windows");
		}

		/**
		 * Returns <code>true</code> if current operating is Mac OS X.
		 */
		public static boolean isMacOSX() {
				return System.getProperty("os.name").startsWith("Mac OS X");
		}

		/**
		 * Returns <code>true</code> if current operating is Mac OS X 10.5
		 * or superior.
		 */
		public static boolean isMacOSXLeopardOrSuperior() {
				// Just need to test is OS version is different of 10.4 because Sweet Home 3D
				// isn't supported under Mac OS X versions previous to 10.4
				return isMacOSX() && !System.getProperty("os.version").startsWith("10.4");
		}

		/**
		 * Returns a temporary file that will be deleted when JVM will exit.
		 * @throws IOException if the file couldn't be created
		 */
		public static File createTemporaryFile(String prefix, String suffix) throws IOException {
				File temporaryFolder;
				try {
						temporaryFolder = getDefaultTemporaryFolder(true);
				} catch (IOException ex) {
						// In case creating default temporary folder failed, use default temporary files folder
						temporaryFolder = null;
				}
				File temporaryFile = File.createTempFile(prefix, suffix, temporaryFolder);
				temporaryFile.deleteOnExit();
				return temporaryFile;
		}

		/**
		 * Deletes all the temporary files created with {@link #createTemporaryFile(String, String) createTemporaryFile}.
		 */
		public static void deleteTemporaryFiles() {
				try {
						File temporaryFolder = getDefaultTemporaryFolder(false);
						if (temporaryFolder != null) {
								for (File temporaryFile : temporaryFolder.listFiles()) {
										temporaryFile.delete();
								}
								temporaryFolder.delete();
						}
				} catch (IOException ex) {
						// Ignore temporary folder that can't be found
				} catch (AccessControlException ex) {
				}
		}

		/**
		 * Returns the default folder used to store temporary files created in the program.
		 */
		private synchronized static File getDefaultTemporaryFolder(boolean create) throws IOException {
				if (TEMPORARY_SUB_FOLDER != null) {
						File temporaryFolder = new File(getDefaultApplicationFolder(), TEMPORARY_SUB_FOLDER);
						final String versionPrefix = Home.CURRENT_VERSION + "-";
						final File sessionTemporaryFolder = new File(temporaryFolder, versionPrefix + TEMPORARY_SESSION_SUB_FOLDER);
						if (!sessionTemporaryFolder.exists()) {
								// Retrieve existing folders working with same Sweet Home 3D version in temporary folder
								final File[] siblingTemporaryFolders = temporaryFolder.listFiles(new FileFilter() {

										public boolean accept(File file) {
												return file.isDirectory() && file.getName().startsWith(versionPrefix);
										}
								});
								// Create temporary folder
								if (!sessionTemporaryFolder.mkdirs()) {
										throw new IOException("Can't create temporary folder " + sessionTemporaryFolder);
								} else {
										sessionTemporaryFolder.deleteOnExit();
								}
								// Launch a timer that updates modification date of the temporary folder each minute
								final long updateDelay = 60000;
								new Timer(true).schedule(new TimerTask() {

										@Override
										public void run() {
												// Ensure modification date is always growing in case system time was adjusted
												sessionTemporaryFolder.setLastModified(Math.max(System.currentTimeMillis(), sessionTemporaryFolder.lastModified() + updateDelay));
										}
								}, updateDelay, updateDelay);
								if (siblingTemporaryFolders != null && siblingTemporaryFolders.length >