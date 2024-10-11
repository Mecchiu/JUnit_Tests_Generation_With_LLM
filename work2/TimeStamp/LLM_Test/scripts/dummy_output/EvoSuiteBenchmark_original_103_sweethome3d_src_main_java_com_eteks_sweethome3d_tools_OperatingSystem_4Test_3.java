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
		
	/**
	* Checks if current operating system is Mac OS X 10.5 or superior.
	* @throws IOException any I/O exception
	*/
	@Test
	public void checkMacVersionTester() throws IOException{
		assertNotNull(OperatingSystem.getMacVersion()); // ensure check if Mac OS X was compiled from SDK 1.5 or later
		assertTrue(OperatingSystem.getMacVersion().startsWith("10.5u")); // check if major version number of the OS is equal to 10.5

		//Check if SDK versions before 10.5 are older than 10.5t.9
		//(if SDKs are older than 10.5t, an error would occur)
		File tmp = OperatingSystem.getDefaultApplicationFolder();
		tmp = OperatingSystem.getDefaultApplicationFolder();
		File tmpNew = OperatingSystem.createTemporaryFile(".tmp", "");
		assertNotNull(tmpNew);
        tmpNew = tmp;
        FileManager.deleteAll(tmpNew);
        FileManager.createFolder(tmpNew);
        File tmpCompatibility = OperatingSystem.createTemporaryFolder("com.apple.lib", "");
        FileManager.deleteAll(tmpCompatibility);
        FileManager.createFolder(tmpCompatibility);
        FileWriter fw = new FileWriter(tmpCompatibility);
        fw.write("<?xml version=\"1.0\" encoding=\"Windows-1252\"?>\n<SystemRoot xmlns=\"urn:schemas-microsoft-com:office:office\" pathStart=\"/lib\" />\n");
        fw.close();
		assertNotNull(tmpCompatibility);
		tmpCompatibility = tmpNew;
		tmpCompatibility = tmpCompatibility.getParentFile();
	}


}// OperatingSystem_4Test.java