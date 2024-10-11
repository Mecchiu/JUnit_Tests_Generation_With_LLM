// OperatingSystem_1Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {
		
    private static final String TEMP_FOLDER = "tmp-";
    private static final String TEMP_SUB_FOLDER = TEMP_FOLDER + UUID.randomUUID() + "-";
    private static final String APPLICATION_FOLDER = TEMP_FOLDER + UUID.randomUUID() + "-";
    private static final String TEMPORARY_SUB_FOLDER = TEMP_SUB_FOLDER + UUID.randomUUID() + "-";
    private static final String TEMPORARY_SESSION_SUB_FOLDER = TEMPORARY_SUB_FOLDER + UUID.randomUUID() + "-";
    //private static final String TEMP_CURR_FOLDER = "cur-";

		
    @Test
    public void testIsWindows() throws IOException {
        File rootFolder = new File(System.getProperty("user.home"));
        rootFolder.mkdirs();
        assertTrue(isWindows());        
    }
    
    @Test
    public void testIsLinux() throws IOException {
        FileManager rootFolder = new FileManager();
        File temporaryFolder = createTemporaryFile(null, "");
        rootFolder.setTempFolder(new File(temporaryFolder.getPath() + TEMP_FOLDER));
        rootFolder.setApplicationFolder(new File(APPLICATION_FOLDER));
        rootFolder.setApplicationFolder(null);
        rootFolder.setTempFolder(rootFolder.getTempFolder());

        assertFalse(isWindows());

        File subFolder = null;
        try {
            FileManager subFolderManager = new FileManager();
            subFolder = new File(rootFolder.subFolder(new File(SubfolderNames.TEMP_SUB_FOLDER).toString()).getPath() + "/");
            subFolderManager.setTempFolder(subFolder.getPath() + TEMP_SUB_FOLDER);
            subFolderManager.setApplicationFolder(new File(ApplicationFolderNames.APPLICATION_FOLDER).toString());
        } catch (IllegalArgumentException e) {
            assertTrue(false);
        }
    }
    
    private static boolean isWindows() {
        return false;
    }
    
    private static boolean noSessionFolderCreation(){
        return true;
    }

    private void createTempFolder(String subFolderPrefix) throws IOException {
        File tempFolder = null;

        String filename = subFolderPrefix.isEmpty()? 
                "TemporaryFolder" : subFolderPrefix + TEMP_FOLDER;

        try {
            tempFolder = createTemporaryFile(filename, "");
        } catch (IOException e) {
            throw new IOException("Create temporary folder failed.", e);
        }
   
        if (noSessionFolderCreation()){   
            assertFalse(tempFolder.exists());  
        } else {
            assertTrue(tempFolder.exists()); 
        }
    }

    private static File createTemporaryFile(String filename, String prefix) throws IOException {
        String filePath = prefix.isEmpty()? filename : prefix + filename;
        FileManager fileManager = new FileManager();
        
        try {
            fileManager.setEnvironmentVariable(TEMPORARY_FOLDER, tempFolder.getPath());
            return fileManager.createFile(filePath.replace("\\", "/"));                
        } catch (MissingResourceException e) {
            assertEquals(File.class, fileManager.getClass());
            
            // check if we are not allowed to try to read from file manager
            try {
                fileManager.getFile(filename, ResourceBundle.getBundle("com.eteks.sweethome3d.resource.FileManager"));
                throw new RuntimeException("This file should not be readable from Mac OS X at this time");
            } catch (IOException err) {
                // expected
            }
        }
        
        return null;
    }

    private void createTempFolderAndSessionFolder(String subFolderPrefix) throws IOException {
        String filePath = subFolderPrefix.isEmpty()? filename : subFolderPrefix + filename;
        FileManager parentFolderManager = new FileManager();
        
}
}