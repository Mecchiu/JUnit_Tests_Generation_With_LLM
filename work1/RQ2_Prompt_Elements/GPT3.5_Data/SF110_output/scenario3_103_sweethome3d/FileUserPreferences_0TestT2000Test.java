// FileUserPreferences_0Test.java
package com.eteks.sweethome3d.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FileUserPreferences}.
 * It contains ten unit test cases for the {@link FileUserPreferences#furnitureLibraryExists(String)} method.
 */
class FileUserPreferences_0Test {
    
    /**
     * Test case for when the given furniture library file exists in the first furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryExistsInFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the given furniture library file exists in the second furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryExistsInSecondFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.furnitureLibraryExists("testLibrary2.sh3f"));
    }
    
    /**
     * Test case for when the given furniture library file exists in both furniture libraries folders.
     */
    @Test
    void testFurnitureLibraryExistsInBothFolders() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertTrue(preferences.furnitureLibraryExists("testLibrary3.sh3f"));
    }
    
    /**
     * Test case for when the given furniture library file does not exist in any furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.furnitureLibraryExists("nonExistentLibrary.sh3f"));
    }
    
    /**
     * Test case for when the given furniture library file name is null.
     */
    @Test
    void testFurnitureLibraryNameIsNull() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.furnitureLibraryExists(null));
    }
    
    /**
     * Test case for when the given furniture library file name is empty.
     */
    @Test
    void testFurnitureLibraryNameIsEmpty() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertFalse(preferences.furnitureLibraryExists(""));
    }
    
    /**
     * Test case for when the first furniture libraries folder does not exist.
     */
    @Test
    void testFirstFolderDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.setFurnitureFolder1(new File("nonExistentFolder"));
        assertFalse(preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the second furniture libraries folder does not exist.
     */
    @Test
    void testSecondFolderDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.setFurnitureFolder2(new File("nonExistentFolder"));
        assertFalse(preferences.furnitureLibraryExists("testLibrary2.sh3f"));
    }
    
    /**
     * Test case for when both furniture libraries folders do not exist.
     */
    @Test
    void testBothFoldersDoNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        preferences.setFurnitureFolder1(new File("nonExistentFolder1"));
        preferences.setFurnitureFolder2(new File("nonExistentFolder2"));
        assertFalse(preferences.furnitureLibraryExists("testLibrary3.sh3f"));
    }
    
    /**
     * Test case for when an exception is thrown while checking for the existence of the furniture library file.
     */
    @Test
    void testExceptionThrown() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences();
        assertThrows(RecorderException.class, () -> preferences.furnitureLibraryExists("testLibrary4.sh3f"));
    }
}