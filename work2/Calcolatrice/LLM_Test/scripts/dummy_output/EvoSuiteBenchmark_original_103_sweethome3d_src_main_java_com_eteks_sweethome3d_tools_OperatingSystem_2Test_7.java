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
		
	/**
	* Returns the default folder where user home should be created.
	* Requires <code>com.apple.eio</code> source-code distribution package to compile.
	* (This package cannot be used without invoking this method).
	*/
    private File getDefaultHomeFolder() {
        return new File("home");
    }
    
    /**
	* Checks if the operating system is operating on Mac OS X.
	* @throws IOException If the operating system fail to access the property <code>os.name</code>.
	*/
    @Test
    void isMacOSX() throws IOException {
        assertTrue(System.getProperty("os.name").equals("Mac OS X"));
    }
    
    /**
	* Checks if the user home folder exist in the operating system.
	* Requires <code>com.apple.eio</code> source-code distribution package to compile.
	* (This package cannot be used without invoking this method).
	*/
    @Test
    void getHomeFolder() throws IOException, MissingResourceException {
        File file = getDefaultHomeFolder();
        System.out.println(file);
        assertTrue(file!= null && file.isDirectory());
        // This line is needed for this test to show there is nothing is set up but the other tests can fail.
        assertFalse(getDefaultTemporaryFolder(false));
        assertEquals(getDefaultHomeFolder().getAbsoluteFile().getCanonicalPath(),
                     System.getProperty("user.home"));
    }
    
    /**
	* Creates temporary folder in the operating system.
	* Requires <code>com.apple.eio</code> source-code distribution package to compile.
	* (This package cannot be used without invoking this method).
	*/
    private boolean createTemporaryFolder(boolean create) throws IOException, MissingResourceException {
		File folder = getDefaultTemporaryFolder(create);
		assertTrue(folder!= null && folder.isDirectory());
		return folder.mkdir();
    }
	/**
	* Deletes the default temporary folder created in the operating system.
	* Requires <code>com.apple.eio</code> source-code distribution package to compile.
	*/
	@Test
    void deleteTemporaryFile() throws IOException {
		System.out.println(File.separatorChar);
	  File home = getDefaultHomeFolder();
	  File tempFolder = File.createTempFile("temp", ".tmp", home);
	  assertTrue(tempFolder.delete());
	}
	/**
	* Creates temporary file with given prefix and suffix in the operating system.
	* Requires <code>com.apple.eio</code> source-code distribution package to compile.
	* (This package cannot be used without invoking this method).
	*/
	@Test
    void createTemporaryFile(String prefix, String suffix) throws IOException {
        assertTrue(System.getProperty("os.name").equals("Mac OS X"));
    	File folder = getDefaultTemporaryFolder(false);
        new File(folder.getAbsolutePath() + File.separator + UUID.randomUUID()).mkdir();
		File file = File.createTempFile(prefix, suffix, folder);
        assertTrue(file.getCanonicalFile().exists());
	}
    
	/**
	* Returns the FileManager class that accesses to Mac OS X specifics.
	* Do not invoke methods of this class without checking first if the system property <code>os.name</code>
	* is <code>Mac OS X</code>.
	* @return FileManager.
	*/
    protected FileManager getFileManager() throws MissingResourceException {
        FileManager manager = new FileManager();
		assertTrue(manager!= null);
		return manager;
    }
}

/**
* Tests the methods of the class {@link OperatingSystem}.
*/
class OperatingSystemTest {
	/**
	* Getter for operating system and utility functions.
	*/
    public static OperatingSystem getInstance() {
        return OperatingSystem_2Test.getFileManager().getOs();
    }
    /**
	* Returns the default application folder.
	*/
    public static File getDefaultApplicationFolder() {
        UserAccounts user = System.getProperty("user.home")  ;
        return new File(user.getAppData(), "applications");
    }
    /**
	* Checks if an application folder exists in the operating system
	*/
    @Test
    void getHomeFolder() throws IOException {
}
}