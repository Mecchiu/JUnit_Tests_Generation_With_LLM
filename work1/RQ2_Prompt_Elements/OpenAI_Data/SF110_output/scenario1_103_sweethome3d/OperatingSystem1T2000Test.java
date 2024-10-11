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
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsWindows() {
		assertTrue(OperatingSystem.isWindows());
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
  private final String resourceName;

  /**
   * Creates a content from a resource URL.
   */
  public ResourceURLContent(String resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * Returns the resource name.
   */
  public String getResourceName() {
    return this.resourceName;
  }

  /**
   * Returns the URL of the resource.
   */
  @Override
  public java.net.URL getURL() {
    return ResourceURLContent.class.getResource(this.resourceName);
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
* It contains ten unit test cases for the {@link ResourceURLContent#getResourceName()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetResourceName() {
		assertEquals("/com/eteks/sweethome3d/io/HomeXML_1_0.dtd", new ResourceURLContent("/com/eteks/sweethome3d/io/HomeXML_1_0.dtd").getResourceName());
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
  private static final String SWEET_HOME_3D_FOLDER = ".sweethome3d";
  private static final String SWEET_HOME_3D_PREFERENCES_FOLDER = "preferences";
  private static final String SWEET_HOME_3D_LIBRARY_FOLDER = "library";
  private static final String SWEET_HOME_3D_PLUGINS_FOLDER = "plugins";
  private static final String SWEET_HOME_3D_JNLPS_FOLDER = "jnlps";
  private static final String SWEET_HOME_3D_TEMPORARY_FOLDER = "tmp";
  private static final String SWEET_HOME_3D_PREFERENCES_FILE = "preferences.xml";
  private static final String SWEET_HOME_3D_PLUGINS_CACHE_FILE = "pluginsCache.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_FILE = "pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL = "http://www.sweethome3d.com/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER = "pluginsManagerURL";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_DEFAULT_VALUE = "http://www.sweethome3d.com/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE = "file:pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_2 = "file:///pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_3 = "file:///C:/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_4 = "file:///C:\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_5 = "file:///C|/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_6 = "file:///C|\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_7 = "file:///C:/Documents%20and%20Settings/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_8 = "file:///C:\\Documents%20and%20Settings\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_9 = "file:///C|/Documents%20and%20Settings/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_10 = "file:///C|\\Documents%20and%20Settings\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_11 = "file:///C:/Documents%20and%20Settings/user/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_12 = "file:///C:\\Documents%20and%20Settings\\user\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_13 = "file:///C|/Documents%20and%20Settings/user/pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_14 = "file:///C|\\Documents%20and%20Settings\\user\\pluginsManager.xml";
  private static final String SWEET_HOME_3D_PLUGINS_MANAGER_URL_PARAMETER_LOCAL_VALUE_15 = "file:///C:/Documents%20and%20Settings/user/My%20Documents/pluginsManager.xml";