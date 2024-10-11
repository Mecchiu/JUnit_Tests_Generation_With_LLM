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
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is null.
	*/
	@Test
	void testGetEnumeratedProperty_NullKey() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		List<String> actual = properties.getEnumeratedProperty(null);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is empty.
	*/
	@Test
	void testGetEnumeratedProperty_EmptyKey() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		List<String> actual = properties.getEnumeratedProperty("");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is not set.
	*/
	@Test
	void testGetEnumeratedProperty_KeyNotSet() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with a single value.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithSingleValue() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value");
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with multiple values.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithMultipleValues() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		List<String> expected = new ArrayList<String>();
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with a single value and a single delimiter.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithSingleValueAndSingleDelimiter() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value");
		properties.setProperty("key", "value");
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with a single value and multiple delimiters.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithSingleValueAndMultipleDelimiters() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value");
		properties.setProperty("key", "value");
		properties.setProperty("key", "value");
		List<String> expected = new ArrayList<String>();
		expected.add("value");
		expected.add("value");
		expected.add("value");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with multiple values and a single delimiter.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithMultipleValuesAndSingleDelimiter() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		properties.setProperty("key", "value1");
		List<String> expected = new ArrayList<String>();
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected.add("value1");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with multiple values and multiple delimiters.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithMultipleValuesAndMultipleDelimiters() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		List<String> expected = new ArrayList<String>();
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		List<String> actual = properties.getEnumeratedProperty("key");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the key is set with multiple values and multiple delimiters.
	*/
	@Test
	void testGetEnumeratedProperty_KeySetWithMultipleValuesAndMultipleDelimiters_2() {
		EnumeratedProperties properties = new EnumeratedProperties();
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		properties.setProperty("key", "value1");
		properties.setProperty("key", "value2");
		properties.setProperty("key", "value3");
		List<String> expected = new ArrayList<String>();
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected.add("value1");
		expected.add("value2");
		expected.add("value3");
		expected