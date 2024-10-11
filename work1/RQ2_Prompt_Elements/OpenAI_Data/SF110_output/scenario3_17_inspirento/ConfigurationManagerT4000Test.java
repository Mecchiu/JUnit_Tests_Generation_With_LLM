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
	* It tests the case when the key is null.
	*/
	@Test
	void testGetProperty_null() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(null));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is empty.
	*/
	@Test
	void testGetProperty_empty() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(""));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is not in the configuration file.
	*/
	@Test
	void testGetProperty_notInConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("notInConfig"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file.
	*/
	@Test
	void testGetProperty_inConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("value", config.getProperty("key"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is null.
	*/
	@Test
	void testGetProperty_inConfig_nullValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("nullValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is empty.
	*/
	@Test
	void testGetProperty_inConfig_emptyValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("", config.getProperty("emptyValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a number.
	*/
	@Test
	void testGetProperty_inConfig_numberValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("123", config.getProperty("numberValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a boolean.
	*/
	@Test
	void testGetProperty_inConfig_booleanValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("true", config.getProperty("booleanValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string.
	*/
	@Test
	void testGetProperty_inConfig_stringValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("string", config.getProperty("stringValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string with special characters.
	*/
	@Test
	void testGetProperty_inConfig_specialCharactersValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?", config.getProperty("specialCharactersValue"));
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
    public synchronized String getProperty(String key) {
        if (key == null) {
            return null;
        }
        String value = super.getProperty(key);
        if (value == null) {
            value = default.getProperty(key);
        }
        return value;
    }
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
	* It tests the case when the key is null.
	*/
	@Test
	void testGetProperty_null() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(null));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is empty.
	*/
	@Test
	void testGetProperty_empty() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(""));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is not in the configuration file.
	*/
	@Test
	void testGetProperty_notInConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("notInConfig"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file.
	*/
	@Test
	void testGetProperty_inConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("value", config.getProperty("key"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is null.
	*/
	@Test
	void testGetProperty_inConfig_nullValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("nullValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is empty.
	*/
	@Test
	void testGetProperty_inConfig_emptyValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("", config.getProperty("emptyValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a number.
	*/
	@Test
	void testGetProperty_inConfig_numberValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("123", config.getProperty("numberValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a boolean.
	*/
	@Test
	void testGetProperty_inConfig_booleanValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("true", config.getProperty("booleanValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string.
	*/
	@Test
	void testGetProperty_inConfig_stringValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("string", config.getProperty("stringValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string with special characters.
	*/
	@Test
	void testGetProperty_inConfig_specialCharactersValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?", config.getProperty("specialCharactersValue"));
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
    public synchronized String getProperty(String key) {
        if (key == null) {
            return null;
        }
        String value = super.getProperty(key);
        if (value == null) {
            value = default.getProperty(key);
        }
        return value;
    }
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
	* It tests the case when the key is null.
	*/
	@Test
	void testGetProperty_null() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(null));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is empty.
	*/
	@Test
	void testGetProperty_empty() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty(""));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is not in the configuration file.
	*/
	@Test
	void testGetProperty_notInConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("notInConfig"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file.
	*/
	@Test
	void testGetProperty_inConfig() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("value", config.getProperty("key"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is null.
	*/
	@Test
	void testGetProperty_inConfig_nullValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertNull(config.getProperty("nullValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is empty.
	*/
	@Test
	void testGetProperty_inConfig_emptyValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("", config.getProperty("emptyValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a number.
	*/
	@Test
	void testGetProperty_inConfig_numberValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("123", config.getProperty("numberValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a boolean.
	*/
	@Test
	void testGetProperty_inConfig_booleanValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("true", config.getProperty("booleanValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string.
	*/
	@Test
	void testGetProperty_inConfig_stringValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("string", config.getProperty("stringValue"));
	}
	
	/**
	* Tests the {@link ConfigurationManager#getProperty(String)} method.
	* It tests the case when the key is in the configuration file and the value is a string with special characters.
	*/
	@Test
	void testGetProperty_inConfig_specialCharactersValue() {
		ConfigurationManager config = ConfigurationManager.getInstance();
		assertEquals("!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?", config.getProperty("specialCharactersValue"));
	}
}

// ConfigurationManager.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;

/**
 * Manages the configuration for Inspirento.<br>