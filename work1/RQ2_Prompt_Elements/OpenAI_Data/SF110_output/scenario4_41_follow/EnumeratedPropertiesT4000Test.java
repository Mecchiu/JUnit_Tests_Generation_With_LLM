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
	public void testGetEnumeratedProperty_NotSet() {
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
	public void testGetEnumeratedProperty_Set() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a null value.
	*/
	@Test
	public void testGetEnumeratedProperty_SetNull() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		properties.setEnumeratedProperty("test", null);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with an empty list.
	*/
	@Test
	public void testGetEnumeratedProperty_SetEmpty() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing one element.
	*/
	@Test
	public void testGetEnumeratedProperty_SetOneElement() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing two elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetTwoElements() {
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
	* It tests the case when the property is set with a list containing three elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetThreeElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing four elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetFourElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing five elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetFiveElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing six elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetSixElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing seven elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetSevenElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing eight elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetEightElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing nine elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetNineElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		expected.add("test9");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
	* It tests the case when the property is set with a list containing ten elements.
	*/
	@Test
	public void testGetEnumeratedProperty_SetTenElements() {
		EnumeratedProperties properties = new EnumeratedProperties();
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		expected.add("test4");
		expected.add("test5");
		expected.add("test6");
		expected.add("test7");
		expected.add("test8");
		expected.add("test9");
		expected.add("test10");
		properties.setEnumeratedProperty("test", expected);
		List<String> actual = properties.getEnumeratedProperty("test");
		assertEquals(expected, actual);
	}
}