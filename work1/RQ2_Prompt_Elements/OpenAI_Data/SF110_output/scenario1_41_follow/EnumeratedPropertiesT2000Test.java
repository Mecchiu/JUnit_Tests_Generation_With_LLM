// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns an empty list when the key is not present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyNotPresent() {
		Properties properties = new Properties();
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with one element when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with two elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_twoElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value1");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with three elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_threeElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		properties.setProperty("key.2", "value2");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value1");
		expected.add("value2");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with four elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_fourElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		properties.setProperty("key.2", "value2");
		properties.setProperty("key.3", "value3");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with five elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_fiveElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		properties.setProperty("key.2", "value2");
		properties.setProperty("key.3", "value3");
		properties.setProperty("key.4", "value4");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected.add("value4");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with six elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_sixElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		properties.setProperty("key.2", "value2");
		properties.setProperty("key.3", "value3");
		properties.setProperty("key.4", "value4");
		properties.setProperty("key.5", "value5");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected.add("value4");
		expected.add("value5");
		List<String> actual = enumeratedProperties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* This test case checks if the method returns a list with seven elements when the key is present in the properties.
	*/
	@Test
	void testGetEnumeratedProperty_keyPresent_sevenElements() {
		Properties properties = new Properties();
		properties.setProperty("key", "value");
		properties.setProperty("key.1", "value1");
		properties.setProperty("key.2", "value2");
		properties.setProperty("key.3", "value3");
		properties.setProperty("key.4", "value4");
		properties.setProperty("key.5", "value5");
		properties.setProperty("key.6", "value6");
		EnumeratedProperties enumeratedProperties = new EnumeratedProperties();
		enumeratedProperties.putAll(properties);
		List<String> expected = new ArrayList<String>