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
   * Returns the name of the resource.
   */
  public String getResourceName() {
    return this.resourceName;
  }

  /**
   * Returns <code>true</code>.
   */
  public boolean isJAREntry() {
    return true;
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getURL() {
    return getClass().getResource(this.resourceName);
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL() {
    return getClass().getResource(this.resourceName);
  }

  /**
   * Returns the name of the resource.
   */
  @Override
  public String toString() {
    return this.resourceName;
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
* It contains ten unit test cases for the {@link ResourceURLContent#getResourceName()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetResourceName() {
		assertEquals("/com/eteks/sweethome3d/io/DefaultCatalog.xml", new ResourceURLContent("/com/eteks/sweethome3d/io/DefaultCatalog.xml").getResourceName());
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
* It contains ten unit test cases for the {@link ResourceURLContent#isJAREntry()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testIsJAREntry() {
		assertTrue(new ResourceURLContent("/com/eteks/sweethome3d/io/DefaultCatalog.xml").isJAREntry());
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
		assertEquals("jar:file:/C:/Users/user/Desktop/SweetHome3D-6.4-src/SweetHome3D/lib/sweethome3d-6.4.jar!/com/eteks/sweethome3d/io/DefaultCatalog.xml", new ResourceURLContent("/com/eteks/sweethome3d/io/DefaultCatalog.xml").getURL().toString());
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
* It contains ten unit test cases for the {@link ResourceURLContent#getJAREntryURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetJAREntryURL() {
		assertEquals("jar:file:/C:/Users/user/Desktop/SweetHome3D-6.4-src/SweetHome3D/lib/sweethome3d-6.4.jar!/com/eteks/sweethome3d/io/DefaultCatalog.xml", new ResourceURLContent("/com/eteks/sweethome3d/io/DefaultCatalog.xml").getJAREntryURL().toString());
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
* Test class of {@link ResourceURLContent