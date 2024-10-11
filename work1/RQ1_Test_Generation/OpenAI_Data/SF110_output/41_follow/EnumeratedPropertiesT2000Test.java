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
	* It tests the case when the property is not set.
	*/
	@Test
	void testGetEnumeratedProperty_NotSet() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set.
	*/
	@Test
	void testGetEnumeratedProperty_Set() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is empty.
	*/
	@Test
	void testGetEnumeratedProperty_SetEmpty() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = null;
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull2() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add(null);
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull3() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add(null);
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull4() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add(null);
		expected.add("test1");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull5() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add(null);
		expected.add(null);
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull6() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add(null);
		expected.add("test2");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull7() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add(null);
		expected.add(null);
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull8() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add(null);
		expected.add("test1");
		expected.add(null);
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set and the list is null.
	*/
	@Test
	void testGetEnumeratedProperty_SetNull9() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add(null);
		expected.add(null);
		expected.add("test1");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(