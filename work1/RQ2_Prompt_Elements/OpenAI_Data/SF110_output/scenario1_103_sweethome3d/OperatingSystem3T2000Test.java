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
 * Content read from a resource URL.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {

    /**
     * Creates a content from a resource URL.
     */
    public ResourceURLContent(String resourceName) {
        super(ResourceURLContent.class.getResource(resourceName));
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
		assertEquals("test", resourceURLContent.getInputStream());
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

    /**
     * Sweet Home 3D version.
     */
    public final static String SWEET_HOME_3D_VERSION = "6.4";

    /**
     * Sweet Home 3D version date.
     */
    public final static String SWEET_HOME_3D_VERSION_DATE = "2020-01-01";

    /**
     * Sweet Home 3D application name.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in English.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ENGLISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in French.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_FRENCH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in German.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GERMAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Italian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_ITALIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Spanish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SPANISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Brazilian Portuguese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_BRAZILIAN_PORTUGUESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Russian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_RUSSIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Japanese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_JAPANESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SIMPLIFIED_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Chinese.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TRADITIONAL_CHINESE = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Korean.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_KOREAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Polish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_POLISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Turkish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_TURKISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Czech.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_CZECH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Hungarian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_HUNGARIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Dutch.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_DUTCH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Danish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_DANISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Finnish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_FINNISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Norwegian.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_NORWEGIAN = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Swedish.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_SWEDISH = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Greek.
     */
    public final static String SWEET_HOME_3D_APPLICATION_NAME_IN_GREEK = "Sweet Home 3D";

    /**
     * Sweet Home 3D application name in Catalan.
    