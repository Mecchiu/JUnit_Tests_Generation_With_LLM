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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsMacOSXLeopardOrSuperior() {
		assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
	}
}

// ResourceURLContent.java
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
 * Content that references a resource.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {

    /**
     * Creates a content instance that references a resource.
     * @param resource the name of the resource.
     */
    public ResourceURLContent(String resource) {
        super(ResourceURLContent.class.getResource(resource));
    }
}

// ResourceURLContentTest.java
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
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#ResourceURLContent(String)} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testResourceURLContent() {
		ResourceURLContent resourceURLContent = new ResourceURLContent("/com/eteks/sweethome3d/tools/resources/test.txt");
		assertEquals(resourceURLContent.getURL().toString(), "file:/C:/Users/user/Documents/GitHub/SweetHome3D/SweetHome3D/build/classes/java/main/com/eteks/sweethome3d/tools/resources/test.txt");
	}
}

// SweetHome3D.java
package com.eteks.sweethome3d;

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
 * The main class of Sweet Home 3D.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D {

    /**
     * The name of the folder that stores Sweet Home 3D preferences.
     */
    public static final String SWEET_HOME_3D_FOLDER = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D preferences under Mac OS X.
     */
    public static final String SWEET_HOME_3D_FOLDER_MAC_OS_X = "Library/Preferences/" + SWEET_HOME_3D_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D preferences under Windows.
     */
    public static final String SWEET_HOME_3D_FOLDER_WINDOWS = "SweetHome3D";

    /**
     * The name of the folder that stores Sweet Home 3D preferences under Linux.
     */
    public static final String SWEET_HOME_3D_FOLDER_LINUX = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D preferences under other systems.
     */
    public static final String SWEET_HOME_3D_FOLDER_OTHER = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D user preferences.
     */
    public static final String SWEET_HOME_3D_USER_FOLDER = "SweetHome3D";

    /**
     * The name of the folder that stores Sweet Home 3D user preferences under Mac OS X.
     */
    public static final String SWEET_HOME_3D_USER_FOLDER_MAC_OS_X = "Library/Application Support/" + SWEET_HOME_3D_USER_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D user preferences under Windows.
     */
    public static final String SWEET_HOME_3D_USER_FOLDER_WINDOWS = SWEET_HOME_3D_USER_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D user preferences under Linux.
     */
    public static final String SWEET_HOME_3D_USER_FOLDER_LINUX = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D user preferences under other systems.
     */
    public static final String SWEET_HOME_3D_USER_FOLDER_OTHER = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D temporary files.
     */
    public static final String SWEET_HOME_3D_TEMP_FOLDER = "SweetHome3D";

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Mac OS X.
     */
    public static final String SWEET_HOME_3D_TEMP_FOLDER_MAC_OS_X = "Library/Caches/" + SWEET_HOME_3D_TEMP_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Windows.
     */
    public static final String SWEET_HOME_3D_TEMP_FOLDER_WINDOWS = SWEET_HOME_3D_TEMP_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Linux.
     */
    public static final String SWEET_HOME_3D_TEMP_FOLDER_LINUX = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under other systems.
     */
    public static final String SWEET_HOME_3D_TEMP_FOLDER_OTHER = ".sweethome3d";

    /**
     * The name of the folder that stores Sweet Home 3D temporary files.
     */
    public static final String SWEET_HOME_3D_TEMP_SUB_FOLDER = "tmp";

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Mac OS X.
     */
    public static final String SWEET_HOME_3D_TEMP_SUB_FOLDER_MAC_OS_X = SWEET_HOME_3D_TEMP_SUB_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Windows.
     */
    public static final String SWEET_HOME_3D_TEMP_SUB_FOLDER_WINDOWS = SWEET_HOME_3D_TEMP_SUB_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under Linux.
     */
    public static final String SWEET_HOME_3D_TEMP_SUB_FOLDER_LINUX = SWEET_HOME_3D_TEMP_SUB_FOLDER;

    /**
     * The name of the folder that stores Sweet Home 3D temporary files under other systems.
     */
    public static final String SWEET_HOME_3D_TEMP_SUB_FOLDER_OTHER = SWEET_HOME_3D_