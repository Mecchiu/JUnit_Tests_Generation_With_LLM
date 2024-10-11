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
     * Test case for when the furniture libraries plugin folder cannot be accessed.
     */
    @Test
    void testFurnitureLibraryExists_NoAccess() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return null;
            }
        };
        assertThrows(RecorderException.class, () -> preferences.furnitureLibraryExists("testLibrary.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file exists.
     */
    @Test
    void testFurnitureLibraryExists_Exists() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        File libraryFile = new File("testFolder/testLibrary.sh3f");
        assertTrue(libraryFile.exists());
        assertTrue(preferences.furnitureLibraryExists(libraryFile.getAbsolutePath()));
    }
    
    /**
     * Test case for when the furniture library file does not exist.
     */
    @Test
    void testFurnitureLibraryExists_NotExists() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        File libraryFile = new File("testFolder/nonExistentLibrary.sh3f");
        assertFalse(libraryFile.exists());
        assertFalse(preferences.furnitureLibraryExists(libraryFile.getAbsolutePath()));
    }
    
    /**
     * Test case for when the furniture library file name is null.
     */
    @Test
    void testFurnitureLibraryExists_NullName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists(null));
    }
    
    /**
     * Test case for when the furniture library file name is empty.
     */
    @Test
    void testFurnitureLibraryExists_EmptyName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists(""));
    }
    
    /**
     * Test case for when the furniture library file name is a directory.
     */
    @Test
    void testFurnitureLibraryExists_DirectoryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("testFolder"));
    }
    
    /**
     * Test case for when the furniture library file name contains a path separator.
     */
    @Test
    void testFurnitureLibraryExists_PathSeparatorInName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("testLibrary/test.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name contains a backslash.
     */
    @Test
    void testFurnitureLibraryExists_BackslashInName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("testLibrary\\test.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name contains a forward slash.
     */
    @Test
    void testFurnitureLibraryExists_ForwardSlashInName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("testLibrary/test.sh3f"));
    }
    
    /**
     * Test case for when the furniture library file name contains spaces.
     */
    @Test
    void testFurnitureLibraryExists_SpacesInName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getFurnitureLibrariesPluginFolders() {
                return new File[] { new File("testFolder") };
            }
        };
        assertFalse(preferences.furnitureLibraryExists("test Library.sh3f"));
    }
}

// FileUserPreferences.java
package com.eteks.sweethome3d.io;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.UserPreferences;

/**
 * User preferences initialized from
 * {@link com.eteks.sweethome3d.io.DefaultUserPreferences default user preferences}
 * and stored in user preferences on local file system.
 *
 * @author Emmanuel Puybaret
 */
public class FileUserPreferences extends UserPreferences {
    
    /**
     * Returns the furniture libraries plugin folders.
     * 
     * @return the furniture libraries plugin folders
     */
    public File[] getFurnitureLibrariesPluginFolders() {
        return new File[] { new File(System.getProperty("user.home"), ".sweethome3d/furniture") };
    }

    @Override
    public boolean furnitureLibraryExists(String name) throws RecorderException {
        if (name == null || name.isEmpty()) {
            return false;
        }
        File[] furnitureLibrariesPluginFolders = getFurnitureLibrariesPluginFolders();
        if (furnitureLibrariesPluginFolders == null || furnitureLibrariesPluginFolders.length == 0) {
            throw new RecorderException("Can't access furniture libraries plugin folder");
        }
        String libraryFileName = new File(name).getName();
        File libraryFile = new File(furnitureLibrariesPluginFolders[0], libraryFileName);
        return libraryFile.exists() && libraryFile.isFile();
    }
}