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
		
    private OperatingSystem() {
    }
    
    // Test method of {@link OperatingSystem#getDefaultApplicationFolder()}
    @Test
    void getDefaultApplicationFolder() throws IOException {
        assertNotNull("The default folder cannot be null.", OperatingSystem.getDefaultApplicationFolder());
    }
    
    // Test method of {@link OperatingSystem#getDefaultApplicationFolder()}
    @Test
    void getDefaultApplicationFolderWithAbsolute() throws IOException {
        // Assure that empty file is created.
        assertTrue("Created file cannot be empty.", getFileManager().getFileManager().exists(""));
    }
    
    // Test method of {@link OperatingSystem#getDefaultApplicationFolder()}
    @Test
    void getDefaultApplicationFolderWithRelative() throws IOException {
        File tmpFile = OperatingSystem.createTemporaryFile("relative", ".tmp");
        assertNotNull("Created file can't be null.", tmpFile);
        FileManager fileManager = getFileManager();
        File destFile = getTempFolder();
        assertTrue("Dest file can't be null.", destFile!= null);
        fileManager.setDestFolder("..\\tmp");
        assertTrue("Dest folder can't be null.", destFile!= null);
        fileManager.setDestFolder(tmpFile.getAbsolutePath());
        File tempFile = OperatingSystem.createTemporaryFile("relative", ".tmp");
        assertNotNull("Failed to create new file.", tempFile);
        assertFalse("Failed to move to the destination.", tempFile == destFile);
        assertTrue("Failed to create temporary file.", fileManager.getFileManager().exists("..\\tmp\\tmp"));
        // If empty file is created, this tests will fail.
        assertTrue(fileManager.getFileManager().exists(tmpFile) ||!fileManager.getFileManager().exists(destFile));
        assertTrue("File should be created.", fileManager.getFileManager().exists(tmpFile));
        assertFalse("File shouldn't be created.", fileManager.getFileManager().exists(destFile));
        FileManager testFileManager = getFileManager();
        assertFalse("Failed to move folder and file", testFileManager.exists(tmpFile) || testFileManager.exists(destFile));
        assertTrue("Failed to exist directory.", testFileManager.exists(tmpFile));
    }
    
    // Test method of {@link OperatingSystem#getDefaultApplicationFolder()}
    @Test
    void getDefaultApplicationFolderWithTempFolder() throws IOException {
        // If destination folder can not be null, this will fail
        FileManager tmpFileManager = getFileManager();
        assertNotNull(tmpFileManager);
        FileManager destFileManager = getFileManager();
        assertNotNull(destFileManager);
        assertTrue(tmpFileManager.getDestFolder() == null);
        assertTrue(destFileManager.getDestFolder() == null);
        // The dest folder is the default if nothing is changed
        assertNull(tmpFileManager.getDestFolder());
        destFileManager.setDestFolder(tmpFileManager.getTempFolder());
        // The temporary folder is the dest folder if not null else null
        assertNull(tmpFileManager.getDestFolder());
        // The test folders do not equal the default
        assertNotSame(tmpFileManager.getTempFolder(), destFileManager.getTempFolder());
        assertNotSame(tmpFileManager.getTempFolder(), OperatingSystem.getDefaultApplicationFolder());
        assertNotSame(destFileManager.getTempFolder(), OperatingSystem.getDefaultApplicationFolder());
        tmpFileManager.setTempFolder(tmpFileManager.getTempFolder());
        destFileManager.setTempFolder(tmpFileManager.getTempFolder());
        tmpFileManager.setTempFolder(null);
        assertNotSame(tmpFileManager.getTempFolder(),  OperatingSystem.getDefaultApplicationFolder());
        assertNotSame(destFileManager.getTempFolder(),  OperatingSystem.getDefaultApplicationFolder());
        assertNotSame(tmpFileManager.getTempFolder(),  tmpFileManager.getTempFolder());
        tmpFileManager.setDestFolder(tmpFileManager.getTempFolder());
        tmpFileManager.setTempFolder(null);
        assertNotSame(tmpFileManager.getTempFolder(),  tmpFileManager.getTempFolder());
        assertSame(tmpFileManager.getTempFolder(),  tmpFileManager.getTempFolder());
    }
    
    // Test method of {@link OperatingSystem#getDefaultApplicationFolder()}
    @Test
    void getDefaultApplicationFolderWithTempFolder1() throws IOException {
        // If tempFolder doesn't exist, this will fail
}
}