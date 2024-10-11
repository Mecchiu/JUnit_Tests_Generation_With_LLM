// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {

	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
}

// ConfigurationManager.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;

/**
 * Manages the configuration for Inspirento.<br>
 * This manager uses XML format to store information.
 * The configuration file is, by default, saved in the
 * "config" directory and named "config.xml". Clearly,
 * this class should be a singleton, so we use
 * {@link #getInstance()} to get an instance and call
 * other instance methods to get the settings needed
 * by Inspirento, such as "window.size", "window.location",
 * and etc.<br>
 * The program first tries to get the configuration from
 * this <code>ConfigurationManager</code>. If it fails to
 * get any key, it uses the default settings presetted in
 * the protected <code>default</code> field.
 *
 * @author Allen Chue
 */
public class ConfigurationManager extends Properties {

    /**
     * Uses XML parser to get the specified property.
     * If there is no such a key, the method returns
     * <code>null</code>.
     *
     * @param key the key of the property
     * @return the property value
     */
    @Override
    public synchronized String getProperty(String key);
}

// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with a valid key.
	*/
	@Test
	void testGetPropertyWithValidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size";
		String value = config.getProperty(key);
		assertEquals("800,600", value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case is to get the property with an invalid key.
	*/
	@Test
	void testGetPropertyWithInvalidKey() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		String key = "window.size.width";
		String value = config.getProperty(key);
		assertNull(value);
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* The test case