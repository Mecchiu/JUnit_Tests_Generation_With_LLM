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
     * Test case for when the textures libraries plugin folder is null.
     */
    @Test
    void testTexturesLibraryExists_NullTexturesLibrariesPluginFolders() {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return null;
            }
        };
        assertThrows(RecorderException.class, () -> preferences.texturesLibraryExists("testLibrary"));
    }
    
    /**
     * Test case for when the textures libraries plugin folder is empty.
     */
    @Test
    void testTexturesLibraryExists_EmptyTexturesLibrariesPluginFolders() {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[0];
            }
        };
        assertThrows(RecorderException.class, () -> preferences.texturesLibraryExists("testLibrary"));
    }
    
    /**
     * Test case for when the textures library file exists in the first textures libraries folder.
     */
    @Test
    void testTexturesLibraryExists_TexturesLibraryExists() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertTrue(preferences.texturesLibraryExists("testLibrary"));
    }
    
    /**
     * Test case for when the textures library file does not exist in the first textures libraries folder.
     */
    @Test
    void testTexturesLibraryExists_TexturesLibraryDoesNotExist() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists("nonExistentLibrary"));
    }
    
    /**
     * Test case for when the textures library file name is null.
     */
    @Test
    void testTexturesLibraryExists_NullLibraryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists(null));
    }
    
    /**
     * Test case for when the textures library file name is empty.
     */
    @Test
    void testTexturesLibraryExists_EmptyLibraryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists(""));
    }
    
    /**
     * Test case for when the textures library file name contains only whitespace characters.
     */
    @Test
    void testTexturesLibraryExists_WhitespaceLibraryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists("   "));
    }
    
    /**
     * Test case for when the textures library file name contains only directory separators.
     */
    @Test
    void testTexturesLibraryExists_DirectorySeparatorLibraryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists("/\\"));
    }
    
    /**
     * Test case for when the textures library file name contains a directory separator.
     */
    @Test
    void testTexturesLibraryExists_LibraryNameWithDirectorySeparator() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertFalse(preferences.texturesLibraryExists("test/Library"));
    }
    
    /**
     * Test case for when the textures library file name contains a valid library name.
     */
    @Test
    void testTexturesLibraryExists_ValidLibraryName() throws RecorderException {
        FileUserPreferences preferences = new FileUserPreferences() {
            @Override
            public File[] getTexturesLibrariesPluginFolders() {
                return new File[] { new File("texturesLibrariesFolder") };
            }
        };
        assertTrue(preferences.texturesLibraryExists("testLibrary"));
    }
}

// FileUserPreferences.java
package com.eteks.sweethome3d.io;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import com.eteks.sweethome3d.model.RecorderException;

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
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        File[] texturesLibrariesPluginFolders = getTexturesLibrariesPluginFolders();
        if (texturesLibrariesPluginFolders == null || texturesLibrariesPluginFolders.length == 0) {
            throw new RecorderException("Can't access to textures libraries plugin folder");
        } else {
            String libraryFileName = new File(name).getName();
            return new File(texturesLibrariesPluginFolders[0], libraryFileName).exists();
        }
    }
}