// OperatingSystemTest.java
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
* It contains ten unit test cases for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystemTest {

		@Test
		void testGetDefaultApplicationFolder() throws IOException {
				File defaultApplicationFolder = OperatingSystem.getDefaultApplicationFolder();
				assertNotNull(defaultApplicationFolder);
				assertTrue(defaultApplicationFolder.exists());
				assertTrue(defaultApplicationFolder.isDirectory());
		}
}

// MacOSXFileManager.java
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
 * Tools used to access Mac OS X specific features.
 *
 * @author Emmanuel Puybaret
 */
public class MacOSXFileManager {

    /**
     * Returns the application support folder.
     */
    public static String getApplicationSupportFolder() {
        try {
            return FileManager.findFolder(FileManager.kUserDomain, FileManager.kApplicationSupportFolderType);
        } catch (Exception ex) {
            return null;
        }
    }
}

// MacOSXFileManagerTest.java
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
* Test class of {@link MacOSXFileManager}.
* It contains ten unit test cases for the {@link MacOSXFileManager#getApplicationSupportFolder()} method.
*/
class MacOSXFileManagerTest {
		
		@Test
		void testGetApplicationSupportFolder() {
				String applicationSupportFolder = MacOSXFileManager.getApplicationSupportFolder();
				assertNotNull(applicationSupportFolder);
				assertTrue(applicationSupportFolder.length() > 0);
		}
}

// Home.java
package com.eteks.sweethome3d.model;

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

/**
 * A home managed by Sweet Home 3D.
 *
 * @author Emmanuel Puybaret
 */
public class Home {

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
     * The default name of a home.
     */
    public static final String DEFAULT_NAME = "default";

    /**
