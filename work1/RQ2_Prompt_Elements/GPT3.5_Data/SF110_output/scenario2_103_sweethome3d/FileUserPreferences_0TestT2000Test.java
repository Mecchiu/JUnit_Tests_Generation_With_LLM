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
     * Test case for when the furniture libraries plugin folder is null.
     */
    @Test
    void testFurnitureLibraryExists_NullFolder() {
        FileUserPreferences preferences = new FileUserPreferences();
        assertThrows(RecorderException.class, () -> preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture libraries plugin folder is empty.
     */
    @Test
    void testFurnitureLibraryExists_EmptyFolder() {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[0];
            }
        };
        assertThrows(RecorderException.class, () -> preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file exists in the first furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryExists_ExistsInFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file exists in a non-first furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryExists_ExistsInNonFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("folder2/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file does not exist in any furniture libraries folder.
     */
    @Test
    void testFurnitureLibraryExists_DoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("nonexistentLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name contains a path separator.
     */
    @Test
    void testFurnitureLibraryExists_FileNameWithPathSeparator() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("folder1/testFolder/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name contains a path separator and exists in a non-first folder.
     */
    @Test
    void testFurnitureLibraryExists_FileNameWithPathSeparatorAndExistsInNonFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("folder2/testFolder/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name is an absolute path.
     */
    @Test
    void testFurnitureLibraryExists_AbsolutePath() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("/folder1/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name is an absolute path and exists in a non-first folder.
     */
    @Test
    void testFurnitureLibraryExists_AbsolutePathAndExistsInNonFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("/folder2/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name is a relative path with parent directory references.
     */
    @Test
    void testFurnitureLibraryExists_RelativePathWithParentDirectoryReferences() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("folder1/../folder1/testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name is a relative path with parent directory references and exists in a non-first folder.
     */
    @Test
    void testFurnitureLibraryExists_RelativePathWithParentDirectoryReferencesAndExistsInNonFirstFolder() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            protected File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("folder1"), new File("folder2") };
            }
        };
        assertTrue(preferences.furnitureLibraryExists("folder2/../folder2/testLibrary.sh3f"));
    }
}