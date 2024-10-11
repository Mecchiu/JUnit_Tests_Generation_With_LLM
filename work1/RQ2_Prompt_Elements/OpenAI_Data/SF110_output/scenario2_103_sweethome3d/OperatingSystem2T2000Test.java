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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsMacOSX() {
		assertTrue(OperatingSystem.isMacOSX());
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
import com.eteks.sweethome3d.model.Content;

/**
 * Content that references a resource.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent implements Content {
    private final String resourceName;

    /**
     * Creates a content object that references a resource.
     * @param resourceName the name of the resource.
     */
    public ResourceURLContent(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Returns the URL of the resource.
     */
    public java.net.URL getURL() {
        return getClass().getResource(this.resourceName);
    }

    /**
     * Returns the name of the resource.
     */
    public String getName() {
        return this.resourceName;
    }

    /**
     * Returns <code>true</code> if the resource exists.
     */
    public boolean exists() {
        return getURL() != null;
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
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#getURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(ResourceURLContent.getURL(), "https://www.eteks.com/sweethome3d/");
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
 * Sweet Home 3D main class.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D {
    private static final String SWEET_HOME_3D_FOLDER = ".sweethome3d";

    /**
     * Sweet Home 3D version.
     */
    public static final String SWEET_HOME_3D_VERSION;

    /**
     * Sweet Home 3D sub version.
     */
    public static final String SWEET_HOME_3D_SUB_VERSION;

    /**
     * Sweet Home 3D build.
     */
    public static final String SWEET_HOME_3D_BUILD;

    /**
     * Sweet Home 3D revision.
     */
    public static final String SWEET_HOME_3D_REVISION;

    /**
     * Sweet Home 3D version date.
     */
    public static final String SWEET_HOME_3D_VERSION_DATE;

    /**
     * Sweet Home 3D version year.
     */
    public static final String SWEET_HOME_3D_VERSION_YEAR;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_YEAR;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_YEAR;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_BUILD;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_BUILD;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_YEAR_AND_BUILD;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_YEAR_AND_BUILD;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_YEAR_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_YEAR_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_BUILD_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_BUILD_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_YEAR_AND_BUILD_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_YEAR_AND_BUILD_AND_REVISION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_SUB_VERSION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_SUB_VERSION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_YEAR_AND_SUB_VERSION;

    /**
     * Sweet Home 3D version name.
     */
    public static final String SWEET_HOME_3D_VERSION_NAME_AND_DATE_AND_YEAR_AND_SUB_