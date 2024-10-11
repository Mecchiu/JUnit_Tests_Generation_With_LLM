// OperatingSystem_4Test.java
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
* It contains one unit test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {
public OperatingSystem_4Test() throws IOException {
		}
		/**
		* Returns default application folder.
		*/
		private static File getDefaultApplicationFolder() throws IOException {
		String s_default_app_folder_name;
		s_default_app_folder_name = "";
		try {
			s_default_app_folder_name = FileManager.extractPropertyFromPath("/Library/Frameworks/";
			FileManager.getFileManager().getConfiguration().setLocationOfExecutableFolder("Library");
			} catch (FileManager.FileManagerException e) {
			assertEquals(FileManager.FileManagerExceptionType.FILE_MGR_ERROR, e.getExceptionType());
			e.printStackTrace();
			throw new AccessControlException("Not allow creating user folder " + s_default_app_folder_name);
			} catch (IOException e) {
			FileManager.getFileManager().getConfiguration().setLocationOfExecutableFolder("/usr");
			} catch (Resources.MissingResourceException e) {
			FileManager.getFileManager().getConfiguration().setLocationOfExecutableFolder("/usr");
			}
			s_default_app_folder_name = "/usr";
		}
		private static File getUserAppDataFolder() throws IOException {
		String s_user_AppData_folder_name;
		s_user_AppData_folder_name = "/Library/";
		return new File(s_user_AppData_folder_name);
		}
	

	/**
	* Returns default system folder.
	* NOTE: There is no built-in default folder in the folder. It is defined by the 
	* environment variable "HOME".
	*/
	@Test
	public void getDefaultApplicationFolder() throws IOException {
		File g_user_DesktopFolder = getUserAppDataFolder();
		File result_DesktopFolder = new OperatorSystem_4Test().OperatingSystem().getDefaultApplicationFolder();
		assertEquals(result_DesktopFolder.getPath(), g_user_DesktopFolder.getPath());
	}
}