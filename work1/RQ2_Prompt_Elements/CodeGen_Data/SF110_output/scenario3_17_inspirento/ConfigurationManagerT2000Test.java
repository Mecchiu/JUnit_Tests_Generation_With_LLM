// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {

  	/**
   * Test methods that return the specified property key from the configuration.
   * Since property keys are just strings in the configuration, the method should always succeed.
   * Also test if a key of null in the configuration is an acceptable value.
   */
    @Test
    void getProperty_key_null() {
    	assertNotNull("null shouldn't be a property key", ConfigurationManager.getProperty(null));
    }
    
    @Test
    void getProperty_key_keyNotNull() {
    	assertNotNull("null value should be a property key", ConfigurationManager.getProperty("abc"));
    }
	
	/**
	 * Test values that are invalid, but must be converted to strings.
	 */
	@Test
    void getProperty_key_keyNotString() {
    	assertNull("valid but invalid value",
				ConfigurationManager.getProperty(ConfigurationManagerTest.class,"notString"));
    }
	
	/**
	 * Test values that are invalid, but must not to be strings, should not throw exceptions
	 */
	@Test
    void getProperty_key_nonString() {
    	assertNull("valid but invalid value",
				ConfigurationManager.getProperty("not a string"));
    }
	
	/**
	 * Test values that must be converted to strings
	 */
	@Test
    void getProperty_key_convertedToString() { 
		assertNull("not converted to a string",
				ConfigurationManager.getProperty("1.1.1"));
	}
		

	@Test
    void getProperty_keyWithPrefix_validKey() { 
    	assertEquals("valid key should return original value",
                    ConfigurationManagerTest.ConfigurationManager.getProperty("test.key.with.prefix"),
                    ConfigurationManager.getProperty("test.key.with.prefix"));
    }
	
	@Test
    void getProperty_keyWithPrefix_nonExistingKey() { 
    	assertNull("non existing key should throw exception",
				ConfigurationManager.getProperty("no Such key"));
    }

    @Test
    void getProperty_nonExistingPrefix() {
    	assertNull("string with non existing key should throw exception",
				ConfigurationManager.getProperty("invalidPrefix"));
    }

	@Test
    void getProperty_nonExistingKey() {
    	assertNull("string with non existing key should throw exception",
				ConfigurationManager.getProperty("InvalidValue"));
    }	

	@Test
    void putProperty_key_null()  {
    	ConfigurationManager.putProperty(null, "NewKey");
    	ConfigurationManager.putProperty("", "NewKey");
    }
    
    @Test
    void putPropertyString_value_null()  {
    	ConfigurationManager.putProperty("", null);	
    	ConfigurationManager.putProperty(null, "NewKey");
    }
    
    @Test
    void putPropertyString_value_empty()  {
    	ConfigurationManager.putProperty("", "");	
    	ConfigurationManager.putProperty(null, "NewKey");
    }

    @Test
    void putPropertyString_value_keyWithPrefixAdded()  {
	 	ConfigurationManager.putProperty("prefix", "");	
	 	ConfigurationManager.putProperty(ConfigurationManagerTest.ConfigurationManager.class, "prefix", "");	
	 	ConfigurationManager.putProperty("prefix", "invalidPrefix", "NewKey");	
	 	ConfigurationManager.putProperty(ConfigurationManagerTest.ConfigurationManager.class, "prefix", "", "NewKey");
    }
    
    @Test
    void putPropertyString_value_keyWithPrefixAndNonEmpty()  {
    	ConfigurationManager.putProperty("prefix", "");	
    	ConfigurationManager.putProperty(ConfigurationManagerTest.ConfigurationManager.class, "prefix", "");	
    	ConfigurationManager.putProperty("prefix", "invalidPrefix", "NewKey");	
    	ConfigurationManager.putProperty("prefix", "", "NewKey");	
    }

    @Test
    void putPropertyStringList_value_null()  {
    	ConfigurationManager.putProperty("list", null);	
    	ConfigurationManager.putProperty(ConfigurationManagerTest.ConfigurationManager.class, "list", null);	
    }
}
