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
// OperatingSystem.java
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

/**
 * Tools used to test current user operating system.
 *
 * @author Emmanuel Puybaret
 */
public class OperatingSystem {

    /**
     * Returns <code>true</code> if current operating is Mac OS X 10.5
     * or superior.
     */
    public static boolean isMacOSXLeopardOrSuperior() {
        // Just need to test is OS version is different of 10.4 because Sweet Home 3D
        // isn't supported under Mac OS X versions previous to 10.4
        return isMacOSX() &&!System.getProperty("os.version").startsWith("10.4");
    }
}

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
		
	/**
	 * Returns <code>true</code> if current operating is Mac OS X Leopard or newer.
	 */
	private boolean isMacOSX() {
		FileManager flm;
		try {
			flm=FileManager.getInstance();
			FileManager filesDir=flm.getFilesDir();
			return filesDir.exists() && isFile(filesDir, "macosxleopard");
		} catch (IOException e) {
            e.printStackTrace();
		}
		return false;
	} 
	
	/**
	 * Returns <code>true</code> if given File exists.
	 */
	private static boolean isFile(File flDir, String file){
		String fPath=flDir.getCanonicalPath()+"/"+file;
		File fileOrDir=new File(fPath);
		return fileOrDir.exists();
	}
	
	/**
	 * Returns <code>true</code> if <code>file</code> is of {@link FileFilter} {file}.
	 */
	private static boolean isFile(File flDir, String file, FileFilter f) {
		String fPath=flDir.getCanonicalPath()+"/"+file;
		File fileOrDir=new File(fPath);
		return f.accept(flDir, fileOrDir);
	}
	
	/**
	 * Launches OperatingSystem.init() function. Called from
	 * {@link OperatingSystem#testFile(String, String, boolean)}.
	 */
	private void executeInit(){
		// The current working directory
		String w=System.getProperty("user.dir");
		
		// The home file
		File fl=new File("/Users/egodin/SWEET_ENVD_3D/Home.home");
		assertTrue(fl.exists());
		Home home=Home.getFile(fl);
		
		try {
			// The current working directory is MacOSX
			String wc=new File("/Users/egodin/SWEET_ENVD_3D/Working_Directory").getCanonicalPath();
			assertEquals("/Users/egodin/SWEET_ENVD_3D/Working_Directory", w);
			assertTrue(home.exists() && home.getFileManister().canRead() && home.getFileManister().canWrite());
		} catch (IOException e) {
			e.printStackTrace();
			fail("Unable to change to working directory.");
		}
		System.out.println("Starting up OS.");
		try {
			// Create directory manually under /Users/egodin and set permissions
			File flt=new File("/Users/egodin/SWEET_ENVD_3D/Temp");
			Home home=Home.getFile(flt);
			home.setPermissions(0755);
			// Create file under /Users/egodin
			File fl=new File("/Users/egodin/SWEET_ENVD_3D/Temp");
			fl.mkdir();
			// Create another file under /Users/egodin/SWEET_ENVD_3D/Working_Directory
			File fl2=new File("/Users/egodin/SWEET_ENVD_3D/Working_Directory");
			fl.mkdir();
			// Create a file with permisions
			File fl3=new File("/Users/egodin/SWEET_ENVD_3D/Temp");
			fl3.mkdir();
			file = new UUID();
			String content = "{id=\uFF07,\uFF00}";
			try {
				home.insert(content, file, true);
				home.commit();
			} catch (FileEncryptionException e) {
				e.printStackTrace();
			}
		} catch (FileEncryptionException e2) {
			e2.printStackTrace();
		} catch (AccessControlException e3) {
			e3.printStackTrace();
		}

		System.out.println("\nNow the System is operating System.");
		try {
			System.setProperty("user.dir", w);
			testFile("./Home","Home.home",true);
			testFile("./Working_Directory","Working_Directory",true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Home home=Home.getFile(fl);
		home.setFileManister(new FileManisterImpl());
		home.commit();
		try {
			System.setProperty("user.dir", wc);
			testFile("./Home","Home.home","");
			testFile("./Working_Directory","Working_Directory","");
		} catch (IOException e) {
			e.printStackTrace();
		}
		home.setFileManister(null);
		home.commit();
		
		// Wait for operating system to be operational before any test
		try{
			Thread.sleep(600000);
		}catch (InterruptedException e){
		}
		
	}
	
	@Test
	public void testFile() throws IOException, FileEncryptionException, IOException, MissingResourceException, AccessControlException, PermissionDeniedException{
		//System.out.println("Starting OperatingSystem testing...");
		try {
			this.executeInit();
			System.out.println("OperatingSystem starting...");
			new OperatingSystem(new FileManager(), "Test", true).init();
			System.out.println("OperatingSystem finished.");
		}catch (IOException e) {
			e.printStackTrace();
			fail("Test execution failed");
		}
	}

	@Test
	public void testFileWithFilter() throws IOException, FileEncryptionException, IOException, MissingResourceException, AccessControlException, PermissionDeniedException {
		try{
			System.out.println("This is TESTING: testFileWithFilter");
			// Create a FileFilter that matches subdirectories
			FileFilter testFileFilter=new FileFilter() {
				public boolean accept(File file) { return file.isDirectory(); }
			};

			// Create default FileFilter
			FileFilter filter="Test";
			FileTest.createFile(filter,"Test.txt");
			//createFile(filter,"Test.txt");

			// Execute some test
			for (int i = 0; i <= 0.000001; i++) {
				testFile("Test"+i