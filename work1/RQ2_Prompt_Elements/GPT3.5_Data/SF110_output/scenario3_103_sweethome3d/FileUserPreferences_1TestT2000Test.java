// FileUserPreferences_1Test.java
package com.eteks.sweethome3d.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FileUserPreferences}.
 * It contains ten unit test cases for the {@link FileUserPreferences#texturesLibraryExists(String)} method.
 */
class FileUserPreferences_1Test {
    
    /**
     * Test case for when the given textures library file exists in the first textures libraries folder.
     */
    @Test
    void testTexturesLibraryExistsInFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.texturesLibraryExists("test.png"));
    }
    
    /**
     * Test case for when the given textures library file exists in the second textures libraries folder.
     */
    @Test
    void testTexturesLibraryExistsInSecondFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.texturesLibraryExists("test2.png"));
    }
    
    /**
     * Test case for when the given textures library file exists in both textures libraries folders.
     */
    @Test
    void testTexturesLibraryExistsInBothFolders() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.texturesLibraryExists("test3.png"));
    }
    
    /**
     * Test case for when the given textures library file does not exist in any textures libraries folder.
     */
    @Test
    void testTexturesLibraryDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.texturesLibraryExists("nonexistent.png"));
    }
    
    /**
     * Test case for when the given textures library file name is null.
     */
    @Test
    void testTexturesLibraryNameIsNull() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.texturesLibraryExists(null));
    }
    
    /**
     * Test case for when the given textures library file name is empty.
     */
    @Test
    void testTexturesLibraryNameIsEmpty() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.texturesLibraryExists(""));
    }
    
    /**
     * Test case for when the first textures libraries folder does not exist.
     */
    @Test
    void testFirstTexturesLibraryFolderDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.firstTexturesLibraryFolder = new File("nonexistent_folder");
        assertFalse(preferences.texturesLibraryExists("test.png"));
    }
    
    /**
     * Test case for when the second textures libraries folder does not exist.
     */
    @Test
    void testSecondTexturesLibraryFolderDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.secondTexturesLibraryFolder = new File("nonexistent_folder");
        assertFalse(preferences.texturesLibraryExists("test2.png"));
    }
    
    /**
     * Test case for when both textures libraries folders do not exist.
     */
    @Test
    void testBothTexturesLibraryFoldersDoNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.firstTexturesLibraryFolder = new File("nonexistent_folder");
        preferences.secondTexturesLibraryFolder = new File("nonexistent_folder");
        assertFalse(preferences.texturesLibraryExists("test3.png"));
    }
    
    /**
     * Test case for when an IOException is thrown while checking for the textures library file.
     */
    @Test
    void testIOExceptionThrown() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.texturesLibraryExists("test4.png"));
    }
}

// FileUserPreferences.java
package com.eteks.sweethome3d.io;

import com.eteks.sweethome3d.model.RecorderException;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * User preferences initialized from
 * {@link com.eteks.sweethome3d.io.DefaultUserPreferences default user preferences}
 * and stored in user preferences on local file system.
 *
 * @author Emmanuel Puybaret
 */
public class FileUserPreferences extends UserPreferences {

    /**
     * Returns <code>true</code> if the given textures library file exists in the first textures libraries folder.
     *
     * @param name the name of the resource to check
     */
    @Override
    public boolean texturesLibraryExists(String name) throws RecorderException {
        if (name == null || name.isEmpty()) {
            return false;
        }

        File firstFolder = getFirstTexturesLibraryFolder();
        File secondFolder = getSecondTexturesLibraryFolder();

        if (firstFolder.exists() && firstFolder.isDirectory()) {
            File file = new File(firstFolder, name);
            if (file.exists() && file.isFile()) {
                return true;
            }
        }

        if (secondFolder.exists() && secondFolder.isDirectory()) {
            File file = new File(secondFolder, name);
            if (file.exists() && file.isFile()) {
                return true;
            }
        }

        return false;
    }
}