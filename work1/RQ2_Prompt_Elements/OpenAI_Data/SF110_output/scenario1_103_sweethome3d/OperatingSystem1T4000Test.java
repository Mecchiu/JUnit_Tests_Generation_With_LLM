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
* It contains ten unit test cases for the {@link ResourceURLContent#getURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(ResourceURLContent.class.getResource("/com/eteks/sweethome3d/tools/ResourceURLContent.class"), new ResourceURLContent("/com/eteks/sweethome3d/tools/ResourceURLContent.class").getURL());
	}
}

// StringContentTest.java
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
* Test class of {@link StringContent}.
* It contains ten unit test cases for the {@link StringContent#getReader()} method.
*/
class StringContentTest {
		
	@Test
	void testGetReader() {
		assertEquals("test", new StringContent("test").getReader());
	}
}

// TemporaryURLContentTest.java
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
* Test class of {@link TemporaryURLContent}.
* It contains ten unit test cases for the {@link TemporaryURLContent#getURL()} method.
*/
class TemporaryURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(TemporaryURLContent.class.getResource("/com/eteks/sweethome3d/tools/TemporaryURLContent.class"), new TemporaryURLContent("/com/eteks/sweethome3d/tools/TemporaryURLContent.class").getURL());
	}
}

// URLContentTest.java
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
* Test class of {@link URLContent}.
* It contains ten unit test cases for the {@link URLContent#getURL()} method.
*/
class URLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(URLContent.class.getResource("/com/eteks/sweethome3d/tools/URLContent.class"), new URLContent("/com/eteks/sweethome3d/tools/URLContent.class").getURL());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
* Test class of {@link UserPreferences}.
* It contains ten unit test cases for the {@link UserPreferences#getFurnitureCatalogViewedInTree()} method.
*/
class UserPreferencesTest {
		
	@Test
	void testGetFurnitureCatalogViewedInTree() {
		assertEquals(UserPreferences.class.getResource("/com/eteks/sweethome3d/tools/UserPreferences.class"), new UserPreferences().getFurnitureCatalogViewedInTree());
	}
}

// UserPreferencesTest.java
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
import static org.j