// UserPreferencesControllerTest.java
package com.eteks.sweethome3d.viewcontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.TextureImage;
import com.eteks.sweethome3d.model.UserPreferences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserPreferencesController}.
* It contains ten unit test cases for the {@link UserPreferencesController#mayImportLanguageLibrary()} method.
*/
class UserPreferencesControllerTest {
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns true when the language library can be imported.
     */
    @Test
    void testMayImportLanguageLibraryReturnsTrue() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertTrue(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library cannot be imported.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalse() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(null);
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library importer is not set.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalseWhenLanguageLibraryImporterNotSet() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(null);
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library importer throws an exception.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalseWhenLanguageLibraryImporterThrowsException() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                throw new RuntimeException("Test exception");
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns true when the language library importer returns true.
     */
    @Test
    void testMayImportLanguageLibraryReturnsTrueWhenLanguageLibraryImporterReturnsTrue() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                return true;
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertTrue(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library importer returns false.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalseWhenLanguageLibraryImporterReturnsFalse() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                return false;
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library importer returns null.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalseWhenLanguageLibraryImporterReturnsNull() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                return false;
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns true when the language library importer returns a valid object.
     */
    @Test
    void testMayImportLanguageLibraryReturnsTrueWhenLanguageLibraryImporterReturnsValidObject() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                return true;
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertTrue(controller.mayImportLanguageLibrary());
    }
    
    /**
     * Test case to verify that mayImportLanguageLibrary() returns false when the language library importer returns an invalid object.
     */
    @Test
    void testMayImportLanguageLibraryReturnsFalseWhenLanguageLibraryImporterReturnsInvalidObject() {
        UserPreferences preferences = new UserPreferences();
        ViewFactory viewFactory = new ViewFactory();
        ContentManager contentManager = new ContentManager();
        contentManager.setLanguageLibraryImporter(new LanguageLibraryImporter() {
            @Override
            public boolean mayImportLanguageLibrary() {
                return false;
            }
            @Override
            public void importLanguageLibrary() {
            }
        });
        UserPreferencesController controller = new UserPreferencesController(preferences, viewFactory, contentManager);
        assertFalse(controller.mayImportLanguageLibrary());
    }
}