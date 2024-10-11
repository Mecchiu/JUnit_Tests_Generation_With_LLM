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